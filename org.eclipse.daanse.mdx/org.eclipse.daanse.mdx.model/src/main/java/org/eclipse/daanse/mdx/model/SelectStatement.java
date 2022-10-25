package org.eclipse.daanse.mdx.model;

import org.eclipse.daanse.mdx.model.select.SelectCellPropertyListClause;
import org.eclipse.daanse.mdx.model.select.SelectQueryClause;
import org.eclipse.daanse.mdx.model.select.SelectSlicerAxisClause;
import org.eclipse.daanse.mdx.model.select.SelectSubcubeClause;
import org.eclipse.daanse.mdx.model.select.SelectWithClause;

public record SelectStatement(SelectWithClause selectWithClause, SelectQueryClause selectQueryClause,
    SelectSubcubeClause selectSubcubeClause, SelectSlicerAxisClause selectSlicerAxisClause,
    SelectCellPropertyListClause selectCellPropertyListClause) implements MdxStatement {

}
