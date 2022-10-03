package org.eclipse.daanse.mdx.model.select;

import org.eclipse.daanse.mdx.model.Axis;
import org.eclipse.daanse.mdx.model.Expression;

public record SelectQueryAxisClause(boolean nonEmpty, Expression expression, Axis axis,
		SelectDimensionPropertyListClause selectDimensionPropertyListClause) {

}
