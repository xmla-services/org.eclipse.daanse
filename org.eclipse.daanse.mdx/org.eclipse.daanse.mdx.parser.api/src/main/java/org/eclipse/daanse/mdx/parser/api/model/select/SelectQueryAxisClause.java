package org.eclipse.daanse.mdx.parser.api.model.select;

import org.eclipse.daanse.mdx.parser.api.model.Axis;
import org.eclipse.daanse.mdx.parser.api.model.Expression;

public record SelectQueryAxisClause(boolean nonEmpty, Expression expression, Axis axis,
		SelectDimensionPropertyListClause selectDimensionPropertyListClause) {

}
