import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import java.util.Iterator;


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
<<<<<<< HEAD

        }

        //prints the contents of the hashmap
        for (Map.Entry<String,Value> entry : memory.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue().realValue);
   
        return null;
    }
=======

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
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18

    @Override
    public Value visitInstVar(P2Parser.InstVarContext ctx) {
        Value val = new Value(ctx.expr(1));
        // for(Map.Entry<String, Value> entry: memory.entrySet())
        //     System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue().asFloat());
        return memory.put(ctx.expr(0).getText(), val);
    }

<<<<<<< HEAD
    @Override
    public Value visitAtomExpr(P2Parser.AtomExprContext ctx) {
=======
    //     // String leftName = ctx.expr(0).getText();
    //     // String rightName = ctx.expr(1).getText();

    //     // System.out.println(ctx.getText());
    //     // //System.out.println(rightName);

    //     // Value left = new Value(memory.get(leftName));
    //     // Value right = new Value(memory.get(rightName));

    //     //System.out.println(left);
    //     //System.out.println(right);
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18

        String varName = ctx.getText();

<<<<<<< HEAD
        System.out.println(varName);

        Value val = memory.get(varName);

        if(val == null){
            throw new RuntimeException("no such variable: " + varName);
        }

        return val;
    }
=======
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
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18


}