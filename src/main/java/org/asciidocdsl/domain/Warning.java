package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Warning implements AsciidocObject {

    private final AsciidocObject contents;

    public Warning(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "WARNING: " + contents.toString();
    }
}
