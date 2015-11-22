package org.asciidocdsl.domain;

import java.util.ArrayList;

/**
 * Created by Shannon on 11/22/15.
 */
public class List implements Listable<java.util.List<Renderable>>, Renderable {

    private final String prefix;
    private final java.util.List<Renderable> list = new ArrayList<Renderable>();

    public List(String prefix) {
        this.prefix = prefix;
    }

    public java.util.List<Renderable> getItem() {
        return list;
    }

    public void add(Listable item) {
        list.add(item);
    }

    public void render(StringBuilder stringBuilder) {
        for (Renderable item : list) {
            stringBuilder.append(prefix);
            item.render(stringBuilder);
        }
    }
}
