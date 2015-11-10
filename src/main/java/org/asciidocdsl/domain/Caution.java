package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Caution implements AsciidocObject {

    private AsciidocObject contents;

    public Caution(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "CAUTION: " + contents.toString();
    }
}
