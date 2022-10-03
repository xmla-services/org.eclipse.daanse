package org.eclipse.daanse.mdx.model.select;

public record SelectSubcubeClauseStatement(SelectQueryClause selectQueryClause, SelectSubcubeClause selectSubcubeClause,SelectSlicerAxisClause selectSlicerAxisClause)
		implements SelectSubcubeClause {


}
