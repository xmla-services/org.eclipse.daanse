package org.eclipse.daanse.mdx.unparser.simple;

import java.util.Map;

import org.eclipse.daanse.mdx.model.DMVStatement;
import org.eclipse.daanse.mdx.model.DrillthroughStatement;
import org.eclipse.daanse.mdx.model.ExplainStatement;
import org.eclipse.daanse.mdx.model.MdxRefreshStatement;
import org.eclipse.daanse.mdx.model.MdxStatement;
import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.model.select.SelectCellPropertyListClause;
import org.eclipse.daanse.mdx.model.select.SelectQueryClause;
import org.eclipse.daanse.mdx.model.select.SelectSlicerAxisClause;
import org.eclipse.daanse.mdx.model.select.SelectSubcubeClause;
import org.eclipse.daanse.mdx.model.select.SelectWithClause;
import org.eclipse.daanse.mdx.unparser.api.UnParser;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.converter.Converters;

@Component
@Designate(ocd = SimpleUnparser.Config.class)
public class SimpleUnparser implements UnParser {

  @ObjectClassDefinition()
  public interface Config {

    @AttributeDefinition(defaultValue = "false")
    default boolean commentUnusedElements() {
      return true;
    }
  }

  int indent = 0;

  private Config config = null;

  @Activate
  public void activate(Map<String, Object> configMap) {
    modifies(configMap);

  }

  @Deactivate
  public void deActivate(Map<String, Object> configMap) {
    this.config = null;

  }

  @Modified
  public void modifies(Map<String, Object> configMap) {
    this.config = Converters.standardConverter().convert(configMap).to(Config.class);

  }

  public StringBuffer unparse(SelectStatement selectStatement) {
    StringBuffer buf = new StringBuffer();

    buf.append(unparse(selectStatement.selectWithClause()));
    buf.append(unparse(selectStatement.selectQueryClause()));
    buf.append(unparse(selectStatement.selectSubcubeClause()));
    buf.append(unparse(selectStatement.selectSlicerAxisClause()));
    buf.append(unparse(selectStatement.selectCellPropertyListClause()));

    return buf;

  }

  private StringBuffer unparse(SelectCellPropertyListClause selectCellPropertyListClause) {
    // TODO Auto-generated method stub
    return null;
  }

  private StringBuffer unparse(SelectSlicerAxisClause selectSlicerAxisClause) {
    // TODO Auto-generated method stub
    return null;
  }

  private StringBuffer unparse(SelectSubcubeClause selectSubcubeClause) {
    // TODO Auto-generated method stub
    return null;
  }

  private StringBuffer unparse(SelectQueryClause selectQueryClause) {
    // TODO Auto-generated method stub
    return null;
  }

  private StringBuffer unparse(SelectWithClause selectWithClause) {
    return null;
    // TODO Auto-generated method stub

  }

  public StringBuffer unparse(DrillthroughStatement selectStatement) {
    return null;

  }

  public StringBuffer unparse(ExplainStatement selectStatement) {
    return null;

  }

  public StringBuffer unparse(DMVStatement selectStatement) {
    return null;

  }

  public StringBuffer unparse(MdxRefreshStatement selectStatement) {
    return null;

  }

  @Override
  public StringBuffer unparse(MdxStatement mdxStatement) {
    if (mdxStatement instanceof SelectStatement) {
      return unparse((SelectStatement) mdxStatement);
    } else if (mdxStatement instanceof DrillthroughStatement) {
      return unparse((DrillthroughStatement) mdxStatement);
    } else if (mdxStatement instanceof ExplainStatement) {
      return unparse((ExplainStatement) mdxStatement);
    } else if (mdxStatement instanceof DMVStatement) {
      return unparse((DMVStatement) mdxStatement);
    } else if (mdxStatement instanceof SelectStatement) {
      return unparse((SelectStatement) mdxStatement);
    }

    return new StringBuffer();
  }

}
