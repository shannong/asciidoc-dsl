package org.asciidocdsl;

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

    public String buildAsciidoc(Object asciidocObject) {
        return asciidocObject.toString();
    }


}
