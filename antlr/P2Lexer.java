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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DIV=6, REAL=7, BOOL=8, OR=9, AND=10, 
		NOT=11, IF=12, THEN=13, ELSE=14, BEGIN=15, END=16, READ=17, WRITE=18, 
		VAR=19, ARRAY=20, PROGRAM=21, TRUE=22, FALSE=23, SINE=24, COSINE=25, SQUAREROOT=26, 
		NATLOG=27, EXPO=28, CASE=29, OF=30, CONST=31, VARNAME=32, NUM=33, COMMENtLine=34, 
		CommentChunk=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z", "DIV", "REAL", "BOOL", "OR", "AND", "NOT", 
			"IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", 
			"PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", "NATLOG", 
			"EXPO", "CASE", "OF", "CONST", "VARNAME", "NUM", "COMMENtLine", "CommentChunk", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "','", "':'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "DIV", "REAL", "BOOL", "OR", "AND", 
			"NOT", "IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", "VAR", 
			"ARRAY", "PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", 
			"NATLOG", "EXPO", "CASE", "OF", "CONST", "VARNAME", "NUM", "COMMENtLine", 
			"CommentChunk", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3;\3;\7;\u0141\n;\f;\16;\u0144\13;\3<\6<\u0147\n<\r<\16<\u0148\3<"+
		"\3<\6<\u014d\n<\r<\16<\u014e\3=\3=\3=\3=\7=\u0155\n=\f=\16=\u0158\13="+
		"\3=\3=\3=\3=\3=\3>\3>\7>\u0161\n>\f>\16>\u0164\13>\3>\3>\3>\3>\3?\6?\u016b"+
		"\n?\r?\16?\u016c\3?\3?\4\u0156\u0162\2@\3\3\5\4\7\5\t\6\13\7\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23"+
		"Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\3\2\37"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\17\17\2\u015b\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0081\3\2\2\2\7\u0083"+
		"\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2"+
		"\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2"+
		"\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2"+
		"!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3"+
		"\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63"+
		"\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b5\3\2\2\2;\u00b7"+
		"\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C\u00c1\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00ce\3\2\2\2I\u00d1\3\2\2\2K\u00d5\3\2\2\2M\u00d9\3\2"+
		"\2\2O\u00dc\3\2\2\2Q\u00e1\3\2\2\2S\u00e6\3\2\2\2U\u00ec\3\2\2\2W\u00f0"+
		"\3\2\2\2Y\u00f7\3\2\2\2[\u00ff\3\2\2\2]\u0103\3\2\2\2_\u0109\3\2\2\2a"+
		"\u0111\3\2\2\2c\u0116\3\2\2\2e\u011c\3\2\2\2g\u0120\3\2\2\2i\u0124\3\2"+
		"\2\2k\u0129\3\2\2\2m\u012c\3\2\2\2o\u0130\3\2\2\2q\u0135\3\2\2\2s\u0138"+
		"\3\2\2\2u\u013e\3\2\2\2w\u0146\3\2\2\2y\u0150\3\2\2\2{\u015e\3\2\2\2}"+
		"\u016a\3\2\2\2\177\u0080\7\60\2\2\u0080\4\3\2\2\2\u0081\u0082\7=\2\2\u0082"+
		"\6\3\2\2\2\u0083\u0084\7.\2\2\u0084\b\3\2\2\2\u0085\u0086\7<\2\2\u0086"+
		"\n\3\2\2\2\u0087\u0088\7?\2\2\u0088\f\3\2\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\t\3\2\2\u008c\20\3\2\2\2\u008d\u008e\t\4\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\t\5\2\2\u0090\24\3\2\2\2\u0091\u0092\t\6\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\t\7\2\2\u0094\30\3\2\2\2\u0095\u0096\t\b\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\t\t\2\2\u0098\34\3\2\2\2\u0099\u009a\t\n\2\2\u009a"+
		"\36\3\2\2\2\u009b\u009c\t\13\2\2\u009c \3\2\2\2\u009d\u009e\t\f\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a0\t\r\2\2\u00a0$\3\2\2\2\u00a1\u00a2\t\16\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\t\17\2\2\u00a4(\3\2\2\2\u00a5\u00a6\t\20\2\2\u00a6"+
		"*\3\2\2\2\u00a7\u00a8\t\21\2\2\u00a8,\3\2\2\2\u00a9\u00aa\t\22\2\2\u00aa"+
		".\3\2\2\2\u00ab\u00ac\t\23\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\t\24\2\2\u00ae"+
		"\62\3\2\2\2\u00af\u00b0\t\25\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\t\26\2\2"+
		"\u00b2\66\3\2\2\2\u00b3\u00b4\t\27\2\2\u00b48\3\2\2\2\u00b5\u00b6\t\30"+
		"\2\2\u00b6:\3\2\2\2\u00b7\u00b8\t\31\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t"+
		"\32\2\2\u00ba>\3\2\2\2\u00bb\u00bc\t\33\2\2\u00bc@\3\2\2\2\u00bd\u00be"+
		"\5\23\n\2\u00be\u00bf\5\35\17\2\u00bf\u00c0\5\67\34\2\u00c0B\3\2\2\2\u00c1"+
		"\u00c2\5/\30\2\u00c2\u00c3\5\25\13\2\u00c3\u00c4\5\r\7\2\u00c4\u00c5\5"+
		"#\22\2\u00c5D\3\2\2\2\u00c6\u00c7\5\17\b\2\u00c7\u00c8\5)\25\2\u00c8\u00c9"+
		"\5)\25\2\u00c9\u00ca\5#\22\2\u00ca\u00cb\5\25\13\2\u00cb\u00cc\5\r\7\2"+
		"\u00cc\u00cd\5\'\24\2\u00cdF\3\2\2\2\u00ce\u00cf\5)\25\2\u00cf\u00d0\5"+
		"/\30\2\u00d0H\3\2\2\2\u00d1\u00d2\5\r\7\2\u00d2\u00d3\5\'\24\2\u00d3\u00d4"+
		"\5\23\n\2\u00d4J\3\2\2\2\u00d5\u00d6\5\'\24\2\u00d6\u00d7\5)\25\2\u00d7"+
		"\u00d8\5\63\32\2\u00d8L\3\2\2\2\u00d9\u00da\5\35\17\2\u00da\u00db\5\27"+
		"\f\2\u00dbN\3\2\2\2\u00dc\u00dd\5\63\32\2\u00dd\u00de\5\33\16\2\u00de"+
		"\u00df\5\25\13\2\u00df\u00e0\5\'\24\2\u00e0P\3\2\2\2\u00e1\u00e2\5\25"+
		"\13\2\u00e2\u00e3\5#\22\2\u00e3\u00e4\5\61\31\2\u00e4\u00e5\5\25\13\2"+
		"\u00e5R\3\2\2\2\u00e6\u00e7\5\17\b\2\u00e7\u00e8\5\25\13\2\u00e8\u00e9"+
		"\5\31\r\2\u00e9\u00ea\5\35\17\2\u00ea\u00eb\5\'\24\2\u00ebT\3\2\2\2\u00ec"+
		"\u00ed\5\25\13\2\u00ed\u00ee\5\'\24\2\u00ee\u00ef\5\23\n\2\u00efV\3\2"+
		"\2\2\u00f0\u00f1\5/\30\2\u00f1\u00f2\5\25\13\2\u00f2\u00f3\5\r\7\2\u00f3"+
		"\u00f4\5\23\n\2\u00f4\u00f5\5#\22\2\u00f5\u00f6\5\'\24\2\u00f6X\3\2\2"+
		"\2\u00f7\u00f8\59\35\2\u00f8\u00f9\5/\30\2\u00f9\u00fa\5\35\17\2\u00fa"+
		"\u00fb\5\63\32\2\u00fb\u00fc\5\25\13\2\u00fc\u00fd\5#\22\2\u00fd\u00fe"+
		"\5\'\24\2\u00feZ\3\2\2\2\u00ff\u0100\5\67\34\2\u0100\u0101\5\r\7\2\u0101"+
		"\u0102\5/\30\2\u0102\\\3\2\2\2\u0103\u0104\5\r\7\2\u0104\u0105\5/\30\2"+
		"\u0105\u0106\5/\30\2\u0106\u0107\5\r\7\2\u0107\u0108\5=\37\2\u0108^\3"+
		"\2\2\2\u0109\u010a\5+\26\2\u010a\u010b\5/\30\2\u010b\u010c\5)\25\2\u010c"+
		"\u010d\5\31\r\2\u010d\u010e\5/\30\2\u010e\u010f\5\r\7\2\u010f\u0110\5"+
		"%\23\2\u0110`\3\2\2\2\u0111\u0112\5\63\32\2\u0112\u0113\5/\30\2\u0113"+
		"\u0114\5\65\33\2\u0114\u0115\5\25\13\2\u0115b\3\2\2\2\u0116\u0117\5\27"+
		"\f\2\u0117\u0118\5\r\7\2\u0118\u0119\5#\22\2\u0119\u011a\5\61\31\2\u011a"+
		"\u011b\5\25\13\2\u011bd\3\2\2\2\u011c\u011d\5\61\31\2\u011d\u011e\5\35"+
		"\17\2\u011e\u011f\5\'\24\2\u011ff\3\2\2\2\u0120\u0121\5\21\t\2\u0121\u0122"+
		"\5)\25\2\u0122\u0123\5\61\31\2\u0123h\3\2\2\2\u0124\u0125\5\61\31\2\u0125"+
		"\u0126\5-\27\2\u0126\u0127\5/\30\2\u0127\u0128\5\63\32\2\u0128j\3\2\2"+
		"\2\u0129\u012a\5#\22\2\u012a\u012b\5\'\24\2\u012bl\3\2\2\2\u012c\u012d"+
		"\5\25\13\2\u012d\u012e\5;\36\2\u012e\u012f\5+\26\2\u012fn\3\2\2\2\u0130"+
		"\u0131\5\21\t\2\u0131\u0132\5\r\7\2\u0132\u0133\5\61\31\2\u0133\u0134"+
		"\5\25\13\2\u0134p\3\2\2\2\u0135\u0136\5)\25\2\u0136\u0137\5\27\f\2\u0137"+
		"r\3\2\2\2\u0138\u0139\5\21\t\2\u0139\u013a\5)\25\2\u013a\u013b\5\'\24"+
		"\2\u013b\u013c\5\61\31\2\u013c\u013d\5\63\32\2\u013dt\3\2\2\2\u013e\u0142"+
		"\t\34\2\2\u013f\u0141\t\35\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143v\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0145\u0147\4\62;\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\60"+
		"\2\2\u014b\u014d\4\62;\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fx\3\2\2\2\u0150\u0151\7*\2\2\u0151"+
		"\u0152\7,\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13\2\2\2\u0154\u0153\3\2"+
		"\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7,\2\2\u015a\u015b\7+\2"+
		"\2\u015b\u015c\3\2\2\2\u015c\u015d\b=\2\2\u015dz\3\2\2\2\u015e\u0162\7"+
		"}\2\2\u015f\u0161\13\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0166\7\177\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b>\2\2\u0168"+
		"|\3\2\2\2\u0169\u016b\t\36\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f"+
		"\b?\2\2\u016f~\3\2\2\2\t\2\u0142\u0148\u014e\u0156\u0162\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}