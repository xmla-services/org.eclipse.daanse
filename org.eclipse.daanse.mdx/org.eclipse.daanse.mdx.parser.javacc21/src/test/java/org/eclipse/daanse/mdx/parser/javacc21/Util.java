package org.eclipse.daanse.mdx.parser.javacc21;

import org.eclipse.daanse.mdx.model.MdxStatement;
import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.model.select.SelectQueryAsteriskClause;
import org.eclipse.daanse.mdx.model.select.SelectQueryAxesClause;
import org.eclipse.daanse.mdx.parser.MdxParserWrapper;
import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;

public class Util {

	public static MdxParser newParser(String input) throws MdxParserException {
		return new MdxParserWrapper(input);
	}

	public static SelectQueryAsteriskClause parseSelectQueryAsteriskClause(String input) throws MdxParserException {

		return newParser(input).parseSelectQueryAsteriskClause();

	}
	
	public static SelectQueryAxesClause parseSelectQueryAxesClause(String input) throws MdxParserException {

		return newParser(input).parseSelectQueryAxesClause();

	}
	



	public static MdxStatement parseMdxStatement(String input) throws MdxParserException {

		return newParser(input).parseMdxStatement();

	}

	public static SelectStatement parseSelectStatement(String input) throws MdxParserException {

		return newParser(input).parseSelectStatement();

	}
}
