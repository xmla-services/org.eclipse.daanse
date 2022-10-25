package org.eclipse.daanse.mdx.parser.api;

import org.eclipse.daanse.mdx.model.MdxStatement;
import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.model.select.SelectQueryAsteriskClause;
import org.eclipse.daanse.mdx.model.select.SelectQueryAxesClause;

public interface MdxParser {

  public MdxStatement parseMdxStatement() throws MdxParserException;

  public SelectStatement parseSelectStatement() throws MdxParserException;

  public SelectQueryAsteriskClause parseSelectQueryAsteriskClause() throws MdxParserException;

  public SelectQueryAxesClause parseSelectQueryAxesClause() throws MdxParserException;

}
