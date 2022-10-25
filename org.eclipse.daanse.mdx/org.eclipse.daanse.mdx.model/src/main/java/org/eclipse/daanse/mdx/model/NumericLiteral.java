package org.eclipse.daanse.mdx.model;

import java.math.BigDecimal;

public record NumericLiteral(BigDecimal value) implements Literal {

  static final NumericLiteral ONE = new NumericLiteral(BigDecimal.ONE);
  static final NumericLiteral ZERO = new NumericLiteral(BigDecimal.ZERO);
  static final NumericLiteral NEGATIVE_ONE = new NumericLiteral(BigDecimal.ONE.negate());

}
