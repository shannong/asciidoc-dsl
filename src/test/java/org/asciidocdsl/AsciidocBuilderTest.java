package org.asciidocdsl;

import org.asciidocdsl.domain.Document;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Shannon on 11/16/15.
 */
public class AsciidocBuilderTest {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testParagraph() {
        document.add(AsciidocBuilder.paragraph("test paragraph"));
        assertEquals("test paragraph\n\n", AsciidocBuilder.buildAsciidoc(document));
    }

    @Test
    public void testBold() {
        document.add(AsciidocBuilder.bold("test bold"));
        assertEquals("**test bold**\n", AsciidocBuilder.buildAsciidoc(document));
    }

    @Test
    public void testNesting() {
        document.add(AsciidocBuilder.bold(AsciidocBuilder.italic("test bold italic")));
        assertEquals("**__test bold italic__**\n", AsciidocBuilder.buildAsciidoc(document));
    }

}
