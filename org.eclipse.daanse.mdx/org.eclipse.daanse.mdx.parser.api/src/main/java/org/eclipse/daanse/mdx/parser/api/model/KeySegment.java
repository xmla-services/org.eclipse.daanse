package org.eclipse.daanse.mdx.parser.api.model;

import java.util.List;

public record KeySegment(List<NameSegment> segments) implements Segment {

	public KeySegment {
		if (segments.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Quoting quoting() {
		return Segment.Quoting.KEY;
	}


}
