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
		RULE_inst = 8, RULE_variableDec = 9, RULE_dec = 10, RULE_instVar = 11, 
		RULE_forInst = 12, RULE_instBool = 13, RULE_ifBlock = 14, RULE_elseBlock = 15, 
		RULE_whileBlock = 16, RULE_forBlock = 17, RULE_read = 18, RULE_write = 19, 
		RULE_expr = 20, RULE_bexpr = 21, RULE_atom = 22;
	public static final String[] ruleNames = {
		"startProgram", "programBlocks", "statements", "function", "procedure", 
		"start", "varDef", "variableInst", "inst", "variableDec", "dec", "instVar", 
		"forInst", "instBool", "ifBlock", "elseBlock", "whileBlock", "forBlock", 
		"read", "write", "expr", "bexpr", "atom"
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
			setState(46);
			programBlocks();
			setState(47);
			match(END);
			setState(48);
			match(T__0);
			setState(49);
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
			setState(51);
			start();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(52);
				varDef();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(58);
				function();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(BEGIN);
			setState(65);
			statements();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(66);
				statements();
				}
				}
				setState(71);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				instVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				instBool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				procedure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				forInst();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				elseBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				whileBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				forBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(82);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VariableDecContext variableDec() {
			return getRuleContext(VariableDecContext.class,0);
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
			setState(85);
			match(FUNCTION);
			setState(86);
			expr(0);
			setState(87);
			match(T__1);
			setState(88);
			variableDec();
			setState(89);
			match(T__2);
			setState(90);
			match(T__3);
			setState(91);
			expr(0);
			setState(92);
			match(T__4);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(93);
				varDef();
				}
			}

			setState(96);
			match(BEGIN);
			setState(97);
			statements();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(98);
				statements();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(END);
			setState(105);
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
			setState(107);
			match(PROCEDURE);
			setState(108);
			expr(0);
			setState(109);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(110);
				variableDec();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__2);
			setState(117);
			match(T__4);
			setState(118);
			match(BEGIN);
			setState(119);
			statements();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(120);
				statements();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(END);
			setState(127);
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
			setState(129);
			match(PROGRAM);
			setState(130);
			expr(0);
			setState(131);
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
			setState(133);
			match(VAR);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134);
				variableInst();
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				setState(137);
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
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(140);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143); 
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
			setState(145);
			expr(0);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(146);
				match(T__5);
				setState(147);
				expr(0);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(T__3);
			setState(154);
			expr(0);
			setState(155);
			match(T__6);
			setState(156);
			expr(0);
			setState(157);
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
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					dec();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
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
			setState(164);
			expr(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(165);
				match(T__5);
				setState(166);
				expr(0);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__3);
			setState(173);
			expr(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(174);
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
		enterRule(_localctx, 22, RULE_instVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expr(0);
			setState(178);
			match(T__7);
			setState(179);
			expr(0);
			setState(180);
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
		enterRule(_localctx, 24, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(183);
			match(T__7);
			setState(184);
			expr(0);
			setState(185);
			expr(0);
			setState(186);
			expr(0);
			setState(187);
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
		enterRule(_localctx, 26, RULE_instBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expr(0);
			setState(190);
			match(T__7);
			setState(191);
			expr(0);
			setState(192);
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
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			expr(0);
			setState(196);
			match(THEN);
			setState(197);
			match(BEGIN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(198);
				statements();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		enterRule(_localctx, 30, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ELSE);
			setState(207);
			match(BEGIN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(208);
				statements();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
		enterRule(_localctx, 32, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WHILE);
			setState(217);
			expr(0);
			setState(218);
			expr(0);
			setState(219);
			match(BEGIN);
			setState(220);
			statements();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(221);
				statements();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(END);
			setState(228);
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
		enterRule(_localctx, 34, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FOR);
			setState(231);
			forInst();
			setState(232);
			match(BEGIN);
			setState(233);
			statements();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(234);
				statements();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(END);
			setState(241);
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
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(READ);
			setState(244);
			match(T__1);
			setState(245);
			expr(0);
			setState(246);
			match(T__2);
			setState(247);
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
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(WRITE);
			setState(250);
			match(T__1);
			setState(251);
			expr(0);
			setState(252);
			match(T__2);
			setState(253);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256);
				((NegateExprContext)_localctx).op = match(MINUS);
				setState(257);
				expr(15);
				}
				break;
			case SQUAREROOT:
				{
				_localctx = new SqrtExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				((SqrtExprContext)_localctx).op = match(SQUAREROOT);
				setState(259);
				expr(13);
				}
				break;
			case NATLOG:
				{
				_localctx = new NatlogExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				((NatlogExprContext)_localctx).op = match(NATLOG);
				setState(261);
				expr(12);
				}
				break;
			case SINE:
				{
				_localctx = new SinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((SinExprContext)_localctx).op = match(SINE);
				setState(263);
				expr(11);
				}
				break;
			case COSINE:
				{
				_localctx = new CosineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((CosineExprContext)_localctx).op = match(COSINE);
				setState(265);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				bexpr(0);
				}
				break;
			case T__1:
			case REAL:
			case BOOL:
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
				setState(267);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(271);
						((ExpoExprContext)_localctx).op = match(EXPO);
						setState(272);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MulDicModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(274);
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
						setState(275);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(277);
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
						setState(278);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(280);
						((EqualsExprContext)_localctx).op = match(T__6);
						setState(281);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(283);
						((LessExprContext)_localctx).op = match(T__11);
						setState(284);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(286);
						((GreaterExprContext)_localctx).op = match(T__12);
						setState(287);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new LessEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(289);
						((LessEqExprContext)_localctx).op = match(T__13);
						setState(290);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						((GreaterEqExprContext)_localctx).op = match(T__14);
						setState(293);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(298);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			((BexprContext)_localctx).op = match(NOT);
			setState(301);
			bexpr(3);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(303);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(304);
						((BexprContext)_localctx).op = match(AND);
						setState(305);
						bexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(306);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(307);
						((BexprContext)_localctx).op = match(OR);
						setState(308);
						bexpr(2);
						}
						break;
					}
					} 
				}
				setState(313);
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
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoExprContext extends AtomContext {
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public DoExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class RealTypeExprContext extends AtomContext {
		public TerminalNode REAL() { return getToken(P2Parser.REAL, 0); }
		public RealTypeExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class VariableExprContext extends AtomContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public VariableExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanTypeExprContext extends AtomContext {
		public TerminalNode BOOL() { return getToken(P2Parser.BOOL, 0); }
		public BooleanTypeExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanValExprContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P2Parser.FALSE, 0); }
		public BooleanValExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NumExprContext extends AtomContext {
		public TerminalNode NUM() { return getToken(P2Parser.NUM, 0); }
		public NumExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class ToExprContext extends AtomContext {
		public TerminalNode TO() { return getToken(P2Parser.TO, 0); }
		public ToExprContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__1);
				setState(315);
				expr(0);
				setState(316);
				match(T__2);
				}
				break;
			case NUM:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(NUM);
				}
				break;
			case DO:
				_localctx = new DoExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(DO);
				}
				break;
			case TO:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(TO);
				}
				break;
			case REAL:
				_localctx = new RealTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BooleanTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(BOOL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanValExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
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
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(324);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13\3"+
		"\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3"+
		"\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6r\n\6\f"+
		"\6\16\6u\13\6\3\6\3\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u008a\n\b\3\b\5\b\u008d\n\b\3\t\6\t\u0090"+
		"\n\t\r\t\16\t\u0091\3\n\3\n\3\n\7\n\u0097\n\n\f\n\16\n\u009a\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00a3\n\13\r\13\16\13\u00a4\3\f\3\f\3\f"+
		"\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00d4\n\21\f\21\16\21\u00d7\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e1\n\22\f\22\16\22\u00e4\13\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010f\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0129\n\26\f\26\16\26\u012c\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0138\n\27\f\27\16\27\u013b\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0148\n\30\3\30\2\4"+
		"*,\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\13\r\3\2"+
		"\62\63\3\2$%\2\u0165\2\60\3\2\2\2\4\65\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\n"+
		"m\3\2\2\2\f\u0083\3\2\2\2\16\u0087\3\2\2\2\20\u008f\3\2\2\2\22\u0093\3"+
		"\2\2\2\24\u00a2\3\2\2\2\26\u00a6\3\2\2\2\30\u00b3\3\2\2\2\32\u00b8\3\2"+
		"\2\2\34\u00bf\3\2\2\2\36\u00c4\3\2\2\2 \u00d0\3\2\2\2\"\u00da\3\2\2\2"+
		"$\u00e8\3\2\2\2&\u00f5\3\2\2\2(\u00fb\3\2\2\2*\u010e\3\2\2\2,\u012d\3"+
		"\2\2\2.\u0147\3\2\2\2\60\61\5\4\3\2\61\62\7\36\2\2\62\63\7\3\2\2\63\64"+
		"\7\2\2\3\64\3\3\2\2\2\659\5\f\7\2\668\5\16\b\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\35\2\2CG\5\6\4\2DF\5\6"+
		"\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3\2\2\2JV\5"+
		"\30\r\2KV\5\34\17\2LV\5\n\6\2MV\5\b\5\2NV\5\32\16\2OV\5\36\20\2PV\5 \21"+
		"\2QV\5\"\22\2RV\5$\23\2SV\5&\24\2TV\5(\25\2UJ\3\2\2\2UK\3\2\2\2UL\3\2"+
		"\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2"+
		"\2\2UT\3\2\2\2V\7\3\2\2\2WX\7\24\2\2XY\5*\26\2YZ\7\4\2\2Z[\5\24\13\2["+
		"\\\7\5\2\2\\]\7\6\2\2]^\5*\26\2^`\7\7\2\2_a\5\16\b\2`_\3\2\2\2`a\3\2\2"+
		"\2ab\3\2\2\2bc\7\35\2\2cg\5\6\4\2df\5\6\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\36\2\2kl\7\7\2\2l\t\3\2\2\2mn\7"+
		"\23\2\2no\5*\26\2os\7\4\2\2pr\5\24\13\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2wx\7\7\2\2xy\7\35\2\2y}\5\6\4"+
		"\2z|\5\6\4\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177}\3\2\2\2\u0080\u0081\7\36\2\2\u0081\u0082\7\7\2\2\u0082\13\3\2\2"+
		"\2\u0083\u0084\7#\2\2\u0084\u0085\5*\26\2\u0085\u0086\7\7\2\2\u0086\r"+
		"\3\2\2\2\u0087\u0089\7!\2\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\24\13\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u0090\5\22\n\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\21\3\2\2\2\u0093\u0098\5*\26\2\u0094\u0095\7\b\2\2\u0095\u0097"+
		"\5*\26\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\6"+
		"\2\2\u009c\u009d\5*\26\2\u009d\u009e\7\t\2\2\u009e\u009f\5*\26\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\23\3\2\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\25"+
		"\3\2\2\2\u00a6\u00ab\5*\26\2\u00a7\u00a8\7\b\2\2\u00a8\u00aa\5*\26\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b1\5*\26\2\u00b0\u00b2\7\7\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\27\3\2\2\2\u00b3\u00b4\5*\26\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6"+
		"\5*\26\2\u00b6\u00b7\7\7\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\5*\26\2\u00b9"+
		"\u00ba\7\n\2\2\u00ba\u00bb\5*\26\2\u00bb\u00bc\5*\26\2\u00bc\u00bd\5*"+
		"\26\2\u00bd\u00be\5*\26\2\u00be\33\3\2\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1"+
		"\7\n\2\2\u00c1\u00c2\5*\26\2\u00c2\u00c3\7\7\2\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c5\7\32\2\2\u00c5\u00c6\5*\26\2\u00c6\u00c7\7\33\2\2\u00c7\u00cb\7"+
		"\35\2\2\u00c8\u00ca\5\6\4\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\36\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\u00d5\7\35\2\2\u00d2\u00d4\5\6\4\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9!\3\2\2\2\u00da\u00db\7.\2\2"+
		"\u00db\u00dc\5*\26\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7\35\2\2\u00de\u00e2"+
		"\5\6\4\2\u00df\u00e1\5\6\4\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7\36\2\2\u00e6\u00e7\7\7\2\2\u00e7#\3\2\2\2\u00e8\u00e9"+
		"\7/\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\7\35\2\2\u00eb\u00ef\5\6\4\2"+
		"\u00ec\u00ee\5\6\4\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7\36\2\2\u00f3\u00f4\7\7\2\2\u00f4%\3\2\2\2\u00f5\u00f6\7\37\2"+
		"\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7\5\2\2\u00f9\u00fa"+
		"\7\7\2\2\u00fa\'\3\2\2\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\7\4\2\2\u00fd"+
		"\u00fe\5*\26\2\u00fe\u00ff\7\5\2\2\u00ff\u0100\7\7\2\2\u0100)\3\2\2\2"+
		"\u0101\u0102\b\26\1\2\u0102\u0103\7\63\2\2\u0103\u010f\5*\26\21\u0104"+
		"\u0105\7(\2\2\u0105\u010f\5*\26\17\u0106\u0107\7)\2\2\u0107\u010f\5*\26"+
		"\16\u0108\u0109\7&\2\2\u0109\u010f\5*\26\r\u010a\u010b\7\'\2\2\u010b\u010f"+
		"\5*\26\f\u010c\u010f\5,\27\2\u010d\u010f\5.\30\2\u010e\u0101\3\2\2\2\u010e"+
		"\u0104\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010a\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u012a\3\2\2\2\u0110"+
		"\u0111\f\20\2\2\u0111\u0112\7*\2\2\u0112\u0129\5*\26\21\u0113\u0114\f"+
		"\13\2\2\u0114\u0115\t\2\2\2\u0115\u0129\5*\26\f\u0116\u0117\f\n\2\2\u0117"+
		"\u0118\t\3\2\2\u0118\u0129\5*\26\13\u0119\u011a\f\t\2\2\u011a\u011b\7"+
		"\t\2\2\u011b\u0129\5*\26\n\u011c\u011d\f\b\2\2\u011d\u011e\7\16\2\2\u011e"+
		"\u0129\5*\26\t\u011f\u0120\f\7\2\2\u0120\u0121\7\17\2\2\u0121\u0129\5"+
		"*\26\b\u0122\u0123\f\6\2\2\u0123\u0124\7\20\2\2\u0124\u0129\5*\26\7\u0125"+
		"\u0126\f\5\2\2\u0126\u0127\7\21\2\2\u0127\u0129\5*\26\6\u0128\u0110\3"+
		"\2\2\2\u0128\u0113\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0119\3\2\2\2\u0128"+
		"\u011c\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"+\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\27\1\2\u012e\u012f\7\31\2"+
		"\2\u012f\u0130\5,\27\5\u0130\u0139\3\2\2\2\u0131\u0132\f\4\2\2\u0132\u0133"+
		"\7\30\2\2\u0133\u0138\5,\27\5\u0134\u0135\f\3\2\2\u0135\u0136\7\27\2\2"+
		"\u0136\u0138\5,\27\4\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a-\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\7\4\2\2\u013d\u013e\5*\26\2\u013e\u013f\7\5"+
		"\2\2\u013f\u0148\3\2\2\2\u0140\u0148\7\65\2\2\u0141\u0148\7\60\2\2\u0142"+
		"\u0148\7\61\2\2\u0143\u0148\7\25\2\2\u0144\u0148\7\26\2\2\u0145\u0148"+
		"\t\4\2\2\u0146\u0148\7\64\2\2\u0147\u013c\3\2\2\2\u0147\u0140\3\2\2\2"+
		"\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148/\3\2\2\2\339?G"+
		"U`gs}\u0089\u008c\u0091\u0098\u00a4\u00ab\u00b1\u00cb\u00d5\u00e2\u00ef"+
		"\u010e\u0128\u012a\u0137\u0139\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}