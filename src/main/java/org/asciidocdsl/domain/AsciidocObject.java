package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public abstract class AsciidocObject<T> {

    protected T contents;

    public final T getContents() {
        return contents;
    }
}
