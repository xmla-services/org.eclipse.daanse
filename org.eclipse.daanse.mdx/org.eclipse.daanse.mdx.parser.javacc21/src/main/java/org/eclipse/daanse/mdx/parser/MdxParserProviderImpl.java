package org.eclipse.daanse.mdx.parser;

import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.eclipse.daanse.mdx.parser.api.MdxParserProvider;
import org.osgi.service.component.annotations.Component;

@Component(service = MdxParserProvider.class)
public class MdxParserProviderImpl implements MdxParserProvider {

	@Override
	public MdxParser newParser(CharSequence mdx) throws MdxParserException {
		MdxParserWrapper parser = new MdxParserWrapper(mdx);
		return parser;
	}
}
