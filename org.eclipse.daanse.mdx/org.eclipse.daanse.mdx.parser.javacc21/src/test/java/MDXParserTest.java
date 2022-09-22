import org.eclipse.daanse.mdx.parser.MdxParserProviderImpl;
import org.eclipse.daanse.mdx.parser.api.MdxParser;
import org.eclipse.daanse.mdx.parser.api.MdxParserException;

public class MDXParserTest {

	public static void main(String[] args)  throws MdxParserException {
		String mdx = """
							SELECT [Customer].[Gender].[Gender].Membmers ON COLUMNS,
				            {[Customer].[Customer].[Aaron A. Allen],
				             [Customer].[Customer].[Abigail Clark]} ON ROWS
				      FROM [Adventure Works]
				      WHERE [Measures].[Internet Sales Amount]
							""";

		try {
			MdxParser parser = new MdxParserProviderImpl().newParser(mdx);
			parser.parseStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
