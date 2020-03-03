import java.util.*;
import javax.management.RuntimeErrorException;

public class PascalActions extends P2BaseVisitor<Wrapper>
{

    Map<String, Wrapper> memory = new HashMap<String, Wrapper>();
    Scanner myScanner = new Scanner(System.in);

    @Override
    public Wrapper visitStartProgram(P2Parser.StartProgramContext ctx)
    {
        return super.visitStartProgram(ctx);
    }

    @Override
    public Wrapper visitProgramBlocks(P2Parser.ProgramBlocksContext ctx)
    {
        return super.visitProgramBlocks(ctx);
    }

    @Override
    public Wrapper visitStatements(P2Parser.StatementsContext ctx)
    {
        return super.visitStatements(ctx);
    }

    @Override
    public Wrapper visitStart(P2Parser.StartContext ctx)
    {
        System.out.println("Starting program " + "\"" + ctx.VARNAME() + "\"" + "...");
        return super.visitStart(ctx);
    }

    @Override
    public Wrapper visitAssignment(P2Parser.AssignmentContext ctx)
    {
        String id = ctx.VARNAME().getText();
        Wrapper mapValue = this.visit(ctx.expr());
        memory.put(id, mapValue);
        //System.out.println(id + " was put in table with value: " + mapValue.floatValue);
        return mapValue;
    }

    @Override
    public Wrapper visitVarNameAtom(P2Parser.VarNameAtomContext ctx)
    {
        String id = ctx.getText();
        Wrapper value = memory.get(id);
        if(value == null) 
        {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override
    public Wrapper visitNumAtom(P2Parser.NumAtomContext ctx)
    {
        Wrapper val = new Wrapper("real", Float.parseFloat(ctx.getText()));
        return val;
    }




    //NUMBER EXPRESSIONS
    @Override
    public Wrapper visitNegateExpr(P2Parser.NegateExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper(-value.asFloat());
    }

    
    @Override
    public Wrapper visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("real", left.floatValue + right.floatValue);
    }
      
    
    
    //READ-WRITE FUNCTIONS
    @Override
    public Wrapper visitWrite(P2Parser.WriteContext ctx)
    {
        String print = ctx.expr().getText();
        print = print.replaceAll("[()]","");

        Wrapper temp = memory.get(print);

        if(temp.type.equals("real"))
        {
            System.out.println(temp.floatValue);
        }
        else if(temp.type.equals("boolean"))
        {
            System.out.println(temp.boolValue);
        } 
        return null;
    }

}