// Generated from P2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, DIV=13, REAL=14, BOOL=15, OR=16, AND=17, 
		NOT=18, IF=19, THEN=20, ELSE=21, BEGIN=22, END=23, READ=24, WRITE=25, 
		VAR=26, ARRAY=27, PROGRAM=28, TRUE=29, FALSE=30, SINE=31, COSINE=32, SQUAREROOT=33, 
		NATLOG=34, EXPO=35, CASE=36, OF=37, CONST=38, WHILE=39, FOR=40, DO=41, 
		TO=42, VARNAME=43, NUM=44, COMMENtLine=45, CommentChunk=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "DIV", "REAL", "BOOL", "OR", "AND", "NOT", "IF", "THEN", 
			"ELSE", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", "PROGRAM", "TRUE", 
			"FALSE", "SINE", "COSINE", "SQUAREROOT", "NATLOG", "EXPO", "CASE", "OF", 
			"CONST", "WHILE", "FOR", "DO", "TO", "VARNAME", "NUM", "COMMENtLine", 
			"CommentChunk", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "','", "':'", "'='", "':='", "'('", "')'", "'-'", 
			"'*'", "'/'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DIV", "REAL", "BOOL", "OR", "AND", "NOT", "IF", "THEN", "ELSE", 
			"BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", "PROGRAM", "TRUE", "FALSE", 
			"SINE", "COSINE", "SQUAREROOT", "NATLOG", "EXPO", "CASE", "OF", "CONST", 
			"WHILE", "FOR", "DO", "TO", "VARNAME", "NUM", "COMMENtLine", "CommentChunk", 
			"WS"
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


	public P2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "P2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\7F\u0176\nF\fF\16F\u0179"+
		"\13F\3G\6G\u017c\nG\rG\16G\u017d\3G\3G\6G\u0182\nG\rG\16G\u0183\3H\3H"+
		"\3H\3H\7H\u018a\nH\fH\16H\u018d\13H\3H\3H\3H\3H\3H\3I\3I\7I\u0196\nI\f"+
		"I\16I\u0199\13I\3I\3I\3I\3I\3J\6J\u01a0\nJ\rJ\16J\u01a1\3J\3J\4\u018b"+
		"\u0197\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2"+
		"A\2C\2E\2G\2I\2K\2M\2O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32"+
		"g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+"+
		"\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\3\2\37\4\2CCcc\4\2DDdd"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2\13\f\17\17\2\u0190\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2"+
		"\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2"+
		"\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13\u009d\3\2"+
		"\2\2\r\u009f\3\2\2\2\17\u00a2\3\2\2\2\21\u00a4\3\2\2\2\23\u00a6\3\2\2"+
		"\2\25\u00a8\3\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00ae\3\2\2\2"+
		"\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8"+
		"\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2"+
		"/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67"+
		"\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2"+
		"\2\2A\u00d4\3\2\2\2C\u00d6\3\2\2\2E\u00d8\3\2\2\2G\u00da\3\2\2\2I\u00dc"+
		"\3\2\2\2K\u00de\3\2\2\2M\u00e0\3\2\2\2O\u00e2\3\2\2\2Q\u00e6\3\2\2\2S"+
		"\u00eb\3\2\2\2U\u00f3\3\2\2\2W\u00f6\3\2\2\2Y\u00fa\3\2\2\2[\u00fe\3\2"+
		"\2\2]\u0101\3\2\2\2_\u0106\3\2\2\2a\u010b\3\2\2\2c\u0111\3\2\2\2e\u0115"+
		"\3\2\2\2g\u011c\3\2\2\2i\u0124\3\2\2\2k\u0128\3\2\2\2m\u012e\3\2\2\2o"+
		"\u0136\3\2\2\2q\u013b\3\2\2\2s\u0141\3\2\2\2u\u0145\3\2\2\2w\u0149\3\2"+
		"\2\2y\u014e\3\2\2\2{\u0151\3\2\2\2}\u0155\3\2\2\2\177\u015a\3\2\2\2\u0081"+
		"\u015d\3\2\2\2\u0083\u0163\3\2\2\2\u0085\u0169\3\2\2\2\u0087\u016d\3\2"+
		"\2\2\u0089\u0170\3\2\2\2\u008b\u0173\3\2\2\2\u008d\u017b\3\2\2\2\u008f"+
		"\u0185\3\2\2\2\u0091\u0193\3\2\2\2\u0093\u019f\3\2\2\2\u0095\u0096\7\60"+
		"\2\2\u0096\4\3\2\2\2\u0097\u0098\7=\2\2\u0098\6\3\2\2\2\u0099\u009a\7"+
		".\2\2\u009a\b\3\2\2\2\u009b\u009c\7<\2\2\u009c\n\3\2\2\2\u009d\u009e\7"+
		"?\2\2\u009e\f\3\2\2\2\u009f\u00a0\7<\2\2\u00a0\u00a1\7?\2\2\u00a1\16\3"+
		"\2\2\2\u00a2\u00a3\7*\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5\22"+
		"\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9"+
		"\26\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad"+
		"\32\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\34\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1"+
		"\36\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3 \3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5"+
		"\"\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7$\3\2\2\2\u00b8\u00b9\t\7\2\2\u00b9"+
		"&\3\2\2\2\u00ba\u00bb\t\b\2\2\u00bb(\3\2\2\2\u00bc\u00bd\t\t\2\2\u00bd"+
		"*\3\2\2\2\u00be\u00bf\t\n\2\2\u00bf,\3\2\2\2\u00c0\u00c1\t\13\2\2\u00c1"+
		".\3\2\2\2\u00c2\u00c3\t\f\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\t\r\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c7\t\16\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\t\17\2\2"+
		"\u00c9\66\3\2\2\2\u00ca\u00cb\t\20\2\2\u00cb8\3\2\2\2\u00cc\u00cd\t\21"+
		"\2\2\u00cd:\3\2\2\2\u00ce\u00cf\t\22\2\2\u00cf<\3\2\2\2\u00d0\u00d1\t"+
		"\23\2\2\u00d1>\3\2\2\2\u00d2\u00d3\t\24\2\2\u00d3@\3\2\2\2\u00d4\u00d5"+
		"\t\25\2\2\u00d5B\3\2\2\2\u00d6\u00d7\t\26\2\2\u00d7D\3\2\2\2\u00d8\u00d9"+
		"\t\27\2\2\u00d9F\3\2\2\2\u00da\u00db\t\30\2\2\u00dbH\3\2\2\2\u00dc\u00dd"+
		"\t\31\2\2\u00ddJ\3\2\2\2\u00de\u00df\t\32\2\2\u00dfL\3\2\2\2\u00e0\u00e1"+
		"\t\33\2\2\u00e1N\3\2\2\2\u00e2\u00e3\5!\21\2\u00e3\u00e4\5+\26\2\u00e4"+
		"\u00e5\5E#\2\u00e5P\3\2\2\2\u00e6\u00e7\5=\37\2\u00e7\u00e8\5#\22\2\u00e8"+
		"\u00e9\5\33\16\2\u00e9\u00ea\5\61\31\2\u00eaR\3\2\2\2\u00eb\u00ec\5\35"+
		"\17\2\u00ec\u00ed\5\67\34\2\u00ed\u00ee\5\67\34\2\u00ee\u00ef\5\61\31"+
		"\2\u00ef\u00f0\5#\22\2\u00f0\u00f1\5\33\16\2\u00f1\u00f2\5\65\33\2\u00f2"+
		"T\3\2\2\2\u00f3\u00f4\5\67\34\2\u00f4\u00f5\5=\37\2\u00f5V\3\2\2\2\u00f6"+
		"\u00f7\5\33\16\2\u00f7\u00f8\5\65\33\2\u00f8\u00f9\5!\21\2\u00f9X\3\2"+
		"\2\2\u00fa\u00fb\5\65\33\2\u00fb\u00fc\5\67\34\2\u00fc\u00fd\5A!\2\u00fd"+
		"Z\3\2\2\2\u00fe\u00ff\5+\26\2\u00ff\u0100\5%\23\2\u0100\\\3\2\2\2\u0101"+
		"\u0102\5A!\2\u0102\u0103\5)\25\2\u0103\u0104\5#\22\2\u0104\u0105\5\65"+
		"\33\2\u0105^\3\2\2\2\u0106\u0107\5#\22\2\u0107\u0108\5\61\31\2\u0108\u0109"+
		"\5? \2\u0109\u010a\5#\22\2\u010a`\3\2\2\2\u010b\u010c\5\35\17\2\u010c"+
		"\u010d\5#\22\2\u010d\u010e\5\'\24\2\u010e\u010f\5+\26\2\u010f\u0110\5"+
		"\65\33\2\u0110b\3\2\2\2\u0111\u0112\5#\22\2\u0112\u0113\5\65\33\2\u0113"+
		"\u0114\5!\21\2\u0114d\3\2\2\2\u0115\u0116\5=\37\2\u0116\u0117\5#\22\2"+
		"\u0117\u0118\5\33\16\2\u0118\u0119\5!\21\2\u0119\u011a\5\61\31\2\u011a"+
		"\u011b\5\65\33\2\u011bf\3\2\2\2\u011c\u011d\5G$\2\u011d\u011e\5=\37\2"+
		"\u011e\u011f\5+\26\2\u011f\u0120\5A!\2\u0120\u0121\5#\22\2\u0121\u0122"+
		"\5\61\31\2\u0122\u0123\5\65\33\2\u0123h\3\2\2\2\u0124\u0125\5E#\2\u0125"+
		"\u0126\5\33\16\2\u0126\u0127\5=\37\2\u0127j\3\2\2\2\u0128\u0129\5\33\16"+
		"\2\u0129\u012a\5=\37\2\u012a\u012b\5=\37\2\u012b\u012c\5\33\16\2\u012c"+
		"\u012d\5K&\2\u012dl\3\2\2\2\u012e\u012f\59\35\2\u012f\u0130\5=\37\2\u0130"+
		"\u0131\5\67\34\2\u0131\u0132\5\'\24\2\u0132\u0133\5=\37\2\u0133\u0134"+
		"\5\33\16\2\u0134\u0135\5\63\32\2\u0135n\3\2\2\2\u0136\u0137\5A!\2\u0137"+
		"\u0138\5=\37\2\u0138\u0139\5C\"\2\u0139\u013a\5#\22\2\u013ap\3\2\2\2\u013b"+
		"\u013c\5%\23\2\u013c\u013d\5\33\16\2\u013d\u013e\5\61\31\2\u013e\u013f"+
		"\5? \2\u013f\u0140\5#\22\2\u0140r\3\2\2\2\u0141\u0142\5? \2\u0142\u0143"+
		"\5+\26\2\u0143\u0144\5\65\33\2\u0144t\3\2\2\2\u0145\u0146\5\37\20\2\u0146"+
		"\u0147\5\67\34\2\u0147\u0148\5? \2\u0148v\3\2\2\2\u0149\u014a\5? \2\u014a"+
		"\u014b\5;\36\2\u014b\u014c\5=\37\2\u014c\u014d\5A!\2\u014dx\3\2\2\2\u014e"+
		"\u014f\5\61\31\2\u014f\u0150\5\65\33\2\u0150z\3\2\2\2\u0151\u0152\5#\22"+
		"\2\u0152\u0153\5I%\2\u0153\u0154\59\35\2\u0154|\3\2\2\2\u0155\u0156\5"+
		"\37\20\2\u0156\u0157\5\33\16\2\u0157\u0158\5? \2\u0158\u0159\5#\22\2\u0159"+
		"~\3\2\2\2\u015a\u015b\5\67\34\2\u015b\u015c\5%\23\2\u015c\u0080\3\2\2"+
		"\2\u015d\u015e\5\37\20\2\u015e\u015f\5\67\34\2\u015f\u0160\5\65\33\2\u0160"+
		"\u0161\5? \2\u0161\u0162\5A!\2\u0162\u0082\3\2\2\2\u0163\u0164\5G$\2\u0164"+
		"\u0165\5)\25\2\u0165\u0166\5+\26\2\u0166\u0167\5\61\31\2\u0167\u0168\5"+
		"#\22\2\u0168\u0084\3\2\2\2\u0169\u016a\5%\23\2\u016a\u016b\5\67\34\2\u016b"+
		"\u016c\5=\37\2\u016c\u0086\3\2\2\2\u016d\u016e\5!\21\2\u016e\u016f\5\67"+
		"\34\2\u016f\u0088\3\2\2\2\u0170\u0171\5A!\2\u0171\u0172\5\67\34\2\u0172"+
		"\u008a\3\2\2\2\u0173\u0177\t\34\2\2\u0174\u0176\t\35\2\2\u0175\u0174\3"+
		"\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u008c\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\4\62;\2\u017b\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\7\60\2\2\u0180\u0182\4\62;\2\u0181\u0180\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u008e\3\2\2\2\u0185\u0186\7*\2\2\u0186\u0187\7,\2\2\u0187\u018b\3\2\2"+
		"\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u018f\7,\2\2\u018f\u0190\7+\2\2\u0190\u0191\3\2\2\2\u0191\u0192"+
		"\bH\2\2\u0192\u0090\3\2\2\2\u0193\u0197\7}\2\2\u0194\u0196\13\2\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0198\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\177\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\bI\2\2\u019d\u0092\3\2\2\2\u019e\u01a0\t\36"+
		"\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\bJ\2\2\u01a4\u0094\3\2"+
		"\2\2\t\2\u0177\u017d\u0183\u018b\u0197\u01a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}