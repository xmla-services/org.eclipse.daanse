package org.eclipse.daanse.mdx.parser.api.model;

public record SymbolLiteral(String value) implements Literal {

	static final SymbolLiteral ASC = new SymbolLiteral("ASC");

}
