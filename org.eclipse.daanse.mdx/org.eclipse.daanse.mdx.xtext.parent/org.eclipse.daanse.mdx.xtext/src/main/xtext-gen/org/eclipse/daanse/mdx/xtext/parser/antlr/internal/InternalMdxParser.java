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
  public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FORMATTED_VALUE",
      "CELL_ORDINAL", "PROPERTIES", "DIMENSION", "MEMBER", "SELECT", "EMPTY", "VALUE", "WHERE", "CASE", "CELL", "ELSE",
      "FROM", "THEN", "WHEN", "WITH", "AND", "END", "NON", "NOT", "SET", "XOR", "LessThanSignEqualsSign",
      "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "AS", "ON", "OR", "VerticalLineVerticalLine",
      "Apostrophe", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop",
      "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftCurlyBracket",
      "RightCurlyBracket", "RULE_ID", "RULE_DIGIT", "RULE_AMP_QUOTED_ID", "RULE_QUOTED_ID", "RULE_LETTER", "RULE_INT",
      "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER" };
  public static final int LessThanSignGreaterThanSign = 27;
  public static final int PROPERTIES = 6;
  public static final int VALUE = 11;
  public static final int FROM = 16;
  public static final int LessThanSign = 44;
  public static final int WHEN = 18;
  public static final int LeftParenthesis = 34;
  public static final int DIMENSION = 7;
  public static final int ELSE = 15;
  public static final int GreaterThanSign = 46;
  public static final int RULE_ID = 49;
  public static final int RULE_QUOTED_ID = 52;
  public static final int RightParenthesis = 35;
  public static final int RULE_DIGIT = 50;
  public static final int FORMATTED_VALUE = 4;
  public static final int WHERE = 12;
  public static final int NON = 22;
  public static final int CASE = 13;
  public static final int GreaterThanSignEqualsSign = 28;
  public static final int NOT = 23;
  public static final int AS = 29;
  public static final int PlusSign = 37;
  public static final int RULE_INT = 54;
  public static final int AND = 20;
  public static final int RULE_ML_COMMENT = 56;
  public static final int THEN = 17;
  public static final int END = 21;
  public static final int XOR = 25;
  public static final int SET = 24;
  public static final int VerticalLineVerticalLine = 32;
  public static final int RULE_STRING = 55;
  public static final int MEMBER = 8;
  public static final int RULE_SL_COMMENT = 57;
  public static final int Comma = 38;
  public static final int EqualsSign = 45;
  public static final int HyphenMinus = 39;
  public static final int LessThanSignEqualsSign = 26;
  public static final int Solidus = 41;
  public static final int Colon = 42;
  public static final int RightCurlyBracket = 48;
  public static final int EOF = -1;
  public static final int EMPTY = 10;
  public static final int Apostrophe = 33;
  public static final int Asterisk = 36;
  public static final int CELL_ORDINAL = 5;
  public static final int ON = 30;
  public static final int FullStop = 40;
  public static final int OR = 31;
  public static final int RULE_WS = 58;
  public static final int LeftCurlyBracket = 47;
  public static final int RULE_ANY_OTHER = 59;
  public static final int SELECT = 9;
  public static final int WITH = 19;
  public static final int Semicolon = 43;
  public static final int RULE_LETTER = 53;
  public static final int RULE_AMP_QUOTED_ID = 51;
  public static final int CELL = 14;

  // delegates
  // delegators

  public InternalMdxParser(TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public InternalMdxParser(TokenStream input, RecognizerSharedState state) {
    super(input, state);

  }

  public String[] getTokenNames() {
    return InternalMdxParser.tokenNames;
  }

  public String getGrammarFileName() {
    return "InternalMdxParser.g";
  }

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
  // InternalMdxParser.g:57:1: entryRuleMdxStatement returns [EObject
  // current=null] : iv_ruleMdxStatement= ruleMdxStatement EOF ;
  public final EObject entryRuleMdxStatement() throws RecognitionException {
    EObject current = null;

    EObject iv_ruleMdxStatement = null;

    try {
      // InternalMdxParser.g:57:53: (iv_ruleMdxStatement= ruleMdxStatement EOF )
      // InternalMdxParser.g:58:2: iv_ruleMdxStatement= ruleMdxStatement EOF
      {
        newCompositeNode(grammarAccess.getMdxStatementRule());
        pushFollow(FOLLOW_1);
        iv_ruleMdxStatement = ruleMdxStatement();

        state._fsp--;

        current = iv_ruleMdxStatement;
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMdxStatement"

  // $ANTLR start "ruleMdxStatement"
  // InternalMdxParser.g:64:1: ruleMdxStatement returns [EObject current=null] : (
  // (lv_statement_0_0= ruleSelectStatement ) ) ;
  public final EObject ruleMdxStatement() throws RecognitionException {
    EObject current = null;

    EObject lv_statement_0_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:70:2: ( ( (lv_statement_0_0= ruleSelectStatement ) ) )
      // InternalMdxParser.g:71:2: ( (lv_statement_0_0= ruleSelectStatement ) )
      {
        // InternalMdxParser.g:71:2: ( (lv_statement_0_0= ruleSelectStatement ) )
        // InternalMdxParser.g:72:3: (lv_statement_0_0= ruleSelectStatement )
        {
          // InternalMdxParser.g:72:3: (lv_statement_0_0= ruleSelectStatement )
          // InternalMdxParser.g:73:4: lv_statement_0_0= ruleSelectStatement
          {

            newCompositeNode(grammarAccess.getMdxStatementAccess().getStatementSelectStatementParserRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_statement_0_0 = ruleSelectStatement();

            state._fsp--;

            if (current == null) {
              current = createModelElementForParent(grammarAccess.getMdxStatementRule());
            }
            set(current, "statement", lv_statement_0_0, "org.eclipse.daanse.mdx.xtext.Mdx.SelectStatement");
            afterParserOrEnumRuleCall();

          }

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMdxStatement"

  // $ANTLR start "entryRuleSelectStatement"
  // InternalMdxParser.g:93:1: entryRuleSelectStatement returns [EObject
  // current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
  public final EObject entryRuleSelectStatement() throws RecognitionException {
    EObject current = null;

    EObject iv_ruleSelectStatement = null;

    try {
      // InternalMdxParser.g:93:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
      // InternalMdxParser.g:94:2: iv_ruleSelectStatement= ruleSelectStatement EOF
      {
        newCompositeNode(grammarAccess.getSelectStatementRule());
        pushFollow(FOLLOW_1);
        iv_ruleSelectStatement = ruleSelectStatement();

        state._fsp--;

        current = iv_ruleSelectStatement;
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSelectStatement"

  // $ANTLR start "ruleSelectStatement"
  // InternalMdxParser.g:100:1: ruleSelectStatement returns [EObject current=null]
  // : ( () (otherlv_1= WITH ruleFormulaSpecification )? otherlv_3= SELECT (
  // ruleAxisSpecificationList )? otherlv_5= FROM ruleCubeSpecification
  // (otherlv_7= WHERE ruleSlicerSpecification )? ( ruleCellPropeties )? ) ;
  public final EObject ruleSelectStatement() throws RecognitionException {
    EObject current = null;

    Token otherlv_1 = null;
    Token otherlv_3 = null;
    Token otherlv_5 = null;
    Token otherlv_7 = null;

    enterRule();

    try {
      // InternalMdxParser.g:106:2: ( ( () (otherlv_1= WITH ruleFormulaSpecification
      // )? otherlv_3= SELECT ( ruleAxisSpecificationList )? otherlv_5= FROM
      // ruleCubeSpecification (otherlv_7= WHERE ruleSlicerSpecification )? (
      // ruleCellPropeties )? ) )
      // InternalMdxParser.g:107:2: ( () (otherlv_1= WITH ruleFormulaSpecification )?
      // otherlv_3= SELECT ( ruleAxisSpecificationList )? otherlv_5= FROM
      // ruleCubeSpecification (otherlv_7= WHERE ruleSlicerSpecification )? (
      // ruleCellPropeties )? )
      {
        // InternalMdxParser.g:107:2: ( () (otherlv_1= WITH ruleFormulaSpecification )?
        // otherlv_3= SELECT ( ruleAxisSpecificationList )? otherlv_5= FROM
        // ruleCubeSpecification (otherlv_7= WHERE ruleSlicerSpecification )? (
        // ruleCellPropeties )? )
        // InternalMdxParser.g:108:3: () (otherlv_1= WITH ruleFormulaSpecification )?
        // otherlv_3= SELECT ( ruleAxisSpecificationList )? otherlv_5= FROM
        // ruleCubeSpecification (otherlv_7= WHERE ruleSlicerSpecification )? (
        // ruleCellPropeties )?
        {
          // InternalMdxParser.g:108:3: ()
          // InternalMdxParser.g:109:4:
          {

            current = forceCreateModelElement(grammarAccess.getSelectStatementAccess().getSelectStatementAction_0(),
                current);

          }

          // InternalMdxParser.g:115:3: (otherlv_1= WITH ruleFormulaSpecification )?
          int alt1 = 2;
          int LA1_0 = input.LA(1);

          if ((LA1_0 == WITH)) {
            alt1 = 1;
          }
          switch (alt1) {
          case 1:
          // InternalMdxParser.g:116:4: otherlv_1= WITH ruleFormulaSpecification
          {
            otherlv_1 = (Token) match(input, WITH, FOLLOW_3);

            newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getWITHKeyword_1_0());

            newCompositeNode(grammarAccess.getSelectStatementAccess().getFormulaSpecificationParserRuleCall_1_1());

            pushFollow(FOLLOW_4);
            ruleFormulaSpecification();

            state._fsp--;

            afterParserOrEnumRuleCall();

          }
            break;

          }

          otherlv_3 = (Token) match(input, SELECT, FOLLOW_5);

          newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getSELECTKeyword_2());

          // InternalMdxParser.g:132:3: ( ruleAxisSpecificationList )?
          int alt2 = 2;
          int LA2_0 = input.LA(1);

          if (((LA2_0 >= PROPERTIES && LA2_0 <= DIMENSION) || LA2_0 == CASE || (LA2_0 >= NON && LA2_0 <= NOT)
              || LA2_0 == LeftParenthesis || LA2_0 == PlusSign || LA2_0 == HyphenMinus || LA2_0 == LeftCurlyBracket
              || LA2_0 == RULE_ID || LA2_0 == RULE_QUOTED_ID || (LA2_0 >= RULE_INT && LA2_0 <= RULE_STRING))) {
            alt2 = 1;
          }
          switch (alt2) {
          case 1:
          // InternalMdxParser.g:133:4: ruleAxisSpecificationList
          {

            newCompositeNode(grammarAccess.getSelectStatementAccess().getAxisSpecificationListParserRuleCall_3());

            pushFollow(FOLLOW_6);
            ruleAxisSpecificationList();

            state._fsp--;

            afterParserOrEnumRuleCall();

          }
            break;

          }

          otherlv_5 = (Token) match(input, FROM, FOLLOW_7);

          newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getFROMKeyword_4());

          newCompositeNode(grammarAccess.getSelectStatementAccess().getCubeSpecificationParserRuleCall_5());

          pushFollow(FOLLOW_8);
          ruleCubeSpecification();

          state._fsp--;

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:152:3: (otherlv_7= WHERE ruleSlicerSpecification )?
          int alt3 = 2;
          int LA3_0 = input.LA(1);

          if ((LA3_0 == WHERE)) {
            alt3 = 1;
          }
          switch (alt3) {
          case 1:
          // InternalMdxParser.g:153:4: otherlv_7= WHERE ruleSlicerSpecification
          {
            otherlv_7 = (Token) match(input, WHERE, FOLLOW_9);

            newLeafNode(otherlv_7, grammarAccess.getSelectStatementAccess().getWHEREKeyword_6_0());

            newCompositeNode(grammarAccess.getSelectStatementAccess().getSlicerSpecificationParserRuleCall_6_1());

            pushFollow(FOLLOW_10);
            ruleSlicerSpecification();

            state._fsp--;

            afterParserOrEnumRuleCall();

          }
            break;

          }

          // InternalMdxParser.g:165:3: ( ruleCellPropeties )?
          int alt4 = 2;
          int LA4_0 = input.LA(1);

          if ((LA4_0 == PROPERTIES || LA4_0 == CELL)) {
            alt4 = 1;
          }
          switch (alt4) {
          case 1:
          // InternalMdxParser.g:166:4: ruleCellPropeties
          {

            newCompositeNode(grammarAccess.getSelectStatementAccess().getCellPropetiesParserRuleCall_7());

            pushFollow(FOLLOW_2);
            ruleCellPropeties();

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
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSelectStatement"

  // $ANTLR start "entryRuleFormulaSpecification"
  // InternalMdxParser.g:178:1: entryRuleFormulaSpecification returns [String
  // current=null] : iv_ruleFormulaSpecification= ruleFormulaSpecification EOF ;
  public final String entryRuleFormulaSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleFormulaSpecification = null;

    try {
      // InternalMdxParser.g:178:60: (iv_ruleFormulaSpecification=
      // ruleFormulaSpecification EOF )
      // InternalMdxParser.g:179:2: iv_ruleFormulaSpecification=
      // ruleFormulaSpecification EOF
      {
        newCompositeNode(grammarAccess.getFormulaSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleFormulaSpecification = ruleFormulaSpecification();

        state._fsp--;

        current = iv_ruleFormulaSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleFormulaSpecification"

  // $ANTLR start "ruleFormulaSpecification"
  // InternalMdxParser.g:185:1: ruleFormulaSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_SingleFormulaSpecification_0= ruleSingleFormulaSpecification )+ ;
  public final AntlrDatatypeRuleToken ruleFormulaSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_SingleFormulaSpecification_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:191:2: ( (this_SingleFormulaSpecification_0=
      // ruleSingleFormulaSpecification )+ )
      // InternalMdxParser.g:192:2: (this_SingleFormulaSpecification_0=
      // ruleSingleFormulaSpecification )+
      {
        // InternalMdxParser.g:192:2: (this_SingleFormulaSpecification_0=
        // ruleSingleFormulaSpecification )+
        int cnt5 = 0;
        loop5: do {
          int alt5 = 2;
          int LA5_0 = input.LA(1);

          if ((LA5_0 == MEMBER || LA5_0 == SET)) {
            alt5 = 1;
          }

          switch (alt5) {
          case 1:
          // InternalMdxParser.g:193:3: this_SingleFormulaSpecification_0=
          // ruleSingleFormulaSpecification
          {

            newCompositeNode(
                grammarAccess.getFormulaSpecificationAccess().getSingleFormulaSpecificationParserRuleCall());

            pushFollow(FOLLOW_11);
            this_SingleFormulaSpecification_0 = ruleSingleFormulaSpecification();

            state._fsp--;

            current.merge(this_SingleFormulaSpecification_0);

            afterParserOrEnumRuleCall();

          }
            break;

          default:
            if (cnt5 >= 1)
              break loop5;
            EarlyExitException eee = new EarlyExitException(5, input);
            throw eee;
          }
          cnt5++;
        } while (true);

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleFormulaSpecification"

  // $ANTLR start "entryRuleSingleFormulaSpecification"
  // InternalMdxParser.g:207:1: entryRuleSingleFormulaSpecification returns
  // [String current=null] : iv_ruleSingleFormulaSpecification=
  // ruleSingleFormulaSpecification EOF ;
  public final String entryRuleSingleFormulaSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleSingleFormulaSpecification = null;

    try {
      // InternalMdxParser.g:207:66: (iv_ruleSingleFormulaSpecification=
      // ruleSingleFormulaSpecification EOF )
      // InternalMdxParser.g:208:2: iv_ruleSingleFormulaSpecification=
      // ruleSingleFormulaSpecification EOF
      {
        newCompositeNode(grammarAccess.getSingleFormulaSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleSingleFormulaSpecification = ruleSingleFormulaSpecification();

        state._fsp--;

        current = iv_ruleSingleFormulaSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSingleFormulaSpecification"

  // $ANTLR start "ruleSingleFormulaSpecification"
  // InternalMdxParser.g:214:1: ruleSingleFormulaSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_MemberSpecification_0= ruleMemberSpecification |
  // this_SetSpecification_1= ruleSetSpecification ) ;
  public final AntlrDatatypeRuleToken ruleSingleFormulaSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_MemberSpecification_0 = null;

    AntlrDatatypeRuleToken this_SetSpecification_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:220:2: ( (this_MemberSpecification_0=
      // ruleMemberSpecification | this_SetSpecification_1= ruleSetSpecification ) )
      // InternalMdxParser.g:221:2: (this_MemberSpecification_0=
      // ruleMemberSpecification | this_SetSpecification_1= ruleSetSpecification )
      {
        // InternalMdxParser.g:221:2: (this_MemberSpecification_0=
        // ruleMemberSpecification | this_SetSpecification_1= ruleSetSpecification )
        int alt6 = 2;
        int LA6_0 = input.LA(1);

        if ((LA6_0 == MEMBER)) {
          alt6 = 1;
        } else if ((LA6_0 == SET)) {
          alt6 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

          throw nvae;
        }
        switch (alt6) {
        case 1:
        // InternalMdxParser.g:222:3: this_MemberSpecification_0=
        // ruleMemberSpecification
        {

          newCompositeNode(
              grammarAccess.getSingleFormulaSpecificationAccess().getMemberSpecificationParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_MemberSpecification_0 = ruleMemberSpecification();

          state._fsp--;

          current.merge(this_MemberSpecification_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:233:3: this_SetSpecification_1= ruleSetSpecification
        {

          newCompositeNode(grammarAccess.getSingleFormulaSpecificationAccess().getSetSpecificationParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_SetSpecification_1 = ruleSetSpecification();

          state._fsp--;

          current.merge(this_SetSpecification_1);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSingleFormulaSpecification"

  // $ANTLR start "entryRuleSetSpecification"
  // InternalMdxParser.g:247:1: entryRuleSetSpecification returns [String
  // current=null] : iv_ruleSetSpecification= ruleSetSpecification EOF ;
  public final String entryRuleSetSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleSetSpecification = null;

    try {
      // InternalMdxParser.g:247:56: (iv_ruleSetSpecification= ruleSetSpecification
      // EOF )
      // InternalMdxParser.g:248:2: iv_ruleSetSpecification= ruleSetSpecification EOF
      {
        newCompositeNode(grammarAccess.getSetSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleSetSpecification = ruleSetSpecification();

        state._fsp--;

        current = iv_ruleSetSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSetSpecification"

  // $ANTLR start "ruleSetSpecification"
  // InternalMdxParser.g:254:1: ruleSetSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= SET
  // this_SetName_1= ruleSetName kw= AS ( (this_QUOTE_3= ruleQUOTE
  // this_Expression_4= ruleExpression this_QUOTE_5= ruleQUOTE ) |
  // this_Expression_6= ruleExpression ) ) ;
  public final AntlrDatatypeRuleToken ruleSetSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_SetName_1 = null;

    AntlrDatatypeRuleToken this_QUOTE_3 = null;

    AntlrDatatypeRuleToken this_Expression_4 = null;

    AntlrDatatypeRuleToken this_QUOTE_5 = null;

    AntlrDatatypeRuleToken this_Expression_6 = null;

    enterRule();

    try {
      // InternalMdxParser.g:260:2: ( (kw= SET this_SetName_1= ruleSetName kw= AS (
      // (this_QUOTE_3= ruleQUOTE this_Expression_4= ruleExpression this_QUOTE_5=
      // ruleQUOTE ) | this_Expression_6= ruleExpression ) ) )
      // InternalMdxParser.g:261:2: (kw= SET this_SetName_1= ruleSetName kw= AS (
      // (this_QUOTE_3= ruleQUOTE this_Expression_4= ruleExpression this_QUOTE_5=
      // ruleQUOTE ) | this_Expression_6= ruleExpression ) )
      {
        // InternalMdxParser.g:261:2: (kw= SET this_SetName_1= ruleSetName kw= AS (
        // (this_QUOTE_3= ruleQUOTE this_Expression_4= ruleExpression this_QUOTE_5=
        // ruleQUOTE ) | this_Expression_6= ruleExpression ) )
        // InternalMdxParser.g:262:3: kw= SET this_SetName_1= ruleSetName kw= AS (
        // (this_QUOTE_3= ruleQUOTE this_Expression_4= ruleExpression this_QUOTE_5=
        // ruleQUOTE ) | this_Expression_6= ruleExpression )
        {
          kw = (Token) match(input, SET, FOLLOW_7);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getSetSpecificationAccess().getSETKeyword_0());

          newCompositeNode(grammarAccess.getSetSpecificationAccess().getSetNameParserRuleCall_1());

          pushFollow(FOLLOW_12);
          this_SetName_1 = ruleSetName();

          state._fsp--;

          current.merge(this_SetName_1);

          afterParserOrEnumRuleCall();

          kw = (Token) match(input, AS, FOLLOW_13);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getSetSpecificationAccess().getASKeyword_2());

          // InternalMdxParser.g:282:3: ( (this_QUOTE_3= ruleQUOTE this_Expression_4=
          // ruleExpression this_QUOTE_5= ruleQUOTE ) | this_Expression_6= ruleExpression
          // )
          int alt7 = 2;
          int LA7_0 = input.LA(1);

          if ((LA7_0 == Apostrophe)) {
            alt7 = 1;
          } else if (((LA7_0 >= PROPERTIES && LA7_0 <= DIMENSION) || LA7_0 == CASE || LA7_0 == NOT
              || LA7_0 == LeftParenthesis || LA7_0 == PlusSign || LA7_0 == HyphenMinus || LA7_0 == LeftCurlyBracket
              || LA7_0 == RULE_ID || LA7_0 == RULE_QUOTED_ID || (LA7_0 >= RULE_INT && LA7_0 <= RULE_STRING))) {
            alt7 = 2;
          } else {
            NoViableAltException nvae = new NoViableAltException("", 7, 0, input);

            throw nvae;
          }
          switch (alt7) {
          case 1:
          // InternalMdxParser.g:283:4: (this_QUOTE_3= ruleQUOTE this_Expression_4=
          // ruleExpression this_QUOTE_5= ruleQUOTE )
          {
            // InternalMdxParser.g:283:4: (this_QUOTE_3= ruleQUOTE this_Expression_4=
            // ruleExpression this_QUOTE_5= ruleQUOTE )
            // InternalMdxParser.g:284:5: this_QUOTE_3= ruleQUOTE this_Expression_4=
            // ruleExpression this_QUOTE_5= ruleQUOTE
            {

              newCompositeNode(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_0());

              pushFollow(FOLLOW_9);
              this_QUOTE_3 = ruleQUOTE();

              state._fsp--;

              current.merge(this_QUOTE_3);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_0_1());

              pushFollow(FOLLOW_14);
              this_Expression_4 = ruleExpression();

              state._fsp--;

              current.merge(this_Expression_4);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getSetSpecificationAccess().getQUOTEParserRuleCall_3_0_2());

              pushFollow(FOLLOW_2);
              this_QUOTE_5 = ruleQUOTE();

              state._fsp--;

              current.merge(this_QUOTE_5);

              afterParserOrEnumRuleCall();

            }

          }
            break;
          case 2:
          // InternalMdxParser.g:316:4: this_Expression_6= ruleExpression
          {

            newCompositeNode(grammarAccess.getSetSpecificationAccess().getExpressionParserRuleCall_3_1());

            pushFollow(FOLLOW_2);
            this_Expression_6 = ruleExpression();

            state._fsp--;

            current.merge(this_Expression_6);

            afterParserOrEnumRuleCall();

          }
            break;

          }

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSetSpecification"

  // $ANTLR start "entryRuleMemberSpecification"
  // InternalMdxParser.g:331:1: entryRuleMemberSpecification returns [String
  // current=null] : iv_ruleMemberSpecification= ruleMemberSpecification EOF ;
  public final String entryRuleMemberSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMemberSpecification = null;

    try {
      // InternalMdxParser.g:331:59: (iv_ruleMemberSpecification=
      // ruleMemberSpecification EOF )
      // InternalMdxParser.g:332:2: iv_ruleMemberSpecification=
      // ruleMemberSpecification EOF
      {
        newCompositeNode(grammarAccess.getMemberSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleMemberSpecification = ruleMemberSpecification();

        state._fsp--;

        current = iv_ruleMemberSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMemberSpecification"

  // $ANTLR start "ruleMemberSpecification"
  // InternalMdxParser.g:338:1: ruleMemberSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MEMBER
  // this_MemberName_1= ruleMemberName kw= AS ( ( (this_QUOTE_3= ruleQUOTE
  // this_ValueExpression_4= ruleValueExpression this_QUOTE_5= ruleQUOTE ) |
  // this_ValueExpression_6= ruleValueExpression ) this_COMMA_7= ruleCOMMA
  // (this_MemberPropertyDefList_8= ruleMemberPropertyDefList )? ) ) ;
  public final AntlrDatatypeRuleToken ruleMemberSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_MemberName_1 = null;

    AntlrDatatypeRuleToken this_QUOTE_3 = null;

    AntlrDatatypeRuleToken this_ValueExpression_4 = null;

    AntlrDatatypeRuleToken this_QUOTE_5 = null;

    AntlrDatatypeRuleToken this_ValueExpression_6 = null;

    AntlrDatatypeRuleToken this_COMMA_7 = null;

    AntlrDatatypeRuleToken this_MemberPropertyDefList_8 = null;

    enterRule();

    try {
      // InternalMdxParser.g:344:2: ( (kw= MEMBER this_MemberName_1= ruleMemberName
      // kw= AS ( ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
      // ruleValueExpression this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6=
      // ruleValueExpression ) this_COMMA_7= ruleCOMMA (this_MemberPropertyDefList_8=
      // ruleMemberPropertyDefList )? ) ) )
      // InternalMdxParser.g:345:2: (kw= MEMBER this_MemberName_1= ruleMemberName kw=
      // AS ( ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4= ruleValueExpression
      // this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6= ruleValueExpression )
      // this_COMMA_7= ruleCOMMA (this_MemberPropertyDefList_8=
      // ruleMemberPropertyDefList )? ) )
      {
        // InternalMdxParser.g:345:2: (kw= MEMBER this_MemberName_1= ruleMemberName kw=
        // AS ( ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4= ruleValueExpression
        // this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6= ruleValueExpression )
        // this_COMMA_7= ruleCOMMA (this_MemberPropertyDefList_8=
        // ruleMemberPropertyDefList )? ) )
        // InternalMdxParser.g:346:3: kw= MEMBER this_MemberName_1= ruleMemberName kw=
        // AS ( ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4= ruleValueExpression
        // this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6= ruleValueExpression )
        // this_COMMA_7= ruleCOMMA (this_MemberPropertyDefList_8=
        // ruleMemberPropertyDefList )? )
        {
          kw = (Token) match(input, MEMBER, FOLLOW_7);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getMemberSpecificationAccess().getMEMBERKeyword_0());

          newCompositeNode(grammarAccess.getMemberSpecificationAccess().getMemberNameParserRuleCall_1());

          pushFollow(FOLLOW_12);
          this_MemberName_1 = ruleMemberName();

          state._fsp--;

          current.merge(this_MemberName_1);

          afterParserOrEnumRuleCall();

          kw = (Token) match(input, AS, FOLLOW_13);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getMemberSpecificationAccess().getASKeyword_2());

          // InternalMdxParser.g:366:3: ( ( (this_QUOTE_3= ruleQUOTE
          // this_ValueExpression_4= ruleValueExpression this_QUOTE_5= ruleQUOTE ) |
          // this_ValueExpression_6= ruleValueExpression ) this_COMMA_7= ruleCOMMA
          // (this_MemberPropertyDefList_8= ruleMemberPropertyDefList )? )
          // InternalMdxParser.g:367:4: ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
          // ruleValueExpression this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6=
          // ruleValueExpression ) this_COMMA_7= ruleCOMMA (this_MemberPropertyDefList_8=
          // ruleMemberPropertyDefList )?
          {
            // InternalMdxParser.g:367:4: ( (this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
            // ruleValueExpression this_QUOTE_5= ruleQUOTE ) | this_ValueExpression_6=
            // ruleValueExpression )
            int alt8 = 2;
            int LA8_0 = input.LA(1);

            if ((LA8_0 == Apostrophe)) {
              alt8 = 1;
            } else if (((LA8_0 >= PROPERTIES && LA8_0 <= DIMENSION) || LA8_0 == CASE || LA8_0 == NOT
                || LA8_0 == LeftParenthesis || LA8_0 == PlusSign || LA8_0 == HyphenMinus || LA8_0 == LeftCurlyBracket
                || LA8_0 == RULE_ID || LA8_0 == RULE_QUOTED_ID || (LA8_0 >= RULE_INT && LA8_0 <= RULE_STRING))) {
              alt8 = 2;
            } else {
              NoViableAltException nvae = new NoViableAltException("", 8, 0, input);

              throw nvae;
            }
            switch (alt8) {
            case 1:
            // InternalMdxParser.g:368:5: (this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
            // ruleValueExpression this_QUOTE_5= ruleQUOTE )
            {
              // InternalMdxParser.g:368:5: (this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
              // ruleValueExpression this_QUOTE_5= ruleQUOTE )
              // InternalMdxParser.g:369:6: this_QUOTE_3= ruleQUOTE this_ValueExpression_4=
              // ruleValueExpression this_QUOTE_5= ruleQUOTE
              {

                newCompositeNode(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_0());

                pushFollow(FOLLOW_9);
                this_QUOTE_3 = ruleQUOTE();

                state._fsp--;

                current.merge(this_QUOTE_3);

                afterParserOrEnumRuleCall();

                newCompositeNode(
                    grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_0_1());

                pushFollow(FOLLOW_14);
                this_ValueExpression_4 = ruleValueExpression();

                state._fsp--;

                current.merge(this_ValueExpression_4);

                afterParserOrEnumRuleCall();

                newCompositeNode(grammarAccess.getMemberSpecificationAccess().getQUOTEParserRuleCall_3_0_0_2());

                pushFollow(FOLLOW_15);
                this_QUOTE_5 = ruleQUOTE();

                state._fsp--;

                current.merge(this_QUOTE_5);

                afterParserOrEnumRuleCall();

              }

            }
              break;
            case 2:
            // InternalMdxParser.g:401:5: this_ValueExpression_6= ruleValueExpression
            {

              newCompositeNode(grammarAccess.getMemberSpecificationAccess().getValueExpressionParserRuleCall_3_0_1());

              pushFollow(FOLLOW_15);
              this_ValueExpression_6 = ruleValueExpression();

              state._fsp--;

              current.merge(this_ValueExpression_6);

              afterParserOrEnumRuleCall();

            }
              break;

            }

            newCompositeNode(grammarAccess.getMemberSpecificationAccess().getCOMMAParserRuleCall_3_1());

            pushFollow(FOLLOW_16);
            this_COMMA_7 = ruleCOMMA();

            state._fsp--;

            current.merge(this_COMMA_7);

            afterParserOrEnumRuleCall();

            // InternalMdxParser.g:422:4: (this_MemberPropertyDefList_8=
            // ruleMemberPropertyDefList )?
            int alt9 = 2;
            int LA9_0 = input.LA(1);

            if (((LA9_0 >= PROPERTIES && LA9_0 <= DIMENSION) || LA9_0 == RULE_ID || LA9_0 == RULE_QUOTED_ID)) {
              alt9 = 1;
            }
            switch (alt9) {
            case 1:
            // InternalMdxParser.g:423:5: this_MemberPropertyDefList_8=
            // ruleMemberPropertyDefList
            {

              newCompositeNode(
                  grammarAccess.getMemberSpecificationAccess().getMemberPropertyDefListParserRuleCall_3_2());

              pushFollow(FOLLOW_2);
              this_MemberPropertyDefList_8 = ruleMemberPropertyDefList();

              state._fsp--;

              current.merge(this_MemberPropertyDefList_8);

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
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMemberSpecification"

  // $ANTLR start "entryRuleAxisSpecificationList"
  // InternalMdxParser.g:439:1: entryRuleAxisSpecificationList returns [String
  // current=null] : iv_ruleAxisSpecificationList= ruleAxisSpecificationList EOF ;
  public final String entryRuleAxisSpecificationList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleAxisSpecificationList = null;

    try {
      // InternalMdxParser.g:439:61: (iv_ruleAxisSpecificationList=
      // ruleAxisSpecificationList EOF )
      // InternalMdxParser.g:440:2: iv_ruleAxisSpecificationList=
      // ruleAxisSpecificationList EOF
      {
        newCompositeNode(grammarAccess.getAxisSpecificationListRule());
        pushFollow(FOLLOW_1);
        iv_ruleAxisSpecificationList = ruleAxisSpecificationList();

        state._fsp--;

        current = iv_ruleAxisSpecificationList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleAxisSpecificationList"

  // $ANTLR start "ruleAxisSpecificationList"
  // InternalMdxParser.g:446:1: ruleAxisSpecificationList returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_AxisSpecification_0= ruleAxisSpecification (this_COMMA_1= ruleCOMMA
  // this_AxisSpecification_2= ruleAxisSpecification )* ) ;
  public final AntlrDatatypeRuleToken ruleAxisSpecificationList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_AxisSpecification_0 = null;

    AntlrDatatypeRuleToken this_COMMA_1 = null;

    AntlrDatatypeRuleToken this_AxisSpecification_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:452:2: ( (this_AxisSpecification_0= ruleAxisSpecification
      // (this_COMMA_1= ruleCOMMA this_AxisSpecification_2= ruleAxisSpecification )* )
      // )
      // InternalMdxParser.g:453:2: (this_AxisSpecification_0= ruleAxisSpecification
      // (this_COMMA_1= ruleCOMMA this_AxisSpecification_2= ruleAxisSpecification )* )
      {
        // InternalMdxParser.g:453:2: (this_AxisSpecification_0= ruleAxisSpecification
        // (this_COMMA_1= ruleCOMMA this_AxisSpecification_2= ruleAxisSpecification )* )
        // InternalMdxParser.g:454:3: this_AxisSpecification_0= ruleAxisSpecification
        // (this_COMMA_1= ruleCOMMA this_AxisSpecification_2= ruleAxisSpecification )*
        {

          newCompositeNode(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_0());

          pushFollow(FOLLOW_17);
          this_AxisSpecification_0 = ruleAxisSpecification();

          state._fsp--;

          current.merge(this_AxisSpecification_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:464:3: (this_COMMA_1= ruleCOMMA this_AxisSpecification_2=
          // ruleAxisSpecification )*
          loop10: do {
            int alt10 = 2;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == Comma)) {
              alt10 = 1;
            }

            switch (alt10) {
            case 1:
            // InternalMdxParser.g:465:4: this_COMMA_1= ruleCOMMA this_AxisSpecification_2=
            // ruleAxisSpecification
            {

              newCompositeNode(grammarAccess.getAxisSpecificationListAccess().getCOMMAParserRuleCall_1_0());

              pushFollow(FOLLOW_9);
              this_COMMA_1 = ruleCOMMA();

              state._fsp--;

              current.merge(this_COMMA_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getAxisSpecificationListAccess().getAxisSpecificationParserRuleCall_1_1());

              pushFollow(FOLLOW_17);
              this_AxisSpecification_2 = ruleAxisSpecification();

              state._fsp--;

              current.merge(this_AxisSpecification_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop10;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleAxisSpecificationList"

  // $ANTLR start "entryRuleMemberPropertyDefList"
  // InternalMdxParser.g:490:1: entryRuleMemberPropertyDefList returns [String
  // current=null] : iv_ruleMemberPropertyDefList= ruleMemberPropertyDefList EOF ;
  public final String entryRuleMemberPropertyDefList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMemberPropertyDefList = null;

    try {
      // InternalMdxParser.g:490:61: (iv_ruleMemberPropertyDefList=
      // ruleMemberPropertyDefList EOF )
      // InternalMdxParser.g:491:2: iv_ruleMemberPropertyDefList=
      // ruleMemberPropertyDefList EOF
      {
        newCompositeNode(grammarAccess.getMemberPropertyDefListRule());
        pushFollow(FOLLOW_1);
        iv_ruleMemberPropertyDefList = ruleMemberPropertyDefList();

        state._fsp--;

        current = iv_ruleMemberPropertyDefList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMemberPropertyDefList"

  // $ANTLR start "ruleMemberPropertyDefList"
  // InternalMdxParser.g:497:1: ruleMemberPropertyDefList returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_MemberPropertyDefinition_0= ruleMemberPropertyDefinition (this_COMMA_1=
  // ruleCOMMA this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )* )
  // ;
  public final AntlrDatatypeRuleToken ruleMemberPropertyDefList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_MemberPropertyDefinition_0 = null;

    AntlrDatatypeRuleToken this_COMMA_1 = null;

    AntlrDatatypeRuleToken this_MemberPropertyDefinition_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:503:2: ( (this_MemberPropertyDefinition_0=
      // ruleMemberPropertyDefinition (this_COMMA_1= ruleCOMMA
      // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )* ) )
      // InternalMdxParser.g:504:2: (this_MemberPropertyDefinition_0=
      // ruleMemberPropertyDefinition (this_COMMA_1= ruleCOMMA
      // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )* )
      {
        // InternalMdxParser.g:504:2: (this_MemberPropertyDefinition_0=
        // ruleMemberPropertyDefinition (this_COMMA_1= ruleCOMMA
        // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )* )
        // InternalMdxParser.g:505:3: this_MemberPropertyDefinition_0=
        // ruleMemberPropertyDefinition (this_COMMA_1= ruleCOMMA
        // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )*
        {

          newCompositeNode(
              grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_0());

          pushFollow(FOLLOW_17);
          this_MemberPropertyDefinition_0 = ruleMemberPropertyDefinition();

          state._fsp--;

          current.merge(this_MemberPropertyDefinition_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:515:3: (this_COMMA_1= ruleCOMMA
          // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition )*
          loop11: do {
            int alt11 = 2;
            int LA11_0 = input.LA(1);

            if ((LA11_0 == Comma)) {
              alt11 = 1;
            }

            switch (alt11) {
            case 1:
            // InternalMdxParser.g:516:4: this_COMMA_1= ruleCOMMA
            // this_MemberPropertyDefinition_2= ruleMemberPropertyDefinition
            {

              newCompositeNode(grammarAccess.getMemberPropertyDefListAccess().getCOMMAParserRuleCall_1_0());

              pushFollow(FOLLOW_7);
              this_COMMA_1 = ruleCOMMA();

              state._fsp--;

              current.merge(this_COMMA_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(
                  grammarAccess.getMemberPropertyDefListAccess().getMemberPropertyDefinitionParserRuleCall_1_1());

              pushFollow(FOLLOW_17);
              this_MemberPropertyDefinition_2 = ruleMemberPropertyDefinition();

              state._fsp--;

              current.merge(this_MemberPropertyDefinition_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop11;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMemberPropertyDefList"

  // $ANTLR start "entryRuleMemberName"
  // InternalMdxParser.g:541:1: entryRuleMemberName returns [String current=null]
  // : iv_ruleMemberName= ruleMemberName EOF ;
  public final String entryRuleMemberName() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMemberName = null;

    try {
      // InternalMdxParser.g:541:50: (iv_ruleMemberName= ruleMemberName EOF )
      // InternalMdxParser.g:542:2: iv_ruleMemberName= ruleMemberName EOF
      {
        newCompositeNode(grammarAccess.getMemberNameRule());
        pushFollow(FOLLOW_1);
        iv_ruleMemberName = ruleMemberName();

        state._fsp--;

        current = iv_ruleMemberName.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMemberName"

  // $ANTLR start "ruleMemberName"
  // InternalMdxParser.g:548:1: ruleMemberName returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : this_CompoundId_0= ruleCompoundId ;
  public final AntlrDatatypeRuleToken ruleMemberName() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CompoundId_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:554:2: (this_CompoundId_0= ruleCompoundId )
      // InternalMdxParser.g:555:2: this_CompoundId_0= ruleCompoundId
      {

        newCompositeNode(grammarAccess.getMemberNameAccess().getCompoundIdParserRuleCall());

        pushFollow(FOLLOW_2);
        this_CompoundId_0 = ruleCompoundId();

        state._fsp--;

        current.merge(this_CompoundId_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMemberName"

  // $ANTLR start "entryRuleMemberPropertyDefinition"
  // InternalMdxParser.g:568:1: entryRuleMemberPropertyDefinition returns [String
  // current=null] : iv_ruleMemberPropertyDefinition= ruleMemberPropertyDefinition
  // EOF ;
  public final String entryRuleMemberPropertyDefinition() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMemberPropertyDefinition = null;

    try {
      // InternalMdxParser.g:568:64: (iv_ruleMemberPropertyDefinition=
      // ruleMemberPropertyDefinition EOF )
      // InternalMdxParser.g:569:2: iv_ruleMemberPropertyDefinition=
      // ruleMemberPropertyDefinition EOF
      {
        newCompositeNode(grammarAccess.getMemberPropertyDefinitionRule());
        pushFollow(FOLLOW_1);
        iv_ruleMemberPropertyDefinition = ruleMemberPropertyDefinition();

        state._fsp--;

        current = iv_ruleMemberPropertyDefinition.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMemberPropertyDefinition"

  // $ANTLR start "ruleMemberPropertyDefinition"
  // InternalMdxParser.g:575:1: ruleMemberPropertyDefinition returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_Identifier_0= ruleIdentifier this_EQ_1= ruleEQ this_ValueExpression_2=
  // ruleValueExpression ) ;
  public final AntlrDatatypeRuleToken ruleMemberPropertyDefinition() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Identifier_0 = null;

    AntlrDatatypeRuleToken this_EQ_1 = null;

    AntlrDatatypeRuleToken this_ValueExpression_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:581:2: ( (this_Identifier_0= ruleIdentifier this_EQ_1=
      // ruleEQ this_ValueExpression_2= ruleValueExpression ) )
      // InternalMdxParser.g:582:2: (this_Identifier_0= ruleIdentifier this_EQ_1=
      // ruleEQ this_ValueExpression_2= ruleValueExpression )
      {
        // InternalMdxParser.g:582:2: (this_Identifier_0= ruleIdentifier this_EQ_1=
        // ruleEQ this_ValueExpression_2= ruleValueExpression )
        // InternalMdxParser.g:583:3: this_Identifier_0= ruleIdentifier this_EQ_1=
        // ruleEQ this_ValueExpression_2= ruleValueExpression
        {

          newCompositeNode(grammarAccess.getMemberPropertyDefinitionAccess().getIdentifierParserRuleCall_0());

          pushFollow(FOLLOW_18);
          this_Identifier_0 = ruleIdentifier();

          state._fsp--;

          current.merge(this_Identifier_0);

          afterParserOrEnumRuleCall();

          newCompositeNode(grammarAccess.getMemberPropertyDefinitionAccess().getEQParserRuleCall_1());

          pushFollow(FOLLOW_9);
          this_EQ_1 = ruleEQ();

          state._fsp--;

          current.merge(this_EQ_1);

          afterParserOrEnumRuleCall();

          newCompositeNode(grammarAccess.getMemberPropertyDefinitionAccess().getValueExpressionParserRuleCall_2());

          pushFollow(FOLLOW_2);
          this_ValueExpression_2 = ruleValueExpression();

          state._fsp--;

          current.merge(this_ValueExpression_2);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMemberPropertyDefinition"

  // $ANTLR start "entryRuleSetName"
  // InternalMdxParser.g:617:1: entryRuleSetName returns [String current=null] :
  // iv_ruleSetName= ruleSetName EOF ;
  public final String entryRuleSetName() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleSetName = null;

    try {
      // InternalMdxParser.g:617:47: (iv_ruleSetName= ruleSetName EOF )
      // InternalMdxParser.g:618:2: iv_ruleSetName= ruleSetName EOF
      {
        newCompositeNode(grammarAccess.getSetNameRule());
        pushFollow(FOLLOW_1);
        iv_ruleSetName = ruleSetName();

        state._fsp--;

        current = iv_ruleSetName.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSetName"

  // $ANTLR start "ruleSetName"
  // InternalMdxParser.g:624:1: ruleSetName returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : this_CompoundId_0= ruleCompoundId ;
  public final AntlrDatatypeRuleToken ruleSetName() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CompoundId_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:630:2: (this_CompoundId_0= ruleCompoundId )
      // InternalMdxParser.g:631:2: this_CompoundId_0= ruleCompoundId
      {

        newCompositeNode(grammarAccess.getSetNameAccess().getCompoundIdParserRuleCall());

        pushFollow(FOLLOW_2);
        this_CompoundId_0 = ruleCompoundId();

        state._fsp--;

        current.merge(this_CompoundId_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSetName"

  // $ANTLR start "entryRuleCompoundId"
  // InternalMdxParser.g:644:1: entryRuleCompoundId returns [String current=null]
  // : iv_ruleCompoundId= ruleCompoundId EOF ;
  public final String entryRuleCompoundId() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCompoundId = null;

    try {
      // InternalMdxParser.g:644:50: (iv_ruleCompoundId= ruleCompoundId EOF )
      // InternalMdxParser.g:645:2: iv_ruleCompoundId= ruleCompoundId EOF
      {
        newCompositeNode(grammarAccess.getCompoundIdRule());
        pushFollow(FOLLOW_1);
        iv_ruleCompoundId = ruleCompoundId();

        state._fsp--;

        current = iv_ruleCompoundId.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCompoundId"

  // $ANTLR start "ruleCompoundId"
  // InternalMdxParser.g:651:1: ruleCompoundId returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Identifier_0= ruleIdentifier
  // (this_DOT_1= ruleDOT this_Identifier_2= ruleIdentifier )* ) ;
  public final AntlrDatatypeRuleToken ruleCompoundId() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Identifier_0 = null;

    AntlrDatatypeRuleToken this_DOT_1 = null;

    AntlrDatatypeRuleToken this_Identifier_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:657:2: ( (this_Identifier_0= ruleIdentifier (this_DOT_1=
      // ruleDOT this_Identifier_2= ruleIdentifier )* ) )
      // InternalMdxParser.g:658:2: (this_Identifier_0= ruleIdentifier (this_DOT_1=
      // ruleDOT this_Identifier_2= ruleIdentifier )* )
      {
        // InternalMdxParser.g:658:2: (this_Identifier_0= ruleIdentifier (this_DOT_1=
        // ruleDOT this_Identifier_2= ruleIdentifier )* )
        // InternalMdxParser.g:659:3: this_Identifier_0= ruleIdentifier (this_DOT_1=
        // ruleDOT this_Identifier_2= ruleIdentifier )*
        {

          newCompositeNode(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_0());

          pushFollow(FOLLOW_19);
          this_Identifier_0 = ruleIdentifier();

          state._fsp--;

          current.merge(this_Identifier_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:669:3: (this_DOT_1= ruleDOT this_Identifier_2=
          // ruleIdentifier )*
          loop12: do {
            int alt12 = 2;
            int LA12_0 = input.LA(1);

            if ((LA12_0 == FullStop)) {
              alt12 = 1;
            }

            switch (alt12) {
            case 1:
            // InternalMdxParser.g:670:4: this_DOT_1= ruleDOT this_Identifier_2=
            // ruleIdentifier
            {

              newCompositeNode(grammarAccess.getCompoundIdAccess().getDOTParserRuleCall_1_0());

              pushFollow(FOLLOW_7);
              this_DOT_1 = ruleDOT();

              state._fsp--;

              current.merge(this_DOT_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getCompoundIdAccess().getIdentifierParserRuleCall_1_1());

              pushFollow(FOLLOW_19);
              this_Identifier_2 = ruleIdentifier();

              state._fsp--;

              current.merge(this_Identifier_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop12;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCompoundId"

  // $ANTLR start "entryRuleAxisSpecification"
  // InternalMdxParser.g:695:1: entryRuleAxisSpecification returns [String
  // current=null] : iv_ruleAxisSpecification= ruleAxisSpecification EOF ;
  public final String entryRuleAxisSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleAxisSpecification = null;

    try {
      // InternalMdxParser.g:695:57: (iv_ruleAxisSpecification= ruleAxisSpecification
      // EOF )
      // InternalMdxParser.g:696:2: iv_ruleAxisSpecification= ruleAxisSpecification
      // EOF
      {
        newCompositeNode(grammarAccess.getAxisSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleAxisSpecification = ruleAxisSpecification();

        state._fsp--;

        current = iv_ruleAxisSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleAxisSpecification"

  // $ANTLR start "ruleAxisSpecification"
  // InternalMdxParser.g:702:1: ruleAxisSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NON
  // kw= EMPTY )? this_Expression_2= ruleExpression (this_DimProperties_3=
  // ruleDimProperties )? kw= ON this_AxisName_5= ruleAxisName ) ;
  public final AntlrDatatypeRuleToken ruleAxisSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_Expression_2 = null;

    AntlrDatatypeRuleToken this_DimProperties_3 = null;

    AntlrDatatypeRuleToken this_AxisName_5 = null;

    enterRule();

    try {
      // InternalMdxParser.g:708:2: ( ( (kw= NON kw= EMPTY )? this_Expression_2=
      // ruleExpression (this_DimProperties_3= ruleDimProperties )? kw= ON
      // this_AxisName_5= ruleAxisName ) )
      // InternalMdxParser.g:709:2: ( (kw= NON kw= EMPTY )? this_Expression_2=
      // ruleExpression (this_DimProperties_3= ruleDimProperties )? kw= ON
      // this_AxisName_5= ruleAxisName )
      {
        // InternalMdxParser.g:709:2: ( (kw= NON kw= EMPTY )? this_Expression_2=
        // ruleExpression (this_DimProperties_3= ruleDimProperties )? kw= ON
        // this_AxisName_5= ruleAxisName )
        // InternalMdxParser.g:710:3: (kw= NON kw= EMPTY )? this_Expression_2=
        // ruleExpression (this_DimProperties_3= ruleDimProperties )? kw= ON
        // this_AxisName_5= ruleAxisName
        {
          // InternalMdxParser.g:710:3: (kw= NON kw= EMPTY )?
          int alt13 = 2;
          int LA13_0 = input.LA(1);

          if ((LA13_0 == NON)) {
            alt13 = 1;
          }
          switch (alt13) {
          case 1:
          // InternalMdxParser.g:711:4: kw= NON kw= EMPTY
          {
            kw = (Token) match(input, NON, FOLLOW_20);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getAxisSpecificationAccess().getNONKeyword_0_0());

            kw = (Token) match(input, EMPTY, FOLLOW_9);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getAxisSpecificationAccess().getEMPTYKeyword_0_1());

          }
            break;

          }

          newCompositeNode(grammarAccess.getAxisSpecificationAccess().getExpressionParserRuleCall_1());

          pushFollow(FOLLOW_21);
          this_Expression_2 = ruleExpression();

          state._fsp--;

          current.merge(this_Expression_2);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:732:3: (this_DimProperties_3= ruleDimProperties )?
          int alt14 = 2;
          int LA14_0 = input.LA(1);

          if (((LA14_0 >= PROPERTIES && LA14_0 <= DIMENSION))) {
            alt14 = 1;
          }
          switch (alt14) {
          case 1:
          // InternalMdxParser.g:733:4: this_DimProperties_3= ruleDimProperties
          {

            newCompositeNode(grammarAccess.getAxisSpecificationAccess().getDimPropertiesParserRuleCall_2());

            pushFollow(FOLLOW_22);
            this_DimProperties_3 = ruleDimProperties();

            state._fsp--;

            current.merge(this_DimProperties_3);

            afterParserOrEnumRuleCall();

          }
            break;

          }

          kw = (Token) match(input, ON, FOLLOW_7);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getAxisSpecificationAccess().getONKeyword_3());

          newCompositeNode(grammarAccess.getAxisSpecificationAccess().getAxisNameParserRuleCall_4());

          pushFollow(FOLLOW_2);
          this_AxisName_5 = ruleAxisName();

          state._fsp--;

          current.merge(this_AxisName_5);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleAxisSpecification"

  // $ANTLR start "entryRuleAxisName"
  // InternalMdxParser.g:763:1: entryRuleAxisName returns [String current=null] :
  // iv_ruleAxisName= ruleAxisName EOF ;
  public final String entryRuleAxisName() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleAxisName = null;

    try {
      // InternalMdxParser.g:763:48: (iv_ruleAxisName= ruleAxisName EOF )
      // InternalMdxParser.g:764:2: iv_ruleAxisName= ruleAxisName EOF
      {
        newCompositeNode(grammarAccess.getAxisNameRule());
        pushFollow(FOLLOW_1);
        iv_ruleAxisName = ruleAxisName();

        state._fsp--;

        current = iv_ruleAxisName.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleAxisName"

  // $ANTLR start "ruleAxisName"
  // InternalMdxParser.g:770:1: ruleAxisName returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
  public final AntlrDatatypeRuleToken ruleAxisName() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Identifier_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:776:2: (this_Identifier_0= ruleIdentifier )
      // InternalMdxParser.g:777:2: this_Identifier_0= ruleIdentifier
      {

        newCompositeNode(grammarAccess.getAxisNameAccess().getIdentifierParserRuleCall());

        pushFollow(FOLLOW_2);
        this_Identifier_0 = ruleIdentifier();

        state._fsp--;

        current.merge(this_Identifier_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleAxisName"

  // $ANTLR start "entryRuleDimProperties"
  // InternalMdxParser.g:790:1: entryRuleDimProperties returns [String
  // current=null] : iv_ruleDimProperties= ruleDimProperties EOF ;
  public final String entryRuleDimProperties() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleDimProperties = null;

    try {
      // InternalMdxParser.g:790:53: (iv_ruleDimProperties= ruleDimProperties EOF )
      // InternalMdxParser.g:791:2: iv_ruleDimProperties= ruleDimProperties EOF
      {
        newCompositeNode(grammarAccess.getDimPropertiesRule());
        pushFollow(FOLLOW_1);
        iv_ruleDimProperties = ruleDimProperties();

        state._fsp--;

        current = iv_ruleDimProperties.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleDimProperties"

  // $ANTLR start "ruleDimProperties"
  // InternalMdxParser.g:797:1: ruleDimProperties returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : ( (kw= DIMENSION )? kw= PROPERTIES
  // this_PropertyList_2= rulePropertyList ) ;
  public final AntlrDatatypeRuleToken ruleDimProperties() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_PropertyList_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:803:2: ( ( (kw= DIMENSION )? kw= PROPERTIES
      // this_PropertyList_2= rulePropertyList ) )
      // InternalMdxParser.g:804:2: ( (kw= DIMENSION )? kw= PROPERTIES
      // this_PropertyList_2= rulePropertyList )
      {
        // InternalMdxParser.g:804:2: ( (kw= DIMENSION )? kw= PROPERTIES
        // this_PropertyList_2= rulePropertyList )
        // InternalMdxParser.g:805:3: (kw= DIMENSION )? kw= PROPERTIES
        // this_PropertyList_2= rulePropertyList
        {
          // InternalMdxParser.g:805:3: (kw= DIMENSION )?
          int alt15 = 2;
          int LA15_0 = input.LA(1);

          if ((LA15_0 == DIMENSION)) {
            alt15 = 1;
          }
          switch (alt15) {
          case 1:
          // InternalMdxParser.g:806:4: kw= DIMENSION
          {
            kw = (Token) match(input, DIMENSION, FOLLOW_23);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getDimPropertiesAccess().getDIMENSIONKeyword_0());

          }
            break;

          }

          kw = (Token) match(input, PROPERTIES, FOLLOW_7);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getDimPropertiesAccess().getPROPERTIESKeyword_1());

          newCompositeNode(grammarAccess.getDimPropertiesAccess().getPropertyListParserRuleCall_2());

          pushFollow(FOLLOW_2);
          this_PropertyList_2 = rulePropertyList();

          state._fsp--;

          current.merge(this_PropertyList_2);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleDimProperties"

  // $ANTLR start "entryRulePropertyList"
  // InternalMdxParser.g:831:1: entryRulePropertyList returns [String
  // current=null] : iv_rulePropertyList= rulePropertyList EOF ;
  public final String entryRulePropertyList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_rulePropertyList = null;

    try {
      // InternalMdxParser.g:831:52: (iv_rulePropertyList= rulePropertyList EOF )
      // InternalMdxParser.g:832:2: iv_rulePropertyList= rulePropertyList EOF
      {
        newCompositeNode(grammarAccess.getPropertyListRule());
        pushFollow(FOLLOW_1);
        iv_rulePropertyList = rulePropertyList();

        state._fsp--;

        current = iv_rulePropertyList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRulePropertyList"

  // $ANTLR start "rulePropertyList"
  // InternalMdxParser.g:838:1: rulePropertyList returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Property_0= ruleProperty
  // (this_COMMA_1= ruleCOMMA this_Property_2= ruleProperty )* ) ;
  public final AntlrDatatypeRuleToken rulePropertyList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Property_0 = null;

    AntlrDatatypeRuleToken this_COMMA_1 = null;

    AntlrDatatypeRuleToken this_Property_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:844:2: ( (this_Property_0= ruleProperty (this_COMMA_1=
      // ruleCOMMA this_Property_2= ruleProperty )* ) )
      // InternalMdxParser.g:845:2: (this_Property_0= ruleProperty (this_COMMA_1=
      // ruleCOMMA this_Property_2= ruleProperty )* )
      {
        // InternalMdxParser.g:845:2: (this_Property_0= ruleProperty (this_COMMA_1=
        // ruleCOMMA this_Property_2= ruleProperty )* )
        // InternalMdxParser.g:846:3: this_Property_0= ruleProperty (this_COMMA_1=
        // ruleCOMMA this_Property_2= ruleProperty )*
        {

          newCompositeNode(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_0());

          pushFollow(FOLLOW_17);
          this_Property_0 = ruleProperty();

          state._fsp--;

          current.merge(this_Property_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:856:3: (this_COMMA_1= ruleCOMMA this_Property_2=
          // ruleProperty )*
          loop16: do {
            int alt16 = 2;
            int LA16_0 = input.LA(1);

            if ((LA16_0 == Comma)) {
              alt16 = 1;
            }

            switch (alt16) {
            case 1:
            // InternalMdxParser.g:857:4: this_COMMA_1= ruleCOMMA this_Property_2=
            // ruleProperty
            {

              newCompositeNode(grammarAccess.getPropertyListAccess().getCOMMAParserRuleCall_1_0());

              pushFollow(FOLLOW_7);
              this_COMMA_1 = ruleCOMMA();

              state._fsp--;

              current.merge(this_COMMA_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getPropertyListAccess().getPropertyParserRuleCall_1_1());

              pushFollow(FOLLOW_17);
              this_Property_2 = ruleProperty();

              state._fsp--;

              current.merge(this_Property_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop16;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "rulePropertyList"

  // $ANTLR start "entryRuleProperty"
  // InternalMdxParser.g:882:1: entryRuleProperty returns [String current=null] :
  // iv_ruleProperty= ruleProperty EOF ;
  public final String entryRuleProperty() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleProperty = null;

    try {
      // InternalMdxParser.g:882:48: (iv_ruleProperty= ruleProperty EOF )
      // InternalMdxParser.g:883:2: iv_ruleProperty= ruleProperty EOF
      {
        newCompositeNode(grammarAccess.getPropertyRule());
        pushFollow(FOLLOW_1);
        iv_ruleProperty = ruleProperty();

        state._fsp--;

        current = iv_ruleProperty.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleProperty"

  // $ANTLR start "ruleProperty"
  // InternalMdxParser.g:889:1: ruleProperty returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : this_CompoundId_0= ruleCompoundId ;
  public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CompoundId_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:895:2: (this_CompoundId_0= ruleCompoundId )
      // InternalMdxParser.g:896:2: this_CompoundId_0= ruleCompoundId
      {

        newCompositeNode(grammarAccess.getPropertyAccess().getCompoundIdParserRuleCall());

        pushFollow(FOLLOW_2);
        this_CompoundId_0 = ruleCompoundId();

        state._fsp--;

        current.merge(this_CompoundId_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleProperty"

  // $ANTLR start "entryRuleCubeSpecification"
  // InternalMdxParser.g:909:1: entryRuleCubeSpecification returns [String
  // current=null] : iv_ruleCubeSpecification= ruleCubeSpecification EOF ;
  public final String entryRuleCubeSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCubeSpecification = null;

    try {
      // InternalMdxParser.g:909:57: (iv_ruleCubeSpecification= ruleCubeSpecification
      // EOF )
      // InternalMdxParser.g:910:2: iv_ruleCubeSpecification= ruleCubeSpecification
      // EOF
      {
        newCompositeNode(grammarAccess.getCubeSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleCubeSpecification = ruleCubeSpecification();

        state._fsp--;

        current = iv_ruleCubeSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCubeSpecification"

  // $ANTLR start "ruleCubeSpecification"
  // InternalMdxParser.g:916:1: ruleCubeSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // this_CubeName_0= ruleCubeName ;
  public final AntlrDatatypeRuleToken ruleCubeSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CubeName_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:922:2: (this_CubeName_0= ruleCubeName )
      // InternalMdxParser.g:923:2: this_CubeName_0= ruleCubeName
      {

        newCompositeNode(grammarAccess.getCubeSpecificationAccess().getCubeNameParserRuleCall());

        pushFollow(FOLLOW_2);
        this_CubeName_0 = ruleCubeName();

        state._fsp--;

        current.merge(this_CubeName_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCubeSpecification"

  // $ANTLR start "entryRuleCubeName"
  // InternalMdxParser.g:936:1: entryRuleCubeName returns [String current=null] :
  // iv_ruleCubeName= ruleCubeName EOF ;
  public final String entryRuleCubeName() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCubeName = null;

    try {
      // InternalMdxParser.g:936:48: (iv_ruleCubeName= ruleCubeName EOF )
      // InternalMdxParser.g:937:2: iv_ruleCubeName= ruleCubeName EOF
      {
        newCompositeNode(grammarAccess.getCubeNameRule());
        pushFollow(FOLLOW_1);
        iv_ruleCubeName = ruleCubeName();

        state._fsp--;

        current = iv_ruleCubeName.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCubeName"

  // $ANTLR start "ruleCubeName"
  // InternalMdxParser.g:943:1: ruleCubeName returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : this_CompoundId_0= ruleCompoundId ;
  public final AntlrDatatypeRuleToken ruleCubeName() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CompoundId_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:949:2: (this_CompoundId_0= ruleCompoundId )
      // InternalMdxParser.g:950:2: this_CompoundId_0= ruleCompoundId
      {

        newCompositeNode(grammarAccess.getCubeNameAccess().getCompoundIdParserRuleCall());

        pushFollow(FOLLOW_2);
        this_CompoundId_0 = ruleCompoundId();

        state._fsp--;

        current.merge(this_CompoundId_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCubeName"

  // $ANTLR start "entryRuleSlicerSpecification"
  // InternalMdxParser.g:963:1: entryRuleSlicerSpecification returns [String
  // current=null] : iv_ruleSlicerSpecification= ruleSlicerSpecification EOF ;
  public final String entryRuleSlicerSpecification() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleSlicerSpecification = null;

    try {
      // InternalMdxParser.g:963:59: (iv_ruleSlicerSpecification=
      // ruleSlicerSpecification EOF )
      // InternalMdxParser.g:964:2: iv_ruleSlicerSpecification=
      // ruleSlicerSpecification EOF
      {
        newCompositeNode(grammarAccess.getSlicerSpecificationRule());
        pushFollow(FOLLOW_1);
        iv_ruleSlicerSpecification = ruleSlicerSpecification();

        state._fsp--;

        current = iv_ruleSlicerSpecification.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSlicerSpecification"

  // $ANTLR start "ruleSlicerSpecification"
  // InternalMdxParser.g:970:1: ruleSlicerSpecification returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // this_Expression_0= ruleExpression ;
  public final AntlrDatatypeRuleToken ruleSlicerSpecification() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Expression_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:976:2: (this_Expression_0= ruleExpression )
      // InternalMdxParser.g:977:2: this_Expression_0= ruleExpression
      {

        newCompositeNode(grammarAccess.getSlicerSpecificationAccess().getExpressionParserRuleCall());

        pushFollow(FOLLOW_2);
        this_Expression_0 = ruleExpression();

        state._fsp--;

        current.merge(this_Expression_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSlicerSpecification"

  // $ANTLR start "entryRuleCellPropeties"
  // InternalMdxParser.g:990:1: entryRuleCellPropeties returns [String
  // current=null] : iv_ruleCellPropeties= ruleCellPropeties EOF ;
  public final String entryRuleCellPropeties() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCellPropeties = null;

    try {
      // InternalMdxParser.g:990:53: (iv_ruleCellPropeties= ruleCellPropeties EOF )
      // InternalMdxParser.g:991:2: iv_ruleCellPropeties= ruleCellPropeties EOF
      {
        newCompositeNode(grammarAccess.getCellPropetiesRule());
        pushFollow(FOLLOW_1);
        iv_ruleCellPropeties = ruleCellPropeties();

        state._fsp--;

        current = iv_ruleCellPropeties.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCellPropeties"

  // $ANTLR start "ruleCellPropeties"
  // InternalMdxParser.g:997:1: ruleCellPropeties returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : ( (kw= CELL )? kw= PROPERTIES
  // this_CellPropertyList_2= ruleCellPropertyList ) ;
  public final AntlrDatatypeRuleToken ruleCellPropeties() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_CellPropertyList_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1003:2: ( ( (kw= CELL )? kw= PROPERTIES
      // this_CellPropertyList_2= ruleCellPropertyList ) )
      // InternalMdxParser.g:1004:2: ( (kw= CELL )? kw= PROPERTIES
      // this_CellPropertyList_2= ruleCellPropertyList )
      {
        // InternalMdxParser.g:1004:2: ( (kw= CELL )? kw= PROPERTIES
        // this_CellPropertyList_2= ruleCellPropertyList )
        // InternalMdxParser.g:1005:3: (kw= CELL )? kw= PROPERTIES
        // this_CellPropertyList_2= ruleCellPropertyList
        {
          // InternalMdxParser.g:1005:3: (kw= CELL )?
          int alt17 = 2;
          int LA17_0 = input.LA(1);

          if ((LA17_0 == CELL)) {
            alt17 = 1;
          }
          switch (alt17) {
          case 1:
          // InternalMdxParser.g:1006:4: kw= CELL
          {
            kw = (Token) match(input, CELL, FOLLOW_23);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getCellPropetiesAccess().getCELLKeyword_0());

          }
            break;

          }

          kw = (Token) match(input, PROPERTIES, FOLLOW_24);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getCellPropetiesAccess().getPROPERTIESKeyword_1());

          newCompositeNode(grammarAccess.getCellPropetiesAccess().getCellPropertyListParserRuleCall_2());

          pushFollow(FOLLOW_2);
          this_CellPropertyList_2 = ruleCellPropertyList();

          state._fsp--;

          current.merge(this_CellPropertyList_2);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCellPropeties"

  // $ANTLR start "entryRuleCellPropertyList"
  // InternalMdxParser.g:1031:1: entryRuleCellPropertyList returns [String
  // current=null] : iv_ruleCellPropertyList= ruleCellPropertyList EOF ;
  public final String entryRuleCellPropertyList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCellPropertyList = null;

    try {
      // InternalMdxParser.g:1031:56: (iv_ruleCellPropertyList= ruleCellPropertyList
      // EOF )
      // InternalMdxParser.g:1032:2: iv_ruleCellPropertyList= ruleCellPropertyList EOF
      {
        newCompositeNode(grammarAccess.getCellPropertyListRule());
        pushFollow(FOLLOW_1);
        iv_ruleCellPropertyList = ruleCellPropertyList();

        state._fsp--;

        current = iv_ruleCellPropertyList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCellPropertyList"

  // $ANTLR start "ruleCellPropertyList"
  // InternalMdxParser.g:1038:1: ruleCellPropertyList returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_CellProperty_0= ruleCellProperty this_COMMA_1= ruleCOMMA
  // (this_CellProperty_2= ruleCellProperty )* ) ;
  public final AntlrDatatypeRuleToken ruleCellPropertyList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_CellProperty_0 = null;

    AntlrDatatypeRuleToken this_COMMA_1 = null;

    AntlrDatatypeRuleToken this_CellProperty_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1044:2: ( (this_CellProperty_0= ruleCellProperty
      // this_COMMA_1= ruleCOMMA (this_CellProperty_2= ruleCellProperty )* ) )
      // InternalMdxParser.g:1045:2: (this_CellProperty_0= ruleCellProperty
      // this_COMMA_1= ruleCOMMA (this_CellProperty_2= ruleCellProperty )* )
      {
        // InternalMdxParser.g:1045:2: (this_CellProperty_0= ruleCellProperty
        // this_COMMA_1= ruleCOMMA (this_CellProperty_2= ruleCellProperty )* )
        // InternalMdxParser.g:1046:3: this_CellProperty_0= ruleCellProperty
        // this_COMMA_1= ruleCOMMA (this_CellProperty_2= ruleCellProperty )*
        {

          newCompositeNode(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_0());

          pushFollow(FOLLOW_15);
          this_CellProperty_0 = ruleCellProperty();

          state._fsp--;

          current.merge(this_CellProperty_0);

          afterParserOrEnumRuleCall();

          newCompositeNode(grammarAccess.getCellPropertyListAccess().getCOMMAParserRuleCall_1());

          pushFollow(FOLLOW_25);
          this_COMMA_1 = ruleCOMMA();

          state._fsp--;

          current.merge(this_COMMA_1);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1066:3: (this_CellProperty_2= ruleCellProperty )*
          loop18: do {
            int alt18 = 2;
            int LA18_0 = input.LA(1);

            if (((LA18_0 >= FORMATTED_VALUE && LA18_0 <= DIMENSION) || LA18_0 == VALUE || LA18_0 == RULE_ID
                || LA18_0 == RULE_QUOTED_ID)) {
              alt18 = 1;
            }

            switch (alt18) {
            case 1:
            // InternalMdxParser.g:1067:4: this_CellProperty_2= ruleCellProperty
            {

              newCompositeNode(grammarAccess.getCellPropertyListAccess().getCellPropertyParserRuleCall_2());

              pushFollow(FOLLOW_25);
              this_CellProperty_2 = ruleCellProperty();

              state._fsp--;

              current.merge(this_CellProperty_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop18;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCellPropertyList"

  // $ANTLR start "entryRuleCellProperty"
  // InternalMdxParser.g:1082:1: entryRuleCellProperty returns [String
  // current=null] : iv_ruleCellProperty= ruleCellProperty EOF ;
  public final String entryRuleCellProperty() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCellProperty = null;

    try {
      // InternalMdxParser.g:1082:52: (iv_ruleCellProperty= ruleCellProperty EOF )
      // InternalMdxParser.g:1083:2: iv_ruleCellProperty= ruleCellProperty EOF
      {
        newCompositeNode(grammarAccess.getCellPropertyRule());
        pushFollow(FOLLOW_1);
        iv_ruleCellProperty = ruleCellProperty();

        state._fsp--;

        current = iv_ruleCellProperty.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCellProperty"

  // $ANTLR start "ruleCellProperty"
  // InternalMdxParser.g:1089:1: ruleCellProperty returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_MandatoryCellProperty_0=
  // ruleMandatoryCellProperty | this_ProviderSpecificCellProperty_1=
  // ruleProviderSpecificCellProperty ) ;
  public final AntlrDatatypeRuleToken ruleCellProperty() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_MandatoryCellProperty_0 = null;

    AntlrDatatypeRuleToken this_ProviderSpecificCellProperty_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1095:2: ( (this_MandatoryCellProperty_0=
      // ruleMandatoryCellProperty | this_ProviderSpecificCellProperty_1=
      // ruleProviderSpecificCellProperty ) )
      // InternalMdxParser.g:1096:2: (this_MandatoryCellProperty_0=
      // ruleMandatoryCellProperty | this_ProviderSpecificCellProperty_1=
      // ruleProviderSpecificCellProperty )
      {
        // InternalMdxParser.g:1096:2: (this_MandatoryCellProperty_0=
        // ruleMandatoryCellProperty | this_ProviderSpecificCellProperty_1=
        // ruleProviderSpecificCellProperty )
        int alt19 = 2;
        int LA19_0 = input.LA(1);

        if (((LA19_0 >= FORMATTED_VALUE && LA19_0 <= CELL_ORDINAL) || LA19_0 == VALUE)) {
          alt19 = 1;
        } else if (((LA19_0 >= PROPERTIES && LA19_0 <= DIMENSION) || LA19_0 == RULE_ID || LA19_0 == RULE_QUOTED_ID)) {
          alt19 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 19, 0, input);

          throw nvae;
        }
        switch (alt19) {
        case 1:
        // InternalMdxParser.g:1097:3: this_MandatoryCellProperty_0=
        // ruleMandatoryCellProperty
        {

          newCompositeNode(grammarAccess.getCellPropertyAccess().getMandatoryCellPropertyParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_MandatoryCellProperty_0 = ruleMandatoryCellProperty();

          state._fsp--;

          current.merge(this_MandatoryCellProperty_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:1108:3: this_ProviderSpecificCellProperty_1=
        // ruleProviderSpecificCellProperty
        {

          newCompositeNode(grammarAccess.getCellPropertyAccess().getProviderSpecificCellPropertyParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_ProviderSpecificCellProperty_1 = ruleProviderSpecificCellProperty();

          state._fsp--;

          current.merge(this_ProviderSpecificCellProperty_1);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCellProperty"

  // $ANTLR start "entryRuleMandatoryCellProperty"
  // InternalMdxParser.g:1122:1: entryRuleMandatoryCellProperty returns [String
  // current=null] : iv_ruleMandatoryCellProperty= ruleMandatoryCellProperty EOF ;
  public final String entryRuleMandatoryCellProperty() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMandatoryCellProperty = null;

    try {
      // InternalMdxParser.g:1122:61: (iv_ruleMandatoryCellProperty=
      // ruleMandatoryCellProperty EOF )
      // InternalMdxParser.g:1123:2: iv_ruleMandatoryCellProperty=
      // ruleMandatoryCellProperty EOF
      {
        newCompositeNode(grammarAccess.getMandatoryCellPropertyRule());
        pushFollow(FOLLOW_1);
        iv_ruleMandatoryCellProperty = ruleMandatoryCellProperty();

        state._fsp--;

        current = iv_ruleMandatoryCellProperty.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMandatoryCellProperty"

  // $ANTLR start "ruleMandatoryCellProperty"
  // InternalMdxParser.g:1129:1: ruleMandatoryCellProperty returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw=
  // CELL_ORDINAL | kw= VALUE | kw= FORMATTED_VALUE ) ;
  public final AntlrDatatypeRuleToken ruleMandatoryCellProperty() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:1135:2: ( (kw= CELL_ORDINAL | kw= VALUE | kw=
      // FORMATTED_VALUE ) )
      // InternalMdxParser.g:1136:2: (kw= CELL_ORDINAL | kw= VALUE | kw=
      // FORMATTED_VALUE )
      {
        // InternalMdxParser.g:1136:2: (kw= CELL_ORDINAL | kw= VALUE | kw=
        // FORMATTED_VALUE )
        int alt20 = 3;
        switch (input.LA(1)) {
        case CELL_ORDINAL: {
          alt20 = 1;
        }
          break;
        case VALUE: {
          alt20 = 2;
        }
          break;
        case FORMATTED_VALUE: {
          alt20 = 3;
        }
          break;
        default:
          NoViableAltException nvae = new NoViableAltException("", 20, 0, input);

          throw nvae;
        }

        switch (alt20) {
        case 1:
        // InternalMdxParser.g:1137:3: kw= CELL_ORDINAL
        {
          kw = (Token) match(input, CELL_ORDINAL, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getMandatoryCellPropertyAccess().getCELL_ORDINALKeyword_0());

        }
          break;
        case 2:
        // InternalMdxParser.g:1143:3: kw= VALUE
        {
          kw = (Token) match(input, VALUE, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getMandatoryCellPropertyAccess().getVALUEKeyword_1());

        }
          break;
        case 3:
        // InternalMdxParser.g:1149:3: kw= FORMATTED_VALUE
        {
          kw = (Token) match(input, FORMATTED_VALUE, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getMandatoryCellPropertyAccess().getFORMATTED_VALUEKeyword_2());

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMandatoryCellProperty"

  // $ANTLR start "entryRuleProviderSpecificCellProperty"
  // InternalMdxParser.g:1158:1: entryRuleProviderSpecificCellProperty returns
  // [String current=null] : iv_ruleProviderSpecificCellProperty=
  // ruleProviderSpecificCellProperty EOF ;
  public final String entryRuleProviderSpecificCellProperty() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleProviderSpecificCellProperty = null;

    try {
      // InternalMdxParser.g:1158:68: (iv_ruleProviderSpecificCellProperty=
      // ruleProviderSpecificCellProperty EOF )
      // InternalMdxParser.g:1159:2: iv_ruleProviderSpecificCellProperty=
      // ruleProviderSpecificCellProperty EOF
      {
        newCompositeNode(grammarAccess.getProviderSpecificCellPropertyRule());
        pushFollow(FOLLOW_1);
        iv_ruleProviderSpecificCellProperty = ruleProviderSpecificCellProperty();

        state._fsp--;

        current = iv_ruleProviderSpecificCellProperty.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleProviderSpecificCellProperty"

  // $ANTLR start "ruleProviderSpecificCellProperty"
  // InternalMdxParser.g:1165:1: ruleProviderSpecificCellProperty returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // this_Identifier_0= ruleIdentifier ;
  public final AntlrDatatypeRuleToken ruleProviderSpecificCellProperty() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Identifier_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1171:2: (this_Identifier_0= ruleIdentifier )
      // InternalMdxParser.g:1172:2: this_Identifier_0= ruleIdentifier
      {

        newCompositeNode(grammarAccess.getProviderSpecificCellPropertyAccess().getIdentifierParserRuleCall());

        pushFollow(FOLLOW_2);
        this_Identifier_0 = ruleIdentifier();

        state._fsp--;

        current.merge(this_Identifier_0);

        afterParserOrEnumRuleCall();

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleProviderSpecificCellProperty"

  // $ANTLR start "entryRuleExpression"
  // InternalMdxParser.g:1185:1: entryRuleExpression returns [String current=null]
  // : iv_ruleExpression= ruleExpression EOF ;
  public final String entryRuleExpression() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleExpression = null;

    try {
      // InternalMdxParser.g:1185:50: (iv_ruleExpression= ruleExpression EOF )
      // InternalMdxParser.g:1186:2: iv_ruleExpression= ruleExpression EOF
      {
        newCompositeNode(grammarAccess.getExpressionRule());
        pushFollow(FOLLOW_1);
        iv_ruleExpression = ruleExpression();

        state._fsp--;

        current = iv_ruleExpression.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleExpression"

  // $ANTLR start "ruleExpression"
  // InternalMdxParser.g:1192:1: ruleExpression returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_ValueExpression_0=
  // ruleValueExpression (this_COLON_1= ruleCOLON this_ValueExpression_2=
  // ruleValueExpression )* ) ;
  public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_ValueExpression_0 = null;

    AntlrDatatypeRuleToken this_COLON_1 = null;

    AntlrDatatypeRuleToken this_ValueExpression_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1198:2: ( (this_ValueExpression_0= ruleValueExpression
      // (this_COLON_1= ruleCOLON this_ValueExpression_2= ruleValueExpression )* ) )
      // InternalMdxParser.g:1199:2: (this_ValueExpression_0= ruleValueExpression
      // (this_COLON_1= ruleCOLON this_ValueExpression_2= ruleValueExpression )* )
      {
        // InternalMdxParser.g:1199:2: (this_ValueExpression_0= ruleValueExpression
        // (this_COLON_1= ruleCOLON this_ValueExpression_2= ruleValueExpression )* )
        // InternalMdxParser.g:1200:3: this_ValueExpression_0= ruleValueExpression
        // (this_COLON_1= ruleCOLON this_ValueExpression_2= ruleValueExpression )*
        {

          newCompositeNode(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0());

          pushFollow(FOLLOW_26);
          this_ValueExpression_0 = ruleValueExpression();

          state._fsp--;

          current.merge(this_ValueExpression_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1210:3: (this_COLON_1= ruleCOLON this_ValueExpression_2=
          // ruleValueExpression )*
          loop21: do {
            int alt21 = 2;
            int LA21_0 = input.LA(1);

            if ((LA21_0 == Colon)) {
              alt21 = 1;
            }

            switch (alt21) {
            case 1:
            // InternalMdxParser.g:1211:4: this_COLON_1= ruleCOLON this_ValueExpression_2=
            // ruleValueExpression
            {

              newCompositeNode(grammarAccess.getExpressionAccess().getCOLONParserRuleCall_1_0());

              pushFollow(FOLLOW_9);
              this_COLON_1 = ruleCOLON();

              state._fsp--;

              current.merge(this_COLON_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_1());

              pushFollow(FOLLOW_26);
              this_ValueExpression_2 = ruleValueExpression();

              state._fsp--;

              current.merge(this_ValueExpression_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop21;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleExpression"

  // $ANTLR start "entryRuleValueExpression"
  // InternalMdxParser.g:1236:1: entryRuleValueExpression returns [String
  // current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
  public final String entryRuleValueExpression() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleValueExpression = null;

    try {
      // InternalMdxParser.g:1236:55: (iv_ruleValueExpression= ruleValueExpression EOF
      // )
      // InternalMdxParser.g:1237:2: iv_ruleValueExpression= ruleValueExpression EOF
      {
        newCompositeNode(grammarAccess.getValueExpressionRule());
        pushFollow(FOLLOW_1);
        iv_ruleValueExpression = ruleValueExpression();

        state._fsp--;

        current = iv_ruleValueExpression.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleValueExpression"

  // $ANTLR start "ruleValueExpression"
  // InternalMdxParser.g:1243:1: ruleValueExpression returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_Term5_0= ruleTerm5 (this_ValueXorExpression_1= ruleValueXorExpression |
  // this_ValueOrExpression_2= ruleValueOrExpression )* ) ;
  public final AntlrDatatypeRuleToken ruleValueExpression() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Term5_0 = null;

    AntlrDatatypeRuleToken this_ValueXorExpression_1 = null;

    AntlrDatatypeRuleToken this_ValueOrExpression_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1249:2: ( (this_Term5_0= ruleTerm5
      // (this_ValueXorExpression_1= ruleValueXorExpression |
      // this_ValueOrExpression_2= ruleValueOrExpression )* ) )
      // InternalMdxParser.g:1250:2: (this_Term5_0= ruleTerm5
      // (this_ValueXorExpression_1= ruleValueXorExpression |
      // this_ValueOrExpression_2= ruleValueOrExpression )* )
      {
        // InternalMdxParser.g:1250:2: (this_Term5_0= ruleTerm5
        // (this_ValueXorExpression_1= ruleValueXorExpression |
        // this_ValueOrExpression_2= ruleValueOrExpression )* )
        // InternalMdxParser.g:1251:3: this_Term5_0= ruleTerm5
        // (this_ValueXorExpression_1= ruleValueXorExpression |
        // this_ValueOrExpression_2= ruleValueOrExpression )*
        {

          newCompositeNode(grammarAccess.getValueExpressionAccess().getTerm5ParserRuleCall_0());

          pushFollow(FOLLOW_27);
          this_Term5_0 = ruleTerm5();

          state._fsp--;

          current.merge(this_Term5_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1261:3: (this_ValueXorExpression_1=
          // ruleValueXorExpression | this_ValueOrExpression_2= ruleValueOrExpression )*
          loop22: do {
            int alt22 = 3;
            int LA22_0 = input.LA(1);

            if ((LA22_0 == XOR)) {
              alt22 = 1;
            } else if ((LA22_0 == OR)) {
              alt22 = 2;
            }

            switch (alt22) {
            case 1:
            // InternalMdxParser.g:1262:4: this_ValueXorExpression_1= ruleValueXorExpression
            {

              newCompositeNode(grammarAccess.getValueExpressionAccess().getValueXorExpressionParserRuleCall_1_0());

              pushFollow(FOLLOW_27);
              this_ValueXorExpression_1 = ruleValueXorExpression();

              state._fsp--;

              current.merge(this_ValueXorExpression_1);

              afterParserOrEnumRuleCall();

            }
              break;
            case 2:
            // InternalMdxParser.g:1273:4: this_ValueOrExpression_2= ruleValueOrExpression
            {

              newCompositeNode(grammarAccess.getValueExpressionAccess().getValueOrExpressionParserRuleCall_1_1());

              pushFollow(FOLLOW_27);
              this_ValueOrExpression_2 = ruleValueOrExpression();

              state._fsp--;

              current.merge(this_ValueOrExpression_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop22;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleValueExpression"

  // $ANTLR start "entryRuleValueXorExpression"
  // InternalMdxParser.g:1288:1: entryRuleValueXorExpression returns [String
  // current=null] : iv_ruleValueXorExpression= ruleValueXorExpression EOF ;
  public final String entryRuleValueXorExpression() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleValueXorExpression = null;

    try {
      // InternalMdxParser.g:1288:58: (iv_ruleValueXorExpression=
      // ruleValueXorExpression EOF )
      // InternalMdxParser.g:1289:2: iv_ruleValueXorExpression= ruleValueXorExpression
      // EOF
      {
        newCompositeNode(grammarAccess.getValueXorExpressionRule());
        pushFollow(FOLLOW_1);
        iv_ruleValueXorExpression = ruleValueXorExpression();

        state._fsp--;

        current = iv_ruleValueXorExpression.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleValueXorExpression"

  // $ANTLR start "ruleValueXorExpression"
  // InternalMdxParser.g:1295:1: ruleValueXorExpression returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= XOR
  // this_Term5_1= ruleTerm5 ) ;
  public final AntlrDatatypeRuleToken ruleValueXorExpression() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_Term5_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1301:2: ( (kw= XOR this_Term5_1= ruleTerm5 ) )
      // InternalMdxParser.g:1302:2: (kw= XOR this_Term5_1= ruleTerm5 )
      {
        // InternalMdxParser.g:1302:2: (kw= XOR this_Term5_1= ruleTerm5 )
        // InternalMdxParser.g:1303:3: kw= XOR this_Term5_1= ruleTerm5
        {
          kw = (Token) match(input, XOR, FOLLOW_9);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getValueXorExpressionAccess().getXORKeyword_0());

          newCompositeNode(grammarAccess.getValueXorExpressionAccess().getTerm5ParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_Term5_1 = ruleTerm5();

          state._fsp--;

          current.merge(this_Term5_1);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleValueXorExpression"

  // $ANTLR start "entryRuleValueOrExpression"
  // InternalMdxParser.g:1322:1: entryRuleValueOrExpression returns [String
  // current=null] : iv_ruleValueOrExpression= ruleValueOrExpression EOF ;
  public final String entryRuleValueOrExpression() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleValueOrExpression = null;

    try {
      // InternalMdxParser.g:1322:57: (iv_ruleValueOrExpression= ruleValueOrExpression
      // EOF )
      // InternalMdxParser.g:1323:2: iv_ruleValueOrExpression= ruleValueOrExpression
      // EOF
      {
        newCompositeNode(grammarAccess.getValueOrExpressionRule());
        pushFollow(FOLLOW_1);
        iv_ruleValueOrExpression = ruleValueOrExpression();

        state._fsp--;

        current = iv_ruleValueOrExpression.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleValueOrExpression"

  // $ANTLR start "ruleValueOrExpression"
  // InternalMdxParser.g:1329:1: ruleValueOrExpression returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= OR
  // this_Term5_1= ruleTerm5 ) ;
  public final AntlrDatatypeRuleToken ruleValueOrExpression() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_Term5_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1335:2: ( (kw= OR this_Term5_1= ruleTerm5 ) )
      // InternalMdxParser.g:1336:2: (kw= OR this_Term5_1= ruleTerm5 )
      {
        // InternalMdxParser.g:1336:2: (kw= OR this_Term5_1= ruleTerm5 )
        // InternalMdxParser.g:1337:3: kw= OR this_Term5_1= ruleTerm5
        {
          kw = (Token) match(input, OR, FOLLOW_9);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getValueOrExpressionAccess().getORKeyword_0());

          newCompositeNode(grammarAccess.getValueOrExpressionAccess().getTerm5ParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_Term5_1 = ruleTerm5();

          state._fsp--;

          current.merge(this_Term5_1);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleValueOrExpression"

  // $ANTLR start "entryRuleTerm5"
  // InternalMdxParser.g:1356:1: entryRuleTerm5 returns [String current=null] :
  // iv_ruleTerm5= ruleTerm5 EOF ;
  public final String entryRuleTerm5() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleTerm5 = null;

    try {
      // InternalMdxParser.g:1356:45: (iv_ruleTerm5= ruleTerm5 EOF )
      // InternalMdxParser.g:1357:2: iv_ruleTerm5= ruleTerm5 EOF
      {
        newCompositeNode(grammarAccess.getTerm5Rule());
        pushFollow(FOLLOW_1);
        iv_ruleTerm5 = ruleTerm5();

        state._fsp--;

        current = iv_ruleTerm5.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleTerm5"

  // $ANTLR start "ruleTerm5"
  // InternalMdxParser.g:1363:1: ruleTerm5 returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Term4_0= ruleTerm4 (kw= AND
  // this_Term4_2= ruleTerm4 )* ) ;
  public final AntlrDatatypeRuleToken ruleTerm5() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_Term4_0 = null;

    AntlrDatatypeRuleToken this_Term4_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1369:2: ( (this_Term4_0= ruleTerm4 (kw= AND this_Term4_2=
      // ruleTerm4 )* ) )
      // InternalMdxParser.g:1370:2: (this_Term4_0= ruleTerm4 (kw= AND this_Term4_2=
      // ruleTerm4 )* )
      {
        // InternalMdxParser.g:1370:2: (this_Term4_0= ruleTerm4 (kw= AND this_Term4_2=
        // ruleTerm4 )* )
        // InternalMdxParser.g:1371:3: this_Term4_0= ruleTerm4 (kw= AND this_Term4_2=
        // ruleTerm4 )*
        {

          newCompositeNode(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_0());

          pushFollow(FOLLOW_28);
          this_Term4_0 = ruleTerm4();

          state._fsp--;

          current.merge(this_Term4_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1381:3: (kw= AND this_Term4_2= ruleTerm4 )*
          loop23: do {
            int alt23 = 2;
            int LA23_0 = input.LA(1);

            if ((LA23_0 == AND)) {
              alt23 = 1;
            }

            switch (alt23) {
            case 1:
            // InternalMdxParser.g:1382:4: kw= AND this_Term4_2= ruleTerm4
            {
              kw = (Token) match(input, AND, FOLLOW_9);

              current.merge(kw);
              newLeafNode(kw, grammarAccess.getTerm5Access().getANDKeyword_1_0());

              newCompositeNode(grammarAccess.getTerm5Access().getTerm4ParserRuleCall_1_1());

              pushFollow(FOLLOW_28);
              this_Term4_2 = ruleTerm4();

              state._fsp--;

              current.merge(this_Term4_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop23;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleTerm5"

  // $ANTLR start "entryRuleTerm4"
  // InternalMdxParser.g:1402:1: entryRuleTerm4 returns [String current=null] :
  // iv_ruleTerm4= ruleTerm4 EOF ;
  public final String entryRuleTerm4() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleTerm4 = null;

    try {
      // InternalMdxParser.g:1402:45: (iv_ruleTerm4= ruleTerm4 EOF )
      // InternalMdxParser.g:1403:2: iv_ruleTerm4= ruleTerm4 EOF
      {
        newCompositeNode(grammarAccess.getTerm4Rule());
        pushFollow(FOLLOW_1);
        iv_ruleTerm4 = ruleTerm4();

        state._fsp--;

        current = iv_ruleTerm4.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleTerm4"

  // $ANTLR start "ruleTerm4"
  // InternalMdxParser.g:1409:1: ruleTerm4 returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : ( (kw= NOT this_Term4_1= ruleTerm4 )
  // | this_Term3_2= ruleTerm3 ) ;
  public final AntlrDatatypeRuleToken ruleTerm4() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_Term4_1 = null;

    AntlrDatatypeRuleToken this_Term3_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1415:2: ( ( (kw= NOT this_Term4_1= ruleTerm4 ) |
      // this_Term3_2= ruleTerm3 ) )
      // InternalMdxParser.g:1416:2: ( (kw= NOT this_Term4_1= ruleTerm4 ) |
      // this_Term3_2= ruleTerm3 )
      {
        // InternalMdxParser.g:1416:2: ( (kw= NOT this_Term4_1= ruleTerm4 ) |
        // this_Term3_2= ruleTerm3 )
        int alt24 = 2;
        int LA24_0 = input.LA(1);

        if ((LA24_0 == NOT)) {
          alt24 = 1;
        } else if (((LA24_0 >= PROPERTIES && LA24_0 <= DIMENSION) || LA24_0 == CASE || LA24_0 == LeftParenthesis
            || LA24_0 == PlusSign || LA24_0 == HyphenMinus || LA24_0 == LeftCurlyBracket || LA24_0 == RULE_ID
            || LA24_0 == RULE_QUOTED_ID || (LA24_0 >= RULE_INT && LA24_0 <= RULE_STRING))) {
          alt24 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 24, 0, input);

          throw nvae;
        }
        switch (alt24) {
        case 1:
        // InternalMdxParser.g:1417:3: (kw= NOT this_Term4_1= ruleTerm4 )
        {
          // InternalMdxParser.g:1417:3: (kw= NOT this_Term4_1= ruleTerm4 )
          // InternalMdxParser.g:1418:4: kw= NOT this_Term4_1= ruleTerm4
          {
            kw = (Token) match(input, NOT, FOLLOW_9);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getTerm4Access().getNOTKeyword_0_0());

            newCompositeNode(grammarAccess.getTerm4Access().getTerm4ParserRuleCall_0_1());

            pushFollow(FOLLOW_2);
            this_Term4_1 = ruleTerm4();

            state._fsp--;

            current.merge(this_Term4_1);

            afterParserOrEnumRuleCall();

          }

        }
          break;
        case 2:
        // InternalMdxParser.g:1435:3: this_Term3_2= ruleTerm3
        {

          newCompositeNode(grammarAccess.getTerm4Access().getTerm3ParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_Term3_2 = ruleTerm3();

          state._fsp--;

          current.merge(this_Term3_2);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleTerm4"

  // $ANTLR start "entryRuleTerm3"
  // InternalMdxParser.g:1449:1: entryRuleTerm3 returns [String current=null] :
  // iv_ruleTerm3= ruleTerm3 EOF ;
  public final String entryRuleTerm3() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleTerm3 = null;

    try {
      // InternalMdxParser.g:1449:45: (iv_ruleTerm3= ruleTerm3 EOF )
      // InternalMdxParser.g:1450:2: iv_ruleTerm3= ruleTerm3 EOF
      {
        newCompositeNode(grammarAccess.getTerm3Rule());
        pushFollow(FOLLOW_1);
        iv_ruleTerm3 = ruleTerm3();

        state._fsp--;

        current = iv_ruleTerm3.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleTerm3"

  // $ANTLR start "ruleTerm3"
  // InternalMdxParser.g:1456:1: ruleTerm3 returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Term2_0= ruleTerm2
  // (this_CompatingOperator_1= ruleCompatingOperator this_Term2_2= ruleTerm2 )* )
  // ;
  public final AntlrDatatypeRuleToken ruleTerm3() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Term2_0 = null;

    AntlrDatatypeRuleToken this_CompatingOperator_1 = null;

    AntlrDatatypeRuleToken this_Term2_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1462:2: ( (this_Term2_0= ruleTerm2
      // (this_CompatingOperator_1= ruleCompatingOperator this_Term2_2= ruleTerm2 )* )
      // )
      // InternalMdxParser.g:1463:2: (this_Term2_0= ruleTerm2
      // (this_CompatingOperator_1= ruleCompatingOperator this_Term2_2= ruleTerm2 )* )
      {
        // InternalMdxParser.g:1463:2: (this_Term2_0= ruleTerm2
        // (this_CompatingOperator_1= ruleCompatingOperator this_Term2_2= ruleTerm2 )* )
        // InternalMdxParser.g:1464:3: this_Term2_0= ruleTerm2
        // (this_CompatingOperator_1= ruleCompatingOperator this_Term2_2= ruleTerm2 )*
        {

          newCompositeNode(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_0());

          pushFollow(FOLLOW_29);
          this_Term2_0 = ruleTerm2();

          state._fsp--;

          current.merge(this_Term2_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1474:3: (this_CompatingOperator_1= ruleCompatingOperator
          // this_Term2_2= ruleTerm2 )*
          loop25: do {
            int alt25 = 2;
            int LA25_0 = input.LA(1);

            if (((LA25_0 >= LessThanSignEqualsSign && LA25_0 <= GreaterThanSignEqualsSign)
                || (LA25_0 >= LessThanSign && LA25_0 <= GreaterThanSign))) {
              alt25 = 1;
            }

            switch (alt25) {
            case 1:
            // InternalMdxParser.g:1475:4: this_CompatingOperator_1= ruleCompatingOperator
            // this_Term2_2= ruleTerm2
            {

              newCompositeNode(grammarAccess.getTerm3Access().getCompatingOperatorParserRuleCall_1_0());

              pushFollow(FOLLOW_9);
              this_CompatingOperator_1 = ruleCompatingOperator();

              state._fsp--;

              current.merge(this_CompatingOperator_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getTerm3Access().getTerm2ParserRuleCall_1_1());

              pushFollow(FOLLOW_29);
              this_Term2_2 = ruleTerm2();

              state._fsp--;

              current.merge(this_Term2_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop25;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleTerm3"

  // $ANTLR start "entryRuleTerm2"
  // InternalMdxParser.g:1500:1: entryRuleTerm2 returns [String current=null] :
  // iv_ruleTerm2= ruleTerm2 EOF ;
  public final String entryRuleTerm2() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleTerm2 = null;

    try {
      // InternalMdxParser.g:1500:45: (iv_ruleTerm2= ruleTerm2 EOF )
      // InternalMdxParser.g:1501:2: iv_ruleTerm2= ruleTerm2 EOF
      {
        newCompositeNode(grammarAccess.getTerm2Rule());
        pushFollow(FOLLOW_1);
        iv_ruleTerm2 = ruleTerm2();

        state._fsp--;

        current = iv_ruleTerm2.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleTerm2"

  // $ANTLR start "ruleTerm2"
  // InternalMdxParser.g:1507:1: ruleTerm2 returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Term_0= ruleTerm (
  // (this_CONCAT_1= ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS
  // ) this_Term_4= ruleTerm )* ) ;
  public final AntlrDatatypeRuleToken ruleTerm2() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Term_0 = null;

    AntlrDatatypeRuleToken this_CONCAT_1 = null;

    AntlrDatatypeRuleToken this_PLUS_2 = null;

    AntlrDatatypeRuleToken this_MINUS_3 = null;

    AntlrDatatypeRuleToken this_Term_4 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1513:2: ( (this_Term_0= ruleTerm ( (this_CONCAT_1=
      // ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4=
      // ruleTerm )* ) )
      // InternalMdxParser.g:1514:2: (this_Term_0= ruleTerm ( (this_CONCAT_1=
      // ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4=
      // ruleTerm )* )
      {
        // InternalMdxParser.g:1514:2: (this_Term_0= ruleTerm ( (this_CONCAT_1=
        // ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4=
        // ruleTerm )* )
        // InternalMdxParser.g:1515:3: this_Term_0= ruleTerm ( (this_CONCAT_1=
        // ruleCONCAT | this_PLUS_2= rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4=
        // ruleTerm )*
        {

          newCompositeNode(grammarAccess.getTerm2Access().getTermParserRuleCall_0());

          pushFollow(FOLLOW_30);
          this_Term_0 = ruleTerm();

          state._fsp--;

          current.merge(this_Term_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1525:3: ( (this_CONCAT_1= ruleCONCAT | this_PLUS_2=
          // rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4= ruleTerm )*
          loop27: do {
            int alt27 = 2;
            int LA27_0 = input.LA(1);

            if ((LA27_0 == VerticalLineVerticalLine || LA27_0 == PlusSign || LA27_0 == HyphenMinus)) {
              alt27 = 1;
            }

            switch (alt27) {
            case 1:
            // InternalMdxParser.g:1526:4: (this_CONCAT_1= ruleCONCAT | this_PLUS_2=
            // rulePLUS | this_MINUS_3= ruleMINUS ) this_Term_4= ruleTerm
            {
              // InternalMdxParser.g:1526:4: (this_CONCAT_1= ruleCONCAT | this_PLUS_2=
              // rulePLUS | this_MINUS_3= ruleMINUS )
              int alt26 = 3;
              switch (input.LA(1)) {
              case VerticalLineVerticalLine: {
                alt26 = 1;
              }
                break;
              case PlusSign: {
                alt26 = 2;
              }
                break;
              case HyphenMinus: {
                alt26 = 3;
              }
                break;
              default:
                NoViableAltException nvae = new NoViableAltException("", 26, 0, input);

                throw nvae;
              }

              switch (alt26) {
              case 1:
              // InternalMdxParser.g:1527:5: this_CONCAT_1= ruleCONCAT
              {

                newCompositeNode(grammarAccess.getTerm2Access().getCONCATParserRuleCall_1_0_0());

                pushFollow(FOLLOW_9);
                this_CONCAT_1 = ruleCONCAT();

                state._fsp--;

                current.merge(this_CONCAT_1);

                afterParserOrEnumRuleCall();

              }
                break;
              case 2:
              // InternalMdxParser.g:1538:5: this_PLUS_2= rulePLUS
              {

                newCompositeNode(grammarAccess.getTerm2Access().getPLUSParserRuleCall_1_0_1());

                pushFollow(FOLLOW_9);
                this_PLUS_2 = rulePLUS();

                state._fsp--;

                current.merge(this_PLUS_2);

                afterParserOrEnumRuleCall();

              }
                break;
              case 3:
              // InternalMdxParser.g:1549:5: this_MINUS_3= ruleMINUS
              {

                newCompositeNode(grammarAccess.getTerm2Access().getMINUSParserRuleCall_1_0_2());

                pushFollow(FOLLOW_9);
                this_MINUS_3 = ruleMINUS();

                state._fsp--;

                current.merge(this_MINUS_3);

                afterParserOrEnumRuleCall();

              }
                break;

              }

              newCompositeNode(grammarAccess.getTerm2Access().getTermParserRuleCall_1_1());

              pushFollow(FOLLOW_30);
              this_Term_4 = ruleTerm();

              state._fsp--;

              current.merge(this_Term_4);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop27;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleTerm2"

  // $ANTLR start "entryRuleTerm"
  // InternalMdxParser.g:1575:1: entryRuleTerm returns [String current=null] :
  // iv_ruleTerm= ruleTerm EOF ;
  public final String entryRuleTerm() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleTerm = null;

    try {
      // InternalMdxParser.g:1575:44: (iv_ruleTerm= ruleTerm EOF )
      // InternalMdxParser.g:1576:2: iv_ruleTerm= ruleTerm EOF
      {
        newCompositeNode(grammarAccess.getTermRule());
        pushFollow(FOLLOW_1);
        iv_ruleTerm = ruleTerm();

        state._fsp--;

        current = iv_ruleTerm.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleTerm"

  // $ANTLR start "ruleTerm"
  // InternalMdxParser.g:1582:1: ruleTerm returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Factor_0= ruleFactor (
  // (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_Factor_3=
  // ruleFactor )* ) ;
  public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Factor_0 = null;

    AntlrDatatypeRuleToken this_SOLIDUS_1 = null;

    AntlrDatatypeRuleToken this_ASTERISK_2 = null;

    AntlrDatatypeRuleToken this_Factor_3 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1588:2: ( (this_Factor_0= ruleFactor ( (this_SOLIDUS_1=
      // ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_Factor_3= ruleFactor )* )
      // )
      // InternalMdxParser.g:1589:2: (this_Factor_0= ruleFactor ( (this_SOLIDUS_1=
      // ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_Factor_3= ruleFactor )* )
      {
        // InternalMdxParser.g:1589:2: (this_Factor_0= ruleFactor ( (this_SOLIDUS_1=
        // ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_Factor_3= ruleFactor )* )
        // InternalMdxParser.g:1590:3: this_Factor_0= ruleFactor ( (this_SOLIDUS_1=
        // ruleSOLIDUS | this_ASTERISK_2= ruleASTERISK ) this_Factor_3= ruleFactor )*
        {

          newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());

          pushFollow(FOLLOW_31);
          this_Factor_0 = ruleFactor();

          state._fsp--;

          current.merge(this_Factor_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1600:3: ( (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2=
          // ruleASTERISK ) this_Factor_3= ruleFactor )*
          loop29: do {
            int alt29 = 2;
            int LA29_0 = input.LA(1);

            if ((LA29_0 == Asterisk || LA29_0 == Solidus)) {
              alt29 = 1;
            }

            switch (alt29) {
            case 1:
            // InternalMdxParser.g:1601:4: (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2=
            // ruleASTERISK ) this_Factor_3= ruleFactor
            {
              // InternalMdxParser.g:1601:4: (this_SOLIDUS_1= ruleSOLIDUS | this_ASTERISK_2=
              // ruleASTERISK )
              int alt28 = 2;
              int LA28_0 = input.LA(1);

              if ((LA28_0 == Solidus)) {
                alt28 = 1;
              } else if ((LA28_0 == Asterisk)) {
                alt28 = 2;
              } else {
                NoViableAltException nvae = new NoViableAltException("", 28, 0, input);

                throw nvae;
              }
              switch (alt28) {
              case 1:
              // InternalMdxParser.g:1602:5: this_SOLIDUS_1= ruleSOLIDUS
              {

                newCompositeNode(grammarAccess.getTermAccess().getSOLIDUSParserRuleCall_1_0_0());

                pushFollow(FOLLOW_9);
                this_SOLIDUS_1 = ruleSOLIDUS();

                state._fsp--;

                current.merge(this_SOLIDUS_1);

                afterParserOrEnumRuleCall();

              }
                break;
              case 2:
              // InternalMdxParser.g:1613:5: this_ASTERISK_2= ruleASTERISK
              {

                newCompositeNode(grammarAccess.getTermAccess().getASTERISKParserRuleCall_1_0_1());

                pushFollow(FOLLOW_9);
                this_ASTERISK_2 = ruleASTERISK();

                state._fsp--;

                current.merge(this_ASTERISK_2);

                afterParserOrEnumRuleCall();

              }
                break;

              }

              newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1());

              pushFollow(FOLLOW_31);
              this_Factor_3 = ruleFactor();

              state._fsp--;

              current.merge(this_Factor_3);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop29;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleTerm"

  // $ANTLR start "entryRuleFactor"
  // InternalMdxParser.g:1639:1: entryRuleFactor returns [String current=null] :
  // iv_ruleFactor= ruleFactor EOF ;
  public final String entryRuleFactor() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleFactor = null;

    try {
      // InternalMdxParser.g:1639:46: (iv_ruleFactor= ruleFactor EOF )
      // InternalMdxParser.g:1640:2: iv_ruleFactor= ruleFactor EOF
      {
        newCompositeNode(grammarAccess.getFactorRule());
        pushFollow(FOLLOW_1);
        iv_ruleFactor = ruleFactor();

        state._fsp--;

        current = iv_ruleFactor.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleFactor"

  // $ANTLR start "ruleFactor"
  // InternalMdxParser.g:1646:1: ruleFactor returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : ( (this_MINUS_0= ruleMINUS
  // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary ) | (this_PLUS_2=
  // rulePLUS this_ValueExpressionPrimary_3= ruleValueExpressionPrimary ) |
  // this_ValueExpressionPrimary_4= ruleValueExpressionPrimary ) ;
  public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_MINUS_0 = null;

    AntlrDatatypeRuleToken this_ValueExpressionPrimary_1 = null;

    AntlrDatatypeRuleToken this_PLUS_2 = null;

    AntlrDatatypeRuleToken this_ValueExpressionPrimary_3 = null;

    AntlrDatatypeRuleToken this_ValueExpressionPrimary_4 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1652:2: ( ( (this_MINUS_0= ruleMINUS
      // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary ) | (this_PLUS_2=
      // rulePLUS this_ValueExpressionPrimary_3= ruleValueExpressionPrimary ) |
      // this_ValueExpressionPrimary_4= ruleValueExpressionPrimary ) )
      // InternalMdxParser.g:1653:2: ( (this_MINUS_0= ruleMINUS
      // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary ) | (this_PLUS_2=
      // rulePLUS this_ValueExpressionPrimary_3= ruleValueExpressionPrimary ) |
      // this_ValueExpressionPrimary_4= ruleValueExpressionPrimary )
      {
        // InternalMdxParser.g:1653:2: ( (this_MINUS_0= ruleMINUS
        // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary ) | (this_PLUS_2=
        // rulePLUS this_ValueExpressionPrimary_3= ruleValueExpressionPrimary ) |
        // this_ValueExpressionPrimary_4= ruleValueExpressionPrimary )
        int alt30 = 3;
        switch (input.LA(1)) {
        case HyphenMinus: {
          alt30 = 1;
        }
          break;
        case PlusSign: {
          alt30 = 2;
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
        case RULE_STRING: {
          alt30 = 3;
        }
          break;
        default:
          NoViableAltException nvae = new NoViableAltException("", 30, 0, input);

          throw nvae;
        }

        switch (alt30) {
        case 1:
        // InternalMdxParser.g:1654:3: (this_MINUS_0= ruleMINUS
        // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary )
        {
          // InternalMdxParser.g:1654:3: (this_MINUS_0= ruleMINUS
          // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary )
          // InternalMdxParser.g:1655:4: this_MINUS_0= ruleMINUS
          // this_ValueExpressionPrimary_1= ruleValueExpressionPrimary
          {

            newCompositeNode(grammarAccess.getFactorAccess().getMINUSParserRuleCall_0_0());

            pushFollow(FOLLOW_9);
            this_MINUS_0 = ruleMINUS();

            state._fsp--;

            current.merge(this_MINUS_0);

            afterParserOrEnumRuleCall();

            newCompositeNode(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_0_1());

            pushFollow(FOLLOW_2);
            this_ValueExpressionPrimary_1 = ruleValueExpressionPrimary();

            state._fsp--;

            current.merge(this_ValueExpressionPrimary_1);

            afterParserOrEnumRuleCall();

          }

        }
          break;
        case 2:
        // InternalMdxParser.g:1677:3: (this_PLUS_2= rulePLUS
        // this_ValueExpressionPrimary_3= ruleValueExpressionPrimary )
        {
          // InternalMdxParser.g:1677:3: (this_PLUS_2= rulePLUS
          // this_ValueExpressionPrimary_3= ruleValueExpressionPrimary )
          // InternalMdxParser.g:1678:4: this_PLUS_2= rulePLUS
          // this_ValueExpressionPrimary_3= ruleValueExpressionPrimary
          {

            newCompositeNode(grammarAccess.getFactorAccess().getPLUSParserRuleCall_1_0());

            pushFollow(FOLLOW_9);
            this_PLUS_2 = rulePLUS();

            state._fsp--;

            current.merge(this_PLUS_2);

            afterParserOrEnumRuleCall();

            newCompositeNode(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_1_1());

            pushFollow(FOLLOW_2);
            this_ValueExpressionPrimary_3 = ruleValueExpressionPrimary();

            state._fsp--;

            current.merge(this_ValueExpressionPrimary_3);

            afterParserOrEnumRuleCall();

          }

        }
          break;
        case 3:
        // InternalMdxParser.g:1700:3: this_ValueExpressionPrimary_4=
        // ruleValueExpressionPrimary
        {

          newCompositeNode(grammarAccess.getFactorAccess().getValueExpressionPrimaryParserRuleCall_2());

          pushFollow(FOLLOW_2);
          this_ValueExpressionPrimary_4 = ruleValueExpressionPrimary();

          state._fsp--;

          current.merge(this_ValueExpressionPrimary_4);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleFactor"

  // $ANTLR start "entryRuleFunction"
  // InternalMdxParser.g:1714:1: entryRuleFunction returns [String current=null] :
  // iv_ruleFunction= ruleFunction EOF ;
  public final String entryRuleFunction() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleFunction = null;

    try {
      // InternalMdxParser.g:1714:48: (iv_ruleFunction= ruleFunction EOF )
      // InternalMdxParser.g:1715:2: iv_ruleFunction= ruleFunction EOF
      {
        newCompositeNode(grammarAccess.getFunctionRule());
        pushFollow(FOLLOW_1);
        iv_ruleFunction = ruleFunction();

        state._fsp--;

        current = iv_ruleFunction.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleFunction"

  // $ANTLR start "ruleFunction"
  // InternalMdxParser.g:1721:1: ruleFunction returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_Identifier_0= ruleIdentifier
  // this_LPAREN_1= ruleLPAREN (this_ExpressionList_2= ruleExpressionList )?
  // this_RPAREN_3= ruleRPAREN ) ;
  public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Identifier_0 = null;

    AntlrDatatypeRuleToken this_LPAREN_1 = null;

    AntlrDatatypeRuleToken this_ExpressionList_2 = null;

    AntlrDatatypeRuleToken this_RPAREN_3 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1727:2: ( (this_Identifier_0= ruleIdentifier
      // this_LPAREN_1= ruleLPAREN (this_ExpressionList_2= ruleExpressionList )?
      // this_RPAREN_3= ruleRPAREN ) )
      // InternalMdxParser.g:1728:2: (this_Identifier_0= ruleIdentifier this_LPAREN_1=
      // ruleLPAREN (this_ExpressionList_2= ruleExpressionList )? this_RPAREN_3=
      // ruleRPAREN )
      {
        // InternalMdxParser.g:1728:2: (this_Identifier_0= ruleIdentifier this_LPAREN_1=
        // ruleLPAREN (this_ExpressionList_2= ruleExpressionList )? this_RPAREN_3=
        // ruleRPAREN )
        // InternalMdxParser.g:1729:3: this_Identifier_0= ruleIdentifier this_LPAREN_1=
        // ruleLPAREN (this_ExpressionList_2= ruleExpressionList )? this_RPAREN_3=
        // ruleRPAREN
        {

          newCompositeNode(grammarAccess.getFunctionAccess().getIdentifierParserRuleCall_0());

          pushFollow(FOLLOW_32);
          this_Identifier_0 = ruleIdentifier();

          state._fsp--;

          current.merge(this_Identifier_0);

          afterParserOrEnumRuleCall();

          newCompositeNode(grammarAccess.getFunctionAccess().getLPARENParserRuleCall_1());

          pushFollow(FOLLOW_33);
          this_LPAREN_1 = ruleLPAREN();

          state._fsp--;

          current.merge(this_LPAREN_1);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1749:3: (this_ExpressionList_2= ruleExpressionList )?
          int alt31 = 2;
          int LA31_0 = input.LA(1);

          if (((LA31_0 >= PROPERTIES && LA31_0 <= DIMENSION) || LA31_0 == CASE || LA31_0 == NOT
              || LA31_0 == LeftParenthesis || LA31_0 == PlusSign || LA31_0 == HyphenMinus || LA31_0 == LeftCurlyBracket
              || LA31_0 == RULE_ID || LA31_0 == RULE_QUOTED_ID || (LA31_0 >= RULE_INT && LA31_0 <= RULE_STRING))) {
            alt31 = 1;
          }
          switch (alt31) {
          case 1:
          // InternalMdxParser.g:1750:4: this_ExpressionList_2= ruleExpressionList
          {

            newCompositeNode(grammarAccess.getFunctionAccess().getExpressionListParserRuleCall_2());

            pushFollow(FOLLOW_33);
            this_ExpressionList_2 = ruleExpressionList();

            state._fsp--;

            current.merge(this_ExpressionList_2);

            afterParserOrEnumRuleCall();

          }
            break;

          }

          newCompositeNode(grammarAccess.getFunctionAccess().getRPARENParserRuleCall_3());

          pushFollow(FOLLOW_2);
          this_RPAREN_3 = ruleRPAREN();

          state._fsp--;

          current.merge(this_RPAREN_3);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleFunction"

  // $ANTLR start "entryRuleValueExpressionPrimary"
  // InternalMdxParser.g:1775:1: entryRuleValueExpressionPrimary returns [String
  // current=null] : iv_ruleValueExpressionPrimary= ruleValueExpressionPrimary EOF
  // ;
  public final String entryRuleValueExpressionPrimary() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleValueExpressionPrimary = null;

    try {
      // InternalMdxParser.g:1775:62: (iv_ruleValueExpressionPrimary=
      // ruleValueExpressionPrimary EOF )
      // InternalMdxParser.g:1776:2: iv_ruleValueExpressionPrimary=
      // ruleValueExpressionPrimary EOF
      {
        newCompositeNode(grammarAccess.getValueExpressionPrimaryRule());
        pushFollow(FOLLOW_1);
        iv_ruleValueExpressionPrimary = ruleValueExpressionPrimary();

        state._fsp--;

        current = iv_ruleValueExpressionPrimary.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleValueExpressionPrimary"

  // $ANTLR start "ruleValueExpressionPrimary"
  // InternalMdxParser.g:1782:1: ruleValueExpressionPrimary returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_ValueExpressionPrimary0_0= ruleValueExpressionPrimary0 (this_DOT_1=
  // ruleDOT (this_UnquotedIdentifier_2= ruleUnquotedIdentifier |
  // this_QuotedIdentifier_3= ruleQuotedIdentifier | this_AmpQuotedIdentifier_4=
  // ruleAmpQuotedIdentifier | this_Function_5= ruleFunction ) )* ) ;
  public final AntlrDatatypeRuleToken ruleValueExpressionPrimary() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_ValueExpressionPrimary0_0 = null;

    AntlrDatatypeRuleToken this_DOT_1 = null;

    AntlrDatatypeRuleToken this_UnquotedIdentifier_2 = null;

    AntlrDatatypeRuleToken this_QuotedIdentifier_3 = null;

    AntlrDatatypeRuleToken this_AmpQuotedIdentifier_4 = null;

    AntlrDatatypeRuleToken this_Function_5 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1788:2: ( (this_ValueExpressionPrimary0_0=
      // ruleValueExpressionPrimary0 (this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
      // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
      // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
      // ruleFunction ) )* ) )
      // InternalMdxParser.g:1789:2: (this_ValueExpressionPrimary0_0=
      // ruleValueExpressionPrimary0 (this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
      // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
      // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
      // ruleFunction ) )* )
      {
        // InternalMdxParser.g:1789:2: (this_ValueExpressionPrimary0_0=
        // ruleValueExpressionPrimary0 (this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
        // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
        // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
        // ruleFunction ) )* )
        // InternalMdxParser.g:1790:3: this_ValueExpressionPrimary0_0=
        // ruleValueExpressionPrimary0 (this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
        // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
        // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
        // ruleFunction ) )*
        {

          newCompositeNode(
              grammarAccess.getValueExpressionPrimaryAccess().getValueExpressionPrimary0ParserRuleCall_0());

          pushFollow(FOLLOW_19);
          this_ValueExpressionPrimary0_0 = ruleValueExpressionPrimary0();

          state._fsp--;

          current.merge(this_ValueExpressionPrimary0_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:1800:3: (this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
          // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
          // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
          // ruleFunction ) )*
          loop33: do {
            int alt33 = 2;
            int LA33_0 = input.LA(1);

            if ((LA33_0 == FullStop)) {
              alt33 = 1;
            }

            switch (alt33) {
            case 1:
            // InternalMdxParser.g:1801:4: this_DOT_1= ruleDOT (this_UnquotedIdentifier_2=
            // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
            // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
            // ruleFunction )
            {

              newCompositeNode(grammarAccess.getValueExpressionPrimaryAccess().getDOTParserRuleCall_1_0());

              pushFollow(FOLLOW_34);
              this_DOT_1 = ruleDOT();

              state._fsp--;

              current.merge(this_DOT_1);

              afterParserOrEnumRuleCall();

              // InternalMdxParser.g:1811:4: (this_UnquotedIdentifier_2=
              // ruleUnquotedIdentifier | this_QuotedIdentifier_3= ruleQuotedIdentifier |
              // this_AmpQuotedIdentifier_4= ruleAmpQuotedIdentifier | this_Function_5=
              // ruleFunction )
              int alt32 = 4;
              switch (input.LA(1)) {
              case DIMENSION: {
                int LA32_1 = input.LA(2);

                if ((LA32_1 == EOF || (LA32_1 >= PROPERTIES && LA32_1 <= SELECT) || (LA32_1 >= CELL && LA32_1 <= ELSE)
                    || (LA32_1 >= THEN && LA32_1 <= WHEN) || (LA32_1 >= AND && LA32_1 <= END)
                    || (LA32_1 >= SET && LA32_1 <= GreaterThanSignEqualsSign) || (LA32_1 >= ON && LA32_1 <= Apostrophe)
                    || (LA32_1 >= RightParenthesis && LA32_1 <= Colon)
                    || (LA32_1 >= LessThanSign && LA32_1 <= GreaterThanSign) || LA32_1 == RightCurlyBracket)) {
                  alt32 = 1;
                } else if ((LA32_1 == LeftParenthesis)) {
                  alt32 = 4;
                } else {
                  NoViableAltException nvae = new NoViableAltException("", 32, 1, input);

                  throw nvae;
                }
              }
                break;
              case PROPERTIES: {
                int LA32_2 = input.LA(2);

                if ((LA32_2 == EOF || (LA32_2 >= PROPERTIES && LA32_2 <= SELECT) || (LA32_2 >= CELL && LA32_2 <= ELSE)
                    || (LA32_2 >= THEN && LA32_2 <= WHEN) || (LA32_2 >= AND && LA32_2 <= END)
                    || (LA32_2 >= SET && LA32_2 <= GreaterThanSignEqualsSign) || (LA32_2 >= ON && LA32_2 <= Apostrophe)
                    || (LA32_2 >= RightParenthesis && LA32_2 <= Colon)
                    || (LA32_2 >= LessThanSign && LA32_2 <= GreaterThanSign) || LA32_2 == RightCurlyBracket)) {
                  alt32 = 1;
                } else if ((LA32_2 == LeftParenthesis)) {
                  alt32 = 4;
                } else {
                  NoViableAltException nvae = new NoViableAltException("", 32, 2, input);

                  throw nvae;
                }
              }
                break;
              case RULE_ID: {
                int LA32_3 = input.LA(2);

                if ((LA32_3 == EOF || (LA32_3 >= PROPERTIES && LA32_3 <= SELECT) || (LA32_3 >= CELL && LA32_3 <= ELSE)
                    || (LA32_3 >= THEN && LA32_3 <= WHEN) || (LA32_3 >= AND && LA32_3 <= END)
                    || (LA32_3 >= SET && LA32_3 <= GreaterThanSignEqualsSign) || (LA32_3 >= ON && LA32_3 <= Apostrophe)
                    || (LA32_3 >= RightParenthesis && LA32_3 <= Colon)
                    || (LA32_3 >= LessThanSign && LA32_3 <= GreaterThanSign) || LA32_3 == RightCurlyBracket)) {
                  alt32 = 1;
                } else if ((LA32_3 == LeftParenthesis)) {
                  alt32 = 4;
                } else {
                  NoViableAltException nvae = new NoViableAltException("", 32, 3, input);

                  throw nvae;
                }
              }
                break;
              case RULE_QUOTED_ID: {
                int LA32_4 = input.LA(2);

                if ((LA32_4 == LeftParenthesis)) {
                  alt32 = 4;
                } else if ((LA32_4 == EOF || (LA32_4 >= PROPERTIES && LA32_4 <= SELECT)
                    || (LA32_4 >= CELL && LA32_4 <= ELSE) || (LA32_4 >= THEN && LA32_4 <= WHEN)
                    || (LA32_4 >= AND && LA32_4 <= END) || (LA32_4 >= SET && LA32_4 <= GreaterThanSignEqualsSign)
                    || (LA32_4 >= ON && LA32_4 <= Apostrophe) || (LA32_4 >= RightParenthesis && LA32_4 <= Colon)
                    || (LA32_4 >= LessThanSign && LA32_4 <= GreaterThanSign) || LA32_4 == RightCurlyBracket)) {
                  alt32 = 2;
                } else {
                  NoViableAltException nvae = new NoViableAltException("", 32, 4, input);

                  throw nvae;
                }
              }
                break;
              case RULE_AMP_QUOTED_ID: {
                alt32 = 3;
              }
                break;
              default:
                NoViableAltException nvae = new NoViableAltException("", 32, 0, input);

                throw nvae;
              }

              switch (alt32) {
              case 1:
              // InternalMdxParser.g:1812:5: this_UnquotedIdentifier_2= ruleUnquotedIdentifier
              {

                newCompositeNode(
                    grammarAccess.getValueExpressionPrimaryAccess().getUnquotedIdentifierParserRuleCall_1_1_0());

                pushFollow(FOLLOW_19);
                this_UnquotedIdentifier_2 = ruleUnquotedIdentifier();

                state._fsp--;

                current.merge(this_UnquotedIdentifier_2);

                afterParserOrEnumRuleCall();

              }
                break;
              case 2:
              // InternalMdxParser.g:1823:5: this_QuotedIdentifier_3= ruleQuotedIdentifier
              {

                newCompositeNode(
                    grammarAccess.getValueExpressionPrimaryAccess().getQuotedIdentifierParserRuleCall_1_1_1());

                pushFollow(FOLLOW_19);
                this_QuotedIdentifier_3 = ruleQuotedIdentifier();

                state._fsp--;

                current.merge(this_QuotedIdentifier_3);

                afterParserOrEnumRuleCall();

              }
                break;
              case 3:
              // InternalMdxParser.g:1834:5: this_AmpQuotedIdentifier_4=
              // ruleAmpQuotedIdentifier
              {

                newCompositeNode(
                    grammarAccess.getValueExpressionPrimaryAccess().getAmpQuotedIdentifierParserRuleCall_1_1_2());

                pushFollow(FOLLOW_19);
                this_AmpQuotedIdentifier_4 = ruleAmpQuotedIdentifier();

                state._fsp--;

                current.merge(this_AmpQuotedIdentifier_4);

                afterParserOrEnumRuleCall();

              }
                break;
              case 4:
              // InternalMdxParser.g:1845:5: this_Function_5= ruleFunction
              {

                newCompositeNode(grammarAccess.getValueExpressionPrimaryAccess().getFunctionParserRuleCall_1_1_3());

                pushFollow(FOLLOW_19);
                this_Function_5 = ruleFunction();

                state._fsp--;

                current.merge(this_Function_5);

                afterParserOrEnumRuleCall();

              }
                break;

              }

            }
              break;

            default:
              break loop33;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleValueExpressionPrimary"

  // $ANTLR start "entryRuleValueExpressionPrimary0"
  // InternalMdxParser.g:1861:1: entryRuleValueExpressionPrimary0 returns [String
  // current=null] : iv_ruleValueExpressionPrimary0= ruleValueExpressionPrimary0
  // EOF ;
  public final String entryRuleValueExpressionPrimary0() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleValueExpressionPrimary0 = null;

    try {
      // InternalMdxParser.g:1861:63: (iv_ruleValueExpressionPrimary0=
      // ruleValueExpressionPrimary0 EOF )
      // InternalMdxParser.g:1862:2: iv_ruleValueExpressionPrimary0=
      // ruleValueExpressionPrimary0 EOF
      {
        newCompositeNode(grammarAccess.getValueExpressionPrimary0Rule());
        pushFollow(FOLLOW_1);
        iv_ruleValueExpressionPrimary0 = ruleValueExpressionPrimary0();

        state._fsp--;

        current = iv_ruleValueExpressionPrimary0.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleValueExpressionPrimary0"

  // $ANTLR start "ruleValueExpressionPrimary0"
  // InternalMdxParser.g:1868:1: ruleValueExpressionPrimary0 returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_Function_0= ruleFunction | (this_LPAREN_1= ruleLPAREN
  // this_ExpressionList_2= ruleExpressionList this_RPAREN_3= ruleRPAREN ) |
  // (this_LBRACE_4= ruleLBRACE (this_ExpressionList_5= ruleExpressionList )?
  // this_RBRACE_6= ruleRBRACE ) | this_CaseExpression_7= ruleCaseExpression |
  // this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_Identifier_10=
  // ruleIdentifier ) ;
  public final AntlrDatatypeRuleToken ruleValueExpressionPrimary0() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token this_STRING_8 = null;
    Token this_INT_9 = null;
    AntlrDatatypeRuleToken this_Function_0 = null;

    AntlrDatatypeRuleToken this_LPAREN_1 = null;

    AntlrDatatypeRuleToken this_ExpressionList_2 = null;

    AntlrDatatypeRuleToken this_RPAREN_3 = null;

    AntlrDatatypeRuleToken this_LBRACE_4 = null;

    AntlrDatatypeRuleToken this_ExpressionList_5 = null;

    AntlrDatatypeRuleToken this_RBRACE_6 = null;

    AntlrDatatypeRuleToken this_CaseExpression_7 = null;

    AntlrDatatypeRuleToken this_Identifier_10 = null;

    enterRule();

    try {
      // InternalMdxParser.g:1874:2: ( (this_Function_0= ruleFunction |
      // (this_LPAREN_1= ruleLPAREN this_ExpressionList_2= ruleExpressionList
      // this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE
      // (this_ExpressionList_5= ruleExpressionList )? this_RBRACE_6= ruleRBRACE ) |
      // this_CaseExpression_7= ruleCaseExpression | this_STRING_8= RULE_STRING |
      // this_INT_9= RULE_INT | this_Identifier_10= ruleIdentifier ) )
      // InternalMdxParser.g:1875:2: (this_Function_0= ruleFunction | (this_LPAREN_1=
      // ruleLPAREN this_ExpressionList_2= ruleExpressionList this_RPAREN_3=
      // ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_ExpressionList_5=
      // ruleExpressionList )? this_RBRACE_6= ruleRBRACE ) | this_CaseExpression_7=
      // ruleCaseExpression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT |
      // this_Identifier_10= ruleIdentifier )
      {
        // InternalMdxParser.g:1875:2: (this_Function_0= ruleFunction | (this_LPAREN_1=
        // ruleLPAREN this_ExpressionList_2= ruleExpressionList this_RPAREN_3=
        // ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_ExpressionList_5=
        // ruleExpressionList )? this_RBRACE_6= ruleRBRACE ) | this_CaseExpression_7=
        // ruleCaseExpression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT |
        // this_Identifier_10= ruleIdentifier )
        int alt35 = 7;
        alt35 = dfa35.predict(input);
        switch (alt35) {
        case 1:
        // InternalMdxParser.g:1876:3: this_Function_0= ruleFunction
        {

          newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getFunctionParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_Function_0 = ruleFunction();

          state._fsp--;

          current.merge(this_Function_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:1887:3: (this_LPAREN_1= ruleLPAREN this_ExpressionList_2=
        // ruleExpressionList this_RPAREN_3= ruleRPAREN )
        {
          // InternalMdxParser.g:1887:3: (this_LPAREN_1= ruleLPAREN this_ExpressionList_2=
          // ruleExpressionList this_RPAREN_3= ruleRPAREN )
          // InternalMdxParser.g:1888:4: this_LPAREN_1= ruleLPAREN this_ExpressionList_2=
          // ruleExpressionList this_RPAREN_3= ruleRPAREN
          {

            newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getLPARENParserRuleCall_1_0());

            pushFollow(FOLLOW_9);
            this_LPAREN_1 = ruleLPAREN();

            state._fsp--;

            current.merge(this_LPAREN_1);

            afterParserOrEnumRuleCall();

            newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_1_1());

            pushFollow(FOLLOW_33);
            this_ExpressionList_2 = ruleExpressionList();

            state._fsp--;

            current.merge(this_ExpressionList_2);

            afterParserOrEnumRuleCall();

            newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getRPARENParserRuleCall_1_2());

            pushFollow(FOLLOW_2);
            this_RPAREN_3 = ruleRPAREN();

            state._fsp--;

            current.merge(this_RPAREN_3);

            afterParserOrEnumRuleCall();

          }

        }
          break;
        case 3:
        // InternalMdxParser.g:1920:3: (this_LBRACE_4= ruleLBRACE
        // (this_ExpressionList_5= ruleExpressionList )? this_RBRACE_6= ruleRBRACE )
        {
          // InternalMdxParser.g:1920:3: (this_LBRACE_4= ruleLBRACE
          // (this_ExpressionList_5= ruleExpressionList )? this_RBRACE_6= ruleRBRACE )
          // InternalMdxParser.g:1921:4: this_LBRACE_4= ruleLBRACE (this_ExpressionList_5=
          // ruleExpressionList )? this_RBRACE_6= ruleRBRACE
          {

            newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getLBRACEParserRuleCall_2_0());

            pushFollow(FOLLOW_35);
            this_LBRACE_4 = ruleLBRACE();

            state._fsp--;

            current.merge(this_LBRACE_4);

            afterParserOrEnumRuleCall();

            // InternalMdxParser.g:1931:4: (this_ExpressionList_5= ruleExpressionList )?
            int alt34 = 2;
            int LA34_0 = input.LA(1);

            if (((LA34_0 >= PROPERTIES && LA34_0 <= DIMENSION) || LA34_0 == CASE || LA34_0 == NOT
                || LA34_0 == LeftParenthesis || LA34_0 == PlusSign || LA34_0 == HyphenMinus
                || LA34_0 == LeftCurlyBracket || LA34_0 == RULE_ID || LA34_0 == RULE_QUOTED_ID
                || (LA34_0 >= RULE_INT && LA34_0 <= RULE_STRING))) {
              alt34 = 1;
            }
            switch (alt34) {
            case 1:
            // InternalMdxParser.g:1932:5: this_ExpressionList_5= ruleExpressionList
            {

              newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getExpressionListParserRuleCall_2_1());

              pushFollow(FOLLOW_35);
              this_ExpressionList_5 = ruleExpressionList();

              state._fsp--;

              current.merge(this_ExpressionList_5);

              afterParserOrEnumRuleCall();

            }
              break;

            }

            newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getRBRACEParserRuleCall_2_2());

            pushFollow(FOLLOW_2);
            this_RBRACE_6 = ruleRBRACE();

            state._fsp--;

            current.merge(this_RBRACE_6);

            afterParserOrEnumRuleCall();

          }

        }
          break;
        case 4:
        // InternalMdxParser.g:1955:3: this_CaseExpression_7= ruleCaseExpression
        {

          newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getCaseExpressionParserRuleCall_3());

          pushFollow(FOLLOW_2);
          this_CaseExpression_7 = ruleCaseExpression();

          state._fsp--;

          current.merge(this_CaseExpression_7);

          afterParserOrEnumRuleCall();

        }
          break;
        case 5:
        // InternalMdxParser.g:1966:3: this_STRING_8= RULE_STRING
        {
          this_STRING_8 = (Token) match(input, RULE_STRING, FOLLOW_2);

          current.merge(this_STRING_8);

          newLeafNode(this_STRING_8, grammarAccess.getValueExpressionPrimary0Access().getSTRINGTerminalRuleCall_4());

        }
          break;
        case 6:
        // InternalMdxParser.g:1974:3: this_INT_9= RULE_INT
        {
          this_INT_9 = (Token) match(input, RULE_INT, FOLLOW_2);

          current.merge(this_INT_9);

          newLeafNode(this_INT_9, grammarAccess.getValueExpressionPrimary0Access().getINTTerminalRuleCall_5());

        }
          break;
        case 7:
        // InternalMdxParser.g:1982:3: this_Identifier_10= ruleIdentifier
        {

          newCompositeNode(grammarAccess.getValueExpressionPrimary0Access().getIdentifierParserRuleCall_6());

          pushFollow(FOLLOW_2);
          this_Identifier_10 = ruleIdentifier();

          state._fsp--;

          current.merge(this_Identifier_10);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleValueExpressionPrimary0"

  // $ANTLR start "entryRuleExpressionList"
  // InternalMdxParser.g:1996:1: entryRuleExpressionList returns [String
  // current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
  public final String entryRuleExpressionList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleExpressionList = null;

    try {
      // InternalMdxParser.g:1996:54: (iv_ruleExpressionList= ruleExpressionList EOF )
      // InternalMdxParser.g:1997:2: iv_ruleExpressionList= ruleExpressionList EOF
      {
        newCompositeNode(grammarAccess.getExpressionListRule());
        pushFollow(FOLLOW_1);
        iv_ruleExpressionList = ruleExpressionList();

        state._fsp--;

        current = iv_ruleExpressionList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleExpressionList"

  // $ANTLR start "ruleExpressionList"
  // InternalMdxParser.g:2003:1: ruleExpressionList returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_Expression_0= ruleExpression (this_COMMA_1= ruleCOMMA
  // this_Expression_2= ruleExpression )* ) ;
  public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_Expression_0 = null;

    AntlrDatatypeRuleToken this_COMMA_1 = null;

    AntlrDatatypeRuleToken this_Expression_2 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2009:2: ( (this_Expression_0= ruleExpression
      // (this_COMMA_1= ruleCOMMA this_Expression_2= ruleExpression )* ) )
      // InternalMdxParser.g:2010:2: (this_Expression_0= ruleExpression (this_COMMA_1=
      // ruleCOMMA this_Expression_2= ruleExpression )* )
      {
        // InternalMdxParser.g:2010:2: (this_Expression_0= ruleExpression (this_COMMA_1=
        // ruleCOMMA this_Expression_2= ruleExpression )* )
        // InternalMdxParser.g:2011:3: this_Expression_0= ruleExpression (this_COMMA_1=
        // ruleCOMMA this_Expression_2= ruleExpression )*
        {

          newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());

          pushFollow(FOLLOW_17);
          this_Expression_0 = ruleExpression();

          state._fsp--;

          current.merge(this_Expression_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:2021:3: (this_COMMA_1= ruleCOMMA this_Expression_2=
          // ruleExpression )*
          loop36: do {
            int alt36 = 2;
            int LA36_0 = input.LA(1);

            if ((LA36_0 == Comma)) {
              alt36 = 1;
            }

            switch (alt36) {
            case 1:
            // InternalMdxParser.g:2022:4: this_COMMA_1= ruleCOMMA this_Expression_2=
            // ruleExpression
            {

              newCompositeNode(grammarAccess.getExpressionListAccess().getCOMMAParserRuleCall_1_0());

              pushFollow(FOLLOW_9);
              this_COMMA_1 = ruleCOMMA();

              state._fsp--;

              current.merge(this_COMMA_1);

              afterParserOrEnumRuleCall();

              newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());

              pushFollow(FOLLOW_17);
              this_Expression_2 = ruleExpression();

              state._fsp--;

              current.merge(this_Expression_2);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop36;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleExpressionList"

  // $ANTLR start "entryRuleCaseExpression"
  // InternalMdxParser.g:2047:1: entryRuleCaseExpression returns [String
  // current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
  public final String entryRuleCaseExpression() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCaseExpression = null;

    try {
      // InternalMdxParser.g:2047:54: (iv_ruleCaseExpression= ruleCaseExpression EOF )
      // InternalMdxParser.g:2048:2: iv_ruleCaseExpression= ruleCaseExpression EOF
      {
        newCompositeNode(grammarAccess.getCaseExpressionRule());
        pushFollow(FOLLOW_1);
        iv_ruleCaseExpression = ruleCaseExpression();

        state._fsp--;

        current = iv_ruleCaseExpression.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCaseExpression"

  // $ANTLR start "ruleCaseExpression"
  // InternalMdxParser.g:2054:1: ruleCaseExpression returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CASE
  // (this_ValueExpression_1= ruleValueExpression )? (this_WhenList_2=
  // ruleWhenList )? (kw= ELSE this_ValueExpression_4= ruleValueExpression )? kw=
  // END ) ;
  public final AntlrDatatypeRuleToken ruleCaseExpression() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_ValueExpression_1 = null;

    AntlrDatatypeRuleToken this_WhenList_2 = null;

    AntlrDatatypeRuleToken this_ValueExpression_4 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2060:2: ( (kw= CASE (this_ValueExpression_1=
      // ruleValueExpression )? (this_WhenList_2= ruleWhenList )? (kw= ELSE
      // this_ValueExpression_4= ruleValueExpression )? kw= END ) )
      // InternalMdxParser.g:2061:2: (kw= CASE (this_ValueExpression_1=
      // ruleValueExpression )? (this_WhenList_2= ruleWhenList )? (kw= ELSE
      // this_ValueExpression_4= ruleValueExpression )? kw= END )
      {
        // InternalMdxParser.g:2061:2: (kw= CASE (this_ValueExpression_1=
        // ruleValueExpression )? (this_WhenList_2= ruleWhenList )? (kw= ELSE
        // this_ValueExpression_4= ruleValueExpression )? kw= END )
        // InternalMdxParser.g:2062:3: kw= CASE (this_ValueExpression_1=
        // ruleValueExpression )? (this_WhenList_2= ruleWhenList )? (kw= ELSE
        // this_ValueExpression_4= ruleValueExpression )? kw= END
        {
          kw = (Token) match(input, CASE, FOLLOW_36);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getCaseExpressionAccess().getCASEKeyword_0());

          // InternalMdxParser.g:2067:3: (this_ValueExpression_1= ruleValueExpression )?
          int alt37 = 2;
          int LA37_0 = input.LA(1);

          if (((LA37_0 >= PROPERTIES && LA37_0 <= DIMENSION) || LA37_0 == CASE || LA37_0 == NOT
              || LA37_0 == LeftParenthesis || LA37_0 == PlusSign || LA37_0 == HyphenMinus || LA37_0 == LeftCurlyBracket
              || LA37_0 == RULE_ID || LA37_0 == RULE_QUOTED_ID || (LA37_0 >= RULE_INT && LA37_0 <= RULE_STRING))) {
            alt37 = 1;
          }
          switch (alt37) {
          case 1:
          // InternalMdxParser.g:2068:4: this_ValueExpression_1= ruleValueExpression
          {

            newCompositeNode(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_1());

            pushFollow(FOLLOW_37);
            this_ValueExpression_1 = ruleValueExpression();

            state._fsp--;

            current.merge(this_ValueExpression_1);

            afterParserOrEnumRuleCall();

          }
            break;

          }

          // InternalMdxParser.g:2079:3: (this_WhenList_2= ruleWhenList )?
          int alt38 = 2;
          int LA38_0 = input.LA(1);

          if ((LA38_0 == WHEN)) {
            alt38 = 1;
          }
          switch (alt38) {
          case 1:
          // InternalMdxParser.g:2080:4: this_WhenList_2= ruleWhenList
          {

            newCompositeNode(grammarAccess.getCaseExpressionAccess().getWhenListParserRuleCall_2());

            pushFollow(FOLLOW_38);
            this_WhenList_2 = ruleWhenList();

            state._fsp--;

            current.merge(this_WhenList_2);

            afterParserOrEnumRuleCall();

          }
            break;

          }

          // InternalMdxParser.g:2091:3: (kw= ELSE this_ValueExpression_4=
          // ruleValueExpression )?
          int alt39 = 2;
          int LA39_0 = input.LA(1);

          if ((LA39_0 == ELSE)) {
            alt39 = 1;
          }
          switch (alt39) {
          case 1:
          // InternalMdxParser.g:2092:4: kw= ELSE this_ValueExpression_4=
          // ruleValueExpression
          {
            kw = (Token) match(input, ELSE, FOLLOW_9);

            current.merge(kw);
            newLeafNode(kw, grammarAccess.getCaseExpressionAccess().getELSEKeyword_3_0());

            newCompositeNode(grammarAccess.getCaseExpressionAccess().getValueExpressionParserRuleCall_3_1());

            pushFollow(FOLLOW_39);
            this_ValueExpression_4 = ruleValueExpression();

            state._fsp--;

            current.merge(this_ValueExpression_4);

            afterParserOrEnumRuleCall();

          }
            break;

          }

          kw = (Token) match(input, END, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getCaseExpressionAccess().getENDKeyword_4());

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCaseExpression"

  // $ANTLR start "entryRuleWhenList"
  // InternalMdxParser.g:2117:1: entryRuleWhenList returns [String current=null] :
  // iv_ruleWhenList= ruleWhenList EOF ;
  public final String entryRuleWhenList() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleWhenList = null;

    try {
      // InternalMdxParser.g:2117:48: (iv_ruleWhenList= ruleWhenList EOF )
      // InternalMdxParser.g:2118:2: iv_ruleWhenList= ruleWhenList EOF
      {
        newCompositeNode(grammarAccess.getWhenListRule());
        pushFollow(FOLLOW_1);
        iv_ruleWhenList = ruleWhenList();

        state._fsp--;

        current = iv_ruleWhenList.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleWhenList"

  // $ANTLR start "ruleWhenList"
  // InternalMdxParser.g:2124:1: ruleWhenList returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_WhenClause_0= ruleWhenClause
  // (this_WhenClause_1= ruleWhenClause )* ) ;
  public final AntlrDatatypeRuleToken ruleWhenList() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_WhenClause_0 = null;

    AntlrDatatypeRuleToken this_WhenClause_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2130:2: ( (this_WhenClause_0= ruleWhenClause
      // (this_WhenClause_1= ruleWhenClause )* ) )
      // InternalMdxParser.g:2131:2: (this_WhenClause_0= ruleWhenClause
      // (this_WhenClause_1= ruleWhenClause )* )
      {
        // InternalMdxParser.g:2131:2: (this_WhenClause_0= ruleWhenClause
        // (this_WhenClause_1= ruleWhenClause )* )
        // InternalMdxParser.g:2132:3: this_WhenClause_0= ruleWhenClause
        // (this_WhenClause_1= ruleWhenClause )*
        {

          newCompositeNode(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_0());

          pushFollow(FOLLOW_40);
          this_WhenClause_0 = ruleWhenClause();

          state._fsp--;

          current.merge(this_WhenClause_0);

          afterParserOrEnumRuleCall();

          // InternalMdxParser.g:2142:3: (this_WhenClause_1= ruleWhenClause )*
          loop40: do {
            int alt40 = 2;
            int LA40_0 = input.LA(1);

            if ((LA40_0 == WHEN)) {
              alt40 = 1;
            }

            switch (alt40) {
            case 1:
            // InternalMdxParser.g:2143:4: this_WhenClause_1= ruleWhenClause
            {

              newCompositeNode(grammarAccess.getWhenListAccess().getWhenClauseParserRuleCall_1());

              pushFollow(FOLLOW_40);
              this_WhenClause_1 = ruleWhenClause();

              state._fsp--;

              current.merge(this_WhenClause_1);

              afterParserOrEnumRuleCall();

            }
              break;

            default:
              break loop40;
            }
          } while (true);

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleWhenList"

  // $ANTLR start "entryRuleWhenClause"
  // InternalMdxParser.g:2158:1: entryRuleWhenClause returns [String current=null]
  // : iv_ruleWhenClause= ruleWhenClause EOF ;
  public final String entryRuleWhenClause() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleWhenClause = null;

    try {
      // InternalMdxParser.g:2158:50: (iv_ruleWhenClause= ruleWhenClause EOF )
      // InternalMdxParser.g:2159:2: iv_ruleWhenClause= ruleWhenClause EOF
      {
        newCompositeNode(grammarAccess.getWhenClauseRule());
        pushFollow(FOLLOW_1);
        iv_ruleWhenClause = ruleWhenClause();

        state._fsp--;

        current = iv_ruleWhenClause.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleWhenClause"

  // $ANTLR start "ruleWhenClause"
  // InternalMdxParser.g:2165:1: ruleWhenClause returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (kw= WHEN this_ValueExpression_1=
  // ruleValueExpression kw= THEN this_ValueExpression_3= ruleValueExpression ) ;
  public final AntlrDatatypeRuleToken ruleWhenClause() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;
    AntlrDatatypeRuleToken this_ValueExpression_1 = null;

    AntlrDatatypeRuleToken this_ValueExpression_3 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2171:2: ( (kw= WHEN this_ValueExpression_1=
      // ruleValueExpression kw= THEN this_ValueExpression_3= ruleValueExpression ) )
      // InternalMdxParser.g:2172:2: (kw= WHEN this_ValueExpression_1=
      // ruleValueExpression kw= THEN this_ValueExpression_3= ruleValueExpression )
      {
        // InternalMdxParser.g:2172:2: (kw= WHEN this_ValueExpression_1=
        // ruleValueExpression kw= THEN this_ValueExpression_3= ruleValueExpression )
        // InternalMdxParser.g:2173:3: kw= WHEN this_ValueExpression_1=
        // ruleValueExpression kw= THEN this_ValueExpression_3= ruleValueExpression
        {
          kw = (Token) match(input, WHEN, FOLLOW_9);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getWhenClauseAccess().getWHENKeyword_0());

          newCompositeNode(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_1());

          pushFollow(FOLLOW_41);
          this_ValueExpression_1 = ruleValueExpression();

          state._fsp--;

          current.merge(this_ValueExpression_1);

          afterParserOrEnumRuleCall();

          kw = (Token) match(input, THEN, FOLLOW_9);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getWhenClauseAccess().getTHENKeyword_2());

          newCompositeNode(grammarAccess.getWhenClauseAccess().getValueExpressionParserRuleCall_3());

          pushFollow(FOLLOW_2);
          this_ValueExpression_3 = ruleValueExpression();

          state._fsp--;

          current.merge(this_ValueExpression_3);

          afterParserOrEnumRuleCall();

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleWhenClause"

  // $ANTLR start "entryRuleCompatingOperator"
  // InternalMdxParser.g:2207:1: entryRuleCompatingOperator returns [String
  // current=null] : iv_ruleCompatingOperator= ruleCompatingOperator EOF ;
  public final String entryRuleCompatingOperator() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCompatingOperator = null;

    try {
      // InternalMdxParser.g:2207:57: (iv_ruleCompatingOperator= ruleCompatingOperator
      // EOF )
      // InternalMdxParser.g:2208:2: iv_ruleCompatingOperator= ruleCompatingOperator
      // EOF
      {
        newCompositeNode(grammarAccess.getCompatingOperatorRule());
        pushFollow(FOLLOW_1);
        iv_ruleCompatingOperator = ruleCompatingOperator();

        state._fsp--;

        current = iv_ruleCompatingOperator.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCompatingOperator"

  // $ANTLR start "ruleCompatingOperator"
  // InternalMdxParser.g:2214:1: ruleCompatingOperator returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQ_0=
  // ruleEQ | this_NE_1= ruleNE | this_LT_2= ruleLT | this_GT_3= ruleGT |
  // this_LE_4= ruleLE | this_GE_5= ruleGE ) ;
  public final AntlrDatatypeRuleToken ruleCompatingOperator() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_EQ_0 = null;

    AntlrDatatypeRuleToken this_NE_1 = null;

    AntlrDatatypeRuleToken this_LT_2 = null;

    AntlrDatatypeRuleToken this_GT_3 = null;

    AntlrDatatypeRuleToken this_LE_4 = null;

    AntlrDatatypeRuleToken this_GE_5 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2220:2: ( (this_EQ_0= ruleEQ | this_NE_1= ruleNE |
      // this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE
      // ) )
      // InternalMdxParser.g:2221:2: (this_EQ_0= ruleEQ | this_NE_1= ruleNE |
      // this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE
      // )
      {
        // InternalMdxParser.g:2221:2: (this_EQ_0= ruleEQ | this_NE_1= ruleNE |
        // this_LT_2= ruleLT | this_GT_3= ruleGT | this_LE_4= ruleLE | this_GE_5= ruleGE
        // )
        int alt41 = 6;
        switch (input.LA(1)) {
        case EqualsSign: {
          alt41 = 1;
        }
          break;
        case LessThanSignGreaterThanSign: {
          alt41 = 2;
        }
          break;
        case LessThanSign: {
          alt41 = 3;
        }
          break;
        case GreaterThanSign: {
          alt41 = 4;
        }
          break;
        case LessThanSignEqualsSign: {
          alt41 = 5;
        }
          break;
        case GreaterThanSignEqualsSign: {
          alt41 = 6;
        }
          break;
        default:
          NoViableAltException nvae = new NoViableAltException("", 41, 0, input);

          throw nvae;
        }

        switch (alt41) {
        case 1:
        // InternalMdxParser.g:2222:3: this_EQ_0= ruleEQ
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getEQParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_EQ_0 = ruleEQ();

          state._fsp--;

          current.merge(this_EQ_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:2233:3: this_NE_1= ruleNE
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getNEParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_NE_1 = ruleNE();

          state._fsp--;

          current.merge(this_NE_1);

          afterParserOrEnumRuleCall();

        }
          break;
        case 3:
        // InternalMdxParser.g:2244:3: this_LT_2= ruleLT
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getLTParserRuleCall_2());

          pushFollow(FOLLOW_2);
          this_LT_2 = ruleLT();

          state._fsp--;

          current.merge(this_LT_2);

          afterParserOrEnumRuleCall();

        }
          break;
        case 4:
        // InternalMdxParser.g:2255:3: this_GT_3= ruleGT
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getGTParserRuleCall_3());

          pushFollow(FOLLOW_2);
          this_GT_3 = ruleGT();

          state._fsp--;

          current.merge(this_GT_3);

          afterParserOrEnumRuleCall();

        }
          break;
        case 5:
        // InternalMdxParser.g:2266:3: this_LE_4= ruleLE
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getLEParserRuleCall_4());

          pushFollow(FOLLOW_2);
          this_LE_4 = ruleLE();

          state._fsp--;

          current.merge(this_LE_4);

          afterParserOrEnumRuleCall();

        }
          break;
        case 6:
        // InternalMdxParser.g:2277:3: this_GE_5= ruleGE
        {

          newCompositeNode(grammarAccess.getCompatingOperatorAccess().getGEParserRuleCall_5());

          pushFollow(FOLLOW_2);
          this_GE_5 = ruleGE();

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
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCompatingOperator"

  // $ANTLR start "entryRuleIdentifier"
  // InternalMdxParser.g:2291:1: entryRuleIdentifier returns [String current=null]
  // : iv_ruleIdentifier= ruleIdentifier EOF ;
  public final String entryRuleIdentifier() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleIdentifier = null;

    try {
      // InternalMdxParser.g:2291:50: (iv_ruleIdentifier= ruleIdentifier EOF )
      // InternalMdxParser.g:2292:2: iv_ruleIdentifier= ruleIdentifier EOF
      {
        newCompositeNode(grammarAccess.getIdentifierRule());
        pushFollow(FOLLOW_1);
        iv_ruleIdentifier = ruleIdentifier();

        state._fsp--;

        current = iv_ruleIdentifier.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleIdentifier"

  // $ANTLR start "ruleIdentifier"
  // InternalMdxParser.g:2298:1: ruleIdentifier returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (this_UnquotedIdentifier_0=
  // ruleUnquotedIdentifier | this_QuotedIdentifier_1= ruleQuotedIdentifier ) ;
  public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    AntlrDatatypeRuleToken this_UnquotedIdentifier_0 = null;

    AntlrDatatypeRuleToken this_QuotedIdentifier_1 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2304:2: ( (this_UnquotedIdentifier_0=
      // ruleUnquotedIdentifier | this_QuotedIdentifier_1= ruleQuotedIdentifier ) )
      // InternalMdxParser.g:2305:2: (this_UnquotedIdentifier_0=
      // ruleUnquotedIdentifier | this_QuotedIdentifier_1= ruleQuotedIdentifier )
      {
        // InternalMdxParser.g:2305:2: (this_UnquotedIdentifier_0=
        // ruleUnquotedIdentifier | this_QuotedIdentifier_1= ruleQuotedIdentifier )
        int alt42 = 2;
        int LA42_0 = input.LA(1);

        if (((LA42_0 >= PROPERTIES && LA42_0 <= DIMENSION) || LA42_0 == RULE_ID)) {
          alt42 = 1;
        } else if ((LA42_0 == RULE_QUOTED_ID)) {
          alt42 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 42, 0, input);

          throw nvae;
        }
        switch (alt42) {
        case 1:
        // InternalMdxParser.g:2306:3: this_UnquotedIdentifier_0= ruleUnquotedIdentifier
        {

          newCompositeNode(grammarAccess.getIdentifierAccess().getUnquotedIdentifierParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_UnquotedIdentifier_0 = ruleUnquotedIdentifier();

          state._fsp--;

          current.merge(this_UnquotedIdentifier_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:2317:3: this_QuotedIdentifier_1= ruleQuotedIdentifier
        {

          newCompositeNode(grammarAccess.getIdentifierAccess().getQuotedIdentifierParserRuleCall_1());

          pushFollow(FOLLOW_2);
          this_QuotedIdentifier_1 = ruleQuotedIdentifier();

          state._fsp--;

          current.merge(this_QuotedIdentifier_1);

          afterParserOrEnumRuleCall();

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleIdentifier"

  // $ANTLR start "entryRuleUnquotedIdentifier"
  // InternalMdxParser.g:2331:1: entryRuleUnquotedIdentifier returns [String
  // current=null] : iv_ruleUnquotedIdentifier= ruleUnquotedIdentifier EOF ;
  public final String entryRuleUnquotedIdentifier() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleUnquotedIdentifier = null;

    try {
      // InternalMdxParser.g:2331:58: (iv_ruleUnquotedIdentifier=
      // ruleUnquotedIdentifier EOF )
      // InternalMdxParser.g:2332:2: iv_ruleUnquotedIdentifier= ruleUnquotedIdentifier
      // EOF
      {
        newCompositeNode(grammarAccess.getUnquotedIdentifierRule());
        pushFollow(FOLLOW_1);
        iv_ruleUnquotedIdentifier = ruleUnquotedIdentifier();

        state._fsp--;

        current = iv_ruleUnquotedIdentifier.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleUnquotedIdentifier"

  // $ANTLR start "ruleUnquotedIdentifier"
  // InternalMdxParser.g:2338:1: ruleUnquotedIdentifier returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // (this_Keyword_0= ruleKeyword | this_ID_1= RULE_ID ) ;
  public final AntlrDatatypeRuleToken ruleUnquotedIdentifier() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token this_ID_1 = null;
    AntlrDatatypeRuleToken this_Keyword_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2344:2: ( (this_Keyword_0= ruleKeyword | this_ID_1=
      // RULE_ID ) )
      // InternalMdxParser.g:2345:2: (this_Keyword_0= ruleKeyword | this_ID_1= RULE_ID
      // )
      {
        // InternalMdxParser.g:2345:2: (this_Keyword_0= ruleKeyword | this_ID_1= RULE_ID
        // )
        int alt43 = 2;
        int LA43_0 = input.LA(1);

        if (((LA43_0 >= PROPERTIES && LA43_0 <= DIMENSION))) {
          alt43 = 1;
        } else if ((LA43_0 == RULE_ID)) {
          alt43 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 43, 0, input);

          throw nvae;
        }
        switch (alt43) {
        case 1:
        // InternalMdxParser.g:2346:3: this_Keyword_0= ruleKeyword
        {

          newCompositeNode(grammarAccess.getUnquotedIdentifierAccess().getKeywordParserRuleCall_0());

          pushFollow(FOLLOW_2);
          this_Keyword_0 = ruleKeyword();

          state._fsp--;

          current.merge(this_Keyword_0);

          afterParserOrEnumRuleCall();

        }
          break;
        case 2:
        // InternalMdxParser.g:2357:3: this_ID_1= RULE_ID
        {
          this_ID_1 = (Token) match(input, RULE_ID, FOLLOW_2);

          current.merge(this_ID_1);

          newLeafNode(this_ID_1, grammarAccess.getUnquotedIdentifierAccess().getIDTerminalRuleCall_1());

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleUnquotedIdentifier"

  // $ANTLR start "entryRuleAmpQuotedIdentifier"
  // InternalMdxParser.g:2368:1: entryRuleAmpQuotedIdentifier returns [String
  // current=null] : iv_ruleAmpQuotedIdentifier= ruleAmpQuotedIdentifier EOF ;
  public final String entryRuleAmpQuotedIdentifier() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleAmpQuotedIdentifier = null;

    try {
      // InternalMdxParser.g:2368:59: (iv_ruleAmpQuotedIdentifier=
      // ruleAmpQuotedIdentifier EOF )
      // InternalMdxParser.g:2369:2: iv_ruleAmpQuotedIdentifier=
      // ruleAmpQuotedIdentifier EOF
      {
        newCompositeNode(grammarAccess.getAmpQuotedIdentifierRule());
        pushFollow(FOLLOW_1);
        iv_ruleAmpQuotedIdentifier = ruleAmpQuotedIdentifier();

        state._fsp--;

        current = iv_ruleAmpQuotedIdentifier.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleAmpQuotedIdentifier"

  // $ANTLR start "ruleAmpQuotedIdentifier"
  // InternalMdxParser.g:2375:1: ruleAmpQuotedIdentifier returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID ;
  public final AntlrDatatypeRuleToken ruleAmpQuotedIdentifier() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token this_AMP_QUOTED_ID_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2381:2: (this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID )
      // InternalMdxParser.g:2382:2: this_AMP_QUOTED_ID_0= RULE_AMP_QUOTED_ID
      {
        this_AMP_QUOTED_ID_0 = (Token) match(input, RULE_AMP_QUOTED_ID, FOLLOW_2);

        current.merge(this_AMP_QUOTED_ID_0);

        newLeafNode(this_AMP_QUOTED_ID_0,
            grammarAccess.getAmpQuotedIdentifierAccess().getAMP_QUOTED_IDTerminalRuleCall());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleAmpQuotedIdentifier"

  // $ANTLR start "entryRuleQuotedIdentifier"
  // InternalMdxParser.g:2392:1: entryRuleQuotedIdentifier returns [String
  // current=null] : iv_ruleQuotedIdentifier= ruleQuotedIdentifier EOF ;
  public final String entryRuleQuotedIdentifier() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleQuotedIdentifier = null;

    try {
      // InternalMdxParser.g:2392:56: (iv_ruleQuotedIdentifier= ruleQuotedIdentifier
      // EOF )
      // InternalMdxParser.g:2393:2: iv_ruleQuotedIdentifier= ruleQuotedIdentifier EOF
      {
        newCompositeNode(grammarAccess.getQuotedIdentifierRule());
        pushFollow(FOLLOW_1);
        iv_ruleQuotedIdentifier = ruleQuotedIdentifier();

        state._fsp--;

        current = iv_ruleQuotedIdentifier.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleQuotedIdentifier"

  // $ANTLR start "ruleQuotedIdentifier"
  // InternalMdxParser.g:2399:1: ruleQuotedIdentifier returns
  // [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
  // this_QUOTED_ID_0= RULE_QUOTED_ID ;
  public final AntlrDatatypeRuleToken ruleQuotedIdentifier() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token this_QUOTED_ID_0 = null;

    enterRule();

    try {
      // InternalMdxParser.g:2405:2: (this_QUOTED_ID_0= RULE_QUOTED_ID )
      // InternalMdxParser.g:2406:2: this_QUOTED_ID_0= RULE_QUOTED_ID
      {
        this_QUOTED_ID_0 = (Token) match(input, RULE_QUOTED_ID, FOLLOW_2);

        current.merge(this_QUOTED_ID_0);

        newLeafNode(this_QUOTED_ID_0, grammarAccess.getQuotedIdentifierAccess().getQUOTED_IDTerminalRuleCall());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleQuotedIdentifier"

  // $ANTLR start "entryRuleKeyword"
  // InternalMdxParser.g:2416:1: entryRuleKeyword returns [String current=null] :
  // iv_ruleKeyword= ruleKeyword EOF ;
  public final String entryRuleKeyword() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleKeyword = null;

    try {
      // InternalMdxParser.g:2416:47: (iv_ruleKeyword= ruleKeyword EOF )
      // InternalMdxParser.g:2417:2: iv_ruleKeyword= ruleKeyword EOF
      {
        newCompositeNode(grammarAccess.getKeywordRule());
        pushFollow(FOLLOW_1);
        iv_ruleKeyword = ruleKeyword();

        state._fsp--;

        current = iv_ruleKeyword.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleKeyword"

  // $ANTLR start "ruleKeyword"
  // InternalMdxParser.g:2423:1: ruleKeyword returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : (kw= DIMENSION | kw= PROPERTIES ) ;
  public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2429:2: ( (kw= DIMENSION | kw= PROPERTIES ) )
      // InternalMdxParser.g:2430:2: (kw= DIMENSION | kw= PROPERTIES )
      {
        // InternalMdxParser.g:2430:2: (kw= DIMENSION | kw= PROPERTIES )
        int alt44 = 2;
        int LA44_0 = input.LA(1);

        if ((LA44_0 == DIMENSION)) {
          alt44 = 1;
        } else if ((LA44_0 == PROPERTIES)) {
          alt44 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 44, 0, input);

          throw nvae;
        }
        switch (alt44) {
        case 1:
        // InternalMdxParser.g:2431:3: kw= DIMENSION
        {
          kw = (Token) match(input, DIMENSION, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getKeywordAccess().getDIMENSIONKeyword_0());

        }
          break;
        case 2:
        // InternalMdxParser.g:2437:3: kw= PROPERTIES
        {
          kw = (Token) match(input, PROPERTIES, FOLLOW_2);

          current.merge(kw);
          newLeafNode(kw, grammarAccess.getKeywordAccess().getPROPERTIESKeyword_1());

        }
          break;

        }

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleKeyword"

  // $ANTLR start "entryRuleQUOTE"
  // InternalMdxParser.g:2446:1: entryRuleQUOTE returns [String current=null] :
  // iv_ruleQUOTE= ruleQUOTE EOF ;
  public final String entryRuleQUOTE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleQUOTE = null;

    try {
      // InternalMdxParser.g:2446:45: (iv_ruleQUOTE= ruleQUOTE EOF )
      // InternalMdxParser.g:2447:2: iv_ruleQUOTE= ruleQUOTE EOF
      {
        newCompositeNode(grammarAccess.getQUOTERule());
        pushFollow(FOLLOW_1);
        iv_ruleQUOTE = ruleQUOTE();

        state._fsp--;

        current = iv_ruleQUOTE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleQUOTE"

  // $ANTLR start "ruleQUOTE"
  // InternalMdxParser.g:2453:1: ruleQUOTE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= Apostrophe ;
  public final AntlrDatatypeRuleToken ruleQUOTE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2459:2: (kw= Apostrophe )
      // InternalMdxParser.g:2460:2: kw= Apostrophe
      {
        kw = (Token) match(input, Apostrophe, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getQUOTEAccess().getApostropheKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleQUOTE"

  // $ANTLR start "entryRuleASTERISK"
  // InternalMdxParser.g:2468:1: entryRuleASTERISK returns [String current=null] :
  // iv_ruleASTERISK= ruleASTERISK EOF ;
  public final String entryRuleASTERISK() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleASTERISK = null;

    try {
      // InternalMdxParser.g:2468:48: (iv_ruleASTERISK= ruleASTERISK EOF )
      // InternalMdxParser.g:2469:2: iv_ruleASTERISK= ruleASTERISK EOF
      {
        newCompositeNode(grammarAccess.getASTERISKRule());
        pushFollow(FOLLOW_1);
        iv_ruleASTERISK = ruleASTERISK();

        state._fsp--;

        current = iv_ruleASTERISK.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleASTERISK"

  // $ANTLR start "ruleASTERISK"
  // InternalMdxParser.g:2475:1: ruleASTERISK returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
  public final AntlrDatatypeRuleToken ruleASTERISK() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2481:2: (kw= Asterisk )
      // InternalMdxParser.g:2482:2: kw= Asterisk
      {
        kw = (Token) match(input, Asterisk, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getASTERISKAccess().getAsteriskKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleASTERISK"

  // $ANTLR start "entryRuleCOLON"
  // InternalMdxParser.g:2490:1: entryRuleCOLON returns [String current=null] :
  // iv_ruleCOLON= ruleCOLON EOF ;
  public final String entryRuleCOLON() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCOLON = null;

    try {
      // InternalMdxParser.g:2490:45: (iv_ruleCOLON= ruleCOLON EOF )
      // InternalMdxParser.g:2491:2: iv_ruleCOLON= ruleCOLON EOF
      {
        newCompositeNode(grammarAccess.getCOLONRule());
        pushFollow(FOLLOW_1);
        iv_ruleCOLON = ruleCOLON();

        state._fsp--;

        current = iv_ruleCOLON.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCOLON"

  // $ANTLR start "ruleCOLON"
  // InternalMdxParser.g:2497:1: ruleCOLON returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= Colon ;
  public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2503:2: (kw= Colon )
      // InternalMdxParser.g:2504:2: kw= Colon
      {
        kw = (Token) match(input, Colon, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCOLON"

  // $ANTLR start "entryRuleCOMMA"
  // InternalMdxParser.g:2512:1: entryRuleCOMMA returns [String current=null] :
  // iv_ruleCOMMA= ruleCOMMA EOF ;
  public final String entryRuleCOMMA() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCOMMA = null;

    try {
      // InternalMdxParser.g:2512:45: (iv_ruleCOMMA= ruleCOMMA EOF )
      // InternalMdxParser.g:2513:2: iv_ruleCOMMA= ruleCOMMA EOF
      {
        newCompositeNode(grammarAccess.getCOMMARule());
        pushFollow(FOLLOW_1);
        iv_ruleCOMMA = ruleCOMMA();

        state._fsp--;

        current = iv_ruleCOMMA.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCOMMA"

  // $ANTLR start "ruleCOMMA"
  // InternalMdxParser.g:2519:1: ruleCOMMA returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= Comma ;
  public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2525:2: (kw= Comma )
      // InternalMdxParser.g:2526:2: kw= Comma
      {
        kw = (Token) match(input, Comma, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCOMMA"

  // $ANTLR start "entryRuleCONCAT"
  // InternalMdxParser.g:2534:1: entryRuleCONCAT returns [String current=null] :
  // iv_ruleCONCAT= ruleCONCAT EOF ;
  public final String entryRuleCONCAT() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleCONCAT = null;

    try {
      // InternalMdxParser.g:2534:46: (iv_ruleCONCAT= ruleCONCAT EOF )
      // InternalMdxParser.g:2535:2: iv_ruleCONCAT= ruleCONCAT EOF
      {
        newCompositeNode(grammarAccess.getCONCATRule());
        pushFollow(FOLLOW_1);
        iv_ruleCONCAT = ruleCONCAT();

        state._fsp--;

        current = iv_ruleCONCAT.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleCONCAT"

  // $ANTLR start "ruleCONCAT"
  // InternalMdxParser.g:2541:1: ruleCONCAT returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= VerticalLineVerticalLine ;
  public final AntlrDatatypeRuleToken ruleCONCAT() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2547:2: (kw= VerticalLineVerticalLine )
      // InternalMdxParser.g:2548:2: kw= VerticalLineVerticalLine
      {
        kw = (Token) match(input, VerticalLineVerticalLine, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getCONCATAccess().getVerticalLineVerticalLineKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleCONCAT"

  // $ANTLR start "entryRuleDOT"
  // InternalMdxParser.g:2556:1: entryRuleDOT returns [String current=null] :
  // iv_ruleDOT= ruleDOT EOF ;
  public final String entryRuleDOT() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleDOT = null;

    try {
      // InternalMdxParser.g:2556:43: (iv_ruleDOT= ruleDOT EOF )
      // InternalMdxParser.g:2557:2: iv_ruleDOT= ruleDOT EOF
      {
        newCompositeNode(grammarAccess.getDOTRule());
        pushFollow(FOLLOW_1);
        iv_ruleDOT = ruleDOT();

        state._fsp--;

        current = iv_ruleDOT.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleDOT"

  // $ANTLR start "ruleDOT"
  // InternalMdxParser.g:2563:1: ruleDOT returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= FullStop ;
  public final AntlrDatatypeRuleToken ruleDOT() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2569:2: (kw= FullStop )
      // InternalMdxParser.g:2570:2: kw= FullStop
      {
        kw = (Token) match(input, FullStop, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOTAccess().getFullStopKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleDOT"

  // $ANTLR start "entryRuleEQ"
  // InternalMdxParser.g:2578:1: entryRuleEQ returns [String current=null] :
  // iv_ruleEQ= ruleEQ EOF ;
  public final String entryRuleEQ() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleEQ = null;

    try {
      // InternalMdxParser.g:2578:42: (iv_ruleEQ= ruleEQ EOF )
      // InternalMdxParser.g:2579:2: iv_ruleEQ= ruleEQ EOF
      {
        newCompositeNode(grammarAccess.getEQRule());
        pushFollow(FOLLOW_1);
        iv_ruleEQ = ruleEQ();

        state._fsp--;

        current = iv_ruleEQ.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleEQ"

  // $ANTLR start "ruleEQ"
  // InternalMdxParser.g:2585:1: ruleEQ returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= EqualsSign ;
  public final AntlrDatatypeRuleToken ruleEQ() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2591:2: (kw= EqualsSign )
      // InternalMdxParser.g:2592:2: kw= EqualsSign
      {
        kw = (Token) match(input, EqualsSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getEQAccess().getEqualsSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleEQ"

  // $ANTLR start "entryRuleGE"
  // InternalMdxParser.g:2600:1: entryRuleGE returns [String current=null] :
  // iv_ruleGE= ruleGE EOF ;
  public final String entryRuleGE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleGE = null;

    try {
      // InternalMdxParser.g:2600:42: (iv_ruleGE= ruleGE EOF )
      // InternalMdxParser.g:2601:2: iv_ruleGE= ruleGE EOF
      {
        newCompositeNode(grammarAccess.getGERule());
        pushFollow(FOLLOW_1);
        iv_ruleGE = ruleGE();

        state._fsp--;

        current = iv_ruleGE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleGE"

  // $ANTLR start "ruleGE"
  // InternalMdxParser.g:2607:1: ruleGE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= GreaterThanSignEqualsSign ;
  public final AntlrDatatypeRuleToken ruleGE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2613:2: (kw= GreaterThanSignEqualsSign )
      // InternalMdxParser.g:2614:2: kw= GreaterThanSignEqualsSign
      {
        kw = (Token) match(input, GreaterThanSignEqualsSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getGEAccess().getGreaterThanSignEqualsSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleGE"

  // $ANTLR start "entryRuleGT"
  // InternalMdxParser.g:2622:1: entryRuleGT returns [String current=null] :
  // iv_ruleGT= ruleGT EOF ;
  public final String entryRuleGT() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleGT = null;

    try {
      // InternalMdxParser.g:2622:42: (iv_ruleGT= ruleGT EOF )
      // InternalMdxParser.g:2623:2: iv_ruleGT= ruleGT EOF
      {
        newCompositeNode(grammarAccess.getGTRule());
        pushFollow(FOLLOW_1);
        iv_ruleGT = ruleGT();

        state._fsp--;

        current = iv_ruleGT.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleGT"

  // $ANTLR start "ruleGT"
  // InternalMdxParser.g:2629:1: ruleGT returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= GreaterThanSign ;
  public final AntlrDatatypeRuleToken ruleGT() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2635:2: (kw= GreaterThanSign )
      // InternalMdxParser.g:2636:2: kw= GreaterThanSign
      {
        kw = (Token) match(input, GreaterThanSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getGTAccess().getGreaterThanSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleGT"

  // $ANTLR start "entryRuleLBRACE"
  // InternalMdxParser.g:2644:1: entryRuleLBRACE returns [String current=null] :
  // iv_ruleLBRACE= ruleLBRACE EOF ;
  public final String entryRuleLBRACE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleLBRACE = null;

    try {
      // InternalMdxParser.g:2644:46: (iv_ruleLBRACE= ruleLBRACE EOF )
      // InternalMdxParser.g:2645:2: iv_ruleLBRACE= ruleLBRACE EOF
      {
        newCompositeNode(grammarAccess.getLBRACERule());
        pushFollow(FOLLOW_1);
        iv_ruleLBRACE = ruleLBRACE();

        state._fsp--;

        current = iv_ruleLBRACE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleLBRACE"

  // $ANTLR start "ruleLBRACE"
  // InternalMdxParser.g:2651:1: ruleLBRACE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= LeftCurlyBracket ;
  public final AntlrDatatypeRuleToken ruleLBRACE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2657:2: (kw= LeftCurlyBracket )
      // InternalMdxParser.g:2658:2: kw= LeftCurlyBracket
      {
        kw = (Token) match(input, LeftCurlyBracket, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleLBRACE"

  // $ANTLR start "entryRuleLE"
  // InternalMdxParser.g:2666:1: entryRuleLE returns [String current=null] :
  // iv_ruleLE= ruleLE EOF ;
  public final String entryRuleLE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleLE = null;

    try {
      // InternalMdxParser.g:2666:42: (iv_ruleLE= ruleLE EOF )
      // InternalMdxParser.g:2667:2: iv_ruleLE= ruleLE EOF
      {
        newCompositeNode(grammarAccess.getLERule());
        pushFollow(FOLLOW_1);
        iv_ruleLE = ruleLE();

        state._fsp--;

        current = iv_ruleLE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleLE"

  // $ANTLR start "ruleLE"
  // InternalMdxParser.g:2673:1: ruleLE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= LessThanSignEqualsSign ;
  public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2679:2: (kw= LessThanSignEqualsSign )
      // InternalMdxParser.g:2680:2: kw= LessThanSignEqualsSign
      {
        kw = (Token) match(input, LessThanSignEqualsSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getLEAccess().getLessThanSignEqualsSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleLE"

  // $ANTLR start "entryRuleLPAREN"
  // InternalMdxParser.g:2688:1: entryRuleLPAREN returns [String current=null] :
  // iv_ruleLPAREN= ruleLPAREN EOF ;
  public final String entryRuleLPAREN() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleLPAREN = null;

    try {
      // InternalMdxParser.g:2688:46: (iv_ruleLPAREN= ruleLPAREN EOF )
      // InternalMdxParser.g:2689:2: iv_ruleLPAREN= ruleLPAREN EOF
      {
        newCompositeNode(grammarAccess.getLPARENRule());
        pushFollow(FOLLOW_1);
        iv_ruleLPAREN = ruleLPAREN();

        state._fsp--;

        current = iv_ruleLPAREN.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleLPAREN"

  // $ANTLR start "ruleLPAREN"
  // InternalMdxParser.g:2695:1: ruleLPAREN returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= LeftParenthesis ;
  public final AntlrDatatypeRuleToken ruleLPAREN() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2701:2: (kw= LeftParenthesis )
      // InternalMdxParser.g:2702:2: kw= LeftParenthesis
      {
        kw = (Token) match(input, LeftParenthesis, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getLPARENAccess().getLeftParenthesisKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleLPAREN"

  // $ANTLR start "entryRuleLT"
  // InternalMdxParser.g:2710:1: entryRuleLT returns [String current=null] :
  // iv_ruleLT= ruleLT EOF ;
  public final String entryRuleLT() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleLT = null;

    try {
      // InternalMdxParser.g:2710:42: (iv_ruleLT= ruleLT EOF )
      // InternalMdxParser.g:2711:2: iv_ruleLT= ruleLT EOF
      {
        newCompositeNode(grammarAccess.getLTRule());
        pushFollow(FOLLOW_1);
        iv_ruleLT = ruleLT();

        state._fsp--;

        current = iv_ruleLT.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleLT"

  // $ANTLR start "ruleLT"
  // InternalMdxParser.g:2717:1: ruleLT returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= LessThanSign ;
  public final AntlrDatatypeRuleToken ruleLT() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2723:2: (kw= LessThanSign )
      // InternalMdxParser.g:2724:2: kw= LessThanSign
      {
        kw = (Token) match(input, LessThanSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getLTAccess().getLessThanSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleLT"

  // $ANTLR start "entryRuleMINUS"
  // InternalMdxParser.g:2732:1: entryRuleMINUS returns [String current=null] :
  // iv_ruleMINUS= ruleMINUS EOF ;
  public final String entryRuleMINUS() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleMINUS = null;

    try {
      // InternalMdxParser.g:2732:45: (iv_ruleMINUS= ruleMINUS EOF )
      // InternalMdxParser.g:2733:2: iv_ruleMINUS= ruleMINUS EOF
      {
        newCompositeNode(grammarAccess.getMINUSRule());
        pushFollow(FOLLOW_1);
        iv_ruleMINUS = ruleMINUS();

        state._fsp--;

        current = iv_ruleMINUS.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleMINUS"

  // $ANTLR start "ruleMINUS"
  // InternalMdxParser.g:2739:1: ruleMINUS returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
  public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2745:2: (kw= HyphenMinus )
      // InternalMdxParser.g:2746:2: kw= HyphenMinus
      {
        kw = (Token) match(input, HyphenMinus, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getMINUSAccess().getHyphenMinusKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleMINUS"

  // $ANTLR start "entryRuleNE"
  // InternalMdxParser.g:2754:1: entryRuleNE returns [String current=null] :
  // iv_ruleNE= ruleNE EOF ;
  public final String entryRuleNE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleNE = null;

    try {
      // InternalMdxParser.g:2754:42: (iv_ruleNE= ruleNE EOF )
      // InternalMdxParser.g:2755:2: iv_ruleNE= ruleNE EOF
      {
        newCompositeNode(grammarAccess.getNERule());
        pushFollow(FOLLOW_1);
        iv_ruleNE = ruleNE();

        state._fsp--;

        current = iv_ruleNE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleNE"

  // $ANTLR start "ruleNE"
  // InternalMdxParser.g:2761:1: ruleNE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= LessThanSignGreaterThanSign ;
  public final AntlrDatatypeRuleToken ruleNE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2767:2: (kw= LessThanSignGreaterThanSign )
      // InternalMdxParser.g:2768:2: kw= LessThanSignGreaterThanSign
      {
        kw = (Token) match(input, LessThanSignGreaterThanSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getNEAccess().getLessThanSignGreaterThanSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleNE"

  // $ANTLR start "entryRulePLUS"
  // InternalMdxParser.g:2776:1: entryRulePLUS returns [String current=null] :
  // iv_rulePLUS= rulePLUS EOF ;
  public final String entryRulePLUS() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_rulePLUS = null;

    try {
      // InternalMdxParser.g:2776:44: (iv_rulePLUS= rulePLUS EOF )
      // InternalMdxParser.g:2777:2: iv_rulePLUS= rulePLUS EOF
      {
        newCompositeNode(grammarAccess.getPLUSRule());
        pushFollow(FOLLOW_1);
        iv_rulePLUS = rulePLUS();

        state._fsp--;

        current = iv_rulePLUS.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRulePLUS"

  // $ANTLR start "rulePLUS"
  // InternalMdxParser.g:2783:1: rulePLUS returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= PlusSign ;
  public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2789:2: (kw= PlusSign )
      // InternalMdxParser.g:2790:2: kw= PlusSign
      {
        kw = (Token) match(input, PlusSign, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getPLUSAccess().getPlusSignKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "rulePLUS"

  // $ANTLR start "entryRuleRBRACE"
  // InternalMdxParser.g:2798:1: entryRuleRBRACE returns [String current=null] :
  // iv_ruleRBRACE= ruleRBRACE EOF ;
  public final String entryRuleRBRACE() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleRBRACE = null;

    try {
      // InternalMdxParser.g:2798:46: (iv_ruleRBRACE= ruleRBRACE EOF )
      // InternalMdxParser.g:2799:2: iv_ruleRBRACE= ruleRBRACE EOF
      {
        newCompositeNode(grammarAccess.getRBRACERule());
        pushFollow(FOLLOW_1);
        iv_ruleRBRACE = ruleRBRACE();

        state._fsp--;

        current = iv_ruleRBRACE.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleRBRACE"

  // $ANTLR start "ruleRBRACE"
  // InternalMdxParser.g:2805:1: ruleRBRACE returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= RightCurlyBracket ;
  public final AntlrDatatypeRuleToken ruleRBRACE() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2811:2: (kw= RightCurlyBracket )
      // InternalMdxParser.g:2812:2: kw= RightCurlyBracket
      {
        kw = (Token) match(input, RightCurlyBracket, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleRBRACE"

  // $ANTLR start "entryRuleRPAREN"
  // InternalMdxParser.g:2820:1: entryRuleRPAREN returns [String current=null] :
  // iv_ruleRPAREN= ruleRPAREN EOF ;
  public final String entryRuleRPAREN() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleRPAREN = null;

    try {
      // InternalMdxParser.g:2820:46: (iv_ruleRPAREN= ruleRPAREN EOF )
      // InternalMdxParser.g:2821:2: iv_ruleRPAREN= ruleRPAREN EOF
      {
        newCompositeNode(grammarAccess.getRPARENRule());
        pushFollow(FOLLOW_1);
        iv_ruleRPAREN = ruleRPAREN();

        state._fsp--;

        current = iv_ruleRPAREN.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleRPAREN"

  // $ANTLR start "ruleRPAREN"
  // InternalMdxParser.g:2827:1: ruleRPAREN returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= RightParenthesis ;
  public final AntlrDatatypeRuleToken ruleRPAREN() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2833:2: (kw= RightParenthesis )
      // InternalMdxParser.g:2834:2: kw= RightParenthesis
      {
        kw = (Token) match(input, RightParenthesis, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getRPARENAccess().getRightParenthesisKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleRPAREN"

  // $ANTLR start "entryRuleSOLIDUS"
  // InternalMdxParser.g:2842:1: entryRuleSOLIDUS returns [String current=null] :
  // iv_ruleSOLIDUS= ruleSOLIDUS EOF ;
  public final String entryRuleSOLIDUS() throws RecognitionException {
    String current = null;

    AntlrDatatypeRuleToken iv_ruleSOLIDUS = null;

    try {
      // InternalMdxParser.g:2842:47: (iv_ruleSOLIDUS= ruleSOLIDUS EOF )
      // InternalMdxParser.g:2843:2: iv_ruleSOLIDUS= ruleSOLIDUS EOF
      {
        newCompositeNode(grammarAccess.getSOLIDUSRule());
        pushFollow(FOLLOW_1);
        iv_ruleSOLIDUS = ruleSOLIDUS();

        state._fsp--;

        current = iv_ruleSOLIDUS.getText();
        match(input, EOF, FOLLOW_2);

      }

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "entryRuleSOLIDUS"

  // $ANTLR start "ruleSOLIDUS"
  // InternalMdxParser.g:2849:1: ruleSOLIDUS returns [AntlrDatatypeRuleToken
  // current=new AntlrDatatypeRuleToken()] : kw= Solidus ;
  public final AntlrDatatypeRuleToken ruleSOLIDUS() throws RecognitionException {
    AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

    Token kw = null;

    enterRule();

    try {
      // InternalMdxParser.g:2855:2: (kw= Solidus )
      // InternalMdxParser.g:2856:2: kw= Solidus
      {
        kw = (Token) match(input, Solidus, FOLLOW_2);

        current.merge(kw);
        newLeafNode(kw, grammarAccess.getSOLIDUSAccess().getSolidusKeyword());

      }

      leaveRule();

    }

    catch (RecognitionException re) {
      recover(input, re);
      appendSkippedTokens();
    } finally {
    }
    return current;
  }
  // $ANTLR end "ruleSOLIDUS"

  // Delegated rules

  protected DFA35 dfa35 = new DFA35(this);
  static final String dfa_1s = "\14\uffff";
  static final String dfa_2s = "\1\uffff\4\13\7\uffff";
  static final String dfa_3s = "\5\6\7\uffff";
  static final String dfa_4s = "\1\67\4\60\7\uffff";
  static final String dfa_5s = "\5\uffff\1\2\1\3\1\4\1\5\1\6\1\1\1\7";
  static final String dfa_6s = "\14\uffff}>";
  static final String[] dfa_7s = {
      "\1\2\1\1\5\uffff\1\7\24\uffff\1\5\14\uffff\1\6\1\uffff\1\3\2\uffff\1\4\1\uffff\1\11\1\10",
      "\4\13\4\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff\5\13\1\uffff\4\13\1\12\10\13\1\uffff\3\13\1\uffff\1\13",
      "\4\13\4\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff\5\13\1\uffff\4\13\1\12\10\13\1\uffff\3\13\1\uffff\1\13",
      "\4\13\4\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff\5\13\1\uffff\4\13\1\12\10\13\1\uffff\3\13\1\uffff\1\13",
      "\4\13\4\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff\5\13\1\uffff\4\13\1\12\10\13\1\uffff\3\13\1\uffff\1\13", "",
      "", "", "", "", "", "" };

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
      return "1875:2: (this_Function_0= ruleFunction | (this_LPAREN_1= ruleLPAREN this_ExpressionList_2= ruleExpressionList this_RPAREN_3= ruleRPAREN ) | (this_LBRACE_4= ruleLBRACE (this_ExpressionList_5= ruleExpressionList )? this_RBRACE_6= ruleRBRACE ) | this_CaseExpression_7= ruleCaseExpression | this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | this_Identifier_10= ruleIdentifier )";
    }
  }

  public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
  public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000000001000100L });
  public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x0000000000000200L });
  public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x00D280A400C120C0L });
  public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x0000000000010000L });
  public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x00120000000000C0L });
  public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000000005042L });
  public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x00D280A400C020C0L });
  public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x0000000000004042L });
  public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x0000000001000102L });
  public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0000000020000000L });
  public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x00D280A600C020C0L });
  public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000200000000L });
  public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000004000000000L });
  public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x00120000000000C2L });
  public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0000004000000002L });
  public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x0000200000000000L });
  public static final BitSet FOLLOW_19 = new BitSet(new long[] { 0x0000010000000002L });
  public static final BitSet FOLLOW_20 = new BitSet(new long[] { 0x0000000000000400L });
  public static final BitSet FOLLOW_21 = new BitSet(new long[] { 0x00000000400000C0L });
  public static final BitSet FOLLOW_22 = new BitSet(new long[] { 0x0000000040000000L });
  public static final BitSet FOLLOW_23 = new BitSet(new long[] { 0x0000000000000040L });
  public static final BitSet FOLLOW_24 = new BitSet(new long[] { 0x00120000000008F0L });
  public static final BitSet FOLLOW_25 = new BitSet(new long[] { 0x00120000000008F2L });
  public static final BitSet FOLLOW_26 = new BitSet(new long[] { 0x0000040000000002L });
  public static final BitSet FOLLOW_27 = new BitSet(new long[] { 0x0000000082000002L });
  public static final BitSet FOLLOW_28 = new BitSet(new long[] { 0x0000000000100002L });
  public static final BitSet FOLLOW_29 = new BitSet(new long[] { 0x000070001C000002L });
  public static final BitSet FOLLOW_30 = new BitSet(new long[] { 0x000000A100000002L });
  public static final BitSet FOLLOW_31 = new BitSet(new long[] { 0x0000021000000002L });
  public static final BitSet FOLLOW_32 = new BitSet(new long[] { 0x0000000400000000L });
  public static final BitSet FOLLOW_33 = new BitSet(new long[] { 0x00D280AC00C020C0L });
  public static final BitSet FOLLOW_34 = new BitSet(new long[] { 0x001A0000000000C0L });
  public static final BitSet FOLLOW_35 = new BitSet(new long[] { 0x00D380A400C020C0L });
  public static final BitSet FOLLOW_36 = new BitSet(new long[] { 0x00D280A400E4A0C0L });
  public static final BitSet FOLLOW_37 = new BitSet(new long[] { 0x0000000000248000L });
  public static final BitSet FOLLOW_38 = new BitSet(new long[] { 0x0000000000208000L });
  public static final BitSet FOLLOW_39 = new BitSet(new long[] { 0x0000000000200000L });
  public static final BitSet FOLLOW_40 = new BitSet(new long[] { 0x0000000000040002L });
  public static final BitSet FOLLOW_41 = new BitSet(new long[] { 0x0000000000020000L });

}