package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class SmallPrint implements AsciidocObject {

    private final AsciidocObject contents;

    public SmallPrint(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "[small]#" + contents.toString() + "#";
    }
}
