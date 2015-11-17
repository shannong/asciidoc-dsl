package org.asciidocdsl.domain;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shannon on 11/3/15.
 */
public class Document implements Renderable {

    private List<Renderable> contents = new ArrayList<Renderable>();
    private String header;
    private String author;
    private String revision;

    public void add(Renderable asciidocObject) {
        contents.add(asciidocObject);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    @Override
    public void render(StringBuilder builder) {
        boolean hasHeader = false;
        if (StringUtils.isNotBlank(header)) {
            builder.append("= " + header + "\n");
            hasHeader = true;
        }

        if (StringUtils.isNotBlank(author)) {
            builder.append(author + "\n");
            hasHeader = true;
        }

        if (StringUtils.isNotBlank(revision)) {
            builder.append(revision + "\n");
            hasHeader = true;
        }

        if (hasHeader) {
            builder.append("\n");
        }

        for (Renderable object : contents) {
            object.render(builder);
            builder.append("\n");
        }
    }
}
