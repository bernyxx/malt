package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

//import compilerPackage.Handler;
import compilerPackage.MaltLexer;
import compilerPackage.MaltParser;

public class ParserTester {

	static MaltParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = ".\\resources\\input.file";

		try {
			System.out.println("Parsing con ANTLR lexer");
			System.out.println("-----------------------");
			

			// 1.Istanzio il lexer passandogli il documento da analizzare
			MaltLexer lexer = new MaltLexer(
					new ANTLRReaderStream(
							new FileReader(fileIn)));

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
			tokens = new CommonTokenStream(lexer);

			// 3.Istanzio il parser
			parser = new MaltParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseJava();

			// 5.controllo i risultati
			/*
			 * Handler h = parser.getHandler();
			 * if (h.getErrorList().size() == 0)
			 * System.out.println ("Parsing terminato con successo");
			 * else
			 * for (int i=0; i<h.getErrorList().size(); i++)
			 * System.err.println ("Errore " + (i+1) +
			 * ":\t" + h.getErrorList().get(i)+"");
			 */
		} catch (Exception e) {
			System.out.println("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

	}

}
