package org.eclipse.daanse.mdx.parser.api.model;

public sealed interface Segment extends Expression permits KeySegment, NameSegment {

	public enum Quoting {

		UNQUOTED,
		QUOTED,
		KEY
	}

	public Quoting quoting();
}
