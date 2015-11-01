package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Paragraph extends AsciidocObject {

    public Paragraph(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return contents.toString() + "\n\n";
    }
}
