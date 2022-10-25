package org.eclipse.daanse.mdx.unparser.api;

import org.eclipse.daanse.mdx.model.MdxStatement;

public interface UnParser {

  public StringBuffer unparse(MdxStatement mdxStatement);
}
