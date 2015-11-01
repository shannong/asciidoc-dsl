package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Warning {

    private final Paragraph contents;

    public Warning(Object contents) {
        this.contents = new Paragraph(contents);
    }

    public Paragraph getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "WARNING: " + contents.toString();
    }
}
