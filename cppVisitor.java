// Generated from cpp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cppParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(cppParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(cppParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(cppParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(cppParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(cppParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(cppParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(cppParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(cppParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(cppParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(cppParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#destructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor(cppParser.DestructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(cppParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(cppParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(cppParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(cppParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(cppParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(cppParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#coutStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoutStatement(cppParser.CoutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(cppParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(cppParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(cppParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(cppParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(cppParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(cppParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(cppParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(cppParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(cppParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(cppParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(cppParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(cppParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(cppParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(cppParser.ArgumentListContext ctx);
}