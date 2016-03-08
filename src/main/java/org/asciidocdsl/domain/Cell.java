package org.asciidocdsl.domain;

/**
 * Created by Shannon on 2/29/16.
 */
public class Cell implements Renderable {

    private Renderable contents;

    public Cell(Renderable contents) {
        this.contents = contents;
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        stringBuilder.append("| ");
        contents.render(stringBuilder);
        stringBuilder.append("\n");
    }

}
