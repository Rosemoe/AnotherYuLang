package io.github.rosemoe.yulang.parser;// Generated from D:/IdeaProjects/AnotherYuLang/yulang-parser/src/main/antlr\YulangLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YulangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOCAL", "CONTEXT", "GLOBAL", "IF", "ELSE", "WHILE", "FOR", "FUNCTION", 
			"END", "ENDCODE", "BREAK", "NUMBER", "STRING", "TRUE", "FALSE", "NULL", 
			"IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"DOT", "PLUS", "MINUS", "MULTI", "DIV", "EQEQ", "EQ", "LTEQ", "LT", "GTEQ", 
			"GT", "NOTEQ", "STARTSWITH", "CONTAINS", "ENDSWITH", "ANDAND", "OROR", 
			"WS", "LINE_COMMENT", "COMMENT", "EscapeSequence", "Digits", "LetterOrDigit", 
			"Letter"
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


	public YulangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YulangLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\5\r\u0090\n\r\5\r\u0092\n\r\3\16\3\16\3\16\7\16\u0097\n"+
		"\16\f\16\16\16\u009a\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00b0\n\22"+
		"\f\22\16\22\u00b3\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u00ec\n*\r*\16*\u00ed\3*\3"+
		"*\3+\3+\3+\3+\5+\u00f6\n+\3+\7+\u00f9\n+\f+\16+\u00fc\13+\3+\3+\3,\3,"+
		"\3,\3,\7,\u0104\n,\f,\16,\u0107\13,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\7.\u0113"+
		"\n.\f.\16.\u0116\13.\3.\5.\u0119\n.\3/\3/\5/\u011d\n/\3\60\3\60\3\60\3"+
		"\60\5\60\u0123\n\60\3\u0105\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]"+
		"\2_\2\3\2\r\3\2\63;\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\n\2$$))^^ddhhppttvv\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u012d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3a"+
		"\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rq\3\2\2\2\17s\3"+
		"\2\2\2\21w\3\2\2\2\23z\3\2\2\2\25~\3\2\2\2\27\u0086\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u0093\3\2\2\2\35\u009d\3\2\2\2\37\u00a2\3\2\2\2!\u00a8\3\2\2"+
		"\2#\u00ad\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2"+
		"\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00cf\3\2\2\2A\u00d2\3\2\2\2C\u00d4\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00d9\3\2\2\2I\u00dc\3\2\2\2K\u00df\3\2\2\2M\u00e1\3\2\2\2O\u00e4\3\2"+
		"\2\2Q\u00e7\3\2\2\2S\u00eb\3\2\2\2U\u00f5\3\2\2\2W\u00ff\3\2\2\2Y\u010d"+
		"\3\2\2\2[\u0110\3\2\2\2]\u011c\3\2\2\2_\u0122\3\2\2\2ab\7u\2\2b\4\3\2"+
		"\2\2cd\7u\2\2de\7u\2\2e\6\3\2\2\2fg\7u\2\2gh\7u\2\2hi\7u\2\2i\b\3\2\2"+
		"\2jk\7h\2\2k\n\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p\f\3\2\2\2"+
		"qr\7y\2\2r\16\3\2\2\2st\7h\2\2tu\7q\2\2uv\7t\2\2v\20\3\2\2\2wx\7h\2\2"+
		"xy\7p\2\2y\22\3\2\2\2z{\7g\2\2{|\7p\2\2|}\7f\2\2}\24\3\2\2\2~\177\7g\2"+
		"\2\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\u0082\7e\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7d\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7m\2\2\u008b\30\3\2\2\2\u008c\u0092\7\62\2\2\u008d\u008f\t\2\2"+
		"\2\u008e\u0090\5[.\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0092\32\3\2\2\2\u0093"+
		"\u0098\7$\2\2\u0094\u0097\n\3\2\2\u0095\u0097\5Y-\2\u0096\u0094\3\2\2"+
		"\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7$\2\2\u009c"+
		"\34\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\"\3\2\2\2\u00ad\u00b1\5_\60\2\u00ae\u00b0\5]/\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"$\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5&\3\2\2\2\u00b6"+
		"\u00b7\7+\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9*\3\2\2\2\u00ba\u00bb"+
		"\7\177\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7=\2\2\u00bd.\3\2\2\2\u00be\u00bf"+
		"\7.\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7-\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\66\3\2\2\2\u00c6\u00c7"+
		"\7,\2\2\u00c78\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9:\3\2\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\u00cc\7?\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce>\3"+
		"\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1@\3\2\2\2\u00d2\u00d3"+
		"\7>\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6\7?\2\2\u00d6D\3"+
		"\2\2\2\u00d7\u00d8\7@\2\2\u00d8F\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db"+
		"\7?\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7A\2\2\u00dd\u00de\7,\2\2\u00deJ\3"+
		"\2\2\2\u00df\u00e0\7A\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3"+
		"\7A\2\2\u00e3N\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7(\2\2\u00e6P\3"+
		"\2\2\2\u00e7\u00e8\7~\2\2\u00e8\u00e9\7~\2\2\u00e9R\3\2\2\2\u00ea\u00ec"+
		"\t\4\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b*\2\2\u00f0T\3\2\2\2\u00f1"+
		"\u00f2\7\61\2\2\u00f2\u00f6\7\61\2\2\u00f3\u00f4\t\5\2\2\u00f4\u00f6\7"+
		"\60\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7"+
		"\u00f9\n\5\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\b+\2\2\u00feV\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7\60\2\2"+
		"\u0101\u0105\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\61\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010c\b,\2\2\u010cX\3\2\2\2\u010d\u010e\7^\2\2\u010e\u010f"+
		"\t\6\2\2\u010fZ\3\2\2\2\u0110\u0118\t\7\2\2\u0111\u0113\t\b\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\t\7\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0119\3\2\2\2\u0119\\\3\2\2\2\u011a\u011d\5_\60\2"+
		"\u011b\u011d\t\7\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d^\3"+
		"\2\2\2\u011e\u0123\t\t\2\2\u011f\u0123\n\n\2\2\u0120\u0121\t\13\2\2\u0121"+
		"\u0123\t\f\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123`\3\2\2\2\20\2\u008f\u0091\u0096\u0098\u00b1\u00ed\u00f5\u00fa"+
		"\u0105\u0114\u0118\u011c\u0122\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}