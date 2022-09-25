package org.eclipse.daanse.mdx.parser.api.model;

public sealed interface Literal extends Expression permits NullLiteral, NumericLiteral, StringLiteral, SymbolLiteral {

}
