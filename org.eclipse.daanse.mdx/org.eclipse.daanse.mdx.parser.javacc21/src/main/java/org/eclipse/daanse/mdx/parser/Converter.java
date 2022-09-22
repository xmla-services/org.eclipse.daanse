package org.eclipse.daanse.mdx.parser;

import org.eclipse.daanse.mdx.parser.api.model.MdxStatement;
import org.eclipse.daanse.mdx.parser.api.model.SelectStatement;
import org.eclipse.daanse.mdx.parser.impl.Node;
import org.eclipse.daanse.mdx.parser.impl.tree.ASTDrillthroughStatement;
import org.eclipse.daanse.mdx.parser.impl.tree.ASTSelectStatement;

public class Converter {

	public static MdxStatement toStatement(Node node) {

		if (node instanceof ASTDrillthroughStatement) {
			return toDrillthroughStatement((ASTDrillthroughStatement) node);
		} else if (node instanceof ASTSelectStatement) {
			return toSelectStatement((ASTSelectStatement) node);
		} else {
			System.out.println(node);
		}

		return null;
	}

	private static SelectStatement toSelectStatement(ASTSelectStatement node) {
		return new SelectStatement();
	}

	private static org.eclipse.daanse.mdx.parser.api.model.DrillthroughStatement toDrillthroughStatement(
			ASTDrillthroughStatement emptyStatement) {
		return new org.eclipse.daanse.mdx.parser.api.model.DrillthroughStatement();
	}

}
