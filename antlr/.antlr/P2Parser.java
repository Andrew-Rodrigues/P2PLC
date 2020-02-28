// Generated from /home/giles/Desktop/Classes/COP4020/Project2/P2PLC/antlr/P2.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, DIV=16, PROCEDURE=17, 
		FUNCTION=18, REAL=19, BOOL=20, OR=21, AND=22, NOT=23, IF=24, THEN=25, 
		ELSE=26, BEGIN=27, END=28, READ=29, WRITE=30, VAR=31, ARRAY=32, PROGRAM=33, 
		TRUE=34, FALSE=35, SINE=36, COSINE=37, SQUAREROOT=38, NATLOG=39, EXPO=40, 
		CASE=41, OF=42, CONST=43, WHILE=44, FOR=45, DO=46, TO=47, PLUS=48, MINUS=49, 
		VARNAME=50, NUM=51, COMMENtLine=52, CommentChunk=53, WS=54;
	public static final int
		RULE_startProgram = 0, RULE_programBlocks = 1, RULE_statements = 2, RULE_function = 3, 
		RULE_procedure = 4, RULE_start = 5, RULE_varDef = 6, RULE_variableInst = 7, 
		RULE_inst = 8, RULE_variableDec = 9, RULE_dec = 10, RULE_realOrBool = 11, 
		RULE_instVar = 12, RULE_forInst = 13, RULE_instBool = 14, RULE_ifBlock = 15, 
		RULE_elseBlock = 16, RULE_whileBlock = 17, RULE_forBlock = 18, RULE_read = 19, 
		RULE_write = 20, RULE_expr = 21, RULE_bexpr = 22, RULE_atom = 23;
	public static final String[] ruleNames = {
		"startProgram", "programBlocks", "statements", "function", "procedure", 
		"start", "varDef", "variableInst", "inst", "variableDec", "dec", "realOrBool", 
		"instVar", "forInst", "instBool", "ifBlock", "elseBlock", "whileBlock", 
		"forBlock", "read", "write", "expr", "bexpr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "')'", "':'", "';'", "','", "'='", "':='", "'*'", 
		"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "DIV", "PROCEDURE", "FUNCTION", "REAL", "BOOL", 
		"OR", "AND", "NOT", "IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", 
		"VAR", "ARRAY", "PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", 
		"NATLOG", "EXPO", "CASE", "OF", "CONST", "WHILE", "FOR", "DO", "TO", "PLUS", 
		"MINUS", "VARNAME", "NUM", "COMMENtLine", "CommentChunk", "WS"
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
	}

	public final StartProgramContext startProgram() throws RecognitionException {
		StartProgramContext _localctx = new StartProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			programBlocks();
			setState(49);
			match(END);
			setState(50);
			match(T__0);
			setState(51);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			start();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(54);
				varDef();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(60);
				function();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(BEGIN);
			setState(67);
			statements();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(68);
				statements();
				}
				}
				setState(73);
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
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				instVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				instBool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				procedure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				forInst();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				elseBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				whileBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				forBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(P2Parser.FUNCTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDecContext variableDec() {
			return getRuleContext(VariableDecContext.class,0);
		}
		public RealOrBoolContext realOrBool() {
			return getRuleContext(RealOrBoolContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FUNCTION);
			setState(88);
			expr(0);
			setState(89);
			match(T__1);
			setState(90);
			variableDec();
			setState(91);
			match(T__2);
			setState(92);
			match(T__3);
			setState(93);
			realOrBool();
			setState(94);
			match(T__4);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(95);
				varDef();
				}
			}

			setState(98);
			match(BEGIN);
			setState(99);
			statements();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(100);
				statements();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(END);
			setState(107);
			match(T__4);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(P2Parser.PROCEDURE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public List<VariableDecContext> variableDec() {
			return getRuleContexts(VariableDecContext.class);
		}
		public VariableDecContext variableDec(int i) {
			return getRuleContext(VariableDecContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PROCEDURE);
			setState(110);
			expr(0);
			setState(111);
			match(T__1);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(112);
				variableDec();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__2);
			setState(119);
			match(T__4);
			setState(120);
			match(BEGIN);
			setState(121);
			statements();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(122);
				statements();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(END);
			setState(129);
			match(T__4);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PROGRAM);
			setState(132);
			expr(0);
			setState(133);
			match(T__4);
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
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			match(VAR);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(136);
				variableInst();
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				setState(139);
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
	}

	public final VariableInstContext variableInst() throws RecognitionException {
		VariableInstContext _localctx = new VariableInstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableInst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(142);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RealOrBoolContext realOrBool() {
			return getRuleContext(RealOrBoolContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			expr(0);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(148);
				match(T__5);
				setState(149);
				expr(0);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__3);
			setState(156);
			realOrBool();
			setState(157);
			match(T__6);
			setState(158);
			expr(0);
			setState(159);
			match(T__4);
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
	}

	public final VariableDecContext variableDec() throws RecognitionException {
		VariableDecContext _localctx = new VariableDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					dec();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class DecContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RealOrBoolContext realOrBool() {
			return getRuleContext(RealOrBoolContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			expr(0);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(167);
				match(T__5);
				setState(168);
				expr(0);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__3);
			setState(175);
			realOrBool();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(176);
				match(T__4);
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

	public static class RealOrBoolContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(P2Parser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(P2Parser.BOOL, 0); }
		public RealOrBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realOrBool; }
	}

	public final RealOrBoolContext realOrBool() throws RecognitionException {
		RealOrBoolContext _localctx = new RealOrBoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_realOrBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instVar; }
	}

	public final InstVarContext instVar() throws RecognitionException {
		InstVarContext _localctx = new InstVarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expr(0);
			setState(182);
			match(T__7);
			setState(183);
			expr(0);
			setState(184);
			match(T__4);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInst; }
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expr(0);
			setState(187);
			match(T__7);
			setState(188);
			expr(0);
			setState(189);
			expr(0);
			setState(190);
			expr(0);
			setState(191);
			expr(0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instBool; }
	}

	public final InstBoolContext instBool() throws RecognitionException {
		InstBoolContext _localctx = new InstBoolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			expr(0);
			setState(194);
			match(T__7);
			setState(195);
			expr(0);
			setState(196);
			match(T__4);
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
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IF);
			setState(199);
			expr(0);
			setState(200);
			match(THEN);
			setState(201);
			match(BEGIN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(202);
				statements();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(END);
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
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ELSE);
			setState(211);
			match(BEGIN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(212);
				statements();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(END);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(WHILE);
			setState(221);
			expr(0);
			setState(222);
			expr(0);
			setState(223);
			match(BEGIN);
			setState(224);
			statements();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(225);
				statements();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(END);
			setState(232);
			match(T__4);
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
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FOR);
			setState(235);
			forInst();
			setState(236);
			match(BEGIN);
			setState(237);
			statements();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(238);
				statements();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(END);
			setState(245);
			match(T__4);
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
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(READ);
			setState(248);
			match(T__1);
			setState(249);
			expr(0);
			setState(250);
			match(T__2);
			setState(251);
			match(T__4);
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
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WRITE);
			setState(254);
			match(T__1);
			setState(255);
			expr(0);
			setState(256);
			match(T__2);
			setState(257);
			match(T__4);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CosineExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COSINE() { return getToken(P2Parser.COSINE, 0); }
		public CosineExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(P2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(P2Parser.MINUS, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterEqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterEqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NatlogExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NATLOG() { return getToken(P2Parser.NATLOG, 0); }
		public NatlogExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SinExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SINE() { return getToken(P2Parser.SINE, 0); }
		public SinExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SqrtExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUAREROOT() { return getToken(P2Parser.SQUAREROOT, 0); }
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegateExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulDicModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDicModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpoExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXPO() { return getToken(P2Parser.EXPO, 0); }
		public ExpoExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolExprContext extends ExprContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessEqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessEqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(260);
				((NegateExprContext)_localctx).op = match(MINUS);
				setState(261);
				expr(15);
				}
				break;
			case SQUAREROOT:
				{
				_localctx = new SqrtExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((SqrtExprContext)_localctx).op = match(SQUAREROOT);
				setState(263);
				expr(13);
				}
				break;
			case NATLOG:
				{
				_localctx = new NatlogExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((NatlogExprContext)_localctx).op = match(NATLOG);
				setState(265);
				expr(12);
				}
				break;
			case SINE:
				{
				_localctx = new SinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				((SinExprContext)_localctx).op = match(SINE);
				setState(267);
				expr(11);
				}
				break;
			case COSINE:
				{
				_localctx = new CosineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				((CosineExprContext)_localctx).op = match(COSINE);
				setState(269);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				bexpr(0);
				}
				break;
			case T__1:
			case TRUE:
			case FALSE:
			case DO:
			case TO:
			case VARNAME:
			case NUM:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275);
						((ExpoExprContext)_localctx).op = match(EXPO);
						setState(276);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MulDicModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(278);
						((MulDicModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
							((MulDicModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(281);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(284);
						((EqualsExprContext)_localctx).op = match(T__6);
						setState(285);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(287);
						((LessExprContext)_localctx).op = match(T__11);
						setState(288);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(290);
						((GreaterExprContext)_localctx).op = match(T__12);
						setState(291);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new LessEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(293);
						((LessEqExprContext)_localctx).op = match(T__13);
						setState(294);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						((GreaterEqExprContext)_localctx).op = match(T__14);
						setState(297);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(302);
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

	public static class BexprContext extends ParserRuleContext {
		public Token op;
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(P2Parser.NOT, 0); }
		public TerminalNode AND() { return getToken(P2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(P2Parser.OR, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			((BexprContext)_localctx).op = match(NOT);
			setState(305);
			bexpr(3);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(307);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(308);
						((BexprContext)_localctx).op = match(AND);
						setState(309);
						bexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(310);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(311);
						((BexprContext)_localctx).op = match(OR);
						setState(312);
						bexpr(2);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public TerminalNode TO() { return getToken(P2Parser.TO, 0); }
		public TerminalNode TRUE() { return getToken(P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P2Parser.FALSE, 0); }
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__1);
				setState(319);
				expr(0);
				setState(320);
				match(T__2);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(NUM);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(DO);
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(TO);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
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
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
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
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5c\n\5\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\7\6t\n\6\f\6\16\6w\13\6\3\6\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081"+
		"\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u008c\n\b\3\b\5\b\u008f"+
		"\n\b\3\t\6\t\u0092\n\t\r\t\16\t\u0093\3\n\3\n\3\n\7\n\u0099\n\n\f\n\16"+
		"\n\u009c\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00a5\n\13\r\13\16\13"+
		"\u00a6\3\f\3\f\3\f\7\f\u00ac\n\f\f\f\16\f\u00af\13\f\3\f\3\f\3\f\5\f\u00b4"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00ce\n\21"+
		"\f\21\16\21\u00d1\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00d8\n\22\f\22"+
		"\16\22\u00db\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e5"+
		"\n\23\f\23\16\23\u00e8\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u00f2\n\24\f\24\16\24\u00f5\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0113\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u013c\n\30"+
		"\f\30\16\30\u013f\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u014a\n\31\3\31\2\4,.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\6\3\2\25\26\3\2\13\r\3\2\62\63\3\2$%\2\u0164\2\62\3\2\2\2"+
		"\4\67\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\no\3\2\2\2\f\u0085\3\2\2\2\16\u0089"+
		"\3\2\2\2\20\u0091\3\2\2\2\22\u0095\3\2\2\2\24\u00a4\3\2\2\2\26\u00a8\3"+
		"\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00bc\3\2\2\2\36\u00c3\3\2"+
		"\2\2 \u00c8\3\2\2\2\"\u00d4\3\2\2\2$\u00de\3\2\2\2&\u00ec\3\2\2\2(\u00f9"+
		"\3\2\2\2*\u00ff\3\2\2\2,\u0112\3\2\2\2.\u0131\3\2\2\2\60\u0149\3\2\2\2"+
		"\62\63\5\4\3\2\63\64\7\36\2\2\64\65\7\3\2\2\65\66\7\2\2\3\66\3\3\2\2\2"+
		"\67;\5\f\7\28:\5\16\b\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2"+
		"\2\2=;\3\2\2\2>@\5\b\5\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CA\3\2\2\2DE\7\35\2\2EI\5\6\4\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LX\5\32\16\2MX\5\36\20\2NX\5\n\6"+
		"\2OX\5\b\5\2PX\5\34\17\2QX\5 \21\2RX\5\"\22\2SX\5$\23\2TX\5&\24\2UX\5"+
		"(\25\2VX\5*\26\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2WQ\3"+
		"\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ"+
		"\7\24\2\2Z[\5,\27\2[\\\7\4\2\2\\]\5\24\13\2]^\7\5\2\2^_\7\6\2\2_`\5\30"+
		"\r\2`b\7\7\2\2ac\5\16\b\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\35\2\2ei\5"+
		"\6\4\2fh\5\6\4\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3"+
		"\2\2\2lm\7\36\2\2mn\7\7\2\2n\t\3\2\2\2op\7\23\2\2pq\5,\27\2qu\7\4\2\2"+
		"rt\5\24\13\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2"+
		"\2xy\7\5\2\2yz\7\7\2\2z{\7\35\2\2{\177\5\6\4\2|~\5\6\4\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\7\2\2\u0084\13\3\2\2\2\u0085"+
		"\u0086\7#\2\2\u0086\u0087\5,\27\2\u0087\u0088\7\7\2\2\u0088\r\3\2\2\2"+
		"\u0089\u008b\7!\2\2\u008a\u008c\5\20\t\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\24\13\2\u008e\u008d\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090\u0092\5\22\n\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u009a\5,\27\2\u0096\u0097\7\b\2\2\u0097\u0099\5,\27"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\6\2\2\u009e"+
		"\u009f\5\30\r\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\5,\27\2\u00a1\u00a2\7"+
		"\7\2\2\u00a2\23\3\2\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\25\3\2\2"+
		"\2\u00a8\u00ad\5,\27\2\u00a9\u00aa\7\b\2\2\u00aa\u00ac\5,\27\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\5\30"+
		"\r\2\u00b2\u00b4\7\7\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\27\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\5,\27\2\u00b8"+
		"\u00b9\7\n\2\2\u00b9\u00ba\5,\27\2\u00ba\u00bb\7\7\2\2\u00bb\33\3\2\2"+
		"\2\u00bc\u00bd\5,\27\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0"+
		"\5,\27\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\5,\27\2\u00c2\35\3\2\2\2\u00c3"+
		"\u00c4\5,\27\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\5,\27\2\u00c6\u00c7\7\7"+
		"\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb"+
		"\7\33\2\2\u00cb\u00cf\7\35\2\2\u00cc\u00ce\5\6\4\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\36\2\2\u00d3!\3\2\2\2\u00d4"+
		"\u00d5\7\34\2\2\u00d5\u00d9\7\35\2\2\u00d6\u00d8\5\6\4\2\u00d7\u00d6\3"+
		"\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\36\2\2\u00dd#\3\2\2\2"+
		"\u00de\u00df\7.\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\5,\27\2\u00e1\u00e2"+
		"\7\35\2\2\u00e2\u00e6\5\6\4\2\u00e3\u00e5\5\6\4\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\7\7\2\2"+
		"\u00eb%\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\7"+
		"\35\2\2\u00ef\u00f3\5\6\4\2\u00f0\u00f2\5\6\4\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\7\7\2\2\u00f8"+
		"\'\3\2\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7\4\2\2\u00fb\u00fc\5,\27"+
		"\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe\7\7\2\2\u00fe)\3\2\2\2\u00ff\u0100"+
		"\7 \2\2\u0100\u0101\7\4\2\2\u0101\u0102\5,\27\2\u0102\u0103\7\5\2\2\u0103"+
		"\u0104\7\7\2\2\u0104+\3\2\2\2\u0105\u0106\b\27\1\2\u0106\u0107\7\63\2"+
		"\2\u0107\u0113\5,\27\21\u0108\u0109\7(\2\2\u0109\u0113\5,\27\17\u010a"+
		"\u010b\7)\2\2\u010b\u0113\5,\27\16\u010c\u010d\7&\2\2\u010d\u0113\5,\27"+
		"\r\u010e\u010f\7\'\2\2\u010f\u0113\5,\27\f\u0110\u0113\5.\30\2\u0111\u0113"+
		"\5\60\31\2\u0112\u0105\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010a\3\2\2\2"+
		"\u0112\u010c\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u012e\3\2\2\2\u0114\u0115\f\20\2\2\u0115\u0116\7*\2\2\u0116"+
		"\u012d\5,\27\21\u0117\u0118\f\13\2\2\u0118\u0119\t\3\2\2\u0119\u012d\5"+
		",\27\f\u011a\u011b\f\n\2\2\u011b\u011c\t\4\2\2\u011c\u012d\5,\27\13\u011d"+
		"\u011e\f\t\2\2\u011e\u011f\7\t\2\2\u011f\u012d\5,\27\n\u0120\u0121\f\b"+
		"\2\2\u0121\u0122\7\16\2\2\u0122\u012d\5,\27\t\u0123\u0124\f\7\2\2\u0124"+
		"\u0125\7\17\2\2\u0125\u012d\5,\27\b\u0126\u0127\f\6\2\2\u0127\u0128\7"+
		"\20\2\2\u0128\u012d\5,\27\7\u0129\u012a\f\5\2\2\u012a\u012b\7\21\2\2\u012b"+
		"\u012d\5,\27\6\u012c\u0114\3\2\2\2\u012c\u0117\3\2\2\2\u012c\u011a\3\2"+
		"\2\2\u012c\u011d\3\2\2\2\u012c\u0120\3\2\2\2\u012c\u0123\3\2\2\2\u012c"+
		"\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f-\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132"+
		"\b\30\1\2\u0132\u0133\7\31\2\2\u0133\u0134\5.\30\5\u0134\u013d\3\2\2\2"+
		"\u0135\u0136\f\4\2\2\u0136\u0137\7\30\2\2\u0137\u013c\5.\30\5\u0138\u0139"+
		"\f\3\2\2\u0139\u013a\7\27\2\2\u013a\u013c\5.\30\4\u013b\u0135\3\2\2\2"+
		"\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e/\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\4\2\2\u0141"+
		"\u0142\5,\27\2\u0142\u0143\7\5\2\2\u0143\u014a\3\2\2\2\u0144\u014a\7\65"+
		"\2\2\u0145\u014a\7\60\2\2\u0146\u014a\7\61\2\2\u0147\u014a\t\5\2\2\u0148"+
		"\u014a\7\64\2\2\u0149\u0140\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3"+
		"\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\61\3\2\2\2\33;AIWbiu\177\u008b\u008e\u0093\u009a\u00a6\u00ad\u00b3\u00cf"+
		"\u00d9\u00e6\u00f3\u0112\u012c\u012e\u013b\u013d\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}