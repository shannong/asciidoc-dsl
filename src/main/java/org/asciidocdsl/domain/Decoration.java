package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/16/15.
 */
public class Decoration implements Renderable {

    private final String head;
    private final Renderable contents;
    private final String tail;

    public Decoration(String head, Renderable contents, String tail) {
        this.head = head;
        this.contents = contents;
        this.tail = tail;
    }

    public Decoration(String head, Renderable contents) {
        this.head = head;
        this.contents = contents;
        this.tail = "";
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        stringBuilder.append(head);
        contents.render(stringBuilder);
        stringBuilder.append(tail);
    }
}
