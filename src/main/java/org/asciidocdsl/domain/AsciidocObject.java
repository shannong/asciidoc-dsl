package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public abstract class AsciidocObject {

    protected final Object contents;

    public AsciidocObject(Object contents) {
        this.contents = contents;
    }

    public final Object getContents() {
        return contents;
    }
}
