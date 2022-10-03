package org.eclipse.daanse.mdx.parser;

import org.eclipse.daanse.mdx.model.MdxStatement;
import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.model.select.SelectQueryAsteriskClause;
import org.eclipse.daanse.mdx.model.select.SelectQueryAxesClause;
import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.eclipse.daanse.mdx.parser.impl.MDXParser;
import org.eclipse.daanse.mdx.parser.impl.Node;

public class MdxParserWrapper implements MdxParser {
	private MDXParser delegate;

	public MdxParserWrapper(CharSequence mdx) throws MdxParserException {

		if (mdx == null) {

			throw new MdxParserException("statement must not be null");
		} else if (mdx.length() == 0) {

			throw new MdxParserException("statement must not be empty");
		}
		try {
			delegate = new MDXParser(mdx);
		} catch (Exception e) {

			throw new MdxParserException("statement must not be empty");
		}
	}

	@Override
	public MdxStatement parseMdxStatement() throws MdxParserException {
		try {
			return delegate.parseMdxStatement();

		} catch (Throwable e) {
			throw new MdxParserException(e);
		} finally {
			dump();
		}

	}

	private void dump() {
		Node root = delegate.rootNode();
		if (root != null) {
			System.out.println("Dumping the AST...");
			root.dump();
		}
	}

	@Override
	public SelectQueryAsteriskClause parseSelectQueryAsteriskClause() throws MdxParserException {
		try {
			return delegate.parseSelectQueryAsteriskClause();

		} catch (Throwable e) {
			throw new MdxParserException(e);
		} finally {
			dump();
		}

	}

	@Override
	public SelectStatement parseSelectStatement() throws MdxParserException {
		try {
			return delegate.parseSelectStatement();

		} catch (Throwable e) {
			throw new MdxParserException(e);
		} finally {
			dump();
		}
	}

	@Override
	public SelectQueryAxesClause parseSelectQueryAxesClause() throws MdxParserException {
		try {
			return delegate.parseSelectQueryAxesClause();

		} catch (Throwable e) {
			throw new MdxParserException(e);
		} finally {
			dump();
		}
	}

}
