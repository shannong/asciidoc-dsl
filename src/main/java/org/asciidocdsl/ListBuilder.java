package org.asciidocdsl;

import org.asciidocdsl.domain.Renderable;
import org.asciidocdsl.domain.StringRenderable;

import java.util.List;

/**
 * Created by Shannon on 11/18/15.
 */
public class ListBuilder {

    private final ListType type;
    private List<Renderable> items;

    public ListBuilder(ListType type) {
        this.type = type;
    }

    public ListBuilder addItem(String item) {
        items.add(new StringRenderable(item));
        return this;
    }

    public ListBuilder addItem(Renderable item) {
        items.add(item);
        return this;
    }
    
}
