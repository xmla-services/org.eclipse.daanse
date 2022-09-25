package org.eclipse.daanse.mdx.parser.api.model;

import org.eclipse.daanse.mdx.parser.api.model.select.SelectCellPropertyListClause;
import org.eclipse.daanse.mdx.parser.api.model.select.SelectQueryClause;
import org.eclipse.daanse.mdx.parser.api.model.select.SelectSubcubeClause;
import org.eclipse.daanse.mdx.parser.api.model.select.SelectWithClause;

public record SelectStatement(SelectWithClause selectWithClause, SelectQueryClause selectQueryClause,
		SelectSubcubeClause selectSubcubeClause, SelectCellPropertyListClause SelectCellPropertyListClause)
		implements MdxStatement {

}
