define([], function() {
	var keywords = "AND|AS|CASE|CELL|CELL_ORDINAL|DIMENSION|ELSE|EMPTY|END|FORMATTED_VALUE|FROM|MEMBER|NON|NOT|ON|OR|PROPERTIES|SELECT|SET|THEN|VALUE|WHEN|WHERE|WITH|XOR";
	return {
		id: "xtext.mdx",
		contentTypes: ["xtext/mdx"],
		patterns: [
			{include: "orion.c-like#comment_singleLine"},
			{include: "orion.c-like#comment_block"},
			{include: "orion.lib#string_doubleQuote"},
			{include: "orion.lib#string_singleQuote"},
			{include: "orion.lib#number_decimal"},
			{include: "orion.lib#brace_open"},
			{include: "orion.lib#brace_close"},
			{include: "orion.lib#parenthesis_open"},
			{include: "orion.lib#parenthesis_close"},
			{name: "keyword.mdx", match: "\\b(?:" + keywords + ")\\b"}
		]
	};
});
