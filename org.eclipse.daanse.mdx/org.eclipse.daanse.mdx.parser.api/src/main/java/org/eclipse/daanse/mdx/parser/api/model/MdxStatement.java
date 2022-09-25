package org.eclipse.daanse.mdx.parser.api.model;

public sealed interface MdxStatement permits SelectStatement, DrillthroughStatement, ExplainStatement, DMVStatement, MdxRefreshStatement {

}
