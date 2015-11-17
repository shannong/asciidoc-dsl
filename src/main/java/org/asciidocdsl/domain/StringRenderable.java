package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/16/15.
 */
public class StringRenderable implements Renderable {

    private final String contents;

    public StringRenderable(String contents) {
        this.contents = contents;
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        stringBuilder.append(contents);
    }
}
