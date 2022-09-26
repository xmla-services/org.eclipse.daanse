package org.eclipse.daanse.mdx.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.daanse.mdx.xtext.services.MdxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMdxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FORMATTED_VALUE", "CELL_ORDINAL", "PROPERTIES", "DIMENSION", "MEMBER", "SELECT", "EMPTY", "VALUE", "WHERE", "CASE", "CELL", "ELSE", "FROM", "THEN", "WHEN", "WITH", "AND", "END", "NON", "NOT", "SET", "XOR", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "AS", "ON", "OR", "VerticalLineVerticalLine", "Apostrophe", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_DIGIT", "RULE_AMP_QUOTED_ID", "RULE_QUOTED_ID", "RULE_LETTER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int LessThanSignGreaterThanSign=27;
    public static final int PROPERTIES=6;
    public static final int VALUE=11;
    public static final int FROM=16;
    public static final int LessThanSign=44;
    public static final int WHEN=18;
    public static final int LeftParenthesis=34;
    public static final int DIMENSION=7;
    public static final int ELSE=15;
    public static final int GreaterThanSign=46;
    public static final int RULE_ID=49;
    public static final int RULE_QUOTED_ID=52;
    public static final int RightParenthesis=35;
    public static final int RULE_DIGIT=50;
    public static final int FORMATTED_VALUE=4;
    public static final int WHERE=12;
    public static final int NON=22;
    public static final int CASE=13;
    public static final int GreaterThanSignEqualsSign=28;
    public static final int NOT=23;
    public static final int AS=29;
    public static final int PlusSign=37;
    public static final int RULE_INT=54;
    public static final int AND=20;
    public static final int RULE_ML_COMMENT=56;
    public static final int THEN=17;
    public static final int END=21;
    public static final int XOR=25;
    public static final int SET=24;
    public static final int VerticalLineVerticalLine=32;
    public static final int RULE_STRING=55;
    public static final int MEMBER=8;
    public static final int RULE_SL_COMMENT=57;
    public static final int Comma=38;
    public static final int EqualsSign=45;
    public static final int HyphenMinus=39;
    public static final int LessThanSignEqualsSign=26;
    public static final int Solidus=41;
    public static final int Colon=42;
    public static final int RightCurlyBracket=48;
    public static final int EOF=-1;
    public static final int EMPTY=10;
    public static final int Apostrophe=33;
    public static final int Asterisk=36;
    public static final int CELL_ORDINAL=5;
    public static final int ON=30;
    public static final int FullStop=40;
    public static final int OR=31;
    public static final int RULE_WS=58;
    public static final int LeftCurlyBracket=47;
    public static final int RULE_ANY_OTHER=59;
    public static final int SELECT=9;
    public static final int WITH=19;
    public static final int Semicolon=43;
    public static final int RULE_LETTER=53;
    public static final int RULE_AMP_QUOTED_ID=51;
    public static final int CELL=14;

    // delegates
    // delegators


        public InternalMdxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMdxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMdxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMdxParser.g"; }



     	private MdxGrammarAccess grammarAccess;

        public InternalMdxParser(TokenStream input, MdxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MdxStatement";
       	}

       	@Override
       	protected MdxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMdxStatement"
    // InternalMdxParser.g:57:1: entryRuleMdxStatement returns [EObject current=null] : iv_ruleMdxStatement= ruleMdxStatement EOF ;
    public final EObject entryRuleMdxStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMdxStatement = null;


        try {
            // InternalMdxParser.g:57:53: (iv_ruleMdxStatement= ruleMdxStatement EOF )
            // InternalMdxParser.g:58:2: iv_ruleMdxStatement= ruleMdxStatement EOF
            {
             newCompositeNode(grammarAccess.getMdxStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMdxStatement=ruleMdxStatement();

            state._fsp--;

             current =iv_ruleMdxStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMdxStatement"


    // $ANTLR start "ruleMdxStatement"
    // InternalMdxParser.g:64:1: ruleMdxStatement returns [EObject current=null] : this_SelectStatement_0= ruleSelectStatement ;
    public final EObject ruleMdxStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:70:2: (this_SelectStatement_0= ruleSelectStatement )
            // InternalMdxParser.g:71:2: this_SelectStatement_0= ruleSelectStatement
            {

            		newCompositeNode(grammarAccess.getMdxStatementAccess().getSelectStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SelectStatement_0=ruleSelectStatement();

            state._fsp--;


            		current = this_SelectStatement_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMdxStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalMdxParser.g:82:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalMdxParser.g:82:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalMdxParser.g:83:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalMdxParser.g:89:1: ruleSelectStatement returns [EObject current=null] : ( () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT ( ruleaxis_specification_list )? otherlv_5= FROM rulecube_specification (otherlv_7= WHERE ruleslicer_specification )? ( rulecell_props )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMdxParser.g:95:2: ( ( () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT ( ruleaxis_specification_list )? otherlv_5= FROM rulecube_specification (otherlv_7= WHERE ruleslicer_specification )? ( rulecell_props )? ) )
            // InternalMdxParser.g:96:2: ( () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT ( ruleaxis_specification_list )? otherlv_5= FROM rulecube_specification (otherlv_7= WHERE ruleslicer_specification )? ( rulecell_props )? )
            {
            // InternalMdxParser.g:96:2: ( () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT ( ruleaxis_specification_list )? otherlv_5= FROM rulecube_specification (otherlv_7= WHERE ruleslicer_specification )? ( rulecell_props )? )
            // InternalMdxParser.g:97:3: () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT ( ruleaxis_specification_list )? otherlv_5= FROM rulecube_specification (otherlv_7= WHERE ruleslicer_specification )? ( rulecell_props )?
            {
            // InternalMdxParser.g:97:3: ()
            // InternalMdxParser.g:98:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectStatementAccess().getSelectStatementAction_0(),
            					current);
            			

            }

            // InternalMdxParser.g:104:3: (otherlv_1= WITH ruleFormulaSpecification )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WITH) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMdxParser.g:105:4: otherlv_1= WITH ruleFormulaSpecification
                    {
                    otherlv_1=(Token)match(input,WITH,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getWITHKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSelectStatementAccess().getFormulaSpecificationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_4);
                    ruleFormulaSpecification();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,SELECT,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getSELECTKeyword_2());
            		
            // InternalMdxParser.g:121:3: ( ruleaxis_specification_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=PROPERTIES && LA2_0<=DIMENSION)||LA2_0==CASE||(LA2_0>=NON && LA2_0<=NOT)||LA2_0==LeftParenthesis||LA2_0==PlusSign||LA2_0==HyphenMinus||LA2_0==LeftCurlyBracket||LA2_0==RULE_ID||LA2_0==RULE_QUOTED_ID||(LA2_0>=RULE_INT && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMdxParser.g:122:4: ruleaxis_specification_list
                    {

                    				newCompositeNode(grammarAccess.getSelectStatementAccess().getAxis_specification_listParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_6);
                    ruleaxis_specification_list();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,FROM,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getFROMKeyword_4());
            		

            			newCompositeNode(grammarAccess.getSelectStatementAccess().getCube_specificationParserRuleCall_5());
            		
            pushFollow(FOLLOW_8);
            rulecube_specification();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:141:3: (otherlv_7= WHERE ruleslicer_specification )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMdxParser.g:142:4: otherlv_7= WHERE ruleslicer_specification
                    {
                    otherlv_7=(Token)match(input,WHERE,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelectStatementAccess().getWHEREKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getSelectStatementAccess().getSlicer_specificationParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_10);
                    ruleslicer_specification();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMdxParser.g:154:3: ( rulecell_props )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PROPERTIES||LA4_0==CELL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMdxParser.g:155:4: rulecell_props
                    {

                    				newCompositeNode(grammarAccess.getSelectStatementAccess().getCell_propsParserRuleCall_7());
                    			
                    pushFollow(FOLLOW_2);
                    rulecell_props();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleFormulaSpecification"
    // InternalMdxParser.g:167:1: entryRuleFormulaSpecification returns [String current=null] : iv_ruleFormulaSpecification= ruleFormulaSpecification EOF ;
    public final String entryRuleFormulaSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFormulaSpecification = null;


        try {
            // InternalMdxParser.g:167:60: (iv_ruleFormulaSpecification= ruleFormulaSpecification EOF )
            // InternalMdxParser.g:168:2: iv_ruleFormulaSpecification= ruleFormulaSpecification EOF
            {
             newCompositeNode(grammarAccess.getFormulaSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaSpecification=ruleFormulaSpecification();

            state._fsp--;

             current =iv_ruleFormulaSpecification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulaSpecification"


    // $ANTLR start "ruleFormulaSpecification"
    // InternalMdxParser.g:174:1: ruleFormulaSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_single_formula_specification_0= rulesingle_formula_specification )+ ;
    public final AntlrDatatypeRuleToken ruleFormulaSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_single_formula_specification_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:180:2: ( (this_single_formula_specification_0= rulesingle_formula_specification )+ )
            // InternalMdxParser.g:181:2: (this_single_formula_specification_0= rulesingle_formula_specification )+
            {
            // InternalMdxParser.g:181:2: (this_single_formula_specification_0= rulesingle_formula_specification )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MEMBER||LA5_0==SET) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMdxParser.g:182:3: this_single_formula_specification_0= rulesingle_formula_specification
            	    {

            	    			newCompositeNode(grammarAccess.getFormulaSpecificationAccess().getSingle_formula_specificationParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_11);
            	    this_single_formula_specification_0=rulesingle_formula_specification();

            	    state._fsp--;


            	    			current.merge(this_single_formula_specification_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaSpecification"


    // $ANTLR start "entryRulesingle_formula_specification"
    // InternalMdxParser.g:196:1: entryRulesingle_formula_specification returns [String current=null] : iv_rulesingle_formula_specification= rulesingle_formula_specification EOF ;
    public final String entryRulesingle_formula_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesingle_formula_specification = null;


        try {
            // InternalMdxParser.g:196:68: (iv_rulesingle_formula_specification= rulesingle_formula_specification EOF )
            // InternalMdxParser.g:197:2: iv_rulesingle_formula_specification= rulesingle_formula_specification EOF
            {
             newCompositeNode(grammarAccess.getSingle_formula_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesingle_formula_specification=rulesingle_formula_specification();

            state._fsp--;

             current =iv_rulesingle_formula_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesingle_formula_specification"


    // $ANTLR start "rulesingle_formula_specification"
    // InternalMdxParser.g:203:1: rulesingle_formula_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_member_specification_0= rulemember_specification | this_set_specification_1= ruleset_specification ) ;
    public final AntlrDatatypeRuleToken rulesingle_formula_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_member_specification_0 = null;

        AntlrDatatypeRuleToken this_set_specification_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:209:2: ( (this_member_specification_0= rulemember_specification | this_set_specification_1= ruleset_specification ) )
            // InternalMdxParser.g:210:2: (this_member_specification_0= rulemember_specification | this_set_specification_1= ruleset_specification )
            {
            // InternalMdxParser.g:210:2: (this_member_specification_0= rulemember_specification | this_set_specification_1= ruleset_specification )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==MEMBER) ) {
                alt6=1;
            }
            else if ( (LA6_0==SET) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMdxParser.g:211:3: this_member_specification_0= rulemember_specification
                    {

                    			newCompositeNode(grammarAccess.getSingle_formula_specificationAccess().getMember_specificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_member_specification_0=rulemember_specification();

                    state._fsp--;


                    			current.merge(this_member_specification_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:222:3: this_set_specification_1= ruleset_specification
                    {

                    			newCompositeNode(grammarAccess.getSingle_formula_specificationAccess().getSet_specificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_set_specification_1=ruleset_specification();

                    state._fsp--;


                    			current.merge(this_set_specification_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesingle_formula_specification"


    // $ANTLR start "entryRuleset_specification"
    // InternalMdxParser.g:236:1: entryRuleset_specification returns [String current=null] : iv_ruleset_specification= ruleset_specification EOF ;
    public final String entryRuleset_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_specification = null;


        try {
            // InternalMdxParser.g:236:57: (iv_ruleset_specification= ruleset_specification EOF )
            // InternalMdxParser.g:237:2: iv_ruleset_specification= ruleset_specification EOF
            {
             newCompositeNode(grammarAccess.getSet_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_specification=ruleset_specification();

            state._fsp--;

             current =iv_ruleset_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_specification"


    // $ANTLR start "ruleset_specification"
    // InternalMdxParser.g:243:1: ruleset_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= SET this_set_name_1= ruleset_name kw= AS ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression ) ) ;
    public final AntlrDatatypeRuleToken ruleset_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_set_name_1 = null;

        AntlrDatatypeRuleToken this_QUOTE_3 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;

        AntlrDatatypeRuleToken this_QUOTE_5 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:249:2: ( (kw= SET this_set_name_1= ruleset_name kw= AS ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression ) ) )
            // InternalMdxParser.g:250:2: (kw= SET this_set_name_1= ruleset_name kw= AS ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression ) )
            {
            // InternalMdxParser.g:250:2: (kw= SET this_set_name_1= ruleset_name kw= AS ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression ) )
            // InternalMdxParser.g:251:3: kw= SET this_set_name_1= ruleset_name kw= AS ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression )
            {
            kw=(Token)match(input,SET,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSet_specificationAccess().getSETKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSet_specificationAccess().getSet_nameParserRuleCall_1());
            		
            pushFollow(FOLLOW_12);
            this_set_name_1=ruleset_name();

            state._fsp--;


            			current.merge(this_set_name_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,AS,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSet_specificationAccess().getASKeyword_2());
            		
            // InternalMdxParser.g:271:3: ( (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE ) | this_expression_6= ruleexpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Apostrophe) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=PROPERTIES && LA7_0<=DIMENSION)||LA7_0==CASE||LA7_0==NOT||LA7_0==LeftParenthesis||LA7_0==PlusSign||LA7_0==HyphenMinus||LA7_0==LeftCurlyBracket||LA7_0==RULE_ID||LA7_0==RULE_QUOTED_ID||(LA7_0>=RULE_INT && LA7_0<=RULE_STRING)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMdxParser.g:272:4: (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE )
                    {
                    // InternalMdxParser.g:272:4: (this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE )
                    // InternalMdxParser.g:273:5: this_QUOTE_3= ruleQUOTE this_expression_4= ruleexpression this_QUOTE_5= ruleQUOTE
                    {

                    					newCompositeNode(grammarAccess.getSet_specificationAccess().getQUOTEParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    this_QUOTE_3=ruleQUOTE();

                    state._fsp--;


                    					current.merge(this_QUOTE_3);
                    				

                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSet_specificationAccess().getExpressionParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_14);
                    this_expression_4=ruleexpression();

                    state._fsp--;


                    					current.merge(this_expression_4);
                    				

                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSet_specificationAccess().getQUOTEParserRuleCall_3_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    this_QUOTE_5=ruleQUOTE();

                    state._fsp--;


                    					current.merge(this_QUOTE_5);
                    				

                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:305:4: this_expression_6= ruleexpression
                    {

                    				newCompositeNode(grammarAccess.getSet_specificationAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_expression_6=ruleexpression();

                    state._fsp--;


                    				current.merge(this_expression_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_specification"


    // $ANTLR start "entryRulemember_specification"
    // InternalMdxParser.g:320:1: entryRulemember_specification returns [String current=null] : iv_rulemember_specification= rulemember_specification EOF ;
    public final String entryRulemember_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemember_specification = null;


        try {
            // InternalMdxParser.g:320:60: (iv_rulemember_specification= rulemember_specification EOF )
            // InternalMdxParser.g:321:2: iv_rulemember_specification= rulemember_specification EOF
            {
             newCompositeNode(grammarAccess.getMember_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember_specification=rulemember_specification();

            state._fsp--;

             current =iv_rulemember_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember_specification"


    // $ANTLR start "rulemember_specification"
    // InternalMdxParser.g:327:1: rulemember_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MEMBER this_member_name_1= rulemember_name kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? ) ) ;
    public final AntlrDatatypeRuleToken rulemember_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_member_name_1 = null;

        AntlrDatatypeRuleToken this_QUOTE_3 = null;

        AntlrDatatypeRuleToken this_value_expression_4 = null;

        AntlrDatatypeRuleToken this_QUOTE_5 = null;

        AntlrDatatypeRuleToken this_value_expression_6 = null;

        AntlrDatatypeRuleToken this_COMMA_7 = null;

        AntlrDatatypeRuleToken this_member_property_def_list_8 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:333:2: ( (kw= MEMBER this_member_name_1= rulemember_name kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? ) ) )
            // InternalMdxParser.g:334:2: (kw= MEMBER this_member_name_1= rulemember_name kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? ) )
            {
            // InternalMdxParser.g:334:2: (kw= MEMBER this_member_name_1= rulemember_name kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? ) )
            // InternalMdxParser.g:335:3: kw= MEMBER this_member_name_1= rulemember_name kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? )
            {
            kw=(Token)match(input,MEMBER,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMember_specificationAccess().getMEMBERKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMember_specificationAccess().getMember_nameParserRuleCall_1());
            		
            pushFollow(FOLLOW_12);
            this_member_name_1=rulemember_name();

            state._fsp--;


            			current.merge(this_member_name_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,AS,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMember_specificationAccess().getASKeyword_2());
            		
            // InternalMdxParser.g:355:3: ( ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )? )
            // InternalMdxParser.g:356:4: ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression ) this_COMMA_7= ruleCOMMA (this_member_property_def_list_8= rulemember_property_def_list )?
            {
            // InternalMdxParser.g:356:4: ( (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE ) | this_value_expression_6= rulevalue_expression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Apostrophe) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=PROPERTIES && LA8_0<=DIMENSION)||LA8_0==CASE||LA8_0==NOT||LA8_0==LeftParenthesis||LA8_0==PlusSign||LA8_0==HyphenMinus||LA8_0==LeftCurlyBracket||LA8_0==RULE_ID||LA8_0==RULE_QUOTED_ID||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMdxParser.g:357:5: (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE )
                    {
                    // InternalMdxParser.g:357:5: (this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE )
                    // InternalMdxParser.g:358:6: this_QUOTE_3= ruleQUOTE this_value_expression_4= rulevalue_expression this_QUOTE_5= ruleQUOTE
                    {

                    						newCompositeNode(grammarAccess.getMember_specificationAccess().getQUOTEParserRuleCall_3_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    this_QUOTE_3=ruleQUOTE();

                    state._fsp--;


                    						current.merge(this_QUOTE_3);
                    					

                    						afterParserOrEnumRuleCall();
                    					

                    						newCompositeNode(grammarAccess.getMember_specificationAccess().getValue_expressionParserRuleCall_3_0_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    this_value_expression_4=rulevalue_expression();

                    state._fsp--;


                    						current.merge(this_value_expression_4);
                    					

                    						afterParserOrEnumRuleCall();
                    					

                    						newCompositeNode(grammarAccess.getMember_specificationAccess().getQUOTEParserRuleCall_3_0_0_2());
                    					
                    pushFollow(FOLLOW_15);
                    this_QUOTE_5=ruleQUOTE();

                    state._fsp--;


                    						current.merge(this_QUOTE_5);
                    					

                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:390:5: this_value_expression_6= rulevalue_expression
                    {

                    					newCompositeNode(grammarAccess.getMember_specificationAccess().getValue_expressionParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_15);
                    this_value_expression_6=rulevalue_expression();

                    state._fsp--;


                    					current.merge(this_value_expression_6);
                    				

                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            				newCompositeNode(grammarAccess.getMember_specificationAccess().getCOMMAParserRuleCall_3_1());
            			
            pushFollow(FOLLOW_16);
            this_COMMA_7=ruleCOMMA();

            state._fsp--;


            				current.merge(this_COMMA_7);
            			

            				afterParserOrEnumRuleCall();
            			
            // InternalMdxParser.g:411:4: (this_member_property_def_list_8= rulemember_property_def_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=PROPERTIES && LA9_0<=DIMENSION)||LA9_0==RULE_ID||LA9_0==RULE_QUOTED_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMdxParser.g:412:5: this_member_property_def_list_8= rulemember_property_def_list
                    {

                    					newCompositeNode(grammarAccess.getMember_specificationAccess().getMember_property_def_listParserRuleCall_3_2());
                    				
                    pushFollow(FOLLOW_2);
                    this_member_property_def_list_8=rulemember_property_def_list();

                    state._fsp--;


                    					current.merge(this_member_property_def_list_8);
                    				

                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember_specification"


    // $ANTLR start "entryRuleaxis_specification_list"
    // InternalMdxParser.g:428:1: entryRuleaxis_specification_list returns [String current=null] : iv_ruleaxis_specification_list= ruleaxis_specification_list EOF ;
    public final String entryRuleaxis_specification_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaxis_specification_list = null;


        try {
            // InternalMdxParser.g:428:63: (iv_ruleaxis_specification_list= ruleaxis_specification_list EOF )
            // InternalMdxParser.g:429:2: iv_ruleaxis_specification_list= ruleaxis_specification_list EOF
            {
             newCompositeNode(grammarAccess.getAxis_specification_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaxis_specification_list=ruleaxis_specification_list();

            state._fsp--;

             current =iv_ruleaxis_specification_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaxis_specification_list"


    // $ANTLR start "ruleaxis_specification_list"
    // InternalMdxParser.g:435:1: ruleaxis_specification_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_axis_specification_0= ruleaxis_specification (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )* ) ;
    public final AntlrDatatypeRuleToken ruleaxis_specification_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_axis_specification_0 = null;

        AntlrDatatypeRuleToken this_COMMA_1 = null;

        AntlrDatatypeRuleToken this_axis_specification_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:441:2: ( (this_axis_specification_0= ruleaxis_specification (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )* ) )
            // InternalMdxParser.g:442:2: (this_axis_specification_0= ruleaxis_specification (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )* )
            {
            // InternalMdxParser.g:442:2: (this_axis_specification_0= ruleaxis_specification (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )* )
            // InternalMdxParser.g:443:3: this_axis_specification_0= ruleaxis_specification (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )*
            {

            			newCompositeNode(grammarAccess.getAxis_specification_listAccess().getAxis_specificationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_axis_specification_0=ruleaxis_specification();

            state._fsp--;


            			current.merge(this_axis_specification_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:453:3: (this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMdxParser.g:454:4: this_COMMA_1= ruleCOMMA this_axis_specification_2= ruleaxis_specification
            	    {

            	    				newCompositeNode(grammarAccess.getAxis_specification_listAccess().getCOMMAParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    this_COMMA_1=ruleCOMMA();

            	    state._fsp--;


            	    				current.merge(this_COMMA_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getAxis_specification_listAccess().getAxis_specificationParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_axis_specification_2=ruleaxis_specification();

            	    state._fsp--;


            	    				current.merge(this_axis_specification_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaxis_specification_list"


    // $ANTLR start "entryRulemember_property_def_list"
    // InternalMdxParser.g:479:1: entryRulemember_property_def_list returns [String current=null] : iv_rulemember_property_def_list= rulemember_property_def_list EOF ;
    public final String entryRulemember_property_def_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemember_property_def_list = null;


        try {
            // InternalMdxParser.g:479:64: (iv_rulemember_property_def_list= rulemember_property_def_list EOF )
            // InternalMdxParser.g:480:2: iv_rulemember_property_def_list= rulemember_property_def_list EOF
            {
             newCompositeNode(grammarAccess.getMember_property_def_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember_property_def_list=rulemember_property_def_list();

            state._fsp--;

             current =iv_rulemember_property_def_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember_property_def_list"


    // $ANTLR start "rulemember_property_def_list"
    // InternalMdxParser.g:486:1: rulemember_property_def_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_member_property_definition_0= rulemember_property_definition (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )* ) ;
    public final AntlrDatatypeRuleToken rulemember_property_def_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_member_property_definition_0 = null;

        AntlrDatatypeRuleToken this_COMMA_1 = null;

        AntlrDatatypeRuleToken this_member_property_definition_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:492:2: ( (this_member_property_definition_0= rulemember_property_definition (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )* ) )
            // InternalMdxParser.g:493:2: (this_member_property_definition_0= rulemember_property_definition (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )* )
            {
            // InternalMdxParser.g:493:2: (this_member_property_definition_0= rulemember_property_definition (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )* )
            // InternalMdxParser.g:494:3: this_member_property_definition_0= rulemember_property_definition (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )*
            {

            			newCompositeNode(grammarAccess.getMember_property_def_listAccess().getMember_property_definitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_member_property_definition_0=rulemember_property_definition();

            state._fsp--;


            			current.merge(this_member_property_definition_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:504:3: (this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMdxParser.g:505:4: this_COMMA_1= ruleCOMMA this_member_property_definition_2= rulemember_property_definition
            	    {

            	    				newCompositeNode(grammarAccess.getMember_property_def_listAccess().getCOMMAParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_COMMA_1=ruleCOMMA();

            	    state._fsp--;


            	    				current.merge(this_COMMA_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getMember_property_def_listAccess().getMember_property_definitionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_member_property_definition_2=rulemember_property_definition();

            	    state._fsp--;


            	    				current.merge(this_member_property_definition_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember_property_def_list"


    // $ANTLR start "entryRulemember_name"
    // InternalMdxParser.g:530:1: entryRulemember_name returns [String current=null] : iv_rulemember_name= rulemember_name EOF ;
    public final String entryRulemember_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemember_name = null;


        try {
            // InternalMdxParser.g:530:51: (iv_rulemember_name= rulemember_name EOF )
            // InternalMdxParser.g:531:2: iv_rulemember_name= rulemember_name EOF
            {
             newCompositeNode(grammarAccess.getMember_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember_name=rulemember_name();

            state._fsp--;

             current =iv_rulemember_name.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember_name"


    // $ANTLR start "rulemember_name"
    // InternalMdxParser.g:537:1: rulemember_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_compound_id_0= rulecompound_id ;
    public final AntlrDatatypeRuleToken rulemember_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_id_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:543:2: (this_compound_id_0= rulecompound_id )
            // InternalMdxParser.g:544:2: this_compound_id_0= rulecompound_id
            {

            		newCompositeNode(grammarAccess.getMember_nameAccess().getCompound_idParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_compound_id_0=rulecompound_id();

            state._fsp--;


            		current.merge(this_compound_id_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember_name"


    // $ANTLR start "entryRulemember_property_definition"
    // InternalMdxParser.g:557:1: entryRulemember_property_definition returns [String current=null] : iv_rulemember_property_definition= rulemember_property_definition EOF ;
    public final String entryRulemember_property_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemember_property_definition = null;


        try {
            // InternalMdxParser.g:557:66: (iv_rulemember_property_definition= rulemember_property_definition EOF )
            // InternalMdxParser.g:558:2: iv_rulemember_property_definition= rulemember_property_definition EOF
            {
             newCompositeNode(grammarAccess.getMember_property_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember_property_definition=rulemember_property_definition();

            state._fsp--;

             current =iv_rulemember_property_definition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember_property_definition"


    // $ANTLR start "rulemember_property_definition"
    // InternalMdxParser.g:564:1: rulemember_property_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier this_EQ_1= ruleEQ this_value_expression_2= rulevalue_expression ) ;
    public final AntlrDatatypeRuleToken rulemember_property_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_EQ_1 = null;

        AntlrDatatypeRuleToken this_value_expression_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:570:2: ( (this_identifier_0= ruleidentifier this_EQ_1= ruleEQ this_value_expression_2= rulevalue_expression ) )
            // InternalMdxParser.g:571:2: (this_identifier_0= ruleidentifier this_EQ_1= ruleEQ this_value_expression_2= rulevalue_expression )
            {
            // InternalMdxParser.g:571:2: (this_identifier_0= ruleidentifier this_EQ_1= ruleEQ this_value_expression_2= rulevalue_expression )
            // InternalMdxParser.g:572:3: this_identifier_0= ruleidentifier this_EQ_1= ruleEQ this_value_expression_2= rulevalue_expression
            {

            			newCompositeNode(grammarAccess.getMember_property_definitionAccess().getIdentifierParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            			current.merge(this_identifier_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getMember_property_definitionAccess().getEQParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_EQ_1=ruleEQ();

            state._fsp--;


            			current.merge(this_EQ_1);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getMember_property_definitionAccess().getValue_expressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_value_expression_2=rulevalue_expression();

            state._fsp--;


            			current.merge(this_value_expression_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember_property_definition"


    // $ANTLR start "entryRuleset_name"
    // InternalMdxParser.g:606:1: entryRuleset_name returns [String current=null] : iv_ruleset_name= ruleset_name EOF ;
    public final String entryRuleset_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_name = null;


        try {
            // InternalMdxParser.g:606:48: (iv_ruleset_name= ruleset_name EOF )
            // InternalMdxParser.g:607:2: iv_ruleset_name= ruleset_name EOF
            {
             newCompositeNode(grammarAccess.getSet_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_name=ruleset_name();

            state._fsp--;

             current =iv_ruleset_name.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_name"


    // $ANTLR start "ruleset_name"
    // InternalMdxParser.g:613:1: ruleset_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_compound_id_0= rulecompound_id ;
    public final AntlrDatatypeRuleToken ruleset_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_id_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:619:2: (this_compound_id_0= rulecompound_id )
            // InternalMdxParser.g:620:2: this_compound_id_0= rulecompound_id
            {

            		newCompositeNode(grammarAccess.getSet_nameAccess().getCompound_idParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_compound_id_0=rulecompound_id();

            state._fsp--;


            		current.merge(this_compound_id_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_name"


    // $ANTLR start "entryRulecompound_id"
    // InternalMdxParser.g:633:1: entryRulecompound_id returns [String current=null] : iv_rulecompound_id= rulecompound_id EOF ;
    public final String entryRulecompound_id() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompound_id = null;


        try {
            // InternalMdxParser.g:633:51: (iv_rulecompound_id= rulecompound_id EOF )
            // InternalMdxParser.g:634:2: iv_rulecompound_id= rulecompound_id EOF
            {
             newCompositeNode(grammarAccess.getCompound_idRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_id=rulecompound_id();

            state._fsp--;

             current =iv_rulecompound_id.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_id"


    // $ANTLR start "rulecompound_id"
    // InternalMdxParser.g:640:1: rulecompound_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )* ) ;
    public final AntlrDatatypeRuleToken rulecompound_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_DOT_1 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:646:2: ( (this_identifier_0= ruleidentifier (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )* ) )
            // InternalMdxParser.g:647:2: (this_identifier_0= ruleidentifier (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )* )
            {
            // InternalMdxParser.g:647:2: (this_identifier_0= ruleidentifier (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )* )
            // InternalMdxParser.g:648:3: this_identifier_0= ruleidentifier (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )*
            {

            			newCompositeNode(grammarAccess.getCompound_idAccess().getIdentifierParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            			current.merge(this_identifier_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:658:3: (this_DOT_1= ruleDOT this_identifier_2= ruleidentifier )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==FullStop) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMdxParser.g:659:4: this_DOT_1= ruleDOT this_identifier_2= ruleidentifier
            	    {

            	    				newCompositeNode(grammarAccess.getCompound_idAccess().getDOTParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_DOT_1=ruleDOT();

            	    state._fsp--;


            	    				current.merge(this_DOT_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getCompound_idAccess().getIdentifierParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    this_identifier_2=ruleidentifier();

            	    state._fsp--;


            	    				current.merge(this_identifier_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_id"


    // $ANTLR start "entryRuleaxis_specification"
    // InternalMdxParser.g:684:1: entryRuleaxis_specification returns [String current=null] : iv_ruleaxis_specification= ruleaxis_specification EOF ;
    public final String entryRuleaxis_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaxis_specification = null;


        try {
            // InternalMdxParser.g:684:58: (iv_ruleaxis_specification= ruleaxis_specification EOF )
            // InternalMdxParser.g:685:2: iv_ruleaxis_specification= ruleaxis_specification EOF
            {
             newCompositeNode(grammarAccess.getAxis_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaxis_specification=ruleaxis_specification();

            state._fsp--;

             current =iv_ruleaxis_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaxis_specification"


    // $ANTLR start "ruleaxis_specification"
    // InternalMdxParser.g:691:1: ruleaxis_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NON kw= EMPTY )? this_expression_2= ruleexpression (this_dim_props_3= ruledim_props )? kw= ON this_axis_name_5= ruleaxis_name ) ;
    public final AntlrDatatypeRuleToken ruleaxis_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_dim_props_3 = null;

        AntlrDatatypeRuleToken this_axis_name_5 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:697:2: ( ( (kw= NON kw= EMPTY )? this_expression_2= ruleexpression (this_dim_props_3= ruledim_props )? kw= ON this_axis_name_5= ruleaxis_name ) )
            // InternalMdxParser.g:698:2: ( (kw= NON kw= EMPTY )? this_expression_2= ruleexpression (this_dim_props_3= ruledim_props )? kw= ON this_axis_name_5= ruleaxis_name )
            {
            // InternalMdxParser.g:698:2: ( (kw= NON kw= EMPTY )? this_expression_2= ruleexpression (this_dim_props_3= ruledim_props )? kw= ON this_axis_name_5= ruleaxis_name )
            // InternalMdxParser.g:699:3: (kw= NON kw= EMPTY )? this_expression_2= ruleexpression (this_dim_props_3= ruledim_props )? kw= ON this_axis_name_5= ruleaxis_name
            {
            // InternalMdxParser.g:699:3: (kw= NON kw= EMPTY )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMdxParser.g:700:4: kw= NON kw= EMPTY
                    {
                    kw=(Token)match(input,NON,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAxis_specificationAccess().getNONKeyword_0_0());
                    			
                    kw=(Token)match(input,EMPTY,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAxis_specificationAccess().getEMPTYKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getAxis_specificationAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_expression_2=ruleexpression();

            state._fsp--;


            			current.merge(this_expression_2);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:721:3: (this_dim_props_3= ruledim_props )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=PROPERTIES && LA14_0<=DIMENSION)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMdxParser.g:722:4: this_dim_props_3= ruledim_props
                    {

                    				newCompositeNode(grammarAccess.getAxis_specificationAccess().getDim_propsParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_dim_props_3=ruledim_props();

                    state._fsp--;


                    				current.merge(this_dim_props_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,ON,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAxis_specificationAccess().getONKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAxis_specificationAccess().getAxis_nameParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_axis_name_5=ruleaxis_name();

            state._fsp--;


            			current.merge(this_axis_name_5);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaxis_specification"


    // $ANTLR start "entryRuleaxis_name"
    // InternalMdxParser.g:752:1: entryRuleaxis_name returns [String current=null] : iv_ruleaxis_name= ruleaxis_name EOF ;
    public final String entryRuleaxis_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaxis_name = null;


        try {
            // InternalMdxParser.g:752:49: (iv_ruleaxis_name= ruleaxis_name EOF )
            // InternalMdxParser.g:753:2: iv_ruleaxis_name= ruleaxis_name EOF
            {
             newCompositeNode(grammarAccess.getAxis_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaxis_name=ruleaxis_name();

            state._fsp--;

             current =iv_ruleaxis_name.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaxis_name"


    // $ANTLR start "ruleaxis_name"
    // InternalMdxParser.g:759:1: ruleaxis_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleaxis_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:765:2: (this_identifier_0= ruleidentifier )
            // InternalMdxParser.g:766:2: this_identifier_0= ruleidentifier
            {

            		newCompositeNode(grammarAccess.getAxis_nameAccess().getIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaxis_name"


    // $ANTLR start "entryRuledim_props"
    // InternalMdxParser.g:779:1: entryRuledim_props returns [String current=null] : iv_ruledim_props= ruledim_props EOF ;
    public final String entryRuledim_props() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledim_props = null;


        try {
            // InternalMdxParser.g:779:49: (iv_ruledim_props= ruledim_props EOF )
            // InternalMdxParser.g:780:2: iv_ruledim_props= ruledim_props EOF
            {
             newCompositeNode(grammarAccess.getDim_propsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledim_props=ruledim_props();

            state._fsp--;

             current =iv_ruledim_props.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledim_props"


    // $ANTLR start "ruledim_props"
    // InternalMdxParser.g:786:1: ruledim_props returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= DIMENSION )? kw= PROPERTIES this_property_list_2= ruleproperty_list ) ;
    public final AntlrDatatypeRuleToken ruledim_props() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_property_list_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:792:2: ( ( (kw= DIMENSION )? kw= PROPERTIES this_property_list_2= ruleproperty_list ) )
            // InternalMdxParser.g:793:2: ( (kw= DIMENSION )? kw= PROPERTIES this_property_list_2= ruleproperty_list )
            {
            // InternalMdxParser.g:793:2: ( (kw= DIMENSION )? kw= PROPERTIES this_property_list_2= ruleproperty_list )
            // InternalMdxParser.g:794:3: (kw= DIMENSION )? kw= PROPERTIES this_property_list_2= ruleproperty_list
            {
            // InternalMdxParser.g:794:3: (kw= DIMENSION )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DIMENSION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMdxParser.g:795:4: kw= DIMENSION
                    {
                    kw=(Token)match(input,DIMENSION,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDim_propsAccess().getDIMENSIONKeyword_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,PROPERTIES,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDim_propsAccess().getPROPERTIESKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDim_propsAccess().getProperty_listParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_property_list_2=ruleproperty_list();

            state._fsp--;


            			current.merge(this_property_list_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledim_props"


    // $ANTLR start "entryRuleproperty_list"
    // InternalMdxParser.g:820:1: entryRuleproperty_list returns [String current=null] : iv_ruleproperty_list= ruleproperty_list EOF ;
    public final String entryRuleproperty_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleproperty_list = null;


        try {
            // InternalMdxParser.g:820:53: (iv_ruleproperty_list= ruleproperty_list EOF )
            // InternalMdxParser.g:821:2: iv_ruleproperty_list= ruleproperty_list EOF
            {
             newCompositeNode(grammarAccess.getProperty_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperty_list=ruleproperty_list();

            state._fsp--;

             current =iv_ruleproperty_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperty_list"


    // $ANTLR start "ruleproperty_list"
    // InternalMdxParser.g:827:1: ruleproperty_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_property_0= ruleproperty (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )* ) ;
    public final AntlrDatatypeRuleToken ruleproperty_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_property_0 = null;

        AntlrDatatypeRuleToken this_COMMA_1 = null;

        AntlrDatatypeRuleToken this_property_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:833:2: ( (this_property_0= ruleproperty (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )* ) )
            // InternalMdxParser.g:834:2: (this_property_0= ruleproperty (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )* )
            {
            // InternalMdxParser.g:834:2: (this_property_0= ruleproperty (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )* )
            // InternalMdxParser.g:835:3: this_property_0= ruleproperty (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )*
            {

            			newCompositeNode(grammarAccess.getProperty_listAccess().getPropertyParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_property_0=ruleproperty();

            state._fsp--;


            			current.merge(this_property_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:845:3: (this_COMMA_1= ruleCOMMA this_property_2= ruleproperty )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMdxParser.g:846:4: this_COMMA_1= ruleCOMMA this_property_2= ruleproperty
            	    {

            	    				newCompositeNode(grammarAccess.getProperty_listAccess().getCOMMAParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_COMMA_1=ruleCOMMA();

            	    state._fsp--;


            	    				current.merge(this_COMMA_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getProperty_listAccess().getPropertyParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_property_2=ruleproperty();

            	    state._fsp--;


            	    				current.merge(this_property_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperty_list"


    // $ANTLR start "entryRuleproperty"
    // InternalMdxParser.g:871:1: entryRuleproperty returns [String current=null] : iv_ruleproperty= ruleproperty EOF ;
    public final String entryRuleproperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleproperty = null;


        try {
            // InternalMdxParser.g:871:48: (iv_ruleproperty= ruleproperty EOF )
            // InternalMdxParser.g:872:2: iv_ruleproperty= ruleproperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperty=ruleproperty();

            state._fsp--;

             current =iv_ruleproperty.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperty"


    // $ANTLR start "ruleproperty"
    // InternalMdxParser.g:878:1: ruleproperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_compound_id_0= rulecompound_id ;
    public final AntlrDatatypeRuleToken ruleproperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_id_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:884:2: (this_compound_id_0= rulecompound_id )
            // InternalMdxParser.g:885:2: this_compound_id_0= rulecompound_id
            {

            		newCompositeNode(grammarAccess.getPropertyAccess().getCompound_idParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_compound_id_0=rulecompound_id();

            state._fsp--;


            		current.merge(this_compound_id_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperty"


    // $ANTLR start "entryRulecube_specification"
    // InternalMdxParser.g:898:1: entryRulecube_specification returns [String current=null] : iv_rulecube_specification= rulecube_specification EOF ;
    public final String entryRulecube_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecube_specification = null;


        try {
            // InternalMdxParser.g:898:58: (iv_rulecube_specification= rulecube_specification EOF )
            // InternalMdxParser.g:899:2: iv_rulecube_specification= rulecube_specification EOF
            {
             newCompositeNode(grammarAccess.getCube_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecube_specification=rulecube_specification();

            state._fsp--;

             current =iv_rulecube_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecube_specification"


    // $ANTLR start "rulecube_specification"
    // InternalMdxParser.g:905:1: rulecube_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_cube_name_0= rulecube_name ;
    public final AntlrDatatypeRuleToken rulecube_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_cube_name_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:911:2: (this_cube_name_0= rulecube_name )
            // InternalMdxParser.g:912:2: this_cube_name_0= rulecube_name
            {

            		newCompositeNode(grammarAccess.getCube_specificationAccess().getCube_nameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_cube_name_0=rulecube_name();

            state._fsp--;


            		current.merge(this_cube_name_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecube_specification"


    // $ANTLR start "entryRulecube_name"
    // InternalMdxParser.g:925:1: entryRulecube_name returns [String current=null] : iv_rulecube_name= rulecube_name EOF ;
    public final String entryRulecube_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecube_name = null;


        try {
            // InternalMdxParser.g:925:49: (iv_rulecube_name= rulecube_name EOF )
            // InternalMdxParser.g:926:2: iv_rulecube_name= rulecube_name EOF
            {
             newCompositeNode(grammarAccess.getCube_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecube_name=rulecube_name();

            state._fsp--;

             current =iv_rulecube_name.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecube_name"


    // $ANTLR start "rulecube_name"
    // InternalMdxParser.g:932:1: rulecube_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_compound_id_0= rulecompound_id ;
    public final AntlrDatatypeRuleToken rulecube_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_id_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:938:2: (this_compound_id_0= rulecompound_id )
            // InternalMdxParser.g:939:2: this_compound_id_0= rulecompound_id
            {

            		newCompositeNode(grammarAccess.getCube_nameAccess().getCompound_idParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_compound_id_0=rulecompound_id();

            state._fsp--;


            		current.merge(this_compound_id_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecube_name"


    // $ANTLR start "entryRuleslicer_specification"
    // InternalMdxParser.g:952:1: entryRuleslicer_specification returns [String current=null] : iv_ruleslicer_specification= ruleslicer_specification EOF ;
    public final String entryRuleslicer_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleslicer_specification = null;


        try {
            // InternalMdxParser.g:952:60: (iv_ruleslicer_specification= ruleslicer_specification EOF )
            // InternalMdxParser.g:953:2: iv_ruleslicer_specification= ruleslicer_specification EOF
            {
             newCompositeNode(grammarAccess.getSlicer_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleslicer_specification=ruleslicer_specification();

            state._fsp--;

             current =iv_ruleslicer_specification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleslicer_specification"


    // $ANTLR start "ruleslicer_specification"
    // InternalMdxParser.g:959:1: ruleslicer_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_expression_0= ruleexpression ;
    public final AntlrDatatypeRuleToken ruleslicer_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:965:2: (this_expression_0= ruleexpression )
            // InternalMdxParser.g:966:2: this_expression_0= ruleexpression
            {

            		newCompositeNode(grammarAccess.getSlicer_specificationAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleslicer_specification"


    // $ANTLR start "entryRulecell_props"
    // InternalMdxParser.g:979:1: entryRulecell_props returns [String current=null] : iv_rulecell_props= rulecell_props EOF ;
    public final String entryRulecell_props() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecell_props = null;


        try {
            // InternalMdxParser.g:979:50: (iv_rulecell_props= rulecell_props EOF )
            // InternalMdxParser.g:980:2: iv_rulecell_props= rulecell_props EOF
            {
             newCompositeNode(grammarAccess.getCell_propsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecell_props=rulecell_props();

            state._fsp--;

             current =iv_rulecell_props.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecell_props"


    // $ANTLR start "rulecell_props"
    // InternalMdxParser.g:986:1: rulecell_props returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= CELL )? kw= PROPERTIES this_cell_property_list_2= rulecell_property_list ) ;
    public final AntlrDatatypeRuleToken rulecell_props() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_cell_property_list_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:992:2: ( ( (kw= CELL )? kw= PROPERTIES this_cell_property_list_2= rulecell_property_list ) )
            // InternalMdxParser.g:993:2: ( (kw= CELL )? kw= PROPERTIES this_cell_property_list_2= rulecell_property_list )
            {
            // InternalMdxParser.g:993:2: ( (kw= CELL )? kw= PROPERTIES this_cell_property_list_2= rulecell_property_list )
            // InternalMdxParser.g:994:3: (kw= CELL )? kw= PROPERTIES this_cell_property_list_2= rulecell_property_list
            {
            // InternalMdxParser.g:994:3: (kw= CELL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CELL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMdxParser.g:995:4: kw= CELL
                    {
                    kw=(Token)match(input,CELL,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCell_propsAccess().getCELLKeyword_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,PROPERTIES,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCell_propsAccess().getPROPERTIESKeyword_1());
            		

            			newCompositeNode(grammarAccess.getCell_propsAccess().getCell_property_listParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_cell_property_list_2=rulecell_property_list();

            state._fsp--;


            			current.merge(this_cell_property_list_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecell_props"


    // $ANTLR start "entryRulecell_property_list"
    // InternalMdxParser.g:1020:1: entryRulecell_property_list returns [String current=null] : iv_rulecell_property_list= rulecell_property_list EOF ;
    public final String entryRulecell_property_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecell_property_list = null;


        try {
            // InternalMdxParser.g:1020:58: (iv_rulecell_property_list= rulecell_property_list EOF )
            // InternalMdxParser.g:1021:2: iv_rulecell_property_list= rulecell_property_list EOF
            {
             newCompositeNode(grammarAccess.getCell_property_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecell_property_list=rulecell_property_list();

            state._fsp--;

             current =iv_rulecell_property_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecell_property_list"


    // $ANTLR start "rulecell_property_list"
    // InternalMdxParser.g:1027:1: rulecell_property_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_cell_property_0= rulecell_property this_COMMA_1= ruleCOMMA (this_cell_property_2= rulecell_property )* ) ;
    public final AntlrDatatypeRuleToken rulecell_property_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_cell_property_0 = null;

        AntlrDatatypeRuleToken this_COMMA_1 = null;

        AntlrDatatypeRuleToken this_cell_property_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1033:2: ( (this_cell_property_0= rulecell_property this_COMMA_1= ruleCOMMA (this_cell_property_2= rulecell_property )* ) )
            // InternalMdxParser.g:1034:2: (this_cell_property_0= rulecell_property this_COMMA_1= ruleCOMMA (this_cell_property_2= rulecell_property )* )
            {
            // InternalMdxParser.g:1034:2: (this_cell_property_0= rulecell_property this_COMMA_1= ruleCOMMA (this_cell_property_2= rulecell_property )* )
            // InternalMdxParser.g:1035:3: this_cell_property_0= rulecell_property this_COMMA_1= ruleCOMMA (this_cell_property_2= rulecell_property )*
            {

            			newCompositeNode(grammarAccess.getCell_property_listAccess().getCell_propertyParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_cell_property_0=rulecell_property();

            state._fsp--;


            			current.merge(this_cell_property_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getCell_property_listAccess().getCOMMAParserRuleCall_1());
            		
            pushFollow(FOLLOW_25);
            this_COMMA_1=ruleCOMMA();

            state._fsp--;


            			current.merge(this_COMMA_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1055:3: (this_cell_property_2= rulecell_property )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=FORMATTED_VALUE && LA18_0<=DIMENSION)||LA18_0==VALUE||LA18_0==RULE_ID||LA18_0==RULE_QUOTED_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMdxParser.g:1056:4: this_cell_property_2= rulecell_property
            	    {

            	    				newCompositeNode(grammarAccess.getCell_property_listAccess().getCell_propertyParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_25);
            	    this_cell_property_2=rulecell_property();

            	    state._fsp--;


            	    				current.merge(this_cell_property_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecell_property_list"


    // $ANTLR start "entryRulecell_property"
    // InternalMdxParser.g:1071:1: entryRulecell_property returns [String current=null] : iv_rulecell_property= rulecell_property EOF ;
    public final String entryRulecell_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecell_property = null;


        try {
            // InternalMdxParser.g:1071:53: (iv_rulecell_property= rulecell_property EOF )
            // InternalMdxParser.g:1072:2: iv_rulecell_property= rulecell_property EOF
            {
             newCompositeNode(grammarAccess.getCell_propertyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecell_property=rulecell_property();

            state._fsp--;

             current =iv_rulecell_property.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecell_property"


    // $ANTLR start "rulecell_property"
    // InternalMdxParser.g:1078:1: rulecell_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_mandatory_cell_property_0= rulemandatory_cell_property | this_provider_specific_cell_property_1= ruleprovider_specific_cell_property ) ;
    public final AntlrDatatypeRuleToken rulecell_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_mandatory_cell_property_0 = null;

        AntlrDatatypeRuleToken this_provider_specific_cell_property_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1084:2: ( (this_mandatory_cell_property_0= rulemandatory_cell_property | this_provider_specific_cell_property_1= ruleprovider_specific_cell_property ) )
            // InternalMdxParser.g:1085:2: (this_mandatory_cell_property_0= rulemandatory_cell_property | this_provider_specific_cell_property_1= ruleprovider_specific_cell_property )
            {
            // InternalMdxParser.g:1085:2: (this_mandatory_cell_property_0= rulemandatory_cell_property | this_provider_specific_cell_property_1= ruleprovider_specific_cell_property )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=FORMATTED_VALUE && LA19_0<=CELL_ORDINAL)||LA19_0==VALUE) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=PROPERTIES && LA19_0<=DIMENSION)||LA19_0==RULE_ID||LA19_0==RULE_QUOTED_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMdxParser.g:1086:3: this_mandatory_cell_property_0= rulemandatory_cell_property
                    {

                    			newCompositeNode(grammarAccess.getCell_propertyAccess().getMandatory_cell_propertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_mandatory_cell_property_0=rulemandatory_cell_property();

                    state._fsp--;


                    			current.merge(this_mandatory_cell_property_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1097:3: this_provider_specific_cell_property_1= ruleprovider_specific_cell_property
                    {

                    			newCompositeNode(grammarAccess.getCell_propertyAccess().getProvider_specific_cell_propertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_provider_specific_cell_property_1=ruleprovider_specific_cell_property();

                    state._fsp--;


                    			current.merge(this_provider_specific_cell_property_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecell_property"


    // $ANTLR start "entryRulemandatory_cell_property"
    // InternalMdxParser.g:1111:1: entryRulemandatory_cell_property returns [String current=null] : iv_rulemandatory_cell_property= rulemandatory_cell_property EOF ;
    public final String entryRulemandatory_cell_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemandatory_cell_property = null;


        try {
            // InternalMdxParser.g:1111:63: (iv_rulemandatory_cell_property= rulemandatory_cell_property EOF )
            // InternalMdxParser.g:1112:2: iv_rulemandatory_cell_property= rulemandatory_cell_property EOF
            {
             newCompositeNode(grammarAccess.getMandatory_cell_propertyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemandatory_cell_property=rulemandatory_cell_property();

            state._fsp--;

             current =iv_rulemandatory_cell_property.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemandatory_cell_property"


    // $ANTLR start "rulemandatory_cell_property"
    // InternalMdxParser.g:1118:1: rulemandatory_cell_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CELL_ORDINAL | kw= VALUE | kw= FORMATTED_VALUE ) ;
    public final AntlrDatatypeRuleToken rulemandatory_cell_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:1124:2: ( (kw= CELL_ORDINAL | kw= VALUE | kw= FORMATTED_VALUE ) )
            // InternalMdxParser.g:1125:2: (kw= CELL_ORDINAL | kw= VALUE | kw= FORMATTED_VALUE )
            {
            // InternalMdxParser.g:1125:2: (kw= CELL_ORDINAL | kw= VALUE | kw= FORMATTED_VALUE )
            int alt20=3;
            switch ( input.LA(1) ) {
            case CELL_ORDINAL:
                {
                alt20=1;
                }
                break;
            case VALUE:
                {
                alt20=2;
                }
                break;
            case FORMATTED_VALUE:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMdxParser.g:1126:3: kw= CELL_ORDINAL
                    {
                    kw=(Token)match(input,CELL_ORDINAL,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMandatory_cell_propertyAccess().getCELL_ORDINALKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1132:3: kw= VALUE
                    {
                    kw=(Token)match(input,VALUE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMandatory_cell_propertyAccess().getVALUEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1138:3: kw= FORMATTED_VALUE
                    {
                    kw=(Token)match(input,FORMATTED_VALUE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMandatory_cell_propertyAccess().getFORMATTED_VALUEKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemandatory_cell_property"


    // $ANTLR start "entryRuleprovider_specific_cell_property"
    // InternalMdxParser.g:1147:1: entryRuleprovider_specific_cell_property returns [String current=null] : iv_ruleprovider_specific_cell_property= ruleprovider_specific_cell_property EOF ;
    public final String entryRuleprovider_specific_cell_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprovider_specific_cell_property = null;


        try {
            // InternalMdxParser.g:1147:71: (iv_ruleprovider_specific_cell_property= ruleprovider_specific_cell_property EOF )
            // InternalMdxParser.g:1148:2: iv_ruleprovider_specific_cell_property= ruleprovider_specific_cell_property EOF
            {
             newCompositeNode(grammarAccess.getProvider_specific_cell_propertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprovider_specific_cell_property=ruleprovider_specific_cell_property();

            state._fsp--;

             current =iv_ruleprovider_specific_cell_property.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprovider_specific_cell_property"


    // $ANTLR start "ruleprovider_specific_cell_property"
    // InternalMdxParser.g:1154:1: ruleprovider_specific_cell_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleprovider_specific_cell_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1160:2: (this_identifier_0= ruleidentifier )
            // InternalMdxParser.g:1161:2: this_identifier_0= ruleidentifier
            {

            		newCompositeNode(grammarAccess.getProvider_specific_cell_propertyAccess().getIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            		current.merge(this_identifier_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprovider_specific_cell_property"


    // $ANTLR start "entryRuleexpression"
    // InternalMdxParser.g:1174:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // InternalMdxParser.g:1174:50: (iv_ruleexpression= ruleexpression EOF )
            // InternalMdxParser.g:1175:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalMdxParser.g:1181:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_expression_0= rulevalue_expression (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_value_expression_0 = null;

        AntlrDatatypeRuleToken this_COLON_1 = null;

        AntlrDatatypeRuleToken this_value_expression_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1187:2: ( (this_value_expression_0= rulevalue_expression (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )* ) )
            // InternalMdxParser.g:1188:2: (this_value_expression_0= rulevalue_expression (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )* )
            {
            // InternalMdxParser.g:1188:2: (this_value_expression_0= rulevalue_expression (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )* )
            // InternalMdxParser.g:1189:3: this_value_expression_0= rulevalue_expression (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getValue_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_value_expression_0=rulevalue_expression();

            state._fsp--;


            			current.merge(this_value_expression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1199:3: (this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Colon) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMdxParser.g:1200:4: this_COLON_1= ruleCOLON this_value_expression_2= rulevalue_expression
            	    {

            	    				newCompositeNode(grammarAccess.getExpressionAccess().getCOLONParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    this_COLON_1=ruleCOLON();

            	    state._fsp--;


            	    				current.merge(this_COLON_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getExpressionAccess().getValue_expressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_26);
            	    this_value_expression_2=rulevalue_expression();

            	    state._fsp--;


            	    				current.merge(this_value_expression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulevalue_expression"
    // InternalMdxParser.g:1225:1: entryRulevalue_expression returns [String current=null] : iv_rulevalue_expression= rulevalue_expression EOF ;
    public final String entryRulevalue_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_expression = null;


        try {
            // InternalMdxParser.g:1225:56: (iv_rulevalue_expression= rulevalue_expression EOF )
            // InternalMdxParser.g:1226:2: iv_rulevalue_expression= rulevalue_expression EOF
            {
             newCompositeNode(grammarAccess.getValue_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_expression=rulevalue_expression();

            state._fsp--;

             current =iv_rulevalue_expression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_expression"


    // $ANTLR start "rulevalue_expression"
    // InternalMdxParser.g:1232:1: rulevalue_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_term5_0= ruleterm5 (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )* ) ;
    public final AntlrDatatypeRuleToken rulevalue_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_term5_0 = null;

        AntlrDatatypeRuleToken this_value_xor_expression_1 = null;

        AntlrDatatypeRuleToken this_value_or_expression_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1238:2: ( (this_term5_0= ruleterm5 (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )* ) )
            // InternalMdxParser.g:1239:2: (this_term5_0= ruleterm5 (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )* )
            {
            // InternalMdxParser.g:1239:2: (this_term5_0= ruleterm5 (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )* )
            // InternalMdxParser.g:1240:3: this_term5_0= ruleterm5 (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )*
            {

            			newCompositeNode(grammarAccess.getValue_expressionAccess().getTerm5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_term5_0=ruleterm5();

            state._fsp--;


            			current.merge(this_term5_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1250:3: (this_value_xor_expression_1= rulevalue_xor_expression | this_value_or_expression_2= rulevalue_or_expression )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==XOR) ) {
                    alt22=1;
                }
                else if ( (LA22_0==OR) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMdxParser.g:1251:4: this_value_xor_expression_1= rulevalue_xor_expression
            	    {

            	    				newCompositeNode(grammarAccess.getValue_expressionAccess().getValue_xor_expressionParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_27);
            	    this_value_xor_expression_1=rulevalue_xor_expression();

            	    state._fsp--;


            	    				current.merge(this_value_xor_expression_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMdxParser.g:1262:4: this_value_or_expression_2= rulevalue_or_expression
            	    {

            	    				newCompositeNode(grammarAccess.getValue_expressionAccess().getValue_or_expressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_27);
            	    this_value_or_expression_2=rulevalue_or_expression();

            	    state._fsp--;


            	    				current.merge(this_value_or_expression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_expression"


    // $ANTLR start "entryRulevalue_xor_expression"
    // InternalMdxParser.g:1277:1: entryRulevalue_xor_expression returns [String current=null] : iv_rulevalue_xor_expression= rulevalue_xor_expression EOF ;
    public final String entryRulevalue_xor_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_xor_expression = null;


        try {
            // InternalMdxParser.g:1277:60: (iv_rulevalue_xor_expression= rulevalue_xor_expression EOF )
            // InternalMdxParser.g:1278:2: iv_rulevalue_xor_expression= rulevalue_xor_expression EOF
            {
             newCompositeNode(grammarAccess.getValue_xor_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_xor_expression=rulevalue_xor_expression();

            state._fsp--;

             current =iv_rulevalue_xor_expression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_xor_expression"


    // $ANTLR start "rulevalue_xor_expression"
    // InternalMdxParser.g:1284:1: rulevalue_xor_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= XOR this_term5_1= ruleterm5 ) ;
    public final AntlrDatatypeRuleToken rulevalue_xor_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_term5_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1290:2: ( (kw= XOR this_term5_1= ruleterm5 ) )
            // InternalMdxParser.g:1291:2: (kw= XOR this_term5_1= ruleterm5 )
            {
            // InternalMdxParser.g:1291:2: (kw= XOR this_term5_1= ruleterm5 )
            // InternalMdxParser.g:1292:3: kw= XOR this_term5_1= ruleterm5
            {
            kw=(Token)match(input,XOR,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getValue_xor_expressionAccess().getXORKeyword_0());
            		

            			newCompositeNode(grammarAccess.getValue_xor_expressionAccess().getTerm5ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_term5_1=ruleterm5();

            state._fsp--;


            			current.merge(this_term5_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_xor_expression"


    // $ANTLR start "entryRulevalue_or_expression"
    // InternalMdxParser.g:1311:1: entryRulevalue_or_expression returns [String current=null] : iv_rulevalue_or_expression= rulevalue_or_expression EOF ;
    public final String entryRulevalue_or_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_or_expression = null;


        try {
            // InternalMdxParser.g:1311:59: (iv_rulevalue_or_expression= rulevalue_or_expression EOF )
            // InternalMdxParser.g:1312:2: iv_rulevalue_or_expression= rulevalue_or_expression EOF
            {
             newCompositeNode(grammarAccess.getValue_or_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_or_expression=rulevalue_or_expression();

            state._fsp--;

             current =iv_rulevalue_or_expression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_or_expression"


    // $ANTLR start "rulevalue_or_expression"
    // InternalMdxParser.g:1318:1: rulevalue_or_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= OR this_term5_1= ruleterm5 ) ;
    public final AntlrDatatypeRuleToken rulevalue_or_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_term5_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1324:2: ( (kw= OR this_term5_1= ruleterm5 ) )
            // InternalMdxParser.g:1325:2: (kw= OR this_term5_1= ruleterm5 )
            {
            // InternalMdxParser.g:1325:2: (kw= OR this_term5_1= ruleterm5 )
            // InternalMdxParser.g:1326:3: kw= OR this_term5_1= ruleterm5
            {
            kw=(Token)match(input,OR,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getValue_or_expressionAccess().getORKeyword_0());
            		

            			newCompositeNode(grammarAccess.getValue_or_expressionAccess().getTerm5ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_term5_1=ruleterm5();

            state._fsp--;


            			current.merge(this_term5_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_or_expression"


    // $ANTLR start "entryRuleterm5"
    // InternalMdxParser.g:1345:1: entryRuleterm5 returns [String current=null] : iv_ruleterm5= ruleterm5 EOF ;
    public final String entryRuleterm5() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm5 = null;


        try {
            // InternalMdxParser.g:1345:45: (iv_ruleterm5= ruleterm5 EOF )
            // InternalMdxParser.g:1346:2: iv_ruleterm5= ruleterm5 EOF
            {
             newCompositeNode(grammarAccess.getTerm5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm5=ruleterm5();

            state._fsp--;

             current =iv_ruleterm5.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm5"


    // $ANTLR start "ruleterm5"
    // InternalMdxParser.g:1352:1: ruleterm5 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_term4_0= ruleterm4 (kw= AND this_term4_2= ruleterm4 )* ) ;
    public final AntlrDatatypeRuleToken ruleterm5() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_term4_0 = null;

        AntlrDatatypeRuleToken this_term4_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1358:2: ( (this_term4_0= ruleterm4 (kw= AND this_term4_2= ruleterm4 )* ) )
            // InternalMdxParser.g:1359:2: (this_term4_0= ruleterm4 (kw= AND this_term4_2= ruleterm4 )* )
            {
            // InternalMdxParser.g:1359:2: (this_term4_0= ruleterm4 (kw= AND this_term4_2= ruleterm4 )* )
            // InternalMdxParser.g:1360:3: this_term4_0= ruleterm4 (kw= AND this_term4_2= ruleterm4 )*
            {

            			newCompositeNode(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_term4_0=ruleterm4();

            state._fsp--;


            			current.merge(this_term4_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1370:3: (kw= AND this_term4_2= ruleterm4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMdxParser.g:1371:4: kw= AND this_term4_2= ruleterm4
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getTerm5Access().getANDKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_28);
            	    this_term4_2=ruleterm4();

            	    state._fsp--;


            	    				current.merge(this_term4_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm5"


    // $ANTLR start "entryRuleterm4"
    // InternalMdxParser.g:1391:1: entryRuleterm4 returns [String current=null] : iv_ruleterm4= ruleterm4 EOF ;
    public final String entryRuleterm4() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm4 = null;


        try {
            // InternalMdxParser.g:1391:45: (iv_ruleterm4= ruleterm4 EOF )
            // InternalMdxParser.g:1392:2: iv_ruleterm4= ruleterm4 EOF
            {
             newCompositeNode(grammarAccess.getTerm4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm4=ruleterm4();

            state._fsp--;

             current =iv_ruleterm4.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm4"


    // $ANTLR start "ruleterm4"
    // InternalMdxParser.g:1398:1: ruleterm4 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NOT this_term4_1= ruleterm4 ) | this_term3_2= ruleterm3 ) ;
    public final AntlrDatatypeRuleToken ruleterm4() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_term4_1 = null;

        AntlrDatatypeRuleToken this_term3_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1404:2: ( ( (kw= NOT this_term4_1= ruleterm4 ) | this_term3_2= ruleterm3 ) )
            // InternalMdxParser.g:1405:2: ( (kw= NOT this_term4_1= ruleterm4 ) | this_term3_2= ruleterm3 )
            {
            // InternalMdxParser.g:1405:2: ( (kw= NOT this_term4_1= ruleterm4 ) | this_term3_2= ruleterm3 )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NOT) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=PROPERTIES && LA24_0<=DIMENSION)||LA24_0==CASE||LA24_0==LeftParenthesis||LA24_0==PlusSign||LA24_0==HyphenMinus||LA24_0==LeftCurlyBracket||LA24_0==RULE_ID||LA24_0==RULE_QUOTED_ID||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMdxParser.g:1406:3: (kw= NOT this_term4_1= ruleterm4 )
                    {
                    // InternalMdxParser.g:1406:3: (kw= NOT this_term4_1= ruleterm4 )
                    // InternalMdxParser.g:1407:4: kw= NOT this_term4_1= ruleterm4
                    {
                    kw=(Token)match(input,NOT,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTerm4Access().getNOTKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerm4Access().getTerm4ParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_term4_1=ruleterm4();

                    state._fsp--;


                    				current.merge(this_term4_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1424:3: this_term3_2= ruleterm3
                    {

                    			newCompositeNode(grammarAccess.getTerm4Access().getTerm3ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_term3_2=ruleterm3();

                    state._fsp--;


                    			current.merge(this_term3_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm4"


    // $ANTLR start "entryRuleterm3"
    // InternalMdxParser.g:1438:1: entryRuleterm3 returns [String current=null] : iv_ruleterm3= ruleterm3 EOF ;
    public final String entryRuleterm3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm3 = null;


        try {
            // InternalMdxParser.g:1438:45: (iv_ruleterm3= ruleterm3 EOF )
            // InternalMdxParser.g:1439:2: iv_ruleterm3= ruleterm3 EOF
            {
             newCompositeNode(grammarAccess.getTerm3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm3=ruleterm3();

            state._fsp--;

             current =iv_ruleterm3.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm3"


    // $ANTLR start "ruleterm3"
    // InternalMdxParser.g:1445:1: ruleterm3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_term2_0= ruleterm2 (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )* ) ;
    public final AntlrDatatypeRuleToken ruleterm3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_term2_0 = null;

        AntlrDatatypeRuleToken this_comp_op_1 = null;

        AntlrDatatypeRuleToken this_term2_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1451:2: ( (this_term2_0= ruleterm2 (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )* ) )
            // InternalMdxParser.g:1452:2: (this_term2_0= ruleterm2 (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )* )
            {
            // InternalMdxParser.g:1452:2: (this_term2_0= ruleterm2 (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )* )
            // InternalMdxParser.g:1453:3: this_term2_0= ruleterm2 (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )*
            {

            			newCompositeNode(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_term2_0=ruleterm2();

            state._fsp--;


            			current.merge(this_term2_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1463:3: (this_comp_op_1= rulecomp_op this_term2_2= ruleterm2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=LessThanSignEqualsSign && LA25_0<=GreaterThanSignEqualsSign)||(LA25_0>=LessThanSign && LA25_0<=GreaterThanSign)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMdxParser.g:1464:4: this_comp_op_1= rulecomp_op this_term2_2= ruleterm2
            	    {

            	    				newCompositeNode(grammarAccess.getTerm3Access().getComp_opParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    this_comp_op_1=rulecomp_op();

            	    state._fsp--;


            	    				current.merge(this_comp_op_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_29);
            	    this_term2_2=ruleterm2();

            	    state._fsp--;


            	    				current.merge(this_term2_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm3"


    // $ANTLR start "entryRuleterm2"
    // InternalMdxParser.g:1489:1: entryRuleterm2 returns [String current=null] : iv_ruleterm2= ruleterm2 EOF ;
    public final String entryRuleterm2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm2 = null;


        try {
            // InternalMdxParser.g:1489:45: (iv_ruleterm2= ruleterm2 EOF )
            // InternalMdxParser.g:1490:2: iv_ruleterm2= ruleterm2 EOF
            {
             newCompositeNode(grammarAccess.getTerm2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm2=ruleterm2();

            state._fsp--;

             current =iv_ruleterm2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm2"


    // $ANTLR start "ruleterm2"
    // InternalMdxParser.g:1496:1: ruleterm2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_term_0= ruleterm ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )* ) ;
    public final AntlrDatatypeRuleToken ruleterm2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_term_0 = null;

        AntlrDatatypeRuleToken this_CONCAT_1 = null;

        AntlrDatatypeRuleToken this_PLUS_2 = null;

        AntlrDatatypeRuleToken this_MINUS_3 = null;

        AntlrDatatypeRuleToken this_term_4 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1502:2: ( (this_term_0= ruleterm ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )* ) )
            // InternalMdxParser.g:1503:2: (this_term_0= ruleterm ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )* )
            {
            // InternalMdxParser.g:1503:2: (this_term_0= ruleterm ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )* )
            // InternalMdxParser.g:1504:3: this_term_0= ruleterm ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )*
            {

            			newCompositeNode(grammarAccess.getTerm2Access().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_term_0=ruleterm();

            state._fsp--;


            			current.merge(this_term_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1514:3: ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==VerticalLineVerticalLine||LA27_0==PlusSign||LA27_0==HyphenMinus) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMdxParser.g:1515:4: (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_term_4= ruleterm
            	    {
            	    // InternalMdxParser.g:1515:4: (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case VerticalLineVerticalLine:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case PlusSign:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalMdxParser.g:1516:5: this_CONCAT_1= ruleCONCAT
            	            {

            	            					newCompositeNode(grammarAccess.getTerm2Access().getCONCATParserRuleCall_1_0_0());
            	            				
            	            pushFollow(FOLLOW_9);
            	            this_CONCAT_1=ruleCONCAT();

            	            state._fsp--;


            	            					current.merge(this_CONCAT_1);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMdxParser.g:1527:5: this_PLUS_2= rulePLUS
            	            {

            	            					newCompositeNode(grammarAccess.getTerm2Access().getPLUSParserRuleCall_1_0_1());
            	            				
            	            pushFollow(FOLLOW_9);
            	            this_PLUS_2=rulePLUS();

            	            state._fsp--;


            	            					current.merge(this_PLUS_2);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMdxParser.g:1538:5: this_MINUS_3= ruleMINUS
            	            {

            	            					newCompositeNode(grammarAccess.getTerm2Access().getMINUSParserRuleCall_1_0_2());
            	            				
            	            pushFollow(FOLLOW_9);
            	            this_MINUS_3=ruleMINUS();

            	            state._fsp--;


            	            					current.merge(this_MINUS_3);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getTerm2Access().getTermParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_30);
            	    this_term_4=ruleterm();

            	    state._fsp--;


            	    				current.merge(this_term_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm2"


    // $ANTLR start "entryRuleterm"
    // InternalMdxParser.g:1564:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // InternalMdxParser.g:1564:44: (iv_ruleterm= ruleterm EOF )
            // InternalMdxParser.g:1565:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalMdxParser.g:1571:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_SOLIDUS_1 = null;

        AntlrDatatypeRuleToken this_ASTERISK_2 = null;

        AntlrDatatypeRuleToken this_factor_3 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1577:2: ( (this_factor_0= rulefactor ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )* ) )
            // InternalMdxParser.g:1578:2: (this_factor_0= rulefactor ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )* )
            {
            // InternalMdxParser.g:1578:2: (this_factor_0= rulefactor ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )* )
            // InternalMdxParser.g:1579:3: this_factor_0= rulefactor ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_factor_0=rulefactor();

            state._fsp--;


            			current.merge(this_factor_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1589:3: ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Asterisk||LA29_0==Solidus) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMdxParser.g:1590:4: (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_factor_3= rulefactor
            	    {
            	    // InternalMdxParser.g:1590:4: (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==Solidus) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==Asterisk) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalMdxParser.g:1591:5: this_SOLIDUS_1= ruleSOLIDUS
            	            {

            	            					newCompositeNode(grammarAccess.getTermAccess().getSOLIDUSParserRuleCall_1_0_0());
            	            				
            	            pushFollow(FOLLOW_9);
            	            this_SOLIDUS_1=ruleSOLIDUS();

            	            state._fsp--;


            	            					current.merge(this_SOLIDUS_1);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMdxParser.g:1602:5: this_ASTERISK_2= ruleASTERISK
            	            {

            	            					newCompositeNode(grammarAccess.getTermAccess().getASTERISKParserRuleCall_1_0_1());
            	            				
            	            pushFollow(FOLLOW_9);
            	            this_ASTERISK_2=ruleASTERISK();

            	            state._fsp--;


            	            					current.merge(this_ASTERISK_2);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_31);
            	    this_factor_3=rulefactor();

            	    state._fsp--;


            	    				current.merge(this_factor_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalMdxParser.g:1628:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // InternalMdxParser.g:1628:46: (iv_rulefactor= rulefactor EOF )
            // InternalMdxParser.g:1629:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalMdxParser.g:1635:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary ) | (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary ) | this_value_expression_primary_4= rulevalue_expression_primary ) ;
    public final AntlrDatatypeRuleToken rulefactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MINUS_0 = null;

        AntlrDatatypeRuleToken this_value_expression_primary_1 = null;

        AntlrDatatypeRuleToken this_PLUS_2 = null;

        AntlrDatatypeRuleToken this_value_expression_primary_3 = null;

        AntlrDatatypeRuleToken this_value_expression_primary_4 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1641:2: ( ( (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary ) | (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary ) | this_value_expression_primary_4= rulevalue_expression_primary ) )
            // InternalMdxParser.g:1642:2: ( (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary ) | (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary ) | this_value_expression_primary_4= rulevalue_expression_primary )
            {
            // InternalMdxParser.g:1642:2: ( (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary ) | (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary ) | this_value_expression_primary_4= rulevalue_expression_primary )
            int alt30=3;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt30=1;
                }
                break;
            case PlusSign:
                {
                alt30=2;
                }
                break;
            case PROPERTIES:
            case DIMENSION:
            case CASE:
            case LeftParenthesis:
            case LeftCurlyBracket:
            case RULE_ID:
            case RULE_QUOTED_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMdxParser.g:1643:3: (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary )
                    {
                    // InternalMdxParser.g:1643:3: (this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary )
                    // InternalMdxParser.g:1644:4: this_MINUS_0= ruleMINUS this_value_expression_primary_1= rulevalue_expression_primary
                    {

                    				newCompositeNode(grammarAccess.getFactorAccess().getMINUSParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_MINUS_0=ruleMINUS();

                    state._fsp--;


                    				current.merge(this_MINUS_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFactorAccess().getValue_expression_primaryParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_value_expression_primary_1=rulevalue_expression_primary();

                    state._fsp--;


                    				current.merge(this_value_expression_primary_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1666:3: (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary )
                    {
                    // InternalMdxParser.g:1666:3: (this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary )
                    // InternalMdxParser.g:1667:4: this_PLUS_2= rulePLUS this_value_expression_primary_3= rulevalue_expression_primary
                    {

                    				newCompositeNode(grammarAccess.getFactorAccess().getPLUSParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_PLUS_2=rulePLUS();

                    state._fsp--;


                    				current.merge(this_PLUS_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFactorAccess().getValue_expression_primaryParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_value_expression_primary_3=rulevalue_expression_primary();

                    state._fsp--;


                    				current.merge(this_value_expression_primary_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1689:3: this_value_expression_primary_4= rulevalue_expression_primary
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getValue_expression_primaryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_value_expression_primary_4=rulevalue_expression_primary();

                    state._fsp--;


                    			current.merge(this_value_expression_primary_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulefunction"
    // InternalMdxParser.g:1703:1: entryRulefunction returns [String current=null] : iv_rulefunction= rulefunction EOF ;
    public final String entryRulefunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction = null;


        try {
            // InternalMdxParser.g:1703:48: (iv_rulefunction= rulefunction EOF )
            // InternalMdxParser.g:1704:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // InternalMdxParser.g:1710:1: rulefunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier this_LPAREN_1= ruleLPAREN (this_exp_list_2= ruleexp_list )? this_RPAREN_3= ruleRPAREN ) ;
    public final AntlrDatatypeRuleToken rulefunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_LPAREN_1 = null;

        AntlrDatatypeRuleToken this_exp_list_2 = null;

        AntlrDatatypeRuleToken this_RPAREN_3 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1716:2: ( (this_identifier_0= ruleidentifier this_LPAREN_1= ruleLPAREN (this_exp_list_2= ruleexp_list )? this_RPAREN_3= ruleRPAREN ) )
            // InternalMdxParser.g:1717:2: (this_identifier_0= ruleidentifier this_LPAREN_1= ruleLPAREN (this_exp_list_2= ruleexp_list )? this_RPAREN_3= ruleRPAREN )
            {
            // InternalMdxParser.g:1717:2: (this_identifier_0= ruleidentifier this_LPAREN_1= ruleLPAREN (this_exp_list_2= ruleexp_list )? this_RPAREN_3= ruleRPAREN )
            // InternalMdxParser.g:1718:3: this_identifier_0= ruleidentifier this_LPAREN_1= ruleLPAREN (this_exp_list_2= ruleexp_list )? this_RPAREN_3= ruleRPAREN
            {

            			newCompositeNode(grammarAccess.getFunctionAccess().getIdentifierParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_identifier_0=ruleidentifier();

            state._fsp--;


            			current.merge(this_identifier_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getFunctionAccess().getLPARENParserRuleCall_1());
            		
            pushFollow(FOLLOW_33);
            this_LPAREN_1=ruleLPAREN();

            state._fsp--;


            			current.merge(this_LPAREN_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1738:3: (this_exp_list_2= ruleexp_list )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=PROPERTIES && LA31_0<=DIMENSION)||LA31_0==CASE||LA31_0==NOT||LA31_0==LeftParenthesis||LA31_0==PlusSign||LA31_0==HyphenMinus||LA31_0==LeftCurlyBracket||LA31_0==RULE_ID||LA31_0==RULE_QUOTED_ID||(LA31_0>=RULE_INT && LA31_0<=RULE_STRING)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMdxParser.g:1739:4: this_exp_list_2= ruleexp_list
                    {

                    				newCompositeNode(grammarAccess.getFunctionAccess().getExp_listParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_33);
                    this_exp_list_2=ruleexp_list();

                    state._fsp--;


                    				current.merge(this_exp_list_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getFunctionAccess().getRPARENParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_RPAREN_3=ruleRPAREN();

            state._fsp--;


            			current.merge(this_RPAREN_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRulevalue_expression_primary"
    // InternalMdxParser.g:1764:1: entryRulevalue_expression_primary returns [String current=null] : iv_rulevalue_expression_primary= rulevalue_expression_primary EOF ;
    public final String entryRulevalue_expression_primary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_expression_primary = null;


        try {
            // InternalMdxParser.g:1764:64: (iv_rulevalue_expression_primary= rulevalue_expression_primary EOF )
            // InternalMdxParser.g:1765:2: iv_rulevalue_expression_primary= rulevalue_expression_primary EOF
            {
             newCompositeNode(grammarAccess.getValue_expression_primaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_expression_primary=rulevalue_expression_primary();

            state._fsp--;

             current =iv_rulevalue_expression_primary.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_expression_primary"


    // $ANTLR start "rulevalue_expression_primary"
    // InternalMdxParser.g:1771:1: rulevalue_expression_primary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_expression_primary0_0= rulevalue_expression_primary0 (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )* ) ;
    public final AntlrDatatypeRuleToken rulevalue_expression_primary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_value_expression_primary0_0 = null;

        AntlrDatatypeRuleToken this_DOT_1 = null;

        AntlrDatatypeRuleToken this_unquoted_identifier_2 = null;

        AntlrDatatypeRuleToken this_quoted_identifier_3 = null;

        AntlrDatatypeRuleToken this_amp_quoted_identifier_4 = null;

        AntlrDatatypeRuleToken this_function_5 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1777:2: ( (this_value_expression_primary0_0= rulevalue_expression_primary0 (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )* ) )
            // InternalMdxParser.g:1778:2: (this_value_expression_primary0_0= rulevalue_expression_primary0 (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )* )
            {
            // InternalMdxParser.g:1778:2: (this_value_expression_primary0_0= rulevalue_expression_primary0 (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )* )
            // InternalMdxParser.g:1779:3: this_value_expression_primary0_0= rulevalue_expression_primary0 (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )*
            {

            			newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getValue_expression_primary0ParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_value_expression_primary0_0=rulevalue_expression_primary0();

            state._fsp--;


            			current.merge(this_value_expression_primary0_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:1789:3: (this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==FullStop) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMdxParser.g:1790:4: this_DOT_1= ruleDOT (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction )
            	    {

            	    				newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getDOTParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_34);
            	    this_DOT_1=ruleDOT();

            	    state._fsp--;


            	    				current.merge(this_DOT_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMdxParser.g:1800:4: (this_unquoted_identifier_2= ruleunquoted_identifier | this_quoted_identifier_3= rulequoted_identifier | this_amp_quoted_identifier_4= ruleamp_quoted_identifier | this_function_5= rulefunction )
            	    int alt32=4;
            	    switch ( input.LA(1) ) {
            	    case DIMENSION:
            	        {
            	        int LA32_1 = input.LA(2);

            	        if ( (LA32_1==EOF||(LA32_1>=PROPERTIES && LA32_1<=SELECT)||(LA32_1>=CELL && LA32_1<=ELSE)||(LA32_1>=THEN && LA32_1<=WHEN)||(LA32_1>=AND && LA32_1<=END)||(LA32_1>=SET && LA32_1<=GreaterThanSignEqualsSign)||(LA32_1>=ON && LA32_1<=Apostrophe)||(LA32_1>=RightParenthesis && LA32_1<=Colon)||(LA32_1>=LessThanSign && LA32_1<=GreaterThanSign)||LA32_1==RightCurlyBracket) ) {
            	            alt32=1;
            	        }
            	        else if ( (LA32_1==LeftParenthesis) ) {
            	            alt32=4;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case PROPERTIES:
            	        {
            	        int LA32_2 = input.LA(2);

            	        if ( (LA32_2==LeftParenthesis) ) {
            	            alt32=4;
            	        }
            	        else if ( (LA32_2==EOF||(LA32_2>=PROPERTIES && LA32_2<=SELECT)||(LA32_2>=CELL && LA32_2<=ELSE)||(LA32_2>=THEN && LA32_2<=WHEN)||(LA32_2>=AND && LA32_2<=END)||(LA32_2>=SET && LA32_2<=GreaterThanSignEqualsSign)||(LA32_2>=ON && LA32_2<=Apostrophe)||(LA32_2>=RightParenthesis && LA32_2<=Colon)||(LA32_2>=LessThanSign && LA32_2<=GreaterThanSign)||LA32_2==RightCurlyBracket) ) {
            	            alt32=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        int LA32_3 = input.LA(2);

            	        if ( (LA32_3==LeftParenthesis) ) {
            	            alt32=4;
            	        }
            	        else if ( (LA32_3==EOF||(LA32_3>=PROPERTIES && LA32_3<=SELECT)||(LA32_3>=CELL && LA32_3<=ELSE)||(LA32_3>=THEN && LA32_3<=WHEN)||(LA32_3>=AND && LA32_3<=END)||(LA32_3>=SET && LA32_3<=GreaterThanSignEqualsSign)||(LA32_3>=ON && LA32_3<=Apostrophe)||(LA32_3>=RightParenthesis && LA32_3<=Colon)||(LA32_3>=LessThanSign && LA32_3<=GreaterThanSign)||LA32_3==RightCurlyBracket) ) {
            	            alt32=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_QUOTED_ID:
            	        {
            	        int LA32_4 = input.LA(2);

            	        if ( (LA32_4==LeftParenthesis) ) {
            	            alt32=4;
            	        }
            	        else if ( (LA32_4==EOF||(LA32_4>=PROPERTIES && LA32_4<=SELECT)||(LA32_4>=CELL && LA32_4<=ELSE)||(LA32_4>=THEN && LA32_4<=WHEN)||(LA32_4>=AND && LA32_4<=END)||(LA32_4>=SET && LA32_4<=GreaterThanSignEqualsSign)||(LA32_4>=ON && LA32_4<=Apostrophe)||(LA32_4>=RightParenthesis && LA32_4<=Colon)||(LA32_4>=LessThanSign && LA32_4<=GreaterThanSign)||LA32_4==RightCurlyBracket) ) {
            	            alt32=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_AMP_QUOTED_ID:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalMdxParser.g:1801:5: this_unquoted_identifier_2= ruleunquoted_identifier
            	            {

            	            					newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getUnquoted_identifierParserRuleCall_1_1_0());
            	            				
            	            pushFollow(FOLLOW_19);
            	            this_unquoted_identifier_2=ruleunquoted_identifier();

            	            state._fsp--;


            	            					current.merge(this_unquoted_identifier_2);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMdxParser.g:1812:5: this_quoted_identifier_3= rulequoted_identifier
            	            {

            	            					newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getQuoted_identifierParserRuleCall_1_1_1());
            	            				
            	            pushFollow(FOLLOW_19);
            	            this_quoted_identifier_3=rulequoted_identifier();

            	            state._fsp--;


            	            					current.merge(this_quoted_identifier_3);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMdxParser.g:1823:5: this_amp_quoted_identifier_4= ruleamp_quoted_identifier
            	            {

            	            					newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getAmp_quoted_identifierParserRuleCall_1_1_2());
            	            				
            	            pushFollow(FOLLOW_19);
            	            this_amp_quoted_identifier_4=ruleamp_quoted_identifier();

            	            state._fsp--;


            	            					current.merge(this_amp_quoted_identifier_4);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalMdxParser.g:1834:5: this_function_5= rulefunction
            	            {

            	            					newCompositeNode(grammarAccess.getValue_expression_primaryAccess().getFunctionParserRuleCall_1_1_3());
            	            				
            	            pushFollow(FOLLOW_19);
            	            this_function_5=rulefunction();

            	            state._fsp--;


            	            					current.merge(this_function_5);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_expression_primary"


    // $ANTLR start "entryRulevalue_expression_primary0"
    // InternalMdxParser.g:1850:1: entryRulevalue_expression_primary0 returns [String current=null] : iv_rulevalue_expression_primary0= rulevalue_expression_primary0 EOF ;
    public final String entryRulevalue_expression_primary0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_expression_primary0 = null;


        try {
            // InternalMdxParser.g:1850:65: (iv_rulevalue_expression_primary0= rulevalue_expression_primary0 EOF )
            // InternalMdxParser.g:1851:2: iv_rulevalue_expression_primary0= rulevalue_expression_primary0 EOF
            {
             newCompositeNode(grammarAccess.getValue_expression_primary0Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_expression_primary0=rulevalue_expression_primary0();

            state._fsp--;

             current =iv_rulevalue_expression_primary0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_expression_primary0"


    // $ANTLR start "rulevalue_expression_primary0"
    // InternalMdxParser.g:1857:1: rulevalue_expression_primary0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_function_0= rulefunction | (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE ) | this_case_expression_7= rulecase_expression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_identifier_10= ruleidentifier ) ;
    public final AntlrDatatypeRuleToken rulevalue_expression_primary0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_8=null;
        Token this_INT_9=null;
        AntlrDatatypeRuleToken this_function_0 = null;

        AntlrDatatypeRuleToken this_LPAREN_1 = null;

        AntlrDatatypeRuleToken this_exp_list_2 = null;

        AntlrDatatypeRuleToken this_RPAREN_3 = null;

        AntlrDatatypeRuleToken this_LBRACE_4 = null;

        AntlrDatatypeRuleToken this_exp_list_5 = null;

        AntlrDatatypeRuleToken this_RBRACE_6 = null;

        AntlrDatatypeRuleToken this_case_expression_7 = null;

        AntlrDatatypeRuleToken this_identifier_10 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1863:2: ( (this_function_0= rulefunction | (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE ) | this_case_expression_7= rulecase_expression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_identifier_10= ruleidentifier ) )
            // InternalMdxParser.g:1864:2: (this_function_0= rulefunction | (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE ) | this_case_expression_7= rulecase_expression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_identifier_10= ruleidentifier )
            {
            // InternalMdxParser.g:1864:2: (this_function_0= rulefunction | (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE ) | this_case_expression_7= rulecase_expression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_identifier_10= ruleidentifier )
            int alt35=7;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalMdxParser.g:1865:3: this_function_0= rulefunction
                    {

                    			newCompositeNode(grammarAccess.getValue_expression_primary0Access().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_function_0=rulefunction();

                    state._fsp--;


                    			current.merge(this_function_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1876:3: (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN )
                    {
                    // InternalMdxParser.g:1876:3: (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN )
                    // InternalMdxParser.g:1877:4: this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN
                    {

                    				newCompositeNode(grammarAccess.getValue_expression_primary0Access().getLPARENParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_LPAREN_1=ruleLPAREN();

                    state._fsp--;


                    				current.merge(this_LPAREN_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getValue_expression_primary0Access().getExp_listParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_exp_list_2=ruleexp_list();

                    state._fsp--;


                    				current.merge(this_exp_list_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getValue_expression_primary0Access().getRPARENParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_RPAREN_3=ruleRPAREN();

                    state._fsp--;


                    				current.merge(this_RPAREN_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1909:3: (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE )
                    {
                    // InternalMdxParser.g:1909:3: (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE )
                    // InternalMdxParser.g:1910:4: this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE
                    {

                    				newCompositeNode(grammarAccess.getValue_expression_primary0Access().getLBRACEParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_35);
                    this_LBRACE_4=ruleLBRACE();

                    state._fsp--;


                    				current.merge(this_LBRACE_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMdxParser.g:1920:4: (this_exp_list_5= ruleexp_list )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=PROPERTIES && LA34_0<=DIMENSION)||LA34_0==CASE||LA34_0==NOT||LA34_0==LeftParenthesis||LA34_0==PlusSign||LA34_0==HyphenMinus||LA34_0==LeftCurlyBracket||LA34_0==RULE_ID||LA34_0==RULE_QUOTED_ID||(LA34_0>=RULE_INT && LA34_0<=RULE_STRING)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMdxParser.g:1921:5: this_exp_list_5= ruleexp_list
                            {

                            					newCompositeNode(grammarAccess.getValue_expression_primary0Access().getExp_listParserRuleCall_2_1());
                            				
                            pushFollow(FOLLOW_35);
                            this_exp_list_5=ruleexp_list();

                            state._fsp--;


                            					current.merge(this_exp_list_5);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getValue_expression_primary0Access().getRBRACEParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_RBRACE_6=ruleRBRACE();

                    state._fsp--;


                    				current.merge(this_RBRACE_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMdxParser.g:1944:3: this_case_expression_7= rulecase_expression
                    {

                    			newCompositeNode(grammarAccess.getValue_expression_primary0Access().getCase_expressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_case_expression_7=rulecase_expression();

                    state._fsp--;


                    			current.merge(this_case_expression_7);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMdxParser.g:1955:3: this_STRING_8= RULE_STRING
                    {
                    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_8);
                    		

                    			newLeafNode(this_STRING_8, grammarAccess.getValue_expression_primary0Access().getSTRINGTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMdxParser.g:1963:3: this_INT_9= RULE_INT
                    {
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_9);
                    		

                    			newLeafNode(this_INT_9, grammarAccess.getValue_expression_primary0Access().getINTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMdxParser.g:1971:3: this_identifier_10= ruleidentifier
                    {

                    			newCompositeNode(grammarAccess.getValue_expression_primary0Access().getIdentifierParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_identifier_10=ruleidentifier();

                    state._fsp--;


                    			current.merge(this_identifier_10);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_expression_primary0"


    // $ANTLR start "entryRuleexp_list"
    // InternalMdxParser.g:1985:1: entryRuleexp_list returns [String current=null] : iv_ruleexp_list= ruleexp_list EOF ;
    public final String entryRuleexp_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexp_list = null;


        try {
            // InternalMdxParser.g:1985:48: (iv_ruleexp_list= ruleexp_list EOF )
            // InternalMdxParser.g:1986:2: iv_ruleexp_list= ruleexp_list EOF
            {
             newCompositeNode(grammarAccess.getExp_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexp_list=ruleexp_list();

            state._fsp--;

             current =iv_ruleexp_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexp_list"


    // $ANTLR start "ruleexp_list"
    // InternalMdxParser.g:1992:1: ruleexp_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )* ) ;
    public final AntlrDatatypeRuleToken ruleexp_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_COMMA_1 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:1998:2: ( (this_expression_0= ruleexpression (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )* ) )
            // InternalMdxParser.g:1999:2: (this_expression_0= ruleexpression (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )* )
            {
            // InternalMdxParser.g:1999:2: (this_expression_0= ruleexpression (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )* )
            // InternalMdxParser.g:2000:3: this_expression_0= ruleexpression (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )*
            {

            			newCompositeNode(grammarAccess.getExp_listAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_expression_0=ruleexpression();

            state._fsp--;


            			current.merge(this_expression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:2010:3: (this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMdxParser.g:2011:4: this_COMMA_1= ruleCOMMA this_expression_2= ruleexpression
            	    {

            	    				newCompositeNode(grammarAccess.getExp_listAccess().getCOMMAParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    this_COMMA_1=ruleCOMMA();

            	    state._fsp--;


            	    				current.merge(this_COMMA_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getExp_listAccess().getExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_expression_2=ruleexpression();

            	    state._fsp--;


            	    				current.merge(this_expression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexp_list"


    // $ANTLR start "entryRulecase_expression"
    // InternalMdxParser.g:2036:1: entryRulecase_expression returns [String current=null] : iv_rulecase_expression= rulecase_expression EOF ;
    public final String entryRulecase_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_expression = null;


        try {
            // InternalMdxParser.g:2036:55: (iv_rulecase_expression= rulecase_expression EOF )
            // InternalMdxParser.g:2037:2: iv_rulecase_expression= rulecase_expression EOF
            {
             newCompositeNode(grammarAccess.getCase_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_expression=rulecase_expression();

            state._fsp--;

             current =iv_rulecase_expression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_expression"


    // $ANTLR start "rulecase_expression"
    // InternalMdxParser.g:2043:1: rulecase_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CASE (this_value_expression_1= rulevalue_expression )? (this_when_list_2= rulewhen_list )? (kw= ELSE this_value_expression_4= rulevalue_expression )? kw= END ) ;
    public final AntlrDatatypeRuleToken rulecase_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_expression_1 = null;

        AntlrDatatypeRuleToken this_when_list_2 = null;

        AntlrDatatypeRuleToken this_value_expression_4 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2049:2: ( (kw= CASE (this_value_expression_1= rulevalue_expression )? (this_when_list_2= rulewhen_list )? (kw= ELSE this_value_expression_4= rulevalue_expression )? kw= END ) )
            // InternalMdxParser.g:2050:2: (kw= CASE (this_value_expression_1= rulevalue_expression )? (this_when_list_2= rulewhen_list )? (kw= ELSE this_value_expression_4= rulevalue_expression )? kw= END )
            {
            // InternalMdxParser.g:2050:2: (kw= CASE (this_value_expression_1= rulevalue_expression )? (this_when_list_2= rulewhen_list )? (kw= ELSE this_value_expression_4= rulevalue_expression )? kw= END )
            // InternalMdxParser.g:2051:3: kw= CASE (this_value_expression_1= rulevalue_expression )? (this_when_list_2= rulewhen_list )? (kw= ELSE this_value_expression_4= rulevalue_expression )? kw= END
            {
            kw=(Token)match(input,CASE,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCase_expressionAccess().getCASEKeyword_0());
            		
            // InternalMdxParser.g:2056:3: (this_value_expression_1= rulevalue_expression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=PROPERTIES && LA37_0<=DIMENSION)||LA37_0==CASE||LA37_0==NOT||LA37_0==LeftParenthesis||LA37_0==PlusSign||LA37_0==HyphenMinus||LA37_0==LeftCurlyBracket||LA37_0==RULE_ID||LA37_0==RULE_QUOTED_ID||(LA37_0>=RULE_INT && LA37_0<=RULE_STRING)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMdxParser.g:2057:4: this_value_expression_1= rulevalue_expression
                    {

                    				newCompositeNode(grammarAccess.getCase_expressionAccess().getValue_expressionParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_value_expression_1=rulevalue_expression();

                    state._fsp--;


                    				current.merge(this_value_expression_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMdxParser.g:2068:3: (this_when_list_2= rulewhen_list )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WHEN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMdxParser.g:2069:4: this_when_list_2= rulewhen_list
                    {

                    				newCompositeNode(grammarAccess.getCase_expressionAccess().getWhen_listParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_38);
                    this_when_list_2=rulewhen_list();

                    state._fsp--;


                    				current.merge(this_when_list_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMdxParser.g:2080:3: (kw= ELSE this_value_expression_4= rulevalue_expression )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ELSE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMdxParser.g:2081:4: kw= ELSE this_value_expression_4= rulevalue_expression
                    {
                    kw=(Token)match(input,ELSE,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCase_expressionAccess().getELSEKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getCase_expressionAccess().getValue_expressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_39);
                    this_value_expression_4=rulevalue_expression();

                    state._fsp--;


                    				current.merge(this_value_expression_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,END,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCase_expressionAccess().getENDKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_expression"


    // $ANTLR start "entryRulewhen_list"
    // InternalMdxParser.g:2106:1: entryRulewhen_list returns [String current=null] : iv_rulewhen_list= rulewhen_list EOF ;
    public final String entryRulewhen_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhen_list = null;


        try {
            // InternalMdxParser.g:2106:49: (iv_rulewhen_list= rulewhen_list EOF )
            // InternalMdxParser.g:2107:2: iv_rulewhen_list= rulewhen_list EOF
            {
             newCompositeNode(grammarAccess.getWhen_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhen_list=rulewhen_list();

            state._fsp--;

             current =iv_rulewhen_list.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhen_list"


    // $ANTLR start "rulewhen_list"
    // InternalMdxParser.g:2113:1: rulewhen_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_when_clause_0= rulewhen_clause (this_when_clause_1= rulewhen_clause )* ) ;
    public final AntlrDatatypeRuleToken rulewhen_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_when_clause_0 = null;

        AntlrDatatypeRuleToken this_when_clause_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2119:2: ( (this_when_clause_0= rulewhen_clause (this_when_clause_1= rulewhen_clause )* ) )
            // InternalMdxParser.g:2120:2: (this_when_clause_0= rulewhen_clause (this_when_clause_1= rulewhen_clause )* )
            {
            // InternalMdxParser.g:2120:2: (this_when_clause_0= rulewhen_clause (this_when_clause_1= rulewhen_clause )* )
            // InternalMdxParser.g:2121:3: this_when_clause_0= rulewhen_clause (this_when_clause_1= rulewhen_clause )*
            {

            			newCompositeNode(grammarAccess.getWhen_listAccess().getWhen_clauseParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_when_clause_0=rulewhen_clause();

            state._fsp--;


            			current.merge(this_when_clause_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMdxParser.g:2131:3: (this_when_clause_1= rulewhen_clause )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==WHEN) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMdxParser.g:2132:4: this_when_clause_1= rulewhen_clause
            	    {

            	    				newCompositeNode(grammarAccess.getWhen_listAccess().getWhen_clauseParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_40);
            	    this_when_clause_1=rulewhen_clause();

            	    state._fsp--;


            	    				current.merge(this_when_clause_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhen_list"


    // $ANTLR start "entryRulewhen_clause"
    // InternalMdxParser.g:2147:1: entryRulewhen_clause returns [String current=null] : iv_rulewhen_clause= rulewhen_clause EOF ;
    public final String entryRulewhen_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhen_clause = null;


        try {
            // InternalMdxParser.g:2147:51: (iv_rulewhen_clause= rulewhen_clause EOF )
            // InternalMdxParser.g:2148:2: iv_rulewhen_clause= rulewhen_clause EOF
            {
             newCompositeNode(grammarAccess.getWhen_clauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhen_clause=rulewhen_clause();

            state._fsp--;

             current =iv_rulewhen_clause.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhen_clause"


    // $ANTLR start "rulewhen_clause"
    // InternalMdxParser.g:2154:1: rulewhen_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= WHEN this_value_expression_1= rulevalue_expression kw= THEN this_value_expression_3= rulevalue_expression ) ;
    public final AntlrDatatypeRuleToken rulewhen_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_expression_1 = null;

        AntlrDatatypeRuleToken this_value_expression_3 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2160:2: ( (kw= WHEN this_value_expression_1= rulevalue_expression kw= THEN this_value_expression_3= rulevalue_expression ) )
            // InternalMdxParser.g:2161:2: (kw= WHEN this_value_expression_1= rulevalue_expression kw= THEN this_value_expression_3= rulevalue_expression )
            {
            // InternalMdxParser.g:2161:2: (kw= WHEN this_value_expression_1= rulevalue_expression kw= THEN this_value_expression_3= rulevalue_expression )
            // InternalMdxParser.g:2162:3: kw= WHEN this_value_expression_1= rulevalue_expression kw= THEN this_value_expression_3= rulevalue_expression
            {
            kw=(Token)match(input,WHEN,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWhen_clauseAccess().getWHENKeyword_0());
            		

            			newCompositeNode(grammarAccess.getWhen_clauseAccess().getValue_expressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_41);
            this_value_expression_1=rulevalue_expression();

            state._fsp--;


            			current.merge(this_value_expression_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,THEN,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWhen_clauseAccess().getTHENKeyword_2());
            		

            			newCompositeNode(grammarAccess.getWhen_clauseAccess().getValue_expressionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_value_expression_3=rulevalue_expression();

            state._fsp--;


            			current.merge(this_value_expression_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhen_clause"


    // $ANTLR start "entryRulecomp_op"
    // InternalMdxParser.g:2196:1: entryRulecomp_op returns [String current=null] : iv_rulecomp_op= rulecomp_op EOF ;
    public final String entryRulecomp_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomp_op = null;


        try {
            // InternalMdxParser.g:2196:47: (iv_rulecomp_op= rulecomp_op EOF )
            // InternalMdxParser.g:2197:2: iv_rulecomp_op= rulecomp_op EOF
            {
             newCompositeNode(grammarAccess.getComp_opRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomp_op=rulecomp_op();

            state._fsp--;

             current =iv_rulecomp_op.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomp_op"


    // $ANTLR start "rulecomp_op"
    // InternalMdxParser.g:2203:1: rulecomp_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQ_0= ruleEQ | this_NE_1= ruleNE | this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE ) ;
    public final AntlrDatatypeRuleToken rulecomp_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EQ_0 = null;

        AntlrDatatypeRuleToken this_NE_1 = null;

        AntlrDatatypeRuleToken this_LT_2 = null;

        AntlrDatatypeRuleToken this_GT_3 = null;

        AntlrDatatypeRuleToken this_LE_4 = null;

        AntlrDatatypeRuleToken this_GE_5 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2209:2: ( (this_EQ_0= ruleEQ | this_NE_1= ruleNE | this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE ) )
            // InternalMdxParser.g:2210:2: (this_EQ_0= ruleEQ | this_NE_1= ruleNE | this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE )
            {
            // InternalMdxParser.g:2210:2: (this_EQ_0= ruleEQ | this_NE_1= ruleNE | this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE )
            int alt41=6;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt41=1;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt41=2;
                }
                break;
            case LessThanSign:
                {
                alt41=3;
                }
                break;
            case GreaterThanSign:
                {
                alt41=4;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt41=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMdxParser.g:2211:3: this_EQ_0= ruleEQ
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getEQParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EQ_0=ruleEQ();

                    state._fsp--;


                    			current.merge(this_EQ_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2222:3: this_NE_1= ruleNE
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getNEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NE_1=ruleNE();

                    state._fsp--;


                    			current.merge(this_NE_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:2233:3: this_LT_2= ruleLT
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getLTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LT_2=ruleLT();

                    state._fsp--;


                    			current.merge(this_LT_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMdxParser.g:2244:3: this_GT_3= ruleGT
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getGTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GT_3=ruleGT();

                    state._fsp--;


                    			current.merge(this_GT_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMdxParser.g:2255:3: this_LE_4= ruleLE
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getLEParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LE_4=ruleLE();

                    state._fsp--;


                    			current.merge(this_LE_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMdxParser.g:2266:3: this_GE_5= ruleGE
                    {

                    			newCompositeNode(grammarAccess.getComp_opAccess().getGEParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GE_5=ruleGE();

                    state._fsp--;


                    			current.merge(this_GE_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomp_op"


    // $ANTLR start "entryRuleidentifier"
    // InternalMdxParser.g:2280:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // InternalMdxParser.g:2280:50: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalMdxParser.g:2281:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalMdxParser.g:2287:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unquoted_identifier_0= ruleunquoted_identifier | this_quoted_identifier_1= rulequoted_identifier ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unquoted_identifier_0 = null;

        AntlrDatatypeRuleToken this_quoted_identifier_1 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2293:2: ( (this_unquoted_identifier_0= ruleunquoted_identifier | this_quoted_identifier_1= rulequoted_identifier ) )
            // InternalMdxParser.g:2294:2: (this_unquoted_identifier_0= ruleunquoted_identifier | this_quoted_identifier_1= rulequoted_identifier )
            {
            // InternalMdxParser.g:2294:2: (this_unquoted_identifier_0= ruleunquoted_identifier | this_quoted_identifier_1= rulequoted_identifier )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PROPERTIES && LA42_0<=DIMENSION)||LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_QUOTED_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMdxParser.g:2295:3: this_unquoted_identifier_0= ruleunquoted_identifier
                    {

                    			newCompositeNode(grammarAccess.getIdentifierAccess().getUnquoted_identifierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unquoted_identifier_0=ruleunquoted_identifier();

                    state._fsp--;


                    			current.merge(this_unquoted_identifier_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2306:3: this_quoted_identifier_1= rulequoted_identifier
                    {

                    			newCompositeNode(grammarAccess.getIdentifierAccess().getQuoted_identifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_quoted_identifier_1=rulequoted_identifier();

                    state._fsp--;


                    			current.merge(this_quoted_identifier_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleunquoted_identifier"
    // InternalMdxParser.g:2320:1: entryRuleunquoted_identifier returns [String current=null] : iv_ruleunquoted_identifier= ruleunquoted_identifier EOF ;
    public final String entryRuleunquoted_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunquoted_identifier = null;


        try {
            // InternalMdxParser.g:2320:59: (iv_ruleunquoted_identifier= ruleunquoted_identifier EOF )
            // InternalMdxParser.g:2321:2: iv_ruleunquoted_identifier= ruleunquoted_identifier EOF
            {
             newCompositeNode(grammarAccess.getUnquoted_identifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunquoted_identifier=ruleunquoted_identifier();

            state._fsp--;

             current =iv_ruleunquoted_identifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunquoted_identifier"


    // $ANTLR start "ruleunquoted_identifier"
    // InternalMdxParser.g:2327:1: ruleunquoted_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_keyword_0= rulekeyword | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleunquoted_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_keyword_0 = null;



        	enterRule();

        try {
            // InternalMdxParser.g:2333:2: ( (this_keyword_0= rulekeyword | this_ID_1= RULE_ID ) )
            // InternalMdxParser.g:2334:2: (this_keyword_0= rulekeyword | this_ID_1= RULE_ID )
            {
            // InternalMdxParser.g:2334:2: (this_keyword_0= rulekeyword | this_ID_1= RULE_ID )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=PROPERTIES && LA43_0<=DIMENSION)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMdxParser.g:2335:3: this_keyword_0= rulekeyword
                    {

                    			newCompositeNode(grammarAccess.getUnquoted_identifierAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_keyword_0=rulekeyword();

                    state._fsp--;


                    			current.merge(this_keyword_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2346:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getUnquoted_identifierAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunquoted_identifier"


    // $ANTLR start "entryRuleamp_quoted_identifier"
    // InternalMdxParser.g:2357:1: entryRuleamp_quoted_identifier returns [String current=null] : iv_ruleamp_quoted_identifier= ruleamp_quoted_identifier EOF ;
    public final String entryRuleamp_quoted_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleamp_quoted_identifier = null;


        try {
            // InternalMdxParser.g:2357:61: (iv_ruleamp_quoted_identifier= ruleamp_quoted_identifier EOF )
            // InternalMdxParser.g:2358:2: iv_ruleamp_quoted_identifier= ruleamp_quoted_identifier EOF
            {
             newCompositeNode(grammarAccess.getAmp_quoted_identifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleamp_quoted_identifier=ruleamp_quoted_identifier();

            state._fsp--;

             current =iv_ruleamp_quoted_identifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleamp_quoted_identifier"


    // $ANTLR start "ruleamp_quoted_identifier"
    // InternalMdxParser.g:2364:1: ruleamp_quoted_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID ;
    public final AntlrDatatypeRuleToken ruleamp_quoted_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AMP_QUOTED_ID_0=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2370:2: (this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID )
            // InternalMdxParser.g:2371:2: this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID
            {
            this_AMP_QUOTED_ID_0=(Token)match(input,RULE_AMP_QUOTED_ID,FOLLOW_2); 

            		current.merge(this_AMP_QUOTED_ID_0);
            	

            		newLeafNode(this_AMP_QUOTED_ID_0, grammarAccess.getAmp_quoted_identifierAccess().getAMP_QUOTED_IDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleamp_quoted_identifier"


    // $ANTLR start "entryRulequoted_identifier"
    // InternalMdxParser.g:2381:1: entryRulequoted_identifier returns [String current=null] : iv_rulequoted_identifier= rulequoted_identifier EOF ;
    public final String entryRulequoted_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulequoted_identifier = null;


        try {
            // InternalMdxParser.g:2381:57: (iv_rulequoted_identifier= rulequoted_identifier EOF )
            // InternalMdxParser.g:2382:2: iv_rulequoted_identifier= rulequoted_identifier EOF
            {
             newCompositeNode(grammarAccess.getQuoted_identifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulequoted_identifier=rulequoted_identifier();

            state._fsp--;

             current =iv_rulequoted_identifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequoted_identifier"


    // $ANTLR start "rulequoted_identifier"
    // InternalMdxParser.g:2388:1: rulequoted_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QUOTED_ID_0= RULE_QUOTED_ID ;
    public final AntlrDatatypeRuleToken rulequoted_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_ID_0=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2394:2: (this_QUOTED_ID_0= RULE_QUOTED_ID )
            // InternalMdxParser.g:2395:2: this_QUOTED_ID_0= RULE_QUOTED_ID
            {
            this_QUOTED_ID_0=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

            		current.merge(this_QUOTED_ID_0);
            	

            		newLeafNode(this_QUOTED_ID_0, grammarAccess.getQuoted_identifierAccess().getQUOTED_IDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulequoted_identifier"


    // $ANTLR start "entryRulekeyword"
    // InternalMdxParser.g:2405:1: entryRulekeyword returns [String current=null] : iv_rulekeyword= rulekeyword EOF ;
    public final String entryRulekeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulekeyword = null;


        try {
            // InternalMdxParser.g:2405:47: (iv_rulekeyword= rulekeyword EOF )
            // InternalMdxParser.g:2406:2: iv_rulekeyword= rulekeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_rulekeyword=rulekeyword();

            state._fsp--;

             current =iv_rulekeyword.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulekeyword"


    // $ANTLR start "rulekeyword"
    // InternalMdxParser.g:2412:1: rulekeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= DIMENSION | kw= PROPERTIES ) ;
    public final AntlrDatatypeRuleToken rulekeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2418:2: ( (kw= DIMENSION | kw= PROPERTIES ) )
            // InternalMdxParser.g:2419:2: (kw= DIMENSION | kw= PROPERTIES )
            {
            // InternalMdxParser.g:2419:2: (kw= DIMENSION | kw= PROPERTIES )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DIMENSION) ) {
                alt44=1;
            }
            else if ( (LA44_0==PROPERTIES) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMdxParser.g:2420:3: kw= DIMENSION
                    {
                    kw=(Token)match(input,DIMENSION,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDIMENSIONKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2426:3: kw= PROPERTIES
                    {
                    kw=(Token)match(input,PROPERTIES,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPROPERTIESKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulekeyword"


    // $ANTLR start "entryRuleQUOTE"
    // InternalMdxParser.g:2435:1: entryRuleQUOTE returns [String current=null] : iv_ruleQUOTE= ruleQUOTE EOF ;
    public final String entryRuleQUOTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUOTE = null;


        try {
            // InternalMdxParser.g:2435:45: (iv_ruleQUOTE= ruleQUOTE EOF )
            // InternalMdxParser.g:2436:2: iv_ruleQUOTE= ruleQUOTE EOF
            {
             newCompositeNode(grammarAccess.getQUOTERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQUOTE=ruleQUOTE();

            state._fsp--;

             current =iv_ruleQUOTE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQUOTE"


    // $ANTLR start "ruleQUOTE"
    // InternalMdxParser.g:2442:1: ruleQUOTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Apostrophe ;
    public final AntlrDatatypeRuleToken ruleQUOTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2448:2: (kw= Apostrophe )
            // InternalMdxParser.g:2449:2: kw= Apostrophe
            {
            kw=(Token)match(input,Apostrophe,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getQUOTEAccess().getApostropheKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQUOTE"


    // $ANTLR start "entryRuleASTERISK"
    // InternalMdxParser.g:2457:1: entryRuleASTERISK returns [String current=null] : iv_ruleASTERISK= ruleASTERISK EOF ;
    public final String entryRuleASTERISK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASTERISK = null;


        try {
            // InternalMdxParser.g:2457:48: (iv_ruleASTERISK= ruleASTERISK EOF )
            // InternalMdxParser.g:2458:2: iv_ruleASTERISK= ruleASTERISK EOF
            {
             newCompositeNode(grammarAccess.getASTERISKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleASTERISK=ruleASTERISK();

            state._fsp--;

             current =iv_ruleASTERISK.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASTERISK"


    // $ANTLR start "ruleASTERISK"
    // InternalMdxParser.g:2464:1: ruleASTERISK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleASTERISK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2470:2: (kw= Asterisk )
            // InternalMdxParser.g:2471:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getASTERISKAccess().getAsteriskKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleASTERISK"


    // $ANTLR start "entryRuleCOLON"
    // InternalMdxParser.g:2479:1: entryRuleCOLON returns [String current=null] : iv_ruleCOLON= ruleCOLON EOF ;
    public final String entryRuleCOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLON = null;


        try {
            // InternalMdxParser.g:2479:45: (iv_ruleCOLON= ruleCOLON EOF )
            // InternalMdxParser.g:2480:2: iv_ruleCOLON= ruleCOLON EOF
            {
             newCompositeNode(grammarAccess.getCOLONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLON=ruleCOLON();

            state._fsp--;

             current =iv_ruleCOLON.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // InternalMdxParser.g:2486:1: ruleCOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Colon ;
    public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2492:2: (kw= Colon )
            // InternalMdxParser.g:2493:2: kw= Colon
            {
            kw=(Token)match(input,Colon,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleCOMMA"
    // InternalMdxParser.g:2501:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // InternalMdxParser.g:2501:45: (iv_ruleCOMMA= ruleCOMMA EOF )
            // InternalMdxParser.g:2502:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalMdxParser.g:2508:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Comma ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2514:2: (kw= Comma )
            // InternalMdxParser.g:2515:2: kw= Comma
            {
            kw=(Token)match(input,Comma,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleCONCAT"
    // InternalMdxParser.g:2523:1: entryRuleCONCAT returns [String current=null] : iv_ruleCONCAT= ruleCONCAT EOF ;
    public final String entryRuleCONCAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONCAT = null;


        try {
            // InternalMdxParser.g:2523:46: (iv_ruleCONCAT= ruleCONCAT EOF )
            // InternalMdxParser.g:2524:2: iv_ruleCONCAT= ruleCONCAT EOF
            {
             newCompositeNode(grammarAccess.getCONCATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONCAT=ruleCONCAT();

            state._fsp--;

             current =iv_ruleCONCAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONCAT"


    // $ANTLR start "ruleCONCAT"
    // InternalMdxParser.g:2530:1: ruleCONCAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= VerticalLineVerticalLine ;
    public final AntlrDatatypeRuleToken ruleCONCAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2536:2: (kw= VerticalLineVerticalLine )
            // InternalMdxParser.g:2537:2: kw= VerticalLineVerticalLine
            {
            kw=(Token)match(input,VerticalLineVerticalLine,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCONCATAccess().getVerticalLineVerticalLineKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONCAT"


    // $ANTLR start "entryRuleDOT"
    // InternalMdxParser.g:2545:1: entryRuleDOT returns [String current=null] : iv_ruleDOT= ruleDOT EOF ;
    public final String entryRuleDOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOT = null;


        try {
            // InternalMdxParser.g:2545:43: (iv_ruleDOT= ruleDOT EOF )
            // InternalMdxParser.g:2546:2: iv_ruleDOT= ruleDOT EOF
            {
             newCompositeNode(grammarAccess.getDOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOT=ruleDOT();

            state._fsp--;

             current =iv_ruleDOT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOT"


    // $ANTLR start "ruleDOT"
    // InternalMdxParser.g:2552:1: ruleDOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= FullStop ;
    public final AntlrDatatypeRuleToken ruleDOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2558:2: (kw= FullStop )
            // InternalMdxParser.g:2559:2: kw= FullStop
            {
            kw=(Token)match(input,FullStop,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDOTAccess().getFullStopKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOT"


    // $ANTLR start "entryRuleEQ"
    // InternalMdxParser.g:2567:1: entryRuleEQ returns [String current=null] : iv_ruleEQ= ruleEQ EOF ;
    public final String entryRuleEQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQ = null;


        try {
            // InternalMdxParser.g:2567:42: (iv_ruleEQ= ruleEQ EOF )
            // InternalMdxParser.g:2568:2: iv_ruleEQ= ruleEQ EOF
            {
             newCompositeNode(grammarAccess.getEQRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEQ=ruleEQ();

            state._fsp--;

             current =iv_ruleEQ.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQ"


    // $ANTLR start "ruleEQ"
    // InternalMdxParser.g:2574:1: ruleEQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= EqualsSign ;
    public final AntlrDatatypeRuleToken ruleEQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2580:2: (kw= EqualsSign )
            // InternalMdxParser.g:2581:2: kw= EqualsSign
            {
            kw=(Token)match(input,EqualsSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEQAccess().getEqualsSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEQ"


    // $ANTLR start "entryRuleGE"
    // InternalMdxParser.g:2589:1: entryRuleGE returns [String current=null] : iv_ruleGE= ruleGE EOF ;
    public final String entryRuleGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGE = null;


        try {
            // InternalMdxParser.g:2589:42: (iv_ruleGE= ruleGE EOF )
            // InternalMdxParser.g:2590:2: iv_ruleGE= ruleGE EOF
            {
             newCompositeNode(grammarAccess.getGERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGE=ruleGE();

            state._fsp--;

             current =iv_ruleGE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGE"


    // $ANTLR start "ruleGE"
    // InternalMdxParser.g:2596:1: ruleGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GreaterThanSignEqualsSign ;
    public final AntlrDatatypeRuleToken ruleGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2602:2: (kw= GreaterThanSignEqualsSign )
            // InternalMdxParser.g:2603:2: kw= GreaterThanSignEqualsSign
            {
            kw=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGEAccess().getGreaterThanSignEqualsSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGE"


    // $ANTLR start "entryRuleGT"
    // InternalMdxParser.g:2611:1: entryRuleGT returns [String current=null] : iv_ruleGT= ruleGT EOF ;
    public final String entryRuleGT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGT = null;


        try {
            // InternalMdxParser.g:2611:42: (iv_ruleGT= ruleGT EOF )
            // InternalMdxParser.g:2612:2: iv_ruleGT= ruleGT EOF
            {
             newCompositeNode(grammarAccess.getGTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGT=ruleGT();

            state._fsp--;

             current =iv_ruleGT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalMdxParser.g:2618:1: ruleGT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GreaterThanSign ;
    public final AntlrDatatypeRuleToken ruleGT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2624:2: (kw= GreaterThanSign )
            // InternalMdxParser.g:2625:2: kw= GreaterThanSign
            {
            kw=(Token)match(input,GreaterThanSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGTAccess().getGreaterThanSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleLBRACE"
    // InternalMdxParser.g:2633:1: entryRuleLBRACE returns [String current=null] : iv_ruleLBRACE= ruleLBRACE EOF ;
    public final String entryRuleLBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLBRACE = null;


        try {
            // InternalMdxParser.g:2633:46: (iv_ruleLBRACE= ruleLBRACE EOF )
            // InternalMdxParser.g:2634:2: iv_ruleLBRACE= ruleLBRACE EOF
            {
             newCompositeNode(grammarAccess.getLBRACERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLBRACE=ruleLBRACE();

            state._fsp--;

             current =iv_ruleLBRACE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLBRACE"


    // $ANTLR start "ruleLBRACE"
    // InternalMdxParser.g:2640:1: ruleLBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LeftCurlyBracket ;
    public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2646:2: (kw= LeftCurlyBracket )
            // InternalMdxParser.g:2647:2: kw= LeftCurlyBracket
            {
            kw=(Token)match(input,LeftCurlyBracket,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLBRACE"


    // $ANTLR start "entryRuleLE"
    // InternalMdxParser.g:2655:1: entryRuleLE returns [String current=null] : iv_ruleLE= ruleLE EOF ;
    public final String entryRuleLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLE = null;


        try {
            // InternalMdxParser.g:2655:42: (iv_ruleLE= ruleLE EOF )
            // InternalMdxParser.g:2656:2: iv_ruleLE= ruleLE EOF
            {
             newCompositeNode(grammarAccess.getLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLE=ruleLE();

            state._fsp--;

             current =iv_ruleLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalMdxParser.g:2662:1: ruleLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LessThanSignEqualsSign ;
    public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2668:2: (kw= LessThanSignEqualsSign )
            // InternalMdxParser.g:2669:2: kw= LessThanSignEqualsSign
            {
            kw=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLEAccess().getLessThanSignEqualsSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRuleLPAREN"
    // InternalMdxParser.g:2677:1: entryRuleLPAREN returns [String current=null] : iv_ruleLPAREN= ruleLPAREN EOF ;
    public final String entryRuleLPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLPAREN = null;


        try {
            // InternalMdxParser.g:2677:46: (iv_ruleLPAREN= ruleLPAREN EOF )
            // InternalMdxParser.g:2678:2: iv_ruleLPAREN= ruleLPAREN EOF
            {
             newCompositeNode(grammarAccess.getLPARENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLPAREN=ruleLPAREN();

            state._fsp--;

             current =iv_ruleLPAREN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLPAREN"


    // $ANTLR start "ruleLPAREN"
    // InternalMdxParser.g:2684:1: ruleLPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LeftParenthesis ;
    public final AntlrDatatypeRuleToken ruleLPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2690:2: (kw= LeftParenthesis )
            // InternalMdxParser.g:2691:2: kw= LeftParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLPARENAccess().getLeftParenthesisKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLPAREN"


    // $ANTLR start "entryRuleLT"
    // InternalMdxParser.g:2699:1: entryRuleLT returns [String current=null] : iv_ruleLT= ruleLT EOF ;
    public final String entryRuleLT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLT = null;


        try {
            // InternalMdxParser.g:2699:42: (iv_ruleLT= ruleLT EOF )
            // InternalMdxParser.g:2700:2: iv_ruleLT= ruleLT EOF
            {
             newCompositeNode(grammarAccess.getLTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLT=ruleLT();

            state._fsp--;

             current =iv_ruleLT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalMdxParser.g:2706:1: ruleLT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LessThanSign ;
    public final AntlrDatatypeRuleToken ruleLT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2712:2: (kw= LessThanSign )
            // InternalMdxParser.g:2713:2: kw= LessThanSign
            {
            kw=(Token)match(input,LessThanSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLTAccess().getLessThanSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleMINUS"
    // InternalMdxParser.g:2721:1: entryRuleMINUS returns [String current=null] : iv_ruleMINUS= ruleMINUS EOF ;
    public final String entryRuleMINUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMINUS = null;


        try {
            // InternalMdxParser.g:2721:45: (iv_ruleMINUS= ruleMINUS EOF )
            // InternalMdxParser.g:2722:2: iv_ruleMINUS= ruleMINUS EOF
            {
             newCompositeNode(grammarAccess.getMINUSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMINUS=ruleMINUS();

            state._fsp--;

             current =iv_ruleMINUS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalMdxParser.g:2728:1: ruleMINUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2734:2: (kw= HyphenMinus )
            // InternalMdxParser.g:2735:2: kw= HyphenMinus
            {
            kw=(Token)match(input,HyphenMinus,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMINUSAccess().getHyphenMinusKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleNE"
    // InternalMdxParser.g:2743:1: entryRuleNE returns [String current=null] : iv_ruleNE= ruleNE EOF ;
    public final String entryRuleNE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNE = null;


        try {
            // InternalMdxParser.g:2743:42: (iv_ruleNE= ruleNE EOF )
            // InternalMdxParser.g:2744:2: iv_ruleNE= ruleNE EOF
            {
             newCompositeNode(grammarAccess.getNERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNE=ruleNE();

            state._fsp--;

             current =iv_ruleNE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNE"


    // $ANTLR start "ruleNE"
    // InternalMdxParser.g:2750:1: ruleNE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LessThanSignGreaterThanSign ;
    public final AntlrDatatypeRuleToken ruleNE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2756:2: (kw= LessThanSignGreaterThanSign )
            // InternalMdxParser.g:2757:2: kw= LessThanSignGreaterThanSign
            {
            kw=(Token)match(input,LessThanSignGreaterThanSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNEAccess().getLessThanSignGreaterThanSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNE"


    // $ANTLR start "entryRulePLUS"
    // InternalMdxParser.g:2765:1: entryRulePLUS returns [String current=null] : iv_rulePLUS= rulePLUS EOF ;
    public final String entryRulePLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLUS = null;


        try {
            // InternalMdxParser.g:2765:44: (iv_rulePLUS= rulePLUS EOF )
            // InternalMdxParser.g:2766:2: iv_rulePLUS= rulePLUS EOF
            {
             newCompositeNode(grammarAccess.getPLUSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLUS=rulePLUS();

            state._fsp--;

             current =iv_rulePLUS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalMdxParser.g:2772:1: rulePLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= PlusSign ;
    public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2778:2: (kw= PlusSign )
            // InternalMdxParser.g:2779:2: kw= PlusSign
            {
            kw=(Token)match(input,PlusSign,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPLUSAccess().getPlusSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleRBRACE"
    // InternalMdxParser.g:2787:1: entryRuleRBRACE returns [String current=null] : iv_ruleRBRACE= ruleRBRACE EOF ;
    public final String entryRuleRBRACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBRACE = null;


        try {
            // InternalMdxParser.g:2787:46: (iv_ruleRBRACE= ruleRBRACE EOF )
            // InternalMdxParser.g:2788:2: iv_ruleRBRACE= ruleRBRACE EOF
            {
             newCompositeNode(grammarAccess.getRBRACERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRBRACE=ruleRBRACE();

            state._fsp--;

             current =iv_ruleRBRACE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRBRACE"


    // $ANTLR start "ruleRBRACE"
    // InternalMdxParser.g:2794:1: ruleRBRACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= RightCurlyBracket ;
    public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2800:2: (kw= RightCurlyBracket )
            // InternalMdxParser.g:2801:2: kw= RightCurlyBracket
            {
            kw=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRBRACE"


    // $ANTLR start "entryRuleRPAREN"
    // InternalMdxParser.g:2809:1: entryRuleRPAREN returns [String current=null] : iv_ruleRPAREN= ruleRPAREN EOF ;
    public final String entryRuleRPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRPAREN = null;


        try {
            // InternalMdxParser.g:2809:46: (iv_ruleRPAREN= ruleRPAREN EOF )
            // InternalMdxParser.g:2810:2: iv_ruleRPAREN= ruleRPAREN EOF
            {
             newCompositeNode(grammarAccess.getRPARENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRPAREN=ruleRPAREN();

            state._fsp--;

             current =iv_ruleRPAREN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRPAREN"


    // $ANTLR start "ruleRPAREN"
    // InternalMdxParser.g:2816:1: ruleRPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= RightParenthesis ;
    public final AntlrDatatypeRuleToken ruleRPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2822:2: (kw= RightParenthesis )
            // InternalMdxParser.g:2823:2: kw= RightParenthesis
            {
            kw=(Token)match(input,RightParenthesis,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRPARENAccess().getRightParenthesisKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRPAREN"


    // $ANTLR start "entryRuleSOLIDUS"
    // InternalMdxParser.g:2831:1: entryRuleSOLIDUS returns [String current=null] : iv_ruleSOLIDUS= ruleSOLIDUS EOF ;
    public final String entryRuleSOLIDUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSOLIDUS = null;


        try {
            // InternalMdxParser.g:2831:47: (iv_ruleSOLIDUS= ruleSOLIDUS EOF )
            // InternalMdxParser.g:2832:2: iv_ruleSOLIDUS= ruleSOLIDUS EOF
            {
             newCompositeNode(grammarAccess.getSOLIDUSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSOLIDUS=ruleSOLIDUS();

            state._fsp--;

             current =iv_ruleSOLIDUS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSOLIDUS"


    // $ANTLR start "ruleSOLIDUS"
    // InternalMdxParser.g:2838:1: ruleSOLIDUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Solidus ;
    public final AntlrDatatypeRuleToken ruleSOLIDUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMdxParser.g:2844:2: (kw= Solidus )
            // InternalMdxParser.g:2845:2: kw= Solidus
            {
            kw=(Token)match(input,Solidus,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSOLIDUSAccess().getSolidusKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSOLIDUS"

    // Delegated rules


    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\4\12\7\uffff";
    static final String dfa_3s = "\5\6\7\uffff";
    static final String dfa_4s = "\1\67\4\60\7\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\5\uffff\1\7\24\uffff\1\5\14\uffff\1\6\1\uffff\1\3\2\uffff\1\4\1\uffff\1\11\1\10",
            "\4\12\4\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\5\12\1\uffff\4\12\1\13\10\12\1\uffff\3\12\1\uffff\1\12",
            "\4\12\4\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\5\12\1\uffff\4\12\1\13\10\12\1\uffff\3\12\1\uffff\1\12",
            "\4\12\4\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\5\12\1\uffff\4\12\1\13\10\12\1\uffff\3\12\1\uffff\1\12",
            "\4\12\4\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\5\12\1\uffff\4\12\1\13\10\12\1\uffff\3\12\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1864:2: (this_function_0= rulefunction | (this_LPAREN_1= ruleLPAREN this_exp_list_2= ruleexp_list this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_exp_list_5= ruleexp_list )? this_RBRACE_6= ruleRBRACE ) | this_case_expression_7= rulecase_expression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_identifier_10= ruleidentifier )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00D280A400C120C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00120000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000005042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00D280A400C020C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000102L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00D280A600C020C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00120000000000C2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000400000C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00120000000008F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00120000000008F2L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000070001C000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00D280AC00C020C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001A0000000000C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00D380A400C020C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00D280A400E4A0C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000248000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});

}