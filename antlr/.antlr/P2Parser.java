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
		T__9=10, T__10=11, T__11=12, DIV=13, PROCEDURE=14, FUNCTION=15, REAL=16, 
		BOOL=17, OR=18, AND=19, NOT=20, IF=21, THEN=22, ELSE=23, BEGIN=24, END=25, 
		READ=26, WRITE=27, VAR=28, ARRAY=29, PROGRAM=30, TRUE=31, FALSE=32, SINE=33, 
		COSINE=34, SQUAREROOT=35, NATLOG=36, EXP=37, CASE=38, OF=39, CONST=40, 
		WHILE=41, FOR=42, DO=43, TO=44, PLUS=45, MINUS=46, MULT=47, DIVI=48, MOD=49, 
		BREAK=50, CONTINUE=51, VARNAME=52, NUM=53, COMMENtLine=54, CommentChunk=55, 
		WS=56;
	public static final int
		RULE_startProgram = 0, RULE_programBlocks = 1, RULE_statements = 2, RULE_function = 3, 
		RULE_funcAssignment = 4, RULE_functionCall = 5, RULE_funcParams = 6, RULE_funcVarDef = 7, 
		RULE_funcVarInst = 8, RULE_funcInst = 9, RULE_funcParamDec = 10, RULE_funcDec = 11, 
		RULE_functionBlock = 12, RULE_procedure = 13, RULE_start = 14, RULE_varDef = 15, 
		RULE_variableInst = 16, RULE_inst = 17, RULE_variableDec = 18, RULE_dec = 19, 
		RULE_assignment = 20, RULE_forInst = 21, RULE_ifBlock = 22, RULE_elseBlock = 23, 
		RULE_conditionalBlock = 24, RULE_loopBlock = 25, RULE_whileBlock = 26, 
		RULE_forBlock = 27, RULE_read = 28, RULE_write = 29, RULE_breakStatement = 30, 
		RULE_continueStatement = 31, RULE_expr = 32, RULE_atom = 33;
	public static final String[] ruleNames = {
		"startProgram", "programBlocks", "statements", "function", "funcAssignment", 
		"functionCall", "funcParams", "funcVarDef", "funcVarInst", "funcInst", 
		"funcParamDec", "funcDec", "functionBlock", "procedure", "start", "varDef", 
		"variableInst", "inst", "variableDec", "dec", "assignment", "forInst", 
		"ifBlock", "elseBlock", "conditionalBlock", "loopBlock", "whileBlock", 
		"forBlock", "read", "write", "breakStatement", "continueStatement", "expr", 
		"atom"
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
			setState(68);
			programBlocks();
			setState(69);
			match(END);
			setState(70);
			match(T__0);
			setState(71);
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
			setState(73);
			start();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(74);
				varDef();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(80);
				function();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(BEGIN);
			setState(87);
			statements();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(88);
				statements();
				}
				}
				setState(93);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public FuncAssignmentContext funcAssignment() {
			return getRuleContext(FuncAssignmentContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				procedure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				forInst();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				ifBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				elseBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				whileBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				forBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				read();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				write();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(104);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				continueStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				funcAssignment();
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
		public FuncParamDecContext funcParamDec() {
			return getRuleContext(FuncParamDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
			setState(109);
			match(FUNCTION);
			setState(110);
			expr(0);
			setState(111);
			match(T__1);
			setState(112);
			funcParamDec();
			setState(113);
			match(T__2);
			setState(114);
			match(T__3);
			setState(115);
			expr(0);
			setState(116);
			match(T__4);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(117);
				varDef();
				}
			}

			setState(120);
			match(BEGIN);
			setState(121);
			functionBlock();
			setState(122);
			match(END);
			setState(123);
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

	public static class FuncAssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAssignment; }
	}

	public final FuncAssignmentContext funcAssignment() throws RecognitionException {
		FuncAssignmentContext _localctx = new FuncAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(VARNAME);
			setState(126);
			match(T__5);
			setState(127);
			functionCall();
			setState(128);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(VARNAME);
			setState(131);
			match(T__1);
			setState(132);
			funcParams();
			setState(133);
			match(T__2);
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

	public static class FuncParamsContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VARNAME);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(136);
				match(T__6);
				setState(137);
				match(VARNAME);
				}
				}
				setState(142);
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

	public static class FuncVarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(P2Parser.VAR, 0); }
		public FuncVarInstContext funcVarInst() {
			return getRuleContext(FuncVarInstContext.class,0);
		}
		public FuncParamDecContext funcParamDec() {
			return getRuleContext(FuncParamDecContext.class,0);
		}
		public FuncVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVarDef; }
	}

	public final FuncVarDefContext funcVarDef() throws RecognitionException {
		FuncVarDefContext _localctx = new FuncVarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcVarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			match(VAR);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(144);
				funcVarInst();
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(147);
				funcParamDec();
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

	public static class FuncVarInstContext extends ParserRuleContext {
		public List<FuncInstContext> funcInst() {
			return getRuleContexts(FuncInstContext.class);
		}
		public FuncInstContext funcInst(int i) {
			return getRuleContext(FuncInstContext.class,i);
		}
		public FuncVarInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVarInst; }
	}

	public final FuncVarInstContext funcVarInst() throws RecognitionException {
		FuncVarInstContext _localctx = new FuncVarInstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcVarInst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					funcInst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FuncInstContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInst; }
	}

	public final FuncInstContext funcInst() throws RecognitionException {
		FuncInstContext _localctx = new FuncInstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			match(VARNAME);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(156);
				match(T__6);
				setState(157);
				match(VARNAME);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__3);
			setState(164);
			expr(0);
			setState(165);
			match(T__7);
			setState(166);
			expr(0);
			setState(167);
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

	public static class FuncParamDecContext extends ParserRuleContext {
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public FuncParamDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamDec; }
	}

	public final FuncParamDecContext funcParamDec() throws RecognitionException {
		FuncParamDecContext _localctx = new FuncParamDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcParamDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				funcDec();
				}
				}
				setState(172); 
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

	public static class FuncDecContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			match(VARNAME);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(175);
				match(T__6);
				setState(176);
				match(VARNAME);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__3);
			setState(183);
			expr(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(184);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			statements();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(188);
				statements();
				}
				}
				setState(193);
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
		enterRule(_localctx, 26, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PROCEDURE);
			setState(195);
			expr(0);
			setState(196);
			match(T__1);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(197);
				variableDec();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T__2);
			setState(204);
			match(T__4);
			setState(205);
			match(BEGIN);
			setState(206);
			statements();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(207);
				statements();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(END);
			setState(214);
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
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(PROGRAM);
			setState(217);
			match(VARNAME);
			setState(218);
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
		enterRule(_localctx, 30, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			match(VAR);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(221);
				variableInst();
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(224);
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
		enterRule(_localctx, 32, RULE_variableInst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 34, RULE_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			match(VARNAME);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(233);
				match(T__6);
				setState(234);
				match(VARNAME);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__3);
			setState(241);
			expr(0);
			setState(242);
			match(T__7);
			setState(243);
			expr(0);
			setState(244);
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
		enterRule(_localctx, 36, RULE_variableDec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					dec();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<TerminalNode> VARNAME() { return getTokens(P2Parser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(P2Parser.VARNAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			match(VARNAME);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(252);
				match(T__6);
				setState(253);
				match(VARNAME);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__3);
			setState(260);
			expr(0);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(261);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(VARNAME);
			setState(265);
			match(T__5);
			setState(266);
			expr(0);
			setState(267);
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
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(VARNAME);
			setState(270);
			match(T__5);
			setState(271);
			expr(0);
			setState(272);
			match(TO);
			setState(273);
			expr(0);
			setState(274);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(P2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(P2Parser.THEN, 0); }
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(IF);
			setState(277);
			expr(0);
			setState(278);
			match(THEN);
			setState(279);
			match(BEGIN);
			setState(280);
			conditionalBlock();
			setState(281);
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
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ELSE);
			setState(284);
			match(BEGIN);
			setState(285);
			conditionalBlock();
			setState(286);
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

	public static class ConditionalBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(288);
				statements();
				}
				}
				setState(293);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			statements();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(295);
				statements();
				}
				}
				setState(300);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(P2Parser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(P2Parser.BEGIN, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(WHILE);
			setState(302);
			expr(0);
			setState(303);
			match(DO);
			setState(304);
			match(BEGIN);
			setState(305);
			loopBlock();
			setState(306);
			match(END);
			setState(307);
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
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(P2Parser.END, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FOR);
			setState(310);
			forInst();
			setState(311);
			match(BEGIN);
			setState(312);
			loopBlock();
			setState(313);
			match(END);
			setState(314);
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
		enterRule(_localctx, 56, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(READ);
			setState(317);
			expr(0);
			setState(318);
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
		enterRule(_localctx, 58, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WRITE);
			setState(321);
			expr(0);
			setState(322);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(P2Parser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(BREAK);
			setState(325);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(P2Parser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CONTINUE);
			setState(328);
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
		public ExprContext el;
		public Token op;
		public ExprContext er;
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
		public ExprContext e;
		public TerminalNode COSINE() { return getToken(P2Parser.COSINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosineExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
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
		public ExprContext el;
		public Token op;
		public ExprContext er;
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
		public ExprContext e;
		public TerminalNode NATLOG() { return getToken(P2Parser.NATLOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NatlogExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SinExprContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public TerminalNode SINE() { return getToken(P2Parser.SINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SqrtExprContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public TerminalNode SQUAREROOT() { return getToken(P2Parser.SQUAREROOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(P2Parser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegateExprContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext e;
		public TerminalNode NOT() { return getToken(P2Parser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpExprContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public TerminalNode EXP() { return getToken(P2Parser.EXP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulDicModExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(P2Parser.MULT, 0); }
		public TerminalNode DIVI() { return getToken(P2Parser.DIVI, 0); }
		public TerminalNode MOD() { return getToken(P2Parser.MOD, 0); }
		public MulDicModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessEqExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessEqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(P2Parser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				((NegateExprContext)_localctx).op = match(MINUS);
				setState(332);
				((NegateExprContext)_localctx).e = expr(17);
				}
				break;
			case EXP:
				{
				_localctx = new ExpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				((ExpExprContext)_localctx).op = match(EXP);
				setState(334);
				((ExpExprContext)_localctx).e = expr(16);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(NOT);
				setState(336);
				((NotExprContext)_localctx).e = expr(15);
				}
				break;
			case SQUAREROOT:
				{
				_localctx = new SqrtExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				((SqrtExprContext)_localctx).op = match(SQUAREROOT);
				setState(338);
				((SqrtExprContext)_localctx).e = expr(14);
				}
				break;
			case NATLOG:
				{
				_localctx = new NatlogExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				((NatlogExprContext)_localctx).op = match(NATLOG);
				setState(340);
				((NatlogExprContext)_localctx).e = expr(13);
				}
				break;
			case SINE:
				{
				_localctx = new SinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				((SinExprContext)_localctx).op = match(SINE);
				setState(342);
				((SinExprContext)_localctx).e = expr(12);
				}
				break;
			case COSINE:
				{
				_localctx = new CosineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				((CosineExprContext)_localctx).op = match(COSINE);
				setState(344);
				((CosineExprContext)_localctx).e = expr(11);
				}
				break;
			case T__1:
			case REAL:
			case BOOL:
			case TRUE:
			case FALSE:
			case VARNAME:
			case NUM:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulDicModExprContext(new ExprContext(_parentctx, _parentState));
						((MulDicModExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(349);
						((MulDicModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVI) | (1L << MOD))) != 0)) ) {
							((MulDicModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						((MulDicModExprContext)_localctx).er = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(352);
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
						setState(353);
						((AddSubExprContext)_localctx).er = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						((EqualsExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(355);
						((EqualsExprContext)_localctx).op = match(T__7);
						setState(356);
						((EqualsExprContext)_localctx).er = expr(9);
						}
						break;
					case 4:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						((LessExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(358);
						((LessExprContext)_localctx).op = match(T__8);
						setState(359);
						((LessExprContext)_localctx).er = expr(8);
						}
						break;
					case 5:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						((GreaterExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(361);
						((GreaterExprContext)_localctx).op = match(T__9);
						setState(362);
						((GreaterExprContext)_localctx).er = expr(7);
						}
						break;
					case 6:
						{
						_localctx = new LessEqExprContext(new ExprContext(_parentctx, _parentState));
						((LessEqExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(364);
						((LessEqExprContext)_localctx).op = match(T__10);
						setState(365);
						((LessEqExprContext)_localctx).er = expr(6);
						}
						break;
					case 7:
						{
						_localctx = new GreaterEqExprContext(new ExprContext(_parentctx, _parentState));
						((GreaterEqExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(367);
						((GreaterEqExprContext)_localctx).op = match(T__11);
						setState(368);
						((GreaterEqExprContext)_localctx).er = expr(5);
						}
						break;
					case 8:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(370);
						((AndExprContext)_localctx).op = match(AND);
						setState(371);
						((AndExprContext)_localctx).er = expr(4);
						}
						break;
					case 9:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						((OrExprContext)_localctx).op = match(OR);
						setState(374);
						((OrExprContext)_localctx).er = expr(3);
						}
						break;
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class ParenAtomContext extends AtomContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NumAtomContext extends AtomContext {
		public TerminalNode NUM() { return getToken(P2Parser.NUM, 0); }
		public NumAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BoolAtomContext extends AtomContext {
		public TerminalNode BOOL() { return getToken(P2Parser.BOOL, 0); }
		public BoolAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanValAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P2Parser.FALSE, 0); }
		public BooleanValAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class RealAtomContext extends AtomContext {
		public TerminalNode REAL() { return getToken(P2Parser.REAL, 0); }
		public RealAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class VarNameAtomContext extends AtomContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public VarNameAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atom);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__1);
				setState(381);
				((ParenAtomContext)_localctx).e = expr(0);
				setState(382);
				match(T__2);
				}
				break;
			case NUM:
				_localctx = new NumAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(NUM);
				}
				break;
			case REAL:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(BOOL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanValAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
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
				_localctx = new VarNameAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
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
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
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
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u018a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3"+
		"\3\3\7\3T\n\3\f\3\16\3W\13\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b"+
		"\3\t\3\t\5\t\u0094\n\t\3\t\5\t\u0097\n\t\3\n\6\n\u009a\n\n\r\n\16\n\u009b"+
		"\3\13\3\13\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\u00ad\n\f\r\f\16\f\u00ae\3\r\3\r\3\r\7\r\u00b4"+
		"\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\7\16\u00c0"+
		"\n\16\f\16\16\16\u00c3\13\16\3\17\3\17\3\17\3\17\7\17\u00c9\n\17\f\17"+
		"\16\17\u00cc\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d3\n\17\f\17\16\17"+
		"\u00d6\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00e1\n"+
		"\21\3\21\5\21\u00e4\n\21\3\22\6\22\u00e7\n\22\r\22\16\22\u00e8\3\23\3"+
		"\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1\13\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\6\24\u00fa\n\24\r\24\16\24\u00fb\3\25\3\25\3\25\7\25\u0101"+
		"\n\25\f\25\16\25\u0104\13\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\7\32\u0124\n\32\f\32\16"+
		"\32\u0127\13\32\3\33\3\33\7\33\u012b\n\33\f\33\16\33\u012e\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u015d\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u017a\n\"\f\"\16\"\u017d\13\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0188\n#\3#\2\3B$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\3\2\61\63\3\2/\60\3\2"+
		"!\"\2\u01a0\2F\3\2\2\2\4K\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\n\177\3\2\2\2"+
		"\f\u0084\3\2\2\2\16\u0089\3\2\2\2\20\u0091\3\2\2\2\22\u0099\3\2\2\2\24"+
		"\u009d\3\2\2\2\26\u00ac\3\2\2\2\30\u00b0\3\2\2\2\32\u00bd\3\2\2\2\34\u00c4"+
		"\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2\2\2\"\u00e6\3\2\2\2$\u00ea\3\2\2"+
		"\2&\u00f9\3\2\2\2(\u00fd\3\2\2\2*\u010a\3\2\2\2,\u010f\3\2\2\2.\u0116"+
		"\3\2\2\2\60\u011d\3\2\2\2\62\u0125\3\2\2\2\64\u0128\3\2\2\2\66\u012f\3"+
		"\2\2\28\u0137\3\2\2\2:\u013e\3\2\2\2<\u0142\3\2\2\2>\u0146\3\2\2\2@\u0149"+
		"\3\2\2\2B\u015c\3\2\2\2D\u0187\3\2\2\2FG\5\4\3\2GH\7\33\2\2HI\7\3\2\2"+
		"IJ\7\2\2\3J\3\3\2\2\2KO\5\36\20\2LN\5 \21\2ML\3\2\2\2NQ\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\32\2\2Y]\5\6\4\2Z\\\5\6\4\2[Z\3"+
		"\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\5\3\2\2\2_]\3\2\2\2`n\5*\26\2a"+
		"n\5\34\17\2bn\5\b\5\2cn\5,\27\2dn\5.\30\2en\5\60\31\2fn\5\66\34\2gn\5"+
		"8\35\2hn\5:\36\2in\5<\37\2jn\5> \2kn\5@!\2ln\5\n\6\2m`\3\2\2\2ma\3\2\2"+
		"\2mb\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2"+
		"\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2op\7\21\2\2pq\5B"+
		"\"\2qr\7\4\2\2rs\5\26\f\2st\7\5\2\2tu\7\6\2\2uv\5B\"\2vx\7\7\2\2wy\5 "+
		"\21\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\32\2\2{|\5\32\16\2|}\7\33\2\2"+
		"}~\7\7\2\2~\t\3\2\2\2\177\u0080\7\66\2\2\u0080\u0081\7\b\2\2\u0081\u0082"+
		"\5\f\7\2\u0082\u0083\7\7\2\2\u0083\13\3\2\2\2\u0084\u0085\7\66\2\2\u0085"+
		"\u0086\7\4\2\2\u0086\u0087\5\16\b\2\u0087\u0088\7\5\2\2\u0088\r\3\2\2"+
		"\2\u0089\u008e\7\66\2\2\u008a\u008b\7\t\2\2\u008b\u008d\7\66\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\17\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7\36\2\2\u0092\u0094"+
		"\5\22\n\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0097\5\26\f\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\21"+
		"\3\2\2\2\u0098\u009a\5\24\13\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\23\3\2\2\2\u009d\u00a2"+
		"\7\66\2\2\u009e\u009f\7\t\2\2\u009f\u00a1\7\66\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\5B\"\2\u00a7"+
		"\u00a8\7\n\2\2\u00a8\u00a9\5B\"\2\u00a9\u00aa\7\7\2\2\u00aa\25\3\2\2\2"+
		"\u00ab\u00ad\5\30\r\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b5\7\66\2\2\u00b1"+
		"\u00b2\7\t\2\2\u00b2\u00b4\7\66\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00bb\5B\"\2\u00ba\u00bc\7\7"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00c1"+
		"\5\6\4\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\5B\"\2\u00c6\u00ca\7\4\2\2\u00c7\u00c9"+
		"\5&\24\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\5"+
		"\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\7\32\2\2\u00d0\u00d4\5\6\4\2\u00d1"+
		"\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\7\33\2\2\u00d8\u00d9\7\7\2\2\u00d9\35\3\2\2\2\u00da\u00db\7 \2"+
		"\2\u00db\u00dc\7\66\2\2\u00dc\u00dd\7\7\2\2\u00dd\37\3\2\2\2\u00de\u00e0"+
		"\7\36\2\2\u00df\u00e1\5\"\22\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9#\3\2\2\2"+
		"\u00ea\u00ef\7\66\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00ee\7\66\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\5B"+
		"\"\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\5B\"\2\u00f6\u00f7\7\7\2\2\u00f7"+
		"%\3\2\2\2\u00f8\u00fa\5(\25\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u0102\7"+
		"\66\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0101\7\66\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\6\2\2\u0106\u0108\5B\"\2\u0107"+
		"\u0109\7\7\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2"+
		"\u010a\u010b\7\66\2\2\u010b\u010c\7\b\2\2\u010c\u010d\5B\"\2\u010d\u010e"+
		"\7\7\2\2\u010e+\3\2\2\2\u010f\u0110\7\66\2\2\u0110\u0111\7\b\2\2\u0111"+
		"\u0112\5B\"\2\u0112\u0113\7.\2\2\u0113\u0114\5B\"\2\u0114\u0115\7-\2\2"+
		"\u0115-\3\2\2\2\u0116\u0117\7\27\2\2\u0117\u0118\5B\"\2\u0118\u0119\7"+
		"\30\2\2\u0119\u011a\7\32\2\2\u011a\u011b\5\62\32\2\u011b\u011c\7\33\2"+
		"\2\u011c/\3\2\2\2\u011d\u011e\7\31\2\2\u011e\u011f\7\32\2\2\u011f\u0120"+
		"\5\62\32\2\u0120\u0121\7\33\2\2\u0121\61\3\2\2\2\u0122\u0124\5\6\4\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\63\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\5\6\4\2\u0129\u012b"+
		"\5\6\4\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\65\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7+\2\2"+
		"\u0130\u0131\5B\"\2\u0131\u0132\7-\2\2\u0132\u0133\7\32\2\2\u0133\u0134"+
		"\5\64\33\2\u0134\u0135\7\33\2\2\u0135\u0136\7\7\2\2\u0136\67\3\2\2\2\u0137"+
		"\u0138\7,\2\2\u0138\u0139\5,\27\2\u0139\u013a\7\32\2\2\u013a\u013b\5\64"+
		"\33\2\u013b\u013c\7\33\2\2\u013c\u013d\7\7\2\2\u013d9\3\2\2\2\u013e\u013f"+
		"\7\34\2\2\u013f\u0140\5B\"\2\u0140\u0141\7\7\2\2\u0141;\3\2\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\u0144\5B\"\2\u0144\u0145\7\7\2\2\u0145=\3\2\2\2"+
		"\u0146\u0147\7\64\2\2\u0147\u0148\7\7\2\2\u0148?\3\2\2\2\u0149\u014a\7"+
		"\65\2\2\u014a\u014b\7\7\2\2\u014bA\3\2\2\2\u014c\u014d\b\"\1\2\u014d\u014e"+
		"\7\60\2\2\u014e\u015d\5B\"\23\u014f\u0150\7\'\2\2\u0150\u015d\5B\"\22"+
		"\u0151\u0152\7\26\2\2\u0152\u015d\5B\"\21\u0153\u0154\7%\2\2\u0154\u015d"+
		"\5B\"\20\u0155\u0156\7&\2\2\u0156\u015d\5B\"\17\u0157\u0158\7#\2\2\u0158"+
		"\u015d\5B\"\16\u0159\u015a\7$\2\2\u015a\u015d\5B\"\r\u015b\u015d\5D#\2"+
		"\u015c\u014c\3\2\2\2\u015c\u014f\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0153"+
		"\3\2\2\2\u015c\u0155\3\2\2\2\u015c\u0157\3\2\2\2\u015c\u0159\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u017b\3\2\2\2\u015e\u015f\f\f\2\2\u015f\u0160\t\2"+
		"\2\2\u0160\u017a\5B\"\r\u0161\u0162\f\13\2\2\u0162\u0163\t\3\2\2\u0163"+
		"\u017a\5B\"\f\u0164\u0165\f\n\2\2\u0165\u0166\7\n\2\2\u0166\u017a\5B\""+
		"\13\u0167\u0168\f\t\2\2\u0168\u0169\7\13\2\2\u0169\u017a\5B\"\n\u016a"+
		"\u016b\f\b\2\2\u016b\u016c\7\f\2\2\u016c\u017a\5B\"\t\u016d\u016e\f\7"+
		"\2\2\u016e\u016f\7\r\2\2\u016f\u017a\5B\"\b\u0170\u0171\f\6\2\2\u0171"+
		"\u0172\7\16\2\2\u0172\u017a\5B\"\7\u0173\u0174\f\5\2\2\u0174\u0175\7\25"+
		"\2\2\u0175\u017a\5B\"\6\u0176\u0177\f\4\2\2\u0177\u0178\7\24\2\2\u0178"+
		"\u017a\5B\"\5\u0179\u015e\3\2\2\2\u0179\u0161\3\2\2\2\u0179\u0164\3\2"+
		"\2\2\u0179\u0167\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016d\3\2\2\2\u0179"+
		"\u0170\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cC\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u017f\7\4\2\2\u017f\u0180\5B\"\2\u0180\u0181\7\5\2\2\u0181"+
		"\u0188\3\2\2\2\u0182\u0188\7\67\2\2\u0183\u0188\7\22\2\2\u0184\u0188\7"+
		"\23\2\2\u0185\u0188\t\4\2\2\u0186\u0188\7\66\2\2\u0187\u017e\3\2\2\2\u0187"+
		"\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0186\3\2\2\2\u0188E\3\2\2\2\37OU]mx\u008e\u0093\u0096\u009b"+
		"\u00a2\u00ae\u00b5\u00bb\u00c1\u00ca\u00d4\u00e0\u00e3\u00e8\u00ef\u00fb"+
		"\u0102\u0108\u0125\u012c\u015c\u0179\u017b\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}