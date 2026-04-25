import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);

        cppLexer lexer = new cppLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cppParser parser = new cppParser(tokens);

        ParseTree tree = parser.compilationUnit();

        cppInterpreter interpreter = new cppInterpreter();
        interpreter.visit(tree);
    }
}
