package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/22/15.
 */
public interface Listable<T> extends Renderable {

    T getItem();

}
