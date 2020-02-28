
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        if (args.length == 0) 
        {
            //no file provided to run
        }
        else
        {
            System.out.println("parsing: " + args[0]);

            P2Lexer lexer = new P2Lexer(new ANTLRFileStream(args[0]));
            P2Parser parser = new P2Parser(new CommonTokenStream(lexer));
            ParseTree tree = parser.startProgram();
            PascalActions visitor = new PascalActions();
            visitor.visit(tree);
        }

        
    }
}
