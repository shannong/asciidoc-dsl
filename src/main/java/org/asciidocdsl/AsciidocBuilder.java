package org.asciidocdsl;

import org.asciidocdsl.domain.Document;

/**
 * Created by Shannon on 11/1/15.
 */
public class AsciidocBuilder {

    private static AsciidocBuilder instance;

    private AsciidocBuilder() {

    }

    public static AsciidocBuilder getInstance() {
        return instance;
    }

    public String buildAsciidoc(Document document) {
        return document.toString();
    }


}
