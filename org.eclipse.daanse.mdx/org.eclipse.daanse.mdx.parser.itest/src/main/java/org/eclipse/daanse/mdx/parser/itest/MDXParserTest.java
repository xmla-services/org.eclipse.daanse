package org.eclipse.daanse.mdx.parser.itest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.eclipse.daanse.mdx.parser.api.MdxParserProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.osgi.test.junit5.service.ServiceSource;

public class MDXParserTest {

	@ParameterizedTest
	@ServiceSource(serviceType = MdxParserProvider.class)
	public void testParseStatementsCount_Single(MdxParserProvider parserProvider) throws MdxParserException {
		String mdx = """
							SELECT [Customer].[Gender].[Gender].Members ON COLUMNS,
				            {[Customer].[Customer].[Aaron A. Allen],
				             [Customer].[Customer].[Abigail Clark]} ON ROWS
				      FROM [Adventure Works]
				      WHERE Measures.[Internet Sales Amount]
							""";

		MdxParser parser = parserProvider.newParser(mdx);

		assertThat(assertDoesNotThrow(() -> parser.parseMdxStatement())).isInstanceOf(SelectStatement.class);

	}
	

}
