package org.asciidocdsl;

import org.asciidocdsl.domain.*;

/**
 * Created by Shannon on 11/18/15.
 */
public class ListBuilder {

    private final List items;

    private ListBuilder(String prefix) {
        items = new List(prefix);
    }

    public static ListBuilder buildListBuilder(ListType type) {
        return new ListBuilder(type.getLeadCharacter());
    }

    public static ListBuilder buildSubListBuilder(ListType type, int nestingLevel) {
        if (nestingLevel < 1 || nestingLevel > 5) {
            throw new IllegalArgumentException("Nesting level must be between 1 and 5");
        }

        String prefix = "";
        for (int i = nestingLevel; i > 0; i--) {
            prefix = prefix.concat(type.getLeadCharacter());
        }

        return new ListBuilder(prefix);
    }

    public ListBuilder addItem(String item) {
        return addItem(new StringRenderable(item));
    }

    public ListBuilder addItem(Renderable item) {
        items.add(new ListItem(item));
        return this;
    }

    public ListBuilder addSubList(ListBuilder listBuilder) {
        items.add(listBuilder.buildList());
        return this;
    }

    public List buildList() {
        return items;
    }

}
