package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Literal {

    private final Paragraph contents;

    public Literal(Object contents) {
        this.contents = new Paragraph(contents);
    }

    public Object getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return " " + contents.toString();
    }
}
