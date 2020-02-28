// Generated from P2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P2Parser}.
 */
public interface P2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link P2Parser#startProgram}.
	 * @param ctx the parse tree
	 */
	void enterStartProgram(P2Parser.StartProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#startProgram}.
	 * @param ctx the parse tree
	 */
	void exitStartProgram(P2Parser.StartProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlocks(P2Parser.ProgramBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlocks(P2Parser.ProgramBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(P2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(P2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(P2Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(P2Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(P2Parser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(P2Parser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(P2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(P2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(P2Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(P2Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#variableInst}.
	 * @param ctx the parse tree
	 */
	void enterVariableInst(P2Parser.VariableInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#variableInst}.
	 * @param ctx the parse tree
	 */
	void exitVariableInst(P2Parser.VariableInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(P2Parser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(P2Parser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#variableDec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(P2Parser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#variableDec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(P2Parser.VariableDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(P2Parser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(P2Parser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#realOrBool}.
	 * @param ctx the parse tree
	 */
	void enterRealOrBool(P2Parser.RealOrBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#realOrBool}.
	 * @param ctx the parse tree
	 */
	void exitRealOrBool(P2Parser.RealOrBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#instVar}.
	 * @param ctx the parse tree
	 */
	void enterInstVar(P2Parser.InstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#instVar}.
	 * @param ctx the parse tree
	 */
	void exitInstVar(P2Parser.InstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#forInst}.
	 * @param ctx the parse tree
	 */
	void enterForInst(P2Parser.ForInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#forInst}.
	 * @param ctx the parse tree
	 */
	void exitForInst(P2Parser.ForInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#instBool}.
	 * @param ctx the parse tree
	 */
	void enterInstBool(P2Parser.InstBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#instBool}.
	 * @param ctx the parse tree
	 */
	void exitInstBool(P2Parser.InstBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(P2Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(P2Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(P2Parser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(P2Parser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(P2Parser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(P2Parser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(P2Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(P2Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(P2Parser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(P2Parser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(P2Parser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(P2Parser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpr(P2Parser.EqualsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpr(P2Parser.EqualsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosineExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosineExpr(P2Parser.CosineExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosineExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosineExpr(P2Parser.CosineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(P2Parser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(P2Parser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqExpr(P2Parser.GreaterEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqExpr(P2Parser.GreaterEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code natlogExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNatlogExpr(P2Parser.NatlogExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code natlogExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNatlogExpr(P2Parser.NatlogExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSinExpr(P2Parser.SinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSinExpr(P2Parser.SinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(P2Parser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(P2Parser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(P2Parser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(P2Parser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negateExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpr(P2Parser.NegateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negateExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpr(P2Parser.NegateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpr(P2Parser.GreaterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpr(P2Parser.GreaterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDicModExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDicModExpr(P2Parser.MulDicModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDicModExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDicModExpr(P2Parser.MulDicModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expoExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpoExpr(P2Parser.ExpoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expoExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpoExpr(P2Parser.ExpoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(P2Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(P2Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessEqExpr(P2Parser.LessEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessEqExpr(P2Parser.LessEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(P2Parser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(P2Parser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(P2Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(P2Parser.AtomContext ctx);
}