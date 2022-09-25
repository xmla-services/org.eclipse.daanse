package org.eclipse.daanse.mdx.parser.api.model;

public record NullLiteral() implements Literal {

	public static final NullLiteral SINGLETON = new NullLiteral();

}
