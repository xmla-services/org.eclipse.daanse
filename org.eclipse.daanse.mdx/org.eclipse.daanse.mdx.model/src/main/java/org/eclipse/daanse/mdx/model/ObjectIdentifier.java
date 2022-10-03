package org.eclipse.daanse.mdx.model;

public sealed interface ObjectIdentifier extends Expression permits KeyObjectIdentifier, NameObjectIdentifier {

	public enum Quoting {

		UNQUOTED,
		QUOTED,
		KEY
	}

	public Quoting quoting();
}
