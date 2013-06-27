import java.io.*;
import org.antlr.runtime.*;

public class CalcRun {

	public static void main(String[] args) throws Exception {
		//InputStream source = new FileInputStream(args[0]);
		//CalcLexer lexer = new CalcLexer(
		  // new ANTLRInputStream(source));
		
                CharStream cs= new ANTLRFileStream(args[0]);
		CalcLexer lexer = new CalcLexer (cs);
            
                CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		parser.prog();
	}

}	 
