import java.util.*;

public class cppInterpreter extends cppBaseVisitor<Object> {

    // Memória Global e Funções
    private final Map<String, Object> globals = new HashMap<>();
    private final Map<String, cppParser.FunctionDefinitionContext> functions = new HashMap<>();
    
    // Pilha de execução para escopos locais (Recursão)
    private final Deque<Map<String, Object>> stack = new ArrayDeque<>();

    private Map<String, Object> currentScope() {
        return stack.isEmpty() ? globals : stack.peek();
    }

    // ==========================
    // Programa e Funções
    // ==========================
    //@Override
    
    @Override
    public Object visitFunctionDefinition(cppParser.FunctionDefinitionContext ctx) {
        String name = ctx.qualifiedIdentifier().getText();
        functions.put(name, ctx);
        return null;
    }

    private Object executeFunction(String name, List<Object> args) {
        cppParser.FunctionDefinitionContext ctx = functions.get(name);
    
        // Verificação de segurança para evitar o NullPointerException
        if (ctx == null) {
            System.err.println("Erro: Função '" + name + "' não foi definida.");
            return null; 
        }

       Map<String, Object> localScope = new HashMap<>();
       stack.push(localScope);
        Object result = visit(ctx.compoundStatement());
        stack.pop();

        if (result instanceof ReturnValue rv) return rv.value;
        return null;
    }    

    // ==========================
    // Statements e Fluxo
    // ==========================
    @Override
    public Object visitCompoundStatement(cppParser.CompoundStatementContext ctx) {
        for (var stmt : ctx.statement()) {
            Object res = visit(stmt);
            if (res instanceof ReturnValue) return res;
        }
        return null;
    }

    @Override
    public Object visitDeclaration(cppParser.DeclarationContext ctx) {
        for (var init : ctx.initDeclaratorList().initDeclarator()) {
            String name = init.declarator().Identifier().getText();
            Object value = (init.expression() != null) ? visit(init.expression()) : 0.0;
            currentScope().put(name, value);
        }
        return null;
    }

    @Override
    public Object visitSelectionStatement(cppParser.SelectionStatementContext ctx) {
        if (toBoolean(visit(ctx.expression()))) {
            return visit(ctx.statement(0));
        } else if (ctx.statement().size() > 1) {
            return visit(ctx.statement(1));
        }
        return null;
    }

    @Override
    public Object visitIterationStatement(cppParser.IterationStatementContext ctx) {
        // Suporte simples para While
        if (ctx.getChild(0).getText().equals("while")) {
            while (toBoolean(visit(ctx.expression(0)))) {
                Object res = visit(ctx.statement());
                if (res instanceof ReturnValue) return res;
            }
        }
        return null;
    }

    @Override
    public Object visitCoutStatement(cppParser.CoutStatementContext ctx) {
        for (var expr : ctx.expression()) {
            Object val = visit(expr);
            System.out.print(val != null ? val.toString().replace("\"", "") : "null");
        }
        System.out.println();
        return null;
    }

    @Override
    public Object visitJumpStatement(cppParser.JumpStatementContext ctx) {
        Object val = (ctx.expression() != null) ? visit(ctx.expression()) : null;
        return new ReturnValue(val);
    }

    // ==========================
    // Expressões
    // ==========================
    @Override
    public Object visitAssignmentExpression(cppParser.AssignmentExpressionContext ctx) {
        if (ctx.assignmentOperator() != null) {
            String name = ctx.conditionalExpression().getText();
            Object val = visit(ctx.assignmentExpression());
            
            if (stack.peek() != null && stack.peek().containsKey(name)) {
                stack.peek().put(name, val);
            } else {
                globals.put(name, val);
            }
            return val;
        }
        return visit(ctx.conditionalExpression());
    }

    @Override
    public Object visitAdditiveExpression(cppParser.AdditiveExpressionContext ctx) {
        Object left = visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object right = visit(ctx.multiplicativeExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();
            left = applyArithmetic(left, right, op);
        }
        return left;
    }

    @Override
    public Object visitPostfixExpression(cppParser.PostfixExpressionContext ctx) {
        if (ctx.getChildCount() == 1) return visit(ctx.primaryExpression());

        // Chamada de Função
        if (ctx.getChild(1).getText().equals("(")) {
            String funcName = ctx.getChild(0).getText();
            List<Object> args = new ArrayList<>();
            if (ctx.argumentList() != null) {
                for (var expr : ctx.argumentList().expression()) {
                    args.add(visit(expr));
                }
            }
            return executeFunction(funcName, args);
        }
        
        return visit(ctx.primaryExpression());
    }
private boolean isBuiltIn(String name) {
    return name.equals("print") || name.equals("println");
}

private Object handleBuiltIn(String name, List<Object> args) {
    if (name.equals("print") || name.equals("println")) {
        for (Object arg : args) {
            // Remove aspas se for uma StringLiteral
            String output = arg.toString().replace("\"", "");
            System.out.print(output + " ");
        }
        if (name.equals("println")) System.out.println();
        return null;
    }
    return null;
}
    @Override
    public Object visitPrimaryExpression(cppParser.PrimaryExpressionContext ctx) {
        if (ctx.Constant() != null) return Double.parseDouble(ctx.Constant().getText());
        if (ctx.StringLiteral() != null) return ctx.StringLiteral().getText();
        if (ctx.qualifiedIdentifier() != null) {
            String name = ctx.qualifiedIdentifier().getText();
            if (!stack.isEmpty() && stack.peek().containsKey(name)) return stack.peek().get(name);
            return globals.getOrDefault(name, 0.0);
        }
        if (ctx.expression() != null) return visit(ctx.expression());
        return null;
    }

    // ==========================
    // Helpers
    // ==========================
    private Object applyArithmetic(Object a, Object b, String op) {
        double n1 = ((Number) a).doubleValue();
        double n2 = ((Number) b).doubleValue();
        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0.0;
        };
    }
    
    @Override
public Object visitCompilationUnit(cppParser.CompilationUnitContext ctx) {
    // PASSAGEM 1: Registrar todas as definições de funções primeiro
    for (var child : ctx.children) {
        if (child instanceof cppParser.FunctionDefinitionContext func) {
            String name = func.qualifiedIdentifier().getText();
            functions.put(name, func);
        }
    }

    // PASSAGEM 2: Agora sim, executa a main ou o código global
    if (functions.containsKey("main")) {
        return executeFunction("main", new ArrayList<>());
    }
    
    // Executa declarações globais que não são funções
    for (var child : ctx.children) {
        if (!(child instanceof cppParser.FunctionDefinitionContext)) {
            visit(child);
        }
    }
    return null;
}

            private boolean toBoolean(Object o) {
        if (o instanceof Number n) return n.doubleValue() != 0;
        return o != null;
    }

    static class ReturnValue {
        Object value;
        ReturnValue(Object v) { this.value = v; }
    }
}