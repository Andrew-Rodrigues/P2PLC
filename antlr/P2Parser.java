// Generated from P2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P2Parser extends Parser {
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
	public static final int
		RULE_startProgram = 0, RULE_programBlocks = 1, RULE_statements = 2, RULE_start = 3, 
		RULE_varDef = 4, RULE_variableInst = 5, RULE_inst = 6, RULE_variableDec = 7, 
		RULE_dec = 8, RULE_realOrBool = 9, RULE_instVar = 10, RULE_forInst = 11, 
		RULE_instBool = 12, RULE_ifBlock = 13, RULE_elseBlock = 14, RULE_whileBlock = 15, 
		RULE_forBlock = 16, RULE_read = 17, RULE_write = 18, RULE_expr = 19, RULE_bexpr = 20, 
		RULE_atom = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"startProgram", "programBlocks", "statements", "start", "varDef", "variableInst", 
			"inst", "variableDec", "dec", "realOrBool", "instVar", "forInst", "instBool", 
			"ifBlock", "elseBlock", "whileBlock", "forBlock", "read", "write", "expr", 
			"bexpr", "atom"
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

	@Override
	public String getGrammarFileName() { return "P2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public P2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartProgramContext extends ParserRuleContext {
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public TerminalNode EOF() { return getToken(P2Parser.EOF, 0); }
		public StartProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterStartProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitStartProgram(this);
		}
	}

	public final StartProgramContext startProgram() throws RecognitionException {
		StartProgramContext _localctx = new StartProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			programBlocks();
			setState(45);
			match(END);
			setState(46);
			match(T__0);
			setState(47);
			match(EOF);
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

	public static class ProgramBlocksContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterProgramBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitProgramBlocks(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			start();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(50);
				varDef();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(BEGIN);
			setState(57);
			statements();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(58);
				statements();
				}
				}
				setState(63);
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

	public static class StatementsContext extends ParserRuleContext {
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public InstBoolContext instBool() {
			return getRuleContext(InstBoolContext.class,0);
		}
		public ForInstContext forInst() {
			return getRuleContext(ForInstContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				instVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				instBool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				forInst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				elseBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				whileBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				forBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				read();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				write();
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(P2Parser.PROGRAM, 0); }
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PROGRAM);
			setState(76);
			match(VARNAME);
			setState(77);
			match(T__1);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(P2Parser.VAR, 0); }
		public VariableInstContext variableInst() {
			return getRuleContext(VariableInstContext.class,0);
		}
		public VariableDecContext variableDec() {
			return getRuleContext(VariableDecContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			match(VAR);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(80);
				variableInst();
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(83);
				variableDec();
				}
			}

			}
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

	public static class VariableInstContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public VariableInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterVariableInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitVariableInst(this);
		}
	}

	public final VariableInstContext variableInst() throws RecognitionException {
		VariableInstContext _localctx = new VariableInstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableInst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public RealOrBoolContext realOrBool() {
			return getRuleContext(RealOrBoolContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			match(VARNAME);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(92);
				match(T__2);
				setState(93);
				match(VARNAME);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
			setState(100);
			realOrBool();
			setState(101);
			match(T__4);
			setState(102);
			expr(0);
			setState(103);
			match(T__1);
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

	public static class VariableDecContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public VariableDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitVariableDec(this);
		}
	}

	public final VariableDecContext variableDec() throws RecognitionException {
		VariableDecContext _localctx = new VariableDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				dec();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARNAME );
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

	public static class DecContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public RealOrBoolContext realOrBool() {
			return getRuleContext(RealOrBoolContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			match(VARNAME);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(111);
				match(T__2);
				setState(112);
				match(VARNAME);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__3);
			setState(119);
			realOrBool();
			setState(120);
			match(T__1);
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

	public static class RealOrBoolContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(P2Parser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(P2Parser.BOOL, 0); }
		public RealOrBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realOrBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterRealOrBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitRealOrBool(this);
		}
	}

	public final RealOrBoolContext realOrBool() throws RecognitionException {
		RealOrBoolContext _localctx = new RealOrBoolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_realOrBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==BOOL) ) {
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

	public static class InstVarContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterInstVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitInstVar(this);
		}
	}

	public final InstVarContext instVar() throws RecognitionException {
		InstVarContext _localctx = new InstVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(VARNAME);
			setState(125);
			match(T__5);
			setState(126);
			expr(0);
			setState(127);
			match(T__1);
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

	public static class ForInstContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(P2Parser.TO, 0); }
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public ForInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterForInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitForInst(this);
		}
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(VARNAME);
			setState(130);
			match(T__5);
			setState(131);
			expr(0);
			setState(132);
			match(TO);
			setState(133);
			expr(0);
			setState(134);
			match(DO);
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

	public static class InstBoolContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterInstBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitInstBool(this);
		}
	}

	public final InstBoolContext instBool() throws RecognitionException {
		InstBoolContext _localctx = new InstBoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(VARNAME);
			setState(137);
			match(T__5);
			setState(138);
			expr(0);
			setState(139);
			match(T__1);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(P2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(P2Parser.THEN, 0); }
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IF);
			setState(142);
			expr(0);
			setState(143);
			match(THEN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(144);
				match(BEGIN);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					statements();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(153);
				match(END);
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(P2Parser.ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ELSE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(157);
				match(BEGIN);
				}
			}

			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					statements();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(166);
				match(END);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(P2Parser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitWhileBlock(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(WHILE);
			setState(170);
			expr(0);
			setState(171);
			match(DO);
			setState(172);
			match(BEGIN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(173);
				statements();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(END);
			setState(180);
			match(T__1);
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(P2Parser.FOR, 0); }
		public ForInstContext forInst() {
			return getRuleContext(ForInstContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitForBlock(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(FOR);
			setState(183);
			forInst();
			setState(184);
			match(BEGIN);
			setState(185);
			statements();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(186);
				statements();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(END);
			setState(193);
			match(T__1);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(P2Parser.READ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(READ);
			setState(196);
			match(T__6);
			setState(197);
			expr(0);
			setState(198);
			match(T__7);
			setState(199);
			match(T__1);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(P2Parser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WRITE);
			setState(202);
			match(T__6);
			setState(203);
			expr(0);
			setState(204);
			match(T__7);
			setState(205);
			match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXPO() { return getToken(P2Parser.EXPO, 0); }
		public TerminalNode SQUAREROOT() { return getToken(P2Parser.SQUAREROOT, 0); }
		public TerminalNode NATLOG() { return getToken(P2Parser.NATLOG, 0); }
		public TerminalNode SINE() { return getToken(P2Parser.SINE, 0); }
		public TerminalNode COSINE() { return getToken(P2Parser.COSINE, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(208);
				match(T__8);
				setState(209);
				expr(10);
				}
				break;
			case EXPO:
				{
				setState(210);
				match(EXPO);
				setState(211);
				expr(9);
				}
				break;
			case SQUAREROOT:
				{
				setState(212);
				match(SQUAREROOT);
				setState(213);
				expr(8);
				}
				break;
			case NATLOG:
				{
				setState(214);
				match(NATLOG);
				setState(215);
				expr(7);
				}
				break;
			case SINE:
				{
				setState(216);
				match(SINE);
				setState(217);
				expr(6);
				}
				break;
			case COSINE:
				{
				setState(218);
				match(COSINE);
				setState(219);
				expr(5);
				}
				break;
			case NOT:
				{
				setState(220);
				bexpr(0);
				}
				break;
			case T__6:
			case TRUE:
			case FALSE:
			case VARNAME:
			case NUM:
				{
				setState(221);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BexprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(P2Parser.NOT, 0); }
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public TerminalNode AND() { return getToken(P2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(P2Parser.OR, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(236);
			match(NOT);
			setState(237);
			bexpr(3);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240);
						match(AND);
						setState(241);
						bexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(242);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(243);
						match(OR);
						setState(244);
						bexpr(2);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(P2Parser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P2Parser.FALSE, 0); }
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__6);
				setState(251);
				expr(0);
				setState(252);
				match(T__7);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(NUM);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(VARNAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0106\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\5\6T\n\6\3\6\5\6W\n\6\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\7\ba\n\b\f\b"+
		"\16\bd\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tm\n\t\r\t\16\tn\3\n\3\n\3\n"+
		"\7\nt\n\n\f\n\16\nw\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u0094\n\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a\13\17\3\17\5"+
		"\17\u009d\n\17\3\20\3\20\5\20\u00a1\n\20\3\20\7\20\u00a4\n\20\f\20\16"+
		"\20\u00a7\13\20\3\20\5\20\u00aa\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00b1"+
		"\n\21\f\21\16\21\u00b4\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u00be\n\22\f\22\16\22\u00c1\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e1\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f8\n\26\f\26\16"+
		"\26\u00fb\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0104\n\27\3\27"+
		"\2\4(*\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\20\21"+
		"\3\2\f\r\4\2\13\13\16\16\3\2\37 \2\u0115\2.\3\2\2\2\4\63\3\2\2\2\6K\3"+
		"\2\2\2\bM\3\2\2\2\nQ\3\2\2\2\fY\3\2\2\2\16]\3\2\2\2\20l\3\2\2\2\22p\3"+
		"\2\2\2\24|\3\2\2\2\26~\3\2\2\2\30\u0083\3\2\2\2\32\u008a\3\2\2\2\34\u008f"+
		"\3\2\2\2\36\u009e\3\2\2\2 \u00ab\3\2\2\2\"\u00b8\3\2\2\2$\u00c5\3\2\2"+
		"\2&\u00cb\3\2\2\2(\u00e0\3\2\2\2*\u00ed\3\2\2\2,\u0103\3\2\2\2./\5\4\3"+
		"\2/\60\7\31\2\2\60\61\7\3\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63\67\5\b\5\2"+
		"\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3"+
		"\2\2\29\67\3\2\2\2:;\7\30\2\2;?\5\6\4\2<>\5\6\4\2=<\3\2\2\2>A\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BL\5\26\f\2CL\5\32\16\2DL\5\30"+
		"\r\2EL\5\34\17\2FL\5\36\20\2GL\5 \21\2HL\5\"\22\2IL\5$\23\2JL\5&\24\2"+
		"KB\3\2\2\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2"+
		"KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2MN\7\36\2\2NO\7-\2\2OP\7\4\2\2P\t\3\2\2"+
		"\2QS\7\34\2\2RT\5\f\7\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\20\t\2VU\3\2"+
		"\2\2VW\3\2\2\2W\13\3\2\2\2XZ\5\16\b\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\r\3\2\2\2]b\7-\2\2^_\7\5\2\2_a\7-\2\2`^\3\2\2\2ad\3\2\2\2b"+
		"`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\6\2\2fg\5\24\13\2gh\7\7\2"+
		"\2hi\5(\25\2ij\7\4\2\2j\17\3\2\2\2km\5\22\n\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\21\3\2\2\2pu\7-\2\2qr\7\5\2\2rt\7-\2\2sq\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\6\2\2yz\5\24\13\2z"+
		"{\7\4\2\2{\23\3\2\2\2|}\t\2\2\2}\25\3\2\2\2~\177\7-\2\2\177\u0080\7\b"+
		"\2\2\u0080\u0081\5(\25\2\u0081\u0082\7\4\2\2\u0082\27\3\2\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5(\25\2\u0086\u0087\7,\2\2\u0087"+
		"\u0088\5(\25\2\u0088\u0089\7+\2\2\u0089\31\3\2\2\2\u008a\u008b\7-\2\2"+
		"\u008b\u008c\7\b\2\2\u008c\u008d\5(\25\2\u008d\u008e\7\4\2\2\u008e\33"+
		"\3\2\2\2\u008f\u0090\7\25\2\2\u0090\u0091\5(\25\2\u0091\u0093\7\26\2\2"+
		"\u0092\u0094\7\30\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\7\31\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\35\3\2\2\2\u009e\u00a0\7\27\2\2\u009f\u00a1\7\30\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\5\6\4\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\31\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\7)\2\2"+
		"\u00ac\u00ad\5(\25\2\u00ad\u00ae\7+\2\2\u00ae\u00b2\7\30\2\2\u00af\u00b1"+
		"\5\6\4\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\31"+
		"\2\2\u00b6\u00b7\7\4\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba"+
		"\5\30\r\2\u00ba\u00bb\7\30\2\2\u00bb\u00bf\5\6\4\2\u00bc\u00be\5\6\4\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\31\2\2"+
		"\u00c3\u00c4\7\4\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\7"+
		"\t\2\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\4\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\5(\25\2"+
		"\u00ce\u00cf\7\n\2\2\u00cf\u00d0\7\4\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\b"+
		"\25\1\2\u00d2\u00d3\7\13\2\2\u00d3\u00e1\5(\25\f\u00d4\u00d5\7%\2\2\u00d5"+
		"\u00e1\5(\25\13\u00d6\u00d7\7#\2\2\u00d7\u00e1\5(\25\n\u00d8\u00d9\7$"+
		"\2\2\u00d9\u00e1\5(\25\t\u00da\u00db\7!\2\2\u00db\u00e1\5(\25\b\u00dc"+
		"\u00dd\7\"\2\2\u00dd\u00e1\5(\25\7\u00de\u00e1\5*\26\2\u00df\u00e1\5,"+
		"\27\2\u00e0\u00d1\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\f\6\2\2\u00e3"+
		"\u00e4\t\3\2\2\u00e4\u00e9\5(\25\7\u00e5\u00e6\f\5\2\2\u00e6\u00e7\t\4"+
		"\2\2\u00e7\u00e9\5(\25\6\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb)\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\26\1\2\u00ee\u00ef\7\24\2\2\u00ef\u00f0"+
		"\5*\26\5\u00f0\u00f9\3\2\2\2\u00f1\u00f2\f\4\2\2\u00f2\u00f3\7\23\2\2"+
		"\u00f3\u00f8\5*\26\5\u00f4\u00f5\f\3\2\2\u00f5\u00f6\7\22\2\2\u00f6\u00f8"+
		"\5*\26\4\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa+\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fc\u00fd\7\t\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7\n\2\2\u00ff\u0104"+
		"\3\2\2\2\u0100\u0104\7.\2\2\u0101\u0104\t\5\2\2\u0102\u0104\7-\2\2\u0103"+
		"\u00fc\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104-\3\2\2\2\31\67?KSV[bnu\u0093\u0098\u009c\u00a0\u00a5\u00a9"+
		"\u00b2\u00bf\u00e0\u00e8\u00ea\u00f7\u00f9\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}