package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class SmallPrint extends AsciidocObject {

    public SmallPrint(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "[small]#" + contents.toString() + "#";
    }
}
