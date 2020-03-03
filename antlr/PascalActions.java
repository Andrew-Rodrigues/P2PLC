import java.util.*;
import javax.management.RuntimeErrorException;

import java.util.Iterator;

//TODO: ADD WRITELN FUNCTIONALITY

public class PascalActions extends P2BaseVisitor<Wrapper>
{

    private Map<String, Wrapper> memory = new HashMap<String, Wrapper>();
    

    @Override
    public Wrapper visitDec(P2Parser.DecContext ctx)
    {

        String type = ctx.expr().getText();
        Wrapper value;
        String id;

        for(int i = 0; i < ctx.VARNAME().size(); i++ )
        {
            //System.out.println(ctx.VARNAME(i));
            id = ctx.VARNAME(i).getText();

            if(type.toLowerCase().equals("real"))
            {
                value = new Wrapper(id, type, 0.0f);
                memory.put(id, value);
            }
            else if(type.toLowerCase().equals("boolean"))
            {
                value = new Wrapper(id, type, false);
                memory.put(id, value);
            }

        }

        //prints the contents of the hashmap
        // for (Map.Entry<String,Wrapper> entry : memory.entrySet())  
        //     System.out.println("Key = " + entry.getKey() + 
        //                      ", Value = " + entry.getValue().floatValue);
   
        return null;
    }

    // @Override
    // public Wrapper visitInstVar(P2Parser.InstVarContext ctx) 
    // {
    //     System.out.println(ctx.expr().getText()); //value of the variable
    //     System.out.println(ctx.VARNAME().getText()); //name of the variable

    //     //TODO: ADD ABILITY TO UPDATE VARIABLES TO VALUES OF OTHER VARIABLES
    //     //TODO: ADD ABILITY TO HANDLE BOOLS

        
    //     // Wrapper val = new Wrapper(ctx.VARNAME().getText(), "real",  Float.parseFloat(ctx.expr().getText()));
    //     // memory.put(val.name, val);
        
    

    //     // for(Map.Entry<String, Wrapper> entry: memory.entrySet())
    //     //     System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue().asFloat());


    //     return null;
    // }

    @Override
    public Wrapper visitAtomExpr(P2Parser.AtomExprContext ctx) {

        String varName = ctx.getText();
        Wrapper val = memory.get(varName);

        //System.out.println(varName + ": " + val);



        return val;
    }

    // @Override
    // public Wrapper visitVarName(P2Parser.VarNameContext ctx) {
        
    //     String varName = ctx.getText();
    //     Wrapper val = memory.get(varName);

    //     //System.out.println(varName+ ": " + val.floatValue);

    //     if(val == null){
    //         throw new RuntimeException("no such variable: " + varName);
    //     }

    //     return val;
    // }

    @Override
    public Wrapper visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    {
        String info = ctx.getParent().getText();
        List<Character> chars = new ArrayList<Character> ();
        List<String> params = new ArrayList<String> ();
    
        //crazy algorithm to extract the import information for the operation to follow
        for(int i = 0; i < info.length(); i++)
        {
            if(info.charAt(i) == ':' || info.charAt(i) == '+' || info.charAt(i) == '-' || info.charAt(i) == ';')
            {
                StringBuilder sb = new StringBuilder(); //buils a string from the chars to be put into string list
                for (Character ch : chars) 
                { 
                    sb.append(ch); 
                } 
                String temp = sb.toString();
                params.add(temp); //adds the word to the list
                chars.clear(); //resets the chars list
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

        if(ctx.op.getType() == P2Parser.PLUS) //if we are adding
        {
            String result = params.get(0);
            Wrapper val = memory.get(result);
            val.floatValue = memory.get(params.get(1)).floatValue + memory.get(params.get(2)).floatValue;
            memory.put(result, val);
        }
        else if(ctx.op.getType() == P2Parser.MINUS) //if we are subtracting
        {
            String result = params.get(0);
            Wrapper val = memory.get(result);
            val.floatValue = memory.get(params.get(1)).floatValue - memory.get(params.get(2)).floatValue;
            memory.put(result, val);
        }
        else
        {
            throw new RuntimeException("unknown operator: " + P2Parser.tokenNames[ctx.op.getType()]);
        }

        System.out.println(memory.get(params.get(0)).floatValue); //prints the result of the operation
        
        return null;
    }


    @Override
    public Wrapper visitWrite(P2Parser.WriteContext ctx)
    {
        String print = ctx.expr().getText();
        print = print.replaceAll("[()]","");

        Wrapper temp = memory.get(print);

        if(temp.type == "real")
        {
            System.out.println(temp.floatValue);
        }
        else if(temp.type == "boolean")
        {
            System.out.println(temp.boolValue);
        } 
        return null;
    }
    

}