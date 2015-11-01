package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Monospace extends AsciidocObject {

    public Monospace(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "``" + contents.toString() + "``";
    }
}
