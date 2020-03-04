import java.util.*;
import javax.management.RuntimeErrorException;

public class PascalActions extends P2BaseVisitor<Wrapper>
{

    Map<String, Wrapper> memory = new HashMap<String, Wrapper>();
    Scanner myScanner = new Scanner(System.in);
    boolean ifBool = false;
    boolean elseBool = false;
    boolean continueVal = false;
    boolean breakVal = false;

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
    public Wrapper visitVarDef(P2Parser.VarDefContext ctx)
    {
        //System.out.println("At VarDef");
        return super.visitVarDef(ctx);
    }

    @Override
    public Wrapper visitVariableInst(P2Parser.VariableInstContext ctx)
    {
        //System.out.println("At VariableInst");
        return super.visitVariableInst(ctx);
    }

    @Override
    public Wrapper visitInst(P2Parser.InstContext ctx)
    {
        //System.out.println("At Inst");
        String group = ctx.getText();
        String type = ctx.expr(0).getText();
        String value = ctx.expr(1).getText();

        List<Character> chars = new ArrayList<Character> ();
        List<String> variables = new ArrayList<String> ();

        for(int i = 0; i < group.length(); i++)
        {
            if(group.charAt(i) == ',' || group.charAt(i) == ':')
            {
                StringBuilder sb = new StringBuilder(); //builds a string from the chars to be put into string list
                for (Character ch : chars) 
                { 
                    sb.append(ch); 
                } 
                String temp = sb.toString();
                variables.add(temp); //adds the word to the list
                chars.clear(); //resets the chars list
            }
            else
            {
                chars.add(group.charAt(i));
            }
        }

        for (String temp : variables) 
        {
            if(type.toLowerCase().equals("real"))
            {   
                Wrapper mapValue = new Wrapper("real", Float.parseFloat(value));
                memory.put(temp, mapValue);
            }
            else if(type.toLowerCase().equals("boolean"))
            {
                Wrapper mapValue = new Wrapper("boolean", Boolean.parseBoolean(value));
                memory.put(temp, mapValue);
            }
            
        }
        

        return super.visitInst(ctx);
    }

    @Override
    public Wrapper visitVariableDec(P2Parser.VariableDecContext ctx)
    {
        //System.out.println("At VariableDec");
        return super.visitVariableDec(ctx);
    }

    @Override
    public Wrapper visitDec(P2Parser.DecContext ctx)
    {
        //System.out.println("At Dec");
        String group = ctx.getText();
        String type = ctx.expr().getText();

        List<Character> chars = new ArrayList<Character> ();
        List<String> variables = new ArrayList<String> ();

        for(int i = 0; i < group.length(); i++)
        {
            if(group.charAt(i) == ',' || group.charAt(i) == ':')
            {
                StringBuilder sb = new StringBuilder(); //builds a string from the chars to be put into string list
                for (Character ch : chars) 
                { 
                    sb.append(ch); 
                } 
                String temp = sb.toString();
                variables.add(temp); //adds the word to the list
                chars.clear(); //resets the chars list
            }
            else
            {
                chars.add(group.charAt(i));
            }
        }

        for (String temp : variables) 
        {
            if(type.toLowerCase().equals("real"))
            {   
                Wrapper mapValue = new Wrapper("real", 0.0f);
                memory.put(temp, mapValue);
            }
            else if(type.toLowerCase().equals("boolean"))
            {
                Wrapper mapValue = new Wrapper("boolean", false);
                memory.put(temp, mapValue);
            }
            
        }

        return null;
    }

    @Override
    public Wrapper visitAssignment(P2Parser.AssignmentContext ctx)
    {
        String id = ctx.VARNAME().getText();
        Wrapper mapValue = this.visit(ctx.expr());
        memory.put(id, mapValue);
        //System.out.println(id + " was put in table with value: " + mapValue.floatValue);
        //System.out.println(id + " was put in table with value: " + mapValue.boolValue);
        return mapValue;
    }


    //================= ATOM FUNCTIONS ====================//
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

    @Override
    public Wrapper visitParenAtom(P2Parser.ParenAtomContext ctx)
    {
        return this.visit(ctx.e);
    }

    @Override
    public Wrapper visitBooleanValAtom(P2Parser.BooleanValAtomContext ctx)
    {
        Wrapper val = new Wrapper("boolean", Boolean.parseBoolean(ctx.getText()));
        return val;
    }






    //================= NUMBER FUNCTIONS ====================//
    @Override
    public Wrapper visitNegateExpr(P2Parser.NegateExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", -value.floatValue);
    }

    @Override
    public Wrapper visitSqrtExpr(P2Parser.SqrtExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", (float)(Math.sqrt(value.floatValue)));
    }

    @Override
    public Wrapper visitNatlogExpr(P2Parser.NatlogExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", (float)(Math.log(value.floatValue)));
    }

    @Override
    public Wrapper visitExpExpr(P2Parser.ExpExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", (float)(Math.exp(value.floatValue)));
    }

    @Override
    public Wrapper visitSinExpr(P2Parser.SinExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", (float)(Math.sin(value.floatValue)));
    }

    @Override
    public Wrapper visitCosineExpr(P2Parser.CosineExprContext ctx)
    {
        Wrapper value = this.visit(ctx.e);
        return new Wrapper("real", (float)(Math.cos(value.floatValue)));
    }


    @Override
    public Wrapper visitAddSubExpr(P2Parser.AddSubExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        if(ctx.op.getType() == P2Parser.PLUS)
        {
            return new Wrapper("real", left.floatValue + right.floatValue);
        }
        else if(ctx.op.getType() == P2Parser.MINUS)
        {
            return new Wrapper("real", left.floatValue - right.floatValue);
        }
        else
        {
            throw new RuntimeException("unknown operator: " + P2Parser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Wrapper visitMulDicModExpr(P2Parser.MulDicModExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        if(ctx.op.getType() == P2Parser.MULT)
        {
            return new Wrapper("real", left.floatValue * right.floatValue);
        }
        else if(ctx.op.getType() == P2Parser.DIVI)
        {
            return new Wrapper("real", left.floatValue / right.floatValue);
        }
        else if(ctx.op.getType() == P2Parser.MOD)
        {
            return new Wrapper("real", left.floatValue % right.floatValue);
        }
        else
        {
            throw new RuntimeException("unknown operator: " + P2Parser.tokenNames[ctx.op.getType()]);
        }
    }
      
    
    //================= BOOLEAN FUNCTIONS ====================//
    @Override
    public Wrapper visitAndExpr(P2Parser.AndExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.boolValue && right.boolValue);
    }

    @Override
    public Wrapper visitOrExpr(P2Parser.OrExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.boolValue || right.boolValue);
    }

    @Override
    public Wrapper visitNotExpr(P2Parser.NotExprContext ctx)
    {
        Wrapper val = this.visit(ctx.e);

        return new Wrapper("boolean", !val.boolValue);
    }

    @Override
    public Wrapper visitGreaterExpr(P2Parser.GreaterExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.floatValue > right.floatValue);
    }

    @Override
    public Wrapper visitLessExpr(P2Parser.LessExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.floatValue < right.floatValue);
    }
    
    @Override
    public Wrapper visitGreaterEqExpr(P2Parser.GreaterEqExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.floatValue >= right.floatValue);
    }

    @Override
    public Wrapper visitLessEqExpr(P2Parser.LessEqExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.floatValue <= right.floatValue);
    }

    @Override
    public Wrapper visitEqualsExpr(P2Parser.EqualsExprContext ctx)
    {
        Wrapper left = this.visit(ctx.el);
        Wrapper right = this.visit(ctx.er);

        return new Wrapper("boolean", left.floatValue == right.floatValue);
    }


    ////================= READ-WRITE FUNCTIONS ======================//
    @Override
    public Wrapper visitWrite(P2Parser.WriteContext ctx)
    {
        String print = ctx.expr().getText();
        print = print.replaceAll("[()]","");

        Wrapper temp = memory.get(print);

        if(temp.type.toLowerCase().equals("real"))
        {
            System.out.println(temp.floatValue);
        }
        else if(temp.type.toLowerCase().equals("boolean"))
        {
            System.out.println(temp.boolValue);
        }

        return null;
    }
    
    @Override
    public Wrapper visitRead(P2Parser.ReadContext ctx) 
    {
        String var = ctx.expr().getText();
        var = var.replaceAll("[()]", "");

        //System.out.println(var);

        Wrapper temp = memory.get(var);

        if(temp.type.toLowerCase().equals("real"))
        {
           float newFloat = myScanner.nextFloat();
           temp.floatValue = newFloat;
        }
        if(temp.type.toLowerCase().equals("boolean"))
        {
            boolean newBool = myScanner.nextBoolean();
            temp.boolValue = newBool;
        } 

        memory.put(var, temp);

        return null;
    }


    //================= LOOPS ====================//
    @Override
    public Wrapper visitLoopBlock(P2Parser.LoopBlockContext ctx)
    {
        return super.visitLoopBlock(ctx);
    }

    @Override
    public Wrapper visitBreakStatement(P2Parser.BreakStatementContext ctx)
    {
        breakVal = true;
        return super.visitBreakStatement(ctx);
    }

    @Override
    public Wrapper visitContinueStatement(P2Parser.ContinueStatementContext ctx)
    {
        continueVal = true;
        return super.visitContinueStatement(ctx);
    }

    @Override
    public Wrapper visitWhileBlock(P2Parser.WhileBlockContext ctx)
    {
        Wrapper value = this.visit(ctx.expr());

        while(value.boolValue) 
        {

            if(continueVal)
            {
                continueVal = false;
                continue;
            }

            else if(breakVal)
            {
                breakVal = false;
                break;
            }

            else
            {
                this.visit(ctx.loopBlock()); //evaluate the code block
            }
            
            value = this.visit(ctx.expr()); //re-evaluate the expression
        }

        return null;
    }

    @Override
    public Wrapper visitForBlock(P2Parser.ForBlockContext ctx)
    {
        this.visit(ctx.forInst());

        String id = ctx.forInst().VARNAME().getText();

        for(float i = memory.get(id).floatValue; i < memory.get("finish").floatValue; i++)
        {
            if(continueVal)
            {
                continueVal = false;
                memory.get(id).floatValue++;
                continue;
            }

            else if(breakVal)
            {
                breakVal = false;
                break;
            }

            else
            {
                this.visit(ctx.loopBlock()); //evaluate the code block
                memory.get(id).floatValue++;
            }
        }

        return null;
    }

    @Override
    public Wrapper visitForInst(P2Parser.ForInstContext ctx)
    {
        String id = ctx.VARNAME().getText();
        Wrapper start = this.visit(ctx.expr(0)); //gets the starting value of the loop
        Wrapper finish = this.visit(ctx.expr(1)); //gets the ending value of the loop

        memory.put(id, start);
        memory.put("finish", finish); //stores the final loop varaible value in the map

        return null;
    }

    //================= IF-ELSE STATMENTS ====================//
    @Override
    public Wrapper visitIfBlock(P2Parser.IfBlockContext ctx)
    {
        Wrapper value = this.visit(ctx.expr());

        //System.out.println("visited if");

        ifBool = value.boolValue;

        if(ifBool)
        {
            this.visit(ctx.conditionalBlock());
            ifBool = false;
        }
        else
        {
            elseBool = true;
            return null;
        }

        return null;
    }

    @Override
    public Wrapper visitElseBlock(P2Parser.ElseBlockContext ctx)
    {
        //System.out.println("visited else");
        if(elseBool)
        {
            this.visit(ctx.conditionalBlock());
            elseBool = false;
        }
        else
        {
            return null;
        }
        return null;
    }
    

    //================= FUNCTIONS AND PROCEDURES ====================//
    @Override
    public Wrapper visitFunction(P2Parser.FunctionContext ctx)
    {
        //System.out.println("visited function");


        return null;
    }
    

}