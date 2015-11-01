package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Italic extends AsciidocObject {

    public Italic(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "__" + contents + "__";
    }
}
