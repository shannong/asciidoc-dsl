package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/9/15.
 */
public class Text implements AsciidocObject {

    private final Object contents;


    public Text(Object contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return contents.toString();
    }
}
