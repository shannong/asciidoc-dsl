package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Big extends AsciidocObject {

    public Big(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "[big]##" + contents.toString() + "##";
    }
}
