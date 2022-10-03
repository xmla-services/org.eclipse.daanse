package org.eclipse.daanse.mdx.xtext.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.daanse.mdx.xtext.services.MdxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMdxParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Apostrophe", "'\''");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("LessThanSignGreaterThanSign", "'<>'");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("AS", "'AS'");
    		tokenNameToValue.put("ON", "'ON'");
    		tokenNameToValue.put("OR", "'OR'");
    		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("END", "'END'");
    		tokenNameToValue.put("NON", "'NON'");
    		tokenNameToValue.put("NOT", "'NOT'");
    		tokenNameToValue.put("SET", "'SET'");
    		tokenNameToValue.put("XOR", "'XOR'");
    		tokenNameToValue.put("CASE", "'CASE'");
    		tokenNameToValue.put("CELL", "'CELL'");
    		tokenNameToValue.put("ELSE", "'ELSE'");
    		tokenNameToValue.put("FROM", "'FROM'");
    		tokenNameToValue.put("THEN", "'THEN'");
    		tokenNameToValue.put("WHEN", "'WHEN'");
    		tokenNameToValue.put("WITH", "'WITH'");
    		tokenNameToValue.put("EMPTY", "'EMPTY'");
    		tokenNameToValue.put("VALUE", "'VALUE'");
    		tokenNameToValue.put("WHERE", "'WHERE'");
    		tokenNameToValue.put("MEMBER", "'MEMBER'");
    		tokenNameToValue.put("SELECT", "'SELECT'");
    		tokenNameToValue.put("DIMENSION", "'DIMENSION'");
    		tokenNameToValue.put("PROPERTIES", "'PROPERTIES'");
    		tokenNameToValue.put("CELL_ORDINAL", "'CELL_ORDINAL'");
    		tokenNameToValue.put("FORMATTED_VALUE", "'FORMATTED_VALUE'");
    	}

    	public void setGrammarAccess(MdxGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleMdxStatement"
    // InternalMdxParser.g:100:1: entryRuleMdxStatement : ruleMdxStatement EOF ;
    public final void entryRuleMdxStatement() throws RecognitionException {
        try {
            // InternalMdxParser.g:101:1: ( ruleMdxStatement EOF )
            // InternalMdxParser.g:102:1: ruleMdxStatement EOF
            {
             before(grammarAccess.getMdxStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMdxStatement();

            state._fsp--;

             after(grammarAccess.getMdxStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMdxStatement"


    // $ANTLR start "ruleMdxStatement"
    // InternalMdxParser.g:109:1: ruleMdxStatement : ( ( rule__MdxStatement__StatementAssignment ) ) ;
    public final void ruleMdxStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:113:2: ( ( ( rule__MdxStatement__StatementAssignment ) ) )
            // InternalMdxParser.g:114:2: ( ( rule__MdxStatement__StatementAssignment ) )
            {
            // InternalMdxParser.g:114:2: ( ( rule__MdxStatement__StatementAssignment ) )
            // InternalMdxParser.g:115:3: ( rule__MdxStatement__StatementAssignment )
            {
             before(grammarAccess.getMdxStatementAccess().getStatementAssignment()); 
            // InternalMdxParser.g:116:3: ( rule__MdxStatement__StatementAssignment )
            // InternalMdxParser.g:116:4: rule__MdxStatement__StatementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MdxStatement__StatementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMdxStatementAccess().getStatementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMdxStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalMdxParser.g:125:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalMdxParser.g:126:1: ( ruleSelectStatement EOF )
            // InternalMdxParser.g:127:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalMdxParser.g:134:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:138:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalMdxParser.g:139:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalMdxParser.g:139:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalMdxParser.g:140:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalMdxParser.g:141:3: ( rule__SelectStatement__Group__0 )
            // InternalMdxParser.g:141:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleFormulaSpecification"
    // InternalMdxParser.g:150:1: entryRuleFormulaSpecification : ruleFormulaSpecification EOF ;
    public final void entryRuleFormulaSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:151:1: ( ruleFormulaSpecification EOF )
            // InternalMdxParser.g:152:1: ruleFormulaSpecification EOF
            {
             before(grammarAccess.getFormulaSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulaSpecification();

            state._fsp--;

             after(grammarAccess.getFormulaSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormulaSpecification"


    // $ANTLR start "ruleFormulaSpecification"
    // InternalMdxParser.g:159:1: ruleFormulaSpecification : ( ( ( ruleSingleFormulaSpecification ) ) ( ( ruleSingleFormulaSpecification )* ) ) ;
    public final void ruleFormulaSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:163:2: ( ( ( ( ruleSingleFormulaSpecification ) ) ( ( ruleSingleFormulaSpecification )* ) ) )
            // InternalMdxParser.g:164:2: ( ( ( ruleSingleFormulaSpecification ) ) ( ( ruleSingleFormulaSpecification )* ) )
            {
            // InternalMdxParser.g:164:2: ( ( ( ruleSingleFormulaSpecification ) ) ( ( ruleSingleFormulaSpecification )* ) )
            // InternalMdxParser.g:165:3: ( ( ruleSingleFormulaSpecification ) ) ( ( ruleSingleFormulaSpecification )* )
            {
            // InternalMdxParser.g:165:3: ( ( ruleSingleFormulaSpecification ) )
            // InternalMdxParser.g:166:4: ( ruleSingleFormulaSpecification )
            {
             before(grammarAccess.getFormulaSpecificationAccess().getSingleFormulaSpecificationParserRuleCall()); 
            // InternalMdxParser.g:167:4: ( ruleSingleFormulaSpecification )
            // InternalMdxParser.g:167:5: ruleSingleFormulaSpecification
            {
            pushFollow(FOLLOW_3);
            ruleSingleFormulaSpecification();

            state._fsp--;


            }

             after(grammarAccess.getFormulaSpecificationAccess().getSingleFormulaSpecificationParserRuleCall()); 

            }

            // InternalMdxParser.g:170:3: ( ( ruleSingleFormulaSpecification )* )
            // InternalMdxParser.g:171:4: ( ruleSingleFormulaSpecification )*
            {
             before(grammarAccess.getFormulaSpecificationAccess().getSingleFormulaSpecificationParserRuleCall()); 
            // InternalMdxParser.g:172:4: ( ruleSingleFormulaSpecification )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MEMBER||LA1_0==SET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMdxParser.g:172:5: ruleSingleFormulaSpecification
            	    {
            	    pushFollow(FOLLOW_3);
            	    ruleSingleFormulaSpecification();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFormulaSpecificationAccess().getSingleFormulaSpecificationParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormulaSpecification"


    // $ANTLR start "entryRuleSingleFormulaSpecification"
    // InternalMdxParser.g:182:1: entryRuleSingleFormulaSpecification : ruleSingleFormulaSpecification EOF ;
    public final void entryRuleSingleFormulaSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:183:1: ( ruleSingleFormulaSpecification EOF )
            // InternalMdxParser.g:184:1: ruleSingleFormulaSpecification EOF
            {
             before(grammarAccess.getSingleFormulaSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleFormulaSpecification();

            state._fsp--;

             after(grammarAccess.getSingleFormulaSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleFormulaSpecification"


    // $ANTLR start "ruleSingleFormulaSpecification"
    // InternalMdxParser.g:191:1: ruleSingleFormulaSpecification : ( ( rule__SingleFormulaSpecification__Alternatives ) ) ;
    public final void ruleSingleFormulaSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:195:2: ( ( ( rule__SingleFormulaSpecification__Alternatives ) ) )
            // InternalMdxParser.g:196:2: ( ( rule__SingleFormulaSpecification__Alternatives ) )
            {
            // InternalMdxParser.g:196:2: ( ( rule__SingleFormulaSpecification__Alternatives ) )
            // InternalMdxParser.g:197:3: ( rule__SingleFormulaSpecification__Alternatives )
            {
             before(grammarAccess.getSingleFormulaSpecificationAccess().getAlternatives()); 
            // InternalMdxParser.g:198:3: ( rule__SingleFormulaSpecification__Alternatives )
            // InternalMdxParser.g:198:4: rule__SingleFormulaSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleFormulaSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleFormulaSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleFormulaSpecification"


    // $ANTLR start "entryRuleSetSpecification"
    // InternalMdxParser.g:207:1: entryRuleSetSpecification : ruleSetSpecification EOF ;
    public final void entryRuleSetSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:208:1: ( ruleSetSpecification EOF )
            // InternalMdxParser.g:209:1: ruleSetSpecification EOF
            {
             before(grammarAccess.getSetSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSetSpecification();

            state._fsp--;

             after(grammarAccess.getSetSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetSpecification"


    // $ANTLR start "ruleSetSpecification"
    // InternalMdxParser.g:216:1: ruleSetSpecification : ( ( rule__SetSpecification__Group__0 ) ) ;
    public final void ruleSetSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:220:2: ( ( ( rule__SetSpecification__Group__0 ) ) )
            // InternalMdxParser.g:221:2: ( ( rule__SetSpecification__Group__0 ) )
            {
            // InternalMdxParser.g:221:2: ( ( rule__SetSpecification__Group__0 ) )
            // InternalMdxParser.g:222:3: ( rule__SetSpecification__Group__0 )
            {
             before(grammarAccess.getSetSpecificationAccess().getGroup()); 
            // InternalMdxParser.g:223:3: ( rule__SetSpecification__Group__0 )
            // InternalMdxParser.g:223:4: rule__SetSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetSpecification"


    // $ANTLR start "entryRuleMemberSpecification"
    // InternalMdxParser.g:232:1: entryRuleMemberSpecification : ruleMemberSpecification EOF ;
    public final void entryRuleMemberSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:233:1: ( ruleMemberSpecification EOF )
            // InternalMdxParser.g:234:1: ruleMemberSpecification EOF
            {
             before(grammarAccess.getMemberSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberSpecification();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberSpecification"


    // $ANTLR start "ruleMemberSpecification"
    // InternalMdxParser.g:241:1: ruleMemberSpecification : ( ( rule__MemberSpecification__Group__0 ) ) ;
    public final void ruleMemberSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:245:2: ( ( ( rule__MemberSpecification__Group__0 ) ) )
            // InternalMdxParser.g:246:2: ( ( rule__MemberSpecification__Group__0 ) )
            {
            // InternalMdxParser.g:246:2: ( ( rule__MemberSpecification__Group__0 ) )
            // InternalMdxParser.g:247:3: ( rule__MemberSpecification__Group__0 )
            {
             before(grammarAccess.getMemberSpecificationAccess().getGroup()); 
            // InternalMdxParser.g:248:3: ( rule__MemberSpecification__Group__0 )
            // InternalMdxParser.g:248:4: rule__MemberSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberSpecification"


    // $ANTLR start "entryRuleAxisSpecificationList"
    // InternalMdxParser.g:257:1: entryRuleAxisSpecificationList : ruleAxisSpecificationList EOF ;
    public final void entryRuleAxisSpecificationList() throws RecognitionException {
        try {
            // InternalMdxParser.g:258:1: ( ruleAxisSpecificationList EOF )
            // InternalMdxParser.g:259:1: ruleAxisSpecificationList EOF
            {
             before(grammarAccess.getAxisSpecificationListRule()); 
            pushFollow(FOLLOW_1);
            ruleAxisSpecificationList();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxisSpecificationList"


    // $ANTLR start "ruleAxisSpecificationList"
    // InternalMdxParser.g:266:1: ruleAxisSpecificationList : ( ( rule__AxisSpecificationList__Group__0 ) ) ;
    public final void ruleAxisSpecificationList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:270:2: ( ( ( rule__AxisSpecificationList__Group__0 ) ) )
            // InternalMdxParser.g:271:2: ( ( rule__AxisSpecificationList__Group__0 ) )
            {
            // InternalMdxParser.g:271:2: ( ( rule__AxisSpecificationList__Group__0 ) )
            // InternalMdxParser.g:272:3: ( rule__AxisSpecificationList__Group__0 )
            {
             before(grammarAccess.getAxisSpecificationListAccess().getGroup()); 
            // InternalMdxParser.g:273:3: ( rule__AxisSpecificationList__Group__0 )
            // InternalMdxParser.g:273:4: rule__AxisSpecificationList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecificationList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisSpecificationListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxisSpecificationList"


    // $ANTLR start "entryRuleMemberPropertyDefList"
    // InternalMdxParser.g:282:1: entryRuleMemberPropertyDefList : ruleMemberPropertyDefList EOF ;
    public final void entryRuleMemberPropertyDefList() throws RecognitionException {
        try {
            // InternalMdxParser.g:283:1: ( ruleMemberPropertyDefList EOF )
            // InternalMdxParser.g:284:1: ruleMemberPropertyDefList EOF
            {
             before(grammarAccess.getMemberPropertyDefListRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberPropertyDefList();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberPropertyDefList"


    // $ANTLR start "ruleMemberPropertyDefList"
    // InternalMdxParser.g:291:1: ruleMemberPropertyDefList : ( ( rule__MemberPropertyDefList__Group__0 ) ) ;
    public final void ruleMemberPropertyDefList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:295:2: ( ( ( rule__MemberPropertyDefList__Group__0 ) ) )
            // InternalMdxParser.g:296:2: ( ( rule__MemberPropertyDefList__Group__0 ) )
            {
            // InternalMdxParser.g:296:2: ( ( rule__MemberPropertyDefList__Group__0 ) )
            // InternalMdxParser.g:297:3: ( rule__MemberPropertyDefList__Group__0 )
            {
             before(grammarAccess.getMemberPropertyDefListAccess().getGroup()); 
            // InternalMdxParser.g:298:3: ( rule__MemberPropertyDefList__Group__0 )
            // InternalMdxParser.g:298:4: rule__MemberPropertyDefList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberPropertyDefListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberPropertyDefList"


    // $ANTLR start "entryRuleMemberName"
    // InternalMdxParser.g:307:1: entryRuleMemberName : ruleMemberName EOF ;
    public final void entryRuleMemberName() throws RecognitionException {
        try {
            // InternalMdxParser.g:308:1: ( ruleMemberName EOF )
            // InternalMdxParser.g:309:1: ruleMemberName EOF
            {
             before(grammarAccess.getMemberNameRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberName();

            state._fsp--;

             after(grammarAccess.getMemberNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberName"


    // $ANTLR start "ruleMemberName"
    // InternalMdxParser.g:316:1: ruleMemberName : ( ruleCompoundId ) ;
    public final void ruleMemberName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:320:2: ( ( ruleCompoundId ) )
            // InternalMdxParser.g:321:2: ( ruleCompoundId )
            {
            // InternalMdxParser.g:321:2: ( ruleCompoundId )
            // InternalMdxParser.g:322:3: ruleCompoundId
            {
             before(grammarAccess.getMemberNameAccess().getCompoundIdParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCompoundId();

            state._fsp--;

             after(grammarAccess.getMemberNameAccess().getCompoundIdParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberName"


    // $ANTLR start "entryRuleMemberPropertyDefinition"
    // InternalMdxParser.g:332:1: entryRuleMemberPropertyDefinition : ruleMemberPropertyDefinition EOF ;
    public final void entryRuleMemberPropertyDefinition() throws RecognitionException {
        try {
            // InternalMdxParser.g:333:1: ( ruleMemberPropertyDefinition EOF )
            // InternalMdxParser.g:334:1: ruleMemberPropertyDefinition EOF
            {
             before(grammarAccess.getMemberPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberPropertyDefinition();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberPropertyDefinition"


    // $ANTLR start "ruleMemberPropertyDefinition"
    // InternalMdxParser.g:341:1: ruleMemberPropertyDefinition : ( ( rule__MemberPropertyDefinition__Group__0 ) ) ;
    public final void ruleMemberPropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:345:2: ( ( ( rule__MemberPropertyDefinition__Group__0 ) ) )
            // InternalMdxParser.g:346:2: ( ( rule__MemberPropertyDefinition__Group__0 ) )
            {
            // InternalMdxParser.g:346:2: ( ( rule__MemberPropertyDefinition__Group__0 ) )
            // InternalMdxParser.g:347:3: ( rule__MemberPropertyDefinition__Group__0 )
            {
             before(grammarAccess.getMemberPropertyDefinitionAccess().getGroup()); 
            // InternalMdxParser.g:348:3: ( rule__MemberPropertyDefinition__Group__0 )
            // InternalMdxParser.g:348:4: rule__MemberPropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberPropertyDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberPropertyDefinition"


    // $ANTLR start "entryRuleSetName"
    // InternalMdxParser.g:357:1: entryRuleSetName : ruleSetName EOF ;
    public final void entryRuleSetName() throws RecognitionException {
        try {
            // InternalMdxParser.g:358:1: ( ruleSetName EOF )
            // InternalMdxParser.g:359:1: ruleSetName EOF
            {
             before(grammarAccess.getSetNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSetName();

            state._fsp--;

             after(grammarAccess.getSetNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetName"


    // $ANTLR start "ruleSetName"
    // InternalMdxParser.g:366:1: ruleSetName : ( ruleCompoundId ) ;
    public final void ruleSetName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:370:2: ( ( ruleCompoundId ) )
            // InternalMdxParser.g:371:2: ( ruleCompoundId )
            {
            // InternalMdxParser.g:371:2: ( ruleCompoundId )
            // InternalMdxParser.g:372:3: ruleCompoundId
            {
             before(grammarAccess.getSetNameAccess().getCompoundIdParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCompoundId();

            state._fsp--;

             after(grammarAccess.getSetNameAccess().getCompoundIdParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetName"


    // $ANTLR start "entryRuleCompoundId"
    // InternalMdxParser.g:382:1: entryRuleCompoundId : ruleCompoundId EOF ;
    public final void entryRuleCompoundId() throws RecognitionException {
        try {
            // InternalMdxParser.g:383:1: ( ruleCompoundId EOF )
            // InternalMdxParser.g:384:1: ruleCompoundId EOF
            {
             before(grammarAccess.getCompoundIdRule()); 
            pushFollow(FOLLOW_1);
            ruleCompoundId();

            state._fsp--;

             after(grammarAccess.getCompoundIdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompoundId"


    // $ANTLR start "ruleCompoundId"
    // InternalMdxParser.g:391:1: ruleCompoundId : ( ( rule__CompoundId__Group__0 ) ) ;
    public final void ruleCompoundId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:395:2: ( ( ( rule__CompoundId__Group__0 ) ) )
            // InternalMdxParser.g:396:2: ( ( rule__CompoundId__Group__0 ) )
            {
            // InternalMdxParser.g:396:2: ( ( rule__CompoundId__Group__0 ) )
            // InternalMdxParser.g:397:3: ( rule__CompoundId__Group__0 )
            {
             before(grammarAccess.getCompoundIdAccess().getGroup()); 
            // InternalMdxParser.g:398:3: ( rule__CompoundId__Group__0 )
            // InternalMdxParser.g:398:4: rule__CompoundId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompoundId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompoundId"


    // $ANTLR start "entryRuleAxisSpecification"
    // InternalMdxParser.g:407:1: entryRuleAxisSpecification : ruleAxisSpecification EOF ;
    public final void entryRuleAxisSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:408:1: ( ruleAxisSpecification EOF )
            // InternalMdxParser.g:409:1: ruleAxisSpecification EOF
            {
             before(grammarAccess.getAxisSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleAxisSpecification();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxisSpecification"


    // $ANTLR start "ruleAxisSpecification"
    // InternalMdxParser.g:416:1: ruleAxisSpecification : ( ( rule__AxisSpecification__Group__0 ) ) ;
    public final void ruleAxisSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:420:2: ( ( ( rule__AxisSpecification__Group__0 ) ) )
            // InternalMdxParser.g:421:2: ( ( rule__AxisSpecification__Group__0 ) )
            {
            // InternalMdxParser.g:421:2: ( ( rule__AxisSpecification__Group__0 ) )
            // InternalMdxParser.g:422:3: ( rule__AxisSpecification__Group__0 )
            {
             before(grammarAccess.getAxisSpecificationAccess().getGroup()); 
            // InternalMdxParser.g:423:3: ( rule__AxisSpecification__Group__0 )
            // InternalMdxParser.g:423:4: rule__AxisSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxisSpecification"


    // $ANTLR start "entryRuleAxisName"
    // InternalMdxParser.g:432:1: entryRuleAxisName : ruleAxisName EOF ;
    public final void entryRuleAxisName() throws RecognitionException {
        try {
            // InternalMdxParser.g:433:1: ( ruleAxisName EOF )
            // InternalMdxParser.g:434:1: ruleAxisName EOF
            {
             before(grammarAccess.getAxisNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAxisName();

            state._fsp--;

             after(grammarAccess.getAxisNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxisName"


    // $ANTLR start "ruleAxisName"
    // InternalMdxParser.g:441:1: ruleAxisName : ( ruleIdentifier ) ;
    public final void ruleAxisName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:445:2: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:446:2: ( ruleIdentifier )
            {
            // InternalMdxParser.g:446:2: ( ruleIdentifier )
            // InternalMdxParser.g:447:3: ruleIdentifier
            {
             before(grammarAccess.getAxisNameAccess().getIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAxisNameAccess().getIdentifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxisName"


    // $ANTLR start "entryRuleDimProperties"
    // InternalMdxParser.g:457:1: entryRuleDimProperties : ruleDimProperties EOF ;
    public final void entryRuleDimProperties() throws RecognitionException {
        try {
            // InternalMdxParser.g:458:1: ( ruleDimProperties EOF )
            // InternalMdxParser.g:459:1: ruleDimProperties EOF
            {
             before(grammarAccess.getDimPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleDimProperties();

            state._fsp--;

             after(grammarAccess.getDimPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimProperties"


    // $ANTLR start "ruleDimProperties"
    // InternalMdxParser.g:466:1: ruleDimProperties : ( ( rule__DimProperties__Group__0 ) ) ;
    public final void ruleDimProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:470:2: ( ( ( rule__DimProperties__Group__0 ) ) )
            // InternalMdxParser.g:471:2: ( ( rule__DimProperties__Group__0 ) )
            {
            // InternalMdxParser.g:471:2: ( ( rule__DimProperties__Group__0 ) )
            // InternalMdxParser.g:472:3: ( rule__DimProperties__Group__0 )
            {
             before(grammarAccess.getDimPropertiesAccess().getGroup()); 
            // InternalMdxParser.g:473:3: ( rule__DimProperties__Group__0 )
            // InternalMdxParser.g:473:4: rule__DimProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimProperties"


    // $ANTLR start "entryRulePropertyList"
    // InternalMdxParser.g:482:1: entryRulePropertyList : rulePropertyList EOF ;
    public final void entryRulePropertyList() throws RecognitionException {
        try {
            // InternalMdxParser.g:483:1: ( rulePropertyList EOF )
            // InternalMdxParser.g:484:1: rulePropertyList EOF
            {
             before(grammarAccess.getPropertyListRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyList();

            state._fsp--;

             after(grammarAccess.getPropertyListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyList"


    // $ANTLR start "rulePropertyList"
    // InternalMdxParser.g:491:1: rulePropertyList : ( ( rule__PropertyList__Group__0 ) ) ;
    public final void rulePropertyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:495:2: ( ( ( rule__PropertyList__Group__0 ) ) )
            // InternalMdxParser.g:496:2: ( ( rule__PropertyList__Group__0 ) )
            {
            // InternalMdxParser.g:496:2: ( ( rule__PropertyList__Group__0 ) )
            // InternalMdxParser.g:497:3: ( rule__PropertyList__Group__0 )
            {
             before(grammarAccess.getPropertyListAccess().getGroup()); 
            // InternalMdxParser.g:498:3: ( rule__PropertyList__Group__0 )
            // InternalMdxParser.g:498:4: rule__PropertyList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyList"


    // $ANTLR start "entryRuleProperty"
    // InternalMdxParser.g:507:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMdxParser.g:508:1: ( ruleProperty EOF )
            // InternalMdxParser.g:509:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMdxParser.g:516:1: ruleProperty : ( ruleCompoundId ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:520:2: ( ( ruleCompoundId ) )
            // InternalMdxParser.g:521:2: ( ruleCompoundId )
            {
            // InternalMdxParser.g:521:2: ( ruleCompoundId )
            // InternalMdxParser.g:522:3: ruleCompoundId
            {
             before(grammarAccess.getPropertyAccess().getCompoundIdParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCompoundId();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getCompoundIdParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCubeSpecification"
    // InternalMdxParser.g:532:1: entryRuleCubeSpecification : ruleCubeSpecification EOF ;
    public final void entryRuleCubeSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:533:1: ( ruleCubeSpecification EOF )
            // InternalMdxParser.g:534:1: ruleCubeSpecification EOF
            {
             before(grammarAccess.getCubeSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleCubeSpecification();

            state._fsp--;

             after(grammarAccess.getCubeSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCubeSpecification"


    // $ANTLR start "ruleCubeSpecification"
    // InternalMdxParser.g:541:1: ruleCubeSpecification : ( ruleCubeName ) ;
    public final void ruleCubeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:545:2: ( ( ruleCubeName ) )
            // InternalMdxParser.g:546:2: ( ruleCubeName )
            {
            // InternalMdxParser.g:546:2: ( ruleCubeName )
            // InternalMdxParser.g:547:3: ruleCubeName
            {
             before(grammarAccess.getCubeSpecificationAccess().getCubeNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCubeName();

            state._fsp--;

             after(grammarAccess.getCubeSpecificationAccess().getCubeNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCubeSpecification"


    // $ANTLR start "entryRuleCubeName"
    // InternalMdxParser.g:557:1: entryRuleCubeName : ruleCubeName EOF ;
    public final void entryRuleCubeName() throws RecognitionException {
        try {
            // InternalMdxParser.g:558:1: ( ruleCubeName EOF )
            // InternalMdxParser.g:559:1: ruleCubeName EOF
            {
             before(grammarAccess.getCubeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleCubeName();

            state._fsp--;

             after(grammarAccess.getCubeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCubeName"


    // $ANTLR start "ruleCubeName"
    // InternalMdxParser.g:566:1: ruleCubeName : ( ruleCompoundId ) ;
    public final void ruleCubeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:570:2: ( ( ruleCompoundId ) )
            // InternalMdxParser.g:571:2: ( ruleCompoundId )
            {
            // InternalMdxParser.g:571:2: ( ruleCompoundId )
            // InternalMdxParser.g:572:3: ruleCompoundId
            {
             before(grammarAccess.getCubeNameAccess().getCompoundIdParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCompoundId();

            state._fsp--;

             after(grammarAccess.getCubeNameAccess().getCompoundIdParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCubeName"


    // $ANTLR start "entryRuleSlicerSpecification"
    // InternalMdxParser.g:582:1: entryRuleSlicerSpecification : ruleSlicerSpecification EOF ;
    public final void entryRuleSlicerSpecification() throws RecognitionException {
        try {
            // InternalMdxParser.g:583:1: ( ruleSlicerSpecification EOF )
            // InternalMdxParser.g:584:1: ruleSlicerSpecification EOF
            {
             before(grammarAccess.getSlicerSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSlicerSpecification();

            state._fsp--;

             after(grammarAccess.getSlicerSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlicerSpecification"


    // $ANTLR start "ruleSlicerSpecification"
    // InternalMdxParser.g:591:1: ruleSlicerSpecification : ( ruleExpression ) ;
    public final void ruleSlicerSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:595:2: ( ( ruleExpression ) )
            // InternalMdxParser.g:596:2: ( ruleExpression )
            {
            // InternalMdxParser.g:596:2: ( ruleExpression )
            // InternalMdxParser.g:597:3: ruleExpression
            {
             before(grammarAccess.getSlicerSpecificationAccess().getExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSlicerSpecificationAccess().getExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlicerSpecification"


    // $ANTLR start "entryRuleCellPropeties"
    // InternalMdxParser.g:607:1: entryRuleCellPropeties : ruleCellPropeties EOF ;
    public final void entryRuleCellPropeties() throws RecognitionException {
        try {
            // InternalMdxParser.g:608:1: ( ruleCellPropeties EOF )
            // InternalMdxParser.g:609:1: ruleCellPropeties EOF
            {
             before(grammarAccess.getCellPropetiesRule()); 
            pushFollow(FOLLOW_1);
            ruleCellPropeties();

            state._fsp--;

             after(grammarAccess.getCellPropetiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellPropeties"


    // $ANTLR start "ruleCellPropeties"
    // InternalMdxParser.g:616:1: ruleCellPropeties : ( ( rule__CellPropeties__Group__0 ) ) ;
    public final void ruleCellPropeties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:620:2: ( ( ( rule__CellPropeties__Group__0 ) ) )
            // InternalMdxParser.g:621:2: ( ( rule__CellPropeties__Group__0 ) )
            {
            // InternalMdxParser.g:621:2: ( ( rule__CellPropeties__Group__0 ) )
            // InternalMdxParser.g:622:3: ( rule__CellPropeties__Group__0 )
            {
             before(grammarAccess.getCellPropetiesAccess().getGroup()); 
            // InternalMdxParser.g:623:3: ( rule__CellPropeties__Group__0 )
            // InternalMdxParser.g:623:4: rule__CellPropeties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellPropeties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellPropetiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellPropeties"


    // $ANTLR start "entryRuleCellPropertyList"
    // InternalMdxParser.g:632:1: entryRuleCellPropertyList : ruleCellPropertyList EOF ;
    public final void entryRuleCellPropertyList() throws RecognitionException {
        try {
            // InternalMdxParser.g:633:1: ( ruleCellPropertyList EOF )
            // InternalMdxParser.g:634:1: ruleCellPropertyList EOF
            {
             before(grammarAccess.getCellPropertyListRule()); 
            pushFollow(FOLLOW_1);
            ruleCellPropertyList();

            state._fsp--;

             after(grammarAccess.getCellPropertyListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellPropertyList"


    // $ANTLR start "ruleCellPropertyList"
    // InternalMdxParser.g:641:1: ruleCellPropertyList : ( ( rule__CellPropertyList__Group__0 ) ) ;
    public final void ruleCellPropertyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:645:2: ( ( ( rule__CellPropertyList__Group__0 ) ) )
            // InternalMdxParser.g:646:2: ( ( rule__CellPropertyList__Group__0 ) )
            {
            // InternalMdxParser.g:646:2: ( ( rule__CellPropertyList__Group__0 ) )
            // InternalMdxParser.g:647:3: ( rule__CellPropertyList__Group__0 )
            {
             before(grammarAccess.getCellPropertyListAccess().getGroup()); 
            // InternalMdxParser.g:648:3: ( rule__CellPropertyList__Group__0 )
            // InternalMdxParser.g:648:4: rule__CellPropertyList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellPropertyList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellPropertyListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellPropertyList"


    // $ANTLR start "entryRuleCellProperty"
    // InternalMdxParser.g:657:1: entryRuleCellProperty : ruleCellProperty EOF ;
    public final void entryRuleCellProperty() throws RecognitionException {
        try {
            // InternalMdxParser.g:658:1: ( ruleCellProperty EOF )
            // InternalMdxParser.g:659:1: ruleCellProperty EOF
            {
             before(grammarAccess.getCellPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleCellProperty();

            state._fsp--;

             after(grammarAccess.getCellPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellProperty"


    // $ANTLR start "ruleCellProperty"
    // InternalMdxParser.g:666:1: ruleCellProperty : ( ( rule__CellProperty__Alternatives ) ) ;
    public final void ruleCellProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:670:2: ( ( ( rule__CellProperty__Alternatives ) ) )
            // InternalMdxParser.g:671:2: ( ( rule__CellProperty__Alternatives ) )
            {
            // InternalMdxParser.g:671:2: ( ( rule__CellProperty__Alternatives ) )
            // InternalMdxParser.g:672:3: ( rule__CellProperty__Alternatives )
            {
             before(grammarAccess.getCellPropertyAccess().getAlternatives()); 
            // InternalMdxParser.g:673:3: ( rule__CellProperty__Alternatives )
            // InternalMdxParser.g:673:4: rule__CellProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CellProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellProperty"


    // $ANTLR start "entryRuleMandatoryCellProperty"
    // InternalMdxParser.g:682:1: entryRuleMandatoryCellProperty : ruleMandatoryCellProperty EOF ;
    public final void entryRuleMandatoryCellProperty() throws RecognitionException {
        try {
            // InternalMdxParser.g:683:1: ( ruleMandatoryCellProperty EOF )
            // InternalMdxParser.g:684:1: ruleMandatoryCellProperty EOF
            {
             before(grammarAccess.getMandatoryCellPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatoryCellProperty();

            state._fsp--;

             after(grammarAccess.getMandatoryCellPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryCellProperty"


    // $ANTLR start "ruleMandatoryCellProperty"
    // InternalMdxParser.g:691:1: ruleMandatoryCellProperty : ( ( rule__MandatoryCellProperty__Alternatives ) ) ;
    public final void ruleMandatoryCellProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:695:2: ( ( ( rule__MandatoryCellProperty__Alternatives ) ) )
            // InternalMdxParser.g:696:2: ( ( rule__MandatoryCellProperty__Alternatives ) )
            {
            // InternalMdxParser.g:696:2: ( ( rule__MandatoryCellProperty__Alternatives ) )
            // InternalMdxParser.g:697:3: ( rule__MandatoryCellProperty__Alternatives )
            {
             before(grammarAccess.getMandatoryCellPropertyAccess().getAlternatives()); 
            // InternalMdxParser.g:698:3: ( rule__MandatoryCellProperty__Alternatives )
            // InternalMdxParser.g:698:4: rule__MandatoryCellProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryCellProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryCellPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryCellProperty"


    // $ANTLR start "entryRuleProviderSpecificCellProperty"
    // InternalMdxParser.g:707:1: entryRuleProviderSpecificCellProperty : ruleProviderSpecificCellProperty EOF ;
    public final void entryRuleProviderSpecificCellProperty() throws RecognitionException {
        try {
            // InternalMdxParser.g:708:1: ( ruleProviderSpecificCellProperty EOF )
            // InternalMdxParser.g:709:1: ruleProviderSpecificCellProperty EOF
            {
             before(grammarAccess.getProviderSpecificCellPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProviderSpecificCellProperty();

            state._fsp--;

             after(grammarAccess.getProviderSpecificCellPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProviderSpecificCellProperty"


    // $ANTLR start "ruleProviderSpecificCellProperty"
    // InternalMdxParser.g:716:1: ruleProviderSpecificCellProperty : ( ruleIdentifier ) ;
    public final void ruleProviderSpecificCellProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:720:2: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:721:2: ( ruleIdentifier )
            {
            // InternalMdxParser.g:721:2: ( ruleIdentifier )
            // InternalMdxParser.g:722:3: ruleIdentifier
            {
             before(grammarAccess.getProviderSpecificCellPropertyAccess().getIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getProviderSpecificCellPropertyAccess().getIdentifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProviderSpecificCellProperty"


    // $ANTLR start "entryRuleExpression"
    // InternalMdxParser.g:732:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMdxParser.g:733:1: ( ruleExpression EOF )
            // InternalMdxParser.g:734:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMdxParser.g:741:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:745:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMdxParser.g:746:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMdxParser.g:746:2: ( ( rule__Expression__Group__0 ) )
            // InternalMdxParser.g:747:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMdxParser.g:748:3: ( rule__Expression__Group__0 )
            // InternalMdxParser.g:748:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValueExpression"
    // InternalMdxParser.g:757:1: entryRuleValueExpression : ruleValueExpression EOF ;
    public final void entryRuleValueExpression() throws RecognitionException {
        try {
            // InternalMdxParser.g:758:1: ( ruleValueExpression EOF )
            // InternalMdxParser.g:759:1: ruleValueExpression EOF
            {
             before(grammarAccess.getValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getValueExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // InternalMdxParser.g:766:1: ruleValueExpression : ( ( rule__ValueExpression__Group__0 ) ) ;
    public final void ruleValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:770:2: ( ( ( rule__ValueExpression__Group__0 ) ) )
            // InternalMdxParser.g:771:2: ( ( rule__ValueExpression__Group__0 ) )
            {
            // InternalMdxParser.g:771:2: ( ( rule__ValueExpression__Group__0 ) )
            // InternalMdxParser.g:772:3: ( rule__ValueExpression__Group__0 )
            {
             before(grammarAccess.getValueExpressionAccess().getGroup()); 
            // InternalMdxParser.g:773:3: ( rule__ValueExpression__Group__0 )
            // InternalMdxParser.g:773:4: rule__ValueExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleValueXorExpression"
    // InternalMdxParser.g:782:1: entryRuleValueXorExpression : ruleValueXorExpression EOF ;
    public final void entryRuleValueXorExpression() throws RecognitionException {
        try {
            // InternalMdxParser.g:783:1: ( ruleValueXorExpression EOF )
            // InternalMdxParser.g:784:1: ruleValueXorExpression EOF
            {
             before(grammarAccess.getValueXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleValueXorExpression();

            state._fsp--;

             after(grammarAccess.getValueXorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueXorExpression"


    // $ANTLR start "ruleValueXorExpression"
    // InternalMdxParser.g:791:1: ruleValueXorExpression : ( ( rule__ValueXorExpression__Group__0 ) ) ;
    public final void ruleValueXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:795:2: ( ( ( rule__ValueXorExpression__Group__0 ) ) )
            // InternalMdxParser.g:796:2: ( ( rule__ValueXorExpression__Group__0 ) )
            {
            // InternalMdxParser.g:796:2: ( ( rule__ValueXorExpression__Group__0 ) )
            // InternalMdxParser.g:797:3: ( rule__ValueXorExpression__Group__0 )
            {
             before(grammarAccess.getValueXorExpressionAccess().getGroup()); 
            // InternalMdxParser.g:798:3: ( rule__ValueXorExpression__Group__0 )
            // InternalMdxParser.g:798:4: rule__ValueXorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueXorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueXorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueXorExpression"


    // $ANTLR start "entryRuleValueOrExpression"
    // InternalMdxParser.g:807:1: entryRuleValueOrExpression : ruleValueOrExpression EOF ;
    public final void entryRuleValueOrExpression() throws RecognitionException {
        try {
            // InternalMdxParser.g:808:1: ( ruleValueOrExpression EOF )
            // InternalMdxParser.g:809:1: ruleValueOrExpression EOF
            {
             before(grammarAccess.getValueOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleValueOrExpression();

            state._fsp--;

             after(grammarAccess.getValueOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueOrExpression"


    // $ANTLR start "ruleValueOrExpression"
    // InternalMdxParser.g:816:1: ruleValueOrExpression : ( ( rule__ValueOrExpression__Group__0 ) ) ;
    public final void ruleValueOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:820:2: ( ( ( rule__ValueOrExpression__Group__0 ) ) )
            // InternalMdxParser.g:821:2: ( ( rule__ValueOrExpression__Group__0 ) )
            {
            // InternalMdxParser.g:821:2: ( ( rule__ValueOrExpression__Group__0 ) )
            // InternalMdxParser.g:822:3: ( rule__ValueOrExpression__Group__0 )
            {
             before(grammarAccess.getValueOrExpressionAccess().getGroup()); 
            // InternalMdxParser.g:823:3: ( rule__ValueOrExpression__Group__0 )
            // InternalMdxParser.g:823:4: rule__ValueOrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueOrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueOrExpression"


    // $ANTLR start "entryRuleTerm5"
    // InternalMdxParser.g:832:1: entryRuleTerm5 : ruleTerm5 EOF ;
    public final void entryRuleTerm5() throws RecognitionException {
        try {
            // InternalMdxParser.g:833:1: ( ruleTerm5 EOF )
            // InternalMdxParser.g:834:1: ruleTerm5 EOF
            {
             before(grammarAccess.getTerm5Rule()); 
            pushFollow(FOLLOW_1);
            ruleTerm5();

            state._fsp--;

             after(grammarAccess.getTerm5Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm5"


    // $ANTLR start "ruleTerm5"
    // InternalMdxParser.g:841:1: ruleTerm5 : ( ( rule__Term5__Group__0 ) ) ;
    public final void ruleTerm5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:845:2: ( ( ( rule__Term5__Group__0 ) ) )
            // InternalMdxParser.g:846:2: ( ( rule__Term5__Group__0 ) )
            {
            // InternalMdxParser.g:846:2: ( ( rule__Term5__Group__0 ) )
            // InternalMdxParser.g:847:3: ( rule__Term5__Group__0 )
            {
             before(grammarAccess.getTerm5Access().getGroup()); 
            // InternalMdxParser.g:848:3: ( rule__Term5__Group__0 )
            // InternalMdxParser.g:848:4: rule__Term5__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term5__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerm5Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm5"


    // $ANTLR start "entryRuleTerm4"
    // InternalMdxParser.g:857:1: entryRuleTerm4 : ruleTerm4 EOF ;
    public final void entryRuleTerm4() throws RecognitionException {
        try {
            // InternalMdxParser.g:858:1: ( ruleTerm4 EOF )
            // InternalMdxParser.g:859:1: ruleTerm4 EOF
            {
             before(grammarAccess.getTerm4Rule()); 
            pushFollow(FOLLOW_1);
            ruleTerm4();

            state._fsp--;

             after(grammarAccess.getTerm4Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm4"


    // $ANTLR start "ruleTerm4"
    // InternalMdxParser.g:866:1: ruleTerm4 : ( ( rule__Term4__Alternatives ) ) ;
    public final void ruleTerm4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:870:2: ( ( ( rule__Term4__Alternatives ) ) )
            // InternalMdxParser.g:871:2: ( ( rule__Term4__Alternatives ) )
            {
            // InternalMdxParser.g:871:2: ( ( rule__Term4__Alternatives ) )
            // InternalMdxParser.g:872:3: ( rule__Term4__Alternatives )
            {
             before(grammarAccess.getTerm4Access().getAlternatives()); 
            // InternalMdxParser.g:873:3: ( rule__Term4__Alternatives )
            // InternalMdxParser.g:873:4: rule__Term4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term4__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerm4Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm4"


    // $ANTLR start "entryRuleTerm3"
    // InternalMdxParser.g:882:1: entryRuleTerm3 : ruleTerm3 EOF ;
    public final void entryRuleTerm3() throws RecognitionException {
        try {
            // InternalMdxParser.g:883:1: ( ruleTerm3 EOF )
            // InternalMdxParser.g:884:1: ruleTerm3 EOF
            {
             before(grammarAccess.getTerm3Rule()); 
            pushFollow(FOLLOW_1);
            ruleTerm3();

            state._fsp--;

             after(grammarAccess.getTerm3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm3"


    // $ANTLR start "ruleTerm3"
    // InternalMdxParser.g:891:1: ruleTerm3 : ( ( rule__Term3__Group__0 ) ) ;
    public final void ruleTerm3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:895:2: ( ( ( rule__Term3__Group__0 ) ) )
            // InternalMdxParser.g:896:2: ( ( rule__Term3__Group__0 ) )
            {
            // InternalMdxParser.g:896:2: ( ( rule__Term3__Group__0 ) )
            // InternalMdxParser.g:897:3: ( rule__Term3__Group__0 )
            {
             before(grammarAccess.getTerm3Access().getGroup()); 
            // InternalMdxParser.g:898:3: ( rule__Term3__Group__0 )
            // InternalMdxParser.g:898:4: rule__Term3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerm3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm3"


    // $ANTLR start "entryRuleTerm2"
    // InternalMdxParser.g:907:1: entryRuleTerm2 : ruleTerm2 EOF ;
    public final void entryRuleTerm2() throws RecognitionException {
        try {
            // InternalMdxParser.g:908:1: ( ruleTerm2 EOF )
            // InternalMdxParser.g:909:1: ruleTerm2 EOF
            {
             before(grammarAccess.getTerm2Rule()); 
            pushFollow(FOLLOW_1);
            ruleTerm2();

            state._fsp--;

             after(grammarAccess.getTerm2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm2"


    // $ANTLR start "ruleTerm2"
    // InternalMdxParser.g:916:1: ruleTerm2 : ( ( rule__Term2__Group__0 ) ) ;
    public final void ruleTerm2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:920:2: ( ( ( rule__Term2__Group__0 ) ) )
            // InternalMdxParser.g:921:2: ( ( rule__Term2__Group__0 ) )
            {
            // InternalMdxParser.g:921:2: ( ( rule__Term2__Group__0 ) )
            // InternalMdxParser.g:922:3: ( rule__Term2__Group__0 )
            {
             before(grammarAccess.getTerm2Access().getGroup()); 
            // InternalMdxParser.g:923:3: ( rule__Term2__Group__0 )
            // InternalMdxParser.g:923:4: rule__Term2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerm2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm2"


    // $ANTLR start "entryRuleTerm"
    // InternalMdxParser.g:932:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMdxParser.g:933:1: ( ruleTerm EOF )
            // InternalMdxParser.g:934:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMdxParser.g:941:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:945:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMdxParser.g:946:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMdxParser.g:946:2: ( ( rule__Term__Group__0 ) )
            // InternalMdxParser.g:947:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMdxParser.g:948:3: ( rule__Term__Group__0 )
            // InternalMdxParser.g:948:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMdxParser.g:957:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMdxParser.g:958:1: ( ruleFactor EOF )
            // InternalMdxParser.g:959:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMdxParser.g:966:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:970:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalMdxParser.g:971:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalMdxParser.g:971:2: ( ( rule__Factor__Alternatives ) )
            // InternalMdxParser.g:972:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalMdxParser.g:973:3: ( rule__Factor__Alternatives )
            // InternalMdxParser.g:973:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFunction"
    // InternalMdxParser.g:982:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMdxParser.g:983:1: ( ruleFunction EOF )
            // InternalMdxParser.g:984:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMdxParser.g:991:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:995:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMdxParser.g:996:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMdxParser.g:996:2: ( ( rule__Function__Group__0 ) )
            // InternalMdxParser.g:997:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMdxParser.g:998:3: ( rule__Function__Group__0 )
            // InternalMdxParser.g:998:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleValueExpressionPrimary"
    // InternalMdxParser.g:1007:1: entryRuleValueExpressionPrimary : ruleValueExpressionPrimary EOF ;
    public final void entryRuleValueExpressionPrimary() throws RecognitionException {
        try {
            // InternalMdxParser.g:1008:1: ( ruleValueExpressionPrimary EOF )
            // InternalMdxParser.g:1009:1: ruleValueExpressionPrimary EOF
            {
             before(grammarAccess.getValueExpressionPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleValueExpressionPrimary();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueExpressionPrimary"


    // $ANTLR start "ruleValueExpressionPrimary"
    // InternalMdxParser.g:1016:1: ruleValueExpressionPrimary : ( ( rule__ValueExpressionPrimary__Group__0 ) ) ;
    public final void ruleValueExpressionPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1020:2: ( ( ( rule__ValueExpressionPrimary__Group__0 ) ) )
            // InternalMdxParser.g:1021:2: ( ( rule__ValueExpressionPrimary__Group__0 ) )
            {
            // InternalMdxParser.g:1021:2: ( ( rule__ValueExpressionPrimary__Group__0 ) )
            // InternalMdxParser.g:1022:3: ( rule__ValueExpressionPrimary__Group__0 )
            {
             before(grammarAccess.getValueExpressionPrimaryAccess().getGroup()); 
            // InternalMdxParser.g:1023:3: ( rule__ValueExpressionPrimary__Group__0 )
            // InternalMdxParser.g:1023:4: rule__ValueExpressionPrimary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueExpressionPrimaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueExpressionPrimary"


    // $ANTLR start "entryRuleValueExpressionPrimary0"
    // InternalMdxParser.g:1032:1: entryRuleValueExpressionPrimary0 : ruleValueExpressionPrimary0 EOF ;
    public final void entryRuleValueExpressionPrimary0() throws RecognitionException {
        try {
            // InternalMdxParser.g:1033:1: ( ruleValueExpressionPrimary0 EOF )
            // InternalMdxParser.g:1034:1: ruleValueExpressionPrimary0 EOF
            {
             before(grammarAccess.getValueExpressionPrimary0Rule()); 
            pushFollow(FOLLOW_1);
            ruleValueExpressionPrimary0();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueExpressionPrimary0"


    // $ANTLR start "ruleValueExpressionPrimary0"
    // InternalMdxParser.g:1041:1: ruleValueExpressionPrimary0 : ( ( rule__ValueExpressionPrimary0__Alternatives ) ) ;
    public final void ruleValueExpressionPrimary0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1045:2: ( ( ( rule__ValueExpressionPrimary0__Alternatives ) ) )
            // InternalMdxParser.g:1046:2: ( ( rule__ValueExpressionPrimary0__Alternatives ) )
            {
            // InternalMdxParser.g:1046:2: ( ( rule__ValueExpressionPrimary0__Alternatives ) )
            // InternalMdxParser.g:1047:3: ( rule__ValueExpressionPrimary0__Alternatives )
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getAlternatives()); 
            // InternalMdxParser.g:1048:3: ( rule__ValueExpressionPrimary0__Alternatives )
            // InternalMdxParser.g:1048:4: rule__ValueExpressionPrimary0__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueExpressionPrimary0Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueExpressionPrimary0"


    // $ANTLR start "entryRuleExpressionList"
    // InternalMdxParser.g:1057:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // InternalMdxParser.g:1058:1: ( ruleExpressionList EOF )
            // InternalMdxParser.g:1059:1: ruleExpressionList EOF
            {
             before(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getExpressionListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalMdxParser.g:1066:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1070:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // InternalMdxParser.g:1071:2: ( ( rule__ExpressionList__Group__0 ) )
            {
            // InternalMdxParser.g:1071:2: ( ( rule__ExpressionList__Group__0 ) )
            // InternalMdxParser.g:1072:3: ( rule__ExpressionList__Group__0 )
            {
             before(grammarAccess.getExpressionListAccess().getGroup()); 
            // InternalMdxParser.g:1073:3: ( rule__ExpressionList__Group__0 )
            // InternalMdxParser.g:1073:4: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleCaseExpression"
    // InternalMdxParser.g:1082:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // InternalMdxParser.g:1083:1: ( ruleCaseExpression EOF )
            // InternalMdxParser.g:1084:1: ruleCaseExpression EOF
            {
             before(grammarAccess.getCaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleCaseExpression();

            state._fsp--;

             after(grammarAccess.getCaseExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // InternalMdxParser.g:1091:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1095:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // InternalMdxParser.g:1096:2: ( ( rule__CaseExpression__Group__0 ) )
            {
            // InternalMdxParser.g:1096:2: ( ( rule__CaseExpression__Group__0 ) )
            // InternalMdxParser.g:1097:3: ( rule__CaseExpression__Group__0 )
            {
             before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            // InternalMdxParser.g:1098:3: ( rule__CaseExpression__Group__0 )
            // InternalMdxParser.g:1098:4: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleWhenList"
    // InternalMdxParser.g:1107:1: entryRuleWhenList : ruleWhenList EOF ;
    public final void entryRuleWhenList() throws RecognitionException {
        try {
            // InternalMdxParser.g:1108:1: ( ruleWhenList EOF )
            // InternalMdxParser.g:1109:1: ruleWhenList EOF
            {
             before(grammarAccess.getWhenListRule()); 
            pushFollow(FOLLOW_1);
            ruleWhenList();

            state._fsp--;

             after(grammarAccess.getWhenListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhenList"


    // $ANTLR start "ruleWhenList"
    // InternalMdxParser.g:1116:1: ruleWhenList : ( ( rule__WhenList__Group__0 ) ) ;
    public final void ruleWhenList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1120:2: ( ( ( rule__WhenList__Group__0 ) ) )
            // InternalMdxParser.g:1121:2: ( ( rule__WhenList__Group__0 ) )
            {
            // InternalMdxParser.g:1121:2: ( ( rule__WhenList__Group__0 ) )
            // InternalMdxParser.g:1122:3: ( rule__WhenList__Group__0 )
            {
             before(grammarAccess.getWhenListAccess().getGroup()); 
            // InternalMdxParser.g:1123:3: ( rule__WhenList__Group__0 )
            // InternalMdxParser.g:1123:4: rule__WhenList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhenList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhenList"


    // $ANTLR start "entryRuleWhenClause"
    // InternalMdxParser.g:1132:1: entryRuleWhenClause : ruleWhenClause EOF ;
    public final void entryRuleWhenClause() throws RecognitionException {
        try {
            // InternalMdxParser.g:1133:1: ( ruleWhenClause EOF )
            // InternalMdxParser.g:1134:1: ruleWhenClause EOF
            {
             before(grammarAccess.getWhenClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhenClause();

            state._fsp--;

             after(grammarAccess.getWhenClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhenClause"


    // $ANTLR start "ruleWhenClause"
    // InternalMdxParser.g:1141:1: ruleWhenClause : ( ( rule__WhenClause__Group__0 ) ) ;
    public final void ruleWhenClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1145:2: ( ( ( rule__WhenClause__Group__0 ) ) )
            // InternalMdxParser.g:1146:2: ( ( rule__WhenClause__Group__0 ) )
            {
            // InternalMdxParser.g:1146:2: ( ( rule__WhenClause__Group__0 ) )
            // InternalMdxParser.g:1147:3: ( rule__WhenClause__Group__0 )
            {
             before(grammarAccess.getWhenClauseAccess().getGroup()); 
            // InternalMdxParser.g:1148:3: ( rule__WhenClause__Group__0 )
            // InternalMdxParser.g:1148:4: rule__WhenClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhenClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhenClause"


    // $ANTLR start "entryRuleCompatingOperator"
    // InternalMdxParser.g:1157:1: entryRuleCompatingOperator : ruleCompatingOperator EOF ;
    public final void entryRuleCompatingOperator() throws RecognitionException {
        try {
            // InternalMdxParser.g:1158:1: ( ruleCompatingOperator EOF )
            // InternalMdxParser.g:1159:1: ruleCompatingOperator EOF
            {
             before(grammarAccess.getCompatingOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleCompatingOperator();

            state._fsp--;

             after(grammarAccess.getCompatingOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompatingOperator"


    // $ANTLR start "ruleCompatingOperator"
    // InternalMdxParser.g:1166:1: ruleCompatingOperator : ( ( rule__CompatingOperator__Alternatives ) ) ;
    public final void ruleCompatingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1170:2: ( ( ( rule__CompatingOperator__Alternatives ) ) )
            // InternalMdxParser.g:1171:2: ( ( rule__CompatingOperator__Alternatives ) )
            {
            // InternalMdxParser.g:1171:2: ( ( rule__CompatingOperator__Alternatives ) )
            // InternalMdxParser.g:1172:3: ( rule__CompatingOperator__Alternatives )
            {
             before(grammarAccess.getCompatingOperatorAccess().getAlternatives()); 
            // InternalMdxParser.g:1173:3: ( rule__CompatingOperator__Alternatives )
            // InternalMdxParser.g:1173:4: rule__CompatingOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompatingOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompatingOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompatingOperator"


    // $ANTLR start "entryRuleIdentifier"
    // InternalMdxParser.g:1182:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalMdxParser.g:1183:1: ( ruleIdentifier EOF )
            // InternalMdxParser.g:1184:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalMdxParser.g:1191:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1195:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // InternalMdxParser.g:1196:2: ( ( rule__Identifier__Alternatives ) )
            {
            // InternalMdxParser.g:1196:2: ( ( rule__Identifier__Alternatives ) )
            // InternalMdxParser.g:1197:3: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // InternalMdxParser.g:1198:3: ( rule__Identifier__Alternatives )
            // InternalMdxParser.g:1198:4: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleUnquotedIdentifier"
    // InternalMdxParser.g:1207:1: entryRuleUnquotedIdentifier : ruleUnquotedIdentifier EOF ;
    public final void entryRuleUnquotedIdentifier() throws RecognitionException {
        try {
            // InternalMdxParser.g:1208:1: ( ruleUnquotedIdentifier EOF )
            // InternalMdxParser.g:1209:1: ruleUnquotedIdentifier EOF
            {
             before(grammarAccess.getUnquotedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleUnquotedIdentifier();

            state._fsp--;

             after(grammarAccess.getUnquotedIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnquotedIdentifier"


    // $ANTLR start "ruleUnquotedIdentifier"
    // InternalMdxParser.g:1216:1: ruleUnquotedIdentifier : ( ( rule__UnquotedIdentifier__Alternatives ) ) ;
    public final void ruleUnquotedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1220:2: ( ( ( rule__UnquotedIdentifier__Alternatives ) ) )
            // InternalMdxParser.g:1221:2: ( ( rule__UnquotedIdentifier__Alternatives ) )
            {
            // InternalMdxParser.g:1221:2: ( ( rule__UnquotedIdentifier__Alternatives ) )
            // InternalMdxParser.g:1222:3: ( rule__UnquotedIdentifier__Alternatives )
            {
             before(grammarAccess.getUnquotedIdentifierAccess().getAlternatives()); 
            // InternalMdxParser.g:1223:3: ( rule__UnquotedIdentifier__Alternatives )
            // InternalMdxParser.g:1223:4: rule__UnquotedIdentifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnquotedIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnquotedIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnquotedIdentifier"


    // $ANTLR start "entryRuleAmpQuotedIdentifier"
    // InternalMdxParser.g:1232:1: entryRuleAmpQuotedIdentifier : ruleAmpQuotedIdentifier EOF ;
    public final void entryRuleAmpQuotedIdentifier() throws RecognitionException {
        try {
            // InternalMdxParser.g:1233:1: ( ruleAmpQuotedIdentifier EOF )
            // InternalMdxParser.g:1234:1: ruleAmpQuotedIdentifier EOF
            {
             before(grammarAccess.getAmpQuotedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleAmpQuotedIdentifier();

            state._fsp--;

             after(grammarAccess.getAmpQuotedIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmpQuotedIdentifier"


    // $ANTLR start "ruleAmpQuotedIdentifier"
    // InternalMdxParser.g:1241:1: ruleAmpQuotedIdentifier : ( RULE_AMP_QUOTED_ID ) ;
    public final void ruleAmpQuotedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1245:2: ( ( RULE_AMP_QUOTED_ID ) )
            // InternalMdxParser.g:1246:2: ( RULE_AMP_QUOTED_ID )
            {
            // InternalMdxParser.g:1246:2: ( RULE_AMP_QUOTED_ID )
            // InternalMdxParser.g:1247:3: RULE_AMP_QUOTED_ID
            {
             before(grammarAccess.getAmpQuotedIdentifierAccess().getAMP_QUOTED_IDTerminalRuleCall()); 
            match(input,RULE_AMP_QUOTED_ID,FOLLOW_2); 
             after(grammarAccess.getAmpQuotedIdentifierAccess().getAMP_QUOTED_IDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmpQuotedIdentifier"


    // $ANTLR start "entryRuleQuotedIdentifier"
    // InternalMdxParser.g:1257:1: entryRuleQuotedIdentifier : ruleQuotedIdentifier EOF ;
    public final void entryRuleQuotedIdentifier() throws RecognitionException {
        try {
            // InternalMdxParser.g:1258:1: ( ruleQuotedIdentifier EOF )
            // InternalMdxParser.g:1259:1: ruleQuotedIdentifier EOF
            {
             before(grammarAccess.getQuotedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQuotedIdentifier();

            state._fsp--;

             after(grammarAccess.getQuotedIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedIdentifier"


    // $ANTLR start "ruleQuotedIdentifier"
    // InternalMdxParser.g:1266:1: ruleQuotedIdentifier : ( RULE_QUOTED_ID ) ;
    public final void ruleQuotedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1270:2: ( ( RULE_QUOTED_ID ) )
            // InternalMdxParser.g:1271:2: ( RULE_QUOTED_ID )
            {
            // InternalMdxParser.g:1271:2: ( RULE_QUOTED_ID )
            // InternalMdxParser.g:1272:3: RULE_QUOTED_ID
            {
             before(grammarAccess.getQuotedIdentifierAccess().getQUOTED_IDTerminalRuleCall()); 
            match(input,RULE_QUOTED_ID,FOLLOW_2); 
             after(grammarAccess.getQuotedIdentifierAccess().getQUOTED_IDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedIdentifier"


    // $ANTLR start "entryRuleKeyword"
    // InternalMdxParser.g:1282:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalMdxParser.g:1283:1: ( ruleKeyword EOF )
            // InternalMdxParser.g:1284:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalMdxParser.g:1291:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1295:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // InternalMdxParser.g:1296:2: ( ( rule__Keyword__Alternatives ) )
            {
            // InternalMdxParser.g:1296:2: ( ( rule__Keyword__Alternatives ) )
            // InternalMdxParser.g:1297:3: ( rule__Keyword__Alternatives )
            {
             before(grammarAccess.getKeywordAccess().getAlternatives()); 
            // InternalMdxParser.g:1298:3: ( rule__Keyword__Alternatives )
            // InternalMdxParser.g:1298:4: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleQUOTE"
    // InternalMdxParser.g:1307:1: entryRuleQUOTE : ruleQUOTE EOF ;
    public final void entryRuleQUOTE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1308:1: ( ruleQUOTE EOF )
            // InternalMdxParser.g:1309:1: ruleQUOTE EOF
            {
             before(grammarAccess.getQUOTERule()); 
            pushFollow(FOLLOW_1);
            ruleQUOTE();

            state._fsp--;

             after(grammarAccess.getQUOTERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQUOTE"


    // $ANTLR start "ruleQUOTE"
    // InternalMdxParser.g:1316:1: ruleQUOTE : ( Apostrophe ) ;
    public final void ruleQUOTE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1320:2: ( ( Apostrophe ) )
            // InternalMdxParser.g:1321:2: ( Apostrophe )
            {
            // InternalMdxParser.g:1321:2: ( Apostrophe )
            // InternalMdxParser.g:1322:3: Apostrophe
            {
             before(grammarAccess.getQUOTEAccess().getApostropheKeyword()); 
            match(input,Apostrophe,FOLLOW_2); 
             after(grammarAccess.getQUOTEAccess().getApostropheKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQUOTE"


    // $ANTLR start "entryRuleASTERISK"
    // InternalMdxParser.g:1332:1: entryRuleASTERISK : ruleASTERISK EOF ;
    public final void entryRuleASTERISK() throws RecognitionException {
        try {
            // InternalMdxParser.g:1333:1: ( ruleASTERISK EOF )
            // InternalMdxParser.g:1334:1: ruleASTERISK EOF
            {
             before(grammarAccess.getASTERISKRule()); 
            pushFollow(FOLLOW_1);
            ruleASTERISK();

            state._fsp--;

             after(grammarAccess.getASTERISKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleASTERISK"


    // $ANTLR start "ruleASTERISK"
    // InternalMdxParser.g:1341:1: ruleASTERISK : ( Asterisk ) ;
    public final void ruleASTERISK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1345:2: ( ( Asterisk ) )
            // InternalMdxParser.g:1346:2: ( Asterisk )
            {
            // InternalMdxParser.g:1346:2: ( Asterisk )
            // InternalMdxParser.g:1347:3: Asterisk
            {
             before(grammarAccess.getASTERISKAccess().getAsteriskKeyword()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getASTERISKAccess().getAsteriskKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASTERISK"


    // $ANTLR start "entryRuleCOLON"
    // InternalMdxParser.g:1357:1: entryRuleCOLON : ruleCOLON EOF ;
    public final void entryRuleCOLON() throws RecognitionException {
        try {
            // InternalMdxParser.g:1358:1: ( ruleCOLON EOF )
            // InternalMdxParser.g:1359:1: ruleCOLON EOF
            {
             before(grammarAccess.getCOLONRule()); 
            pushFollow(FOLLOW_1);
            ruleCOLON();

            state._fsp--;

             after(grammarAccess.getCOLONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // InternalMdxParser.g:1366:1: ruleCOLON : ( Colon ) ;
    public final void ruleCOLON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1370:2: ( ( Colon ) )
            // InternalMdxParser.g:1371:2: ( Colon )
            {
            // InternalMdxParser.g:1371:2: ( Colon )
            // InternalMdxParser.g:1372:3: Colon
            {
             before(grammarAccess.getCOLONAccess().getColonKeyword()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCOLONAccess().getColonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleCOMMA"
    // InternalMdxParser.g:1382:1: entryRuleCOMMA : ruleCOMMA EOF ;
    public final void entryRuleCOMMA() throws RecognitionException {
        try {
            // InternalMdxParser.g:1383:1: ( ruleCOMMA EOF )
            // InternalMdxParser.g:1384:1: ruleCOMMA EOF
            {
             before(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_1);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getCOMMARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalMdxParser.g:1391:1: ruleCOMMA : ( Comma ) ;
    public final void ruleCOMMA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1395:2: ( ( Comma ) )
            // InternalMdxParser.g:1396:2: ( Comma )
            {
            // InternalMdxParser.g:1396:2: ( Comma )
            // InternalMdxParser.g:1397:3: Comma
            {
             before(grammarAccess.getCOMMAAccess().getCommaKeyword()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCOMMAAccess().getCommaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleCONCAT"
    // InternalMdxParser.g:1407:1: entryRuleCONCAT : ruleCONCAT EOF ;
    public final void entryRuleCONCAT() throws RecognitionException {
        try {
            // InternalMdxParser.g:1408:1: ( ruleCONCAT EOF )
            // InternalMdxParser.g:1409:1: ruleCONCAT EOF
            {
             before(grammarAccess.getCONCATRule()); 
            pushFollow(FOLLOW_1);
            ruleCONCAT();

            state._fsp--;

             after(grammarAccess.getCONCATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONCAT"


    // $ANTLR start "ruleCONCAT"
    // InternalMdxParser.g:1416:1: ruleCONCAT : ( VerticalLineVerticalLine ) ;
    public final void ruleCONCAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1420:2: ( ( VerticalLineVerticalLine ) )
            // InternalMdxParser.g:1421:2: ( VerticalLineVerticalLine )
            {
            // InternalMdxParser.g:1421:2: ( VerticalLineVerticalLine )
            // InternalMdxParser.g:1422:3: VerticalLineVerticalLine
            {
             before(grammarAccess.getCONCATAccess().getVerticalLineVerticalLineKeyword()); 
            match(input,VerticalLineVerticalLine,FOLLOW_2); 
             after(grammarAccess.getCONCATAccess().getVerticalLineVerticalLineKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONCAT"


    // $ANTLR start "entryRuleDOT"
    // InternalMdxParser.g:1432:1: entryRuleDOT : ruleDOT EOF ;
    public final void entryRuleDOT() throws RecognitionException {
        try {
            // InternalMdxParser.g:1433:1: ( ruleDOT EOF )
            // InternalMdxParser.g:1434:1: ruleDOT EOF
            {
             before(grammarAccess.getDOTRule()); 
            pushFollow(FOLLOW_1);
            ruleDOT();

            state._fsp--;

             after(grammarAccess.getDOTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOT"


    // $ANTLR start "ruleDOT"
    // InternalMdxParser.g:1441:1: ruleDOT : ( FullStop ) ;
    public final void ruleDOT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1445:2: ( ( FullStop ) )
            // InternalMdxParser.g:1446:2: ( FullStop )
            {
            // InternalMdxParser.g:1446:2: ( FullStop )
            // InternalMdxParser.g:1447:3: FullStop
            {
             before(grammarAccess.getDOTAccess().getFullStopKeyword()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getDOTAccess().getFullStopKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOT"


    // $ANTLR start "entryRuleEQ"
    // InternalMdxParser.g:1457:1: entryRuleEQ : ruleEQ EOF ;
    public final void entryRuleEQ() throws RecognitionException {
        try {
            // InternalMdxParser.g:1458:1: ( ruleEQ EOF )
            // InternalMdxParser.g:1459:1: ruleEQ EOF
            {
             before(grammarAccess.getEQRule()); 
            pushFollow(FOLLOW_1);
            ruleEQ();

            state._fsp--;

             after(grammarAccess.getEQRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEQ"


    // $ANTLR start "ruleEQ"
    // InternalMdxParser.g:1466:1: ruleEQ : ( EqualsSign ) ;
    public final void ruleEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1470:2: ( ( EqualsSign ) )
            // InternalMdxParser.g:1471:2: ( EqualsSign )
            {
            // InternalMdxParser.g:1471:2: ( EqualsSign )
            // InternalMdxParser.g:1472:3: EqualsSign
            {
             before(grammarAccess.getEQAccess().getEqualsSignKeyword()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getEQAccess().getEqualsSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEQ"


    // $ANTLR start "entryRuleGE"
    // InternalMdxParser.g:1482:1: entryRuleGE : ruleGE EOF ;
    public final void entryRuleGE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1483:1: ( ruleGE EOF )
            // InternalMdxParser.g:1484:1: ruleGE EOF
            {
             before(grammarAccess.getGERule()); 
            pushFollow(FOLLOW_1);
            ruleGE();

            state._fsp--;

             after(grammarAccess.getGERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGE"


    // $ANTLR start "ruleGE"
    // InternalMdxParser.g:1491:1: ruleGE : ( GreaterThanSignEqualsSign ) ;
    public final void ruleGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1495:2: ( ( GreaterThanSignEqualsSign ) )
            // InternalMdxParser.g:1496:2: ( GreaterThanSignEqualsSign )
            {
            // InternalMdxParser.g:1496:2: ( GreaterThanSignEqualsSign )
            // InternalMdxParser.g:1497:3: GreaterThanSignEqualsSign
            {
             before(grammarAccess.getGEAccess().getGreaterThanSignEqualsSignKeyword()); 
            match(input,GreaterThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getGEAccess().getGreaterThanSignEqualsSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGE"


    // $ANTLR start "entryRuleGT"
    // InternalMdxParser.g:1507:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalMdxParser.g:1508:1: ( ruleGT EOF )
            // InternalMdxParser.g:1509:1: ruleGT EOF
            {
             before(grammarAccess.getGTRule()); 
            pushFollow(FOLLOW_1);
            ruleGT();

            state._fsp--;

             after(grammarAccess.getGTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalMdxParser.g:1516:1: ruleGT : ( GreaterThanSign ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1520:2: ( ( GreaterThanSign ) )
            // InternalMdxParser.g:1521:2: ( GreaterThanSign )
            {
            // InternalMdxParser.g:1521:2: ( GreaterThanSign )
            // InternalMdxParser.g:1522:3: GreaterThanSign
            {
             before(grammarAccess.getGTAccess().getGreaterThanSignKeyword()); 
            match(input,GreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getGTAccess().getGreaterThanSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleLBRACE"
    // InternalMdxParser.g:1532:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1533:1: ( ruleLBRACE EOF )
            // InternalMdxParser.g:1534:1: ruleLBRACE EOF
            {
             before(grammarAccess.getLBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getLBRACERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLBRACE"


    // $ANTLR start "ruleLBRACE"
    // InternalMdxParser.g:1541:1: ruleLBRACE : ( LeftCurlyBracket ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1545:2: ( ( LeftCurlyBracket ) )
            // InternalMdxParser.g:1546:2: ( LeftCurlyBracket )
            {
            // InternalMdxParser.g:1546:2: ( LeftCurlyBracket )
            // InternalMdxParser.g:1547:3: LeftCurlyBracket
            {
             before(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLBRACE"


    // $ANTLR start "entryRuleLE"
    // InternalMdxParser.g:1557:1: entryRuleLE : ruleLE EOF ;
    public final void entryRuleLE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1558:1: ( ruleLE EOF )
            // InternalMdxParser.g:1559:1: ruleLE EOF
            {
             before(grammarAccess.getLERule()); 
            pushFollow(FOLLOW_1);
            ruleLE();

            state._fsp--;

             after(grammarAccess.getLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalMdxParser.g:1566:1: ruleLE : ( LessThanSignEqualsSign ) ;
    public final void ruleLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1570:2: ( ( LessThanSignEqualsSign ) )
            // InternalMdxParser.g:1571:2: ( LessThanSignEqualsSign )
            {
            // InternalMdxParser.g:1571:2: ( LessThanSignEqualsSign )
            // InternalMdxParser.g:1572:3: LessThanSignEqualsSign
            {
             before(grammarAccess.getLEAccess().getLessThanSignEqualsSignKeyword()); 
            match(input,LessThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getLEAccess().getLessThanSignEqualsSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRuleLPAREN"
    // InternalMdxParser.g:1582:1: entryRuleLPAREN : ruleLPAREN EOF ;
    public final void entryRuleLPAREN() throws RecognitionException {
        try {
            // InternalMdxParser.g:1583:1: ( ruleLPAREN EOF )
            // InternalMdxParser.g:1584:1: ruleLPAREN EOF
            {
             before(grammarAccess.getLPARENRule()); 
            pushFollow(FOLLOW_1);
            ruleLPAREN();

            state._fsp--;

             after(grammarAccess.getLPARENRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLPAREN"


    // $ANTLR start "ruleLPAREN"
    // InternalMdxParser.g:1591:1: ruleLPAREN : ( LeftParenthesis ) ;
    public final void ruleLPAREN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1595:2: ( ( LeftParenthesis ) )
            // InternalMdxParser.g:1596:2: ( LeftParenthesis )
            {
            // InternalMdxParser.g:1596:2: ( LeftParenthesis )
            // InternalMdxParser.g:1597:3: LeftParenthesis
            {
             before(grammarAccess.getLPARENAccess().getLeftParenthesisKeyword()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getLPARENAccess().getLeftParenthesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLPAREN"


    // $ANTLR start "entryRuleLT"
    // InternalMdxParser.g:1607:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalMdxParser.g:1608:1: ( ruleLT EOF )
            // InternalMdxParser.g:1609:1: ruleLT EOF
            {
             before(grammarAccess.getLTRule()); 
            pushFollow(FOLLOW_1);
            ruleLT();

            state._fsp--;

             after(grammarAccess.getLTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalMdxParser.g:1616:1: ruleLT : ( LessThanSign ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1620:2: ( ( LessThanSign ) )
            // InternalMdxParser.g:1621:2: ( LessThanSign )
            {
            // InternalMdxParser.g:1621:2: ( LessThanSign )
            // InternalMdxParser.g:1622:3: LessThanSign
            {
             before(grammarAccess.getLTAccess().getLessThanSignKeyword()); 
            match(input,LessThanSign,FOLLOW_2); 
             after(grammarAccess.getLTAccess().getLessThanSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleMINUS"
    // InternalMdxParser.g:1632:1: entryRuleMINUS : ruleMINUS EOF ;
    public final void entryRuleMINUS() throws RecognitionException {
        try {
            // InternalMdxParser.g:1633:1: ( ruleMINUS EOF )
            // InternalMdxParser.g:1634:1: ruleMINUS EOF
            {
             before(grammarAccess.getMINUSRule()); 
            pushFollow(FOLLOW_1);
            ruleMINUS();

            state._fsp--;

             after(grammarAccess.getMINUSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalMdxParser.g:1641:1: ruleMINUS : ( HyphenMinus ) ;
    public final void ruleMINUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1645:2: ( ( HyphenMinus ) )
            // InternalMdxParser.g:1646:2: ( HyphenMinus )
            {
            // InternalMdxParser.g:1646:2: ( HyphenMinus )
            // InternalMdxParser.g:1647:3: HyphenMinus
            {
             before(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleNE"
    // InternalMdxParser.g:1657:1: entryRuleNE : ruleNE EOF ;
    public final void entryRuleNE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1658:1: ( ruleNE EOF )
            // InternalMdxParser.g:1659:1: ruleNE EOF
            {
             before(grammarAccess.getNERule()); 
            pushFollow(FOLLOW_1);
            ruleNE();

            state._fsp--;

             after(grammarAccess.getNERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNE"


    // $ANTLR start "ruleNE"
    // InternalMdxParser.g:1666:1: ruleNE : ( LessThanSignGreaterThanSign ) ;
    public final void ruleNE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1670:2: ( ( LessThanSignGreaterThanSign ) )
            // InternalMdxParser.g:1671:2: ( LessThanSignGreaterThanSign )
            {
            // InternalMdxParser.g:1671:2: ( LessThanSignGreaterThanSign )
            // InternalMdxParser.g:1672:3: LessThanSignGreaterThanSign
            {
             before(grammarAccess.getNEAccess().getLessThanSignGreaterThanSignKeyword()); 
            match(input,LessThanSignGreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getNEAccess().getLessThanSignGreaterThanSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNE"


    // $ANTLR start "entryRulePLUS"
    // InternalMdxParser.g:1682:1: entryRulePLUS : rulePLUS EOF ;
    public final void entryRulePLUS() throws RecognitionException {
        try {
            // InternalMdxParser.g:1683:1: ( rulePLUS EOF )
            // InternalMdxParser.g:1684:1: rulePLUS EOF
            {
             before(grammarAccess.getPLUSRule()); 
            pushFollow(FOLLOW_1);
            rulePLUS();

            state._fsp--;

             after(grammarAccess.getPLUSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalMdxParser.g:1691:1: rulePLUS : ( PlusSign ) ;
    public final void rulePLUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1695:2: ( ( PlusSign ) )
            // InternalMdxParser.g:1696:2: ( PlusSign )
            {
            // InternalMdxParser.g:1696:2: ( PlusSign )
            // InternalMdxParser.g:1697:3: PlusSign
            {
             before(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleRBRACE"
    // InternalMdxParser.g:1707:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalMdxParser.g:1708:1: ( ruleRBRACE EOF )
            // InternalMdxParser.g:1709:1: ruleRBRACE EOF
            {
             before(grammarAccess.getRBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getRBRACERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRBRACE"


    // $ANTLR start "ruleRBRACE"
    // InternalMdxParser.g:1716:1: ruleRBRACE : ( RightCurlyBracket ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1720:2: ( ( RightCurlyBracket ) )
            // InternalMdxParser.g:1721:2: ( RightCurlyBracket )
            {
            // InternalMdxParser.g:1721:2: ( RightCurlyBracket )
            // InternalMdxParser.g:1722:3: RightCurlyBracket
            {
             before(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRBRACE"


    // $ANTLR start "entryRuleRPAREN"
    // InternalMdxParser.g:1732:1: entryRuleRPAREN : ruleRPAREN EOF ;
    public final void entryRuleRPAREN() throws RecognitionException {
        try {
            // InternalMdxParser.g:1733:1: ( ruleRPAREN EOF )
            // InternalMdxParser.g:1734:1: ruleRPAREN EOF
            {
             before(grammarAccess.getRPARENRule()); 
            pushFollow(FOLLOW_1);
            ruleRPAREN();

            state._fsp--;

             after(grammarAccess.getRPARENRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRPAREN"


    // $ANTLR start "ruleRPAREN"
    // InternalMdxParser.g:1741:1: ruleRPAREN : ( RightParenthesis ) ;
    public final void ruleRPAREN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1745:2: ( ( RightParenthesis ) )
            // InternalMdxParser.g:1746:2: ( RightParenthesis )
            {
            // InternalMdxParser.g:1746:2: ( RightParenthesis )
            // InternalMdxParser.g:1747:3: RightParenthesis
            {
             before(grammarAccess.getRPARENAccess().getRightParenthesisKeyword()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getRPARENAccess().getRightParenthesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRPAREN"


    // $ANTLR start "entryRuleSOLIDUS"
    // InternalMdxParser.g:1757:1: entryRuleSOLIDUS : ruleSOLIDUS EOF ;
    public final void entryRuleSOLIDUS() throws RecognitionException {
        try {
            // InternalMdxParser.g:1758:1: ( ruleSOLIDUS EOF )
            // InternalMdxParser.g:1759:1: ruleSOLIDUS EOF
            {
             before(grammarAccess.getSOLIDUSRule()); 
            pushFollow(FOLLOW_1);
            ruleSOLIDUS();

            state._fsp--;

             after(grammarAccess.getSOLIDUSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSOLIDUS"


    // $ANTLR start "ruleSOLIDUS"
    // InternalMdxParser.g:1766:1: ruleSOLIDUS : ( Solidus ) ;
    public final void ruleSOLIDUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1770:2: ( ( Solidus ) )
            // InternalMdxParser.g:1771:2: ( Solidus )
            {
            // InternalMdxParser.g:1771:2: ( Solidus )
            // InternalMdxParser.g:1772:3: Solidus
            {
             before(grammarAccess.getSOLIDUSAccess().getSolidusKeyword()); 
            match(input,Solidus,FOLLOW_2); 
             after(grammarAccess.getSOLIDUSAccess().getSolidusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSOLIDUS"


    // $ANTLR start "rule__SingleFormulaSpecification__Alternatives"
    // InternalMdxParser.g:1781:1: rule__SingleFormulaSpecification__Alternatives : ( ( ruleMemberSpecification ) | ( ruleSetSpecification ) );
    public final void rule__SingleFormulaSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1785:1: ( ( ruleMemberSpecification ) | ( ruleSetSpecification ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MEMBER) ) {
                alt2=1;
            }
            else if ( (LA2_0==SET) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMdxParser.g:1786:2: ( ruleMemberSpecification )
                    {
                    // InternalMdxParser.g:1786:2: ( ruleMemberSpecification )
                    // InternalMdxParser.g:1787:3: ruleMemberSpecification
                    {
                     before(grammarAccess.getSingleFormulaSpecificationAccess().getMemberSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMemberSpecification();

                    state._fsp--;

                     after(grammarAccess.getSingleFormulaSpecificationAccess().getMemberSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1792:2: ( ruleSetSpecification )
                    {
                    // InternalMdxParser.g:1792:2: ( ruleSetSpecification )
                    // InternalMdxParser.g:1793:3: ruleSetSpecification
                    {
                     before(grammarAccess.getSingleFormulaSpecificationAccess().getSetSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetSpecification();

                    state._fsp--;

                     after(grammarAccess.getSingleFormulaSpecificationAccess().getSetSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleFormulaSpecification__Alternatives"


    // $ANTLR start "rule__SetSpecification__Alternatives_3"
    // InternalMdxParser.g:1802:1: rule__SetSpecification__Alternatives_3 : ( ( ( rule__SetSpecification__Group_3_0__0 ) ) | ( ruleExpression ) );
    public final void rule__SetSpecification__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1806:1: ( ( ( rule__SetSpecification__Group_3_0__0 ) ) | ( ruleExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Apostrophe) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=PROPERTIES && LA3_0<=DIMENSION)||LA3_0==CASE||LA3_0==NOT||LA3_0==LeftParenthesis||LA3_0==PlusSign||LA3_0==HyphenMinus||LA3_0==LeftCurlyBracket||LA3_0==RULE_ID||LA3_0==RULE_QUOTED_ID||(LA3_0>=RULE_INT && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMdxParser.g:1807:2: ( ( rule__SetSpecification__Group_3_0__0 ) )
                    {
                    // InternalMdxParser.g:1807:2: ( ( rule__SetSpecification__Group_3_0__0 ) )
                    // InternalMdxParser.g:1808:3: ( rule__SetSpecification__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetSpecificationAccess().getGroup_3_0()); 
                    // InternalMdxParser.g:1809:3: ( rule__SetSpecification__Group_3_0__0 )
                    // InternalMdxParser.g:1809:4: rule__SetSpecification__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetSpecification__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetSpecificationAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1813:2: ( ruleExpression )
                    {
                    // InternalMdxParser.g:1813:2: ( ruleExpression )
                    // InternalMdxParser.g:1814:3: ruleExpression
                    {
                     before(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Alternatives_3"


    // $ANTLR start "rule__MemberSpecification__Alternatives_3_0"
    // InternalMdxParser.g:1823:1: rule__MemberSpecification__Alternatives_3_0 : ( ( ( rule__MemberSpecification__Group_3_0_0__0 ) ) | ( ruleValueExpression ) );
    public final void rule__MemberSpecification__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1827:1: ( ( ( rule__MemberSpecification__Group_3_0_0__0 ) ) | ( ruleValueExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Apostrophe) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=PROPERTIES && LA4_0<=DIMENSION)||LA4_0==CASE||LA4_0==NOT||LA4_0==LeftParenthesis||LA4_0==PlusSign||LA4_0==HyphenMinus||LA4_0==LeftCurlyBracket||LA4_0==RULE_ID||LA4_0==RULE_QUOTED_ID||(LA4_0>=RULE_INT && LA4_0<=RULE_STRING)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMdxParser.g:1828:2: ( ( rule__MemberSpecification__Group_3_0_0__0 ) )
                    {
                    // InternalMdxParser.g:1828:2: ( ( rule__MemberSpecification__Group_3_0_0__0 ) )
                    // InternalMdxParser.g:1829:3: ( rule__MemberSpecification__Group_3_0_0__0 )
                    {
                     before(grammarAccess.getMemberSpecificationAccess().getGroup_3_0_0()); 
                    // InternalMdxParser.g:1830:3: ( rule__MemberSpecification__Group_3_0_0__0 )
                    // InternalMdxParser.g:1830:4: rule__MemberSpecification__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberSpecification__Group_3_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberSpecificationAccess().getGroup_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1834:2: ( ruleValueExpression )
                    {
                    // InternalMdxParser.g:1834:2: ( ruleValueExpression )
                    // InternalMdxParser.g:1835:3: ruleValueExpression
                    {
                     before(grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueExpression();

                    state._fsp--;

                     after(grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Alternatives_3_0"


    // $ANTLR start "rule__CellProperty__Alternatives"
    // InternalMdxParser.g:1844:1: rule__CellProperty__Alternatives : ( ( ruleMandatoryCellProperty ) | ( ruleProviderSpecificCellProperty ) );
    public final void rule__CellProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1848:1: ( ( ruleMandatoryCellProperty ) | ( ruleProviderSpecificCellProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=FORMATTED_VALUE && LA5_0<=CELL_ORDINAL)||LA5_0==VALUE) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=PROPERTIES && LA5_0<=DIMENSION)||LA5_0==RULE_ID||LA5_0==RULE_QUOTED_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMdxParser.g:1849:2: ( ruleMandatoryCellProperty )
                    {
                    // InternalMdxParser.g:1849:2: ( ruleMandatoryCellProperty )
                    // InternalMdxParser.g:1850:3: ruleMandatoryCellProperty
                    {
                     before(grammarAccess.getCellPropertyAccess().getMandatoryCellPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatoryCellProperty();

                    state._fsp--;

                     after(grammarAccess.getCellPropertyAccess().getMandatoryCellPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1855:2: ( ruleProviderSpecificCellProperty )
                    {
                    // InternalMdxParser.g:1855:2: ( ruleProviderSpecificCellProperty )
                    // InternalMdxParser.g:1856:3: ruleProviderSpecificCellProperty
                    {
                     before(grammarAccess.getCellPropertyAccess().getProviderSpecificCellPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProviderSpecificCellProperty();

                    state._fsp--;

                     after(grammarAccess.getCellPropertyAccess().getProviderSpecificCellPropertyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellProperty__Alternatives"


    // $ANTLR start "rule__MandatoryCellProperty__Alternatives"
    // InternalMdxParser.g:1865:1: rule__MandatoryCellProperty__Alternatives : ( ( CELL_ORDINAL ) | ( VALUE ) | ( FORMATTED_VALUE ) );
    public final void rule__MandatoryCellProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1869:1: ( ( CELL_ORDINAL ) | ( VALUE ) | ( FORMATTED_VALUE ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case CELL_ORDINAL:
                {
                alt6=1;
                }
                break;
            case VALUE:
                {
                alt6=2;
                }
                break;
            case FORMATTED_VALUE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMdxParser.g:1870:2: ( CELL_ORDINAL )
                    {
                    // InternalMdxParser.g:1870:2: ( CELL_ORDINAL )
                    // InternalMdxParser.g:1871:3: CELL_ORDINAL
                    {
                     before(grammarAccess.getMandatoryCellPropertyAccess().getCELL_ORDINALKeyword_0()); 
                    match(input,CELL_ORDINAL,FOLLOW_2); 
                     after(grammarAccess.getMandatoryCellPropertyAccess().getCELL_ORDINALKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1876:2: ( VALUE )
                    {
                    // InternalMdxParser.g:1876:2: ( VALUE )
                    // InternalMdxParser.g:1877:3: VALUE
                    {
                     before(grammarAccess.getMandatoryCellPropertyAccess().getVALUEKeyword_1()); 
                    match(input,VALUE,FOLLOW_2); 
                     after(grammarAccess.getMandatoryCellPropertyAccess().getVALUEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1882:2: ( FORMATTED_VALUE )
                    {
                    // InternalMdxParser.g:1882:2: ( FORMATTED_VALUE )
                    // InternalMdxParser.g:1883:3: FORMATTED_VALUE
                    {
                     before(grammarAccess.getMandatoryCellPropertyAccess().getFORMATTED_VALUEKeyword_2()); 
                    match(input,FORMATTED_VALUE,FOLLOW_2); 
                     after(grammarAccess.getMandatoryCellPropertyAccess().getFORMATTED_VALUEKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryCellProperty__Alternatives"


    // $ANTLR start "rule__ValueExpression__Alternatives_1"
    // InternalMdxParser.g:1892:1: rule__ValueExpression__Alternatives_1 : ( ( ruleValueXorExpression ) | ( ruleValueOrExpression ) );
    public final void rule__ValueExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1896:1: ( ( ruleValueXorExpression ) | ( ruleValueOrExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==XOR) ) {
                alt7=1;
            }
            else if ( (LA7_0==OR) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMdxParser.g:1897:2: ( ruleValueXorExpression )
                    {
                    // InternalMdxParser.g:1897:2: ( ruleValueXorExpression )
                    // InternalMdxParser.g:1898:3: ruleValueXorExpression
                    {
                     before(grammarAccess.getValueExpressionAccess().getValueXorExpressionParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueXorExpression();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionAccess().getValueXorExpressionParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1903:2: ( ruleValueOrExpression )
                    {
                    // InternalMdxParser.g:1903:2: ( ruleValueOrExpression )
                    // InternalMdxParser.g:1904:3: ruleValueOrExpression
                    {
                     before(grammarAccess.getValueExpressionAccess().getValueOrExpressionParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueOrExpression();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionAccess().getValueOrExpressionParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpression__Alternatives_1"


    // $ANTLR start "rule__Term4__Alternatives"
    // InternalMdxParser.g:1913:1: rule__Term4__Alternatives : ( ( ( rule__Term4__Group_0__0 ) ) | ( ruleTerm3 ) );
    public final void rule__Term4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1917:1: ( ( ( rule__Term4__Group_0__0 ) ) | ( ruleTerm3 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NOT) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=PROPERTIES && LA8_0<=DIMENSION)||LA8_0==CASE||LA8_0==LeftParenthesis||LA8_0==PlusSign||LA8_0==HyphenMinus||LA8_0==LeftCurlyBracket||LA8_0==RULE_ID||LA8_0==RULE_QUOTED_ID||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMdxParser.g:1918:2: ( ( rule__Term4__Group_0__0 ) )
                    {
                    // InternalMdxParser.g:1918:2: ( ( rule__Term4__Group_0__0 ) )
                    // InternalMdxParser.g:1919:3: ( rule__Term4__Group_0__0 )
                    {
                     before(grammarAccess.getTerm4Access().getGroup_0()); 
                    // InternalMdxParser.g:1920:3: ( rule__Term4__Group_0__0 )
                    // InternalMdxParser.g:1920:4: rule__Term4__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term4__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerm4Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1924:2: ( ruleTerm3 )
                    {
                    // InternalMdxParser.g:1924:2: ( ruleTerm3 )
                    // InternalMdxParser.g:1925:3: ruleTerm3
                    {
                     before(grammarAccess.getTerm4Access().getTerm3ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTerm3();

                    state._fsp--;

                     after(grammarAccess.getTerm4Access().getTerm3ParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term4__Alternatives"


    // $ANTLR start "rule__Term2__Alternatives_1_0"
    // InternalMdxParser.g:1934:1: rule__Term2__Alternatives_1_0 : ( ( ruleCONCAT ) | ( rulePLUS ) | ( ruleMINUS ) );
    public final void rule__Term2__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1938:1: ( ( ruleCONCAT ) | ( rulePLUS ) | ( ruleMINUS ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case VerticalLineVerticalLine:
                {
                alt9=1;
                }
                break;
            case PlusSign:
                {
                alt9=2;
                }
                break;
            case HyphenMinus:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMdxParser.g:1939:2: ( ruleCONCAT )
                    {
                    // InternalMdxParser.g:1939:2: ( ruleCONCAT )
                    // InternalMdxParser.g:1940:3: ruleCONCAT
                    {
                     before(grammarAccess.getTerm2Access().getCONCATParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCONCAT();

                    state._fsp--;

                     after(grammarAccess.getTerm2Access().getCONCATParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1945:2: ( rulePLUS )
                    {
                    // InternalMdxParser.g:1945:2: ( rulePLUS )
                    // InternalMdxParser.g:1946:3: rulePLUS
                    {
                     before(grammarAccess.getTerm2Access().getPLUSParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePLUS();

                    state._fsp--;

                     after(grammarAccess.getTerm2Access().getPLUSParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1951:2: ( ruleMINUS )
                    {
                    // InternalMdxParser.g:1951:2: ( ruleMINUS )
                    // InternalMdxParser.g:1952:3: ruleMINUS
                    {
                     before(grammarAccess.getTerm2Access().getMINUSParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMINUS();

                    state._fsp--;

                     after(grammarAccess.getTerm2Access().getMINUSParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Alternatives_1_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // InternalMdxParser.g:1961:1: rule__Term__Alternatives_1_0 : ( ( ruleSOLIDUS ) | ( ruleASTERISK ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1965:1: ( ( ruleSOLIDUS ) | ( ruleASTERISK ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Solidus) ) {
                alt10=1;
            }
            else if ( (LA10_0==Asterisk) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMdxParser.g:1966:2: ( ruleSOLIDUS )
                    {
                    // InternalMdxParser.g:1966:2: ( ruleSOLIDUS )
                    // InternalMdxParser.g:1967:3: ruleSOLIDUS
                    {
                     before(grammarAccess.getTermAccess().getSOLIDUSParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSOLIDUS();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getSOLIDUSParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1972:2: ( ruleASTERISK )
                    {
                    // InternalMdxParser.g:1972:2: ( ruleASTERISK )
                    // InternalMdxParser.g:1973:3: ruleASTERISK
                    {
                     before(grammarAccess.getTermAccess().getASTERISKParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleASTERISK();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getASTERISKParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalMdxParser.g:1982:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleValueExpressionPrimary ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:1986:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleValueExpressionPrimary ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case HyphenMinus:
                {
                alt11=1;
                }
                break;
            case PlusSign:
                {
                alt11=2;
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
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMdxParser.g:1987:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalMdxParser.g:1987:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalMdxParser.g:1988:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalMdxParser.g:1989:3: ( rule__Factor__Group_0__0 )
                    // InternalMdxParser.g:1989:4: rule__Factor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:1993:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalMdxParser.g:1993:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalMdxParser.g:1994:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalMdxParser.g:1995:3: ( rule__Factor__Group_1__0 )
                    // InternalMdxParser.g:1995:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:1999:2: ( ruleValueExpressionPrimary )
                    {
                    // InternalMdxParser.g:1999:2: ( ruleValueExpressionPrimary )
                    // InternalMdxParser.g:2000:3: ruleValueExpressionPrimary
                    {
                     before(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleValueExpressionPrimary();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__ValueExpressionPrimary__Alternatives_1_1"
    // InternalMdxParser.g:2009:1: rule__ValueExpressionPrimary__Alternatives_1_1 : ( ( ruleUnquotedIdentifier ) | ( ruleQuotedIdentifier ) | ( ruleAmpQuotedIdentifier ) | ( ruleFunction ) );
    public final void rule__ValueExpressionPrimary__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2013:1: ( ( ruleUnquotedIdentifier ) | ( ruleQuotedIdentifier ) | ( ruleAmpQuotedIdentifier ) | ( ruleFunction ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case DIMENSION:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==LeftParenthesis) ) {
                    alt12=4;
                }
                else if ( (LA12_1==EOF||(LA12_1>=PROPERTIES && LA12_1<=SELECT)||(LA12_1>=CELL && LA12_1<=ELSE)||(LA12_1>=THEN && LA12_1<=WHEN)||(LA12_1>=AND && LA12_1<=END)||(LA12_1>=SET && LA12_1<=GreaterThanSignEqualsSign)||(LA12_1>=ON && LA12_1<=Apostrophe)||(LA12_1>=RightParenthesis && LA12_1<=Colon)||(LA12_1>=LessThanSign && LA12_1<=GreaterThanSign)||LA12_1==RightCurlyBracket) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case PROPERTIES:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==LeftParenthesis) ) {
                    alt12=4;
                }
                else if ( (LA12_2==EOF||(LA12_2>=PROPERTIES && LA12_2<=SELECT)||(LA12_2>=CELL && LA12_2<=ELSE)||(LA12_2>=THEN && LA12_2<=WHEN)||(LA12_2>=AND && LA12_2<=END)||(LA12_2>=SET && LA12_2<=GreaterThanSignEqualsSign)||(LA12_2>=ON && LA12_2<=Apostrophe)||(LA12_2>=RightParenthesis && LA12_2<=Colon)||(LA12_2>=LessThanSign && LA12_2<=GreaterThanSign)||LA12_2==RightCurlyBracket) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==LeftParenthesis) ) {
                    alt12=4;
                }
                else if ( (LA12_3==EOF||(LA12_3>=PROPERTIES && LA12_3<=SELECT)||(LA12_3>=CELL && LA12_3<=ELSE)||(LA12_3>=THEN && LA12_3<=WHEN)||(LA12_3>=AND && LA12_3<=END)||(LA12_3>=SET && LA12_3<=GreaterThanSignEqualsSign)||(LA12_3>=ON && LA12_3<=Apostrophe)||(LA12_3>=RightParenthesis && LA12_3<=Colon)||(LA12_3>=LessThanSign && LA12_3<=GreaterThanSign)||LA12_3==RightCurlyBracket) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_QUOTED_ID:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==LeftParenthesis) ) {
                    alt12=4;
                }
                else if ( (LA12_4==EOF||(LA12_4>=PROPERTIES && LA12_4<=SELECT)||(LA12_4>=CELL && LA12_4<=ELSE)||(LA12_4>=THEN && LA12_4<=WHEN)||(LA12_4>=AND && LA12_4<=END)||(LA12_4>=SET && LA12_4<=GreaterThanSignEqualsSign)||(LA12_4>=ON && LA12_4<=Apostrophe)||(LA12_4>=RightParenthesis && LA12_4<=Colon)||(LA12_4>=LessThanSign && LA12_4<=GreaterThanSign)||LA12_4==RightCurlyBracket) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_AMP_QUOTED_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMdxParser.g:2014:2: ( ruleUnquotedIdentifier )
                    {
                    // InternalMdxParser.g:2014:2: ( ruleUnquotedIdentifier )
                    // InternalMdxParser.g:2015:3: ruleUnquotedIdentifier
                    {
                     before(grammarAccess.getValueExpressionPrimaryAccess().getUnquotedIdentifierParserRuleCall_1_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnquotedIdentifier();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimaryAccess().getUnquotedIdentifierParserRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2020:2: ( ruleQuotedIdentifier )
                    {
                    // InternalMdxParser.g:2020:2: ( ruleQuotedIdentifier )
                    // InternalMdxParser.g:2021:3: ruleQuotedIdentifier
                    {
                     before(grammarAccess.getValueExpressionPrimaryAccess().getQuotedIdentifierParserRuleCall_1_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuotedIdentifier();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimaryAccess().getQuotedIdentifierParserRuleCall_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:2026:2: ( ruleAmpQuotedIdentifier )
                    {
                    // InternalMdxParser.g:2026:2: ( ruleAmpQuotedIdentifier )
                    // InternalMdxParser.g:2027:3: ruleAmpQuotedIdentifier
                    {
                     before(grammarAccess.getValueExpressionPrimaryAccess().getAmpQuotedIdentifierParserRuleCall_1_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAmpQuotedIdentifier();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimaryAccess().getAmpQuotedIdentifierParserRuleCall_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMdxParser.g:2032:2: ( ruleFunction )
                    {
                    // InternalMdxParser.g:2032:2: ( ruleFunction )
                    // InternalMdxParser.g:2033:3: ruleFunction
                    {
                     before(grammarAccess.getValueExpressionPrimaryAccess().getFunctionParserRuleCall_1_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimaryAccess().getFunctionParserRuleCall_1_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Alternatives_1_1"


    // $ANTLR start "rule__ValueExpressionPrimary0__Alternatives"
    // InternalMdxParser.g:2042:1: rule__ValueExpressionPrimary0__Alternatives : ( ( ruleFunction ) | ( ( rule__ValueExpressionPrimary0__Group_1__0 ) ) | ( ( rule__ValueExpressionPrimary0__Group_2__0 ) ) | ( ruleCaseExpression ) | ( RULE_STRING ) | ( RULE_INT ) | ( ruleIdentifier ) );
    public final void rule__ValueExpressionPrimary0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2046:1: ( ( ruleFunction ) | ( ( rule__ValueExpressionPrimary0__Group_1__0 ) ) | ( ( rule__ValueExpressionPrimary0__Group_2__0 ) ) | ( ruleCaseExpression ) | ( RULE_STRING ) | ( RULE_INT ) | ( ruleIdentifier ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalMdxParser.g:2047:2: ( ruleFunction )
                    {
                    // InternalMdxParser.g:2047:2: ( ruleFunction )
                    // InternalMdxParser.g:2048:3: ruleFunction
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimary0Access().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2053:2: ( ( rule__ValueExpressionPrimary0__Group_1__0 ) )
                    {
                    // InternalMdxParser.g:2053:2: ( ( rule__ValueExpressionPrimary0__Group_1__0 ) )
                    // InternalMdxParser.g:2054:3: ( rule__ValueExpressionPrimary0__Group_1__0 )
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getGroup_1()); 
                    // InternalMdxParser.g:2055:3: ( rule__ValueExpressionPrimary0__Group_1__0 )
                    // InternalMdxParser.g:2055:4: rule__ValueExpressionPrimary0__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueExpressionPrimary0__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueExpressionPrimary0Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:2059:2: ( ( rule__ValueExpressionPrimary0__Group_2__0 ) )
                    {
                    // InternalMdxParser.g:2059:2: ( ( rule__ValueExpressionPrimary0__Group_2__0 ) )
                    // InternalMdxParser.g:2060:3: ( rule__ValueExpressionPrimary0__Group_2__0 )
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getGroup_2()); 
                    // InternalMdxParser.g:2061:3: ( rule__ValueExpressionPrimary0__Group_2__0 )
                    // InternalMdxParser.g:2061:4: rule__ValueExpressionPrimary0__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueExpressionPrimary0__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueExpressionPrimary0Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMdxParser.g:2065:2: ( ruleCaseExpression )
                    {
                    // InternalMdxParser.g:2065:2: ( ruleCaseExpression )
                    // InternalMdxParser.g:2066:3: ruleCaseExpression
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getCaseExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCaseExpression();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimary0Access().getCaseExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMdxParser.g:2071:2: ( RULE_STRING )
                    {
                    // InternalMdxParser.g:2071:2: ( RULE_STRING )
                    // InternalMdxParser.g:2072:3: RULE_STRING
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getSTRINGTerminalRuleCall_4()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueExpressionPrimary0Access().getSTRINGTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMdxParser.g:2077:2: ( RULE_INT )
                    {
                    // InternalMdxParser.g:2077:2: ( RULE_INT )
                    // InternalMdxParser.g:2078:3: RULE_INT
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getINTTerminalRuleCall_5()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueExpressionPrimary0Access().getINTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMdxParser.g:2083:2: ( ruleIdentifier )
                    {
                    // InternalMdxParser.g:2083:2: ( ruleIdentifier )
                    // InternalMdxParser.g:2084:3: ruleIdentifier
                    {
                     before(grammarAccess.getValueExpressionPrimary0Access().getIdentifierParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getValueExpressionPrimary0Access().getIdentifierParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Alternatives"


    // $ANTLR start "rule__CompatingOperator__Alternatives"
    // InternalMdxParser.g:2093:1: rule__CompatingOperator__Alternatives : ( ( ruleEQ ) | ( ruleNE ) | ( ruleLT ) | ( ruleGT ) | ( ruleLE ) | ( ruleGE ) );
    public final void rule__CompatingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2097:1: ( ( ruleEQ ) | ( ruleNE ) | ( ruleLT ) | ( ruleGT ) | ( ruleLE ) | ( ruleGE ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt14=1;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt14=2;
                }
                break;
            case LessThanSign:
                {
                alt14=3;
                }
                break;
            case GreaterThanSign:
                {
                alt14=4;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt14=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMdxParser.g:2098:2: ( ruleEQ )
                    {
                    // InternalMdxParser.g:2098:2: ( ruleEQ )
                    // InternalMdxParser.g:2099:3: ruleEQ
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getEQParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEQ();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getEQParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2104:2: ( ruleNE )
                    {
                    // InternalMdxParser.g:2104:2: ( ruleNE )
                    // InternalMdxParser.g:2105:3: ruleNE
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getNEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNE();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getNEParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMdxParser.g:2110:2: ( ruleLT )
                    {
                    // InternalMdxParser.g:2110:2: ( ruleLT )
                    // InternalMdxParser.g:2111:3: ruleLT
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getLTParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLT();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getLTParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMdxParser.g:2116:2: ( ruleGT )
                    {
                    // InternalMdxParser.g:2116:2: ( ruleGT )
                    // InternalMdxParser.g:2117:3: ruleGT
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getGTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGT();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getGTParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMdxParser.g:2122:2: ( ruleLE )
                    {
                    // InternalMdxParser.g:2122:2: ( ruleLE )
                    // InternalMdxParser.g:2123:3: ruleLE
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getLEParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLE();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getLEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMdxParser.g:2128:2: ( ruleGE )
                    {
                    // InternalMdxParser.g:2128:2: ( ruleGE )
                    // InternalMdxParser.g:2129:3: ruleGE
                    {
                     before(grammarAccess.getCompatingOperatorAccess().getGEParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGE();

                    state._fsp--;

                     after(grammarAccess.getCompatingOperatorAccess().getGEParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompatingOperator__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // InternalMdxParser.g:2138:1: rule__Identifier__Alternatives : ( ( ruleUnquotedIdentifier ) | ( ruleQuotedIdentifier ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2142:1: ( ( ruleUnquotedIdentifier ) | ( ruleQuotedIdentifier ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=PROPERTIES && LA15_0<=DIMENSION)||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_QUOTED_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMdxParser.g:2143:2: ( ruleUnquotedIdentifier )
                    {
                    // InternalMdxParser.g:2143:2: ( ruleUnquotedIdentifier )
                    // InternalMdxParser.g:2144:3: ruleUnquotedIdentifier
                    {
                     before(grammarAccess.getIdentifierAccess().getUnquotedIdentifierParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnquotedIdentifier();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getUnquotedIdentifierParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2149:2: ( ruleQuotedIdentifier )
                    {
                    // InternalMdxParser.g:2149:2: ( ruleQuotedIdentifier )
                    // InternalMdxParser.g:2150:3: ruleQuotedIdentifier
                    {
                     before(grammarAccess.getIdentifierAccess().getQuotedIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuotedIdentifier();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getQuotedIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__UnquotedIdentifier__Alternatives"
    // InternalMdxParser.g:2159:1: rule__UnquotedIdentifier__Alternatives : ( ( ruleKeyword ) | ( RULE_ID ) );
    public final void rule__UnquotedIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2163:1: ( ( ruleKeyword ) | ( RULE_ID ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=PROPERTIES && LA16_0<=DIMENSION)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMdxParser.g:2164:2: ( ruleKeyword )
                    {
                    // InternalMdxParser.g:2164:2: ( ruleKeyword )
                    // InternalMdxParser.g:2165:3: ruleKeyword
                    {
                     before(grammarAccess.getUnquotedIdentifierAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getUnquotedIdentifierAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2170:2: ( RULE_ID )
                    {
                    // InternalMdxParser.g:2170:2: ( RULE_ID )
                    // InternalMdxParser.g:2171:3: RULE_ID
                    {
                     before(grammarAccess.getUnquotedIdentifierAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnquotedIdentifierAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnquotedIdentifier__Alternatives"


    // $ANTLR start "rule__Keyword__Alternatives"
    // InternalMdxParser.g:2180:1: rule__Keyword__Alternatives : ( ( DIMENSION ) | ( PROPERTIES ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2184:1: ( ( DIMENSION ) | ( PROPERTIES ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DIMENSION) ) {
                alt17=1;
            }
            else if ( (LA17_0==PROPERTIES) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMdxParser.g:2185:2: ( DIMENSION )
                    {
                    // InternalMdxParser.g:2185:2: ( DIMENSION )
                    // InternalMdxParser.g:2186:3: DIMENSION
                    {
                     before(grammarAccess.getKeywordAccess().getDIMENSIONKeyword_0()); 
                    match(input,DIMENSION,FOLLOW_2); 
                     after(grammarAccess.getKeywordAccess().getDIMENSIONKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMdxParser.g:2191:2: ( PROPERTIES )
                    {
                    // InternalMdxParser.g:2191:2: ( PROPERTIES )
                    // InternalMdxParser.g:2192:3: PROPERTIES
                    {
                     before(grammarAccess.getKeywordAccess().getPROPERTIESKeyword_1()); 
                    match(input,PROPERTIES,FOLLOW_2); 
                     after(grammarAccess.getKeywordAccess().getPROPERTIESKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__Alternatives"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalMdxParser.g:2201:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2205:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalMdxParser.g:2206:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalMdxParser.g:2213:1: rule__SelectStatement__Group__0__Impl : ( () ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2217:1: ( ( () ) )
            // InternalMdxParser.g:2218:1: ( () )
            {
            // InternalMdxParser.g:2218:1: ( () )
            // InternalMdxParser.g:2219:2: ()
            {
             before(grammarAccess.getSelectStatementAccess().getSelectStatementAction_0()); 
            // InternalMdxParser.g:2220:2: ()
            // InternalMdxParser.g:2220:3: 
            {
            }

             after(grammarAccess.getSelectStatementAccess().getSelectStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalMdxParser.g:2228:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2232:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalMdxParser.g:2233:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalMdxParser.g:2240:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__Group_1__0 )? ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2244:1: ( ( ( rule__SelectStatement__Group_1__0 )? ) )
            // InternalMdxParser.g:2245:1: ( ( rule__SelectStatement__Group_1__0 )? )
            {
            // InternalMdxParser.g:2245:1: ( ( rule__SelectStatement__Group_1__0 )? )
            // InternalMdxParser.g:2246:2: ( rule__SelectStatement__Group_1__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_1()); 
            // InternalMdxParser.g:2247:2: ( rule__SelectStatement__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==WITH) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMdxParser.g:2247:3: rule__SelectStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalMdxParser.g:2255:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2259:1: ( rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 )
            // InternalMdxParser.g:2260:2: rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalMdxParser.g:2267:1: rule__SelectStatement__Group__2__Impl : ( SELECT ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2271:1: ( ( SELECT ) )
            // InternalMdxParser.g:2272:1: ( SELECT )
            {
            // InternalMdxParser.g:2272:1: ( SELECT )
            // InternalMdxParser.g:2273:2: SELECT
            {
             before(grammarAccess.getSelectStatementAccess().getSELECTKeyword_2()); 
            match(input,SELECT,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getSELECTKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group__3"
    // InternalMdxParser.g:2282:1: rule__SelectStatement__Group__3 : rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 ;
    public final void rule__SelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2286:1: ( rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 )
            // InternalMdxParser.g:2287:2: rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SelectStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3"


    // $ANTLR start "rule__SelectStatement__Group__3__Impl"
    // InternalMdxParser.g:2294:1: rule__SelectStatement__Group__3__Impl : ( ( ruleAxisSpecificationList )? ) ;
    public final void rule__SelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2298:1: ( ( ( ruleAxisSpecificationList )? ) )
            // InternalMdxParser.g:2299:1: ( ( ruleAxisSpecificationList )? )
            {
            // InternalMdxParser.g:2299:1: ( ( ruleAxisSpecificationList )? )
            // InternalMdxParser.g:2300:2: ( ruleAxisSpecificationList )?
            {
             before(grammarAccess.getSelectStatementAccess().getAxisSpecificationListParserRuleCall_3()); 
            // InternalMdxParser.g:2301:2: ( ruleAxisSpecificationList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=PROPERTIES && LA19_0<=DIMENSION)||LA19_0==CASE||(LA19_0>=NON && LA19_0<=NOT)||LA19_0==LeftParenthesis||LA19_0==PlusSign||LA19_0==HyphenMinus||LA19_0==LeftCurlyBracket||LA19_0==RULE_ID||LA19_0==RULE_QUOTED_ID||(LA19_0>=RULE_INT && LA19_0<=RULE_STRING)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMdxParser.g:2301:3: ruleAxisSpecificationList
                    {
                    pushFollow(FOLLOW_2);
                    ruleAxisSpecificationList();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getAxisSpecificationListParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3__Impl"


    // $ANTLR start "rule__SelectStatement__Group__4"
    // InternalMdxParser.g:2309:1: rule__SelectStatement__Group__4 : rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 ;
    public final void rule__SelectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2313:1: ( rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 )
            // InternalMdxParser.g:2314:2: rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SelectStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__4"


    // $ANTLR start "rule__SelectStatement__Group__4__Impl"
    // InternalMdxParser.g:2321:1: rule__SelectStatement__Group__4__Impl : ( FROM ) ;
    public final void rule__SelectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2325:1: ( ( FROM ) )
            // InternalMdxParser.g:2326:1: ( FROM )
            {
            // InternalMdxParser.g:2326:1: ( FROM )
            // InternalMdxParser.g:2327:2: FROM
            {
             before(grammarAccess.getSelectStatementAccess().getFROMKeyword_4()); 
            match(input,FROM,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFROMKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__4__Impl"


    // $ANTLR start "rule__SelectStatement__Group__5"
    // InternalMdxParser.g:2336:1: rule__SelectStatement__Group__5 : rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6 ;
    public final void rule__SelectStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2340:1: ( rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6 )
            // InternalMdxParser.g:2341:2: rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__5"


    // $ANTLR start "rule__SelectStatement__Group__5__Impl"
    // InternalMdxParser.g:2348:1: rule__SelectStatement__Group__5__Impl : ( ruleCubeSpecification ) ;
    public final void rule__SelectStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2352:1: ( ( ruleCubeSpecification ) )
            // InternalMdxParser.g:2353:1: ( ruleCubeSpecification )
            {
            // InternalMdxParser.g:2353:1: ( ruleCubeSpecification )
            // InternalMdxParser.g:2354:2: ruleCubeSpecification
            {
             before(grammarAccess.getSelectStatementAccess().getCubeSpecificationParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleCubeSpecification();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getCubeSpecificationParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__5__Impl"


    // $ANTLR start "rule__SelectStatement__Group__6"
    // InternalMdxParser.g:2363:1: rule__SelectStatement__Group__6 : rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7 ;
    public final void rule__SelectStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2367:1: ( rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7 )
            // InternalMdxParser.g:2368:2: rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__6"


    // $ANTLR start "rule__SelectStatement__Group__6__Impl"
    // InternalMdxParser.g:2375:1: rule__SelectStatement__Group__6__Impl : ( ( rule__SelectStatement__Group_6__0 )? ) ;
    public final void rule__SelectStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2379:1: ( ( ( rule__SelectStatement__Group_6__0 )? ) )
            // InternalMdxParser.g:2380:1: ( ( rule__SelectStatement__Group_6__0 )? )
            {
            // InternalMdxParser.g:2380:1: ( ( rule__SelectStatement__Group_6__0 )? )
            // InternalMdxParser.g:2381:2: ( rule__SelectStatement__Group_6__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_6()); 
            // InternalMdxParser.g:2382:2: ( rule__SelectStatement__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WHERE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMdxParser.g:2382:3: rule__SelectStatement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__6__Impl"


    // $ANTLR start "rule__SelectStatement__Group__7"
    // InternalMdxParser.g:2390:1: rule__SelectStatement__Group__7 : rule__SelectStatement__Group__7__Impl ;
    public final void rule__SelectStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2394:1: ( rule__SelectStatement__Group__7__Impl )
            // InternalMdxParser.g:2395:2: rule__SelectStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__7"


    // $ANTLR start "rule__SelectStatement__Group__7__Impl"
    // InternalMdxParser.g:2401:1: rule__SelectStatement__Group__7__Impl : ( ( ruleCellPropeties )? ) ;
    public final void rule__SelectStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2405:1: ( ( ( ruleCellPropeties )? ) )
            // InternalMdxParser.g:2406:1: ( ( ruleCellPropeties )? )
            {
            // InternalMdxParser.g:2406:1: ( ( ruleCellPropeties )? )
            // InternalMdxParser.g:2407:2: ( ruleCellPropeties )?
            {
             before(grammarAccess.getSelectStatementAccess().getCellPropetiesParserRuleCall_7()); 
            // InternalMdxParser.g:2408:2: ( ruleCellPropeties )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PROPERTIES||LA21_0==CELL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMdxParser.g:2408:3: ruleCellPropeties
                    {
                    pushFollow(FOLLOW_2);
                    ruleCellPropeties();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getCellPropetiesParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__7__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1__0"
    // InternalMdxParser.g:2417:1: rule__SelectStatement__Group_1__0 : rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1 ;
    public final void rule__SelectStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2421:1: ( rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1 )
            // InternalMdxParser.g:2422:2: rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1__0__Impl"
    // InternalMdxParser.g:2429:1: rule__SelectStatement__Group_1__0__Impl : ( WITH ) ;
    public final void rule__SelectStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2433:1: ( ( WITH ) )
            // InternalMdxParser.g:2434:1: ( WITH )
            {
            // InternalMdxParser.g:2434:1: ( WITH )
            // InternalMdxParser.g:2435:2: WITH
            {
             before(grammarAccess.getSelectStatementAccess().getWITHKeyword_1_0()); 
            match(input,WITH,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getWITHKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1__1"
    // InternalMdxParser.g:2444:1: rule__SelectStatement__Group_1__1 : rule__SelectStatement__Group_1__1__Impl ;
    public final void rule__SelectStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2448:1: ( rule__SelectStatement__Group_1__1__Impl )
            // InternalMdxParser.g:2449:2: rule__SelectStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1__1__Impl"
    // InternalMdxParser.g:2455:1: rule__SelectStatement__Group_1__1__Impl : ( ruleFormulaSpecification ) ;
    public final void rule__SelectStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2459:1: ( ( ruleFormulaSpecification ) )
            // InternalMdxParser.g:2460:1: ( ruleFormulaSpecification )
            {
            // InternalMdxParser.g:2460:1: ( ruleFormulaSpecification )
            // InternalMdxParser.g:2461:2: ruleFormulaSpecification
            {
             before(grammarAccess.getSelectStatementAccess().getFormulaSpecificationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleFormulaSpecification();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getFormulaSpecificationParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_6__0"
    // InternalMdxParser.g:2471:1: rule__SelectStatement__Group_6__0 : rule__SelectStatement__Group_6__0__Impl rule__SelectStatement__Group_6__1 ;
    public final void rule__SelectStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2475:1: ( rule__SelectStatement__Group_6__0__Impl rule__SelectStatement__Group_6__1 )
            // InternalMdxParser.g:2476:2: rule__SelectStatement__Group_6__0__Impl rule__SelectStatement__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_6__0"


    // $ANTLR start "rule__SelectStatement__Group_6__0__Impl"
    // InternalMdxParser.g:2483:1: rule__SelectStatement__Group_6__0__Impl : ( WHERE ) ;
    public final void rule__SelectStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2487:1: ( ( WHERE ) )
            // InternalMdxParser.g:2488:1: ( WHERE )
            {
            // InternalMdxParser.g:2488:1: ( WHERE )
            // InternalMdxParser.g:2489:2: WHERE
            {
             before(grammarAccess.getSelectStatementAccess().getWHEREKeyword_6_0()); 
            match(input,WHERE,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getWHEREKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_6__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_6__1"
    // InternalMdxParser.g:2498:1: rule__SelectStatement__Group_6__1 : rule__SelectStatement__Group_6__1__Impl ;
    public final void rule__SelectStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2502:1: ( rule__SelectStatement__Group_6__1__Impl )
            // InternalMdxParser.g:2503:2: rule__SelectStatement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_6__1"


    // $ANTLR start "rule__SelectStatement__Group_6__1__Impl"
    // InternalMdxParser.g:2509:1: rule__SelectStatement__Group_6__1__Impl : ( ruleSlicerSpecification ) ;
    public final void rule__SelectStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2513:1: ( ( ruleSlicerSpecification ) )
            // InternalMdxParser.g:2514:1: ( ruleSlicerSpecification )
            {
            // InternalMdxParser.g:2514:1: ( ruleSlicerSpecification )
            // InternalMdxParser.g:2515:2: ruleSlicerSpecification
            {
             before(grammarAccess.getSelectStatementAccess().getSlicerSpecificationParserRuleCall_6_1()); 
            pushFollow(FOLLOW_2);
            ruleSlicerSpecification();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getSlicerSpecificationParserRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_6__1__Impl"


    // $ANTLR start "rule__SetSpecification__Group__0"
    // InternalMdxParser.g:2525:1: rule__SetSpecification__Group__0 : rule__SetSpecification__Group__0__Impl rule__SetSpecification__Group__1 ;
    public final void rule__SetSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2529:1: ( rule__SetSpecification__Group__0__Impl rule__SetSpecification__Group__1 )
            // InternalMdxParser.g:2530:2: rule__SetSpecification__Group__0__Impl rule__SetSpecification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SetSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__0"


    // $ANTLR start "rule__SetSpecification__Group__0__Impl"
    // InternalMdxParser.g:2537:1: rule__SetSpecification__Group__0__Impl : ( SET ) ;
    public final void rule__SetSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2541:1: ( ( SET ) )
            // InternalMdxParser.g:2542:1: ( SET )
            {
            // InternalMdxParser.g:2542:1: ( SET )
            // InternalMdxParser.g:2543:2: SET
            {
             before(grammarAccess.getSetSpecificationAccess().getSETKeyword_0()); 
            match(input,SET,FOLLOW_2); 
             after(grammarAccess.getSetSpecificationAccess().getSETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__0__Impl"


    // $ANTLR start "rule__SetSpecification__Group__1"
    // InternalMdxParser.g:2552:1: rule__SetSpecification__Group__1 : rule__SetSpecification__Group__1__Impl rule__SetSpecification__Group__2 ;
    public final void rule__SetSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2556:1: ( rule__SetSpecification__Group__1__Impl rule__SetSpecification__Group__2 )
            // InternalMdxParser.g:2557:2: rule__SetSpecification__Group__1__Impl rule__SetSpecification__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SetSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__1"


    // $ANTLR start "rule__SetSpecification__Group__1__Impl"
    // InternalMdxParser.g:2564:1: rule__SetSpecification__Group__1__Impl : ( ruleSetName ) ;
    public final void rule__SetSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2568:1: ( ( ruleSetName ) )
            // InternalMdxParser.g:2569:1: ( ruleSetName )
            {
            // InternalMdxParser.g:2569:1: ( ruleSetName )
            // InternalMdxParser.g:2570:2: ruleSetName
            {
             before(grammarAccess.getSetSpecificationAccess().getSetNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSetName();

            state._fsp--;

             after(grammarAccess.getSetSpecificationAccess().getSetNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__1__Impl"


    // $ANTLR start "rule__SetSpecification__Group__2"
    // InternalMdxParser.g:2579:1: rule__SetSpecification__Group__2 : rule__SetSpecification__Group__2__Impl rule__SetSpecification__Group__3 ;
    public final void rule__SetSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2583:1: ( rule__SetSpecification__Group__2__Impl rule__SetSpecification__Group__3 )
            // InternalMdxParser.g:2584:2: rule__SetSpecification__Group__2__Impl rule__SetSpecification__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SetSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__2"


    // $ANTLR start "rule__SetSpecification__Group__2__Impl"
    // InternalMdxParser.g:2591:1: rule__SetSpecification__Group__2__Impl : ( AS ) ;
    public final void rule__SetSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2595:1: ( ( AS ) )
            // InternalMdxParser.g:2596:1: ( AS )
            {
            // InternalMdxParser.g:2596:1: ( AS )
            // InternalMdxParser.g:2597:2: AS
            {
             before(grammarAccess.getSetSpecificationAccess().getASKeyword_2()); 
            match(input,AS,FOLLOW_2); 
             after(grammarAccess.getSetSpecificationAccess().getASKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__2__Impl"


    // $ANTLR start "rule__SetSpecification__Group__3"
    // InternalMdxParser.g:2606:1: rule__SetSpecification__Group__3 : rule__SetSpecification__Group__3__Impl ;
    public final void rule__SetSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2610:1: ( rule__SetSpecification__Group__3__Impl )
            // InternalMdxParser.g:2611:2: rule__SetSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__3"


    // $ANTLR start "rule__SetSpecification__Group__3__Impl"
    // InternalMdxParser.g:2617:1: rule__SetSpecification__Group__3__Impl : ( ( rule__SetSpecification__Alternatives_3 ) ) ;
    public final void rule__SetSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2621:1: ( ( ( rule__SetSpecification__Alternatives_3 ) ) )
            // InternalMdxParser.g:2622:1: ( ( rule__SetSpecification__Alternatives_3 ) )
            {
            // InternalMdxParser.g:2622:1: ( ( rule__SetSpecification__Alternatives_3 ) )
            // InternalMdxParser.g:2623:2: ( rule__SetSpecification__Alternatives_3 )
            {
             before(grammarAccess.getSetSpecificationAccess().getAlternatives_3()); 
            // InternalMdxParser.g:2624:2: ( rule__SetSpecification__Alternatives_3 )
            // InternalMdxParser.g:2624:3: rule__SetSpecification__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__SetSpecification__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSetSpecificationAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group__3__Impl"


    // $ANTLR start "rule__SetSpecification__Group_3_0__0"
    // InternalMdxParser.g:2633:1: rule__SetSpecification__Group_3_0__0 : rule__SetSpecification__Group_3_0__0__Impl rule__SetSpecification__Group_3_0__1 ;
    public final void rule__SetSpecification__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2637:1: ( rule__SetSpecification__Group_3_0__0__Impl rule__SetSpecification__Group_3_0__1 )
            // InternalMdxParser.g:2638:2: rule__SetSpecification__Group_3_0__0__Impl rule__SetSpecification__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__SetSpecification__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__0"


    // $ANTLR start "rule__SetSpecification__Group_3_0__0__Impl"
    // InternalMdxParser.g:2645:1: rule__SetSpecification__Group_3_0__0__Impl : ( ruleQUOTE ) ;
    public final void rule__SetSpecification__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2649:1: ( ( ruleQUOTE ) )
            // InternalMdxParser.g:2650:1: ( ruleQUOTE )
            {
            // InternalMdxParser.g:2650:1: ( ruleQUOTE )
            // InternalMdxParser.g:2651:2: ruleQUOTE
            {
             before(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQUOTE();

            state._fsp--;

             after(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__0__Impl"


    // $ANTLR start "rule__SetSpecification__Group_3_0__1"
    // InternalMdxParser.g:2660:1: rule__SetSpecification__Group_3_0__1 : rule__SetSpecification__Group_3_0__1__Impl rule__SetSpecification__Group_3_0__2 ;
    public final void rule__SetSpecification__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2664:1: ( rule__SetSpecification__Group_3_0__1__Impl rule__SetSpecification__Group_3_0__2 )
            // InternalMdxParser.g:2665:2: rule__SetSpecification__Group_3_0__1__Impl rule__SetSpecification__Group_3_0__2
            {
            pushFollow(FOLLOW_12);
            rule__SetSpecification__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__1"


    // $ANTLR start "rule__SetSpecification__Group_3_0__1__Impl"
    // InternalMdxParser.g:2672:1: rule__SetSpecification__Group_3_0__1__Impl : ( ruleExpression ) ;
    public final void rule__SetSpecification__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2676:1: ( ( ruleExpression ) )
            // InternalMdxParser.g:2677:1: ( ruleExpression )
            {
            // InternalMdxParser.g:2677:1: ( ruleExpression )
            // InternalMdxParser.g:2678:2: ruleExpression
            {
             before(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__1__Impl"


    // $ANTLR start "rule__SetSpecification__Group_3_0__2"
    // InternalMdxParser.g:2687:1: rule__SetSpecification__Group_3_0__2 : rule__SetSpecification__Group_3_0__2__Impl ;
    public final void rule__SetSpecification__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2691:1: ( rule__SetSpecification__Group_3_0__2__Impl )
            // InternalMdxParser.g:2692:2: rule__SetSpecification__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSpecification__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__2"


    // $ANTLR start "rule__SetSpecification__Group_3_0__2__Impl"
    // InternalMdxParser.g:2698:1: rule__SetSpecification__Group_3_0__2__Impl : ( ruleQUOTE ) ;
    public final void rule__SetSpecification__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2702:1: ( ( ruleQUOTE ) )
            // InternalMdxParser.g:2703:1: ( ruleQUOTE )
            {
            // InternalMdxParser.g:2703:1: ( ruleQUOTE )
            // InternalMdxParser.g:2704:2: ruleQUOTE
            {
             before(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_2()); 
            pushFollow(FOLLOW_2);
            ruleQUOTE();

            state._fsp--;

             after(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSpecification__Group_3_0__2__Impl"


    // $ANTLR start "rule__MemberSpecification__Group__0"
    // InternalMdxParser.g:2714:1: rule__MemberSpecification__Group__0 : rule__MemberSpecification__Group__0__Impl rule__MemberSpecification__Group__1 ;
    public final void rule__MemberSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2718:1: ( rule__MemberSpecification__Group__0__Impl rule__MemberSpecification__Group__1 )
            // InternalMdxParser.g:2719:2: rule__MemberSpecification__Group__0__Impl rule__MemberSpecification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MemberSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__0"


    // $ANTLR start "rule__MemberSpecification__Group__0__Impl"
    // InternalMdxParser.g:2726:1: rule__MemberSpecification__Group__0__Impl : ( MEMBER ) ;
    public final void rule__MemberSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2730:1: ( ( MEMBER ) )
            // InternalMdxParser.g:2731:1: ( MEMBER )
            {
            // InternalMdxParser.g:2731:1: ( MEMBER )
            // InternalMdxParser.g:2732:2: MEMBER
            {
             before(grammarAccess.getMemberSpecificationAccess().getMEMBERKeyword_0()); 
            match(input,MEMBER,FOLLOW_2); 
             after(grammarAccess.getMemberSpecificationAccess().getMEMBERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__0__Impl"


    // $ANTLR start "rule__MemberSpecification__Group__1"
    // InternalMdxParser.g:2741:1: rule__MemberSpecification__Group__1 : rule__MemberSpecification__Group__1__Impl rule__MemberSpecification__Group__2 ;
    public final void rule__MemberSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2745:1: ( rule__MemberSpecification__Group__1__Impl rule__MemberSpecification__Group__2 )
            // InternalMdxParser.g:2746:2: rule__MemberSpecification__Group__1__Impl rule__MemberSpecification__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MemberSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__1"


    // $ANTLR start "rule__MemberSpecification__Group__1__Impl"
    // InternalMdxParser.g:2753:1: rule__MemberSpecification__Group__1__Impl : ( ruleMemberName ) ;
    public final void rule__MemberSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2757:1: ( ( ruleMemberName ) )
            // InternalMdxParser.g:2758:1: ( ruleMemberName )
            {
            // InternalMdxParser.g:2758:1: ( ruleMemberName )
            // InternalMdxParser.g:2759:2: ruleMemberName
            {
             before(grammarAccess.getMemberSpecificationAccess().getMemberNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleMemberName();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationAccess().getMemberNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__1__Impl"


    // $ANTLR start "rule__MemberSpecification__Group__2"
    // InternalMdxParser.g:2768:1: rule__MemberSpecification__Group__2 : rule__MemberSpecification__Group__2__Impl rule__MemberSpecification__Group__3 ;
    public final void rule__MemberSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2772:1: ( rule__MemberSpecification__Group__2__Impl rule__MemberSpecification__Group__3 )
            // InternalMdxParser.g:2773:2: rule__MemberSpecification__Group__2__Impl rule__MemberSpecification__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MemberSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__2"


    // $ANTLR start "rule__MemberSpecification__Group__2__Impl"
    // InternalMdxParser.g:2780:1: rule__MemberSpecification__Group__2__Impl : ( AS ) ;
    public final void rule__MemberSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2784:1: ( ( AS ) )
            // InternalMdxParser.g:2785:1: ( AS )
            {
            // InternalMdxParser.g:2785:1: ( AS )
            // InternalMdxParser.g:2786:2: AS
            {
             before(grammarAccess.getMemberSpecificationAccess().getASKeyword_2()); 
            match(input,AS,FOLLOW_2); 
             after(grammarAccess.getMemberSpecificationAccess().getASKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__2__Impl"


    // $ANTLR start "rule__MemberSpecification__Group__3"
    // InternalMdxParser.g:2795:1: rule__MemberSpecification__Group__3 : rule__MemberSpecification__Group__3__Impl ;
    public final void rule__MemberSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2799:1: ( rule__MemberSpecification__Group__3__Impl )
            // InternalMdxParser.g:2800:2: rule__MemberSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__3"


    // $ANTLR start "rule__MemberSpecification__Group__3__Impl"
    // InternalMdxParser.g:2806:1: rule__MemberSpecification__Group__3__Impl : ( ( rule__MemberSpecification__Group_3__0 ) ) ;
    public final void rule__MemberSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2810:1: ( ( ( rule__MemberSpecification__Group_3__0 ) ) )
            // InternalMdxParser.g:2811:1: ( ( rule__MemberSpecification__Group_3__0 ) )
            {
            // InternalMdxParser.g:2811:1: ( ( rule__MemberSpecification__Group_3__0 ) )
            // InternalMdxParser.g:2812:2: ( rule__MemberSpecification__Group_3__0 )
            {
             before(grammarAccess.getMemberSpecificationAccess().getGroup_3()); 
            // InternalMdxParser.g:2813:2: ( rule__MemberSpecification__Group_3__0 )
            // InternalMdxParser.g:2813:3: rule__MemberSpecification__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSpecificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group__3__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3__0"
    // InternalMdxParser.g:2822:1: rule__MemberSpecification__Group_3__0 : rule__MemberSpecification__Group_3__0__Impl rule__MemberSpecification__Group_3__1 ;
    public final void rule__MemberSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2826:1: ( rule__MemberSpecification__Group_3__0__Impl rule__MemberSpecification__Group_3__1 )
            // InternalMdxParser.g:2827:2: rule__MemberSpecification__Group_3__0__Impl rule__MemberSpecification__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__MemberSpecification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__0"


    // $ANTLR start "rule__MemberSpecification__Group_3__0__Impl"
    // InternalMdxParser.g:2834:1: rule__MemberSpecification__Group_3__0__Impl : ( ( rule__MemberSpecification__Alternatives_3_0 ) ) ;
    public final void rule__MemberSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2838:1: ( ( ( rule__MemberSpecification__Alternatives_3_0 ) ) )
            // InternalMdxParser.g:2839:1: ( ( rule__MemberSpecification__Alternatives_3_0 ) )
            {
            // InternalMdxParser.g:2839:1: ( ( rule__MemberSpecification__Alternatives_3_0 ) )
            // InternalMdxParser.g:2840:2: ( rule__MemberSpecification__Alternatives_3_0 )
            {
             before(grammarAccess.getMemberSpecificationAccess().getAlternatives_3_0()); 
            // InternalMdxParser.g:2841:2: ( rule__MemberSpecification__Alternatives_3_0 )
            // InternalMdxParser.g:2841:3: rule__MemberSpecification__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSpecificationAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__0__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3__1"
    // InternalMdxParser.g:2849:1: rule__MemberSpecification__Group_3__1 : rule__MemberSpecification__Group_3__1__Impl rule__MemberSpecification__Group_3__2 ;
    public final void rule__MemberSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2853:1: ( rule__MemberSpecification__Group_3__1__Impl rule__MemberSpecification__Group_3__2 )
            // InternalMdxParser.g:2854:2: rule__MemberSpecification__Group_3__1__Impl rule__MemberSpecification__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__MemberSpecification__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__1"


    // $ANTLR start "rule__MemberSpecification__Group_3__1__Impl"
    // InternalMdxParser.g:2861:1: rule__MemberSpecification__Group_3__1__Impl : ( ruleCOMMA ) ;
    public final void rule__MemberSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2865:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:2866:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:2866:1: ( ruleCOMMA )
            // InternalMdxParser.g:2867:2: ruleCOMMA
            {
             before(grammarAccess.getMemberSpecificationAccess().getCOMMAParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationAccess().getCOMMAParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__1__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3__2"
    // InternalMdxParser.g:2876:1: rule__MemberSpecification__Group_3__2 : rule__MemberSpecification__Group_3__2__Impl ;
    public final void rule__MemberSpecification__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2880:1: ( rule__MemberSpecification__Group_3__2__Impl )
            // InternalMdxParser.g:2881:2: rule__MemberSpecification__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__2"


    // $ANTLR start "rule__MemberSpecification__Group_3__2__Impl"
    // InternalMdxParser.g:2887:1: rule__MemberSpecification__Group_3__2__Impl : ( ( ruleMemberPropertyDefList )? ) ;
    public final void rule__MemberSpecification__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2891:1: ( ( ( ruleMemberPropertyDefList )? ) )
            // InternalMdxParser.g:2892:1: ( ( ruleMemberPropertyDefList )? )
            {
            // InternalMdxParser.g:2892:1: ( ( ruleMemberPropertyDefList )? )
            // InternalMdxParser.g:2893:2: ( ruleMemberPropertyDefList )?
            {
             before(grammarAccess.getMemberSpecificationAccess().getMemberPropertyDefListParserRuleCall_3_2()); 
            // InternalMdxParser.g:2894:2: ( ruleMemberPropertyDefList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=PROPERTIES && LA22_0<=DIMENSION)||LA22_0==RULE_ID||LA22_0==RULE_QUOTED_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMdxParser.g:2894:3: ruleMemberPropertyDefList
                    {
                    pushFollow(FOLLOW_2);
                    ruleMemberPropertyDefList();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberSpecificationAccess().getMemberPropertyDefListParserRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3__2__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__0"
    // InternalMdxParser.g:2903:1: rule__MemberSpecification__Group_3_0_0__0 : rule__MemberSpecification__Group_3_0_0__0__Impl rule__MemberSpecification__Group_3_0_0__1 ;
    public final void rule__MemberSpecification__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2907:1: ( rule__MemberSpecification__Group_3_0_0__0__Impl rule__MemberSpecification__Group_3_0_0__1 )
            // InternalMdxParser.g:2908:2: rule__MemberSpecification__Group_3_0_0__0__Impl rule__MemberSpecification__Group_3_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__MemberSpecification__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__0"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__0__Impl"
    // InternalMdxParser.g:2915:1: rule__MemberSpecification__Group_3_0_0__0__Impl : ( ruleQUOTE ) ;
    public final void rule__MemberSpecification__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2919:1: ( ( ruleQUOTE ) )
            // InternalMdxParser.g:2920:1: ( ruleQUOTE )
            {
            // InternalMdxParser.g:2920:1: ( ruleQUOTE )
            // InternalMdxParser.g:2921:2: ruleQUOTE
            {
             before(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQUOTE();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__1"
    // InternalMdxParser.g:2930:1: rule__MemberSpecification__Group_3_0_0__1 : rule__MemberSpecification__Group_3_0_0__1__Impl rule__MemberSpecification__Group_3_0_0__2 ;
    public final void rule__MemberSpecification__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2934:1: ( rule__MemberSpecification__Group_3_0_0__1__Impl rule__MemberSpecification__Group_3_0_0__2 )
            // InternalMdxParser.g:2935:2: rule__MemberSpecification__Group_3_0_0__1__Impl rule__MemberSpecification__Group_3_0_0__2
            {
            pushFollow(FOLLOW_12);
            rule__MemberSpecification__Group_3_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__1"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__1__Impl"
    // InternalMdxParser.g:2942:1: rule__MemberSpecification__Group_3_0_0__1__Impl : ( ruleValueExpression ) ;
    public final void rule__MemberSpecification__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2946:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:2947:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:2947:1: ( ruleValueExpression )
            // InternalMdxParser.g:2948:2: ruleValueExpression
            {
             before(grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__2"
    // InternalMdxParser.g:2957:1: rule__MemberSpecification__Group_3_0_0__2 : rule__MemberSpecification__Group_3_0_0__2__Impl ;
    public final void rule__MemberSpecification__Group_3_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2961:1: ( rule__MemberSpecification__Group_3_0_0__2__Impl )
            // InternalMdxParser.g:2962:2: rule__MemberSpecification__Group_3_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSpecification__Group_3_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__2"


    // $ANTLR start "rule__MemberSpecification__Group_3_0_0__2__Impl"
    // InternalMdxParser.g:2968:1: rule__MemberSpecification__Group_3_0_0__2__Impl : ( ruleQUOTE ) ;
    public final void rule__MemberSpecification__Group_3_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2972:1: ( ( ruleQUOTE ) )
            // InternalMdxParser.g:2973:1: ( ruleQUOTE )
            {
            // InternalMdxParser.g:2973:1: ( ruleQUOTE )
            // InternalMdxParser.g:2974:2: ruleQUOTE
            {
             before(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_2()); 
            pushFollow(FOLLOW_2);
            ruleQUOTE();

            state._fsp--;

             after(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSpecification__Group_3_0_0__2__Impl"


    // $ANTLR start "rule__AxisSpecificationList__Group__0"
    // InternalMdxParser.g:2984:1: rule__AxisSpecificationList__Group__0 : rule__AxisSpecificationList__Group__0__Impl rule__AxisSpecificationList__Group__1 ;
    public final void rule__AxisSpecificationList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:2988:1: ( rule__AxisSpecificationList__Group__0__Impl rule__AxisSpecificationList__Group__1 )
            // InternalMdxParser.g:2989:2: rule__AxisSpecificationList__Group__0__Impl rule__AxisSpecificationList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AxisSpecificationList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecificationList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group__0"


    // $ANTLR start "rule__AxisSpecificationList__Group__0__Impl"
    // InternalMdxParser.g:2996:1: rule__AxisSpecificationList__Group__0__Impl : ( ruleAxisSpecification ) ;
    public final void rule__AxisSpecificationList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3000:1: ( ( ruleAxisSpecification ) )
            // InternalMdxParser.g:3001:1: ( ruleAxisSpecification )
            {
            // InternalMdxParser.g:3001:1: ( ruleAxisSpecification )
            // InternalMdxParser.g:3002:2: ruleAxisSpecification
            {
             before(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisSpecification();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group__0__Impl"


    // $ANTLR start "rule__AxisSpecificationList__Group__1"
    // InternalMdxParser.g:3011:1: rule__AxisSpecificationList__Group__1 : rule__AxisSpecificationList__Group__1__Impl ;
    public final void rule__AxisSpecificationList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3015:1: ( rule__AxisSpecificationList__Group__1__Impl )
            // InternalMdxParser.g:3016:2: rule__AxisSpecificationList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecificationList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group__1"


    // $ANTLR start "rule__AxisSpecificationList__Group__1__Impl"
    // InternalMdxParser.g:3022:1: rule__AxisSpecificationList__Group__1__Impl : ( ( rule__AxisSpecificationList__Group_1__0 )* ) ;
    public final void rule__AxisSpecificationList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3026:1: ( ( ( rule__AxisSpecificationList__Group_1__0 )* ) )
            // InternalMdxParser.g:3027:1: ( ( rule__AxisSpecificationList__Group_1__0 )* )
            {
            // InternalMdxParser.g:3027:1: ( ( rule__AxisSpecificationList__Group_1__0 )* )
            // InternalMdxParser.g:3028:2: ( rule__AxisSpecificationList__Group_1__0 )*
            {
             before(grammarAccess.getAxisSpecificationListAccess().getGroup_1()); 
            // InternalMdxParser.g:3029:2: ( rule__AxisSpecificationList__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMdxParser.g:3029:3: rule__AxisSpecificationList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AxisSpecificationList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAxisSpecificationListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group__1__Impl"


    // $ANTLR start "rule__AxisSpecificationList__Group_1__0"
    // InternalMdxParser.g:3038:1: rule__AxisSpecificationList__Group_1__0 : rule__AxisSpecificationList__Group_1__0__Impl rule__AxisSpecificationList__Group_1__1 ;
    public final void rule__AxisSpecificationList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3042:1: ( rule__AxisSpecificationList__Group_1__0__Impl rule__AxisSpecificationList__Group_1__1 )
            // InternalMdxParser.g:3043:2: rule__AxisSpecificationList__Group_1__0__Impl rule__AxisSpecificationList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__AxisSpecificationList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecificationList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group_1__0"


    // $ANTLR start "rule__AxisSpecificationList__Group_1__0__Impl"
    // InternalMdxParser.g:3050:1: rule__AxisSpecificationList__Group_1__0__Impl : ( ruleCOMMA ) ;
    public final void rule__AxisSpecificationList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3054:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:3055:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:3055:1: ( ruleCOMMA )
            // InternalMdxParser.g:3056:2: ruleCOMMA
            {
             before(grammarAccess.getAxisSpecificationListAccess().getCOMMAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationListAccess().getCOMMAParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group_1__0__Impl"


    // $ANTLR start "rule__AxisSpecificationList__Group_1__1"
    // InternalMdxParser.g:3065:1: rule__AxisSpecificationList__Group_1__1 : rule__AxisSpecificationList__Group_1__1__Impl ;
    public final void rule__AxisSpecificationList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3069:1: ( rule__AxisSpecificationList__Group_1__1__Impl )
            // InternalMdxParser.g:3070:2: rule__AxisSpecificationList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecificationList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group_1__1"


    // $ANTLR start "rule__AxisSpecificationList__Group_1__1__Impl"
    // InternalMdxParser.g:3076:1: rule__AxisSpecificationList__Group_1__1__Impl : ( ruleAxisSpecification ) ;
    public final void rule__AxisSpecificationList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3080:1: ( ( ruleAxisSpecification ) )
            // InternalMdxParser.g:3081:1: ( ruleAxisSpecification )
            {
            // InternalMdxParser.g:3081:1: ( ruleAxisSpecification )
            // InternalMdxParser.g:3082:2: ruleAxisSpecification
            {
             before(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAxisSpecification();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecificationList__Group_1__1__Impl"


    // $ANTLR start "rule__MemberPropertyDefList__Group__0"
    // InternalMdxParser.g:3092:1: rule__MemberPropertyDefList__Group__0 : rule__MemberPropertyDefList__Group__0__Impl rule__MemberPropertyDefList__Group__1 ;
    public final void rule__MemberPropertyDefList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3096:1: ( rule__MemberPropertyDefList__Group__0__Impl rule__MemberPropertyDefList__Group__1 )
            // InternalMdxParser.g:3097:2: rule__MemberPropertyDefList__Group__0__Impl rule__MemberPropertyDefList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MemberPropertyDefList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group__0"


    // $ANTLR start "rule__MemberPropertyDefList__Group__0__Impl"
    // InternalMdxParser.g:3104:1: rule__MemberPropertyDefList__Group__0__Impl : ( ruleMemberPropertyDefinition ) ;
    public final void rule__MemberPropertyDefList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3108:1: ( ( ruleMemberPropertyDefinition ) )
            // InternalMdxParser.g:3109:1: ( ruleMemberPropertyDefinition )
            {
            // InternalMdxParser.g:3109:1: ( ruleMemberPropertyDefinition )
            // InternalMdxParser.g:3110:2: ruleMemberPropertyDefinition
            {
             before(grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberPropertyDefinition();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group__0__Impl"


    // $ANTLR start "rule__MemberPropertyDefList__Group__1"
    // InternalMdxParser.g:3119:1: rule__MemberPropertyDefList__Group__1 : rule__MemberPropertyDefList__Group__1__Impl ;
    public final void rule__MemberPropertyDefList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3123:1: ( rule__MemberPropertyDefList__Group__1__Impl )
            // InternalMdxParser.g:3124:2: rule__MemberPropertyDefList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group__1"


    // $ANTLR start "rule__MemberPropertyDefList__Group__1__Impl"
    // InternalMdxParser.g:3130:1: rule__MemberPropertyDefList__Group__1__Impl : ( ( rule__MemberPropertyDefList__Group_1__0 )* ) ;
    public final void rule__MemberPropertyDefList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3134:1: ( ( ( rule__MemberPropertyDefList__Group_1__0 )* ) )
            // InternalMdxParser.g:3135:1: ( ( rule__MemberPropertyDefList__Group_1__0 )* )
            {
            // InternalMdxParser.g:3135:1: ( ( rule__MemberPropertyDefList__Group_1__0 )* )
            // InternalMdxParser.g:3136:2: ( rule__MemberPropertyDefList__Group_1__0 )*
            {
             before(grammarAccess.getMemberPropertyDefListAccess().getGroup_1()); 
            // InternalMdxParser.g:3137:2: ( rule__MemberPropertyDefList__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMdxParser.g:3137:3: rule__MemberPropertyDefList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MemberPropertyDefList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMemberPropertyDefListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group__1__Impl"


    // $ANTLR start "rule__MemberPropertyDefList__Group_1__0"
    // InternalMdxParser.g:3146:1: rule__MemberPropertyDefList__Group_1__0 : rule__MemberPropertyDefList__Group_1__0__Impl rule__MemberPropertyDefList__Group_1__1 ;
    public final void rule__MemberPropertyDefList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3150:1: ( rule__MemberPropertyDefList__Group_1__0__Impl rule__MemberPropertyDefList__Group_1__1 )
            // InternalMdxParser.g:3151:2: rule__MemberPropertyDefList__Group_1__0__Impl rule__MemberPropertyDefList__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MemberPropertyDefList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group_1__0"


    // $ANTLR start "rule__MemberPropertyDefList__Group_1__0__Impl"
    // InternalMdxParser.g:3158:1: rule__MemberPropertyDefList__Group_1__0__Impl : ( ruleCOMMA ) ;
    public final void rule__MemberPropertyDefList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3162:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:3163:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:3163:1: ( ruleCOMMA )
            // InternalMdxParser.g:3164:2: ruleCOMMA
            {
             before(grammarAccess.getMemberPropertyDefListAccess().getCOMMAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefListAccess().getCOMMAParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group_1__0__Impl"


    // $ANTLR start "rule__MemberPropertyDefList__Group_1__1"
    // InternalMdxParser.g:3173:1: rule__MemberPropertyDefList__Group_1__1 : rule__MemberPropertyDefList__Group_1__1__Impl ;
    public final void rule__MemberPropertyDefList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3177:1: ( rule__MemberPropertyDefList__Group_1__1__Impl )
            // InternalMdxParser.g:3178:2: rule__MemberPropertyDefList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group_1__1"


    // $ANTLR start "rule__MemberPropertyDefList__Group_1__1__Impl"
    // InternalMdxParser.g:3184:1: rule__MemberPropertyDefList__Group_1__1__Impl : ( ruleMemberPropertyDefinition ) ;
    public final void rule__MemberPropertyDefList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3188:1: ( ( ruleMemberPropertyDefinition ) )
            // InternalMdxParser.g:3189:1: ( ruleMemberPropertyDefinition )
            {
            // InternalMdxParser.g:3189:1: ( ruleMemberPropertyDefinition )
            // InternalMdxParser.g:3190:2: ruleMemberPropertyDefinition
            {
             before(grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleMemberPropertyDefinition();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefList__Group_1__1__Impl"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__0"
    // InternalMdxParser.g:3200:1: rule__MemberPropertyDefinition__Group__0 : rule__MemberPropertyDefinition__Group__0__Impl rule__MemberPropertyDefinition__Group__1 ;
    public final void rule__MemberPropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3204:1: ( rule__MemberPropertyDefinition__Group__0__Impl rule__MemberPropertyDefinition__Group__1 )
            // InternalMdxParser.g:3205:2: rule__MemberPropertyDefinition__Group__0__Impl rule__MemberPropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MemberPropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__0"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__0__Impl"
    // InternalMdxParser.g:3212:1: rule__MemberPropertyDefinition__Group__0__Impl : ( ruleIdentifier ) ;
    public final void rule__MemberPropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3216:1: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:3217:1: ( ruleIdentifier )
            {
            // InternalMdxParser.g:3217:1: ( ruleIdentifier )
            // InternalMdxParser.g:3218:2: ruleIdentifier
            {
             before(grammarAccess.getMemberPropertyDefinitionAccess().getIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefinitionAccess().getIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__1"
    // InternalMdxParser.g:3227:1: rule__MemberPropertyDefinition__Group__1 : rule__MemberPropertyDefinition__Group__1__Impl rule__MemberPropertyDefinition__Group__2 ;
    public final void rule__MemberPropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3231:1: ( rule__MemberPropertyDefinition__Group__1__Impl rule__MemberPropertyDefinition__Group__2 )
            // InternalMdxParser.g:3232:2: rule__MemberPropertyDefinition__Group__1__Impl rule__MemberPropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MemberPropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__1"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__1__Impl"
    // InternalMdxParser.g:3239:1: rule__MemberPropertyDefinition__Group__1__Impl : ( ruleEQ ) ;
    public final void rule__MemberPropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3243:1: ( ( ruleEQ ) )
            // InternalMdxParser.g:3244:1: ( ruleEQ )
            {
            // InternalMdxParser.g:3244:1: ( ruleEQ )
            // InternalMdxParser.g:3245:2: ruleEQ
            {
             before(grammarAccess.getMemberPropertyDefinitionAccess().getEQParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEQ();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefinitionAccess().getEQParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__2"
    // InternalMdxParser.g:3254:1: rule__MemberPropertyDefinition__Group__2 : rule__MemberPropertyDefinition__Group__2__Impl ;
    public final void rule__MemberPropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3258:1: ( rule__MemberPropertyDefinition__Group__2__Impl )
            // InternalMdxParser.g:3259:2: rule__MemberPropertyDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberPropertyDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__2"


    // $ANTLR start "rule__MemberPropertyDefinition__Group__2__Impl"
    // InternalMdxParser.g:3265:1: rule__MemberPropertyDefinition__Group__2__Impl : ( ruleValueExpression ) ;
    public final void rule__MemberPropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3269:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:3270:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:3270:1: ( ruleValueExpression )
            // InternalMdxParser.g:3271:2: ruleValueExpression
            {
             before(grammarAccess.getMemberPropertyDefinitionAccess().getValueExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getMemberPropertyDefinitionAccess().getValueExpressionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberPropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__CompoundId__Group__0"
    // InternalMdxParser.g:3281:1: rule__CompoundId__Group__0 : rule__CompoundId__Group__0__Impl rule__CompoundId__Group__1 ;
    public final void rule__CompoundId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3285:1: ( rule__CompoundId__Group__0__Impl rule__CompoundId__Group__1 )
            // InternalMdxParser.g:3286:2: rule__CompoundId__Group__0__Impl rule__CompoundId__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CompoundId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundId__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group__0"


    // $ANTLR start "rule__CompoundId__Group__0__Impl"
    // InternalMdxParser.g:3293:1: rule__CompoundId__Group__0__Impl : ( ruleIdentifier ) ;
    public final void rule__CompoundId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3297:1: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:3298:1: ( ruleIdentifier )
            {
            // InternalMdxParser.g:3298:1: ( ruleIdentifier )
            // InternalMdxParser.g:3299:2: ruleIdentifier
            {
             before(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group__0__Impl"


    // $ANTLR start "rule__CompoundId__Group__1"
    // InternalMdxParser.g:3308:1: rule__CompoundId__Group__1 : rule__CompoundId__Group__1__Impl ;
    public final void rule__CompoundId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3312:1: ( rule__CompoundId__Group__1__Impl )
            // InternalMdxParser.g:3313:2: rule__CompoundId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundId__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group__1"


    // $ANTLR start "rule__CompoundId__Group__1__Impl"
    // InternalMdxParser.g:3319:1: rule__CompoundId__Group__1__Impl : ( ( rule__CompoundId__Group_1__0 )* ) ;
    public final void rule__CompoundId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3323:1: ( ( ( rule__CompoundId__Group_1__0 )* ) )
            // InternalMdxParser.g:3324:1: ( ( rule__CompoundId__Group_1__0 )* )
            {
            // InternalMdxParser.g:3324:1: ( ( rule__CompoundId__Group_1__0 )* )
            // InternalMdxParser.g:3325:2: ( rule__CompoundId__Group_1__0 )*
            {
             before(grammarAccess.getCompoundIdAccess().getGroup_1()); 
            // InternalMdxParser.g:3326:2: ( rule__CompoundId__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==FullStop) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMdxParser.g:3326:3: rule__CompoundId__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CompoundId__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCompoundIdAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group__1__Impl"


    // $ANTLR start "rule__CompoundId__Group_1__0"
    // InternalMdxParser.g:3335:1: rule__CompoundId__Group_1__0 : rule__CompoundId__Group_1__0__Impl rule__CompoundId__Group_1__1 ;
    public final void rule__CompoundId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3339:1: ( rule__CompoundId__Group_1__0__Impl rule__CompoundId__Group_1__1 )
            // InternalMdxParser.g:3340:2: rule__CompoundId__Group_1__0__Impl rule__CompoundId__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CompoundId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundId__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group_1__0"


    // $ANTLR start "rule__CompoundId__Group_1__0__Impl"
    // InternalMdxParser.g:3347:1: rule__CompoundId__Group_1__0__Impl : ( ruleDOT ) ;
    public final void rule__CompoundId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3351:1: ( ( ruleDOT ) )
            // InternalMdxParser.g:3352:1: ( ruleDOT )
            {
            // InternalMdxParser.g:3352:1: ( ruleDOT )
            // InternalMdxParser.g:3353:2: ruleDOT
            {
             before(grammarAccess.getCompoundIdAccess().getDOTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOT();

            state._fsp--;

             after(grammarAccess.getCompoundIdAccess().getDOTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group_1__0__Impl"


    // $ANTLR start "rule__CompoundId__Group_1__1"
    // InternalMdxParser.g:3362:1: rule__CompoundId__Group_1__1 : rule__CompoundId__Group_1__1__Impl ;
    public final void rule__CompoundId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3366:1: ( rule__CompoundId__Group_1__1__Impl )
            // InternalMdxParser.g:3367:2: rule__CompoundId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundId__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group_1__1"


    // $ANTLR start "rule__CompoundId__Group_1__1__Impl"
    // InternalMdxParser.g:3373:1: rule__CompoundId__Group_1__1__Impl : ( ruleIdentifier ) ;
    public final void rule__CompoundId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3377:1: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:3378:1: ( ruleIdentifier )
            {
            // InternalMdxParser.g:3378:1: ( ruleIdentifier )
            // InternalMdxParser.g:3379:2: ruleIdentifier
            {
             before(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundId__Group_1__1__Impl"


    // $ANTLR start "rule__AxisSpecification__Group__0"
    // InternalMdxParser.g:3389:1: rule__AxisSpecification__Group__0 : rule__AxisSpecification__Group__0__Impl rule__AxisSpecification__Group__1 ;
    public final void rule__AxisSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3393:1: ( rule__AxisSpecification__Group__0__Impl rule__AxisSpecification__Group__1 )
            // InternalMdxParser.g:3394:2: rule__AxisSpecification__Group__0__Impl rule__AxisSpecification__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AxisSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__0"


    // $ANTLR start "rule__AxisSpecification__Group__0__Impl"
    // InternalMdxParser.g:3401:1: rule__AxisSpecification__Group__0__Impl : ( ( rule__AxisSpecification__Group_0__0 )? ) ;
    public final void rule__AxisSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3405:1: ( ( ( rule__AxisSpecification__Group_0__0 )? ) )
            // InternalMdxParser.g:3406:1: ( ( rule__AxisSpecification__Group_0__0 )? )
            {
            // InternalMdxParser.g:3406:1: ( ( rule__AxisSpecification__Group_0__0 )? )
            // InternalMdxParser.g:3407:2: ( rule__AxisSpecification__Group_0__0 )?
            {
             before(grammarAccess.getAxisSpecificationAccess().getGroup_0()); 
            // InternalMdxParser.g:3408:2: ( rule__AxisSpecification__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMdxParser.g:3408:3: rule__AxisSpecification__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AxisSpecification__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisSpecificationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__0__Impl"


    // $ANTLR start "rule__AxisSpecification__Group__1"
    // InternalMdxParser.g:3416:1: rule__AxisSpecification__Group__1 : rule__AxisSpecification__Group__1__Impl rule__AxisSpecification__Group__2 ;
    public final void rule__AxisSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3420:1: ( rule__AxisSpecification__Group__1__Impl rule__AxisSpecification__Group__2 )
            // InternalMdxParser.g:3421:2: rule__AxisSpecification__Group__1__Impl rule__AxisSpecification__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__AxisSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__1"


    // $ANTLR start "rule__AxisSpecification__Group__1__Impl"
    // InternalMdxParser.g:3428:1: rule__AxisSpecification__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__AxisSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3432:1: ( ( ruleExpression ) )
            // InternalMdxParser.g:3433:1: ( ruleExpression )
            {
            // InternalMdxParser.g:3433:1: ( ruleExpression )
            // InternalMdxParser.g:3434:2: ruleExpression
            {
             before(grammarAccess.getAxisSpecificationAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationAccess().getExpressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__1__Impl"


    // $ANTLR start "rule__AxisSpecification__Group__2"
    // InternalMdxParser.g:3443:1: rule__AxisSpecification__Group__2 : rule__AxisSpecification__Group__2__Impl rule__AxisSpecification__Group__3 ;
    public final void rule__AxisSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3447:1: ( rule__AxisSpecification__Group__2__Impl rule__AxisSpecification__Group__3 )
            // InternalMdxParser.g:3448:2: rule__AxisSpecification__Group__2__Impl rule__AxisSpecification__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AxisSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__2"


    // $ANTLR start "rule__AxisSpecification__Group__2__Impl"
    // InternalMdxParser.g:3455:1: rule__AxisSpecification__Group__2__Impl : ( ( ruleDimProperties )? ) ;
    public final void rule__AxisSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3459:1: ( ( ( ruleDimProperties )? ) )
            // InternalMdxParser.g:3460:1: ( ( ruleDimProperties )? )
            {
            // InternalMdxParser.g:3460:1: ( ( ruleDimProperties )? )
            // InternalMdxParser.g:3461:2: ( ruleDimProperties )?
            {
             before(grammarAccess.getAxisSpecificationAccess().getDimPropertiesParserRuleCall_2()); 
            // InternalMdxParser.g:3462:2: ( ruleDimProperties )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=PROPERTIES && LA27_0<=DIMENSION)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMdxParser.g:3462:3: ruleDimProperties
                    {
                    pushFollow(FOLLOW_2);
                    ruleDimProperties();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisSpecificationAccess().getDimPropertiesParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__2__Impl"


    // $ANTLR start "rule__AxisSpecification__Group__3"
    // InternalMdxParser.g:3470:1: rule__AxisSpecification__Group__3 : rule__AxisSpecification__Group__3__Impl rule__AxisSpecification__Group__4 ;
    public final void rule__AxisSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3474:1: ( rule__AxisSpecification__Group__3__Impl rule__AxisSpecification__Group__4 )
            // InternalMdxParser.g:3475:2: rule__AxisSpecification__Group__3__Impl rule__AxisSpecification__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AxisSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__3"


    // $ANTLR start "rule__AxisSpecification__Group__3__Impl"
    // InternalMdxParser.g:3482:1: rule__AxisSpecification__Group__3__Impl : ( ON ) ;
    public final void rule__AxisSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3486:1: ( ( ON ) )
            // InternalMdxParser.g:3487:1: ( ON )
            {
            // InternalMdxParser.g:3487:1: ( ON )
            // InternalMdxParser.g:3488:2: ON
            {
             before(grammarAccess.getAxisSpecificationAccess().getONKeyword_3()); 
            match(input,ON,FOLLOW_2); 
             after(grammarAccess.getAxisSpecificationAccess().getONKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__3__Impl"


    // $ANTLR start "rule__AxisSpecification__Group__4"
    // InternalMdxParser.g:3497:1: rule__AxisSpecification__Group__4 : rule__AxisSpecification__Group__4__Impl ;
    public final void rule__AxisSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3501:1: ( rule__AxisSpecification__Group__4__Impl )
            // InternalMdxParser.g:3502:2: rule__AxisSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__4"


    // $ANTLR start "rule__AxisSpecification__Group__4__Impl"
    // InternalMdxParser.g:3508:1: rule__AxisSpecification__Group__4__Impl : ( ruleAxisName ) ;
    public final void rule__AxisSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3512:1: ( ( ruleAxisName ) )
            // InternalMdxParser.g:3513:1: ( ruleAxisName )
            {
            // InternalMdxParser.g:3513:1: ( ruleAxisName )
            // InternalMdxParser.g:3514:2: ruleAxisName
            {
             before(grammarAccess.getAxisSpecificationAccess().getAxisNameParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleAxisName();

            state._fsp--;

             after(grammarAccess.getAxisSpecificationAccess().getAxisNameParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group__4__Impl"


    // $ANTLR start "rule__AxisSpecification__Group_0__0"
    // InternalMdxParser.g:3524:1: rule__AxisSpecification__Group_0__0 : rule__AxisSpecification__Group_0__0__Impl rule__AxisSpecification__Group_0__1 ;
    public final void rule__AxisSpecification__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3528:1: ( rule__AxisSpecification__Group_0__0__Impl rule__AxisSpecification__Group_0__1 )
            // InternalMdxParser.g:3529:2: rule__AxisSpecification__Group_0__0__Impl rule__AxisSpecification__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__AxisSpecification__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group_0__0"


    // $ANTLR start "rule__AxisSpecification__Group_0__0__Impl"
    // InternalMdxParser.g:3536:1: rule__AxisSpecification__Group_0__0__Impl : ( NON ) ;
    public final void rule__AxisSpecification__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3540:1: ( ( NON ) )
            // InternalMdxParser.g:3541:1: ( NON )
            {
            // InternalMdxParser.g:3541:1: ( NON )
            // InternalMdxParser.g:3542:2: NON
            {
             before(grammarAccess.getAxisSpecificationAccess().getNONKeyword_0_0()); 
            match(input,NON,FOLLOW_2); 
             after(grammarAccess.getAxisSpecificationAccess().getNONKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group_0__0__Impl"


    // $ANTLR start "rule__AxisSpecification__Group_0__1"
    // InternalMdxParser.g:3551:1: rule__AxisSpecification__Group_0__1 : rule__AxisSpecification__Group_0__1__Impl ;
    public final void rule__AxisSpecification__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3555:1: ( rule__AxisSpecification__Group_0__1__Impl )
            // InternalMdxParser.g:3556:2: rule__AxisSpecification__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AxisSpecification__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group_0__1"


    // $ANTLR start "rule__AxisSpecification__Group_0__1__Impl"
    // InternalMdxParser.g:3562:1: rule__AxisSpecification__Group_0__1__Impl : ( EMPTY ) ;
    public final void rule__AxisSpecification__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3566:1: ( ( EMPTY ) )
            // InternalMdxParser.g:3567:1: ( EMPTY )
            {
            // InternalMdxParser.g:3567:1: ( EMPTY )
            // InternalMdxParser.g:3568:2: EMPTY
            {
             before(grammarAccess.getAxisSpecificationAccess().getEMPTYKeyword_0_1()); 
            match(input,EMPTY,FOLLOW_2); 
             after(grammarAccess.getAxisSpecificationAccess().getEMPTYKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AxisSpecification__Group_0__1__Impl"


    // $ANTLR start "rule__DimProperties__Group__0"
    // InternalMdxParser.g:3578:1: rule__DimProperties__Group__0 : rule__DimProperties__Group__0__Impl rule__DimProperties__Group__1 ;
    public final void rule__DimProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3582:1: ( rule__DimProperties__Group__0__Impl rule__DimProperties__Group__1 )
            // InternalMdxParser.g:3583:2: rule__DimProperties__Group__0__Impl rule__DimProperties__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DimProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__0"


    // $ANTLR start "rule__DimProperties__Group__0__Impl"
    // InternalMdxParser.g:3590:1: rule__DimProperties__Group__0__Impl : ( ( DIMENSION )? ) ;
    public final void rule__DimProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3594:1: ( ( ( DIMENSION )? ) )
            // InternalMdxParser.g:3595:1: ( ( DIMENSION )? )
            {
            // InternalMdxParser.g:3595:1: ( ( DIMENSION )? )
            // InternalMdxParser.g:3596:2: ( DIMENSION )?
            {
             before(grammarAccess.getDimPropertiesAccess().getDIMENSIONKeyword_0()); 
            // InternalMdxParser.g:3597:2: ( DIMENSION )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DIMENSION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMdxParser.g:3597:3: DIMENSION
                    {
                    match(input,DIMENSION,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDimPropertiesAccess().getDIMENSIONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__0__Impl"


    // $ANTLR start "rule__DimProperties__Group__1"
    // InternalMdxParser.g:3605:1: rule__DimProperties__Group__1 : rule__DimProperties__Group__1__Impl rule__DimProperties__Group__2 ;
    public final void rule__DimProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3609:1: ( rule__DimProperties__Group__1__Impl rule__DimProperties__Group__2 )
            // InternalMdxParser.g:3610:2: rule__DimProperties__Group__1__Impl rule__DimProperties__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DimProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__1"


    // $ANTLR start "rule__DimProperties__Group__1__Impl"
    // InternalMdxParser.g:3617:1: rule__DimProperties__Group__1__Impl : ( PROPERTIES ) ;
    public final void rule__DimProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3621:1: ( ( PROPERTIES ) )
            // InternalMdxParser.g:3622:1: ( PROPERTIES )
            {
            // InternalMdxParser.g:3622:1: ( PROPERTIES )
            // InternalMdxParser.g:3623:2: PROPERTIES
            {
             before(grammarAccess.getDimPropertiesAccess().getPROPERTIESKeyword_1()); 
            match(input,PROPERTIES,FOLLOW_2); 
             after(grammarAccess.getDimPropertiesAccess().getPROPERTIESKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__1__Impl"


    // $ANTLR start "rule__DimProperties__Group__2"
    // InternalMdxParser.g:3632:1: rule__DimProperties__Group__2 : rule__DimProperties__Group__2__Impl ;
    public final void rule__DimProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3636:1: ( rule__DimProperties__Group__2__Impl )
            // InternalMdxParser.g:3637:2: rule__DimProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimProperties__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__2"


    // $ANTLR start "rule__DimProperties__Group__2__Impl"
    // InternalMdxParser.g:3643:1: rule__DimProperties__Group__2__Impl : ( rulePropertyList ) ;
    public final void rule__DimProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3647:1: ( ( rulePropertyList ) )
            // InternalMdxParser.g:3648:1: ( rulePropertyList )
            {
            // InternalMdxParser.g:3648:1: ( rulePropertyList )
            // InternalMdxParser.g:3649:2: rulePropertyList
            {
             before(grammarAccess.getDimPropertiesAccess().getPropertyListParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePropertyList();

            state._fsp--;

             after(grammarAccess.getDimPropertiesAccess().getPropertyListParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimProperties__Group__2__Impl"


    // $ANTLR start "rule__PropertyList__Group__0"
    // InternalMdxParser.g:3659:1: rule__PropertyList__Group__0 : rule__PropertyList__Group__0__Impl rule__PropertyList__Group__1 ;
    public final void rule__PropertyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3663:1: ( rule__PropertyList__Group__0__Impl rule__PropertyList__Group__1 )
            // InternalMdxParser.g:3664:2: rule__PropertyList__Group__0__Impl rule__PropertyList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group__0"


    // $ANTLR start "rule__PropertyList__Group__0__Impl"
    // InternalMdxParser.g:3671:1: rule__PropertyList__Group__0__Impl : ( ruleProperty ) ;
    public final void rule__PropertyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3675:1: ( ( ruleProperty ) )
            // InternalMdxParser.g:3676:1: ( ruleProperty )
            {
            // InternalMdxParser.g:3676:1: ( ruleProperty )
            // InternalMdxParser.g:3677:2: ruleProperty
            {
             before(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group__0__Impl"


    // $ANTLR start "rule__PropertyList__Group__1"
    // InternalMdxParser.g:3686:1: rule__PropertyList__Group__1 : rule__PropertyList__Group__1__Impl ;
    public final void rule__PropertyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3690:1: ( rule__PropertyList__Group__1__Impl )
            // InternalMdxParser.g:3691:2: rule__PropertyList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group__1"


    // $ANTLR start "rule__PropertyList__Group__1__Impl"
    // InternalMdxParser.g:3697:1: rule__PropertyList__Group__1__Impl : ( ( rule__PropertyList__Group_1__0 )* ) ;
    public final void rule__PropertyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3701:1: ( ( ( rule__PropertyList__Group_1__0 )* ) )
            // InternalMdxParser.g:3702:1: ( ( rule__PropertyList__Group_1__0 )* )
            {
            // InternalMdxParser.g:3702:1: ( ( rule__PropertyList__Group_1__0 )* )
            // InternalMdxParser.g:3703:2: ( rule__PropertyList__Group_1__0 )*
            {
             before(grammarAccess.getPropertyListAccess().getGroup_1()); 
            // InternalMdxParser.g:3704:2: ( rule__PropertyList__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMdxParser.g:3704:3: rule__PropertyList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PropertyList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPropertyListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group__1__Impl"


    // $ANTLR start "rule__PropertyList__Group_1__0"
    // InternalMdxParser.g:3713:1: rule__PropertyList__Group_1__0 : rule__PropertyList__Group_1__0__Impl rule__PropertyList__Group_1__1 ;
    public final void rule__PropertyList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3717:1: ( rule__PropertyList__Group_1__0__Impl rule__PropertyList__Group_1__1 )
            // InternalMdxParser.g:3718:2: rule__PropertyList__Group_1__0__Impl rule__PropertyList__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__PropertyList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group_1__0"


    // $ANTLR start "rule__PropertyList__Group_1__0__Impl"
    // InternalMdxParser.g:3725:1: rule__PropertyList__Group_1__0__Impl : ( ruleCOMMA ) ;
    public final void rule__PropertyList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3729:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:3730:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:3730:1: ( ruleCOMMA )
            // InternalMdxParser.g:3731:2: ruleCOMMA
            {
             before(grammarAccess.getPropertyListAccess().getCOMMAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getPropertyListAccess().getCOMMAParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyList__Group_1__1"
    // InternalMdxParser.g:3740:1: rule__PropertyList__Group_1__1 : rule__PropertyList__Group_1__1__Impl ;
    public final void rule__PropertyList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3744:1: ( rule__PropertyList__Group_1__1__Impl )
            // InternalMdxParser.g:3745:2: rule__PropertyList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group_1__1"


    // $ANTLR start "rule__PropertyList__Group_1__1__Impl"
    // InternalMdxParser.g:3751:1: rule__PropertyList__Group_1__1__Impl : ( ruleProperty ) ;
    public final void rule__PropertyList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3755:1: ( ( ruleProperty ) )
            // InternalMdxParser.g:3756:1: ( ruleProperty )
            {
            // InternalMdxParser.g:3756:1: ( ruleProperty )
            // InternalMdxParser.g:3757:2: ruleProperty
            {
             before(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyList__Group_1__1__Impl"


    // $ANTLR start "rule__CellPropeties__Group__0"
    // InternalMdxParser.g:3767:1: rule__CellPropeties__Group__0 : rule__CellPropeties__Group__0__Impl rule__CellPropeties__Group__1 ;
    public final void rule__CellPropeties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3771:1: ( rule__CellPropeties__Group__0__Impl rule__CellPropeties__Group__1 )
            // InternalMdxParser.g:3772:2: rule__CellPropeties__Group__0__Impl rule__CellPropeties__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CellPropeties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPropeties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__0"


    // $ANTLR start "rule__CellPropeties__Group__0__Impl"
    // InternalMdxParser.g:3779:1: rule__CellPropeties__Group__0__Impl : ( ( CELL )? ) ;
    public final void rule__CellPropeties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3783:1: ( ( ( CELL )? ) )
            // InternalMdxParser.g:3784:1: ( ( CELL )? )
            {
            // InternalMdxParser.g:3784:1: ( ( CELL )? )
            // InternalMdxParser.g:3785:2: ( CELL )?
            {
             before(grammarAccess.getCellPropetiesAccess().getCELLKeyword_0()); 
            // InternalMdxParser.g:3786:2: ( CELL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CELL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMdxParser.g:3786:3: CELL
                    {
                    match(input,CELL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCellPropetiesAccess().getCELLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__0__Impl"


    // $ANTLR start "rule__CellPropeties__Group__1"
    // InternalMdxParser.g:3794:1: rule__CellPropeties__Group__1 : rule__CellPropeties__Group__1__Impl rule__CellPropeties__Group__2 ;
    public final void rule__CellPropeties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3798:1: ( rule__CellPropeties__Group__1__Impl rule__CellPropeties__Group__2 )
            // InternalMdxParser.g:3799:2: rule__CellPropeties__Group__1__Impl rule__CellPropeties__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__CellPropeties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPropeties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__1"


    // $ANTLR start "rule__CellPropeties__Group__1__Impl"
    // InternalMdxParser.g:3806:1: rule__CellPropeties__Group__1__Impl : ( PROPERTIES ) ;
    public final void rule__CellPropeties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3810:1: ( ( PROPERTIES ) )
            // InternalMdxParser.g:3811:1: ( PROPERTIES )
            {
            // InternalMdxParser.g:3811:1: ( PROPERTIES )
            // InternalMdxParser.g:3812:2: PROPERTIES
            {
             before(grammarAccess.getCellPropetiesAccess().getPROPERTIESKeyword_1()); 
            match(input,PROPERTIES,FOLLOW_2); 
             after(grammarAccess.getCellPropetiesAccess().getPROPERTIESKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__1__Impl"


    // $ANTLR start "rule__CellPropeties__Group__2"
    // InternalMdxParser.g:3821:1: rule__CellPropeties__Group__2 : rule__CellPropeties__Group__2__Impl ;
    public final void rule__CellPropeties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3825:1: ( rule__CellPropeties__Group__2__Impl )
            // InternalMdxParser.g:3826:2: rule__CellPropeties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellPropeties__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__2"


    // $ANTLR start "rule__CellPropeties__Group__2__Impl"
    // InternalMdxParser.g:3832:1: rule__CellPropeties__Group__2__Impl : ( ruleCellPropertyList ) ;
    public final void rule__CellPropeties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3836:1: ( ( ruleCellPropertyList ) )
            // InternalMdxParser.g:3837:1: ( ruleCellPropertyList )
            {
            // InternalMdxParser.g:3837:1: ( ruleCellPropertyList )
            // InternalMdxParser.g:3838:2: ruleCellPropertyList
            {
             before(grammarAccess.getCellPropetiesAccess().getCellPropertyListParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleCellPropertyList();

            state._fsp--;

             after(grammarAccess.getCellPropetiesAccess().getCellPropertyListParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropeties__Group__2__Impl"


    // $ANTLR start "rule__CellPropertyList__Group__0"
    // InternalMdxParser.g:3848:1: rule__CellPropertyList__Group__0 : rule__CellPropertyList__Group__0__Impl rule__CellPropertyList__Group__1 ;
    public final void rule__CellPropertyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3852:1: ( rule__CellPropertyList__Group__0__Impl rule__CellPropertyList__Group__1 )
            // InternalMdxParser.g:3853:2: rule__CellPropertyList__Group__0__Impl rule__CellPropertyList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CellPropertyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPropertyList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__0"


    // $ANTLR start "rule__CellPropertyList__Group__0__Impl"
    // InternalMdxParser.g:3860:1: rule__CellPropertyList__Group__0__Impl : ( ruleCellProperty ) ;
    public final void rule__CellPropertyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3864:1: ( ( ruleCellProperty ) )
            // InternalMdxParser.g:3865:1: ( ruleCellProperty )
            {
            // InternalMdxParser.g:3865:1: ( ruleCellProperty )
            // InternalMdxParser.g:3866:2: ruleCellProperty
            {
             before(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCellProperty();

            state._fsp--;

             after(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__0__Impl"


    // $ANTLR start "rule__CellPropertyList__Group__1"
    // InternalMdxParser.g:3875:1: rule__CellPropertyList__Group__1 : rule__CellPropertyList__Group__1__Impl rule__CellPropertyList__Group__2 ;
    public final void rule__CellPropertyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3879:1: ( rule__CellPropertyList__Group__1__Impl rule__CellPropertyList__Group__2 )
            // InternalMdxParser.g:3880:2: rule__CellPropertyList__Group__1__Impl rule__CellPropertyList__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__CellPropertyList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPropertyList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__1"


    // $ANTLR start "rule__CellPropertyList__Group__1__Impl"
    // InternalMdxParser.g:3887:1: rule__CellPropertyList__Group__1__Impl : ( ruleCOMMA ) ;
    public final void rule__CellPropertyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3891:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:3892:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:3892:1: ( ruleCOMMA )
            // InternalMdxParser.g:3893:2: ruleCOMMA
            {
             before(grammarAccess.getCellPropertyListAccess().getCOMMAParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getCellPropertyListAccess().getCOMMAParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__1__Impl"


    // $ANTLR start "rule__CellPropertyList__Group__2"
    // InternalMdxParser.g:3902:1: rule__CellPropertyList__Group__2 : rule__CellPropertyList__Group__2__Impl ;
    public final void rule__CellPropertyList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3906:1: ( rule__CellPropertyList__Group__2__Impl )
            // InternalMdxParser.g:3907:2: rule__CellPropertyList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellPropertyList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__2"


    // $ANTLR start "rule__CellPropertyList__Group__2__Impl"
    // InternalMdxParser.g:3913:1: rule__CellPropertyList__Group__2__Impl : ( ( ruleCellProperty )* ) ;
    public final void rule__CellPropertyList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3917:1: ( ( ( ruleCellProperty )* ) )
            // InternalMdxParser.g:3918:1: ( ( ruleCellProperty )* )
            {
            // InternalMdxParser.g:3918:1: ( ( ruleCellProperty )* )
            // InternalMdxParser.g:3919:2: ( ruleCellProperty )*
            {
             before(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_2()); 
            // InternalMdxParser.g:3920:2: ( ruleCellProperty )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=FORMATTED_VALUE && LA31_0<=DIMENSION)||LA31_0==VALUE||LA31_0==RULE_ID||LA31_0==RULE_QUOTED_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMdxParser.g:3920:3: ruleCellProperty
            	    {
            	    pushFollow(FOLLOW_23);
            	    ruleCellProperty();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPropertyList__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMdxParser.g:3929:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3933:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMdxParser.g:3934:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMdxParser.g:3941:1: rule__Expression__Group__0__Impl : ( ruleValueExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3945:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:3946:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:3946:1: ( ruleValueExpression )
            // InternalMdxParser.g:3947:2: ruleValueExpression
            {
             before(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMdxParser.g:3956:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3960:1: ( rule__Expression__Group__1__Impl )
            // InternalMdxParser.g:3961:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMdxParser.g:3967:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3971:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalMdxParser.g:3972:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalMdxParser.g:3972:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalMdxParser.g:3973:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMdxParser.g:3974:2: ( rule__Expression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Colon) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMdxParser.g:3974:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMdxParser.g:3983:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3987:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMdxParser.g:3988:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMdxParser.g:3995:1: rule__Expression__Group_1__0__Impl : ( ruleCOLON ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:3999:1: ( ( ruleCOLON ) )
            // InternalMdxParser.g:4000:1: ( ruleCOLON )
            {
            // InternalMdxParser.g:4000:1: ( ruleCOLON )
            // InternalMdxParser.g:4001:2: ruleCOLON
            {
             before(grammarAccess.getExpressionAccess().getCOLONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLON();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCOLONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMdxParser.g:4010:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4014:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMdxParser.g:4015:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMdxParser.g:4021:1: rule__Expression__Group_1__1__Impl : ( ruleValueExpression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4025:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:4026:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:4026:1: ( ruleValueExpression )
            // InternalMdxParser.g:4027:2: ruleValueExpression
            {
             before(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__ValueExpression__Group__0"
    // InternalMdxParser.g:4037:1: rule__ValueExpression__Group__0 : rule__ValueExpression__Group__0__Impl rule__ValueExpression__Group__1 ;
    public final void rule__ValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4041:1: ( rule__ValueExpression__Group__0__Impl rule__ValueExpression__Group__1 )
            // InternalMdxParser.g:4042:2: rule__ValueExpression__Group__0__Impl rule__ValueExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ValueExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpression__Group__0"


    // $ANTLR start "rule__ValueExpression__Group__0__Impl"
    // InternalMdxParser.g:4049:1: rule__ValueExpression__Group__0__Impl : ( ruleTerm5 ) ;
    public final void rule__ValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4053:1: ( ( ruleTerm5 ) )
            // InternalMdxParser.g:4054:1: ( ruleTerm5 )
            {
            // InternalMdxParser.g:4054:1: ( ruleTerm5 )
            // InternalMdxParser.g:4055:2: ruleTerm5
            {
             before(grammarAccess.getValueExpressionAccess().getTerm5ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm5();

            state._fsp--;

             after(grammarAccess.getValueExpressionAccess().getTerm5ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpression__Group__0__Impl"


    // $ANTLR start "rule__ValueExpression__Group__1"
    // InternalMdxParser.g:4064:1: rule__ValueExpression__Group__1 : rule__ValueExpression__Group__1__Impl ;
    public final void rule__ValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4068:1: ( rule__ValueExpression__Group__1__Impl )
            // InternalMdxParser.g:4069:2: rule__ValueExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpression__Group__1"


    // $ANTLR start "rule__ValueExpression__Group__1__Impl"
    // InternalMdxParser.g:4075:1: rule__ValueExpression__Group__1__Impl : ( ( rule__ValueExpression__Alternatives_1 )* ) ;
    public final void rule__ValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4079:1: ( ( ( rule__ValueExpression__Alternatives_1 )* ) )
            // InternalMdxParser.g:4080:1: ( ( rule__ValueExpression__Alternatives_1 )* )
            {
            // InternalMdxParser.g:4080:1: ( ( rule__ValueExpression__Alternatives_1 )* )
            // InternalMdxParser.g:4081:2: ( rule__ValueExpression__Alternatives_1 )*
            {
             before(grammarAccess.getValueExpressionAccess().getAlternatives_1()); 
            // InternalMdxParser.g:4082:2: ( rule__ValueExpression__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==XOR||LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMdxParser.g:4082:3: rule__ValueExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ValueExpression__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getValueExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpression__Group__1__Impl"


    // $ANTLR start "rule__ValueXorExpression__Group__0"
    // InternalMdxParser.g:4091:1: rule__ValueXorExpression__Group__0 : rule__ValueXorExpression__Group__0__Impl rule__ValueXorExpression__Group__1 ;
    public final void rule__ValueXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4095:1: ( rule__ValueXorExpression__Group__0__Impl rule__ValueXorExpression__Group__1 )
            // InternalMdxParser.g:4096:2: rule__ValueXorExpression__Group__0__Impl rule__ValueXorExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ValueXorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueXorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueXorExpression__Group__0"


    // $ANTLR start "rule__ValueXorExpression__Group__0__Impl"
    // InternalMdxParser.g:4103:1: rule__ValueXorExpression__Group__0__Impl : ( XOR ) ;
    public final void rule__ValueXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4107:1: ( ( XOR ) )
            // InternalMdxParser.g:4108:1: ( XOR )
            {
            // InternalMdxParser.g:4108:1: ( XOR )
            // InternalMdxParser.g:4109:2: XOR
            {
             before(grammarAccess.getValueXorExpressionAccess().getXORKeyword_0()); 
            match(input,XOR,FOLLOW_2); 
             after(grammarAccess.getValueXorExpressionAccess().getXORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueXorExpression__Group__0__Impl"


    // $ANTLR start "rule__ValueXorExpression__Group__1"
    // InternalMdxParser.g:4118:1: rule__ValueXorExpression__Group__1 : rule__ValueXorExpression__Group__1__Impl ;
    public final void rule__ValueXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4122:1: ( rule__ValueXorExpression__Group__1__Impl )
            // InternalMdxParser.g:4123:2: rule__ValueXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueXorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueXorExpression__Group__1"


    // $ANTLR start "rule__ValueXorExpression__Group__1__Impl"
    // InternalMdxParser.g:4129:1: rule__ValueXorExpression__Group__1__Impl : ( ruleTerm5 ) ;
    public final void rule__ValueXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4133:1: ( ( ruleTerm5 ) )
            // InternalMdxParser.g:4134:1: ( ruleTerm5 )
            {
            // InternalMdxParser.g:4134:1: ( ruleTerm5 )
            // InternalMdxParser.g:4135:2: ruleTerm5
            {
             before(grammarAccess.getValueXorExpressionAccess().getTerm5ParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm5();

            state._fsp--;

             after(grammarAccess.getValueXorExpressionAccess().getTerm5ParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueXorExpression__Group__1__Impl"


    // $ANTLR start "rule__ValueOrExpression__Group__0"
    // InternalMdxParser.g:4145:1: rule__ValueOrExpression__Group__0 : rule__ValueOrExpression__Group__0__Impl rule__ValueOrExpression__Group__1 ;
    public final void rule__ValueOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4149:1: ( rule__ValueOrExpression__Group__0__Impl rule__ValueOrExpression__Group__1 )
            // InternalMdxParser.g:4150:2: rule__ValueOrExpression__Group__0__Impl rule__ValueOrExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ValueOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueOrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOrExpression__Group__0"


    // $ANTLR start "rule__ValueOrExpression__Group__0__Impl"
    // InternalMdxParser.g:4157:1: rule__ValueOrExpression__Group__0__Impl : ( OR ) ;
    public final void rule__ValueOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4161:1: ( ( OR ) )
            // InternalMdxParser.g:4162:1: ( OR )
            {
            // InternalMdxParser.g:4162:1: ( OR )
            // InternalMdxParser.g:4163:2: OR
            {
             before(grammarAccess.getValueOrExpressionAccess().getORKeyword_0()); 
            match(input,OR,FOLLOW_2); 
             after(grammarAccess.getValueOrExpressionAccess().getORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOrExpression__Group__0__Impl"


    // $ANTLR start "rule__ValueOrExpression__Group__1"
    // InternalMdxParser.g:4172:1: rule__ValueOrExpression__Group__1 : rule__ValueOrExpression__Group__1__Impl ;
    public final void rule__ValueOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4176:1: ( rule__ValueOrExpression__Group__1__Impl )
            // InternalMdxParser.g:4177:2: rule__ValueOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueOrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOrExpression__Group__1"


    // $ANTLR start "rule__ValueOrExpression__Group__1__Impl"
    // InternalMdxParser.g:4183:1: rule__ValueOrExpression__Group__1__Impl : ( ruleTerm5 ) ;
    public final void rule__ValueOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4187:1: ( ( ruleTerm5 ) )
            // InternalMdxParser.g:4188:1: ( ruleTerm5 )
            {
            // InternalMdxParser.g:4188:1: ( ruleTerm5 )
            // InternalMdxParser.g:4189:2: ruleTerm5
            {
             before(grammarAccess.getValueOrExpressionAccess().getTerm5ParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm5();

            state._fsp--;

             after(grammarAccess.getValueOrExpressionAccess().getTerm5ParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOrExpression__Group__1__Impl"


    // $ANTLR start "rule__Term5__Group__0"
    // InternalMdxParser.g:4199:1: rule__Term5__Group__0 : rule__Term5__Group__0__Impl rule__Term5__Group__1 ;
    public final void rule__Term5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4203:1: ( rule__Term5__Group__0__Impl rule__Term5__Group__1 )
            // InternalMdxParser.g:4204:2: rule__Term5__Group__0__Impl rule__Term5__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Term5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term5__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group__0"


    // $ANTLR start "rule__Term5__Group__0__Impl"
    // InternalMdxParser.g:4211:1: rule__Term5__Group__0__Impl : ( ruleTerm4 ) ;
    public final void rule__Term5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4215:1: ( ( ruleTerm4 ) )
            // InternalMdxParser.g:4216:1: ( ruleTerm4 )
            {
            // InternalMdxParser.g:4216:1: ( ruleTerm4 )
            // InternalMdxParser.g:4217:2: ruleTerm4
            {
             before(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm4();

            state._fsp--;

             after(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group__0__Impl"


    // $ANTLR start "rule__Term5__Group__1"
    // InternalMdxParser.g:4226:1: rule__Term5__Group__1 : rule__Term5__Group__1__Impl ;
    public final void rule__Term5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4230:1: ( rule__Term5__Group__1__Impl )
            // InternalMdxParser.g:4231:2: rule__Term5__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term5__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group__1"


    // $ANTLR start "rule__Term5__Group__1__Impl"
    // InternalMdxParser.g:4237:1: rule__Term5__Group__1__Impl : ( ( rule__Term5__Group_1__0 )* ) ;
    public final void rule__Term5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4241:1: ( ( ( rule__Term5__Group_1__0 )* ) )
            // InternalMdxParser.g:4242:1: ( ( rule__Term5__Group_1__0 )* )
            {
            // InternalMdxParser.g:4242:1: ( ( rule__Term5__Group_1__0 )* )
            // InternalMdxParser.g:4243:2: ( rule__Term5__Group_1__0 )*
            {
             before(grammarAccess.getTerm5Access().getGroup_1()); 
            // InternalMdxParser.g:4244:2: ( rule__Term5__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMdxParser.g:4244:3: rule__Term5__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Term5__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTerm5Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group__1__Impl"


    // $ANTLR start "rule__Term5__Group_1__0"
    // InternalMdxParser.g:4253:1: rule__Term5__Group_1__0 : rule__Term5__Group_1__0__Impl rule__Term5__Group_1__1 ;
    public final void rule__Term5__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4257:1: ( rule__Term5__Group_1__0__Impl rule__Term5__Group_1__1 )
            // InternalMdxParser.g:4258:2: rule__Term5__Group_1__0__Impl rule__Term5__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term5__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term5__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group_1__0"


    // $ANTLR start "rule__Term5__Group_1__0__Impl"
    // InternalMdxParser.g:4265:1: rule__Term5__Group_1__0__Impl : ( AND ) ;
    public final void rule__Term5__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4269:1: ( ( AND ) )
            // InternalMdxParser.g:4270:1: ( AND )
            {
            // InternalMdxParser.g:4270:1: ( AND )
            // InternalMdxParser.g:4271:2: AND
            {
             before(grammarAccess.getTerm5Access().getANDKeyword_1_0()); 
            match(input,AND,FOLLOW_2); 
             after(grammarAccess.getTerm5Access().getANDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group_1__0__Impl"


    // $ANTLR start "rule__Term5__Group_1__1"
    // InternalMdxParser.g:4280:1: rule__Term5__Group_1__1 : rule__Term5__Group_1__1__Impl ;
    public final void rule__Term5__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4284:1: ( rule__Term5__Group_1__1__Impl )
            // InternalMdxParser.g:4285:2: rule__Term5__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term5__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group_1__1"


    // $ANTLR start "rule__Term5__Group_1__1__Impl"
    // InternalMdxParser.g:4291:1: rule__Term5__Group_1__1__Impl : ( ruleTerm4 ) ;
    public final void rule__Term5__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4295:1: ( ( ruleTerm4 ) )
            // InternalMdxParser.g:4296:1: ( ruleTerm4 )
            {
            // InternalMdxParser.g:4296:1: ( ruleTerm4 )
            // InternalMdxParser.g:4297:2: ruleTerm4
            {
             before(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm4();

            state._fsp--;

             after(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term5__Group_1__1__Impl"


    // $ANTLR start "rule__Term4__Group_0__0"
    // InternalMdxParser.g:4307:1: rule__Term4__Group_0__0 : rule__Term4__Group_0__0__Impl rule__Term4__Group_0__1 ;
    public final void rule__Term4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4311:1: ( rule__Term4__Group_0__0__Impl rule__Term4__Group_0__1 )
            // InternalMdxParser.g:4312:2: rule__Term4__Group_0__0__Impl rule__Term4__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Term4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term4__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term4__Group_0__0"


    // $ANTLR start "rule__Term4__Group_0__0__Impl"
    // InternalMdxParser.g:4319:1: rule__Term4__Group_0__0__Impl : ( NOT ) ;
    public final void rule__Term4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4323:1: ( ( NOT ) )
            // InternalMdxParser.g:4324:1: ( NOT )
            {
            // InternalMdxParser.g:4324:1: ( NOT )
            // InternalMdxParser.g:4325:2: NOT
            {
             before(grammarAccess.getTerm4Access().getNOTKeyword_0_0()); 
            match(input,NOT,FOLLOW_2); 
             after(grammarAccess.getTerm4Access().getNOTKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term4__Group_0__0__Impl"


    // $ANTLR start "rule__Term4__Group_0__1"
    // InternalMdxParser.g:4334:1: rule__Term4__Group_0__1 : rule__Term4__Group_0__1__Impl ;
    public final void rule__Term4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4338:1: ( rule__Term4__Group_0__1__Impl )
            // InternalMdxParser.g:4339:2: rule__Term4__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term4__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term4__Group_0__1"


    // $ANTLR start "rule__Term4__Group_0__1__Impl"
    // InternalMdxParser.g:4345:1: rule__Term4__Group_0__1__Impl : ( ruleTerm4 ) ;
    public final void rule__Term4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4349:1: ( ( ruleTerm4 ) )
            // InternalMdxParser.g:4350:1: ( ruleTerm4 )
            {
            // InternalMdxParser.g:4350:1: ( ruleTerm4 )
            // InternalMdxParser.g:4351:2: ruleTerm4
            {
             before(grammarAccess.getTerm4Access().getTerm4ParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm4();

            state._fsp--;

             after(grammarAccess.getTerm4Access().getTerm4ParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term4__Group_0__1__Impl"


    // $ANTLR start "rule__Term3__Group__0"
    // InternalMdxParser.g:4361:1: rule__Term3__Group__0 : rule__Term3__Group__0__Impl rule__Term3__Group__1 ;
    public final void rule__Term3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4365:1: ( rule__Term3__Group__0__Impl rule__Term3__Group__1 )
            // InternalMdxParser.g:4366:2: rule__Term3__Group__0__Impl rule__Term3__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Term3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group__0"


    // $ANTLR start "rule__Term3__Group__0__Impl"
    // InternalMdxParser.g:4373:1: rule__Term3__Group__0__Impl : ( ruleTerm2 ) ;
    public final void rule__Term3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4377:1: ( ( ruleTerm2 ) )
            // InternalMdxParser.g:4378:1: ( ruleTerm2 )
            {
            // InternalMdxParser.g:4378:1: ( ruleTerm2 )
            // InternalMdxParser.g:4379:2: ruleTerm2
            {
             before(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm2();

            state._fsp--;

             after(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group__0__Impl"


    // $ANTLR start "rule__Term3__Group__1"
    // InternalMdxParser.g:4388:1: rule__Term3__Group__1 : rule__Term3__Group__1__Impl ;
    public final void rule__Term3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4392:1: ( rule__Term3__Group__1__Impl )
            // InternalMdxParser.g:4393:2: rule__Term3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term3__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group__1"


    // $ANTLR start "rule__Term3__Group__1__Impl"
    // InternalMdxParser.g:4399:1: rule__Term3__Group__1__Impl : ( ( rule__Term3__Group_1__0 )* ) ;
    public final void rule__Term3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4403:1: ( ( ( rule__Term3__Group_1__0 )* ) )
            // InternalMdxParser.g:4404:1: ( ( rule__Term3__Group_1__0 )* )
            {
            // InternalMdxParser.g:4404:1: ( ( rule__Term3__Group_1__0 )* )
            // InternalMdxParser.g:4405:2: ( rule__Term3__Group_1__0 )*
            {
             before(grammarAccess.getTerm3Access().getGroup_1()); 
            // InternalMdxParser.g:4406:2: ( rule__Term3__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=LessThanSignEqualsSign && LA35_0<=GreaterThanSignEqualsSign)||(LA35_0>=LessThanSign && LA35_0<=GreaterThanSign)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMdxParser.g:4406:3: rule__Term3__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Term3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTerm3Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group__1__Impl"


    // $ANTLR start "rule__Term3__Group_1__0"
    // InternalMdxParser.g:4415:1: rule__Term3__Group_1__0 : rule__Term3__Group_1__0__Impl rule__Term3__Group_1__1 ;
    public final void rule__Term3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4419:1: ( rule__Term3__Group_1__0__Impl rule__Term3__Group_1__1 )
            // InternalMdxParser.g:4420:2: rule__Term3__Group_1__0__Impl rule__Term3__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term3__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group_1__0"


    // $ANTLR start "rule__Term3__Group_1__0__Impl"
    // InternalMdxParser.g:4427:1: rule__Term3__Group_1__0__Impl : ( ruleCompatingOperator ) ;
    public final void rule__Term3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4431:1: ( ( ruleCompatingOperator ) )
            // InternalMdxParser.g:4432:1: ( ruleCompatingOperator )
            {
            // InternalMdxParser.g:4432:1: ( ruleCompatingOperator )
            // InternalMdxParser.g:4433:2: ruleCompatingOperator
            {
             before(grammarAccess.getTerm3Access().getCompatingOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompatingOperator();

            state._fsp--;

             after(grammarAccess.getTerm3Access().getCompatingOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group_1__0__Impl"


    // $ANTLR start "rule__Term3__Group_1__1"
    // InternalMdxParser.g:4442:1: rule__Term3__Group_1__1 : rule__Term3__Group_1__1__Impl ;
    public final void rule__Term3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4446:1: ( rule__Term3__Group_1__1__Impl )
            // InternalMdxParser.g:4447:2: rule__Term3__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term3__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group_1__1"


    // $ANTLR start "rule__Term3__Group_1__1__Impl"
    // InternalMdxParser.g:4453:1: rule__Term3__Group_1__1__Impl : ( ruleTerm2 ) ;
    public final void rule__Term3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4457:1: ( ( ruleTerm2 ) )
            // InternalMdxParser.g:4458:1: ( ruleTerm2 )
            {
            // InternalMdxParser.g:4458:1: ( ruleTerm2 )
            // InternalMdxParser.g:4459:2: ruleTerm2
            {
             before(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm2();

            state._fsp--;

             after(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term3__Group_1__1__Impl"


    // $ANTLR start "rule__Term2__Group__0"
    // InternalMdxParser.g:4469:1: rule__Term2__Group__0 : rule__Term2__Group__0__Impl rule__Term2__Group__1 ;
    public final void rule__Term2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4473:1: ( rule__Term2__Group__0__Impl rule__Term2__Group__1 )
            // InternalMdxParser.g:4474:2: rule__Term2__Group__0__Impl rule__Term2__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Term2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group__0"


    // $ANTLR start "rule__Term2__Group__0__Impl"
    // InternalMdxParser.g:4481:1: rule__Term2__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Term2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4485:1: ( ( ruleTerm ) )
            // InternalMdxParser.g:4486:1: ( ruleTerm )
            {
            // InternalMdxParser.g:4486:1: ( ruleTerm )
            // InternalMdxParser.g:4487:2: ruleTerm
            {
             before(grammarAccess.getTerm2Access().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTerm2Access().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group__0__Impl"


    // $ANTLR start "rule__Term2__Group__1"
    // InternalMdxParser.g:4496:1: rule__Term2__Group__1 : rule__Term2__Group__1__Impl ;
    public final void rule__Term2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4500:1: ( rule__Term2__Group__1__Impl )
            // InternalMdxParser.g:4501:2: rule__Term2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group__1"


    // $ANTLR start "rule__Term2__Group__1__Impl"
    // InternalMdxParser.g:4507:1: rule__Term2__Group__1__Impl : ( ( rule__Term2__Group_1__0 )* ) ;
    public final void rule__Term2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4511:1: ( ( ( rule__Term2__Group_1__0 )* ) )
            // InternalMdxParser.g:4512:1: ( ( rule__Term2__Group_1__0 )* )
            {
            // InternalMdxParser.g:4512:1: ( ( rule__Term2__Group_1__0 )* )
            // InternalMdxParser.g:4513:2: ( rule__Term2__Group_1__0 )*
            {
             before(grammarAccess.getTerm2Access().getGroup_1()); 
            // InternalMdxParser.g:4514:2: ( rule__Term2__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==VerticalLineVerticalLine||LA36_0==PlusSign||LA36_0==HyphenMinus) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMdxParser.g:4514:3: rule__Term2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Term2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTerm2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group__1__Impl"


    // $ANTLR start "rule__Term2__Group_1__0"
    // InternalMdxParser.g:4523:1: rule__Term2__Group_1__0 : rule__Term2__Group_1__0__Impl rule__Term2__Group_1__1 ;
    public final void rule__Term2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4527:1: ( rule__Term2__Group_1__0__Impl rule__Term2__Group_1__1 )
            // InternalMdxParser.g:4528:2: rule__Term2__Group_1__0__Impl rule__Term2__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group_1__0"


    // $ANTLR start "rule__Term2__Group_1__0__Impl"
    // InternalMdxParser.g:4535:1: rule__Term2__Group_1__0__Impl : ( ( rule__Term2__Alternatives_1_0 ) ) ;
    public final void rule__Term2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4539:1: ( ( ( rule__Term2__Alternatives_1_0 ) ) )
            // InternalMdxParser.g:4540:1: ( ( rule__Term2__Alternatives_1_0 ) )
            {
            // InternalMdxParser.g:4540:1: ( ( rule__Term2__Alternatives_1_0 ) )
            // InternalMdxParser.g:4541:2: ( rule__Term2__Alternatives_1_0 )
            {
             before(grammarAccess.getTerm2Access().getAlternatives_1_0()); 
            // InternalMdxParser.g:4542:2: ( rule__Term2__Alternatives_1_0 )
            // InternalMdxParser.g:4542:3: rule__Term2__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term2__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerm2Access().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group_1__0__Impl"


    // $ANTLR start "rule__Term2__Group_1__1"
    // InternalMdxParser.g:4550:1: rule__Term2__Group_1__1 : rule__Term2__Group_1__1__Impl ;
    public final void rule__Term2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4554:1: ( rule__Term2__Group_1__1__Impl )
            // InternalMdxParser.g:4555:2: rule__Term2__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term2__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group_1__1"


    // $ANTLR start "rule__Term2__Group_1__1__Impl"
    // InternalMdxParser.g:4561:1: rule__Term2__Group_1__1__Impl : ( ruleTerm ) ;
    public final void rule__Term2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4565:1: ( ( ruleTerm ) )
            // InternalMdxParser.g:4566:1: ( ruleTerm )
            {
            // InternalMdxParser.g:4566:1: ( ruleTerm )
            // InternalMdxParser.g:4567:2: ruleTerm
            {
             before(grammarAccess.getTerm2Access().getTermParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTerm2Access().getTermParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term2__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMdxParser.g:4577:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4581:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMdxParser.g:4582:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMdxParser.g:4589:1: rule__Term__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4593:1: ( ( ruleFactor ) )
            // InternalMdxParser.g:4594:1: ( ruleFactor )
            {
            // InternalMdxParser.g:4594:1: ( ruleFactor )
            // InternalMdxParser.g:4595:2: ruleFactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMdxParser.g:4604:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4608:1: ( rule__Term__Group__1__Impl )
            // InternalMdxParser.g:4609:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMdxParser.g:4615:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4619:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalMdxParser.g:4620:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalMdxParser.g:4620:1: ( ( rule__Term__Group_1__0 )* )
            // InternalMdxParser.g:4621:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalMdxParser.g:4622:2: ( rule__Term__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Asterisk||LA37_0==Solidus) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMdxParser.g:4622:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalMdxParser.g:4631:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4635:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalMdxParser.g:4636:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalMdxParser.g:4643:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4647:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalMdxParser.g:4648:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalMdxParser.g:4648:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalMdxParser.g:4649:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalMdxParser.g:4650:2: ( rule__Term__Alternatives_1_0 )
            // InternalMdxParser.g:4650:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalMdxParser.g:4658:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4662:1: ( rule__Term__Group_1__1__Impl )
            // InternalMdxParser.g:4663:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalMdxParser.g:4669:1: rule__Term__Group_1__1__Impl : ( ruleFactor ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4673:1: ( ( ruleFactor ) )
            // InternalMdxParser.g:4674:1: ( ruleFactor )
            {
            // InternalMdxParser.g:4674:1: ( ruleFactor )
            // InternalMdxParser.g:4675:2: ruleFactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_0__0"
    // InternalMdxParser.g:4685:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4689:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalMdxParser.g:4690:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0"


    // $ANTLR start "rule__Factor__Group_0__0__Impl"
    // InternalMdxParser.g:4697:1: rule__Factor__Group_0__0__Impl : ( ruleMINUS ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4701:1: ( ( ruleMINUS ) )
            // InternalMdxParser.g:4702:1: ( ruleMINUS )
            {
            // InternalMdxParser.g:4702:1: ( ruleMINUS )
            // InternalMdxParser.g:4703:2: ruleMINUS
            {
             before(grammarAccess.getFactorAccess().getMINUSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMINUS();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getMINUSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_0__1"
    // InternalMdxParser.g:4712:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4716:1: ( rule__Factor__Group_0__1__Impl )
            // InternalMdxParser.g:4717:2: rule__Factor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1"


    // $ANTLR start "rule__Factor__Group_0__1__Impl"
    // InternalMdxParser.g:4723:1: rule__Factor__Group_0__1__Impl : ( ruleValueExpressionPrimary ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4727:1: ( ( ruleValueExpressionPrimary ) )
            // InternalMdxParser.g:4728:1: ( ruleValueExpressionPrimary )
            {
            // InternalMdxParser.g:4728:1: ( ruleValueExpressionPrimary )
            // InternalMdxParser.g:4729:2: ruleValueExpressionPrimary
            {
             before(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpressionPrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMdxParser.g:4739:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4743:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMdxParser.g:4744:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMdxParser.g:4751:1: rule__Factor__Group_1__0__Impl : ( rulePLUS ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4755:1: ( ( rulePLUS ) )
            // InternalMdxParser.g:4756:1: ( rulePLUS )
            {
            // InternalMdxParser.g:4756:1: ( rulePLUS )
            // InternalMdxParser.g:4757:2: rulePLUS
            {
             before(grammarAccess.getFactorAccess().getPLUSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePLUS();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPLUSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMdxParser.g:4766:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4770:1: ( rule__Factor__Group_1__1__Impl )
            // InternalMdxParser.g:4771:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMdxParser.g:4777:1: rule__Factor__Group_1__1__Impl : ( ruleValueExpressionPrimary ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4781:1: ( ( ruleValueExpressionPrimary ) )
            // InternalMdxParser.g:4782:1: ( ruleValueExpressionPrimary )
            {
            // InternalMdxParser.g:4782:1: ( ruleValueExpressionPrimary )
            // InternalMdxParser.g:4783:2: ruleValueExpressionPrimary
            {
             before(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpressionPrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMdxParser.g:4793:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4797:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMdxParser.g:4798:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMdxParser.g:4805:1: rule__Function__Group__0__Impl : ( ruleIdentifier ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4809:1: ( ( ruleIdentifier ) )
            // InternalMdxParser.g:4810:1: ( ruleIdentifier )
            {
            // InternalMdxParser.g:4810:1: ( ruleIdentifier )
            // InternalMdxParser.g:4811:2: ruleIdentifier
            {
             before(grammarAccess.getFunctionAccess().getIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMdxParser.g:4820:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4824:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMdxParser.g:4825:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMdxParser.g:4832:1: rule__Function__Group__1__Impl : ( ruleLPAREN ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4836:1: ( ( ruleLPAREN ) )
            // InternalMdxParser.g:4837:1: ( ruleLPAREN )
            {
            // InternalMdxParser.g:4837:1: ( ruleLPAREN )
            // InternalMdxParser.g:4838:2: ruleLPAREN
            {
             before(grammarAccess.getFunctionAccess().getLPARENParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getLPARENParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMdxParser.g:4847:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4851:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMdxParser.g:4852:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMdxParser.g:4859:1: rule__Function__Group__2__Impl : ( ( ruleExpressionList )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4863:1: ( ( ( ruleExpressionList )? ) )
            // InternalMdxParser.g:4864:1: ( ( ruleExpressionList )? )
            {
            // InternalMdxParser.g:4864:1: ( ( ruleExpressionList )? )
            // InternalMdxParser.g:4865:2: ( ruleExpressionList )?
            {
             before(grammarAccess.getFunctionAccess().getExpressionListParserRuleCall_2()); 
            // InternalMdxParser.g:4866:2: ( ruleExpressionList )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=PROPERTIES && LA38_0<=DIMENSION)||LA38_0==CASE||LA38_0==NOT||LA38_0==LeftParenthesis||LA38_0==PlusSign||LA38_0==HyphenMinus||LA38_0==LeftCurlyBracket||LA38_0==RULE_ID||LA38_0==RULE_QUOTED_ID||(LA38_0>=RULE_INT && LA38_0<=RULE_STRING)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMdxParser.g:4866:3: ruleExpressionList
                    {
                    pushFollow(FOLLOW_2);
                    ruleExpressionList();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getExpressionListParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMdxParser.g:4874:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4878:1: ( rule__Function__Group__3__Impl )
            // InternalMdxParser.g:4879:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMdxParser.g:4885:1: rule__Function__Group__3__Impl : ( ruleRPAREN ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4889:1: ( ( ruleRPAREN ) )
            // InternalMdxParser.g:4890:1: ( ruleRPAREN )
            {
            // InternalMdxParser.g:4890:1: ( ruleRPAREN )
            // InternalMdxParser.g:4891:2: ruleRPAREN
            {
             before(grammarAccess.getFunctionAccess().getRPARENParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getRPARENParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary__Group__0"
    // InternalMdxParser.g:4901:1: rule__ValueExpressionPrimary__Group__0 : rule__ValueExpressionPrimary__Group__0__Impl rule__ValueExpressionPrimary__Group__1 ;
    public final void rule__ValueExpressionPrimary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4905:1: ( rule__ValueExpressionPrimary__Group__0__Impl rule__ValueExpressionPrimary__Group__1 )
            // InternalMdxParser.g:4906:2: rule__ValueExpressionPrimary__Group__0__Impl rule__ValueExpressionPrimary__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ValueExpressionPrimary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group__0"


    // $ANTLR start "rule__ValueExpressionPrimary__Group__0__Impl"
    // InternalMdxParser.g:4913:1: rule__ValueExpressionPrimary__Group__0__Impl : ( ruleValueExpressionPrimary0 ) ;
    public final void rule__ValueExpressionPrimary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4917:1: ( ( ruleValueExpressionPrimary0 ) )
            // InternalMdxParser.g:4918:1: ( ruleValueExpressionPrimary0 )
            {
            // InternalMdxParser.g:4918:1: ( ruleValueExpressionPrimary0 )
            // InternalMdxParser.g:4919:2: ruleValueExpressionPrimary0
            {
             before(grammarAccess.getValueExpressionPrimaryAccess().getValueExpressionPrimary0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValueExpressionPrimary0();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimaryAccess().getValueExpressionPrimary0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group__0__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary__Group__1"
    // InternalMdxParser.g:4928:1: rule__ValueExpressionPrimary__Group__1 : rule__ValueExpressionPrimary__Group__1__Impl ;
    public final void rule__ValueExpressionPrimary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4932:1: ( rule__ValueExpressionPrimary__Group__1__Impl )
            // InternalMdxParser.g:4933:2: rule__ValueExpressionPrimary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group__1"


    // $ANTLR start "rule__ValueExpressionPrimary__Group__1__Impl"
    // InternalMdxParser.g:4939:1: rule__ValueExpressionPrimary__Group__1__Impl : ( ( rule__ValueExpressionPrimary__Group_1__0 )* ) ;
    public final void rule__ValueExpressionPrimary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4943:1: ( ( ( rule__ValueExpressionPrimary__Group_1__0 )* ) )
            // InternalMdxParser.g:4944:1: ( ( rule__ValueExpressionPrimary__Group_1__0 )* )
            {
            // InternalMdxParser.g:4944:1: ( ( rule__ValueExpressionPrimary__Group_1__0 )* )
            // InternalMdxParser.g:4945:2: ( rule__ValueExpressionPrimary__Group_1__0 )*
            {
             before(grammarAccess.getValueExpressionPrimaryAccess().getGroup_1()); 
            // InternalMdxParser.g:4946:2: ( rule__ValueExpressionPrimary__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==FullStop) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMdxParser.g:4946:3: rule__ValueExpressionPrimary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ValueExpressionPrimary__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getValueExpressionPrimaryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group__1__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary__Group_1__0"
    // InternalMdxParser.g:4955:1: rule__ValueExpressionPrimary__Group_1__0 : rule__ValueExpressionPrimary__Group_1__0__Impl rule__ValueExpressionPrimary__Group_1__1 ;
    public final void rule__ValueExpressionPrimary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4959:1: ( rule__ValueExpressionPrimary__Group_1__0__Impl rule__ValueExpressionPrimary__Group_1__1 )
            // InternalMdxParser.g:4960:2: rule__ValueExpressionPrimary__Group_1__0__Impl rule__ValueExpressionPrimary__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__ValueExpressionPrimary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group_1__0"


    // $ANTLR start "rule__ValueExpressionPrimary__Group_1__0__Impl"
    // InternalMdxParser.g:4967:1: rule__ValueExpressionPrimary__Group_1__0__Impl : ( ruleDOT ) ;
    public final void rule__ValueExpressionPrimary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4971:1: ( ( ruleDOT ) )
            // InternalMdxParser.g:4972:1: ( ruleDOT )
            {
            // InternalMdxParser.g:4972:1: ( ruleDOT )
            // InternalMdxParser.g:4973:2: ruleDOT
            {
             before(grammarAccess.getValueExpressionPrimaryAccess().getDOTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOT();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimaryAccess().getDOTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group_1__0__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary__Group_1__1"
    // InternalMdxParser.g:4982:1: rule__ValueExpressionPrimary__Group_1__1 : rule__ValueExpressionPrimary__Group_1__1__Impl ;
    public final void rule__ValueExpressionPrimary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4986:1: ( rule__ValueExpressionPrimary__Group_1__1__Impl )
            // InternalMdxParser.g:4987:2: rule__ValueExpressionPrimary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group_1__1"


    // $ANTLR start "rule__ValueExpressionPrimary__Group_1__1__Impl"
    // InternalMdxParser.g:4993:1: rule__ValueExpressionPrimary__Group_1__1__Impl : ( ( rule__ValueExpressionPrimary__Alternatives_1_1 ) ) ;
    public final void rule__ValueExpressionPrimary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:4997:1: ( ( ( rule__ValueExpressionPrimary__Alternatives_1_1 ) ) )
            // InternalMdxParser.g:4998:1: ( ( rule__ValueExpressionPrimary__Alternatives_1_1 ) )
            {
            // InternalMdxParser.g:4998:1: ( ( rule__ValueExpressionPrimary__Alternatives_1_1 ) )
            // InternalMdxParser.g:4999:2: ( rule__ValueExpressionPrimary__Alternatives_1_1 )
            {
             before(grammarAccess.getValueExpressionPrimaryAccess().getAlternatives_1_1()); 
            // InternalMdxParser.g:5000:2: ( rule__ValueExpressionPrimary__Alternatives_1_1 )
            // InternalMdxParser.g:5000:3: rule__ValueExpressionPrimary__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValueExpressionPrimaryAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary__Group_1__1__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__0"
    // InternalMdxParser.g:5009:1: rule__ValueExpressionPrimary0__Group_1__0 : rule__ValueExpressionPrimary0__Group_1__0__Impl rule__ValueExpressionPrimary0__Group_1__1 ;
    public final void rule__ValueExpressionPrimary0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5013:1: ( rule__ValueExpressionPrimary0__Group_1__0__Impl rule__ValueExpressionPrimary0__Group_1__1 )
            // InternalMdxParser.g:5014:2: rule__ValueExpressionPrimary0__Group_1__0__Impl rule__ValueExpressionPrimary0__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ValueExpressionPrimary0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__0"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__0__Impl"
    // InternalMdxParser.g:5021:1: rule__ValueExpressionPrimary0__Group_1__0__Impl : ( ruleLPAREN ) ;
    public final void rule__ValueExpressionPrimary0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5025:1: ( ( ruleLPAREN ) )
            // InternalMdxParser.g:5026:1: ( ruleLPAREN )
            {
            // InternalMdxParser.g:5026:1: ( ruleLPAREN )
            // InternalMdxParser.g:5027:2: ruleLPAREN
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getLPARENParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Access().getLPARENParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__0__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__1"
    // InternalMdxParser.g:5036:1: rule__ValueExpressionPrimary0__Group_1__1 : rule__ValueExpressionPrimary0__Group_1__1__Impl rule__ValueExpressionPrimary0__Group_1__2 ;
    public final void rule__ValueExpressionPrimary0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5040:1: ( rule__ValueExpressionPrimary0__Group_1__1__Impl rule__ValueExpressionPrimary0__Group_1__2 )
            // InternalMdxParser.g:5041:2: rule__ValueExpressionPrimary0__Group_1__1__Impl rule__ValueExpressionPrimary0__Group_1__2
            {
            pushFollow(FOLLOW_37);
            rule__ValueExpressionPrimary0__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__1"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__1__Impl"
    // InternalMdxParser.g:5048:1: rule__ValueExpressionPrimary0__Group_1__1__Impl : ( ruleExpressionList ) ;
    public final void rule__ValueExpressionPrimary0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5052:1: ( ( ruleExpressionList ) )
            // InternalMdxParser.g:5053:1: ( ruleExpressionList )
            {
            // InternalMdxParser.g:5053:1: ( ruleExpressionList )
            // InternalMdxParser.g:5054:2: ruleExpressionList
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__1__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__2"
    // InternalMdxParser.g:5063:1: rule__ValueExpressionPrimary0__Group_1__2 : rule__ValueExpressionPrimary0__Group_1__2__Impl ;
    public final void rule__ValueExpressionPrimary0__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5067:1: ( rule__ValueExpressionPrimary0__Group_1__2__Impl )
            // InternalMdxParser.g:5068:2: rule__ValueExpressionPrimary0__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__2"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_1__2__Impl"
    // InternalMdxParser.g:5074:1: rule__ValueExpressionPrimary0__Group_1__2__Impl : ( ruleRPAREN ) ;
    public final void rule__ValueExpressionPrimary0__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5078:1: ( ( ruleRPAREN ) )
            // InternalMdxParser.g:5079:1: ( ruleRPAREN )
            {
            // InternalMdxParser.g:5079:1: ( ruleRPAREN )
            // InternalMdxParser.g:5080:2: ruleRPAREN
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getRPARENParserRuleCall_1_2()); 
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Access().getRPARENParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_1__2__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__0"
    // InternalMdxParser.g:5090:1: rule__ValueExpressionPrimary0__Group_2__0 : rule__ValueExpressionPrimary0__Group_2__0__Impl rule__ValueExpressionPrimary0__Group_2__1 ;
    public final void rule__ValueExpressionPrimary0__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5094:1: ( rule__ValueExpressionPrimary0__Group_2__0__Impl rule__ValueExpressionPrimary0__Group_2__1 )
            // InternalMdxParser.g:5095:2: rule__ValueExpressionPrimary0__Group_2__0__Impl rule__ValueExpressionPrimary0__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__ValueExpressionPrimary0__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__0"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__0__Impl"
    // InternalMdxParser.g:5102:1: rule__ValueExpressionPrimary0__Group_2__0__Impl : ( ruleLBRACE ) ;
    public final void rule__ValueExpressionPrimary0__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5106:1: ( ( ruleLBRACE ) )
            // InternalMdxParser.g:5107:1: ( ruleLBRACE )
            {
            // InternalMdxParser.g:5107:1: ( ruleLBRACE )
            // InternalMdxParser.g:5108:2: ruleLBRACE
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getLBRACEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Access().getLBRACEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__0__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__1"
    // InternalMdxParser.g:5117:1: rule__ValueExpressionPrimary0__Group_2__1 : rule__ValueExpressionPrimary0__Group_2__1__Impl rule__ValueExpressionPrimary0__Group_2__2 ;
    public final void rule__ValueExpressionPrimary0__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5121:1: ( rule__ValueExpressionPrimary0__Group_2__1__Impl rule__ValueExpressionPrimary0__Group_2__2 )
            // InternalMdxParser.g:5122:2: rule__ValueExpressionPrimary0__Group_2__1__Impl rule__ValueExpressionPrimary0__Group_2__2
            {
            pushFollow(FOLLOW_39);
            rule__ValueExpressionPrimary0__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__1"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__1__Impl"
    // InternalMdxParser.g:5129:1: rule__ValueExpressionPrimary0__Group_2__1__Impl : ( ( ruleExpressionList )? ) ;
    public final void rule__ValueExpressionPrimary0__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5133:1: ( ( ( ruleExpressionList )? ) )
            // InternalMdxParser.g:5134:1: ( ( ruleExpressionList )? )
            {
            // InternalMdxParser.g:5134:1: ( ( ruleExpressionList )? )
            // InternalMdxParser.g:5135:2: ( ruleExpressionList )?
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_2_1()); 
            // InternalMdxParser.g:5136:2: ( ruleExpressionList )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=PROPERTIES && LA40_0<=DIMENSION)||LA40_0==CASE||LA40_0==NOT||LA40_0==LeftParenthesis||LA40_0==PlusSign||LA40_0==HyphenMinus||LA40_0==LeftCurlyBracket||LA40_0==RULE_ID||LA40_0==RULE_QUOTED_ID||(LA40_0>=RULE_INT && LA40_0<=RULE_STRING)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMdxParser.g:5136:3: ruleExpressionList
                    {
                    pushFollow(FOLLOW_2);
                    ruleExpressionList();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__1__Impl"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__2"
    // InternalMdxParser.g:5144:1: rule__ValueExpressionPrimary0__Group_2__2 : rule__ValueExpressionPrimary0__Group_2__2__Impl ;
    public final void rule__ValueExpressionPrimary0__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5148:1: ( rule__ValueExpressionPrimary0__Group_2__2__Impl )
            // InternalMdxParser.g:5149:2: rule__ValueExpressionPrimary0__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueExpressionPrimary0__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__2"


    // $ANTLR start "rule__ValueExpressionPrimary0__Group_2__2__Impl"
    // InternalMdxParser.g:5155:1: rule__ValueExpressionPrimary0__Group_2__2__Impl : ( ruleRBRACE ) ;
    public final void rule__ValueExpressionPrimary0__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5159:1: ( ( ruleRBRACE ) )
            // InternalMdxParser.g:5160:1: ( ruleRBRACE )
            {
            // InternalMdxParser.g:5160:1: ( ruleRBRACE )
            // InternalMdxParser.g:5161:2: ruleRBRACE
            {
             before(grammarAccess.getValueExpressionPrimary0Access().getRBRACEParserRuleCall_2_2()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getValueExpressionPrimary0Access().getRBRACEParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueExpressionPrimary0__Group_2__2__Impl"


    // $ANTLR start "rule__ExpressionList__Group__0"
    // InternalMdxParser.g:5171:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5175:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // InternalMdxParser.g:5176:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0"


    // $ANTLR start "rule__ExpressionList__Group__0__Impl"
    // InternalMdxParser.g:5183:1: rule__ExpressionList__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5187:1: ( ( ruleExpression ) )
            // InternalMdxParser.g:5188:1: ( ruleExpression )
            {
            // InternalMdxParser.g:5188:1: ( ruleExpression )
            // InternalMdxParser.g:5189:2: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group__1"
    // InternalMdxParser.g:5198:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5202:1: ( rule__ExpressionList__Group__1__Impl )
            // InternalMdxParser.g:5203:2: rule__ExpressionList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1"


    // $ANTLR start "rule__ExpressionList__Group__1__Impl"
    // InternalMdxParser.g:5209:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__Group_1__0 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5213:1: ( ( ( rule__ExpressionList__Group_1__0 )* ) )
            // InternalMdxParser.g:5214:1: ( ( rule__ExpressionList__Group_1__0 )* )
            {
            // InternalMdxParser.g:5214:1: ( ( rule__ExpressionList__Group_1__0 )* )
            // InternalMdxParser.g:5215:2: ( rule__ExpressionList__Group_1__0 )*
            {
             before(grammarAccess.getExpressionListAccess().getGroup_1()); 
            // InternalMdxParser.g:5216:2: ( rule__ExpressionList__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMdxParser.g:5216:3: rule__ExpressionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ExpressionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getExpressionListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__0"
    // InternalMdxParser.g:5225:1: rule__ExpressionList__Group_1__0 : rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 ;
    public final void rule__ExpressionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5229:1: ( rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 )
            // InternalMdxParser.g:5230:2: rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpressionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0"


    // $ANTLR start "rule__ExpressionList__Group_1__0__Impl"
    // InternalMdxParser.g:5237:1: rule__ExpressionList__Group_1__0__Impl : ( ruleCOMMA ) ;
    public final void rule__ExpressionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5241:1: ( ( ruleCOMMA ) )
            // InternalMdxParser.g:5242:1: ( ruleCOMMA )
            {
            // InternalMdxParser.g:5242:1: ( ruleCOMMA )
            // InternalMdxParser.g:5243:2: ruleCOMMA
            {
             before(grammarAccess.getExpressionListAccess().getCOMMAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getCOMMAParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__1"
    // InternalMdxParser.g:5252:1: rule__ExpressionList__Group_1__1 : rule__ExpressionList__Group_1__1__Impl ;
    public final void rule__ExpressionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5256:1: ( rule__ExpressionList__Group_1__1__Impl )
            // InternalMdxParser.g:5257:2: rule__ExpressionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1"


    // $ANTLR start "rule__ExpressionList__Group_1__1__Impl"
    // InternalMdxParser.g:5263:1: rule__ExpressionList__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__ExpressionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5267:1: ( ( ruleExpression ) )
            // InternalMdxParser.g:5268:1: ( ruleExpression )
            {
            // InternalMdxParser.g:5268:1: ( ruleExpression )
            // InternalMdxParser.g:5269:2: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1__Impl"


    // $ANTLR start "rule__CaseExpression__Group__0"
    // InternalMdxParser.g:5279:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5283:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // InternalMdxParser.g:5284:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__0"


    // $ANTLR start "rule__CaseExpression__Group__0__Impl"
    // InternalMdxParser.g:5291:1: rule__CaseExpression__Group__0__Impl : ( CASE ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5295:1: ( ( CASE ) )
            // InternalMdxParser.g:5296:1: ( CASE )
            {
            // InternalMdxParser.g:5296:1: ( CASE )
            // InternalMdxParser.g:5297:2: CASE
            {
             before(grammarAccess.getCaseExpressionAccess().getCASEKeyword_0()); 
            match(input,CASE,FOLLOW_2); 
             after(grammarAccess.getCaseExpressionAccess().getCASEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__0__Impl"


    // $ANTLR start "rule__CaseExpression__Group__1"
    // InternalMdxParser.g:5306:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5310:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // InternalMdxParser.g:5311:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__1"


    // $ANTLR start "rule__CaseExpression__Group__1__Impl"
    // InternalMdxParser.g:5318:1: rule__CaseExpression__Group__1__Impl : ( ( ruleValueExpression )? ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5322:1: ( ( ( ruleValueExpression )? ) )
            // InternalMdxParser.g:5323:1: ( ( ruleValueExpression )? )
            {
            // InternalMdxParser.g:5323:1: ( ( ruleValueExpression )? )
            // InternalMdxParser.g:5324:2: ( ruleValueExpression )?
            {
             before(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_1()); 
            // InternalMdxParser.g:5325:2: ( ruleValueExpression )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PROPERTIES && LA42_0<=DIMENSION)||LA42_0==CASE||LA42_0==NOT||LA42_0==LeftParenthesis||LA42_0==PlusSign||LA42_0==HyphenMinus||LA42_0==LeftCurlyBracket||LA42_0==RULE_ID||LA42_0==RULE_QUOTED_ID||(LA42_0>=RULE_INT && LA42_0<=RULE_STRING)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMdxParser.g:5325:3: ruleValueExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleValueExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__1__Impl"


    // $ANTLR start "rule__CaseExpression__Group__2"
    // InternalMdxParser.g:5333:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5337:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // InternalMdxParser.g:5338:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__2"


    // $ANTLR start "rule__CaseExpression__Group__2__Impl"
    // InternalMdxParser.g:5345:1: rule__CaseExpression__Group__2__Impl : ( ( ruleWhenList )? ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5349:1: ( ( ( ruleWhenList )? ) )
            // InternalMdxParser.g:5350:1: ( ( ruleWhenList )? )
            {
            // InternalMdxParser.g:5350:1: ( ( ruleWhenList )? )
            // InternalMdxParser.g:5351:2: ( ruleWhenList )?
            {
             before(grammarAccess.getCaseExpressionAccess().getWhenListParserRuleCall_2()); 
            // InternalMdxParser.g:5352:2: ( ruleWhenList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==WHEN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMdxParser.g:5352:3: ruleWhenList
                    {
                    pushFollow(FOLLOW_2);
                    ruleWhenList();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseExpressionAccess().getWhenListParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__2__Impl"


    // $ANTLR start "rule__CaseExpression__Group__3"
    // InternalMdxParser.g:5360:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5364:1: ( rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4 )
            // InternalMdxParser.g:5365:2: rule__CaseExpression__Group__3__Impl rule__CaseExpression__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__CaseExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__3"


    // $ANTLR start "rule__CaseExpression__Group__3__Impl"
    // InternalMdxParser.g:5372:1: rule__CaseExpression__Group__3__Impl : ( ( rule__CaseExpression__Group_3__0 )? ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5376:1: ( ( ( rule__CaseExpression__Group_3__0 )? ) )
            // InternalMdxParser.g:5377:1: ( ( rule__CaseExpression__Group_3__0 )? )
            {
            // InternalMdxParser.g:5377:1: ( ( rule__CaseExpression__Group_3__0 )? )
            // InternalMdxParser.g:5378:2: ( rule__CaseExpression__Group_3__0 )?
            {
             before(grammarAccess.getCaseExpressionAccess().getGroup_3()); 
            // InternalMdxParser.g:5379:2: ( rule__CaseExpression__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ELSE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMdxParser.g:5379:3: rule__CaseExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseExpression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__3__Impl"


    // $ANTLR start "rule__CaseExpression__Group__4"
    // InternalMdxParser.g:5387:1: rule__CaseExpression__Group__4 : rule__CaseExpression__Group__4__Impl ;
    public final void rule__CaseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5391:1: ( rule__CaseExpression__Group__4__Impl )
            // InternalMdxParser.g:5392:2: rule__CaseExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__4"


    // $ANTLR start "rule__CaseExpression__Group__4__Impl"
    // InternalMdxParser.g:5398:1: rule__CaseExpression__Group__4__Impl : ( END ) ;
    public final void rule__CaseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5402:1: ( ( END ) )
            // InternalMdxParser.g:5403:1: ( END )
            {
            // InternalMdxParser.g:5403:1: ( END )
            // InternalMdxParser.g:5404:2: END
            {
             before(grammarAccess.getCaseExpressionAccess().getENDKeyword_4()); 
            match(input,END,FOLLOW_2); 
             after(grammarAccess.getCaseExpressionAccess().getENDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__4__Impl"


    // $ANTLR start "rule__CaseExpression__Group_3__0"
    // InternalMdxParser.g:5414:1: rule__CaseExpression__Group_3__0 : rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 ;
    public final void rule__CaseExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5418:1: ( rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1 )
            // InternalMdxParser.g:5419:2: rule__CaseExpression__Group_3__0__Impl rule__CaseExpression__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CaseExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__0"


    // $ANTLR start "rule__CaseExpression__Group_3__0__Impl"
    // InternalMdxParser.g:5426:1: rule__CaseExpression__Group_3__0__Impl : ( ELSE ) ;
    public final void rule__CaseExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5430:1: ( ( ELSE ) )
            // InternalMdxParser.g:5431:1: ( ELSE )
            {
            // InternalMdxParser.g:5431:1: ( ELSE )
            // InternalMdxParser.g:5432:2: ELSE
            {
             before(grammarAccess.getCaseExpressionAccess().getELSEKeyword_3_0()); 
            match(input,ELSE,FOLLOW_2); 
             after(grammarAccess.getCaseExpressionAccess().getELSEKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__0__Impl"


    // $ANTLR start "rule__CaseExpression__Group_3__1"
    // InternalMdxParser.g:5441:1: rule__CaseExpression__Group_3__1 : rule__CaseExpression__Group_3__1__Impl ;
    public final void rule__CaseExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5445:1: ( rule__CaseExpression__Group_3__1__Impl )
            // InternalMdxParser.g:5446:2: rule__CaseExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__1"


    // $ANTLR start "rule__CaseExpression__Group_3__1__Impl"
    // InternalMdxParser.g:5452:1: rule__CaseExpression__Group_3__1__Impl : ( ruleValueExpression ) ;
    public final void rule__CaseExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5456:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:5457:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:5457:1: ( ruleValueExpression )
            // InternalMdxParser.g:5458:2: ruleValueExpression
            {
             before(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group_3__1__Impl"


    // $ANTLR start "rule__WhenList__Group__0"
    // InternalMdxParser.g:5468:1: rule__WhenList__Group__0 : rule__WhenList__Group__0__Impl rule__WhenList__Group__1 ;
    public final void rule__WhenList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5472:1: ( rule__WhenList__Group__0__Impl rule__WhenList__Group__1 )
            // InternalMdxParser.g:5473:2: rule__WhenList__Group__0__Impl rule__WhenList__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__WhenList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenList__Group__0"


    // $ANTLR start "rule__WhenList__Group__0__Impl"
    // InternalMdxParser.g:5480:1: rule__WhenList__Group__0__Impl : ( ruleWhenClause ) ;
    public final void rule__WhenList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5484:1: ( ( ruleWhenClause ) )
            // InternalMdxParser.g:5485:1: ( ruleWhenClause )
            {
            // InternalMdxParser.g:5485:1: ( ruleWhenClause )
            // InternalMdxParser.g:5486:2: ruleWhenClause
            {
             before(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWhenClause();

            state._fsp--;

             after(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenList__Group__0__Impl"


    // $ANTLR start "rule__WhenList__Group__1"
    // InternalMdxParser.g:5495:1: rule__WhenList__Group__1 : rule__WhenList__Group__1__Impl ;
    public final void rule__WhenList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5499:1: ( rule__WhenList__Group__1__Impl )
            // InternalMdxParser.g:5500:2: rule__WhenList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhenList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenList__Group__1"


    // $ANTLR start "rule__WhenList__Group__1__Impl"
    // InternalMdxParser.g:5506:1: rule__WhenList__Group__1__Impl : ( ( ruleWhenClause )* ) ;
    public final void rule__WhenList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5510:1: ( ( ( ruleWhenClause )* ) )
            // InternalMdxParser.g:5511:1: ( ( ruleWhenClause )* )
            {
            // InternalMdxParser.g:5511:1: ( ( ruleWhenClause )* )
            // InternalMdxParser.g:5512:2: ( ruleWhenClause )*
            {
             before(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_1()); 
            // InternalMdxParser.g:5513:2: ( ruleWhenClause )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==WHEN) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMdxParser.g:5513:3: ruleWhenClause
            	    {
            	    pushFollow(FOLLOW_42);
            	    ruleWhenClause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenList__Group__1__Impl"


    // $ANTLR start "rule__WhenClause__Group__0"
    // InternalMdxParser.g:5522:1: rule__WhenClause__Group__0 : rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 ;
    public final void rule__WhenClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5526:1: ( rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 )
            // InternalMdxParser.g:5527:2: rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WhenClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__0"


    // $ANTLR start "rule__WhenClause__Group__0__Impl"
    // InternalMdxParser.g:5534:1: rule__WhenClause__Group__0__Impl : ( WHEN ) ;
    public final void rule__WhenClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5538:1: ( ( WHEN ) )
            // InternalMdxParser.g:5539:1: ( WHEN )
            {
            // InternalMdxParser.g:5539:1: ( WHEN )
            // InternalMdxParser.g:5540:2: WHEN
            {
             before(grammarAccess.getWhenClauseAccess().getWHENKeyword_0()); 
            match(input,WHEN,FOLLOW_2); 
             after(grammarAccess.getWhenClauseAccess().getWHENKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__0__Impl"


    // $ANTLR start "rule__WhenClause__Group__1"
    // InternalMdxParser.g:5549:1: rule__WhenClause__Group__1 : rule__WhenClause__Group__1__Impl rule__WhenClause__Group__2 ;
    public final void rule__WhenClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5553:1: ( rule__WhenClause__Group__1__Impl rule__WhenClause__Group__2 )
            // InternalMdxParser.g:5554:2: rule__WhenClause__Group__1__Impl rule__WhenClause__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__WhenClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__1"


    // $ANTLR start "rule__WhenClause__Group__1__Impl"
    // InternalMdxParser.g:5561:1: rule__WhenClause__Group__1__Impl : ( ruleValueExpression ) ;
    public final void rule__WhenClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5565:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:5566:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:5566:1: ( ruleValueExpression )
            // InternalMdxParser.g:5567:2: ruleValueExpression
            {
             before(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__1__Impl"


    // $ANTLR start "rule__WhenClause__Group__2"
    // InternalMdxParser.g:5576:1: rule__WhenClause__Group__2 : rule__WhenClause__Group__2__Impl rule__WhenClause__Group__3 ;
    public final void rule__WhenClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5580:1: ( rule__WhenClause__Group__2__Impl rule__WhenClause__Group__3 )
            // InternalMdxParser.g:5581:2: rule__WhenClause__Group__2__Impl rule__WhenClause__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__WhenClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenClause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__2"


    // $ANTLR start "rule__WhenClause__Group__2__Impl"
    // InternalMdxParser.g:5588:1: rule__WhenClause__Group__2__Impl : ( THEN ) ;
    public final void rule__WhenClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5592:1: ( ( THEN ) )
            // InternalMdxParser.g:5593:1: ( THEN )
            {
            // InternalMdxParser.g:5593:1: ( THEN )
            // InternalMdxParser.g:5594:2: THEN
            {
             before(grammarAccess.getWhenClauseAccess().getTHENKeyword_2()); 
            match(input,THEN,FOLLOW_2); 
             after(grammarAccess.getWhenClauseAccess().getTHENKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__2__Impl"


    // $ANTLR start "rule__WhenClause__Group__3"
    // InternalMdxParser.g:5603:1: rule__WhenClause__Group__3 : rule__WhenClause__Group__3__Impl ;
    public final void rule__WhenClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5607:1: ( rule__WhenClause__Group__3__Impl )
            // InternalMdxParser.g:5608:2: rule__WhenClause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhenClause__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__3"


    // $ANTLR start "rule__WhenClause__Group__3__Impl"
    // InternalMdxParser.g:5614:1: rule__WhenClause__Group__3__Impl : ( ruleValueExpression ) ;
    public final void rule__WhenClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5618:1: ( ( ruleValueExpression ) )
            // InternalMdxParser.g:5619:1: ( ruleValueExpression )
            {
            // InternalMdxParser.g:5619:1: ( ruleValueExpression )
            // InternalMdxParser.g:5620:2: ruleValueExpression
            {
             before(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleValueExpression();

            state._fsp--;

             after(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenClause__Group__3__Impl"


    // $ANTLR start "rule__MdxStatement__StatementAssignment"
    // InternalMdxParser.g:5630:1: rule__MdxStatement__StatementAssignment : ( ruleSelectStatement ) ;
    public final void rule__MdxStatement__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMdxParser.g:5634:1: ( ( ruleSelectStatement ) )
            // InternalMdxParser.g:5635:2: ( ruleSelectStatement )
            {
            // InternalMdxParser.g:5635:2: ( ruleSelectStatement )
            // InternalMdxParser.g:5636:3: ruleSelectStatement
            {
             before(grammarAccess.getMdxStatementAccess().getStatementSelectStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getMdxStatementAccess().getStatementSelectStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MdxStatement__StatementAssignment"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2042:1: rule__ValueExpressionPrimary0__Alternatives : ( ( ruleFunction ) | ( ( rule__ValueExpressionPrimary0__Group_1__0 ) ) | ( ( rule__ValueExpressionPrimary0__Group_2__0 ) ) | ( ruleCaseExpression ) | ( RULE_STRING ) | ( RULE_INT ) | ( ruleIdentifier ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00D280A400C120C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00120000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000005040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00D280A400C020C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00D280A600C020C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000400000C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00120000000008F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00120000000008F2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000070001C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000070001C000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000A100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000A100000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00D280AC00C020C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x001A0000000000C0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00D380A400C020C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00D280A400E4A0C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020000L});

}