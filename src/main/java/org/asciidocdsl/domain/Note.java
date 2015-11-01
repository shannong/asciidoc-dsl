package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Note {

    private final Paragraph contents;

    public Note(Object contents) {
        this.contents = new Paragraph(contents);
    }

    public Paragraph getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "NOTE: " + contents.toString();
    }
}
