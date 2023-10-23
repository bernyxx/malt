// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-23 10:22:19

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
		"EX", "EXPONENT", "FLOAT", "FOR", "FORMATTEXT", "FUN", "G", "GET", "HA", 
		"HEX_DIGIT", "HL", "HRULE", "I", "IMG", "IN", "INTEGER", "IT", "ITBOLD", 
		"L", "LAB", "LCB", "LET", "LETTER", "LINK", "LIST", "LP", "LSB", "OCTAL_ESC", 
		"OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", 
		"S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", 
		"TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS"
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
	public static final int FORMATTEXT=21;
	public static final int FUN=22;
	public static final int G=23;
	public static final int GET=24;
	public static final int HA=25;
	public static final int HEX_DIGIT=26;
	public static final int HL=27;
	public static final int HRULE=28;
	public static final int I=29;
	public static final int IMG=30;
	public static final int IN=31;
	public static final int INTEGER=32;
	public static final int IT=33;
	public static final int ITBOLD=34;
	public static final int L=35;
	public static final int LAB=36;
	public static final int LCB=37;
	public static final int LET=38;
	public static final int LETTER=39;
	public static final int LINK=40;
	public static final int LIST=41;
	public static final int LP=42;
	public static final int LSB=43;
	public static final int OCTAL_ESC=44;
	public static final int OLIST=45;
	public static final int QU=46;
	public static final int R=47;
	public static final int RAB=48;
	public static final int RCB=49;
	public static final int RP=50;
	public static final int RSB=51;
	public static final int S1TITLE=52;
	public static final int S2TITLE=53;
	public static final int S3TITLE=54;
	public static final int S4TITLE=55;
	public static final int S5TITLE=56;
	public static final int SE=57;
	public static final int SL=58;
	public static final int ST=59;
	public static final int STRING=60;
	public static final int SUBS=61;
	public static final int SUPS=62;
	public static final int TABLE=63;
	public static final int TEXT=64;
	public static final int TITLE=65;
	public static final int TLIST=66;
	public static final int ULIST=67;
	public static final int UNICODE_ESC=68;
	public static final int US=69;
	public static final int VAR=70;
	public static final int WS=71;

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:1: parseJava : ( instrRule[null, null] | functionRule[null] | classRule )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:2: ( ( instrRule[null, null] | functionRule[null] | classRule )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[null, null] | functionRule[null] | classRule )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule[null, null] | functionRule[null] | classRule )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: instrRule[null, null]
					{
					pushFollow(FOLLOW_instrRule_in_parseJava52);
					instrRule(null, null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:28: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava57);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:49: classRule
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: instrRule[Token id, Token functionName] : ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) ;
	public final void instrRule(Token id, Token functionName) throws RecognitionException {
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE ) | ( ( quickLinkRule | horizontalRule ) SE ) | forRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: (r1= titleRule |r2= textDeclRule |r3= blockquoteRule |r4= olistRule |r5= ulistRule |r6= tlistRule |r7= codeBlockRule |r8= tableRule |r9= imageRule |r10= linkRule |r11= listRule |r12= formatText )
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
							pushFollow(FOLLOW_titleRule_in_instrRule92);
							r1=titleRule();
							state._fsp--;

							h.declareNew(id,functionName, (r1!=null?((MaltParser.titleRule_return)r1).type:null), (r1!=null?((MaltParser.titleRule_return)r1).name:null));
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: r2= textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule104);
							r2=textDeclRule();
							state._fsp--;

							h.declareNew(id,functionName, (r2!=null?((MaltParser.textDeclRule_return)r2).type:null), (r2!=null?((MaltParser.textDeclRule_return)r2).name:null));
							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: r3= blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule116);
							r3=blockquoteRule();
							state._fsp--;

							h.declareNew(id,functionName, (r3!=null?((MaltParser.blockquoteRule_return)r3).type:null), (r3!=null?((MaltParser.blockquoteRule_return)r3).name:null));
							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: r4= olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule128);
							r4=olistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r4!=null?((MaltParser.olistRule_return)r4).type:null), (r4!=null?((MaltParser.olistRule_return)r4).name:null));
							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: r5= ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule140);
							r5=ulistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r5!=null?((MaltParser.ulistRule_return)r5).type:null), (r5!=null?((MaltParser.ulistRule_return)r5).name:null));
							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: r6= tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule152);
							r6=tlistRule();
							state._fsp--;

							h.declareNew(id,functionName, (r6!=null?((MaltParser.tlistRule_return)r6).type:null), (r6!=null?((MaltParser.tlistRule_return)r6).name:null));
							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:5: r7= codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule164);
							r7=codeBlockRule();
							state._fsp--;

							h.declareNew(id,functionName, (r7!=null?((MaltParser.codeBlockRule_return)r7).type:null), (r7!=null?((MaltParser.codeBlockRule_return)r7).name:null));
							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: r8= tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule176);
							r8=tableRule();
							state._fsp--;

							h.declareNew(id,functionName, (r8!=null?((MaltParser.tableRule_return)r8).type:null), (r8!=null?((MaltParser.tableRule_return)r8).name:null));
							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: r9= imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule188);
							r9=imageRule();
							state._fsp--;

							h.declareNew(id,functionName, (r9!=null?((MaltParser.imageRule_return)r9).type:null), (r9!=null?((MaltParser.imageRule_return)r9).name:null));
							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:5: r10= linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule200);
							r10=linkRule();
							state._fsp--;

							h.declareNew(id,functionName, (r10!=null?((MaltParser.linkRule_return)r10).type:null), (r10!=null?((MaltParser.linkRule_return)r10).name:null));
							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:5: r11= listRule
							{
							pushFollow(FOLLOW_listRule_in_instrRule212);
							r11=listRule();
							state._fsp--;

							h.declareNew(id,functionName, (r11!=null?((MaltParser.listRule_return)r11).type:null), (r11!=null?((MaltParser.listRule_return)r11).name:null));
							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:5: r12= formatText
							{
							pushFollow(FOLLOW_formatText_in_instrRule224);
							r12=formatText();
							state._fsp--;

							h.declareNew(id,functionName, (r12!=null?((MaltParser.formatText_return)r12).type:null), (r12!=null?((MaltParser.formatText_return)r12).name:null));
							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule229); 
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
							pushFollow(FOLLOW_quickLinkRule_in_instrRule241);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule247);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule253); 
					}

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule258);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:1: titleRule returns [Token name, Token type] : t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? ;
	public final MaltParser.titleRule_return titleRule() throws RecognitionException {
		MaltParser.titleRule_return retval = new MaltParser.titleRule_return();
		retval.start = input.LT(1);

		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:2: (t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:3: t= titleTypeRule (n= VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule283);
			t=titleTypeRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:19: (n= VAR EQ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:20: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_titleRule288); 
					match(input,EQ,FOLLOW_EQ_in_titleRule290); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule294); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:38: ( refRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LCB) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:38: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule296);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule322); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule328); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule334); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule340); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule346); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule352); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule367); 
			match(input,HA,FOLLOW_HA_in_refRule369); 
			match(input,VAR,FOLLOW_VAR_in_refRule371); 
			match(input,RCB,FOLLOW_RCB_in_refRule373); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:1: textDeclRule returns [Token name, Token type] : t= TEXT (n= VAR EQ )? STRING ;
	public final MaltParser.textDeclRule_return textDeclRule() throws RecognitionException {
		MaltParser.textDeclRule_return retval = new MaltParser.textDeclRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:2: (t= TEXT (n= VAR EQ )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:3: t= TEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule392); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:10: (n= VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_textDeclRule397); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule399); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_textDeclRule403); 
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


	public static class blockquoteRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "blockquoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:1: blockquoteRule returns [Token name, Token type] : t= BLOCKQUOTE (n= VAR EQ )? STRING ;
	public final MaltParser.blockquoteRule_return blockquoteRule() throws RecognitionException {
		MaltParser.blockquoteRule_return retval = new MaltParser.blockquoteRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:2: (t= BLOCKQUOTE (n= VAR EQ )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:3: t= BLOCKQUOTE (n= VAR EQ )? STRING
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule427); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:16: (n= VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_blockquoteRule432); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule436); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_blockquoteRule440); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:1: olistRule returns [Token name, Token type] : t= OLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.olistRule_return olistRule() throws RecognitionException {
		MaltParser.olistRule_return retval = new MaltParser.olistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:2: (t= OLIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:3: t= OLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule462); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:11: (n= VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_olistRule467); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_olistRule471); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule475);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:2: ( LP STRING ( CM STRING )+ RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule489); 
			match(input,STRING,FOLLOW_STRING_in_textListRule491); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:14: ( CM STRING )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule494); 
					match(input,STRING,FOLLOW_STRING_in_textListRule496); 
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule500); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:1: ulistRule returns [Token name, Token type] : t= ULIST (n= VAR EQ )? textListRule ;
	public final MaltParser.ulistRule_return ulistRule() throws RecognitionException {
		MaltParser.ulistRule_return retval = new MaltParser.ulistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:2: (t= ULIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:92:3: t= ULIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule518); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:92:11: (n= VAR EQ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:92:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_ulistRule523); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_ulistRule527); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule531);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:1: tlistRule returns [Token name, Token type] : t= TLIST (n= VAR EQ )? textListRule ;
	public final MaltParser.tlistRule_return tlistRule() throws RecognitionException {
		MaltParser.tlistRule_return retval = new MaltParser.tlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:2: (t= TLIST (n= VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:3: t= TLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule553); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:11: (n= VAR EQ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tlistRule558); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tlistRule562); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule566);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:1: codeBlockRule returns [Token name, Token type] : t= CODEBLOCK ( genericString )? (n= VAR EQ )? STRING ;
	public final MaltParser.codeBlockRule_return codeBlockRule() throws RecognitionException {
		MaltParser.codeBlockRule_return retval = new MaltParser.codeBlockRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:2: (t= CODEBLOCK ( genericString )? (n= VAR EQ )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:3: t= CODEBLOCK ( genericString )? (n= VAR EQ )? STRING
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule588); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:15: ( genericString )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:15: genericString
					{
					pushFollow(FOLLOW_genericString_in_codeBlockRule590);
					genericString();
					state._fsp--;

					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:30: (n= VAR EQ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:31: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_codeBlockRule596); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule600); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_codeBlockRule604); 
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



	// $ANTLR start "genericString"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:1: genericString : ( LP (~ ( LP | RP | '\"' ) )* RP ) ;
	public final void genericString() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:2: ( ( LP (~ ( LP | RP | '\"' ) )* RP ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:4: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_genericString621); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:7: (~ ( LP | RP | '\"' ) )*
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

			match(input,RP,FOLLOW_RP_in_genericString639); 
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
	// $ANTLR end "genericString"



	// $ANTLR start "horizontalRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule652); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:1: linkRule returns [Token name, Token type] : t= LINK (n= VAR EQ )? LP ( STRING | imageRule ) CM genericString RP ;
	public final MaltParser.linkRule_return linkRule() throws RecognitionException {
		MaltParser.linkRule_return retval = new MaltParser.linkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:2: (t= LINK (n= VAR EQ )? LP ( STRING | imageRule ) CM genericString RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:3: t= LINK (n= VAR EQ )? LP ( STRING | imageRule ) CM genericString RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule674); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:10: (n= VAR EQ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==VAR) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_linkRule679); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_linkRule683); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule687); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:51: ( STRING | imageRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:52: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_linkRule690); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:61: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule694);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule697); 
			pushFollow(FOLLOW_genericString_in_linkRule699);
			genericString();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule701); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:1: imageRule returns [Token name, Token type] : t= IMG (n= VAR EQ )? LP genericString ( CM genericString )? RP ;
	public final MaltParser.imageRule_return imageRule() throws RecognitionException {
		MaltParser.imageRule_return retval = new MaltParser.imageRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:2: (t= IMG (n= VAR EQ )? LP genericString ( CM genericString )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:3: t= IMG (n= VAR EQ )? LP genericString ( CM genericString )? RP
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule723); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:9: (n= VAR EQ )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:10: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_imageRule728); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_imageRule732); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule736); 
			pushFollow(FOLLOW_genericString_in_imageRule738);
			genericString();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:64: ( CM genericString )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CM) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:65: CM genericString
					{
					match(input,CM,FOLLOW_CM_in_imageRule741); 
					pushFollow(FOLLOW_genericString_in_imageRule743);
					genericString();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule747); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:2: ( LAB STRING RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule764); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule766); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule768); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:1: tableRule returns [Token name, Token type] : t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final MaltParser.tableRule_return tableRule() throws RecognitionException {
		MaltParser.tableRule_return retval = new MaltParser.tableRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:2: (t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule791); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:11: (n= VAR EQ )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tableRule796); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_tableRule800); 
					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:49: ( talignmentRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LSB) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:49: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule804);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule807); 
			pushFollow(FOLLOW_trowRule_in_tableRule809);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:77: ( CM trowRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:78: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule812); 
					pushFollow(FOLLOW_trowRule_in_tableRule814);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule818); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:2: ( LSB alignRule ( CM alignRule )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule834); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule836);
			alignRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:17: ( CM alignRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule839); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule841);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule845); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:2: ( L | C | R )
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:2: ( LSB STRING ( CM STRING )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule877); 
			match(input,STRING,FOLLOW_STRING_in_trowRule879); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:14: ( CM STRING )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule882); 
					match(input,STRING,FOLLOW_STRING_in_trowRule884); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule888); 
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


	public static class formatText_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "formatText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: formatText returns [Token name, Token type] : t= FORMATTEXT (n= VAR EQ )? STRING ;
	public final MaltParser.formatText_return formatText() throws RecognitionException {
		MaltParser.formatText_return retval = new MaltParser.formatText_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: (t= FORMATTEXT (n= VAR EQ )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: t= FORMATTEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatText907); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:16: (n= VAR EQ )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==VAR) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_formatText912); 
					retval.name = n; retval.type = t;
					match(input,EQ,FOLLOW_EQ_in_formatText916); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatText920); 
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
	// $ANTLR end "formatText"



	// $ANTLR start "functionRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[$n, className] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[$n, className] ) )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[$n, className] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule940); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule944); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule948); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:50: ( argumentsRule[className, $n] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==BLOCKQUOTE||LA27_0==CODEBLOCK||LA27_0==FORMATTEXT||LA27_0==IMG||(LA27_0 >= LINK && LA27_0 <= LIST)||LA27_0==OLIST||(LA27_0 >= S1TITLE && LA27_0 <= S5TITLE)||(LA27_0 >= TABLE && LA27_0 <= ULIST)) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule951);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule956); 
			match(input,LCB,FOLLOW_LCB_in_functionRule958); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:89: ( ( fieldRule[className,$n] ) | ( assignRule[$n, className] ) )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==BLOCKQUOTE||LA28_0==CODEBLOCK||LA28_0==FORMATTEXT||LA28_0==IMG||(LA28_0 >= LINK && LA28_0 <= LIST)||LA28_0==OLIST||(LA28_0 >= S1TITLE && LA28_0 <= S5TITLE)||(LA28_0 >= TABLE && LA28_0 <= ULIST)) ) {
					alt28=1;
				}
				else if ( (LA28_0==VAR) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:90: ( fieldRule[className,$n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:90: ( fieldRule[className,$n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:91: fieldRule[className,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule962);
					fieldRule(className, n);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:118: ( assignRule[$n, className] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:118: ( assignRule[$n, className] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:119: assignRule[$n, className]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule969);
					assignRule(n, className);
					state._fsp--;

					}

					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule975); 
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



	// $ANTLR start "argumentsRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:1: argumentsRule[Token className, Token funcName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token funcName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule997);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule1001); 
			h.declareArg(className, funcName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:74: ( CM t= argumentTypeRule n= VAR )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==CM) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:75: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule1006); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule1010);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule1014); 
					h.declareArg(className, funcName, t, n);
					}
					break;

				default :
					break loop29;
				}
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
	// $ANTLR end "argumentsRule"



	// $ANTLR start "argumentTypeRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			int alt30=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt30=1;
				}
				break;
			case TEXT:
				{
				alt30=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt30=3;
				}
				break;
			case OLIST:
				{
				alt30=4;
				}
				break;
			case ULIST:
				{
				alt30=5;
				}
				break;
			case TLIST:
				{
				alt30=6;
				}
				break;
			case CODEBLOCK:
				{
				alt30=7;
				}
				break;
			case LINK:
				{
				alt30=8;
				}
				break;
			case IMG:
				{
				alt30=9;
				}
				break;
			case TABLE:
				{
				alt30=10;
				}
				break;
			case FORMATTEXT:
				{
				alt30=11;
				}
				break;
			case LIST:
				{
				alt30=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule1037);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule1045); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule1051); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule1057); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule1063); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule1069); 
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule1075); 
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule1081); 
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule1087); 
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule1093); 
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule1099); 
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule1105); 
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
	// $ANTLR end "argumentTypeRule"



	// $ANTLR start "forRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule[null,null] )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:2: ( FOR LP VAR IN VAR RP LCB ( instrRule[null,null] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:3: FOR LP VAR IN VAR RP LCB ( instrRule[null,null] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1120); 
			match(input,LP,FOLLOW_LP_in_forRule1122); 
			match(input,VAR,FOLLOW_VAR_in_forRule1124); 
			match(input,IN,FOLLOW_IN_in_forRule1126); 
			match(input,VAR,FOLLOW_VAR_in_forRule1128); 
			match(input,RP,FOLLOW_RP_in_forRule1130); 
			match(input,LCB,FOLLOW_LCB_in_forRule1132); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:28: ( instrRule[null,null] )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==BLOCKQUOTE||LA31_0==CODEBLOCK||(LA31_0 >= FOR && LA31_0 <= FORMATTEXT)||LA31_0==HRULE||LA31_0==IMG||LA31_0==LAB||(LA31_0 >= LINK && LA31_0 <= LIST)||LA31_0==OLIST||(LA31_0 >= S1TITLE && LA31_0 <= S5TITLE)||(LA31_0 >= TABLE && LA31_0 <= ULIST)) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:29: instrRule[null,null]
					{
					pushFollow(FOLLOW_instrRule_in_forRule1135);
					instrRule(null, null);
					state._fsp--;

					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			match(input,RCB,FOLLOW_RCB_in_forRule1140); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$f,$n] )* ( functionRule[$n] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:2: (f= CLASS n= VAR LCB ( fieldRule[$f,$n] )* ( functionRule[$n] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:3: f= CLASS n= VAR LCB ( fieldRule[$f,$n] )* ( functionRule[$n] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1158); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1162); 
			h.declareFunCl(f,n);
			match(input,LCB,FOLLOW_LCB_in_classRule1166); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:46: ( fieldRule[$f,$n] )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==BLOCKQUOTE||LA32_0==CODEBLOCK||LA32_0==FORMATTEXT||LA32_0==IMG||(LA32_0 >= LINK && LA32_0 <= LIST)||LA32_0==OLIST||(LA32_0 >= S1TITLE && LA32_0 <= S5TITLE)||(LA32_0 >= TABLE && LA32_0 <= ULIST)) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:46: fieldRule[$f,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1168);
					fieldRule(f, n);
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:64: ( functionRule[$n] )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==FUN) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:65: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1173);
					functionRule(n);
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1178); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:1: fieldRule[Token id, Token className] : (r1= fieldTitleRule[id, className] |r2= fieldText |r3= fieldBlockQuoteRule |r4= fieldOlistRule |r5= fieldUlistRule |r6= fieldTlistRule |r7= fieldCodeBlockRule |r8= fieldTableRule |r9= fieldImageRule |r10= fieldLinkRule |r11= listRule |r12= fieldFormatText ) SE ;
	public final void fieldRule(Token id, Token className) throws RecognitionException {
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:2: ( (r1= fieldTitleRule[id, className] |r2= fieldText |r3= fieldBlockQuoteRule |r4= fieldOlistRule |r5= fieldUlistRule |r6= fieldTlistRule |r7= fieldCodeBlockRule |r8= fieldTableRule |r9= fieldImageRule |r10= fieldLinkRule |r11= listRule |r12= fieldFormatText ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:3: (r1= fieldTitleRule[id, className] |r2= fieldText |r3= fieldBlockQuoteRule |r4= fieldOlistRule |r5= fieldUlistRule |r6= fieldTlistRule |r7= fieldCodeBlockRule |r8= fieldTableRule |r9= fieldImageRule |r10= fieldLinkRule |r11= listRule |r12= fieldFormatText ) SE
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:3: (r1= fieldTitleRule[id, className] |r2= fieldText |r3= fieldBlockQuoteRule |r4= fieldOlistRule |r5= fieldUlistRule |r6= fieldTlistRule |r7= fieldCodeBlockRule |r8= fieldTableRule |r9= fieldImageRule |r10= fieldLinkRule |r11= listRule |r12= fieldFormatText )
			int alt34=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt34=1;
				}
				break;
			case TEXT:
				{
				alt34=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt34=3;
				}
				break;
			case OLIST:
				{
				alt34=4;
				}
				break;
			case ULIST:
				{
				alt34=5;
				}
				break;
			case TLIST:
				{
				alt34=6;
				}
				break;
			case CODEBLOCK:
				{
				alt34=7;
				}
				break;
			case TABLE:
				{
				alt34=8;
				}
				break;
			case IMG:
				{
				alt34=9;
				}
				break;
			case LINK:
				{
				alt34=10;
				}
				break;
			case LIST:
				{
				alt34=11;
				}
				break;
			case FORMATTEXT:
				{
				alt34=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:5: r1= fieldTitleRule[id, className]
					{
					pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1202);
					r1=fieldTitleRule(id, className);
					state._fsp--;

					h.declareNew(id,className, (r1!=null?((MaltParser.fieldTitleRule_return)r1).type:null), (r1!=null?((MaltParser.fieldTitleRule_return)r1).name:null));
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:5: r2= fieldText
					{
					pushFollow(FOLLOW_fieldText_in_fieldRule1216);
					r2=fieldText();
					state._fsp--;

					h.declareNew(id,className, (r2!=null?((MaltParser.fieldText_return)r2).type:null), (r2!=null?((MaltParser.fieldText_return)r2).name:null));
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:5: r3= fieldBlockQuoteRule
					{
					pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1228);
					r3=fieldBlockQuoteRule();
					state._fsp--;

					h.declareNew(id,className, (r3!=null?((MaltParser.fieldBlockQuoteRule_return)r3).type:null), (r3!=null?((MaltParser.fieldBlockQuoteRule_return)r3).name:null));
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:5: r4= fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1240);
					r4=fieldOlistRule();
					state._fsp--;

					h.declareNew(id,className, (r4!=null?((MaltParser.fieldOlistRule_return)r4).type:null), (r4!=null?((MaltParser.fieldOlistRule_return)r4).name:null));
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:5: r5= fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1252);
					r5=fieldUlistRule();
					state._fsp--;

					h.declareNew(id,className, (r5!=null?((MaltParser.fieldUlistRule_return)r5).type:null), (r5!=null?((MaltParser.fieldUlistRule_return)r5).name:null));
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:5: r6= fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1264);
					r6=fieldTlistRule();
					state._fsp--;

					h.declareNew(id,className, (r6!=null?((MaltParser.fieldTlistRule_return)r6).type:null), (r6!=null?((MaltParser.fieldTlistRule_return)r6).name:null));
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:5: r7= fieldCodeBlockRule
					{
					pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1276);
					r7=fieldCodeBlockRule();
					state._fsp--;

					h.declareNew(id,className, (r7!=null?((MaltParser.fieldCodeBlockRule_return)r7).type:null), (r7!=null?((MaltParser.fieldCodeBlockRule_return)r7).name:null));
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:5: r8= fieldTableRule
					{
					pushFollow(FOLLOW_fieldTableRule_in_fieldRule1288);
					r8=fieldTableRule();
					state._fsp--;

					h.declareNew(id,className, (r8!=null?((MaltParser.fieldTableRule_return)r8).type:null), (r8!=null?((MaltParser.fieldTableRule_return)r8).name:null));
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:5: r9= fieldImageRule
					{
					pushFollow(FOLLOW_fieldImageRule_in_fieldRule1300);
					r9=fieldImageRule();
					state._fsp--;

					h.declareNew(id,className, (r9!=null?((MaltParser.fieldImageRule_return)r9).type:null), (r9!=null?((MaltParser.fieldImageRule_return)r9).name:null));
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:5: r10= fieldLinkRule
					{
					pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1312);
					r10=fieldLinkRule();
					state._fsp--;

					h.declareNew(id,className, (r10!=null?((MaltParser.fieldLinkRule_return)r10).type:null), (r10!=null?((MaltParser.fieldLinkRule_return)r10).name:null));
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:5: r11= listRule
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1324);
					r11=listRule();
					state._fsp--;

					h.declareNew(id,className, (r11!=null?((MaltParser.listRule_return)r11).type:null), (r11!=null?((MaltParser.listRule_return)r11).name:null));
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:5: r12= fieldFormatText
					{
					pushFollow(FOLLOW_fieldFormatText_in_fieldRule1337);
					r12=fieldFormatText();
					state._fsp--;

					h.declareNew(id,className, (r12!=null?((MaltParser.fieldFormatText_return)r12).type:null), (r12!=null?((MaltParser.fieldFormatText_return)r12).name:null));
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1342); 
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


	public static class fieldTitleRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:1: fieldTitleRule[Token id, Token className] returns [Token name, Token type] : t= titleTypeRule n= VAR ( assignTitleRule[$id, $className, $n] )? ;
	public final MaltParser.fieldTitleRule_return fieldTitleRule(Token id, Token className) throws RecognitionException {
		MaltParser.fieldTitleRule_return retval = new MaltParser.fieldTitleRule_return();
		retval.start = input.LT(1);

		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:2: (t= titleTypeRule n= VAR ( assignTitleRule[$id, $className, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:3: t= titleTypeRule n= VAR ( assignTitleRule[$id, $className, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1362);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1366); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:25: ( assignTitleRule[$id, $className, $n] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:26: assignTitleRule[$id, $className, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1369);
					assignTitleRule(id, className, n);
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
	// $ANTLR end "fieldTitleRule"


	public static class fieldText_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:1: fieldText returns [Token name, Token type] : t= TEXT n= VAR ( assignString )? ;
	public final MaltParser.fieldText_return fieldText() throws RecognitionException {
		MaltParser.fieldText_return retval = new MaltParser.fieldText_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:2: (t= TEXT n= VAR ( assignString )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:3: t= TEXT n= VAR ( assignString )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1392); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1396); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:16: ( assignString )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:17: assignString
					{
					pushFollow(FOLLOW_assignString_in_fieldText1399);
					assignString();
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
	// $ANTLR end "fieldText"


	public static class fieldBlockQuoteRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldBlockQuoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:1: fieldBlockQuoteRule returns [Token name, Token type] : t= BLOCKQUOTE n= VAR ( assignString )? ;
	public final MaltParser.fieldBlockQuoteRule_return fieldBlockQuoteRule() throws RecognitionException {
		MaltParser.fieldBlockQuoteRule_return retval = new MaltParser.fieldBlockQuoteRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:2: (t= BLOCKQUOTE n= VAR ( assignString )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:3: t= BLOCKQUOTE n= VAR ( assignString )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1421); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1425); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:48: ( assignString )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQ) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:49: assignString
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1430);
					assignString();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldBlockQuoteRule"


	public static class fieldOlistRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldOlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:1: fieldOlistRule returns [Token name, Token type] : t= OLIST n= VAR ( assignTextListRule )? ;
	public final MaltParser.fieldOlistRule_return fieldOlistRule() throws RecognitionException {
		MaltParser.fieldOlistRule_return retval = new MaltParser.fieldOlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:2: (t= OLIST n= VAR ( assignTextListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:3: t= OLIST n= VAR ( assignTextListRule )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1450); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1454); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:17: ( assignTextListRule )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EQ) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:18: assignTextListRule
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1457);
					assignTextListRule();
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:1: fieldUlistRule returns [Token name, Token type] : t= ULIST n= VAR ( assignTextListRule )? ;
	public final MaltParser.fieldUlistRule_return fieldUlistRule() throws RecognitionException {
		MaltParser.fieldUlistRule_return retval = new MaltParser.fieldUlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:2: (t= ULIST n= VAR ( assignTextListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:3: t= ULIST n= VAR ( assignTextListRule )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1479); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1483); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:17: ( assignTextListRule )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==EQ) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:18: assignTextListRule
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1486);
					assignTextListRule();
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:1: fieldTlistRule returns [Token name, Token type] : t= TLIST n= VAR ( assignTextListRule )? ;
	public final MaltParser.fieldTlistRule_return fieldTlistRule() throws RecognitionException {
		MaltParser.fieldTlistRule_return retval = new MaltParser.fieldTlistRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:2: (t= TLIST n= VAR ( assignTextListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:3: t= TLIST n= VAR ( assignTextListRule )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1508); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1512); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:17: ( assignTextListRule )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==EQ) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:18: assignTextListRule
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1515);
					assignTextListRule();
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


	public static class fieldCodeBlockRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldCodeBlockRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:1: fieldCodeBlockRule returns [Token name, Token type] : t= CODEBLOCK ( genericString )? n= VAR ( assignString )? ;
	public final MaltParser.fieldCodeBlockRule_return fieldCodeBlockRule() throws RecognitionException {
		MaltParser.fieldCodeBlockRule_return retval = new MaltParser.fieldCodeBlockRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:2: (t= CODEBLOCK ( genericString )? n= VAR ( assignString )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:3: t= CODEBLOCK ( genericString )? n= VAR ( assignString )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1537); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:15: ( genericString )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LP) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:15: genericString
					{
					pushFollow(FOLLOW_genericString_in_fieldCodeBlockRule1539);
					genericString();
					state._fsp--;

					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1544); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:62: ( assignString )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==EQ) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:63: assignString
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1549);
					assignString();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldCodeBlockRule"


	public static class fieldTableRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:1: fieldTableRule returns [Token name, Token type] : t= TABLE n= VAR ( assignTableRule )? ;
	public final MaltParser.fieldTableRule_return fieldTableRule() throws RecognitionException {
		MaltParser.fieldTableRule_return retval = new MaltParser.fieldTableRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:2: (t= TABLE n= VAR ( assignTableRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:3: t= TABLE n= VAR ( assignTableRule )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1569); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1573); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:43: ( assignTableRule )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==EQ) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:44: assignTableRule
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1578);
					assignTableRule();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldTableRule"


	public static class fieldImageRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:1: fieldImageRule returns [Token name, Token type] : t= IMG n= VAR ( assignImageRule )? ;
	public final MaltParser.fieldImageRule_return fieldImageRule() throws RecognitionException {
		MaltParser.fieldImageRule_return retval = new MaltParser.fieldImageRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:2: (t= IMG n= VAR ( assignImageRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:3: t= IMG n= VAR ( assignImageRule )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1598); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1602); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:41: ( assignImageRule )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==EQ) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:42: assignImageRule
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1607);
					assignImageRule();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldImageRule"


	public static class fieldLinkRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:1: fieldLinkRule returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule() throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:2: (t= LINK n= VAR ( assignLinkRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:3: t= LINK n= VAR ( assignLinkRule )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1627); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1631); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:42: ( assignLinkRule )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==EQ) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:43: assignLinkRule
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1636);
					assignLinkRule();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldLinkRule"


	public static class fieldFormatText_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldFormatText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:1: fieldFormatText returns [Token name, Token type] : t= FORMATTEXT n= VAR ( assignString )? ;
	public final MaltParser.fieldFormatText_return fieldFormatText() throws RecognitionException {
		MaltParser.fieldFormatText_return retval = new MaltParser.fieldFormatText_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:2: (t= FORMATTEXT n= VAR ( assignString )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:3: t= FORMATTEXT n= VAR ( assignString )?
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_fieldFormatText1656); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldFormatText1660); 
			retval.name = n; retval.type = t;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:48: ( assignString )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==EQ) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:49: assignString
					{
					pushFollow(FOLLOW_assignString_in_fieldFormatText1665);
					assignString();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "fieldFormatText"


	public static class listRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "listRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:1: listRule returns [Token name, Token type] : t= LIST n= VAR ( assignListRule )? ;
	public final MaltParser.listRule_return listRule() throws RecognitionException {
		MaltParser.listRule_return retval = new MaltParser.listRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:2: (t= LIST n= VAR ( assignListRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:3: t= LIST n= VAR ( assignListRule )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1686); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1690); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:16: ( assignListRule )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==EQ) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:17: assignListRule
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1693);
					assignListRule();
					state._fsp--;

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



	// $ANTLR start "assignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:1: assignRule[Token id, Token className] : n= VAR ( assignTitleRule[$id, $className, $n] | assignTextListRule | assignTableRule | assignImageRule | assignLinkRule | assignListRule ) SE ;
	public final void assignRule(Token id, Token className) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:2: (n= VAR ( assignTitleRule[$id, $className, $n] | assignTextListRule | assignTableRule | assignImageRule | assignLinkRule | assignListRule ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:2: n= VAR ( assignTitleRule[$id, $className, $n] | assignTextListRule | assignTableRule | assignImageRule | assignLinkRule | assignListRule ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1719); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:8: ( assignTitleRule[$id, $className, $n] | assignTextListRule | assignTableRule | assignImageRule | assignLinkRule | assignListRule )
			int alt48=6;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==EQ) ) {
				switch ( input.LA(2) ) {
				case STRING:
					{
					alt48=1;
					}
					break;
				case LP:
					{
					switch ( input.LA(3) ) {
					case STRING:
						{
						int LA48_5 = input.LA(4);
						if ( (LA48_5==CM) ) {
							int LA48_10 = input.LA(5);
							if ( (LA48_10==STRING) ) {
								alt48=2;
							}
							else if ( (LA48_10==LP) ) {
								alt48=5;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 48, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 48, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LP:
						{
						alt48=4;
						}
						break;
					case IMG:
						{
						alt48=5;
						}
						break;
					case LSB:
						{
						alt48=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 48, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LSB:
					{
					int LA48_4 = input.LA(3);
					if ( (LA48_4==STRING) ) {
						alt48=6;
					}
					else if ( (LA48_4==C||LA48_4==L||LA48_4==R) ) {
						alt48=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 48, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:9: assignTitleRule[$id, $className, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1722);
					assignTitleRule(id, className, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:48: assignTextListRule
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1727);
					assignTextListRule();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:69: assignTableRule
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1731);
					assignTableRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:87: assignImageRule
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1735);
					assignImageRule();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:105: assignLinkRule
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1739);
					assignLinkRule();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:122: assignListRule
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1743);
					assignListRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1746); 
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
	// $ANTLR end "assignRule"



	// $ANTLR start "assignTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:1: assignTitleRule[Token id, Token className, Token name] : v= assignString ( refRule )? ;
	public final void assignTitleRule(Token id, Token className, Token name) throws RecognitionException {
		Token v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:2: (v= assignString ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:3: v= assignString ( refRule )?
			{
			pushFollow(FOLLOW_assignString_in_assignTitleRule1762);
			v=assignString();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:18: ( refRule )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LCB) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:18: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1764);
					refRule();
					state._fsp--;

					}
					break;

			}

			h.assignVarValue(id, className, name, v);
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
	// $ANTLR end "assignTitleRule"



	// $ANTLR start "assignString"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:1: assignString returns [Token value] : EQ v= STRING ;
	public final Token assignString() throws RecognitionException {
		Token value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1783); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1787); 
			value = v;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "assignString"



	// $ANTLR start "assignTextListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:1: assignTextListRule : EQ textListRule ;
	public final void assignTextListRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:2: ( EQ textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:3: EQ textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1802); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1804);
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
	// $ANTLR end "assignTextListRule"



	// $ANTLR start "assignTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:1: assignTableRule : EQ ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void assignTableRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:2: ( EQ ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:3: EQ ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1816); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:6: ( talignmentRule )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LSB) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:6: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1818);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_assignTableRule1821); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1823);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:34: ( CM trowRule )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==CM) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:35: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_assignTableRule1826); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1828);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop51;
				}
			}

			match(input,RP,FOLLOW_RP_in_assignTableRule1832); 
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
	// $ANTLR end "assignTableRule"



	// $ANTLR start "assignImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:1: assignImageRule : EQ LP genericString ( CM genericString )? RP ;
	public final void assignImageRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:2: ( EQ LP genericString ( CM genericString )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:3: EQ LP genericString ( CM genericString )? RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignImageRule1844); 
			match(input,LP,FOLLOW_LP_in_assignImageRule1846); 
			pushFollow(FOLLOW_genericString_in_assignImageRule1848);
			genericString();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:23: ( CM genericString )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==CM) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:24: CM genericString
					{
					match(input,CM,FOLLOW_CM_in_assignImageRule1851); 
					pushFollow(FOLLOW_genericString_in_assignImageRule1853);
					genericString();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_assignImageRule1857); 
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
	// $ANTLR end "assignImageRule"



	// $ANTLR start "assignLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:1: assignLinkRule : EQ LP ( STRING | imageRule ) CM genericString RP ;
	public final void assignLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:303:2: ( EQ LP ( STRING | imageRule ) CM genericString RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:3: EQ LP ( STRING | imageRule ) CM genericString RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignLinkRule1869); 
			match(input,LP,FOLLOW_LP_in_assignLinkRule1871); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:9: ( STRING | imageRule )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==STRING) ) {
				alt53=1;
			}
			else if ( (LA53_0==IMG) ) {
				alt53=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_assignLinkRule1874); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1878);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_assignLinkRule1881); 
			pushFollow(FOLLOW_genericString_in_assignLinkRule1883);
			genericString();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_assignLinkRule1885); 
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
	// $ANTLR end "assignLinkRule"



	// $ANTLR start "assignListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:1: assignListRule : EQ LSB STRING ( CM STRING )+ RSB ;
	public final void assignListRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:2: ( EQ LSB STRING ( CM STRING )+ RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:310:3: EQ LSB STRING ( CM STRING )+ RSB
			{
			match(input,EQ,FOLLOW_EQ_in_assignListRule1898); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1900); 
			match(input,STRING,FOLLOW_STRING_in_assignListRule1902); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:310:17: ( CM STRING )+
			int cnt54=0;
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==CM) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:310:18: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_assignListRule1905); 
					match(input,STRING,FOLLOW_STRING_in_assignListRule1907); 
					}
					break;

				default :
					if ( cnt54 >= 1 ) break loop54;
					EarlyExitException eee = new EarlyExitException(54, input);
					throw eee;
				}
				cnt54++;
			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule1911); 
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
	// $ANTLR end "assignListRule"

	// Delegated rules



	public static final BitSet FOLLOW_instrRule_in_parseJava52 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000000FL});
	public static final BitSet FOLLOW_functionRule_in_parseJava57 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000000FL});
	public static final BitSet FOLLOW_classRule_in_parseJava62 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000000FL});
	public static final BitSet FOLLOW_EOF_in_parseJava67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule92 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule104 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule116 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule128 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule140 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule152 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule164 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule176 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule188 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule200 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule212 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_formatText_in_instrRule224 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule241 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule247 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule283 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_titleRule288 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule290 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule294 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule367 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_HA_in_refRule369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_refRule371 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule392 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule397 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule399 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textDeclRule403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule427 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule432 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule436 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_blockquoteRule440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule462 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_olistRule467 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule471 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule489 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule491 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule494 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule496 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule518 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_ulistRule523 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule527 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule553 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_tlistRule558 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule562 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule588 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_genericString_in_codeBlockRule590 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule596 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule600 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_genericString621 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000000FFL});
	public static final BitSet FOLLOW_RP_in_genericString639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule674 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_linkRule679 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule683 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule687 = new BitSet(new long[]{0x1000000040000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule690 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule694 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule697 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_linkRule699 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule723 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_imageRule728 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule732 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule736 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_imageRule738 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule741 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_imageRule743 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule764 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule766 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule791 = new BitSet(new long[]{0x00000C0000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_tableRule796 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule800 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule804 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule807 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule809 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule812 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule814 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule834 = new BitSet(new long[]{0x0000800800000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule836 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule839 = new BitSet(new long[]{0x0000800800000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule841 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule877 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule879 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule882 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule884 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatText907 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_formatText912 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatText916 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatText920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_functionRule944 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule948 = new BitSet(new long[]{0x81F4230040200810L,0x000000000000000FL});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule951 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule956 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule958 = new BitSet(new long[]{0x81F0230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_fieldRule_in_functionRule962 = new BitSet(new long[]{0x81F2230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_assignRule_in_functionRule969 = new BitSet(new long[]{0x81F2230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_RCB_in_functionRule975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule1001 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule1006 = new BitSet(new long[]{0x81F0230040200810L,0x000000000000000FL});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule1014 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1120 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_forRule1124 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_forRule1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_forRule1128 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1130 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1132 = new BitSet(new long[]{0x81F0231050300810L,0x000000000000000FL});
	public static final BitSet FOLLOW_instrRule_in_forRule1135 = new BitSet(new long[]{0x81F2231050300810L,0x000000000000000FL});
	public static final BitSet FOLLOW_RCB_in_forRule1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_classRule1162 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1166 = new BitSet(new long[]{0x81F2230040600810L,0x000000000000000FL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1168 = new BitSet(new long[]{0x81F2230040600810L,0x000000000000000FL});
	public static final BitSet FOLLOW_functionRule_in_classRule1173 = new BitSet(new long[]{0x0002000000400000L});
	public static final BitSet FOLLOW_RCB_in_classRule1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1202 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1216 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1228 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1240 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1252 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1264 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1276 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1288 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1300 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1312 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1324 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldFormatText_in_fieldRule1337 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1366 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldText1396 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1425 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1454 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1483 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1512 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1537 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_genericString_in_fieldCodeBlockRule1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1544 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1573 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1602 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1631 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_fieldFormatText1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldFormatText1660 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldFormatText1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_listRule1690 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1719 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1722 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1727 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1731 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1735 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1739 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1743 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignString_in_assignTitleRule1762 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1783 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignString1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1802 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1816 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1818 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1821 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1823 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1826 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1828 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignImageRule1844 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1846 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_assignImageRule1848 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1851 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_assignImageRule1853 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignLinkRule1869 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1871 = new BitSet(new long[]{0x1000000040000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1874 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1878 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1881 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericString_in_assignLinkRule1883 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1898 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1900 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1902 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1905 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1907 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1911 = new BitSet(new long[]{0x0000000000000002L});
}
