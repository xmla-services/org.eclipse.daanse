package org.eclipse.daanse.mdx.parser.api;

import org.eclipse.daanse.mdx.parser.api.model.MdxStatement;

public interface MdxParser {


	public MdxStatement parseMdxStatement() throws MdxParserException;

}
