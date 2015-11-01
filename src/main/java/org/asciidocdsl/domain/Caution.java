package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Caution extends AsciidocObject{

    public Caution(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "CAUTION: " + contents.toString();
    }
}
