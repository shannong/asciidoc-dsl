package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Paragraph {

    private final Object contents;

    public Paragraph(Object contents) {
        this.contents = contents;
    }

    public Object getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return contents.toString() + "\n\n";
    }
}
