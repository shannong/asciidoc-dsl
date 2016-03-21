package org.asciidocdsl.domain;

import java.util.ArrayList;

/**
 * Created by Shannon on 3/7/16.
 */
public class Row implements Renderable {

    private final boolean isHeader;
    private final java.util.List<Cell> cells = new ArrayList<>();

    public Row(boolean isHeader) {
        this.isHeader = isHeader;
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    void addCell(Cell cell, int column) {
        cells.add(column, cell);
    }

    public void addCell(String contents) {
        cells.add(new Cell(new StringRenderable(contents)));
    }

    public boolean isEmptyCell(int column) {
        return cells.get(column) == null;
    }

    public boolean isEmpty() {
        return cells.isEmpty();
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        for (Cell cell : cells) {
            cell.render(stringBuilder);
        }

        if (!isHeader) {
            stringBuilder.append("\n");
        }
    }
}
