import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalActions extends P2BaseVisitor<Value>
{

    private Map<String, Value> memory = new HashMap<String, Value>();

    // @Override
    // public Value visitExpoExpr(P2Parser.ExpoExprContext ctx)
    // {
    //     Value left = this.visit(ctx.expr(0));
    //     Value right = this.visit(ctx.expr(1));
    //     return new Value(Math.pow(left.asFloat(), right.asFloat()));
    // }

    @Override
    public Value visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    {

        //Value left = this.visit(ctx.op.expr(0));
        // right = this.visit(ctx.op.expr(1));

        Value dummy = new Value(1.0f);

        // if(ctx.op.getType() == P2Parser.PLUS)
        // {
        //     return new Value(left.asFloat() + right.asFloat());
        // }
        // else if(ctx.op.getType() == P2Parser.MINUS)
        // {
        //     return new Value(left.asFloat() - right.asFloat());
        // }
        // else
        // {
        //     throw new RuntimeException("unknown operator: " + P2Parser.tokenNames[ctx.op.getType()]);
        // }
    
        System.out.println(dummy.asFloat());

        return dummy;
    }

}