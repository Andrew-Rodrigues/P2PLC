// Generated from P2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface P2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link P2Parser#startProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartProgram(P2Parser.StartProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBlocks(P2Parser.ProgramBlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(P2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(P2Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(P2Parser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(P2Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(P2Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#variableInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInst(P2Parser.VariableInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(P2Parser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#variableDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDec(P2Parser.VariableDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(P2Parser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#instVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstVar(P2Parser.InstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#forInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInst(P2Parser.ForInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#instBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstBool(P2Parser.InstBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(P2Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(P2Parser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(P2Parser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(P2Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(P2Parser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(P2Parser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpr(P2Parser.EqualsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cosineExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosineExpr(P2Parser.CosineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(P2Parser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqExpr(P2Parser.GreaterEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code natlogExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatlogExpr(P2Parser.NatlogExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinExpr(P2Parser.SinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtExpr(P2Parser.SqrtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpr(P2Parser.LessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(P2Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negateExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpr(P2Parser.NegateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpr(P2Parser.GreaterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(P2Parser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDicModExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDicModExpr(P2Parser.MulDicModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expoExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoExpr(P2Parser.ExpoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqExpr(P2Parser.LessEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(P2Parser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(P2Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(P2Parser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoExpr(P2Parser.DoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToExpr(P2Parser.ToExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpr(P2Parser.RealExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(P2Parser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanValExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValExpr(P2Parser.BooleanValExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(P2Parser.VariableExprContext ctx);
}