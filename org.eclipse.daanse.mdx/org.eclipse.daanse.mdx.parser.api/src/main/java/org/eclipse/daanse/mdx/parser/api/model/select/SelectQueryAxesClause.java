package org.eclipse.daanse.mdx.parser.api.model.select;

import java.util.List;

public record SelectQueryAxesClause(List<SelectQueryAxisClause> selectQueryAxisClauses) implements SelectQueryClause {


}
