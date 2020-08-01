/*
 *    Copyright 2020 Rosemoe
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.rosemoe.yulang.parser;// Generated from D:/IdeaProjects/AnotherYuLang/yulang-parser/src/main/antlr\YulangParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YulangParser}.
 */
public interface YulangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YulangParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(YulangParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(YulangParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(YulangParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(YulangParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(YulangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(YulangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(YulangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(YulangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(YulangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(YulangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(YulangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(YulangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YulangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YulangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(YulangParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(YulangParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(YulangParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(YulangParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YulangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YulangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(YulangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(YulangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#readableVariant}.
	 * @param ctx the parse tree
	 */
	void enterReadableVariant(YulangParser.ReadableVariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#readableVariant}.
	 * @param ctx the parse tree
	 */
	void exitReadableVariant(YulangParser.ReadableVariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#moduleFunctionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterModuleFunctionCallStatement(YulangParser.ModuleFunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#moduleFunctionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitModuleFunctionCallStatement(YulangParser.ModuleFunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(YulangParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(YulangParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(YulangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(YulangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(YulangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(YulangParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(YulangParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(YulangParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(YulangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(YulangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(YulangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(YulangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YulangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(YulangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YulangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(YulangParser.ForStatementContext ctx);
}