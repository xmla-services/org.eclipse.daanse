import org.eclipse.daanse.mdx.parser.api.MdxParserException;
import org.eclipse.daanse.mdx.parser.api.model.MdxStatement;
import org.eclipse.daanse.mdx.parser.api.model.select.SelectQueryClause;
import org.eclipse.daanse.mdx.parser.impl.MDXParser;

public class MDXParserTest {

	public static void main(String[] args)  throws MdxParserException {
		String mdx = """
				SELECT [Customer].[Gender].[Gender].Membmers ON COLUMNS,
	            {[Customer].[Customer].[Aaron A. Allen],
	             [Customer].[Customer].[Abigail Clark]} ON ROWS
	      FROM [Adventure Works]
	      WHERE [Measures].[Internet Sales Amount]
				""";
		
		String mdx2 = """
				SELECT 
	      FROM [Adventure Works]
				""";
		String mdx3 = """
				SELECT *
	      FROM [Adventure Works]
				""";
		String mdx4 = "*";

		try {
			MDXParser parser = new MDXParser(mdx);
		MdxStatement mdxStatement=	parser.parseMdxStatement();
		
		System.out.println(mdxStatement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			MDXParser parser = new MDXParser(mdx2);
		MdxStatement mdxStatement=	parser.parseMdxStatement();
		
		System.out.println(mdxStatement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		try {
			MDXParser parser = new MDXParser(mdx3);
		MdxStatement mdxStatement=	parser.parseMdxStatement();
		
		System.out.println(mdxStatement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			MDXParser parser=	 new MDXParser(mdx4);
		SelectQueryClause qc=	parser.parseSelectQueryAsteriskClause();
		
		System.out.println(qc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
