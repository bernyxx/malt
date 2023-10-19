// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-19 18:42:18

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKQUOTE", "BOLD", "C", "CL", 
		"CLASS", "CM", "CODE", "CODEBLOCK", "COMMENT", "DIGIT", "DO", "EQ", "ESC_SEQ", 
		"EX", "EXPONENT", "FLOAT", "FOR", "FORMATSTRING", "FORMATTEXT", "FUN", 
		"G", "GET", "HA", "HEX_DIGIT", "HL", "HRULE", "I", "IMG", "IN", "INTEGER", 
		"IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", "LINK", "LIST", "LP", 
		"LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", 
		"S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", 
		"SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", 
		"US", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BLOCKQUOTE=4;
	public static final int BOLD=5;
	public static final int C=6;
	public static final int CL=7;
	public static final int CLASS=8;
	public static final int CM=9;
	public static final int CODE=10;
	public static final int CODEBLOCK=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DO=14;
	public static final int EQ=15;
	public static final int ESC_SEQ=16;
	public static final int EX=17;
	public static final int EXPONENT=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int FORMATSTRING=21;
	public static final int FORMATTEXT=22;
	public static final int FUN=23;
	public static final int G=24;
	public static final int GET=25;
	public static final int HA=26;
	public static final int HEX_DIGIT=27;
	public static final int HL=28;
	public static final int HRULE=29;
	public static final int I=30;
	public static final int IMG=31;
	public static final int IN=32;
	public static final int INTEGER=33;
	public static final int IT=34;
	public static final int ITBOLD=35;
	public static final int L=36;
	public static final int LAB=37;
	public static final int LCB=38;
	public static final int LET=39;
	public static final int LETTER=40;
	public static final int LINK=41;
	public static final int LIST=42;
	public static final int LP=43;
	public static final int LSB=44;
	public static final int OCTAL_ESC=45;
	public static final int OLIST=46;
	public static final int QU=47;
	public static final int R=48;
	public static final int RAB=49;
	public static final int RCB=50;
	public static final int RP=51;
	public static final int RSB=52;
	public static final int S1TITLE=53;
	public static final int S2TITLE=54;
	public static final int S3TITLE=55;
	public static final int S4TITLE=56;
	public static final int S5TITLE=57;
	public static final int SE=58;
	public static final int SL=59;
	public static final int ST=60;
	public static final int STRING=61;
	public static final int SUBS=62;
	public static final int SUPS=63;
	public static final int TABLE=64;
	public static final int TEXT=65;
	public static final int TITLE=66;
	public static final int TLIST=67;
	public static final int ULIST=68;
	public static final int UNICODE_ESC=69;
	public static final int US=70;
	public static final int VAR=71;
	public static final int WS=72;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MaltParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MaltParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MaltParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }


		Handler h;
		
		void initHandler () {
		h = new Handler();
		}



	// $ANTLR start "parseJava"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:1: parseJava : ( instrRule[null, \"\"] | functionRule[null] | classRule )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:2: ( ( instrRule[null, \"\"] | functionRule[null] | classRule )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[null, \"\"] | functionRule[null] | classRule )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[null, \"\"] | functionRule[null] | classRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case BLOCKQUOTE:
				case CODEBLOCK:
				case FOR:
				case FORMATTEXT:
				case HRULE:
				case IMG:
				case LAB:
				case LINK:
				case LIST:
				case OLIST:
				case S1TITLE:
				case S2TITLE:
				case S3TITLE:
				case S4TITLE:
				case S5TITLE:
				case TABLE:
				case TEXT:
				case TITLE:
				case TLIST:
				case ULIST:
					{
					alt1=1;
					}
					break;
				case FUN:
					{
					alt1=2;
					}
					break;
				case CLASS:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: instrRule[null, \"\"]
					{
					pushFollow(FOLLOW_instrRule_in_parseJava52);
					instrRule(null, "");
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:26: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava57);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:47: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava62);
					classRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_parseJava67); 
			h.printTable();
					System.out.println("    - Ho riconosciuto un documento Malt");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseJava"



	// $ANTLR start "instrRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: instrRule[Token id, String functionName] : ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) ;
	public final void instrRule(Token id, String functionName) throws RecognitionException {
		ParserRuleReturnScope r1 =null;
		ParserRuleReturnScope r2 =null;
		ParserRuleReturnScope r3 =null;
		ParserRuleReturnScope r4 =null;
		ParserRuleReturnScope r5 =null;
		ParserRuleReturnScope r6 =null;
		ParserRuleReturnScope r7 =null;
		ParserRuleReturnScope r8 =null;
		ParserRuleReturnScope r9 =null;
		ParserRuleReturnScope r10 =null;
		ParserRuleReturnScope r11 =null;
		ParserRuleReturnScope r12 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
			int alt4=3;
			switch ( input.LA(1) ) {
			case BLOCKQUOTE:
			case CODEBLOCK:
			case FORMATTEXT:
			case IMG:
			case LINK:
			case LIST:
			case OLIST:
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TABLE:
			case TEXT:
			case TITLE:
			case TLIST:
			case ULIST:
				{
				alt4=1;
				}
				break;
			case HRULE:
			case LAB:
				{
				alt4=2;
				}
				break;
			case FOR:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule )
					int alt2=12;
					switch ( input.LA(1) ) {
					case S1TITLE:
					case S2TITLE:
					case S3TITLE:
					case S4TITLE:
					case S5TITLE:
					case TITLE:
						{
						alt2=1;
						}
						break;
					case TEXT:
						{
						alt2=2;
						}
						break;
					case BLOCKQUOTE:
						{
						alt2=3;
						}
						break;
					case OLIST:
						{
						alt2=4;
						}
						break;
					case ULIST:
						{
						alt2=5;
						}
						break;
					case TLIST:
						{
						alt2=6;
						}
						break;
					case CODEBLOCK:
						{
						alt2=7;
						}
						break;
					case TABLE:
						{
						alt2=8;
						}
						break;
					case IMG:
						{
						alt2=9;
						}
						break;
					case LINK:
						{
						alt2=10;
						}
						break;
					case LIST:
						{
						alt2=11;
						}
						break;
					case FORMATTEXT:
						{
						alt2=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:7: r1= titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule92);
							r1=titleRule();
							state._fsp--;

							h.declareNew(id,functionName, (r1!=null?((MaltParser.titleRule_return)r1).type:null), (r1!=null?((MaltParser.titleRule_return)r1).name:null));
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: r2= textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule104);
							r2=textDeclRule();
							state._fsp--;

							h.declareNew(id,functionName, (r2!=null?((MaltParser.textDeclRule_return)r2).type:null), (r2!=null?((MaltParser.textDeclRule_return)r2).name:null));
							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: r3= blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule116);
							r3=blockquoteRule();
							state._fsp--;

							h.declareNew(id,functionName, (r3!=null?((MaltParser.blockquoteRule_return)r3).type:null), (r3!=null?((MaltParser.blockquoteRule_return)r3).name:null));
							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: r4= olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule128);
							r4=olistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r4!=null?((MaltParser.olistRule_return)r4).type:null), (r4!=null?((MaltParser.olistRule_return)r4).name:null));
							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: r5= ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule140);
							r5=ulistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r5!=null?((MaltParser.ulistRule_return)r5).type:null), (r5!=null?((MaltParser.ulistRule_return)r5).name:null));
							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: r6= tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule152);
							r6=tlistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r6!=null?((MaltParser.tlistRule_return)r6).type:null), (r6!=null?((MaltParser.tlistRule_return)r6).name:null));
							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:5: r7= codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule164);
							r7=codeBlockRule();
							state._fsp--;

							h.declareNew(id,functionName, (r7!=null?((MaltParser.codeBlockRule_return)r7).type:null), (r7!=null?((MaltParser.codeBlockRule_return)r7).name:null));
							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: r8= tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule176);
							r8=tableRule();
							state._fsp--;

							h.declareNew(id,functionName, (r8!=null?((MaltParser.tableRule_return)r8).type:null), (r8!=null?((MaltParser.tableRule_return)r8).name:null));
							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: r9= imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule188);
							r9=imageRule();
							state._fsp--;

							h.declareNew(id,functionName, (r9!=null?((MaltParser.imageRule_return)r9).type:null), (r9!=null?((MaltParser.imageRule_return)r9).name:null));
							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:5: r10= linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule200);
							r10=linkRule();
							state._fsp--;

							h.declareNew(id,functionName, (r10!=null?((MaltParser.linkRule_return)r10).type:null), (r10!=null?((MaltParser.linkRule_return)r10).name:null));
							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:5: r11= listRule
							{
							pushFollow(FOLLOW_listRule_in_instrRule212);
							r11=listRule();
							state._fsp--;

							h.declareNew(id,functionName, (r11!=null?((MaltParser.listRule_return)r11).type:null), (r11!=null?((MaltParser.listRule_return)r11).name:null));
							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:5: r12= formatTextRule
							{
							pushFollow(FOLLOW_formatTextRule_in_instrRule224);
							r12=formatTextRule();
							state._fsp--;

							h.declareNew(id,functionName, (r12!=null?((MaltParser.formatTextRule_return)r12).type:null), (r12!=null?((MaltParser.formatTextRule_return)r12).name:null));
							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule229); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: ( ( quickLinkRule | horizontalRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: ( ( quickLinkRule | horizontalRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: ( quickLinkRule | horizontalRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: ( quickLinkRule | horizontalRule )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==LAB) ) {
						alt3=1;
					}
					else if ( (LA3_0==HRULE) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:8: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule241);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule247);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule259); 
					}

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule264);
					forRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instrRule"


	public static class titleRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: titleRule returns [Token name, Token type] : t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? ;
	public final MaltParser.titleRule_return titleRule() throws RecognitionException {
		MaltParser.titleRule_return retval = new MaltParser.titleRule_return();
		retval.start = input.LT(1);

		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: (t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: t= titleTypeRule (n= VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule289);
			t=titleTypeRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:19: (n= VAR EQ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:20: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_titleRule294); 
					match(input,EQ,FOLLOW_EQ_in_titleRule296); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule300); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:38: ( refRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LCB) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:38: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule302);
					refRule();
					state._fsp--;

					}
					break;

			}

			retval.name = n; retval.type = t;
			System.out.println("    - Ho riconosciuto un titolo");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "titleRule"



	// $ANTLR start "titleTypeRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			int alt7=6;
			switch ( input.LA(1) ) {
			case TITLE:
				{
				alt7=1;
				}
				break;
			case S1TITLE:
				{
				alt7=2;
				}
				break;
			case S2TITLE:
				{
				alt7=3;
				}
				break;
			case S3TITLE:
				{
				alt7=4;
				}
				break;
			case S4TITLE:
				{
				alt7=5;
				}
				break;
			case S5TITLE:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule328); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule334); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule340); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule346); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule352); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule358); 
					}
					break;

			}

			type = t;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "titleTypeRule"



	// $ANTLR start "refRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule373); 
			match(input,HA,FOLLOW_HA_in_refRule375); 
			match(input,VAR,FOLLOW_VAR_in_refRule377); 
			match(input,RCB,FOLLOW_RCB_in_refRule379); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "refRule"


	public static class textDeclRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "textDeclRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:1: textDeclRule returns [Token name, Token type] : t= TEXT (n= VAR EQ )? textRule ;
	public final MaltParser.textDeclRule_return textDeclRule() throws RecognitionException {
		MaltParser.textDeclRule_return retval = new MaltParser.textDeclRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:2: (t= TEXT (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:3: t= TEXT (n= VAR EQ )? textRule
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule398); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:10: (n= VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_textDeclRule403); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule405); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule409);
			textRule();
			state._fsp--;

			retval.name = n; retval.type = t;
			System.out.println("    - Ho riconosciuto un testo");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "textDeclRule"



	// $ANTLR start "textRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:1: textRule : STRING ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_textRule430); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "textRule"


	public static class blockquoteRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "blockquoteRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:1: blockquoteRule returns [Token name, Token type] : t= BLOCKQUOTE (n= VAR EQ )? textRule ;
	public final MaltParser.blockquoteRule_return blockquoteRule() throws RecognitionException {
		MaltParser.blockquoteRule_return retval = new MaltParser.blockquoteRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:2: (t= BLOCKQUOTE (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:3: t= BLOCKQUOTE (n= VAR EQ )? textRule
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule566); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:16: (n= VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_blockquoteRule571); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule575); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule579);
			textRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un BLOCKQUOTE");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockquoteRule"


	public static class olistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "olistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:1: olistRule returns [Token name, Token type] : t= OLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.olistRule_return olistRule() throws RecognitionException {
		MaltParser.olistRule_return retval = new MaltParser.olistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:2: (t= OLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:3: t= OLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule601); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:11: (n= VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_olistRule606); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_olistRule610); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule614);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un OLIST");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "olistRule"



	// $ANTLR start "textListRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule628); 
			match(input,STRING,FOLLOW_STRING_in_textListRule630); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:14: ( CM STRING )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule633); 
					match(input,STRING,FOLLOW_STRING_in_textListRule635); 
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule639); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "textListRule"


	public static class ulistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "ulistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:1: ulistRule returns [Token name, Token type] : t= ULIST (n= VAR EQ )? textListRule ;
	public final MaltParser.ulistRule_return ulistRule() throws RecognitionException {
		MaltParser.ulistRule_return retval = new MaltParser.ulistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:2: (t= ULIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:3: t= ULIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule657); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:11: (n= VAR EQ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_ulistRule662); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_ulistRule666); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule670);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un ULIST");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ulistRule"


	public static class tlistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "tlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:1: tlistRule returns [Token name, Token type] : t= TLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.tlistRule_return tlistRule() throws RecognitionException {
		MaltParser.tlistRule_return retval = new MaltParser.tlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:2: (t= TLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:3: t= TLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule692); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:11: (n= VAR EQ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tlistRule697); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tlistRule701); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule705);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un TLIST");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tlistRule"


	public static class codeBlockRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "codeBlockRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:1: codeBlockRule returns [Token name, Token type] : t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule ;
	public final MaltParser.codeBlockRule_return codeBlockRule() throws RecognitionException {
		MaltParser.codeBlockRule_return retval = new MaltParser.codeBlockRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:2: (t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:3: t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule727); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:15: ( genericTextRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:15: genericTextRule
					{
					pushFollow(FOLLOW_genericTextRule_in_codeBlockRule729);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:32: (n= VAR EQ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:33: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_codeBlockRule735); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule739); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule743);
			textRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un BLOCKCODE");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "codeBlockRule"



	// $ANTLR start "genericTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:1: genericTextRule : ( LP (~ ( LP | RP | '\"' ) )* RP ) ;
	public final void genericTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:2: ( ( LP (~ ( LP | RP | '\"' ) )* RP ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:4: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_genericTextRule760); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:7: (~ ( LP | RP | '\"' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= BLOCKQUOTE && LA16_0 <= LIST)||(LA16_0 >= LSB && LA16_0 <= OLIST)||(LA16_0 >= R && LA16_0 <= RCB)||(LA16_0 >= RSB && LA16_0 <= WS)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LIST)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match(input,RP,FOLLOW_RP_in_genericTextRule778); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "genericTextRule"



	// $ANTLR start "horizontalRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:179:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule791); 
			System.out.println("    - Ho riconosciuto un HORIZ");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "horizontalRule"


	public static class linkRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "linkRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:1: linkRule returns [Token name, Token type] : t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP ;
	public final MaltParser.linkRule_return linkRule() throws RecognitionException {
		MaltParser.linkRule_return retval = new MaltParser.linkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:2: (t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:3: t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule813); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:10: (n= VAR EQ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==VAR) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_linkRule818); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_linkRule822); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule826); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:51: ( textRule | imageRule )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==STRING) ) {
				alt18=1;
			}
			else if ( (LA18_0==IMG) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:52: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule829);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:63: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule833);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule836); 
			pushFollow(FOLLOW_genericTextRule_in_linkRule838);
			genericTextRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule840); 
			System.out.println("    - Ho riconosciuto un link");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "linkRule"


	public static class imageRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "imageRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:1: imageRule returns [Token name, Token type] : t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP ;
	public final MaltParser.imageRule_return imageRule() throws RecognitionException {
		MaltParser.imageRule_return retval = new MaltParser.imageRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:2: (t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:3: t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule862); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:9: (n= VAR EQ )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:10: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_imageRule867); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_imageRule871); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule875); 
			pushFollow(FOLLOW_genericTextRule_in_imageRule877);
			genericTextRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:66: ( CM genericTextRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CM) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:67: CM genericTextRule
					{
					match(input,CM,FOLLOW_CM_in_imageRule880); 
					pushFollow(FOLLOW_genericTextRule_in_imageRule882);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule886); 
			System.out.println("    - Ho riconosciuto un'immagine");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "imageRule"



	// $ANTLR start "quickLinkRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:2: ( LAB STRING RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule903); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule905); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule907); 
			System.out.println("    - Ho riconosciuto un quicklink");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "quickLinkRule"


	public static class tableRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "tableRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:1: tableRule returns [Token name, Token type] : t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final MaltParser.tableRule_return tableRule() throws RecognitionException {
		MaltParser.tableRule_return retval = new MaltParser.tableRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:2: (t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:3: t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule930); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:11: (n= VAR EQ )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tableRule935); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tableRule939); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:49: ( talignmentRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LSB) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:49: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule943);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule946); 
			pushFollow(FOLLOW_trowRule_in_tableRule948);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:77: ( CM trowRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:78: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule951); 
					pushFollow(FOLLOW_trowRule_in_tableRule953);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule957); 
			System.out.println("    - Ho riconosciuto una tabella");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableRule"



	// $ANTLR start "talignmentRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule973); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule975);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:17: ( CM alignRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule978); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule980);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule984); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "talignmentRule"



	// $ANTLR start "alignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:2: ( L | C | R )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( input.LA(1)==C||input.LA(1)==L||input.LA(1)==R ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alignRule"



	// $ANTLR start "trowRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule1016); 
			match(input,STRING,FOLLOW_STRING_in_trowRule1018); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:14: ( CM STRING )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule1021); 
					match(input,STRING,FOLLOW_STRING_in_trowRule1023); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule1027); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "trowRule"


	public static class formatTextRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "formatTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:1: formatTextRule returns [Token name, Token type] : t= FORMATTEXT (n= VAR EQ )? STRING ;
	public final MaltParser.formatTextRule_return formatTextRule() throws RecognitionException {
		MaltParser.formatTextRule_return retval = new MaltParser.formatTextRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:2: (t= FORMATTEXT (n= VAR EQ )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:3: t= FORMATTEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule1046); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:16: (n= VAR EQ )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==VAR) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_formatTextRule1051); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_formatTextRule1055); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule1059); 
			System.out.println("    - Ho riconosciuto formattext");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formatTextRule"



	// $ANTLR start "functionRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:1: functionRule[Token className] : f= FUN n= VAR LP ( ( TEXT | LIST ) VAR )* RP LCB (r= instrRule[className,$n.getText()] )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:2: (f= FUN n= VAR LP ( ( TEXT | LIST ) VAR )* RP LCB (r= instrRule[className,$n.getText()] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:3: f= FUN n= VAR LP ( ( TEXT | LIST ) VAR )* RP LCB (r= instrRule[className,$n.getText()] )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule1079); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule1083); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule1087); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:50: ( ( TEXT | LIST ) VAR )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LIST||LA27_0==TEXT) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:51: ( TEXT | LIST ) VAR
					{
					if ( input.LA(1)==LIST||input.LA(1)==TEXT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,VAR,FOLLOW_VAR_in_functionRule1098); 
					}
					break;

				default :
					break loop27;
				}
			}

			match(input,RP,FOLLOW_RP_in_functionRule1102); 
			match(input,LCB,FOLLOW_LCB_in_functionRule1104); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:78: (r= instrRule[className,$n.getText()] )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==BLOCKQUOTE||LA28_0==CODEBLOCK||LA28_0==FOR||LA28_0==FORMATTEXT||LA28_0==HRULE||LA28_0==IMG||LA28_0==LAB||(LA28_0 >= LINK && LA28_0 <= LIST)||LA28_0==OLIST||(LA28_0 >= S1TITLE && LA28_0 <= S5TITLE)||(LA28_0 >= TABLE && LA28_0 <= ULIST)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:79: r= instrRule[className,$n.getText()]
					{
					pushFollow(FOLLOW_instrRule_in_functionRule1109);
					instrRule(className, n.getText());
					state._fsp--;

					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule1114); 
			System.out.println("    - Ho riconosciuto una funzione");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionRule"



	// $ANTLR start "forRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule[null,\"\"] )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:2: ( FOR LP VAR IN VAR RP LCB ( instrRule[null,\"\"] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:3: FOR LP VAR IN VAR RP LCB ( instrRule[null,\"\"] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1130); 
			match(input,LP,FOLLOW_LP_in_forRule1132); 
			match(input,VAR,FOLLOW_VAR_in_forRule1134); 
			match(input,IN,FOLLOW_IN_in_forRule1136); 
			match(input,VAR,FOLLOW_VAR_in_forRule1138); 
			match(input,RP,FOLLOW_RP_in_forRule1140); 
			match(input,LCB,FOLLOW_LCB_in_forRule1142); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:28: ( instrRule[null,\"\"] )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==BLOCKQUOTE||LA29_0==CODEBLOCK||LA29_0==FOR||LA29_0==FORMATTEXT||LA29_0==HRULE||LA29_0==IMG||LA29_0==LAB||(LA29_0 >= LINK && LA29_0 <= LIST)||LA29_0==OLIST||(LA29_0 >= S1TITLE && LA29_0 <= S5TITLE)||(LA29_0 >= TABLE && LA29_0 <= ULIST)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:29: instrRule[null,\"\"]
					{
					pushFollow(FOLLOW_instrRule_in_forRule1145);
					instrRule(null, "");
					state._fsp--;

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input,RCB,FOLLOW_RCB_in_forRule1150); 
			System.out.println("    - Ho riconosciuto un for");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forRule"



	// $ANTLR start "classRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$f,$n.getText()] )* ( functionRule[$n] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:2: (f= CLASS n= VAR LCB ( fieldRule[$f,$n.getText()] )* ( functionRule[$n] )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:3: f= CLASS n= VAR LCB ( fieldRule[$f,$n.getText()] )* ( functionRule[$n] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1168); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1172); 
			h.declareFunCl(f,n);
			match(input,LCB,FOLLOW_LCB_in_classRule1176); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:46: ( fieldRule[$f,$n.getText()] )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==LIST||LA30_0==OLIST||LA30_0==TEXT||(LA30_0 >= TLIST && LA30_0 <= ULIST)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:46: fieldRule[$f,$n.getText()]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1178);
					fieldRule(f, n.getText());
					state._fsp--;

					}
					break;

				default :
					break loop30;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:74: ( functionRule[$n] )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==FUN) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:75: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1183);
					functionRule(n);
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1188); 
			System.out.println("    - Ho riconosciuto una classe");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classRule"



	// $ANTLR start "fieldRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:1: fieldRule[Token id, String className] : (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE ;
	public final void fieldRule(Token id, String className) throws RecognitionException {
		ParserRuleReturnScope r1 =null;
		ParserRuleReturnScope r2 =null;
		ParserRuleReturnScope r3 =null;
		ParserRuleReturnScope r4 =null;
		ParserRuleReturnScope r5 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:2: ( (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:3: (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:3: (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule )
			int alt32=5;
			switch ( input.LA(1) ) {
			case TEXT:
				{
				alt32=1;
				}
				break;
			case OLIST:
				{
				alt32=2;
				}
				break;
			case ULIST:
				{
				alt32=3;
				}
				break;
			case TLIST:
				{
				alt32=4;
				}
				break;
			case LIST:
				{
				alt32=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:5: r1= fieldTextRule
					{
					pushFollow(FOLLOW_fieldTextRule_in_fieldRule1212);
					r1=fieldTextRule();
					state._fsp--;

					h.declareNew(id,className, (r1!=null?((MaltParser.fieldTextRule_return)r1).type:null), (r1!=null?((MaltParser.fieldTextRule_return)r1).name:null));
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:5: r2= fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1224);
					r2=fieldOlistRule();
					state._fsp--;

					h.declareNew(id,className, (r2!=null?((MaltParser.fieldOlistRule_return)r2).type:null), (r2!=null?((MaltParser.fieldOlistRule_return)r2).name:null));
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:5: r3= fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1236);
					r3=fieldUlistRule();
					state._fsp--;

					h.declareNew(id,className, (r3!=null?((MaltParser.fieldUlistRule_return)r3).type:null), (r3!=null?((MaltParser.fieldUlistRule_return)r3).name:null));
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:5: r4= fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1248);
					r4=fieldTlistRule();
					state._fsp--;

					h.declareNew(id,className, (r4!=null?((MaltParser.fieldTlistRule_return)r4).type:null), (r4!=null?((MaltParser.fieldTlistRule_return)r4).name:null));
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:5: r5= listRule
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1260);
					r5=listRule();
					state._fsp--;

					h.declareNew(id,className, (r5!=null?((MaltParser.listRule_return)r5).type:null), (r5!=null?((MaltParser.listRule_return)r5).name:null));
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1265); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fieldRule"


	public static class fieldTextRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:1: fieldTextRule returns [Token name, Token type] : t= TEXT n= VAR ( EQ textRule )? ;
	public final MaltParser.fieldTextRule_return fieldTextRule() throws RecognitionException {
		MaltParser.fieldTextRule_return retval = new MaltParser.fieldTextRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:2: (t= TEXT n= VAR ( EQ textRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:3: t= TEXT n= VAR ( EQ textRule )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldTextRule1283); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTextRule1287); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:16: ( EQ textRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:17: EQ textRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTextRule1290); 
					pushFollow(FOLLOW_textRule_in_fieldTextRule1292);
					textRule();
					state._fsp--;

					}
					break;

			}

			retval.name = n; retval.type = t;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldTextRule"


	public static class fieldOlistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldOlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:1: fieldOlistRule returns [Token name, Token type] : t= OLIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldOlistRule_return fieldOlistRule() throws RecognitionException {
		MaltParser.fieldOlistRule_return retval = new MaltParser.fieldOlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:2: (t= OLIST n= VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:3: t= OLIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1314); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1318); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:17: ( EQ textListRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldOlistRule1321); 
					pushFollow(FOLLOW_textListRule_in_fieldOlistRule1323);
					textListRule();
					state._fsp--;

					}
					break;

			}

			retval.name = n; retval.type = t;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldOlistRule"


	public static class fieldUlistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldUlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:1: fieldUlistRule returns [Token name, Token type] : t= ULIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldUlistRule_return fieldUlistRule() throws RecognitionException {
		MaltParser.fieldUlistRule_return retval = new MaltParser.fieldUlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:2: (t= ULIST n= VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:3: t= ULIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1345); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1349); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:17: ( EQ textListRule )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldUlistRule1352); 
					pushFollow(FOLLOW_textListRule_in_fieldUlistRule1354);
					textListRule();
					state._fsp--;

					}
					break;

			}

			retval.name = n; retval.type = t;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldUlistRule"


	public static class fieldTlistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldTlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:1: fieldTlistRule returns [Token name, Token type] : t= TLIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldTlistRule_return fieldTlistRule() throws RecognitionException {
		MaltParser.fieldTlistRule_return retval = new MaltParser.fieldTlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:2: (t= TLIST n= VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:3: t= TLIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1376); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1380); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:17: ( EQ textListRule )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTlistRule1383); 
					pushFollow(FOLLOW_textListRule_in_fieldTlistRule1385);
					textListRule();
					state._fsp--;

					}
					break;

			}

			retval.name = n; retval.type = t;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldTlistRule"


	public static class listRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "listRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:1: listRule returns [Token name, Token type] : t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? ;
	public final MaltParser.listRule_return listRule() throws RecognitionException {
		MaltParser.listRule_return retval = new MaltParser.listRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:2: (t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:3: t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1407); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1411); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:16: ( EQ LSB STRING ( CM STRING )+ RSB )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EQ) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:17: EQ LSB STRING ( CM STRING )+ RSB
					{
					match(input,EQ,FOLLOW_EQ_in_listRule1414); 
					match(input,LSB,FOLLOW_LSB_in_listRule1416); 
					match(input,STRING,FOLLOW_STRING_in_listRule1418); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:31: ( CM STRING )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==CM) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:32: CM STRING
							{
							match(input,CM,FOLLOW_CM_in_listRule1421); 
							match(input,STRING,FOLLOW_STRING_in_listRule1423); 
							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					match(input,RSB,FOLLOW_RSB_in_listRule1427); 
					}
					break;

			}

			retval.name = n; retval.type = t;
			System.out.println("    - Ho riconosciuto una lista");
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "listRule"



	// $ANTLR start "fieldTextAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:1: fieldTextAssignRule : VAR EQ textRule ;
	public final void fieldTextAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:2: ( VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:3: VAR EQ textRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldTextAssignRule1453); 
			match(input,EQ,FOLLOW_EQ_in_fieldTextAssignRule1455); 
			pushFollow(FOLLOW_textRule_in_fieldTextAssignRule1457);
			textRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fieldTextAssignRule"



	// $ANTLR start "fieldListAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:1: fieldListAssignRule : VAR EQ textListRule ;
	public final void fieldListAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:2: ( VAR EQ textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:3: VAR EQ textListRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldListAssignRule1470); 
			match(input,EQ,FOLLOW_EQ_in_fieldListAssignRule1472); 
			pushFollow(FOLLOW_textListRule_in_fieldListAssignRule1474);
			textListRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fieldListAssignRule"



	// $ANTLR start "listAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:1: listAssignRule : VAR EQ LSB STRING ( CM STRING )+ RSB ;
	public final void listAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:2: ( VAR EQ LSB STRING ( CM STRING )+ RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:3: VAR EQ LSB STRING ( CM STRING )+ RSB
			{
			match(input,VAR,FOLLOW_VAR_in_listAssignRule1486); 
			match(input,EQ,FOLLOW_EQ_in_listAssignRule1488); 
			match(input,LSB,FOLLOW_LSB_in_listAssignRule1490); 
			match(input,STRING,FOLLOW_STRING_in_listAssignRule1492); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:21: ( CM STRING )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CM) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:22: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_listAssignRule1495); 
					match(input,STRING,FOLLOW_STRING_in_listAssignRule1497); 
					}
					break;

				default :
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
			}

			match(input,RSB,FOLLOW_RSB_in_listAssignRule1501); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "listAssignRule"

	// Delegated rules



	public static final BitSet FOLLOW_instrRule_in_parseJava52 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_functionRule_in_parseJava57 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_classRule_in_parseJava62 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_EOF_in_parseJava67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule92 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule104 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule116 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule128 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule140 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule152 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule164 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule176 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule188 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule200 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule212 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule224 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule241 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule247 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule289 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_titleRule294 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule296 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule300 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule373 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HA_in_refRule375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_refRule377 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule398 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule403 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule405 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textRule430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule566 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule571 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule575 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule601 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_olistRule606 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule610 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule628 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule630 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule633 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule635 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule657 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_ulistRule662 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule666 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule692 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tlistRule697 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule701 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule727 = new BitSet(new long[]{0x2000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_genericTextRule_in_codeBlockRule729 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule735 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule739 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_genericTextRule760 = new BitSet(new long[]{0xFFFF77FFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_genericTextRule778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule813 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_linkRule818 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule822 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule826 = new BitSet(new long[]{0x2000000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule829 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule833 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule836 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_linkRule838 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule862 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_imageRule867 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule871 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule875 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule877 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule880 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule882 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule903 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule905 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule930 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tableRule935 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule939 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule943 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule946 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule948 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule951 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule953 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule973 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule975 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule978 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule980 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1016 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule1018 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1021 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule1023 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule1046 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule1051 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule1055 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule1083 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule1087 = new BitSet(new long[]{0x0008040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_functionRule1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule1098 = new BitSet(new long[]{0x0008040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RP_in_functionRule1102 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule1104 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_functionRule1109 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_functionRule1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1130 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1134 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_forRule1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1138 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1140 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1142 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_forRule1145 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_forRule1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_classRule1172 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1176 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1178 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_functionRule_in_classRule1183 = new BitSet(new long[]{0x0004000000800000L});
	public static final BitSet FOLLOW_RCB_in_classRule1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTextRule_in_fieldRule1212 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1224 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1236 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1248 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1260 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldTextRule1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTextRule1287 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTextRule1290 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextRule1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1318 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldOlistRule1321 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldOlistRule1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1349 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldUlistRule1352 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldUlistRule1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1380 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTlistRule1383 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldTlistRule1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_listRule1411 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_listRule1414 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listRule1416 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1418 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRule1421 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1423 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listRule1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldTextAssignRule1453 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldTextAssignRule1455 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextAssignRule1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldListAssignRule1470 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldListAssignRule1472 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldListAssignRule1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_listAssignRule1486 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_listAssignRule1488 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listAssignRule1490 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1492 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listAssignRule1495 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1497 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listAssignRule1501 = new BitSet(new long[]{0x0000000000000002L});
}
