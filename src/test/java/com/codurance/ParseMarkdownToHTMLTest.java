package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParseMarkdownToHTMLTest {
    @Test
    void convertMarkdownToHTMLTransformsMarkdownStringToHTMLString() {
        ParseMarkdownToHTML parseMarkdownToHTML = new ParseMarkdownToHTML();
        String markdown = """
                # Heading h1
                ## Heading h2
                ### Heading h3
                #### Heading h4
                ---
                """;
        String html = parseMarkdownToHTML.convert(markdown);

        assertThat(html)
                .isEqualTo("""
                        <h1>Heading h1</h1>
                        <h2>Heading h2</h2>
                        <h3>Heading h3</h3>
                        <h4>Heading h4</h4>
                        <hr />
                        """);
    }
}
