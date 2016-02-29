package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/5/15.
 */
public class ListItem implements Listable<Renderable> {

    private final Renderable contents;

    public ListItem(Renderable contents) {
        this.contents = contents;
    }

    public Renderable getItem() {
        return contents;
    }

    public void render(StringBuilder stringBuilder) {
        stringBuilder.append(" ");
        contents.render(stringBuilder);
        stringBuilder.append("\n");
    }
}
