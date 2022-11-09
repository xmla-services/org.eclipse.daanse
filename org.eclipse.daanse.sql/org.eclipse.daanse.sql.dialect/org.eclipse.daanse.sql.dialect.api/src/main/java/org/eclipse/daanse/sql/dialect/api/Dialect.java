/*
// This software is subject to the terms of the Eclipse Public License v1.0
// Agreement, available at the following URL:
// http://www.eclipse.org/legal/epl-v10.html.
// You must accept the terms of that agreement to use this software.
//
// Copyright (c) 2002-2019 Hitachi Vantara and others.
// Copyright (C) 2021 Sergei Semenkov
// All rights reserved.
*/
package org.eclipse.daanse.sql.dialect.api;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.daanse.ip.IPCheck;

@IPCheck(original = mondrian.spi.Dialect.class, description = "")
public interface Dialect {
    /**
     * Converts an expression to upper case.
     *
     * <p>For example, for MySQL, {@code toUpper("foo.bar")} returns
     * {@code "UPPER(foo.bar)"}.</p>
     *
     * @param expr SQL expression
     *
     * @return SQL syntax that converts <code>expr</code>
     * into upper case.
     */
    String toUpper(String expr);

    /**
     * Generates a conditional statement in this dialect's syntax.
     *
     * <p>For example, {@code caseWhenElse("b", "1", "0")} returns
     * {@code "case when b then 1 else 0 end"} on Oracle,
     * {@code "Iif(b, 1, 0)"} on Access.
     *
     * @param cond Predicate expression
     * @param thenExpr Expression if condition is true
     * @param elseExpr Expression if condition is false
     * @return Conditional expression
     */
    String caseWhenElse(
        String cond,
        String thenExpr,
        String elseExpr);

    /**
     * Encloses an identifier in quotation marks appropriate for this
     * Dialect.
     *
     * <p>For example,
     * <code>quoteIdentifier("emp")</code> yields a string containing
     * <code>"emp"</code> in Oracle, and a string containing
     * <code>[emp]</code> in Access.
     *
     * @param val Identifier
     *
     * @return Quoted identifier
     */
    String quoteIdentifier(String val);

    /**
     * Appends to a buffer an identifier, quoted appropriately for this
     * Dialect.
     *
     * @param val identifier to quote (must not be null).
     * @param buf Buffer
     */
    void quoteIdentifier(String val, StringBuilder buf);

    /**
     * Encloses an identifier in quotation marks appropriate for the
     * current SQL dialect. For example, in Oracle, where the identifiers
     * are quoted using double-quotes,
     * <code>quoteIdentifier("schema","table")</code> yields a string
     * containing <code>"schema"."table"</code>.
     *
     * @param qual Qualifier. If it is not null,
     *             <code>"<em>qual</em>".</code> is prepended.
     * @param name Name to be quoted.
     * @return Quoted identifier
     */
    String quoteIdentifier(
        String qual,
        String name);

    /**
     * Appends to a buffer a list of identifiers, quoted
     * appropriately for this Dialect.
     *
     * <p>Names in the list may be null, but there must be at least one
     * non-null name in the list.</p>
     *
     * @param buf Buffer
     * @param names List of names to be quoted
     */
    void quoteIdentifier(
        StringBuilder buf,
        String... names);

    /**
     * Returns the character which is used to quote identifiers, or null
     * if quoting is not supported.
     *
     * @return identifier quote
     */
    String getQuoteIdentifierString();

    /**
     * Appends to a buffer a single-quoted SQL string.
     *
     * <p>For example, in the default dialect,
     * <code>quoteStringLiteral(buf, "Can't")</code> appends
     * "<code>'Can''t'</code>" to <code>buf</code>.
     *
     * @param buf Buffer to append to
     * @param s Literal
     */
    void quoteStringLiteral(
        StringBuilder buf,
        String s);

    /**
     * Appends to a buffer a numeric literal.
     *
     * <p>In the default dialect, numeric literals are printed as is.
     *
     * @param buf Buffer to append to
     * @param value Literal
     */
    void quoteNumericLiteral(
        StringBuilder buf,
        String value);

    /**
     * Appends to a buffer a boolean literal.
     *
     * <p>In the default dialect, boolean literals are printed as is.
     *
     * @param buf Buffer to append to
     * @param value Literal
     */
    void quoteBooleanLiteral(
        StringBuilder buf,
        String value);

    /**
     * Appends to a buffer a date literal.
     *
     * <p>For example, in the default dialect,
     * <code>quoteStringLiteral(buf, "1969-03-17")</code>
     * appends <code>DATE '1969-03-17'</code>.
     *
     * @param buf Buffer to append to
     * @param value Literal
     */
    void quoteDateLiteral(
        StringBuilder buf,
        String value);

    /**
     * Appends to a buffer a time literal.
     *
     * <p>For example, in the default dialect,
     * <code>quoteStringLiteral(buf, "12:34:56")</code>
     * appends <code>TIME '12:34:56'</code>.
     *
     * @param buf Buffer to append to
     * @param value Literal
     */
    void quoteTimeLiteral(
        StringBuilder buf,
        String value);

    /**
     * Appends to a buffer a timestamp literal.
     *
     * <p>For example, in the default dialect,
     * <code>quoteStringLiteral(buf, "1969-03-17 12:34:56")</code>
     * appends <code>TIMESTAMP '1969-03-17 12:34:56'</code>.
     *
     * @param buf Buffer to append to
     * @param value Literal
     */
    void quoteTimestampLiteral(
        StringBuilder buf,
        String value);

    /**
     * Returns whether this Dialect requires subqueries in the FROM clause
     * to have an alias.
     *
     * @see #allowsFromQuery()
     *
     * @return whether dialewct requires subqueries to have an alias
     */
    boolean requiresAliasForFromQuery();

    /**
     * Returns whether the SQL dialect allows "AS" in the FROM clause.
     * If so, "SELECT * FROM t AS alias" is a valid query.
     *
     * @return whether dialect allows AS in FROM clause
     */
    boolean allowsAs();

    /**
     * Returns whether this Dialect allows a subquery in the from clause,
     * for example
     *
     * <blockquote><code>SELECT * FROM (SELECT * FROM t) AS
     * x</code></blockquote>
     *
     * @see #requiresAliasForFromQuery()
     *
     * @return whether Dialect allows subquery in FROM clause
     */
    boolean allowsFromQuery();

    /**
     * Returns whether this Dialect allows multiple arguments to the
     * <code>COUNT(DISTINCT ...) aggregate function, for example
     *
     * <blockquote><code>SELECT COUNT(DISTINCT x, y) FROM t</code></blockquote>
     *
     * @see #allowsCountDistinct()
     * @see #allowsMultipleCountDistinct()
     *
     * @return whether Dialect allows multiple arguments to COUNT DISTINCT
     */
    boolean allowsCompoundCountDistinct();

    /**
     * Returns whether this Dialect supports distinct aggregations.
     *
     * <p>For example, Access does not allow
     * <blockquote>
     * <code>select count(distinct x) from t</code>
     * </blockquote>
     *
     * @return whether Dialect allows COUNT DISTINCT
     */
    boolean allowsCountDistinct();

    /**
     * Returns whether this Dialect supports more than one distinct
     * aggregation in the same query.
     *
     * <p>In Derby 10.1,
     * <blockquote>
     *   <code>select couunt(distinct x) from t</code>
     * </blockquote>
     * is OK, but
     * <blockquote>
     *   <code>select couunt(distinct x), count(distinct y) from t</code>
     * </blockquote>
     * gives "Multiple DISTINCT aggregates are not supported at this time."
     *
     * @return whether this Dialect supports more than one distinct
     * aggregation in the same query
     */
    boolean allowsMultipleCountDistinct();

    /**
     * Returns whether this Dialect has performant support of distinct SQL
     * measures in the same query.
     *
     * @return whether this dialect supports multiple count(distinct subquery)
     * measures in one query.
     */
    boolean allowsMultipleDistinctSqlMeasures();

    /**
     * Returns whether this Dialect supports distinct
     * aggregations with other aggregations in the same query.
     *
     * This may be enabled for performance reasons (Vertica)
     *
     * @return whether this Dialect supports more than one distinct
     * aggregation in the same query
     */
    boolean allowsCountDistinctWithOtherAggs();

    /**
     * Generates a SQL statement to represent an inline dataset.
     *
     * <p>For example, for Oracle, generates
     *
     * <pre>
     * SELECT 1 AS FOO, 'a' AS BAR FROM dual
     * UNION ALL
     * SELECT 2 AS FOO, 'b' AS BAR FROM dual
     * </pre>
     *
     * <p>For ANSI SQL, generates:
     *
     * <pre>
     * VALUES (1, 'a'), (2, 'b')
     * </pre>
     *
     * @param columnNames List of column names
     * @param columnTypes List of column types ("String" or "Numeric")
     * @param valueList List of rows values
     * @return SQL string
     */
    String generateInline(
        List<String> columnNames,
        List<String> columnTypes,
        List<String[]> valueList);

    /**
     * If Double values need to include additional exponent in its string
     * represenation. This is to make sure that Double literals will be
     * interpreted as doubles by LucidDB.
     *
     * @param value Double value to generate string for
     * @param valueString java string representation for this value.
     * @return whether an additional exponent "E0" needs to be appended
     *
     */
    boolean needsExponent(Object value, String valueString);

    /**
     * Appends to a buffer a value quoted for its type.
     *
     * @param buf Buffer to append to
     * @param value Value
     * @param datatype Datatype of value
     */
    void quote(
        StringBuilder buf,
        Object value,
        Datatype datatype);

    /**
     * Returns whether this dialect supports common SQL Data Definition
     * Language (DDL) statements such as <code>CREATE TABLE</code> and
     * <code>DROP INDEX</code>.
     *
     * <p>Access seems to allow DDL iff the .mdb file is writeable.
     *
     * @see java.sql.DatabaseMetaData#isReadOnly()
     *
     * @return whether this Dialect supports DDL
     */
    boolean allowsDdl();

    /**
     * Generates an item for an ORDER BY clause, sorting in the required
     * direction, and ensuring that NULL values collate either before or after
     * all non-NULL values, depending on the <code>collateNullsLast</code>
     * parameter.
     *
     * @param expr Expression
     * @param nullable Whether expression may have NULL values
     * @param ascending Whether to sort expression ascending
     * @param collateNullsLast Whether the null values should be sorted first
     * or last.
     *
     * @return Expression modified so that NULL values collate last
     */
    String generateOrderItem(
        String expr,
        boolean nullable,
        boolean ascending,
        boolean collateNullsLast);

    /**
     * Returns whether this Dialect supports expressions in the GROUP BY
     * clause. Derby/Cloudscape and Infobright do not.
     *
     * @return Whether this Dialect allows expressions in the GROUP BY
     *   clause
     */
    boolean supportsGroupByExpressions();

    /**
     * Returns whether this Dialect allows the GROUPING SETS construct in
     * the GROUP BY clause. Currently Greenplum, IBM DB2, Oracle, and Teradata.
     *
     * @return Whether this Dialect allows GROUPING SETS clause
     */
    boolean supportsGroupingSets();

    /**
     * Returns whether this Dialect places no limit on the number
     * of rows which can appear as elements of an IN or VALUES
     * expression.
     *
     * @return whether value list length is unlimited
     */
    boolean supportsUnlimitedValueList();

    /**
     * Returns true if this Dialect can include expressions in the GROUP BY
     * clause only by adding an expression to the SELECT clause and using
     * its alias.
     *
     * <p>For example, in such a dialect,
     * <blockquote>
     * <code>SELECT x, x FROM t GROUP BY x</code>
     * </blockquote>
     * would be illegal, but
     * <blockquote>
     * <code>SELECT x AS a, x AS b FROM t ORDER BY a, b</code>
     * </blockquote>
     *
     * would be legal.</p>
     *
     * <p>Infobright is the only such dialect.</p>
     *
     * @return Whether this Dialect can include expressions in the GROUP BY
     *   clause only by adding an expression to the SELECT clause and using
     *   its alias
     */
    boolean requiresGroupByAlias();

    /**
     * Returns true if this Dialect can include expressions in the ORDER BY
     * clause only by adding an expression to the SELECT clause and using
     * its alias.
     *
     * <p>For example, in such a dialect,
     * <blockquote>
     * <code>SELECT x FROM t ORDER BY x + y</code>
     * </blockquote>
     * would be illegal, but
     * <blockquote>
     * <code>SELECT x, x + y AS z FROM t ORDER BY z</code>
     * </blockquote>
     *
     * would be legal.</p>
     *
     * <p>MySQL, DB2 and Ingres are examples of such dialects.</p>
     *
     * @return Whether this Dialect can include expressions in the ORDER BY
     *   clause only by adding an expression to the SELECT clause and using
     *   its alias
     */
    boolean requiresOrderByAlias();

    /**
     * Returns true if this Dialect can include expressions in the HAVING
     * clause only by adding an expression to the SELECT clause and using
     * its alias.
     *
     * <p>For example, in such a dialect,
     * <blockquote>
     * <code>SELECT CONCAT(x) as foo FROM t HAVING CONCAT(x) LIKE "%"</code>
     * </blockquote>
     * would be illegal, but
     * <blockquote>
     * <code>SELECT CONCAT(x) as foo FROM t HAVING foo LIKE "%"</code>
     * </blockquote>
     *
     * would be legal.</p>
     *
     * <p>MySQL is an example of such dialects.</p>
     *
     * @return Whether this Dialect can include expressions in the HAVING
     *   clause only by adding an expression to the SELECT clause and using
     *   its alias
     */
    boolean requiresHavingAlias();

    /**
     * Returns true if aliases defined in the SELECT clause can be used as
     * expressions in the ORDER BY clause.
     *
     * <p>For example, in such a dialect,
     * <blockquote>
     * <code>SELECT x, x + y AS z FROM t ORDER BY z</code>
     * </blockquote>
     *
     * would be legal.</p>
     *
     * <p>MySQL, DB2 and Ingres are examples of dialects where this is true;
     * Access is a dialect where this is false.</p>
     *
     * @return Whether aliases defined in the SELECT clause can be used as
     * expressions in the ORDER BY clause.
     */
    boolean allowsOrderByAlias();

    /**
     * Returns true if this dialect allows only integers in the ORDER BY
     * clause of a UNION (or other set operation) query.
     *
     * <p>For example,
     *
     * <code>SELECT x, y + z FROM t<br/>
     * UNION ALL<br/>
     * SELECT x, y + z FROM t<br/>
     * ORDER BY 1, 2</code>
     *
     * is allowed but
     *
     * <code>SELECT x, y, z FROM t<br/>
     * UNION ALL<br/>
     * SELECT x, y, z FROM t<br/>
     * ORDER BY x</code>
     *
     * is not.
     *
     * <p>Teradata is an example of a dialect with this restriction.
     *
     * @return whether this dialect allows only integers in the ORDER BY
     * clause of a UNION (or other set operation) query
     */
    boolean requiresUnionOrderByOrdinal();

    /**
     * Returns true if this dialect allows an expression in the ORDER BY
     * clause of a UNION (or other set operation) query only if it occurs in
     * the SELECT clause.
     *
     * <p>For example,
     *
     * <code>SELECT x, y + z FROM t<br/>
     * UNION ALL<br/>
     * SELECT x, y + z FROM t<br/>
     * ORDER BY y + z</code>
     *
     * is allowed but
     *
     * <code>SELECT x, y, z FROM t<br/>
     * UNION ALL<br/>
     * SELECT x, y, z FROM t<br/>
     * ORDER BY y + z</code>
     * <code>SELECT x, y, z FROM t ORDER BY y + z</code>
     *
     * is not.
     *
     * <p>Access is an example of a dialect with this restriction.
     *
     * @return whether this dialect allows an expression in the ORDER BY
     * clause of a UNION (or other set operation) query only if it occurs in
     * the SELECT clause
     */
    boolean requiresUnionOrderByExprToBeInSelectClause();

    /**
     * Returns true if this dialect supports multi-value IN expressions.
     * E.g.,
     *
     * <code>WHERE (col1, col2) IN ((val1a, val2a), (val1b, val2b))</code>
     *
     * @return true if the dialect supports multi-value IN expressions
     */
    boolean supportsMultiValueInExpr();

    /**
     * Returns whether this Dialect supports the given concurrency type
     * in combination with the given result set type.
     *
     * <p>The result is similar to
     * {@link java.sql.DatabaseMetaData#supportsResultSetConcurrency(int, int)},
     * except that the JdbcOdbc bridge in JDK 1.6 overstates its abilities.
     * See bug 1690406.
     *
     * @param type defined in {@link java.sql.ResultSet}
     * @param concurrency type defined in {@link java.sql.ResultSet}
     * @return <code>true</code> if so; <code>false</code> otherwise
     */
    boolean supportsResultSetConcurrency(
        int type,
        int concurrency);

    /**
     * Returns the maximum length of the name of a database column or query
     * alias allowed by this dialect.
     *
     * @see java.sql.DatabaseMetaData#getMaxColumnNameLength()
     *
     * @return maximum number of characters in a column name
     */
    int getMaxColumnNameLength();


    /**
     * Assembles and returns a string containing any hints that should
     * be appended after the FROM clause in a SELECT statement, based
     * on any hints provided.  Any unrecognized or unsupported hints will
     * be ignored.
     *
     * @param buf The Stringbuffer to which the dialect-specific syntax
     * for any relevant table hints may be appended.  Must not be null.
     * @param hints A map of table hints provided in the schema definition
     */
    void appendHintsAfterFromClause(
        StringBuilder buf,
        Map<String, String> hints);

    /**
     * Returns whether this Dialect object can be used for all connections
     * from the same data source.
     *
     * <p>The default implementation returns {@code true}, and this allows
     * dialects to be cached and reused in environments where connections are
     * allocated from a pool based on the same data source.</p>
     *
     * <p>Data sources are deemed 'equal' by the same criteria used by Java
     * collections, namely the {@link Object#equals(Object)} and
     * {@link Object#hashCode()} methods.</p>
     *
     * @see mondrian.spi.DialectFactory#createDialect(javax.sql.DataSource, java.sql.Connection)
     *
     * @return Whether this dialect can be used for other connections created
     * from the same data source
     */
    boolean allowsDialectSharing();

    /**
     * Returns whether the database currently permits queries to include in the
     * SELECT clause expressions that are not listed in the GROUP BY clause. The
     * SQL standard allows this if the database can deduce that the expression
     * is functionally dependent on columns in the GROUP BY clause.
     *
     * <p>For example, {@code SELECT empno, first_name || ' ' || last_name FROM
     * emps GROUP BY empno} is valid because {@code empno} is the primary key of
     * the {@code emps} table, and therefore all columns are dependent on it.
     * For a given value of {@code empno},
     * {@code first_name || ' ' || last_name} has a unique value.
     *
     * <p>Most databases do not, MySQL is an example of one that does (if the
     * functioality is enabled).
     *
     * @return Whether this Dialect allows SELECT clauses to contain
     * columns that are not in the GROUP BY clause
     */
    boolean allowsSelectNotInGroupBy();

    /**
     * Returns whether this dialect supports "ANSI-style JOIN syntax",
     * {@code FROM leftTable JOIN rightTable ON conditon}.
     *
     * @return Whether this dialect supports FROM-JOIN-ON syntax.
     */
    boolean allowsJoinOn();

    /**
     * Informs Mondrian if the dialect supports regular expressions
     * when creating the 'where' or the 'having' clause.
     * @return True if regular expressions are supported.
     */
    boolean allowsRegularExpressionInWhereClause();

    /**
     * Some databases, like Greenplum, don't include nulls as part
     * of the results of a COUNT sql call. This allows dialects
     * to wrap the count expression in something before it is used
     * in the query.
     * @param exp The expression to wrap.
     * @return A valid expression to use for a count operation.
     */
    String generateCountExpression(String exp);

    /**
     * Must generate a String representing a regular expression match
     * operation between a string literal and a Java regular expression.
     * The string literal might be a column identifier or some other
     * identifier, but the implementation must presume that it is already
     * escaped and fit for use. The regular expression is not escaped
     * and must be adapted to the proper dialect rules.
     * <p>Postgres / Greenplum example:
     * <p><code>
     * generateRegularExpression(
     *   "'foodmart'.'customer_name'", "(?i).*oo.*") ->
     *   'foodmart'.'customer_name' ~ "(?i).*oo.*"
     * </code></p>
     * <p>Oracle example:
     * <p><code>
     * generateRegularExpression(
     *   "'foodmart'.'customer_name'", ".*oo.*") ->
     *   REGEXP_LIKE('foodmart'.'customer_name', ".*oo.*")
     * </code></p>
     *
     * <p>Dialects are allowed to return null if the dialect cannot
     * convert that particular regular expression into something that
     * the database would support.</p>
     *
     * @param source A String identifying the column to match against.
     * @param javaRegExp A Java regular expression to match against.
     * @return A dialect specific matching operation, or null if the
     * dialect cannot convert that particular regular expression into
     * something that the database would support.
     */
    String generateRegularExpression(
        String source,
        String javaRegExp);


    /**
     * <p>Chooses the most appropriate type for accessing the values of a
     * column in a result set for a dialect.</p>
     *
     * <p>Dialect-specific nuances involving type representation should be
     * encapsulated in implementing methods.  For example, if a dialect
     * has implicit rules involving scale or precision, they should be
     * handled within this method so the client can simply retrieve the
     * "best fit" SqlStatement.Type for the column.</p>
     *
     * @param metadata  Results set metadata
     * @param columnIndex Column ordinal (0-based)
     * @return the most appropriate SqlStatement.Type for the column
     */
    BestFitColumnType getType(ResultSetMetaData metadata, int columnIndex)
        throws SQLException;

    boolean requiresDrillthroughMaxRowsInLimit();

    /**
     * Checks the compatibility of the Dialect.
     * if it not fully compatible it must return -1
     * with values > 0 implementations could rank based on efficiency. 
     * 
     * @param dataSource
     * @return compatibility ranking
     * 
     */
	int compatibility(DataSource dataSource);
}
