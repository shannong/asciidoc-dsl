package org.asciidocdsl.domain;

/**
 * Created by Shannon on 3/9/16.
 */
public final class MergeCell extends Cell {

    public MergeCell() {
        super(new StringRenderable(""));
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        // no op
    }
}
