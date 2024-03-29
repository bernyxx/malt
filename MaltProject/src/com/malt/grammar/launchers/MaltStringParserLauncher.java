package com.malt.grammar.launchers;

import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import com.malt.grammar.compiler.MaltHandler;
import com.malt.grammar.compiler.MaltLexer;
import com.malt.grammar.compiler.MaltParser;
import com.malt.grammar.compiler.util.ParserResult;

public class MaltStringParserLauncher {

	static MaltParser parser;

	public ParserResult runParser(String input) {
		CommonTokenStream tokens;

		String result = "";

		ParserResult pr = new ParserResult();
		try {

			// 1.Istanzio il lexer passandogli il documento da analizzare
			MaltLexer lexer = new MaltLexer(
					new ANTLRReaderStream(
							new StringReader(input)));

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
			tokens = new CommonTokenStream(lexer);

			// 3.Istanzio il parser
			parser = new MaltParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseJava();

			// 5.controllo i risultati
			MaltHandler h = parser.getMaltHandler();
			if (h.getErrorList().size() == 0)
				result += "Parsing terminato con successo\n";
			else
				for (int i = 0; i < h.getErrorList().size(); i++)
					// System.err.println("Errore " + (i + 1) +
					// ":\t" + h.getErrorList().get(i) + "");
					result += "Errore " + (i + 1) +
							":\t" + h.getErrorList().get(i) + "\n";

			pr.parserResult = result;
			pr.globalTable = h.globalTable;
			pr.localTables = h.localTables;

			return pr;

		} catch (Exception e) {
			result += "Parsing con ANTLR abortito\n";
			e.printStackTrace();
			pr.parserResult = result;
			return pr;
		}

	}

}
