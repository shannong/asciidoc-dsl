package org.asciidocdsl.domain;

import java.util.ArrayList;

/**
 * Created by Shannon on 3/7/16.
 */
public class Row implements Renderable {

    private java.util.List<Cell> cells = new ArrayList<Cell>();

    public Row(){}

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public void addCell(String contents) {
        cells.add(new Cell(new StringRenderable(contents)));
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        for (Cell cell : cells) {
            cell.render(stringBuilder);
        }

        stringBuilder.append("\n");
    }
}
