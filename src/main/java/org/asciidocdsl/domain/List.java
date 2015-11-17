package org.asciidocdsl.domain;

import java.util.ArrayList;

/**
 * Created by Shannon on 11/5/15.
 */
public abstract class List {

    protected char prefix;
    private java.util.List<ListItem> contents = new ArrayList<ListItem>();

    public List(char prefix) {
        contents = new ArrayList<ListItem>();
    }

    public void addItem(ListItem item) {
        contents.add(item);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ListItem item : contents) {
            for (int i = 0; i < item.getNestingLevel(); i++) {
                builder.append(prefix);
            }

            builder.append(item.toString());
            builder.append("\n");
        }

        builder.append("\n");
        return builder.toString();
    }
}
