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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YulangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, LOCAL=2, CONTEXT=3, GLOBAL=4, IF=5, ELSE=6, WHILE=7, FOR=8, 
		FUNCTION=9, END=10, ENDCODE=11, BREAK=12, NUMBER=13, STRING_LITERAL=14, 
		TRUE=15, FALSE=16, NULL=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		SEMI=22, COMMA=23, DOT=24, PLUS=25, MINUS=26, MULTI=27, DIV=28, EQ=29, 
		EQEQ=30, LT=31, LTEQ=32, GT=33, GTEQ=34, NOTEQ=35, STARTSWITH=36, ENDSWITH=37, 
		CONTAINS=38, ANDAND=39, OROR=40, WS=41, LINE_COMMENT=42, COMMENT=43;
	public static final int
		RULE_module = 0, RULE_functions = 1, RULE_function = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_statements = 5, RULE_statement = 6, RULE_blockStatement = 7, 
		RULE_assignmentStatement = 8, RULE_expression = 9, RULE_primaryExpression = 10, 
		RULE_readableVariant = 11, RULE_moduleFunctionCallStatement = 12, RULE_functionCallStatement = 13, 
		RULE_functionCall = 14, RULE_argumentList = 15, RULE_argument = 16, RULE_ifStatement = 17, 
		RULE_whileStatement = 18, RULE_forStatement = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "functions", "function", "parameterList", "parameter", "statements", 
			"statement", "blockStatement", "assignmentStatement", "expression", "primaryExpression", 
			"readableVariant", "moduleFunctionCallStatement", "functionCallStatement", 
			"functionCall", "argumentList", "argument", "ifStatement", "whileStatement", 
			"forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'s'", "'ss'", "'sss'", "'f'", "'else'", "'while'", "'for'", 
			"'fn'", "'end'", "'endcode'", "'break'", null, null, "'true'", "'false'", 
			"'null'", "'('", "')'", "'{'", "'}'", "';'", "','", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'?*'", 
			"'*?'", "'?'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "LOCAL", "CONTEXT", "GLOBAL", "IF", "ELSE", "WHILE", 
			"FOR", "FUNCTION", "END", "ENDCODE", "BREAK", "NUMBER", "STRING_LITERAL", 
			"TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"COMMA", "DOT", "PLUS", "MINUS", "MULTI", "DIV", "EQ", "EQEQ", "LT", 
			"LTEQ", "GT", "GTEQ", "NOTEQ", "STARTSWITH", "ENDSWITH", "CONTAINS", 
			"ANDAND", "OROR", "WS", "LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YulangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YulangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			functions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(42);
				function();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> FUNCTION() { return getTokens(YulangParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(YulangParser.FUNCTION, i);
		}
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(YulangParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FUNCTION);
			setState(49);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(50);
			match(LPAREN);
			setState(51);
			parameterList();
			setState(52);
			match(RPAREN);
			setState(53);
			statements();
			setState(54);
			match(END);
			setState(55);
			match(FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YulangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YulangParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(57);
				parameter();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				parameter();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((ParameterContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ModuleFunctionCallStatementContext moduleFunctionCallStatement() {
			return getRuleContext(ModuleFunctionCallStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				functionCallStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				moduleFunctionCallStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				blockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(YulangParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(YulangParser.RBRACE, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LBRACE);
			setState(85);
			statements();
			setState(86);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TerminalNode EQ() { return getToken(YulangParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public TerminalNode LOCAL() { return getToken(YulangParser.LOCAL, 0); }
		public TerminalNode CONTEXT() { return getToken(YulangParser.CONTEXT, 0); }
		public TerminalNode GLOBAL() { return getToken(YulangParser.GLOBAL, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((AssignmentStatementContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL))) != 0)) ) {
				((AssignmentStatementContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			((AssignmentStatementContext)_localctx).name = match(IDENTIFIER);
			setState(90);
			match(EQ);
			setState(91);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token operator;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(YulangParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(YulangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(YulangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YulangParser.MINUS, 0); }
		public TerminalNode STARTSWITH() { return getToken(YulangParser.STARTSWITH, 0); }
		public TerminalNode ENDSWITH() { return getToken(YulangParser.ENDSWITH, 0); }
		public TerminalNode CONTAINS() { return getToken(YulangParser.CONTAINS, 0); }
		public TerminalNode EQEQ() { return getToken(YulangParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(YulangParser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(YulangParser.LT, 0); }
		public TerminalNode GT() { return getToken(YulangParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(YulangParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(YulangParser.GTEQ, 0); }
		public TerminalNode OROR() { return getToken(YulangParser.OROR, 0); }
		public TerminalNode ANDAND() { return getToken(YulangParser.ANDAND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIV) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(103);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ) | (1L << NOTEQ) | (1L << STARTSWITH) | (1L << ENDSWITH) | (1L << CONTAINS) | (1L << ANDAND) | (1L << OROR))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(YulangParser.NUMBER, 0); }
		public ReadableVariantContext readableVariant() {
			return getRuleContext(ReadableVariantContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(YulangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(YulangParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(YulangParser.NULL, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryExpression);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
			case LOCAL:
			case CONTEXT:
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				readableVariant();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadableVariantContext extends ParserRuleContext {
		public Token type;
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(YulangParser.DOT, 0); }
		public TerminalNode LOCAL() { return getToken(YulangParser.LOCAL, 0); }
		public TerminalNode CONTEXT() { return getToken(YulangParser.CONTEXT, 0); }
		public TerminalNode GLOBAL() { return getToken(YulangParser.GLOBAL, 0); }
		public ReadableVariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readableVariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterReadableVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitReadableVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitReadableVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadableVariantContext readableVariant() throws RecognitionException {
		ReadableVariantContext _localctx = new ReadableVariantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readableVariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL))) != 0)) {
				{
				setState(117);
				((ReadableVariantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL))) != 0)) ) {
					((ReadableVariantContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(DOT);
				}
			}

			setState(121);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleFunctionCallStatementContext extends ParserRuleContext {
		public Token moduleName;
		public TerminalNode DOT() { return getToken(YulangParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public ModuleFunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleFunctionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterModuleFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitModuleFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitModuleFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleFunctionCallStatementContext moduleFunctionCallStatement() throws RecognitionException {
		ModuleFunctionCallStatementContext _localctx = new ModuleFunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moduleFunctionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ModuleFunctionCallStatementContext)_localctx).moduleName = match(IDENTIFIER);
			setState(124);
			match(DOT);
			setState(125);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(130);
			match(LPAREN);
			setState(131);
			argumentList();
			setState(132);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YulangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YulangParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) {
				{
				setState(134);
				argument();
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				argument();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(YulangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(YulangParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(YulangParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(YulangParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(YulangParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(YulangParser.RPAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(YulangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(YulangParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(LPAREN);
			setState(148);
			expression(0);
			setState(149);
			match(RPAREN);
			setState(150);
			statement();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(ELSE);
					setState(152);
					match(IF);
					setState(153);
					match(LPAREN);
					setState(154);
					expression(0);
					setState(155);
					match(RPAREN);
					setState(156);
					statement();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163);
				match(ELSE);
				setState(164);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(YulangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(WHILE);
			setState(168);
			match(LPAREN);
			setState(169);
			expression(0);
			setState(170);
			match(RPAREN);
			setState(171);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(YulangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(YulangParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(FOR);
			setState(174);
			match(LPAREN);
			setState(175);
			expression(0);
			setState(176);
			match(SEMI);
			setState(177);
			expression(0);
			setState(178);
			match(RPAREN);
			setState(179);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\7\3.\n\3\f\3\16\3\61\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\5\5=\n\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\6\3\6\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bU\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\fv\n\f\3\r\3\r\5\rz\n\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u008a\n\21\3\21\3\21"+
		"\7\21\u008e\n\21\f\21\16\21\u0091\13\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00a1\n\23\f\23\16\23\u00a4"+
		"\13\23\3\23\3\23\5\23\u00a8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\3\24\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\6\3\2\4\6\3\2\35\36\3\2\33\34\3\2 *\2\u00b9"+
		"\2*\3\2\2\2\4/\3\2\2\2\6\62\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2\fJ\3\2\2\2\16"+
		"T\3\2\2\2\20V\3\2\2\2\22Z\3\2\2\2\24_\3\2\2\2\26u\3\2\2\2\30y\3\2\2\2"+
		"\32}\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2 \u0089\3\2\2\2\"\u0092"+
		"\3\2\2\2$\u0094\3\2\2\2&\u00a9\3\2\2\2(\u00af\3\2\2\2*+\5\4\3\2+\3\3\2"+
		"\2\2,.\5\6\4\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2"+
		"\2\61/\3\2\2\2\62\63\7\13\2\2\63\64\7\3\2\2\64\65\7\24\2\2\65\66\5\b\5"+
		"\2\66\67\7\25\2\2\678\5\f\7\289\7\f\2\29:\7\13\2\2:\7\3\2\2\2;=\5\n\6"+
		"\2<;\3\2\2\2<=\3\2\2\2=B\3\2\2\2>?\7\31\2\2?A\5\n\6\2@>\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EF\7\3\2\2F\13\3\2\2\2GI"+
		"\5\16\b\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LJ\3\2\2\2"+
		"MU\5\34\17\2NU\5\32\16\2OU\5\22\n\2PU\5$\23\2QU\5&\24\2RU\5(\25\2SU\5"+
		"\20\t\2TM\3\2\2\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS"+
		"\3\2\2\2U\17\3\2\2\2VW\7\26\2\2WX\5\f\7\2XY\7\27\2\2Y\21\3\2\2\2Z[\t\2"+
		"\2\2[\\\7\3\2\2\\]\7\37\2\2]^\5\24\13\2^\23\3\2\2\2_`\b\13\1\2`a\5\26"+
		"\f\2am\3\2\2\2bc\f\5\2\2cd\t\3\2\2dl\5\24\13\6ef\f\4\2\2fg\t\4\2\2gl\5"+
		"\24\13\5hi\f\3\2\2ij\t\5\2\2jl\5\24\13\4kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2"+
		"lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\25\3\2\2\2om\3\2\2\2pv\7\17\2\2qv\5\30"+
		"\r\2rv\7\21\2\2sv\7\22\2\2tv\7\23\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us"+
		"\3\2\2\2ut\3\2\2\2v\27\3\2\2\2wx\t\2\2\2xz\7\32\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{|\7\3\2\2|\31\3\2\2\2}~\7\3\2\2~\177\7\32\2\2\177\u0080\5"+
		"\36\20\2\u0080\33\3\2\2\2\u0081\u0082\5\36\20\2\u0082\35\3\2\2\2\u0083"+
		"\u0084\7\3\2\2\u0084\u0085\7\24\2\2\u0085\u0086\5 \21\2\u0086\u0087\7"+
		"\25\2\2\u0087\37\3\2\2\2\u0088\u008a\5\"\22\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u008c\7\31\2\2\u008c\u008e\5"+
		"\"\22\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090!\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5\24\13"+
		"\2\u0093#\3\2\2\2\u0094\u0095\7\7\2\2\u0095\u0096\7\24\2\2\u0096\u0097"+
		"\5\24\13\2\u0097\u0098\7\25\2\2\u0098\u00a2\5\16\b\2\u0099\u009a\7\b\2"+
		"\2\u009a\u009b\7\7\2\2\u009b\u009c\7\24\2\2\u009c\u009d\5\24\13\2\u009d"+
		"\u009e\7\25\2\2\u009e\u009f\5\16\b\2\u009f\u00a1\3\2\2\2\u00a0\u0099\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a7\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a8\5\16"+
		"\b\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8%\3\2\2\2\u00a9\u00aa"+
		"\7\t\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7\25\2"+
		"\2\u00ad\u00ae\5\16\b\2\u00ae\'\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1"+
		"\7\24\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\5\24"+
		"\13\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\5\16\b\2\u00b6)\3\2\2\2\17/<BJ"+
		"Tkmuy\u0089\u008f\u00a2\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}