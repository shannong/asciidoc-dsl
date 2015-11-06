package org.asciidocdsl.domain;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shannon on 11/3/15.
 */
public class Document {

    private List<AsciidocObject> contents = new ArrayList<AsciidocObject>();
    private String header;
    private String author;
    private String revision;

    public void add(AsciidocObject asciidocObject) {
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
    public String toString() {
        StringBuilder builder = new StringBuilder();
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

        for (AsciidocObject object : contents) {
            builder.append(object.toString());
            hasHeader = true;
        }

        return builder.toString();
    }
}
