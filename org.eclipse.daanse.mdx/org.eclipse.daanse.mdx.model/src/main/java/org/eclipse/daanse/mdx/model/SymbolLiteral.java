package org.eclipse.daanse.mdx.model;

public record SymbolLiteral(String value) implements Literal {

  static final SymbolLiteral ASC = new SymbolLiteral("ASC");

}
