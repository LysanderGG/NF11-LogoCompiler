package logomain;

import logogui.LogoFrame;
import logoparsing.LogoLexer;
import logoparsing.LogoParser;
import logoparsing.LogoTreeVisitor;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class LogoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//testParsing();
		ui();
	}
	
	public static void testParsing() {
		ANTLRInputStream input;
		try {
		  input = new ANTLRFileStream("programs/logo-prg.txt");
		  LogoLexer lexer = new LogoLexer(input);
	    	// create a buffer of tokens pulled from the lexer
	    	CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	// create a parser that feeds off the tokens buffer
	    	LogoParser parser = new LogoParser(tokens);
	    	ParseTree tree = parser.programme(); // begin parsing at programme rule
	        System.out.println(tree.toStringTree());
	    } catch (IOException e) {
		   e.printStackTrace();
	    }
	}
	
	public static void ui() {
		LogoFrame logoview = new LogoFrame();
	}
	
}
