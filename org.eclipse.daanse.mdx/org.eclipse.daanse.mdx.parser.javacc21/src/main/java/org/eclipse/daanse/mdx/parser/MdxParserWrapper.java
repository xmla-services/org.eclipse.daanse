package org.eclipse.daanse.mdx.parser;

import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.eclipse.daanse.mdx.parser.api.model.MdxStatement;
import org.eclipse.daanse.mdx.parser.impl.MDXParser;
import org.eclipse.daanse.mdx.parser.impl.Node;

public class MdxParserWrapper implements MdxParser {
	private MDXParser delegate;

	public MdxParserWrapper(CharSequence mdx) {

		delegate = new MDXParser(mdx);
	}

	@Override
	public MdxStatement parseMdxStatement() throws MdxParserException {
	MdxStatement mdxStatement=	delegate.parseMdxStatement();
		Node root = delegate.rootNode();
		System.out.println("Dumping the AST...");
		root.dump();

		return mdxStatement;
	}

}
