package org.eclipse.daanse.mdx.model.select;

import org.eclipse.daanse.mdx.model.NameObjectIdentifier;

public record SelectSubcubeClauseName(NameObjectIdentifier cubeName) implements SelectSubcubeClause {

}
