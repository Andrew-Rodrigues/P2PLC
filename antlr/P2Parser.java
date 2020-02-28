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
		RULE_expr = 20, RULE_atom = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"startProgram", "programBlocks", "statements", "function", "procedure", 
			"start", "varDef", "variableInst", "inst", "variableDec", "dec", "instVar", 
			"forInst", "instBool", "ifBlock", "elseBlock", "whileBlock", "forBlock", 
			"read", "write", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "':'", "';'", "','", "'='", "':='", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "DIV", "PROCEDURE", "FUNCTION", "REAL", "BOOL", 
			"OR", "AND", "NOT", "IF", "THEN", "ELSE", "BEGIN", "END", "READ", "WRITE", 
			"VAR", "ARRAY", "PROGRAM", "TRUE", "FALSE", "SINE", "COSINE", "SQUAREROOT", 
			"NATLOG", "EXPO", "CASE", "OF", "CONST", "WHILE", "FOR", "DO", "TO", 
			"PLUS", "MINUS", "VARNAME", "NUM", "COMMENtLine", "CommentChunk", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitStartProgram(this);
			else return visitor.visitChildren(this);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterProgramBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitProgramBlocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitProgramBlocks(this);
			else return visitor.visitChildren(this);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(56);
				function();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(BEGIN);
			setState(63);
			statements();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(64);
				statements();
				}
				}
				setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				instVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				instBool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				procedure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				forInst();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				elseBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				whileBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				forBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FUNCTION);
			setState(84);
			expr(0);
			setState(85);
			match(T__1);
			setState(86);
			variableDec();
			setState(87);
			match(T__2);
			setState(88);
			match(T__3);
			setState(89);
			expr(0);
			setState(90);
			match(T__4);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(91);
				varDef();
				}
			}

			setState(94);
			match(BEGIN);
			setState(95);
			statements();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(96);
				statements();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(END);
			setState(103);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PROCEDURE);
			setState(106);
			expr(0);
			setState(107);
			match(T__1);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(108);
				variableDec();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__2);
			setState(115);
			match(T__4);
			setState(116);
			match(BEGIN);
			setState(117);
			statements();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(118);
				statements();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(END);
			setState(125);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PROGRAM);
			setState(128);
			expr(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			match(VAR);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132);
				variableInst();
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(135);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitVariableInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInstContext variableInst() throws RecognitionException {
		VariableInstContext _localctx = new VariableInstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableInst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(138);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			match(VARNAME);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(144);
				match(T__5);
				setState(145);
				match(VARNAME);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__3);
			setState(152);
			expr(0);
			setState(153);
			match(T__6);
			setState(154);
			expr(0);
			setState(155);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitVariableDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitVariableDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDecContext variableDec() throws RecognitionException {
		VariableDecContext _localctx = new VariableDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157);
					dec();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			match(VARNAME);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(163);
				match(T__5);
				setState(164);
				match(VARNAME);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__3);
			setState(171);
			expr(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(172);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitInstVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstVarContext instVar() throws RecognitionException {
		InstVarContext _localctx = new InstVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(VARNAME);
			setState(176);
			match(T__7);
			setState(177);
			expr(0);
			setState(178);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterForInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitForInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitForInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			expr(0);
			setState(181);
			match(T__7);
			setState(182);
			expr(0);
			setState(183);
			expr(0);
			setState(184);
			expr(0);
			setState(185);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitInstBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstBoolContext instBool() throws RecognitionException {
		InstBoolContext _localctx = new InstBoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(VARNAME);
			setState(188);
			match(T__7);
			setState(189);
			expr(0);
			setState(190);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IF);
			setState(193);
			expr(0);
			setState(194);
			match(THEN);
			setState(195);
			match(BEGIN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(196);
				statements();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ELSE);
			setState(205);
			match(BEGIN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(206);
				statements();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(WHILE);
			setState(215);
			expr(0);
			setState(216);
			expr(0);
			setState(217);
			match(BEGIN);
			setState(218);
			statements();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(219);
				statements();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(END);
			setState(226);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FOR);
			setState(229);
			forInst();
			setState(230);
			match(BEGIN);
			setState(231);
			statements();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << REAL) | (1L << BOOL) | (1L << NOT) | (1L << IF) | (1L << ELSE) | (1L << READ) | (1L << WRITE) | (1L << TRUE) | (1L << FALSE) | (1L << SINE) | (1L << COSINE) | (1L << SQUAREROOT) | (1L << NATLOG) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << TO) | (1L << MINUS) | (1L << VARNAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(232);
				statements();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(END);
			setState(239);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(READ);
			setState(242);
			match(T__1);
			setState(243);
			expr(0);
			setState(244);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(WRITE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterEqualsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitEqualsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitEqualsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosineExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COSINE() { return getToken(P2Parser.COSINE, 0); }
		public CosineExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterCosineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitCosineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitCosineExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterGreaterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitGreaterEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitGreaterEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatlogExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NATLOG() { return getToken(P2Parser.NATLOG, 0); }
		public NatlogExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterNatlogExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitNatlogExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitNatlogExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SINE() { return getToken(P2Parser.SINE, 0); }
		public SinExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterSinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitSinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitSinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUAREROOT() { return getToken(P2Parser.SQUAREROOT, 0); }
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterSqrtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitSqrtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitSqrtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterLessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitLessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitLessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(P2Parser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(P2Parser.MINUS, 0); }
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterNegateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitNegateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterGreaterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitGreaterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(P2Parser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterMulDicModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitMulDicModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitMulDicModExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterExpoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitExpoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitExpoExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterLessEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitLessEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitLessEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(P2Parser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(254);
				((NegateExprContext)_localctx).op = match(MINUS);
				setState(255);
				expr(17);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(NOT);
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
				expr(14);
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
				expr(13);
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
				expr(12);
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
				expr(11);
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
				setState(266);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpoExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(270);
						((ExpoExprContext)_localctx).op = match(EXPO);
						setState(271);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new MulDicModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(273);
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
						setState(274);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(276);
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
						setState(277);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(279);
						((EqualsExprContext)_localctx).op = match(T__6);
						setState(280);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(282);
						((LessExprContext)_localctx).op = match(T__11);
						setState(283);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(285);
						((GreaterExprContext)_localctx).op = match(T__12);
						setState(286);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new LessEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(288);
						((LessEqExprContext)_localctx).op = match(T__13);
						setState(289);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(291);
						((GreaterEqExprContext)_localctx).op = match(T__14);
						setState(292);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						((AndExprContext)_localctx).op = match(AND);
						setState(295);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						((OrExprContext)_localctx).op = match(OR);
						setState(298);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(303);
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
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToAtomContext extends AtomContext {
		public TerminalNode TO() { return getToken(P2Parser.TO, 0); }
		public ToAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenAtomContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterParenAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitParenAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitParenAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAtomContext extends AtomContext {
		public TerminalNode NUM() { return getToken(P2Parser.NUM, 0); }
		public NumAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterNumAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitNumAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitNumAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarnameAtomContext extends AtomContext {
		public TerminalNode VARNAME() { return getToken(P2Parser.VARNAME, 0); }
		public VarnameAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterVarnameAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitVarnameAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitVarnameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAtomContext extends AtomContext {
		public TerminalNode BOOL() { return getToken(P2Parser.BOOL, 0); }
		public BoolAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitBoolAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanValAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P2Parser.FALSE, 0); }
		public BooleanValAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterBooleanValAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitBooleanValAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitBooleanValAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoAtomContext extends AtomContext {
		public TerminalNode DO() { return getToken(P2Parser.DO, 0); }
		public DoAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterDoAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitDoAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitDoAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealAtomContext extends AtomContext {
		public TerminalNode REAL() { return getToken(P2Parser.REAL, 0); }
		public RealAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).enterRealAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2Listener ) ((P2Listener)listener).exitRealAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2Visitor ) return ((P2Visitor<? extends T>)visitor).visitRealAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__1);
				setState(305);
				expr(0);
				setState(306);
				match(T__2);
				}
				break;
			case NUM:
				_localctx = new NumAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(NUM);
				}
				break;
			case DO:
				_localctx = new DoAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(DO);
				}
				break;
			case TO:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(TO);
				}
				break;
			case REAL:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(BOOL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanValAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
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
				_localctx = new VarnameAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(314);
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
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3"+
		"\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\5\3\5\3\5\7"+
		"\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\5\b\u0088\n\b\3\b\5\b\u008b\n\b\3\t\6\t\u008e\n\t\r\t"+
		"\16\t\u008f\3\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\6\13\u00a1\n\13\r\13\16\13\u00a2\3\f\3\f\3\f\7\f\u00a8"+
		"\n\f\f\f\16\f\u00ab\13\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5\13\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00df\n\22\f\22\16\22\u00e2\13\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00ec\n\23\f\23\16\23\u00ef\13\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010e\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u012e\n\26\f\26\16\26\u0131\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013e\n\27"+
		"\3\27\2\3*\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\13"+
		"\r\3\2\62\63\3\2$%\2\u015c\2.\3\2\2\2\4\63\3\2\2\2\6S\3\2\2\2\bU\3\2\2"+
		"\2\nk\3\2\2\2\f\u0081\3\2\2\2\16\u0085\3\2\2\2\20\u008d\3\2\2\2\22\u0091"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00a4\3\2\2\2\30\u00b1\3\2\2\2\32\u00b6\3"+
		"\2\2\2\34\u00bd\3\2\2\2\36\u00c2\3\2\2\2 \u00ce\3\2\2\2\"\u00d8\3\2\2"+
		"\2$\u00e6\3\2\2\2&\u00f3\3\2\2\2(\u00f9\3\2\2\2*\u010d\3\2\2\2,\u013d"+
		"\3\2\2\2./\5\4\3\2/\60\7\36\2\2\60\61\7\3\2\2\61\62\7\2\2\3\62\3\3\2\2"+
		"\2\63\67\5\f\7\2\64\66\5\16\b\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\35\2\2AE\5\6\4\2BD\5\6\4\2CB"+
		"\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HT\5\30\r\2"+
		"IT\5\34\17\2JT\5\n\6\2KT\5\b\5\2LT\5\32\16\2MT\5\36\20\2NT\5 \21\2OT\5"+
		"\"\22\2PT\5$\23\2QT\5&\24\2RT\5(\25\2SH\3\2\2\2SI\3\2\2\2SJ\3\2\2\2SK"+
		"\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2S"+
		"R\3\2\2\2T\7\3\2\2\2UV\7\24\2\2VW\5*\26\2WX\7\4\2\2XY\5\24\13\2YZ\7\5"+
		"\2\2Z[\7\6\2\2[\\\5*\26\2\\^\7\7\2\2]_\5\16\b\2^]\3\2\2\2^_\3\2\2\2_`"+
		"\3\2\2\2`a\7\35\2\2ae\5\6\4\2bd\5\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\36\2\2ij\7\7\2\2j\t\3\2\2\2kl\7\23"+
		"\2\2lm\5*\26\2mq\7\4\2\2np\5\24\13\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\5\2\2uv\7\7\2\2vw\7\35\2\2w{\5\6\4\2xz"+
		"\5\6\4\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~"+
		"\177\7\36\2\2\177\u0080\7\7\2\2\u0080\13\3\2\2\2\u0081\u0082\7#\2\2\u0082"+
		"\u0083\5*\26\2\u0083\u0084\7\7\2\2\u0084\r\3\2\2\2\u0085\u0087\7!\2\2"+
		"\u0086\u0088\5\20\t\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u008b\5\24\13\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\17\3\2\2\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\21\3\2\2\2\u0091"+
		"\u0096\7\64\2\2\u0092\u0093\7\b\2\2\u0093\u0095\7\64\2\2\u0094\u0092\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\5*"+
		"\26\2\u009b\u009c\7\t\2\2\u009c\u009d\5*\26\2\u009d\u009e\7\7\2\2\u009e"+
		"\23\3\2\2\2\u009f\u00a1\5\26\f\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a9"+
		"\7\64\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a8\7\64\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\5*\26\2\u00ae"+
		"\u00b0\7\7\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\27\3\2\2"+
		"\2\u00b1\u00b2\7\64\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\5*\26\2\u00b4"+
		"\u00b5\7\7\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\7\n\2"+
		"\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\5*\26\2\u00bb\u00bc"+
		"\5*\26\2\u00bc\33\3\2\2\2\u00bd\u00be\7\64\2\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c0\5*\26\2\u00c0\u00c1\7\7\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\7\32\2"+
		"\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7\33\2\2\u00c5\u00c9\7\35\2\2\u00c6"+
		"\u00c8\5\6\4\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\36\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d3\7\35"+
		"\2\2\u00d0\u00d2\5\6\4\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\7\36\2\2\u00d7!\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\u00da"+
		"\5*\26\2\u00da\u00db\5*\26\2\u00db\u00dc\7\35\2\2\u00dc\u00e0\5\6\4\2"+
		"\u00dd\u00df\5\6\4\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\36\2\2\u00e4\u00e5\7\7\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7/\2\2"+
		"\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7\35\2\2\u00e9\u00ed\5\6\4\2\u00ea"+
		"\u00ec\5\6\4\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7\36\2\2\u00f1\u00f2\7\7\2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\37\2"+
		"\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\7\5\2\2\u00f7\u00f8"+
		"\7\7\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\7\4\2\2\u00fb"+
		"\u00fc\5*\26\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe\7\7\2\2\u00fe)\3\2\2\2"+
		"\u00ff\u0100\b\26\1\2\u0100\u0101\7\63\2\2\u0101\u010e\5*\26\23\u0102"+
		"\u0103\7\31\2\2\u0103\u010e\5*\26\21\u0104\u0105\7(\2\2\u0105\u010e\5"+
		"*\26\20\u0106\u0107\7)\2\2\u0107\u010e\5*\26\17\u0108\u0109\7&\2\2\u0109"+
		"\u010e\5*\26\16\u010a\u010b\7\'\2\2\u010b\u010e\5*\26\r\u010c\u010e\5"+
		",\27\2\u010d\u00ff\3\2\2\2\u010d\u0102\3\2\2\2\u010d\u0104\3\2\2\2\u010d"+
		"\u0106\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e\u012f\3\2\2\2\u010f\u0110\f\22\2\2\u0110\u0111\7*\2\2\u0111"+
		"\u012e\5*\26\23\u0112\u0113\f\f\2\2\u0113\u0114\t\2\2\2\u0114\u012e\5"+
		"*\26\r\u0115\u0116\f\13\2\2\u0116\u0117\t\3\2\2\u0117\u012e\5*\26\f\u0118"+
		"\u0119\f\n\2\2\u0119\u011a\7\t\2\2\u011a\u012e\5*\26\13\u011b\u011c\f"+
		"\t\2\2\u011c\u011d\7\16\2\2\u011d\u012e\5*\26\n\u011e\u011f\f\b\2\2\u011f"+
		"\u0120\7\17\2\2\u0120\u012e\5*\26\t\u0121\u0122\f\7\2\2\u0122\u0123\7"+
		"\20\2\2\u0123\u012e\5*\26\b\u0124\u0125\f\6\2\2\u0125\u0126\7\21\2\2\u0126"+
		"\u012e\5*\26\7\u0127\u0128\f\5\2\2\u0128\u0129\7\30\2\2\u0129\u012e\5"+
		"*\26\6\u012a\u012b\f\4\2\2\u012b\u012c\7\27\2\2\u012c\u012e\5*\26\5\u012d"+
		"\u010f\3\2\2\2\u012d\u0112\3\2\2\2\u012d\u0115\3\2\2\2\u012d\u0118\3\2"+
		"\2\2\u012d\u011b\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0121\3\2\2\2\u012d"+
		"\u0124\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130+\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5*\26\2\u0134\u0135\7\5\2\2\u0135"+
		"\u013e\3\2\2\2\u0136\u013e\7\65\2\2\u0137\u013e\7\60\2\2\u0138\u013e\7"+
		"\61\2\2\u0139\u013e\7\25\2\2\u013a\u013e\7\26\2\2\u013b\u013e\t\4\2\2"+
		"\u013c\u013e\7\64\2\2\u013d\u0132\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0137"+
		"\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e-\3\2\2\2\31\67=ES^eq{\u0087\u008a"+
		"\u008f\u0096\u00a2\u00a9\u00af\u00c9\u00d3\u00e0\u00ed\u010d\u012d\u012f"+
		"\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}