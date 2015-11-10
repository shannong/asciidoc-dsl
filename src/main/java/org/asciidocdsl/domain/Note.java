package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Note implements AsciidocObject {

    private final AsciidocObject contents;

    public Note(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "NOTE: " + contents.toString();
    }
}
