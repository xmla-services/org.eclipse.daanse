/*
 * generated by Xtext 2.28.0
 */
package org.eclipse.daanse.mdx.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.daanse.mdx.xtext.ide.contentassist.antlr.internal.InternalMdxParser;
import org.eclipse.daanse.mdx.xtext.services.MdxGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MdxParser extends AbstractContentAssistParser {

  @Singleton
  public static final class NameMappings {

    private final Map<AbstractElement, String> mappings;

    @Inject
    public NameMappings(MdxGrammarAccess grammarAccess) {
      ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
      init(builder, grammarAccess);
      this.mappings = builder.build();
    }

    public String getRuleName(AbstractElement element) {
      return mappings.get(element);
    }

    private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MdxGrammarAccess grammarAccess) {
      builder.put(grammarAccess.getSingleFormulaSpecificationAccess().getAlternatives(),
          "rule__SingleFormulaSpecification__Alternatives");
      builder.put(grammarAccess.getSetSpecificationAccess().getAlternatives_3(),
          "rule__SetSpecification__Alternatives_3");
      builder.put(grammarAccess.getMemberSpecificationAccess().getAlternatives_3_0(),
          "rule__MemberSpecification__Alternatives_3_0");
      builder.put(grammarAccess.getCellPropertyAccess().getAlternatives(), "rule__CellProperty__Alternatives");
      builder.put(grammarAccess.getMandatoryCellPropertyAccess().getAlternatives(),
          "rule__MandatoryCellProperty__Alternatives");
      builder.put(grammarAccess.getValueExpressionAccess().getAlternatives_1(),
          "rule__ValueExpression__Alternatives_1");
      builder.put(grammarAccess.getTerm4Access().getAlternatives(), "rule__Term4__Alternatives");
      builder.put(grammarAccess.getTerm2Access().getAlternatives_1_0(), "rule__Term2__Alternatives_1_0");
      builder.put(grammarAccess.getTermAccess().getAlternatives_1_0(), "rule__Term__Alternatives_1_0");
      builder.put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
      builder.put(grammarAccess.getValueExpressionPrimaryAccess().getAlternatives_1_1(),
          "rule__ValueExpressionPrimary__Alternatives_1_1");
      builder.put(grammarAccess.getValueExpressionPrimary0Access().getAlternatives(),
          "rule__ValueExpressionPrimary0__Alternatives");
      builder.put(grammarAccess.getCompatingOperatorAccess().getAlternatives(),
          "rule__CompatingOperator__Alternatives");
      builder.put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
      builder.put(grammarAccess.getUnquotedIdentifierAccess().getAlternatives(),
          "rule__UnquotedIdentifier__Alternatives");
      builder.put(grammarAccess.getKeywordAccess().getAlternatives(), "rule__Keyword__Alternatives");
      builder.put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
      builder.put(grammarAccess.getSelectStatementAccess().getGroup_1(), "rule__SelectStatement__Group_1__0");
      builder.put(grammarAccess.getSelectStatementAccess().getGroup_6(), "rule__SelectStatement__Group_6__0");
      builder.put(grammarAccess.getSetSpecificationAccess().getGroup(), "rule__SetSpecification__Group__0");
      builder.put(grammarAccess.getSetSpecificationAccess().getGroup_3_0(), "rule__SetSpecification__Group_3_0__0");
      builder.put(grammarAccess.getMemberSpecificationAccess().getGroup(), "rule__MemberSpecification__Group__0");
      builder.put(grammarAccess.getMemberSpecificationAccess().getGroup_3(), "rule__MemberSpecification__Group_3__0");
      builder.put(grammarAccess.getMemberSpecificationAccess().getGroup_3_0_0(),
          "rule__MemberSpecification__Group_3_0_0__0");
      builder.put(grammarAccess.getAxisSpecificationListAccess().getGroup(), "rule__AxisSpecificationList__Group__0");
      builder.put(grammarAccess.getAxisSpecificationListAccess().getGroup_1(),
          "rule__AxisSpecificationList__Group_1__0");
      builder.put(grammarAccess.getMemberPropertyDefListAccess().getGroup(), "rule__MemberPropertyDefList__Group__0");
      builder.put(grammarAccess.getMemberPropertyDefListAccess().getGroup_1(),
          "rule__MemberPropertyDefList__Group_1__0");
      builder.put(grammarAccess.getMemberPropertyDefinitionAccess().getGroup(),
          "rule__MemberPropertyDefinition__Group__0");
      builder.put(grammarAccess.getCompoundIdAccess().getGroup(), "rule__CompoundId__Group__0");
      builder.put(grammarAccess.getCompoundIdAccess().getGroup_1(), "rule__CompoundId__Group_1__0");
      builder.put(grammarAccess.getAxisSpecificationAccess().getGroup(), "rule__AxisSpecification__Group__0");
      builder.put(grammarAccess.getAxisSpecificationAccess().getGroup_0(), "rule__AxisSpecification__Group_0__0");
      builder.put(grammarAccess.getDimPropertiesAccess().getGroup(), "rule__DimProperties__Group__0");
      builder.put(grammarAccess.getPropertyListAccess().getGroup(), "rule__PropertyList__Group__0");
      builder.put(grammarAccess.getPropertyListAccess().getGroup_1(), "rule__PropertyList__Group_1__0");
      builder.put(grammarAccess.getCellPropetiesAccess().getGroup(), "rule__CellPropeties__Group__0");
      builder.put(grammarAccess.getCellPropertyListAccess().getGroup(), "rule__CellPropertyList__Group__0");
      builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
      builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
      builder.put(grammarAccess.getValueExpressionAccess().getGroup(), "rule__ValueExpression__Group__0");
      builder.put(grammarAccess.getValueXorExpressionAccess().getGroup(), "rule__ValueXorExpression__Group__0");
      builder.put(grammarAccess.getValueOrExpressionAccess().getGroup(), "rule__ValueOrExpression__Group__0");
      builder.put(grammarAccess.getTerm5Access().getGroup(), "rule__Term5__Group__0");
      builder.put(grammarAccess.getTerm5Access().getGroup_1(), "rule__Term5__Group_1__0");
      builder.put(grammarAccess.getTerm4Access().getGroup_0(), "rule__Term4__Group_0__0");
      builder.put(grammarAccess.getTerm3Access().getGroup(), "rule__Term3__Group__0");
      builder.put(grammarAccess.getTerm3Access().getGroup_1(), "rule__Term3__Group_1__0");
      builder.put(grammarAccess.getTerm2Access().getGroup(), "rule__Term2__Group__0");
      builder.put(grammarAccess.getTerm2Access().getGroup_1(), "rule__Term2__Group_1__0");
      builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
      builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
      builder.put(grammarAccess.getFactorAccess().getGroup_0(), "rule__Factor__Group_0__0");
      builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
      builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
      builder.put(grammarAccess.getValueExpressionPrimaryAccess().getGroup(), "rule__ValueExpressionPrimary__Group__0");
      builder.put(grammarAccess.getValueExpressionPrimaryAccess().getGroup_1(),
          "rule__ValueExpressionPrimary__Group_1__0");
      builder.put(grammarAccess.getValueExpressionPrimary0Access().getGroup_1(),
          "rule__ValueExpressionPrimary0__Group_1__0");
      builder.put(grammarAccess.getValueExpressionPrimary0Access().getGroup_2(),
          "rule__ValueExpressionPrimary0__Group_2__0");
      builder.put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
      builder.put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
      builder.put(grammarAccess.getCaseExpressionAccess().getGroup(), "rule__CaseExpression__Group__0");
      builder.put(grammarAccess.getCaseExpressionAccess().getGroup_3(), "rule__CaseExpression__Group_3__0");
      builder.put(grammarAccess.getWhenListAccess().getGroup(), "rule__WhenList__Group__0");
      builder.put(grammarAccess.getWhenClauseAccess().getGroup(), "rule__WhenClause__Group__0");
      builder.put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
      builder.put(grammarAccess.getMdxStatementAccess().getStatementAssignment(),
          "rule__MdxStatement__StatementAssignment");
    }
  }

  @Inject
  private NameMappings nameMappings;

  @Inject
  private MdxGrammarAccess grammarAccess;

  @Override
  protected InternalMdxParser createParser() {
    InternalMdxParser result = new InternalMdxParser(null);
    result.setGrammarAccess(grammarAccess);
    return result;
  }

  @Override
  protected String getRuleName(AbstractElement element) {
    return nameMappings.getRuleName(element);
  }

  @Override
  protected String[] getInitialHiddenTokens() {
    return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
  }

  public MdxGrammarAccess getGrammarAccess() {
    return this.grammarAccess;
  }

  public void setGrammarAccess(MdxGrammarAccess grammarAccess) {
    this.grammarAccess = grammarAccess;
  }

  public NameMappings getNameMappings() {
    return nameMappings;
  }

  public void setNameMappings(NameMappings nameMappings) {
    this.nameMappings = nameMappings;
  }
}