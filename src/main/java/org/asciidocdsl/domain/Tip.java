package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Tip implements AsciidocObject {

    private final AsciidocObject contents;

    public Tip(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "TIP: " + contents.toString();
    }
}
