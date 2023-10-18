// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-18 19:39:42

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
	@Override public String getGrammarFileName() { return "D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }


		Handler h;
		
		void initHandler () {
		h = new Handler();
		}



	// $ANTLR start "parseJava"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:1: parseJava : ( instrRule[\"\"] | functionRule | classRule )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:2: ( ( instrRule[\"\"] | functionRule | classRule )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[\"\"] | functionRule | classRule )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[\"\"] | functionRule | classRule )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: instrRule[\"\"]
					{
					pushFollow(FOLLOW_instrRule_in_parseJava52);
					instrRule("");
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:20: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_parseJava57);
					functionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:35: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava61);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava66); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: instrRule[String functionName] : ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) ;
	public final void instrRule(String functionName) throws RecognitionException {
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatTextRule )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:7: r1= titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule91);
							r1=titleRule();
							state._fsp--;

							h.declareNew(functionName, (r1!=null?((MaltParser.titleRule_return)r1).type:null), (r1!=null?((MaltParser.titleRule_return)r1).name:null));
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: r2= textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule103);
							r2=textDeclRule();
							state._fsp--;

							h.declareNew(functionName, (r2!=null?((MaltParser.textDeclRule_return)r2).type:null), (r2!=null?((MaltParser.textDeclRule_return)r2).name:null));
							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: r3= blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule115);
							r3=blockquoteRule();
							state._fsp--;

							h.declareNew(functionName, (r3!=null?((MaltParser.blockquoteRule_return)r3).type:null), (r3!=null?((MaltParser.blockquoteRule_return)r3).name:null));
							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: r4= olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule127);
							r4=olistRule();
							state._fsp--;

							h.declareNew(functionName, (r4!=null?((MaltParser.olistRule_return)r4).type:null), (r4!=null?((MaltParser.olistRule_return)r4).name:null));
							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: r5= ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule139);
							r5=ulistRule();
							state._fsp--;

							h.declareNew(functionName, (r5!=null?((MaltParser.ulistRule_return)r5).type:null), (r5!=null?((MaltParser.ulistRule_return)r5).name:null));
							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: r6= tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule151);
							r6=tlistRule();
							state._fsp--;

							h.declareNew(functionName, (r6!=null?((MaltParser.tlistRule_return)r6).type:null), (r6!=null?((MaltParser.tlistRule_return)r6).name:null));
							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:5: r7= codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule163);
							r7=codeBlockRule();
							state._fsp--;

							h.declareNew(functionName, (r7!=null?((MaltParser.codeBlockRule_return)r7).type:null), (r7!=null?((MaltParser.codeBlockRule_return)r7).name:null));
							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: r8= tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule175);
							r8=tableRule();
							state._fsp--;

							h.declareNew(functionName, (r8!=null?((MaltParser.tableRule_return)r8).type:null), (r8!=null?((MaltParser.tableRule_return)r8).name:null));
							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: r9= imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule187);
							r9=imageRule();
							state._fsp--;

							h.declareNew(functionName, (r9!=null?((MaltParser.imageRule_return)r9).type:null), (r9!=null?((MaltParser.imageRule_return)r9).name:null));
							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:5: r10= linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule199);
							r10=linkRule();
							state._fsp--;

							h.declareNew(functionName, (r10!=null?((MaltParser.linkRule_return)r10).type:null), (r10!=null?((MaltParser.linkRule_return)r10).name:null));
							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:5: r11= listRule
							{
							pushFollow(FOLLOW_listRule_in_instrRule211);
							r11=listRule();
							state._fsp--;

							h.declareNew(functionName, (r11!=null?((MaltParser.listRule_return)r11).type:null), (r11!=null?((MaltParser.listRule_return)r11).name:null));
							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:5: r12= formatTextRule
							{
							pushFollow(FOLLOW_formatTextRule_in_instrRule223);
							r12=formatTextRule();
							state._fsp--;

							h.declareNew(functionName, (r12!=null?((MaltParser.formatTextRule_return)r12).type:null), (r12!=null?((MaltParser.formatTextRule_return)r12).name:null));
							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule228); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: ( ( quickLinkRule | horizontalRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: ( ( quickLinkRule | horizontalRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: ( quickLinkRule | horizontalRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: ( quickLinkRule | horizontalRule )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:8: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule240);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule246);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule258); 
					}

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule263);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: titleRule returns [Token name, Token type] : t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? ;
	public final MaltParser.titleRule_return titleRule() throws RecognitionException {
		MaltParser.titleRule_return retval = new MaltParser.titleRule_return();
		retval.start = input.LT(1);

		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: (t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: t= titleTypeRule (n= VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule288);
			t=titleTypeRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:19: (n= VAR EQ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:20: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_titleRule293); 
					match(input,EQ,FOLLOW_EQ_in_titleRule295); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule299); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:38: ( refRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LCB) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:38: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule301);
					refRule();
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
	// $ANTLR end "titleRule"



	// $ANTLR start "titleTypeRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule323); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule329); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule335); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule341); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule347); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule353); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule368); 
			match(input,HA,FOLLOW_HA_in_refRule370); 
			match(input,VAR,FOLLOW_VAR_in_refRule372); 
			match(input,RCB,FOLLOW_RCB_in_refRule374); 
			System.out.println("    - REF");
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:1: textDeclRule returns [Token name, Token type] : t= TEXT (n= VAR EQ )? textRule ;
	public final MaltParser.textDeclRule_return textDeclRule() throws RecognitionException {
		MaltParser.textDeclRule_return retval = new MaltParser.textDeclRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:2: (t= TEXT (n= VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:3: t= TEXT (n= VAR EQ )? textRule
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule397); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:10: (n= VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_textDeclRule402); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule404); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule408);
			textRule();
			state._fsp--;

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
	// $ANTLR end "textDeclRule"



	// $ANTLR start "textRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:1: textRule : STRING ;
	public final void textRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:2: ( STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_textRule425); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:1: blockquoteRule returns [Token name, Token type] : t= BLOCKQUOTE (n= VAR EQ )? textRule ;
	public final MaltParser.blockquoteRule_return blockquoteRule() throws RecognitionException {
		MaltParser.blockquoteRule_return retval = new MaltParser.blockquoteRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:2: (t= BLOCKQUOTE (n= VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:3: t= BLOCKQUOTE (n= VAR EQ )? textRule
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule561); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:16: (n= VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_blockquoteRule566); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule570); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule574);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:1: olistRule returns [Token name, Token type] : t= OLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.olistRule_return olistRule() throws RecognitionException {
		MaltParser.olistRule_return retval = new MaltParser.olistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:2: (t= OLIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:3: t= OLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule596); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:11: (n= VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_olistRule601); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_olistRule605); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule609);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:151:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:2: ( LP STRING ( CM STRING )+ RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule623); 
			match(input,STRING,FOLLOW_STRING_in_textListRule625); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:14: ( CM STRING )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule628); 
					match(input,STRING,FOLLOW_STRING_in_textListRule630); 
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule634); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:1: ulistRule returns [Token name, Token type] : t= ULIST (n= VAR EQ )? textListRule ;
	public final MaltParser.ulistRule_return ulistRule() throws RecognitionException {
		MaltParser.ulistRule_return retval = new MaltParser.ulistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:2: (t= ULIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:3: t= ULIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule652); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:11: (n= VAR EQ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_ulistRule657); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_ulistRule661); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule665);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:1: tlistRule returns [Token name, Token type] : t= TLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.tlistRule_return tlistRule() throws RecognitionException {
		MaltParser.tlistRule_return retval = new MaltParser.tlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:2: (t= TLIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:3: t= TLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule687); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:11: (n= VAR EQ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tlistRule692); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tlistRule696); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule700);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:1: codeBlockRule returns [Token name, Token type] : t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule ;
	public final MaltParser.codeBlockRule_return codeBlockRule() throws RecognitionException {
		MaltParser.codeBlockRule_return retval = new MaltParser.codeBlockRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:2: (t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:3: t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule722); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:15: ( genericTextRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:15: genericTextRule
					{
					pushFollow(FOLLOW_genericTextRule_in_codeBlockRule724);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:32: (n= VAR EQ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:33: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_codeBlockRule730); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule734); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule738);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:1: genericTextRule : ( LP (~ ( LP | RP | '\"' ) )* RP ) ;
	public final void genericTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:2: ( ( LP (~ ( LP | RP | '\"' ) )* RP ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:4: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_genericTextRule755); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:7: (~ ( LP | RP | '\"' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= BLOCKQUOTE && LA16_0 <= LIST)||(LA16_0 >= LSB && LA16_0 <= OLIST)||(LA16_0 >= R && LA16_0 <= RCB)||(LA16_0 >= RSB && LA16_0 <= WS)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

			match(input,RP,FOLLOW_RP_in_genericTextRule773); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:179:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule786); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:1: linkRule returns [Token name, Token type] : t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP ;
	public final MaltParser.linkRule_return linkRule() throws RecognitionException {
		MaltParser.linkRule_return retval = new MaltParser.linkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:2: (t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:3: t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule808); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:10: (n= VAR EQ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==VAR) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_linkRule813); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_linkRule817); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule821); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:51: ( textRule | imageRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:52: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule824);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:63: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule828);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule831); 
			pushFollow(FOLLOW_genericTextRule_in_linkRule833);
			genericTextRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule835); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:1: imageRule returns [Token name, Token type] : t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP ;
	public final MaltParser.imageRule_return imageRule() throws RecognitionException {
		MaltParser.imageRule_return retval = new MaltParser.imageRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:2: (t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:3: t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule857); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:9: (n= VAR EQ )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:10: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_imageRule862); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_imageRule866); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule870); 
			pushFollow(FOLLOW_genericTextRule_in_imageRule872);
			genericTextRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:66: ( CM genericTextRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CM) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:67: CM genericTextRule
					{
					match(input,CM,FOLLOW_CM_in_imageRule875); 
					pushFollow(FOLLOW_genericTextRule_in_imageRule877);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule881); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:2: ( LAB STRING RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule898); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule900); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule902); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:1: tableRule returns [Token name, Token type] : t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final MaltParser.tableRule_return tableRule() throws RecognitionException {
		MaltParser.tableRule_return retval = new MaltParser.tableRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:2: (t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:3: t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule925); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:11: (n= VAR EQ )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tableRule930); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tableRule934); 
					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:49: ( talignmentRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LSB) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:49: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule938);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule941); 
			pushFollow(FOLLOW_trowRule_in_tableRule943);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:77: ( CM trowRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:78: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule946); 
					pushFollow(FOLLOW_trowRule_in_tableRule948);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule952); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:2: ( LSB alignRule ( CM alignRule )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule968); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule970);
			alignRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:17: ( CM alignRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule973); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule975);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule979); 
			System.out.println("    - Ho riconosciuto talign");
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:2: ( L | C | R )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:2: ( LSB STRING ( CM STRING )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule1015); 
			match(input,STRING,FOLLOW_STRING_in_trowRule1017); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:14: ( CM STRING )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule1020); 
					match(input,STRING,FOLLOW_STRING_in_trowRule1022); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule1026); 
			System.out.println("    - Ho riconosciuto trow");
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:1: formatTextRule returns [Token name, Token type] : t= FORMATTEXT (n= VAR EQ )? STRING ;
	public final MaltParser.formatTextRule_return formatTextRule() throws RecognitionException {
		MaltParser.formatTextRule_return retval = new MaltParser.formatTextRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:2: (t= FORMATTEXT (n= VAR EQ )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:3: t= FORMATTEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule1049); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:16: (n= VAR EQ )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==VAR) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_formatTextRule1054); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_formatTextRule1058); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule1062); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:1: functionRule : FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule[$n.getText()] )+ RCB ;
	public final void functionRule() throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:2: ( FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule[$n.getText()] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:3: FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule[$n.getText()] )+ RCB
			{
			match(input,FUN,FOLLOW_FUN_in_functionRule1078); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule1082); 
			h.declareFun(n);
			match(input,LP,FOLLOW_LP_in_functionRule1086); 
			if ( input.LA(1)==LIST||input.LA(1)==TEXT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,VAR,FOLLOW_VAR_in_functionRule1096); 
			match(input,RP,FOLLOW_RP_in_functionRule1098); 
			match(input,LCB,FOLLOW_LCB_in_functionRule1100); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:61: (r= instrRule[$n.getText()] )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==BLOCKQUOTE||LA27_0==CODEBLOCK||LA27_0==FOR||LA27_0==FORMATTEXT||LA27_0==HRULE||LA27_0==IMG||LA27_0==LAB||(LA27_0 >= LINK && LA27_0 <= LIST)||LA27_0==OLIST||(LA27_0 >= S1TITLE && LA27_0 <= S5TITLE)||(LA27_0 >= TABLE && LA27_0 <= ULIST)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:62: r= instrRule[$n.getText()]
					{
					pushFollow(FOLLOW_instrRule_in_functionRule1105);
					instrRule(n.getText());
					state._fsp--;

					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule1110); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule[\"\"] )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:2: ( FOR LP VAR IN VAR RP LCB ( instrRule[\"\"] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:3: FOR LP VAR IN VAR RP LCB ( instrRule[\"\"] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1126); 
			match(input,LP,FOLLOW_LP_in_forRule1128); 
			match(input,VAR,FOLLOW_VAR_in_forRule1130); 
			match(input,IN,FOLLOW_IN_in_forRule1132); 
			match(input,VAR,FOLLOW_VAR_in_forRule1134); 
			match(input,RP,FOLLOW_RP_in_forRule1136); 
			match(input,LCB,FOLLOW_LCB_in_forRule1138); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:28: ( instrRule[\"\"] )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:29: instrRule[\"\"]
					{
					pushFollow(FOLLOW_instrRule_in_forRule1141);
					instrRule("");
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

			match(input,RCB,FOLLOW_RCB_in_forRule1146); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:1: classRule : CLASS n= VAR LCB ( fieldRule[$n.getText()] )* ( functionRule )* RCB ;
	public final void classRule() throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:2: ( CLASS n= VAR LCB ( fieldRule[$n.getText()] )* ( functionRule )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:3: CLASS n= VAR LCB ( fieldRule[$n.getText()] )* ( functionRule )* RCB
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1158); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1162); 
			h.declareFun(n);
			match(input,LCB,FOLLOW_LCB_in_classRule1166); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:39: ( fieldRule[$n.getText()] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==LIST||LA29_0==OLIST||LA29_0==TEXT||(LA29_0 >= TLIST && LA29_0 <= ULIST)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:39: fieldRule[$n.getText()]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1168);
					fieldRule(n.getText());
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:64: ( functionRule )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==FUN) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:64: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_classRule1172);
					functionRule();
					state._fsp--;

					}
					break;

				default :
					break loop30;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1175); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:1: fieldRule[String className] : (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE ;
	public final void fieldRule(String className) throws RecognitionException {
		ParserRuleReturnScope r1 =null;
		ParserRuleReturnScope r2 =null;
		ParserRuleReturnScope r3 =null;
		ParserRuleReturnScope r4 =null;
		ParserRuleReturnScope r5 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:2: ( (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:3: (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule ) SE
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:3: (r1= fieldTextRule |r2= fieldOlistRule |r3= fieldUlistRule |r4= fieldTlistRule |r5= listRule )
			int alt31=5;
			switch ( input.LA(1) ) {
			case TEXT:
				{
				alt31=1;
				}
				break;
			case OLIST:
				{
				alt31=2;
				}
				break;
			case ULIST:
				{
				alt31=3;
				}
				break;
			case TLIST:
				{
				alt31=4;
				}
				break;
			case LIST:
				{
				alt31=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:5: r1= fieldTextRule
					{
					pushFollow(FOLLOW_fieldTextRule_in_fieldRule1195);
					r1=fieldTextRule();
					state._fsp--;

					h.declareNew(className, (r1!=null?((MaltParser.fieldTextRule_return)r1).type:null), (r1!=null?((MaltParser.fieldTextRule_return)r1).name:null));
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:5: r2= fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1207);
					r2=fieldOlistRule();
					state._fsp--;

					h.declareNew(className, (r2!=null?((MaltParser.fieldOlistRule_return)r2).type:null), (r2!=null?((MaltParser.fieldOlistRule_return)r2).name:null));
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:5: r3= fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1219);
					r3=fieldUlistRule();
					state._fsp--;

					h.declareNew(className, (r3!=null?((MaltParser.fieldUlistRule_return)r3).type:null), (r3!=null?((MaltParser.fieldUlistRule_return)r3).name:null));
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:5: r4= fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1231);
					r4=fieldTlistRule();
					state._fsp--;

					h.declareNew(className, (r4!=null?((MaltParser.fieldTlistRule_return)r4).type:null), (r4!=null?((MaltParser.fieldTlistRule_return)r4).name:null));
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:5: r5= listRule
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1243);
					r5=listRule();
					state._fsp--;

					h.declareNew(className, (r5!=null?((MaltParser.listRule_return)r5).type:null), (r5!=null?((MaltParser.listRule_return)r5).name:null));
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1248); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:1: fieldTextRule returns [Token name, Token type] : t= TEXT n= VAR ( EQ textRule )? ;
	public final MaltParser.fieldTextRule_return fieldTextRule() throws RecognitionException {
		MaltParser.fieldTextRule_return retval = new MaltParser.fieldTextRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:2: (t= TEXT n= VAR ( EQ textRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:3: t= TEXT n= VAR ( EQ textRule )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldTextRule1266); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTextRule1270); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:16: ( EQ textRule )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:17: EQ textRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTextRule1273); 
					pushFollow(FOLLOW_textRule_in_fieldTextRule1275);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:1: fieldOlistRule returns [Token name, Token type] : t= OLIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldOlistRule_return fieldOlistRule() throws RecognitionException {
		MaltParser.fieldOlistRule_return retval = new MaltParser.fieldOlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:2: (t= OLIST n= VAR ( EQ textListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:3: t= OLIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1297); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1301); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:17: ( EQ textListRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldOlistRule1304); 
					pushFollow(FOLLOW_textListRule_in_fieldOlistRule1306);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:1: fieldUlistRule returns [Token name, Token type] : t= ULIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldUlistRule_return fieldUlistRule() throws RecognitionException {
		MaltParser.fieldUlistRule_return retval = new MaltParser.fieldUlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:2: (t= ULIST n= VAR ( EQ textListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:3: t= ULIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1328); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1332); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:17: ( EQ textListRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldUlistRule1335); 
					pushFollow(FOLLOW_textListRule_in_fieldUlistRule1337);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:1: fieldTlistRule returns [Token name, Token type] : t= TLIST n= VAR ( EQ textListRule )? ;
	public final MaltParser.fieldTlistRule_return fieldTlistRule() throws RecognitionException {
		MaltParser.fieldTlistRule_return retval = new MaltParser.fieldTlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:2: (t= TLIST n= VAR ( EQ textListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:3: t= TLIST n= VAR ( EQ textListRule )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1359); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1363); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:17: ( EQ textListRule )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:18: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTlistRule1366); 
					pushFollow(FOLLOW_textListRule_in_fieldTlistRule1368);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:1: listRule returns [Token name, Token type] : t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? ;
	public final MaltParser.listRule_return listRule() throws RecognitionException {
		MaltParser.listRule_return retval = new MaltParser.listRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:2: (t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:3: t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1390); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1394); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:16: ( EQ LSB STRING ( CM STRING )+ RSB )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQ) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:17: EQ LSB STRING ( CM STRING )+ RSB
					{
					match(input,EQ,FOLLOW_EQ_in_listRule1397); 
					match(input,LSB,FOLLOW_LSB_in_listRule1399); 
					match(input,STRING,FOLLOW_STRING_in_listRule1401); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:31: ( CM STRING )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==CM) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:32: CM STRING
							{
							match(input,CM,FOLLOW_CM_in_listRule1404); 
							match(input,STRING,FOLLOW_STRING_in_listRule1406); 
							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					match(input,RSB,FOLLOW_RSB_in_listRule1410); 
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
	// $ANTLR end "listRule"



	// $ANTLR start "fieldTextAssignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:1: fieldTextAssignRule : VAR EQ textRule ;
	public final void fieldTextAssignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:2: ( VAR EQ textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:3: VAR EQ textRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldTextAssignRule1432); 
			match(input,EQ,FOLLOW_EQ_in_fieldTextAssignRule1434); 
			pushFollow(FOLLOW_textRule_in_fieldTextAssignRule1436);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:1: fieldListAssignRule : VAR EQ textListRule ;
	public final void fieldListAssignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:2: ( VAR EQ textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:3: VAR EQ textListRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldListAssignRule1449); 
			match(input,EQ,FOLLOW_EQ_in_fieldListAssignRule1451); 
			pushFollow(FOLLOW_textListRule_in_fieldListAssignRule1453);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:1: listAssignRule : VAR EQ LSB STRING ( CM STRING )+ RSB ;
	public final void listAssignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:2: ( VAR EQ LSB STRING ( CM STRING )+ RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:3: VAR EQ LSB STRING ( CM STRING )+ RSB
			{
			match(input,VAR,FOLLOW_VAR_in_listAssignRule1465); 
			match(input,EQ,FOLLOW_EQ_in_listAssignRule1467); 
			match(input,LSB,FOLLOW_LSB_in_listAssignRule1469); 
			match(input,STRING,FOLLOW_STRING_in_listAssignRule1471); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:21: ( CM STRING )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==CM) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:22: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_listAssignRule1474); 
					match(input,STRING,FOLLOW_STRING_in_listAssignRule1476); 
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			match(input,RSB,FOLLOW_RSB_in_listAssignRule1480); 
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
	public static final BitSet FOLLOW_classRule_in_parseJava61 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_EOF_in_parseJava66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule91 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule103 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule115 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule127 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule139 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule151 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule163 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule175 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule187 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule199 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule211 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule223 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule240 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule246 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule288 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_titleRule293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule295 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule299 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule368 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HA_in_refRule370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_refRule372 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule397 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule402 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule404 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textRule425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule561 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule566 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule570 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule596 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_olistRule601 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule605 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule623 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule625 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule628 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule630 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule652 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_ulistRule657 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule661 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule687 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tlistRule692 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule696 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule722 = new BitSet(new long[]{0x2000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_genericTextRule_in_codeBlockRule724 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule730 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule734 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_genericTextRule755 = new BitSet(new long[]{0xFFFF77FFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_genericTextRule773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule808 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_linkRule813 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule817 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule821 = new BitSet(new long[]{0x2000000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule824 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule828 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule831 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_linkRule833 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule857 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_imageRule862 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule866 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule870 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule872 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule875 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule877 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule898 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule900 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule925 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tableRule930 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule934 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule938 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule941 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule943 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule946 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule948 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule968 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule970 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule973 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule975 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1015 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule1017 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1020 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule1022 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule1049 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule1054 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule1058 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule1082 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule1086 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_functionRule1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule1096 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule1098 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule1100 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_functionRule1105 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_functionRule1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1126 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1130 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_forRule1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1134 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1136 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1138 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_forRule1141 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_forRule1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_classRule1162 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1166 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1168 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_functionRule_in_classRule1172 = new BitSet(new long[]{0x0004000000800000L});
	public static final BitSet FOLLOW_RCB_in_classRule1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTextRule_in_fieldRule1195 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1207 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1219 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1231 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1243 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldTextRule1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTextRule1270 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTextRule1273 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextRule1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1301 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldOlistRule1304 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldOlistRule1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1332 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldUlistRule1335 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldUlistRule1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1363 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTlistRule1366 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldTlistRule1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_listRule1394 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_listRule1397 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listRule1399 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1401 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRule1404 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1406 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listRule1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldTextAssignRule1432 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldTextAssignRule1434 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextAssignRule1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldListAssignRule1449 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldListAssignRule1451 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldListAssignRule1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_listAssignRule1465 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_listAssignRule1467 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listAssignRule1469 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1471 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listAssignRule1474 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1476 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listAssignRule1480 = new BitSet(new long[]{0x0000000000000002L});
}
