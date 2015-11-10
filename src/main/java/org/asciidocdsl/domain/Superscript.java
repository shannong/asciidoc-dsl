package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Superscript implements AsciidocObject {

    private final AsciidocObject contents;

    public Superscript(AsciidocObject contents) {
        this.contents = contents;
    }


    @Override
    public String toString() {
        return "^" + contents.toString() + "^";
    }
}
