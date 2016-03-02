package org.asciidocdsl;

import org.asciidocdsl.domain.Document;
import org.asciidocdsl.domain.ListType;
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

    @Test
    public void testList() {
        ListBuilder listBuilder = ListBuilder.buildListBuilder(ListType.UNORDERED)
                .addItem("Item 1")
                .addItem("Item 2")
                .addItem("Item 3");
        document.add(listBuilder.buildList());
        assertEquals("* Item 1\n* Item 2\n* Item 3\n\n", AsciidocBuilder.buildAsciidoc(document));
    }

    @Test
    public void testSubList() {
        ListBuilder listBuilder = ListBuilder.buildListBuilder(ListType.UNORDERED)
                .addItem("Item 1")
                .addItem("Item 2")
                .addSubList(ListBuilder.buildSubListBuilder(ListType.UNORDERED, 2)
                    .addItem("Sub Item 1")
                    .addItem("Sub Item 2"));
                listBuilder = listBuilder.addItem("Item 3");
        document.add(listBuilder.buildList());
        assertEquals("* Item 1\n* Item 2\n** Sub Item 1\n** Sub Item 2\n* Item 3\n\n", AsciidocBuilder.buildAsciidoc(document));
    }

}
