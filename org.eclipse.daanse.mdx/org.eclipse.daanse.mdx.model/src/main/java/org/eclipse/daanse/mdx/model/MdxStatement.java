package org.eclipse.daanse.mdx.model;

public sealed interface MdxStatement permits SelectStatement, DrillthroughStatement, ExplainStatement, DMVStatement, MdxRefreshStatement {

}
