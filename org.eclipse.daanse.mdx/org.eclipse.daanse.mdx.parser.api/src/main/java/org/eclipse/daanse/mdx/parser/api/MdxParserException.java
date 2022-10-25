package org.eclipse.daanse.mdx.parser.api;

public class MdxParserException extends Exception {

  private static final long serialVersionUID = 1L;

  @SuppressWarnings("unused")
  private MdxParserException() {
    super("");
  }

  public MdxParserException(String message) {
    super(message);
  }

  public MdxParserException(String message, Throwable throwable) {
    super(message, throwable);
  }

  public MdxParserException(Throwable throwable) {
    super(throwable);
  }

}
