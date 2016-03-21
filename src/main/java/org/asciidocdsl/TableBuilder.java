package org.asciidocdsl;

import org.asciidocdsl.domain.*;

/**
 * Created by Shannon on 2/29/16.
 */
public class TableBuilder {

    private final Table table = new Table();
    private int currentRow = 0;
    private int currentColumn = 0;
    private final int numColumns;

    private TableBuilder(String title, int numColumns) {
        table.setTitle(title);
        this.numColumns = numColumns;
    }

    public static TableBuilder buildTableBuilder(String title, int numColumns) {
        return new TableBuilder(title, numColumns);
    }

    public TableBuilder nextRow() {
        if (table.getRowCount() - 1 == currentRow) {
            table.addRow();
            currentRow++;
            currentColumn = 0;
        } else {
            currentRow++;
        }

        return this;
    }

    public TableBuilder addCell(Renderable renderable) {
        if (currentColumn < numColumns - 1) {
            table.addCell(currentRow, new Cell(renderable));
            return this;
        } else {
            throw new IndexOutOfBoundsException("Too many columns in row");
        }
    }

    public TableBuilder addCell(String contents) {
        return addCell(new StringRenderable(contents));
    }

    public TableBuilder addCell(Renderable renderable, int width, int height) {
        if (table.getRowCount() < currentRow + height) {
            while (table.getRowCount() < currentRow + height) {
                table.addRow();
            }
        }

        if (currentColumn + width - 1 > numColumns) {
            throw new IndexOutOfBoundsException("Width of cell exceeds number of columns");
        }

        for (int i = currentRow; i < currentRow + height; i++) {
            for (int j = currentColumn; j < currentColumn + width; j++) {
                table.addCell(i, j, new MergeCell());
            }
        }

        table.addCell(currentRow, currentColumn, new Cell(renderable));

        return this;
    }

    public TableBuilder addCell(String contents, int width, int height) {
        return addCell(new StringRenderable(contents), width, height);
    }

    public Table buildTable() {
        return table;
    }
}
