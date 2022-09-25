package org.eclipse.daanse.mdx.parser.api.model;

public sealed interface Expression permits CallExpression, Literal, CompoundId, Segment {

}
