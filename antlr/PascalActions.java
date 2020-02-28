import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalActions extends P2BaseVisitor<Value>
{

    private Map<String, Value> memory = new HashMap<String, Value>();

    // @Override
    // public Value visitVariableDec(P2Parser.VariableDecContext ctx)
    // {
    //     String id = ctx.atom().getText();

    //     System.out.println(ctx.VARNAME().getText());

    //     Value value = new Value(0.0f);
    //     return memory.put(id, value);
    // }
    


    // @Override
    // public Value visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    // {

    //     // Value left = new Value(visit(ctx.expr(0)));
    //     // Value right = new Value(visit(ctx.expr(1)));


    //     Value dummy = new Value(1.0f);

    //     // if(ctx.op.getType() == P2Parser.PLUS)
    //     // {
    //     //     return new Value(left.asFloat() + right.asFloat());
    //     // }
    //     // else if(ctx.op.getType() == P2Parser.MINUS)
    //     // {
    //     //     return new Value(left.asFloat() - right.asFloat());
    //     // }
    //     // else
    //     // {
    //     //     throw new RuntimeException("unknown operator: " + P2Parser.tokenNames[ctx.op.getType()]);
    //     // }
    
    //     // System.out.println(left.asFloat());
    //     System.out.println(dummy.asFloat());

    //     return dummy;
    // }

}