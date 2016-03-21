package org.asciidocdsl.domain;

import java.util.*;

/**
 * Created by Shannon on 3/9/16.
 */
public class Table implements Renderable {

    private String title;
    private Row header = new Row(true);
    private final java.util.List<Row> rows = new ArrayList<>();

    public void setTitle(String title) {
        this.title = title;
    }

    public void addHeader(Cell cell) {
        header.addCell(cell);
    }

    public void addRow() {
        rows.add(new Row(false));
    }

    public void addRow(int row) {
        rows.add(row, new Row(false));
    }

    public void addCell(int row, int column, Cell cell) {
        rows.get(row).addCell(cell, column);
    }

    public void addCell(int row, Cell cell) {
        rows.get(row).addCell(cell);
    }

    public int getRowCount() {
        return rows.size();
    }

    public boolean isEmpty(int row, int column) {
        if (rows.get(row) != null) {
            return rows.get(row).isEmptyCell(column);
        } else {
            return true;
        }
    }

    @Override
    public void render(StringBuilder stringBuilder) {
        if (!title.isEmpty()) {
            stringBuilder.append(".");
            stringBuilder.append(title);
            stringBuilder.append("\n");
        }

        if (!header.isEmpty()) {
            header.render(stringBuilder);
        }

        for (Row row : rows) {
            row.render(stringBuilder);
        }

        stringBuilder.append("\n");
    }
}
