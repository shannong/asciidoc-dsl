package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Note extends AsciidocObject {

    public Note(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "NOTE: " + contents.toString();
    }
}
