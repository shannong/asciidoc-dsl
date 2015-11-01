package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Tip extends AsciidocObject {

    public Tip(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "TIP: " + contents.toString();
    }
}
