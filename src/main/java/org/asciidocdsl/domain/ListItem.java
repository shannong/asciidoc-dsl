package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/5/15.
 */
public class ListItem {

    private int nestingLevel;
    private AsciidocObject contents;

    public ListItem(int nestingLevel, AsciidocObject contents) {
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
