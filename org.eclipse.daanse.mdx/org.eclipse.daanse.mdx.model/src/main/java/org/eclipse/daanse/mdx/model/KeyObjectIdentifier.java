package org.eclipse.daanse.mdx.model;

import java.util.List;

public record KeyObjectIdentifier(List<NameObjectIdentifier> nameObjectIdentifiers) implements ObjectIdentifier {

	public KeyObjectIdentifier {
		if (nameObjectIdentifiers.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Quoting quoting() {
		return ObjectIdentifier.Quoting.KEY;
	}


}
