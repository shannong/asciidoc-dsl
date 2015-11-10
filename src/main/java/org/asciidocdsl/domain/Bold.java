package org.asciidocdsl.domain;

import org.asciidocdsl.AsciidocBuilder;

/**
 * Created by Shannon on 11/1/15.
 */
public class Bold implements AsciidocObject {

    private AsciidocObject contents;

    public Bold(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "**" + contents.toString() + "**";
    }

}
