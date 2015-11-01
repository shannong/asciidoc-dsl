package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Important {

    private final Paragraph contents;

    public Important(Object contents) {
        this.contents = new Paragraph(contents);
    }

    public Paragraph getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "IMPORTANT: " + contents.toString();
    }
}
