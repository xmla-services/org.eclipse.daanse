package org.eclipse.daanse.mdx.parser.api.model;

public record NameSegment(String name, Quoting quoting) implements Segment {

	public NameSegment {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		if (!(quoting == Quoting.QUOTED || quoting == Quoting.UNQUOTED)) {
			throw new IllegalArgumentException();
		}
	}
}
