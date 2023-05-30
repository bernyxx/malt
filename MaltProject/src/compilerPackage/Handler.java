/*
package compilerPackage;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import compilerPackage.util.VarDescriptor;

public class Handler {
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int UNDECLARED_VAR_ERROR = 2;
	public static int DECLARED_VAR_ERROR = 3;
	public static int INC_ERROR = 4;
	public static int MISS_INC_ERROR = 5;
	public static int DIV_BY_ZERO_ERROR	= 6;
	
	Hashtable<String, VarDescriptor> symbolTable;
	// ******
	List<String> errorList;
	TokenStream input;
	
	// ******
	public Handler (TokenStream input) {
		this.input = input;
		symbolTable = new Hashtable<String, VarDescriptor>(101);
		errorList = new ArrayList<String>();
	}
	
	// ******
	public List<String> getErrorList(){
		return  errorList;
	}

	// ***** gestione errori lessicali e sintattici
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == MaltLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else 
			errMsg = "Syntax Error " + SYNTAX_ERROR;

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: " +
					" on token '" + tk.getText() + "'";
//		errMsg += "\n" + hdr + "\n**********\n" + msg;
		errorList.add(errMsg);
	}

	// ***** gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String errMsg;
		// i primi due casi non dovrebbero mai avvenire... ma giusto in caso...
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code; 
	
		if (tk == null)
			tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == UNDECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' is undeclared";
		else if (code == DECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' has been already declared";
		else if (code == INC_ERROR)
			errMsg += "Cannot use '++' or '--' before and after the variable '" + tk.getText() + "'";
		else if (code == MISS_INC_ERROR)
			errMsg += "Missing '++' or '--' before or after the variable '" + tk.getText() + "'";
		else if (code == DIV_BY_ZERO_ERROR)
			errMsg += "Division by 0";

		errorList.add(errMsg);
	}
	

	public void declareVar (Token t, Token v) {
		if (t!=null && v!=null) {
			String name = v.getText();
			VarDescriptor vd = new VarDescriptor(name, t.getText());
			if (symbolTable.containsKey(name))
				myErrorHandler(DECLARED_VAR_ERROR, v);
			else {
				symbolTable.putIfAbsent(name, vd);
				System.out.println("Hai appena dichiarato:" + name + 
										" di tipo "+t.getText());
			}
		}
	}

	
	public void checkIncDec (Token o1, Token o2, Token id) {
		if (o1 != null && o2 != null)
			myErrorHandler(INC_ERROR, id);
		else if (o1 == null && o2 == null )
			myErrorHandler(MISS_INC_ERROR, id);
	}


	// ****
	public boolean checkReference(Token var) {
		if (var!=null) {
			String name = var.getText();
			if (!symbolTable.containsKey(name))
				myErrorHandler(UNDECLARED_VAR_ERROR, var);
			else return true;
		}
		return false;		
	}


	public void assignValue(Token n, float v) {
		if (n != null && checkReference(n)) {
			String name = n.getText();
			VarDescriptor vd = symbolTable.get(name);
			if (vd != null)
				vd.value = v;
			System.out.println("Hai assegnato il valore " + v + " alla variabile " + name);
		}
	}

	// *****
	public float getVarValue(Token x) {
		if (x != null && checkReference(x)) {
			String name = x.getText();
			VarDescriptor vd = symbolTable.get(name);
			if (vd != null)
				return vd.value;
		}
		return 0;
	}


	public float convertToFloat(Token n) {
		if (n != null)
			return Float.parseFloat(n.getText());
		return 0;
	}

	public float calculateAdd(float t1, Token op, float t2) {
		float res = t1;
		if (op != null) {
			if (op.getText().equals("+"))
				res = t1+t2;
			else
				res = t1-t2;
		}
			
		return res;
	}


	public float calculateMul(float f1, Token op, float f2) {
		float res = f1;
		if (op != null) {
			if (op.getText().equals("*"))
				res = f1*f2;
			else if (f2 != 0)
				res = f1/f2;
			else 
				myErrorHandler(DIV_BY_ZERO_ERROR, op);
		}
			
		return res;
	}

}
*/