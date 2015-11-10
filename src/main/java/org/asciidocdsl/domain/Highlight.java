package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Highlight implements AsciidocObject {

    private AsciidocObject contents;

    public Highlight(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "#" + contents.toString() + "#";
    }
}
