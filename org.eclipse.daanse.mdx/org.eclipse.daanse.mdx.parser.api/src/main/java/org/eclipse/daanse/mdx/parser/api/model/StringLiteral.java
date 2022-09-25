package org.eclipse.daanse.mdx.parser.api.model;

public record StringLiteral(String value) implements Literal {

	static final StringLiteral EMPTY = new StringLiteral("");

}
