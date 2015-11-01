package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Warning extends AsciidocObject {

    public Warning(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "WARNING: " + contents.toString();
    }
}
