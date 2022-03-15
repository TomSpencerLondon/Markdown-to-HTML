package com.codurance;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class ParseMarkdownToHTML {

    private final Parser parser;
    private final HtmlRenderer htmlRenderer;

    public ParseMarkdownToHTML() {
        parser = Parser.builder().build();
        htmlRenderer = HtmlRenderer.builder().build();
    }

    public String convert(String markdown) {
        Node document = parser.parse(markdown);
        return htmlRenderer.render(document);
    }
}
