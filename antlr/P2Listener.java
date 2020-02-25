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
	 * Enter a parse tree produced by {@link P2Parser#realInst}.
	 * @param ctx the parse tree
	 */
	void enterRealInst(P2Parser.RealInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#realInst}.
	 * @param ctx the parse tree
	 */
	void exitRealInst(P2Parser.RealInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#boolInst}.
	 * @param ctx the parse tree
	 */
	void enterBoolInst(P2Parser.BoolInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#boolInst}.
	 * @param ctx the parse tree
	 */
	void exitBoolInst(P2Parser.BoolInstContext ctx);
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
	 * Enter a parse tree produced by {@link P2Parser#realDec}.
	 * @param ctx the parse tree
	 */
	void enterRealDec(P2Parser.RealDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#realDec}.
	 * @param ctx the parse tree
	 */
	void exitRealDec(P2Parser.RealDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#boolDec}.
	 * @param ctx the parse tree
	 */
	void enterBoolDec(P2Parser.BoolDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#boolDec}.
	 * @param ctx the parse tree
	 */
	void exitBoolDec(P2Parser.BoolDecContext ctx);
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
	 * Enter a parse tree produced by {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(P2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(P2Parser.ExprContext ctx);
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