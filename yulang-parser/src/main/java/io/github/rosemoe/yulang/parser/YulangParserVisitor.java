package io.github.rosemoe.yulang.parser;// Generated from D:/IdeaProjects/AnotherYuLang/yulang-parser/src/main/antlr\YulangParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YulangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YulangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YulangParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(YulangParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(YulangParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(YulangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(YulangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(YulangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(YulangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YulangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(YulangParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(YulangParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#variantType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantType(YulangParser.VariantTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YulangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(YulangParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#readableVariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadableVariant(YulangParser.ReadableVariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#moduleFunctionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleFunctionCallStatement(YulangParser.ModuleFunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(YulangParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(YulangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(YulangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(YulangParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(YulangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#elseIfLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfLabel(YulangParser.ElseIfLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#elseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseLabel(YulangParser.ElseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(YulangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YulangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(YulangParser.ForStatementContext ctx);
}