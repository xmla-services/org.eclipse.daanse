package org.eclipse.daanse.mdx.model;

public record NameObjectIdentifier(String name, Quoting quoting) implements ObjectIdentifier {

	public NameObjectIdentifier {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		if (!(quoting == Quoting.QUOTED || quoting == Quoting.UNQUOTED)) {
			throw new IllegalArgumentException();
		}
	}
}
