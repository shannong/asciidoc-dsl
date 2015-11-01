package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Important extends AsciidocObject {


    public Important(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "IMPORTANT: " + contents.toString();
    }
}
