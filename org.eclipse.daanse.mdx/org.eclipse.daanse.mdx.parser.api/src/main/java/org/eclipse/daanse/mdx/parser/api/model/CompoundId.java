package org.eclipse.daanse.mdx.parser.api.model;

import java.util.List;

public record CompoundId(List<Segment> segments) implements Expression {

}
