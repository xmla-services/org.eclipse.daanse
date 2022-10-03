package org.eclipse.daanse.mdx.model;

public record NullLiteral() implements Literal {

	public static final NullLiteral SINGLETON = new NullLiteral();

}
