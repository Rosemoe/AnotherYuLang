// Generated from D:/IdeaProjects/AnotherYuLang/yulang-parser/src/main/antlr\YulangLexer.g4 by ANTLR 4.8
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
		IDENTIFIER=1, LOCAL=2, CONTEXT=3, GLOBAL=4, IF=5, ELSE=6, WHILE=7, FOR=8, 
		FUNCTION=9, END=10, ENDCODE=11, BREAK=12, NUMBER=13, STRING_LITERAL=14, 
		TRUE=15, FALSE=16, NULL=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		SEMI=22, COMMA=23, DOT=24, PLUS=25, MINUS=26, MULTI=27, DIV=28, EQ=29, 
		EQEQ=30, LT=31, LTEQ=32, GT=33, GTEQ=34, NOTEQ=35, STARTSWITH=36, ENDSWITH=37, 
		CONTAINS=38, ANDAND=39, OROR=40, WS=41, LINE_COMMENT=42, COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "LOCAL", "CONTEXT", "GLOBAL", "IF", "ELSE", "WHILE", "FOR", 
			"FUNCTION", "END", "ENDCODE", "BREAK", "NUMBER", "STRING_LITERAL", "TRUE", 
			"FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"DOT", "PLUS", "MINUS", "MULTI", "DIV", "EQ", "EQEQ", "LT", "LTEQ", "GT", 
			"GTEQ", "NOTEQ", "STARTSWITH", "ENDSWITH", "CONTAINS", "ANDAND", "OROR", 
			"WS", "LINE_COMMENT", "COMMENT", "EscapeSequence", "HexDigit", "Digits", 
			"LetterOrDigit", "Letter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0148\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\7\2f\n\2\f\2\16\2i"+
		"\13\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16\u009d\n\16\3\16\6\16\u00a0\n\16\r\16\16\16\u00a1\3\16\5\16"+
		"\u00a5\n\16\5\16\u00a7\n\16\3\17\3\17\3\17\7\17\u00ac\n\17\f\17\16\17"+
		"\u00af\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u00fa\n*\r*\16*\u00fb"+
		"\3*\3*\3+\3+\3+\3+\5+\u0104\n+\3+\7+\u0107\n+\f+\16+\u010a\13+\3+\3+\3"+
		",\3,\3,\3,\7,\u0112\n,\f,\16,\u0115\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\5-"+
		"\u0120\n-\3-\5-\u0123\n-\3-\3-\3-\6-\u0128\n-\r-\16-\u0129\3-\3-\3-\3"+
		"-\3-\5-\u0131\n-\3.\3.\3/\3/\7/\u0137\n/\f/\16/\u013a\13/\3/\5/\u013d"+
		"\n/\3\60\3\60\5\60\u0141\n\60\3\61\3\61\3\61\3\61\5\61\u0147\n\61\3\u0113"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2\3\2\20\3\2\63;\6\2\f"+
		"\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2"+
		"\62\65\3\2\629\5\2\62;CHch\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u0157\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\3c\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\to\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2"+
		"\17z\3\2\2\2\21\u0080\3\2\2\2\23\u0084\3\2\2\2\25\u0087\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00b2\3"+
		"\2\2\2!\u00b7\3\2\2\2#\u00bd\3\2\2\2%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00da\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u00e4\3\2\2\2G\u00e7\3\2\2\2I\u00ea\3\2\2\2K\u00ed\3\2\2\2M\u00f0\3\2"+
		"\2\2O\u00f2\3\2\2\2Q\u00f5\3\2\2\2S\u00f9\3\2\2\2U\u0103\3\2\2\2W\u010d"+
		"\3\2\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0140\3\2\2\2a"+
		"\u0146\3\2\2\2cg\5a\61\2df\5_\60\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2h\4\3\2\2\2ig\3\2\2\2jk\7u\2\2k\6\3\2\2\2lm\7u\2\2mn\7u\2\2n\b\3\2"+
		"\2\2op\7u\2\2pq\7u\2\2qr\7u\2\2r\n\3\2\2\2st\7h\2\2t\f\3\2\2\2uv\7g\2"+
		"\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\16\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}"+
		"~\7n\2\2~\177\7g\2\2\177\20\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7q"+
		"\2\2\u0082\u0083\7t\2\2\u0083\22\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7p\2\2\u0086\24\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7f\2\2\u008a\26\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e"+
		"\7f\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7f\2\2\u0091"+
		"\u0092\7g\2\2\u0092\30\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097\u0098\7m\2\2\u0098\32\3\2\2\2\u0099"+
		"\u00a7\7\62\2\2\u009a\u00a4\t\2\2\2\u009b\u009d\5]/\2\u009c\u009b\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a5\3\2\2\2\u009e\u00a0\7a\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5]/\2\u00a4\u009c\3\2\2\2\u00a4\u009f"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0099\3\2\2\2\u00a6\u009a\3\2\2\2\u00a7"+
		"\34\3\2\2\2\u00a8\u00ad\7$\2\2\u00a9\u00ac\n\3\2\2\u00aa\u00ac\5Y-\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7$\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7h\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\"\3\2\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7n"+
		"\2\2\u00c0\u00c1\7n\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3&\3\2\2"+
		"\2\u00c4\u00c5\7+\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7}\2\2\u00c7*\3\2\2\2"+
		"\u00c8\u00c9\7\177\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7=\2\2\u00cb.\3\2\2"+
		"\2\u00cc\u00cd\7.\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\62\3"+
		"\2\2\2\u00d0\u00d1\7-\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\66"+
		"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d58\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9<\3\2\2\2\u00da\u00db\7?\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc>\3\2\2\2\u00dd\u00de\7>\2\2\u00de@\3\2\2\2\u00df\u00e0\7"+
		">\2\2\u00e0\u00e1\7?\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3D\3\2"+
		"\2\2\u00e4\u00e5\7@\2\2\u00e5\u00e6\7?\2\2\u00e6F\3\2\2\2\u00e7\u00e8"+
		"\7#\2\2\u00e8\u00e9\7?\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7A\2\2\u00eb\u00ec"+
		"\7,\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\7A\2\2\u00efL\3"+
		"\2\2\2\u00f0\u00f1\7A\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7~\2\2\u00f6\u00f7\7~\2\2\u00f7R\3"+
		"\2\2\2\u00f8\u00fa\t\4\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b*"+
		"\2\2\u00feT\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0104\7\61\2\2\u0101\u0102"+
		"\t\5\2\2\u0102\u0104\7\60\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0104\u0108\3\2\2\2\u0105\u0107\n\5\2\2\u0106\u0105\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\b+\2\2\u010cV\3\2\2\2\u010d\u010e\7\61\2\2"+
		"\u010e\u010f\7\60\2\2\u010f\u0113\3\2\2\2\u0110\u0112\13\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\60\2\2\u0117\u0118\7"+
		"\61\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b,\2\2\u011aX\3\2\2\2\u011b\u011c"+
		"\7^\2\2\u011c\u0131\t\6\2\2\u011d\u0122\7^\2\2\u011e\u0120\t\7\2\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\t\b"+
		"\2\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0131\t\b\2\2\u0125\u0127\7^\2\2\u0126\u0128\7w\2\2\u0127\u0126\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\5[.\2\u012c\u012d\5[.\2\u012d\u012e\5[.\2\u012e\u012f"+
		"\5[.\2\u012f\u0131\3\2\2\2\u0130\u011b\3\2\2\2\u0130\u011d\3\2\2\2\u0130"+
		"\u0125\3\2\2\2\u0131Z\3\2\2\2\u0132\u0133\t\t\2\2\u0133\\\3\2\2\2\u0134"+
		"\u013c\t\n\2\2\u0135\u0137\t\13\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013d\t\n\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d^\3\2\2\2\u013e\u0141\5a\61\2\u013f\u0141\t\n\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141`\3\2\2\2\u0142\u0147\t\f\2\2\u0143"+
		"\u0147\n\r\2\2\u0144\u0145\t\16\2\2\u0145\u0147\t\17\2\2\u0146\u0142\3"+
		"\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0147b\3\2\2\2\26\2g\u009c"+
		"\u00a1\u00a4\u00a6\u00ab\u00ad\u00fb\u0103\u0108\u0113\u011f\u0122\u0129"+
		"\u0130\u0138\u013c\u0140\u0146\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}