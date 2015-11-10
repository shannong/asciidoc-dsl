package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Italic implements AsciidocObject {

    private final AsciidocObject contents;

    public Italic(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "__" + contents + "__";
    }
}
