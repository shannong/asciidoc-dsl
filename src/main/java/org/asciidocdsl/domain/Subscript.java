package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Subscript implements AsciidocObject {

    private final AsciidocObject contents;

    public Subscript(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "~" + contents.toString() + "~";
    }
}
