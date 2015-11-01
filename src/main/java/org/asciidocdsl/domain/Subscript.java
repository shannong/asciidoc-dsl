package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Subscript extends AsciidocObject {

    public Subscript(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "~" + contents.toString() + "~";
    }
}
