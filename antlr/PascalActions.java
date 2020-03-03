import java.util.*;


import javax.management.RuntimeErrorException;



import java.util.Iterator;


public class PascalActions extends P2BaseVisitor<Value>
{

    private Map<String, Value> memory = new HashMap<String, Value>();
    

    @Override
    public Value visitDec(P2Parser.DecContext ctx)
    {

        String type = ctx.expr().getText();
        Value value;
        String id;

        for(int i = 0; i < ctx.VARNAME().size(); i++ )
        {
            //System.out.println(ctx.VARNAME(i));
            id = ctx.VARNAME(i).getText();

            if(type.toLowerCase().equals("real"))
            {
                value = new Value(id, type, 0.0f);
                memory.put(id, value);
            }
            else if(type.toLowerCase().equals("boolean"))
            {
                value = new Value(id, type, false);
                memory.put(id, value);
            }

        }

        //prints the contents of the hashmap
        // for (Map.Entry<String,Value> entry : memory.entrySet())  
        //     System.out.println("Key = " + entry.getKey() + 
        //                      ", Value = " + entry.getValue().realValue);
   
        return null;
    }

    // @Override
    // public Value visitInstVar(P2Parser.InstVarContext ctx) {
    //     //System.out.println(ctx.expr());
    //     Value val = new Value(ctx.VARNAME().getText(), "real",  Float.parseFloat(ctx.expr().getText()));
    //     // for(Map.Entry<String, Value> entry: memory.entrySet())
    //     //     System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue().asFloat());
    //     return memory.put(ctx.VARNAME().getText(), val);
    // }

    @Override
    public Value visitAtomExpr(P2Parser.AtomExprContext ctx) {

        String varName = ctx.getText();
        Value val = memory.get(varName);

        //System.out.println(varName + " yut: " + val);

        return val;
    }

    @Override
    public Value visitVarName(P2Parser.VarNameContext ctx) {
        
        String varName = ctx.getText();
        Value val = memory.get(varName);

        //System.out.println(varName+ ": " + val.floatValue);

        if(val == null){
            throw new RuntimeException("no such variable: " + varName);
        }

        return val;
    }

    @Override
    public Value visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    {
        String info = ctx.getParent().getText();
        List<Character> chars = new ArrayList<Character> ();
        List<String> params = new ArrayList<String> ();
    
        //crazy algorithm to extract the import information for the operation to follow
        for(int i = 0; i < info.length(); i++)
        {
            if(info.charAt(i) == ':' || info.charAt(i) == '+' || info.charAt(i) == '-' || info.charAt(i) == ';')
            {
                StringBuilder sb = new StringBuilder();
                for (Character ch : chars) 
                { 
                    sb.append(ch); 
                } 
                String temp = sb.toString();
                params.add(temp);
                chars.clear();
            }
            else if(info.charAt(i) == '=')
            {
                continue;
            }
            else
            {
                chars.add(info.charAt(i));
            }
        }

        System.out.println(params);

        return null;
    }

}