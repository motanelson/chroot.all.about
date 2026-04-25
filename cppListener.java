// Generated from cpp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cppParser}.
 */
public interface cppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cppParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(cppParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(cppParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(cppParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(cppParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(cppParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(cppParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(cppParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(cppParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(cppParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(cppParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(cppParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(cppParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(cppParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(cppParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(cppParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(cppParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(cppParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(cppParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(cppParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(cppParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#destructor}.
	 * @param ctx the parse tree
	 */
	void enterDestructor(cppParser.DestructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#destructor}.
	 * @param ctx the parse tree
	 */
	void exitDestructor(cppParser.DestructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(cppParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(cppParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(cppParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(cppParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(cppParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(cppParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(cppParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(cppParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(cppParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(cppParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#coutStatement}.
	 * @param ctx the parse tree
	 */
	void enterCoutStatement(cppParser.CoutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#coutStatement}.
	 * @param ctx the parse tree
	 */
	void exitCoutStatement(cppParser.CoutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(cppParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(cppParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(cppParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(cppParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(cppParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(cppParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(cppParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(cppParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(cppParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(cppParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(cppParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(cppParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(cppParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(cppParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(cppParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(cppParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(cppParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(cppParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(cppParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(cppParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(cppParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(cppParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(cppParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(cppParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(cppParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(cppParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(cppParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(cppParser.ArgumentListContext ctx);
}