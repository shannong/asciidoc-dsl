package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Caution {

    private final Paragraph contents;

    public Caution(Object contents) {
        this.contents = new Paragraph(contents);
    }

    public Paragraph getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "CAUTION: " + contents.toString();
    }
}
