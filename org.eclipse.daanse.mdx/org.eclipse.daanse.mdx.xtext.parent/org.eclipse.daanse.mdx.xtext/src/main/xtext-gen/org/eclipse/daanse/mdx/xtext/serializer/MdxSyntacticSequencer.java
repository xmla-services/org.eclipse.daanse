/*
 * generated by Xtext 2.28.0
 */
package org.eclipse.daanse.mdx.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.daanse.mdx.xtext.services.MdxGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MdxSyntacticSequencer extends AbstractSyntacticSequencer {

  protected MdxGrammarAccess grammarAccess;
  protected AbstractElementAlias match_SelectStatement_AxisSpecificationListParserRuleCall_3_q;
  protected AbstractElementAlias match_SelectStatement_CellPropetiesParserRuleCall_7_q;
  protected AbstractElementAlias match_SelectStatement___WHEREKeyword_6_0_SlicerSpecificationParserRuleCall_6_1__q;
  protected AbstractElementAlias match_SelectStatement___WITHKeyword_1_0_FormulaSpecificationParserRuleCall_1_1__q;

  @Inject
  protected void init(IGrammarAccess access) {
    grammarAccess = (MdxGrammarAccess) access;
    match_SelectStatement_AxisSpecificationListParserRuleCall_3_q = new TokenAlias(false, true,
        grammarAccess.getSelectStatementAccess().getAxisSpecificationListParserRuleCall_3());
    match_SelectStatement_CellPropetiesParserRuleCall_7_q = new TokenAlias(false, true,
        grammarAccess.getSelectStatementAccess().getCellPropetiesParserRuleCall_7());
    match_SelectStatement___WHEREKeyword_6_0_SlicerSpecificationParserRuleCall_6_1__q = new GroupAlias(false, true,
        new TokenAlias(false, false, grammarAccess.getSelectStatementAccess().getWHEREKeyword_6_0()), new TokenAlias(
            false, false, grammarAccess.getSelectStatementAccess().getSlicerSpecificationParserRuleCall_6_1()));
    match_SelectStatement___WITHKeyword_1_0_FormulaSpecificationParserRuleCall_1_1__q = new GroupAlias(false, true,
        new TokenAlias(false, false, grammarAccess.getSelectStatementAccess().getWITHKeyword_1_0()), new TokenAlias(
            false, false, grammarAccess.getSelectStatementAccess().getFormulaSpecificationParserRuleCall_1_1()));
  }

  @Override
  protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (ruleCall.getRule() == grammarAccess.getAxisSpecificationListRule())
      return getAxisSpecificationListToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getCellPropetiesRule())
      return getCellPropetiesToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getCubeSpecificationRule())
      return getCubeSpecificationToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getFormulaSpecificationRule())
      return getFormulaSpecificationToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getSlicerSpecificationRule())
      return getSlicerSpecificationToken(semanticObject, ruleCall, node);
    return "";
  }

  /**
   * AxisSpecificationList: AxisSpecification (COMMA AxisSpecification)*;
   */
  protected String getAxisSpecificationListToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "NOT ON DIMENSION";
  }

  /**
   * CellPropeties: 'CELL'? 'PROPERTIES' CellPropertyList;
   */
  protected String getCellPropetiesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "PROPERTIES CELL_ORDINAL ,";
  }

  /**
   * CubeSpecification: CubeName;
   */
  protected String getCubeSpecificationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "DIMENSION";
  }

  /**
   * FormulaSpecification: SingleFormulaSpecification+;
   */
  protected String getFormulaSpecificationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "MEMBER DIMENSION AS \' NOT ,";
  }

  /**
   * SlicerSpecification: Expression;
   */
  protected String getSlicerSpecificationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "NOT";
  }

  @Override
  protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
    if (transition.getAmbiguousSyntaxes().isEmpty())
      return;
    List<INode> transitionNodes = collectNodes(fromNode, toNode);
    for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
      List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
      if (match_SelectStatement_AxisSpecificationListParserRuleCall_3_q.equals(syntax))
        emit_SelectStatement_AxisSpecificationListParserRuleCall_3_q(semanticObject, getLastNavigableState(),
            syntaxNodes);
      else if (match_SelectStatement_CellPropetiesParserRuleCall_7_q.equals(syntax))
        emit_SelectStatement_CellPropetiesParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_SelectStatement___WHEREKeyword_6_0_SlicerSpecificationParserRuleCall_6_1__q.equals(syntax))
        emit_SelectStatement___WHEREKeyword_6_0_SlicerSpecificationParserRuleCall_6_1__q(semanticObject,
            getLastNavigableState(), syntaxNodes);
      else if (match_SelectStatement___WITHKeyword_1_0_FormulaSpecificationParserRuleCall_1_1__q.equals(syntax))
        emit_SelectStatement___WITHKeyword_1_0_FormulaSpecificationParserRuleCall_1_1__q(semanticObject,
            getLastNavigableState(), syntaxNodes);
      else
        acceptNodes(getLastNavigableState(), syntaxNodes);
    }
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     AxisSpecificationList?
   *
   * This ambiguous syntax occurs at:
   *     (rule start) ('WITH' FormulaSpecification)? 'SELECT' (ambiguity) 'FROM' CubeSpecification ('WHERE' SlicerSpecification)? CellPropeties? (rule start)
   * 
   * </pre>
   */
  protected void emit_SelectStatement_AxisSpecificationListParserRuleCall_3_q(EObject semanticObject,
      ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     CellPropeties?
   *
   * This ambiguous syntax occurs at:
   *     (rule start) ('WITH' FormulaSpecification)? 'SELECT' AxisSpecificationList? 'FROM' CubeSpecification ('WHERE' SlicerSpecification)? (ambiguity) (rule start)
   * 
   * </pre>
   */
  protected void emit_SelectStatement_CellPropetiesParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     ('WHERE' SlicerSpecification)?
   *
   * This ambiguous syntax occurs at:
   *     (rule start) ('WITH' FormulaSpecification)? 'SELECT' AxisSpecificationList? 'FROM' CubeSpecification (ambiguity) CellPropeties? (rule start)
   * 
   * </pre>
   */
  protected void emit_SelectStatement___WHEREKeyword_6_0_SlicerSpecificationParserRuleCall_6_1__q(
      EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     ('WITH' FormulaSpecification)?
   *
   * This ambiguous syntax occurs at:
   *     (rule start) (ambiguity) 'SELECT' AxisSpecificationList? 'FROM' CubeSpecification ('WHERE' SlicerSpecification)? CellPropeties? (rule start)
   * 
   * </pre>
   */
  protected void emit_SelectStatement___WITHKeyword_1_0_FormulaSpecificationParserRuleCall_1_1__q(
      EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

}