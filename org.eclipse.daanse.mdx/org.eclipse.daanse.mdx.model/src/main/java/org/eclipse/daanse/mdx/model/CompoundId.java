package org.eclipse.daanse.mdx.model;

import java.util.List;

public record CompoundId(List<ObjectIdentifier> objectIdentifiers) implements Expression {

}
