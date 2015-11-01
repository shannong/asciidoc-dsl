package org.asciidocdsl.domain;

import org.asciidocdsl.AsciidocBuilder;

/**
 * Created by Shannon on 11/1/15.
 */
public class Bold extends AsciidocObject {

    public Bold(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "**" + contents.toString() + "**";
    }
}
