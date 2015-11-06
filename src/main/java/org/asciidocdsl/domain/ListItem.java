package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/5/15.
 */
public class ListItem extends AsciidocObject {

    private int nestingLevel;

    public ListItem(int nestingLevel, Object contents) {
        this.nestingLevel = nestingLevel;
        this.contents = contents;
    }

    public int getNestingLevel() {
        return nestingLevel;
    }

    public void setNestingLevel(int nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    @Override
    public String toString() {
        return " " + contents.toString();
    }
}
