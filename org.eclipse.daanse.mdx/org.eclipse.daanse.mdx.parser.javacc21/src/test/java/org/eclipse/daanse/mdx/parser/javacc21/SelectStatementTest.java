package org.eclipse.daanse.mdx.parser.javacc21;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.daanse.mdx.model.SelectStatement;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.junit.jupiter.api.Test;

public class SelectStatementTest {

  @Test
  public void testdefault() throws MdxParserException {
    String mdx = """
        SELECT [Customer].[Gender].[Gender].Membmers ON COLUMNS,
                 {[Customer].[Customer].[Aaron A. Allen],
                  [Customer].[Customer].[Abigail Clark]} ON ROWS
           FROM [Adventure Works]
           WHERE [Measures].[Internet Sales Amount]
        """;

    SelectStatement selectStatement = Util.parseSelectStatement(mdx);
    assertThat(selectStatement).isNotNull();

  }

}
