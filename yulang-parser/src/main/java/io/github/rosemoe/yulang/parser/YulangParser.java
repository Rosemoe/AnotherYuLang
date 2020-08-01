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
		LOCAL=1, CONTEXT=2, GLOBAL=3, IF=4, ELSE=5, WHILE=6, FOR=7, FUNCTION=8, 
		END=9, ENDCODE=10, BREAK=11, NUMBER=12, STRING=13, TRUE=14, FALSE=15, 
		NULL=16, IDENTIFIER=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, SEMI=22, 
		COMMA=23, DOT=24, PLUS=25, MINUS=26, MULTI=27, DIV=28, EQEQ=29, EQ=30, 
		LTEQ=31, LT=32, GTEQ=33, GT=34, NOTEQ=35, STARTSWITH=36, CONTAINS=37, 
		ENDSWITH=38, ANDAND=39, OROR=40, WS=41, LINE_COMMENT=42, COMMENT=43;
	public static final int
		RULE_module = 0, RULE_functions = 1, RULE_function = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_statements = 5, RULE_statement = 6, RULE_blockStatement = 7, 
		RULE_assignmentStatement = 8, RULE_variantType = 9, RULE_expression = 10, 
		RULE_primaryExpression = 11, RULE_readableVariant = 12, RULE_moduleFunctionCallStatement = 13, 
		RULE_functionCallStatement = 14, RULE_functionCall = 15, RULE_argumentList = 16, 
		RULE_argument = 17, RULE_ifStatement = 18, RULE_elseIfLabel = 19, RULE_elseLabel = 20, 
		RULE_whileStatement = 21, RULE_forStatement = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "functions", "function", "parameterList", "parameter", "statements", 
			"statement", "blockStatement", "assignmentStatement", "variantType", 
			"expression", "primaryExpression", "readableVariant", "moduleFunctionCallStatement", 
			"functionCallStatement", "functionCall", "argumentList", "argument", 
			"ifStatement", "elseIfLabel", "elseLabel", "whileStatement", "forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'s'", "'ss'", "'sss'", "'f'", "'else'", "'w'", "'for'", "'fn'", 
			"'end'", "'endcode'", "'break'", null, null, "'true'", "'false'", "'null'", 
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'='", "'<='", "'<'", "'>='", "'>'", "'!='", "'?*'", 
			"'?'", "'*?'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOCAL", "CONTEXT", "GLOBAL", "IF", "ELSE", "WHILE", "FOR", "FUNCTION", 
			"END", "ENDCODE", "BREAK", "NUMBER", "STRING", "TRUE", "FALSE", "NULL", 
			"IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"DOT", "PLUS", "MINUS", "MULTI", "DIV", "EQEQ", "EQ", "LTEQ", "LT", "GTEQ", 
			"GT", "NOTEQ", "STARTSWITH", "CONTAINS", "ENDSWITH", "ANDAND", "OROR", 
			"WS", "LINE_COMMENT", "COMMENT"
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
			setState(46);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(48);
				function();
				}
				}
				setState(53);
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
			setState(54);
			match(FUNCTION);
			setState(55);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(56);
			match(LPAREN);
			setState(57);
			parameterList();
			setState(58);
			match(RPAREN);
			setState(59);
			statements();
			setState(60);
			match(END);
			setState(61);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(63);
				parameter();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66);
				match(COMMA);
				setState(67);
				parameter();
				}
				}
				setState(72);
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
			setState(73);
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
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ENDCODE) | (1L << BREAK) | (1L << IDENTIFIER) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
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
		public Token breakStatement;
		public Token endcodeStatement;
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ModuleFunctionCallStatementContext moduleFunctionCallStatement() {
			return getRuleContext(ModuleFunctionCallStatementContext.class,0);
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
		public TerminalNode BREAK() { return getToken(YulangParser.BREAK, 0); }
		public TerminalNode ENDCODE() { return getToken(YulangParser.ENDCODE, 0); }
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				functionCallStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				moduleFunctionCallStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				blockStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				((StatementContext)_localctx).breakStatement = match(BREAK);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				((StatementContext)_localctx).endcodeStatement = match(ENDCODE);
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
			setState(92);
			match(LBRACE);
			setState(93);
			statements();
			setState(94);
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
		public Token name;
		public VariantTypeContext variantType() {
			return getRuleContext(VariantTypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(YulangParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			variantType();
			setState(97);
			((AssignmentStatementContext)_localctx).name = match(IDENTIFIER);
			setState(98);
			match(EQ);
			setState(99);
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

	public static class VariantTypeContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(YulangParser.LOCAL, 0); }
		public TerminalNode CONTEXT() { return getToken(YulangParser.CONTEXT, 0); }
		public TerminalNode GLOBAL() { return getToken(YulangParser.GLOBAL, 0); }
		public VariantTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterVariantType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitVariantType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitVariantType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantTypeContext variantType() throws RecognitionException {
		VariantTypeContext _localctx = new VariantTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variantType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(104);
				match(LPAREN);
				setState(105);
				expression(0);
				setState(106);
				match(RPAREN);
				}
				break;
			case LOCAL:
			case CONTEXT:
			case GLOBAL:
			case NUMBER:
			case STRING:
			case TRUE:
			case FALSE:
			case NULL:
			case IDENTIFIER:
				{
				setState(108);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
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
						setState(113);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
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
						setState(116);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(118);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQEQ) | (1L << LTEQ) | (1L << LT) | (1L << GTEQ) | (1L << GT) | (1L << NOTEQ) | (1L << STARTSWITH) | (1L << CONTAINS) | (1L << ENDSWITH) | (1L << ANDAND) | (1L << OROR))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode STRING() { return getToken(YulangParser.STRING, 0); }
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
		enterRule(_localctx, 22, RULE_primaryExpression);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(NUMBER);
				}
				break;
			case LOCAL:
			case CONTEXT:
			case GLOBAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				readableVariant();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(NULL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(STRING);
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
		public TerminalNode IDENTIFIER() { return getToken(YulangParser.IDENTIFIER, 0); }
		public VariantTypeContext variantType() {
			return getRuleContext(VariantTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(YulangParser.DOT, 0); }
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
		enterRule(_localctx, 24, RULE_readableVariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL))) != 0)) {
				{
				setState(133);
				variantType();
				setState(134);
				match(DOT);
				}
			}

			setState(138);
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
		enterRule(_localctx, 26, RULE_moduleFunctionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((ModuleFunctionCallStatementContext)_localctx).moduleName = match(IDENTIFIER);
			setState(141);
			match(DOT);
			setState(142);
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
		enterRule(_localctx, 28, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(147);
			match(LPAREN);
			setState(148);
			argumentList();
			setState(149);
			match(RPAREN);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(150);
				blockStatement();
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
		enterRule(_localctx, 32, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << CONTEXT) | (1L << GLOBAL) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << IDENTIFIER) | (1L << LPAREN))) != 0)) {
				{
				setState(153);
				argument();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(156);
				match(COMMA);
				setState(157);
				argument();
				}
				}
				setState(162);
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
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		public ExpressionContext condition;
		public TerminalNode IF() { return getToken(YulangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ElseIfLabelContext> elseIfLabel() {
			return getRuleContexts(ElseIfLabelContext.class);
		}
		public ElseIfLabelContext elseIfLabel(int i) {
			return getRuleContext(ElseIfLabelContext.class,i);
		}
		public ElseLabelContext elseLabel() {
			return getRuleContext(ElseLabelContext.class,0);
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
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IF);
			setState(166);
			match(LPAREN);
			setState(167);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(168);
			match(RPAREN);
			setState(169);
			statement();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					elseIfLabel();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(176);
				elseLabel();
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

	public static class ElseIfLabelContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YulangParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(YulangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(YulangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(YulangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterElseIfLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitElseIfLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitElseIfLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfLabelContext elseIfLabel() throws RecognitionException {
		ElseIfLabelContext _localctx = new ElseIfLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseIfLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ELSE);
			setState(180);
			match(IF);
			setState(181);
			match(LPAREN);
			setState(182);
			expression(0);
			setState(183);
			match(RPAREN);
			setState(184);
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

	public static class ElseLabelContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YulangParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).enterElseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YulangParserListener) ((YulangParserListener)listener).exitElseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YulangParserVisitor) return ((YulangParserVisitor<? extends T>)visitor).visitElseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseLabelContext elseLabel() throws RecognitionException {
		ElseLabelContext _localctx = new ElseLabelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ELSE);
			setState(187);
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
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE);
			setState(190);
			match(LPAREN);
			setState(191);
			expression(0);
			setState(192);
			match(RPAREN);
			setState(193);
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
		enterRule(_localctx, 44, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FOR);
			setState(196);
			match(LPAREN);
			setState(197);
			expression(0);
			setState(198);
			match(SEMI);
			setState(199);
			expression(0);
			setState(200);
			match(RPAREN);
			setState(201);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\5\5C\n\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\7\7\7O\n\7\f\7\16"+
		"\7R\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fp\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0086\n\r\3\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u009a\n\21\3\22"+
		"\5\22\u009d\n\22\3\22\3\22\7\22\u00a1\n\22\f\22\16\22\u00a4\13\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ae\n\24\f\24\16\24\u00b1\13"+
		"\24\3\24\5\24\u00b4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\2\3\26\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\6\3\2\3\5\3\2\35\36\3\2\33\34\4\2\37\37!*\2\u00d1\2\60\3\2\2\2\4\65\3"+
		"\2\2\2\68\3\2\2\2\bB\3\2\2\2\nK\3\2\2\2\fP\3\2\2\2\16\\\3\2\2\2\20^\3"+
		"\2\2\2\22b\3\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30\u0085\3\2\2\2\32\u008a\3"+
		"\2\2\2\34\u008e\3\2\2\2\36\u0092\3\2\2\2 \u0094\3\2\2\2\"\u009c\3\2\2"+
		"\2$\u00a5\3\2\2\2&\u00a7\3\2\2\2(\u00b5\3\2\2\2*\u00bc\3\2\2\2,\u00bf"+
		"\3\2\2\2.\u00c5\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65"+
		"\3\2\2\289\7\n\2\29:\7\23\2\2:;\7\24\2\2;<\5\b\5\2<=\7\25\2\2=>\5\f\7"+
		"\2>?\7\13\2\2?@\7\n\2\2@\7\3\2\2\2AC\5\n\6\2BA\3\2\2\2BC\3\2\2\2CH\3\2"+
		"\2\2DE\7\31\2\2EG\5\n\6\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3"+
		"\2\2\2JH\3\2\2\2KL\7\23\2\2L\13\3\2\2\2MO\5\16\b\2NM\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2S]\5\22\n\2T]\5\36\20\2U]\5\34"+
		"\17\2V]\5&\24\2W]\5,\27\2X]\5.\30\2Y]\5\20\t\2Z]\7\r\2\2[]\7\f\2\2\\S"+
		"\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\Y\3\2"+
		"\2\2\\Z\3\2\2\2\\[\3\2\2\2]\17\3\2\2\2^_\7\26\2\2_`\5\f\7\2`a\7\27\2\2"+
		"a\21\3\2\2\2bc\5\24\13\2cd\7\23\2\2de\7 \2\2ef\5\26\f\2f\23\3\2\2\2gh"+
		"\t\2\2\2h\25\3\2\2\2ij\b\f\1\2jk\7\24\2\2kl\5\26\f\2lm\7\25\2\2mp\3\2"+
		"\2\2np\5\30\r\2oi\3\2\2\2on\3\2\2\2p|\3\2\2\2qr\f\5\2\2rs\t\3\2\2s{\5"+
		"\26\f\6tu\f\4\2\2uv\t\4\2\2v{\5\26\f\5wx\f\3\2\2xy\t\5\2\2y{\5\26\f\4"+
		"zq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2"+
		"\2~|\3\2\2\2\177\u0086\7\16\2\2\u0080\u0086\5\32\16\2\u0081\u0086\7\20"+
		"\2\2\u0082\u0086\7\21\2\2\u0083\u0086\7\22\2\2\u0084\u0086\7\17\2\2\u0085"+
		"\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\31\3\2\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0089\7\32\2\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\23\2\2\u008d"+
		"\33\3\2\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7\32\2\2\u0090\u0091\5 \21"+
		"\2\u0091\35\3\2\2\2\u0092\u0093\5 \21\2\u0093\37\3\2\2\2\u0094\u0095\7"+
		"\23\2\2\u0095\u0096\7\24\2\2\u0096\u0097\5\"\22\2\u0097\u0099\7\25\2\2"+
		"\u0098\u009a\5\20\t\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a!\3"+
		"\2\2\2\u009b\u009d\5$\23\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a2\3\2\2\2\u009e\u009f\7\31\2\2\u009f\u00a1\5$\23\2\u00a0\u009e\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"#\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6%\3\2\2\2\u00a7"+
		"\u00a8\7\6\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\7"+
		"\25\2\2\u00ab\u00af\5\16\b\2\u00ac\u00ae\5(\25\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5*\26\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\'\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7\7\6\2\2"+
		"\u00b7\u00b8\7\24\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\5\16\b\2\u00bb)\3\2\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\5\16\b"+
		"\2\u00be+\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2"+
		"\5\26\f\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\5\16\b\2\u00c4-\3\2\2\2\u00c5"+
		"\u00c6\7\t\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7"+
		"\30\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\5\16\b\2"+
		"\u00cc/\3\2\2\2\21\65BHP\\oz|\u0085\u008a\u0099\u009c\u00a2\u00af\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}