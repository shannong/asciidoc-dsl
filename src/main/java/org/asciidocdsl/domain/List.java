package org.asciidocdsl.domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Shannon on 11/5/15.
 */
public abstract class List extends AsciidocObject<java.util.List<ListItem>> {

    protected char prefix;

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

            builder.append(item.getContents().toString());
            builder.append("\n");
        }

        builder.append("\n");
        return builder.toString();
    }
}
