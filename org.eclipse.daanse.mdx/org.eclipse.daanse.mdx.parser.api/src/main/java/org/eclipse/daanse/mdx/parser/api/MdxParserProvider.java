package org.eclipse.daanse.mdx.parser.api;

public interface MdxParserProvider {

  MdxParser newParser(CharSequence mdx) throws MdxParserException;

}
