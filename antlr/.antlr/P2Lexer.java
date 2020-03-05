// Generated from /home/giles/Desktop/Classes/COP4020/Project2/P2PLC/antlr/P2.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, DIV=13, PROCEDURE=14, FUNCTION=15, REAL=16, 
		BOOL=17, OR=18, AND=19, NOT=20, IF=21, THEN=22, ELSE=23, BEGIN=24, END=25, 
		READ=26, WRITE=27, VAR=28, ARRAY=29, PROGRAM=30, TRUE=31, FALSE=32, SINE=33, 
		COSINE=34, SQUAREROOT=35, NATLOG=36, EXP=37, CASE=38, OF=39, CONST=40, 
		WHILE=41, FOR=42, DO=43, TO=44, PLUS=45, MINUS=46, MULT=47, DIVI=48, MOD=49, 
		BREAK=50, CONTINUE=51, VARNAME=52, NUM=53, COMMENtLine=54, CommentChunk=55, 
		WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "DIV", "PROCEDURE", "FUNCTION", "REAL", "BOOL", "OR", "AND", 
		"NOT", "IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", 
		"PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", "NATLOG", 
		"EXP", "CASE", "OF", "CONST", "WHILE", "FOR", "DO", "TO", "PLUS", "MINUS", 
		"MULT", "DIVI", "MOD", "BREAK", "CONTINUE", "VARNAME", "NUM", "COMMENtLine", 
		"CommentChunk", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "')'", "':'", "';'", "':='", "','", "'='", "'<'", 
		"'>'", "'<='", "'>='", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "DIV", "PROCEDURE", "FUNCTION", "REAL", "BOOL", "OR", "AND", "NOT", 
		"IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", 
		"PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", "NATLOG", 
		"EXP", "CASE", "OF", "CONST", "WHILE", "FOR", "DO", "TO", "PLUS", "MINUS", 
		"MULT", "DIVI", "MOD", "BREAK", "CONTINUE", "VARNAME", "NUM", "COMMENtLine", 
		"CommentChunk", "WS"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A"+
		"\3A\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F"+
		"\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3O\3O\7O\u01b8\nO\fO\16O\u01bb\13O\3P\6P\u01be\n"+
		"P\rP\16P\u01bf\3P\3P\6P\u01c4\nP\rP\16P\u01c5\3Q\3Q\3Q\3Q\7Q\u01cc\nQ"+
		"\fQ\16Q\u01cf\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\7R\u01d8\nR\fR\16R\u01db\13R\3"+
		"R\3R\3R\3R\3S\6S\u01e2\nS\rS\16S\u01e3\3S\3S\4\u01cd\u01d9\2T\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2"+
		"M\2O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37"+
		"q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d"+
		".\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66"+
		"\u009f\67\u00a18\u00a39\u00a5:\3\2\37\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff"+
		"\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2O"+
		"Ooo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9"+
		"\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00af\3\2\2\2\r\u00b1\3\2"+
		"\2\2\17\u00b4\3\2\2\2\21\u00b6\3\2\2\2\23\u00b8\3\2\2\2\25\u00ba\3\2\2"+
		"\2\27\u00bc\3\2\2\2\31\u00bf\3\2\2\2\33\u00c2\3\2\2\2\35\u00c4\3\2\2\2"+
		"\37\u00c6\3\2\2\2!\u00c8\3\2\2\2#\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00ce"+
		"\3\2\2\2)\u00d0\3\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2\2\29\u00e0"+
		"\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K\u00f2\3\2"+
		"\2\2M\u00f4\3\2\2\2O\u00f6\3\2\2\2Q\u00fa\3\2\2\2S\u0104\3\2\2\2U\u010d"+
		"\3\2\2\2W\u0112\3\2\2\2Y\u011a\3\2\2\2[\u011d\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0125\3\2\2\2a\u0128\3\2\2\2c\u012d\3\2\2\2e\u0132\3\2\2\2g\u0138\3\2"+
		"\2\2i\u013c\3\2\2\2k\u0143\3\2\2\2m\u014b\3\2\2\2o\u014f\3\2\2\2q\u0155"+
		"\3\2\2\2s\u015d\3\2\2\2u\u0162\3\2\2\2w\u0168\3\2\2\2y\u016c\3\2\2\2{"+
		"\u0170\3\2\2\2}\u0175\3\2\2\2\177\u0178\3\2\2\2\u0081\u017c\3\2\2\2\u0083"+
		"\u0181\3\2\2\2\u0085\u0184\3\2\2\2\u0087\u018a\3\2\2\2\u0089\u0190\3\2"+
		"\2\2\u008b\u0194\3\2\2\2\u008d\u0197\3\2\2\2\u008f\u019a\3\2\2\2\u0091"+
		"\u019c\3\2\2\2\u0093\u019e\3\2\2\2\u0095\u01a0\3\2\2\2\u0097\u01a2\3\2"+
		"\2\2\u0099\u01a6\3\2\2\2\u009b\u01ac\3\2\2\2\u009d\u01b5\3\2\2\2\u009f"+
		"\u01bd\3\2\2\2\u00a1\u01c7\3\2\2\2\u00a3\u01d5\3\2\2\2\u00a5\u01e1\3\2"+
		"\2\2\u00a7\u00a8\7\60\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\6\3"+
		"\2\2\2\u00ab\u00ac\7+\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7<\2\2\u00ae\n\3"+
		"\2\2\2\u00af\u00b0\7=\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\u00b3"+
		"\7?\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5\20\3\2\2\2\u00b6\u00b7"+
		"\7?\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\24\3\2\2\2\u00ba\u00bb"+
		"\7@\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\u00be\7?\2\2\u00be\30"+
		"\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1\32\3\2\2\2\u00c2"+
		"\u00c3\t\2\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\36\3\2\2\2\u00c6"+
		"\u00c7\t\4\2\2\u00c7 \3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\"\3\2\2\2\u00ca"+
		"\u00cb\t\6\2\2\u00cb$\3\2\2\2\u00cc\u00cd\t\7\2\2\u00cd&\3\2\2\2\u00ce"+
		"\u00cf\t\b\2\2\u00cf(\3\2\2\2\u00d0\u00d1\t\t\2\2\u00d1*\3\2\2\2\u00d2"+
		"\u00d3\t\n\2\2\u00d3,\3\2\2\2\u00d4\u00d5\t\13\2\2\u00d5.\3\2\2\2\u00d6"+
		"\u00d7\t\f\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\t\r\2\2\u00d9\62\3\2\2\2\u00da"+
		"\u00db\t\16\2\2\u00db\64\3\2\2\2\u00dc\u00dd\t\17\2\2\u00dd\66\3\2\2\2"+
		"\u00de\u00df\t\20\2\2\u00df8\3\2\2\2\u00e0\u00e1\t\21\2\2\u00e1:\3\2\2"+
		"\2\u00e2\u00e3\t\22\2\2\u00e3<\3\2\2\2\u00e4\u00e5\t\23\2\2\u00e5>\3\2"+
		"\2\2\u00e6\u00e7\t\24\2\2\u00e7@\3\2\2\2\u00e8\u00e9\t\25\2\2\u00e9B\3"+
		"\2\2\2\u00ea\u00eb\t\26\2\2\u00ebD\3\2\2\2\u00ec\u00ed\t\27\2\2\u00ed"+
		"F\3\2\2\2\u00ee\u00ef\t\30\2\2\u00efH\3\2\2\2\u00f0\u00f1\t\31\2\2\u00f1"+
		"J\3\2\2\2\u00f2\u00f3\t\32\2\2\u00f3L\3\2\2\2\u00f4\u00f5\t\33\2\2\u00f5"+
		"N\3\2\2\2\u00f6\u00f7\5!\21\2\u00f7\u00f8\5+\26\2\u00f8\u00f9\5E#\2\u00f9"+
		"P\3\2\2\2\u00fa\u00fb\59\35\2\u00fb\u00fc\5=\37\2\u00fc\u00fd\5\67\34"+
		"\2\u00fd\u00fe\5\37\20\2\u00fe\u00ff\5#\22\2\u00ff\u0100\5!\21\2\u0100"+
		"\u0101\5C\"\2\u0101\u0102\5=\37\2\u0102\u0103\5#\22\2\u0103R\3\2\2\2\u0104"+
		"\u0105\5%\23\2\u0105\u0106\5C\"\2\u0106\u0107\5\65\33\2\u0107\u0108\5"+
		"\37\20\2\u0108\u0109\5A!\2\u0109\u010a\5+\26\2\u010a\u010b\5\67\34\2\u010b"+
		"\u010c\5\65\33\2\u010cT\3\2\2\2\u010d\u010e\5=\37\2\u010e\u010f\5#\22"+
		"\2\u010f\u0110\5\33\16\2\u0110\u0111\5\61\31\2\u0111V\3\2\2\2\u0112\u0113"+
		"\5\35\17\2\u0113\u0114\5\67\34\2\u0114\u0115\5\67\34\2\u0115\u0116\5\61"+
		"\31\2\u0116\u0117\5#\22\2\u0117\u0118\5\33\16\2\u0118\u0119\5\65\33\2"+
		"\u0119X\3\2\2\2\u011a\u011b\5\67\34\2\u011b\u011c\5=\37\2\u011cZ\3\2\2"+
		"\2\u011d\u011e\5\33\16\2\u011e\u011f\5\65\33\2\u011f\u0120\5!\21\2\u0120"+
		"\\\3\2\2\2\u0121\u0122\5\65\33\2\u0122\u0123\5\67\34\2\u0123\u0124\5A"+
		"!\2\u0124^\3\2\2\2\u0125\u0126\5+\26\2\u0126\u0127\5%\23\2\u0127`\3\2"+
		"\2\2\u0128\u0129\5A!\2\u0129\u012a\5)\25\2\u012a\u012b\5#\22\2\u012b\u012c"+
		"\5\65\33\2\u012cb\3\2\2\2\u012d\u012e\5#\22\2\u012e\u012f\5\61\31\2\u012f"+
		"\u0130\5? \2\u0130\u0131\5#\22\2\u0131d\3\2\2\2\u0132\u0133\5\35\17\2"+
		"\u0133\u0134\5#\22\2\u0134\u0135\5\'\24\2\u0135\u0136\5+\26\2\u0136\u0137"+
		"\5\65\33\2\u0137f\3\2\2\2\u0138\u0139\5#\22\2\u0139\u013a\5\65\33\2\u013a"+
		"\u013b\5!\21\2\u013bh\3\2\2\2\u013c\u013d\5=\37\2\u013d\u013e\5#\22\2"+
		"\u013e\u013f\5\33\16\2\u013f\u0140\5!\21\2\u0140\u0141\5\61\31\2\u0141"+
		"\u0142\5\65\33\2\u0142j\3\2\2\2\u0143\u0144\5G$\2\u0144\u0145\5=\37\2"+
		"\u0145\u0146\5+\26\2\u0146\u0147\5A!\2\u0147\u0148\5#\22\2\u0148\u0149"+
		"\5\61\31\2\u0149\u014a\5\65\33\2\u014al\3\2\2\2\u014b\u014c\5E#\2\u014c"+
		"\u014d\5\33\16\2\u014d\u014e\5=\37\2\u014en\3\2\2\2\u014f\u0150\5\33\16"+
		"\2\u0150\u0151\5=\37\2\u0151\u0152\5=\37\2\u0152\u0153\5\33\16\2\u0153"+
		"\u0154\5K&\2\u0154p\3\2\2\2\u0155\u0156\59\35\2\u0156\u0157\5=\37\2\u0157"+
		"\u0158\5\67\34\2\u0158\u0159\5\'\24\2\u0159\u015a\5=\37\2\u015a\u015b"+
		"\5\33\16\2\u015b\u015c\5\63\32\2\u015cr\3\2\2\2\u015d\u015e\5A!\2\u015e"+
		"\u015f\5=\37\2\u015f\u0160\5C\"\2\u0160\u0161\5#\22\2\u0161t\3\2\2\2\u0162"+
		"\u0163\5%\23\2\u0163\u0164\5\33\16\2\u0164\u0165\5\61\31\2\u0165\u0166"+
		"\5? \2\u0166\u0167\5#\22\2\u0167v\3\2\2\2\u0168\u0169\5? \2\u0169\u016a"+
		"\5+\26\2\u016a\u016b\5\65\33\2\u016bx\3\2\2\2\u016c\u016d\5\37\20\2\u016d"+
		"\u016e\5\67\34\2\u016e\u016f\5? \2\u016fz\3\2\2\2\u0170\u0171\5? \2\u0171"+
		"\u0172\5;\36\2\u0172\u0173\5=\37\2\u0173\u0174\5A!\2\u0174|\3\2\2\2\u0175"+
		"\u0176\5\61\31\2\u0176\u0177\5\65\33\2\u0177~\3\2\2\2\u0178\u0179\5#\22"+
		"\2\u0179\u017a\5I%\2\u017a\u017b\59\35\2\u017b\u0080\3\2\2\2\u017c\u017d"+
		"\5\37\20\2\u017d\u017e\5\33\16\2\u017e\u017f\5? \2\u017f\u0180\5#\22\2"+
		"\u0180\u0082\3\2\2\2\u0181\u0182\5\67\34\2\u0182\u0183\5%\23\2\u0183\u0084"+
		"\3\2\2\2\u0184\u0185\5\37\20\2\u0185\u0186\5\67\34\2\u0186\u0187\5\65"+
		"\33\2\u0187\u0188\5? \2\u0188\u0189\5A!\2\u0189\u0086\3\2\2\2\u018a\u018b"+
		"\5G$\2\u018b\u018c\5)\25\2\u018c\u018d\5+\26\2\u018d\u018e\5\61\31\2\u018e"+
		"\u018f\5#\22\2\u018f\u0088\3\2\2\2\u0190\u0191\5%\23\2\u0191\u0192\5\67"+
		"\34\2\u0192\u0193\5=\37\2\u0193\u008a\3\2\2\2\u0194\u0195\5!\21\2\u0195"+
		"\u0196\5\67\34\2\u0196\u008c\3\2\2\2\u0197\u0198\5A!\2\u0198\u0199\5\67"+
		"\34\2\u0199\u008e\3\2\2\2\u019a\u019b\7-\2\2\u019b\u0090\3\2\2\2\u019c"+
		"\u019d\7/\2\2\u019d\u0092\3\2\2\2\u019e\u019f\7,\2\2\u019f\u0094\3\2\2"+
		"\2\u01a0\u01a1\7\61\2\2\u01a1\u0096\3\2\2\2\u01a2\u01a3\5\63\32\2\u01a3"+
		"\u01a4\5\67\34\2\u01a4\u01a5\5!\21\2\u01a5\u0098\3\2\2\2\u01a6\u01a7\5"+
		"\35\17\2\u01a7\u01a8\5=\37\2\u01a8\u01a9\5#\22\2\u01a9\u01aa\5\33\16\2"+
		"\u01aa\u01ab\5/\30\2\u01ab\u009a\3\2\2\2\u01ac\u01ad\5\37\20\2\u01ad\u01ae"+
		"\5\67\34\2\u01ae\u01af\5\65\33\2\u01af\u01b0\5A!\2\u01b0\u01b1\5+\26\2"+
		"\u01b1\u01b2\5\65\33\2\u01b2\u01b3\5C\"\2\u01b3\u01b4\5#\22\2\u01b4\u009c"+
		"\3\2\2\2\u01b5\u01b9\t\34\2\2\u01b6\u01b8\t\35\2\2\u01b7\u01b6\3\2\2\2"+
		"\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u009e"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\4\62;\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c3\7\60\2\2\u01c2\u01c4\4\62;\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u00a0\3\2"+
		"\2\2\u01c7\u01c8\7*\2\2\u01c8\u01c9\7,\2\2\u01c9\u01cd\3\2\2\2\u01ca\u01cc"+
		"\13\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01ce\3\2\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1"+
		"\7,\2\2\u01d1\u01d2\7+\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\bQ\2\2\u01d4"+
		"\u00a2\3\2\2\2\u01d5\u01d9\7}\2\2\u01d6\u01d8\13\2\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\177\2\2\u01dd\u01de\3"+
		"\2\2\2\u01de\u01df\bR\2\2\u01df\u00a4\3\2\2\2\u01e0\u01e2\t\36\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bS\2\2\u01e6\u00a6\3\2\2\2\t\2\u01b9"+
		"\u01bf\u01c5\u01cd\u01d9\u01e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}