package org.eclipse.daanse.mdx.parser.javacc21;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.daanse.mdx.model.MdxStatement;
import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.junit.jupiter.api.Test;

public class MdxStatementTest {

	@Test
	public void testTypeSelectStatement() throws MdxParserException {
		String mdx = """
				SELECT [Customer].[Gender].[Gender].Membmers ON COLUMNS,
				         {[Customer].[Customer].[Aaron A. Allen],
				          [Customer].[Customer].[Abigail Clark]} ON ROWS
				   FROM [Adventure Works]
				   WHERE [Measures].[Internet Sales Amount]
				""";

		MdxStatement clause = Util.parseMdxStatement(mdx);
		assertThat(clause).isNotNull().isInstanceOf(SelectStatement.class);

	}

}
