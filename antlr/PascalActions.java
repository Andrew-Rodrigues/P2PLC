import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalActions extends P2BaseVisitor<Value>
{

    private Map<String, Value> memory = new HashMap<String, Value>();

    @Override
    public Value visitDec(P2Parser.DecContext ctx)
    {
        //String id = ctx.VARNAME(0).getText();
        String type = ctx.expr().getText();
        Value value;
        String id;

        for(int i = 0; i < ctx.VARNAME().size(); i++ )
        {
            id = ctx.VARNAME(i).getText();

            if(type.equals("real"))
            {
                value = new Value(id, type, 0.0f);
                memory.put(id, value);
            }
            else if(type.equals("boolean"))
            {
                value = new Value(id, type, false);
                memory.put(id, value);
            }

        }

        //prints the contents of the hashmap
        for (Map.Entry<String,Value> entry : memory.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue().realValue); 
    
        return null;
    }

    
    // @Override
    // public Value visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    // {

    //     // Value left = new Value(visit(ctx.expr(0)));
    //     // Value right = new Value(visit(ctx.expr(1)));

    //     // String leftName = ctx.expr(0).getText();
    //     // String rightName = ctx.expr(1).getText();

    //     // System.out.println(ctx.getText());
    //     // //System.out.println(rightName);

    //     // Value left = new Value(memory.get(leftName));
    //     // Value right = new Value(memory.get(rightName));

    //     //System.out.println(left);
    //     //System.out.println(right);

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
    //     //System.out.println(dummy);

    //     return dummy;
    // }

}