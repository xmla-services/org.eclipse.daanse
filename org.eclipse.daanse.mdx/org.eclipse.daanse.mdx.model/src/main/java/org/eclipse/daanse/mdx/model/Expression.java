package org.eclipse.daanse.mdx.model;

public sealed interface Expression permits CallExpression, Literal, CompoundId, ObjectIdentifier {

}
