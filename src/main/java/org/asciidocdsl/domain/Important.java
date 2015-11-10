package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Important implements AsciidocObject {

    private final AsciidocObject contents;

    public Important(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "IMPORTANT: " + contents.toString();
    }
}
