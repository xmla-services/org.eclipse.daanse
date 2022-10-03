package org.eclipse.daanse.mdx.model;

public sealed interface Literal extends Expression permits NullLiteral, NumericLiteral, StringLiteral, SymbolLiteral {

}
