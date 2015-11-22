package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/18/15.
 */
public enum ListType {

    UNORDERED("*"),
    ORDERED(".");


    private final String leadCharacter;

    private ListType(String leadCharacter) {
        this.leadCharacter = leadCharacter;
    }

    public String getLeadCharacter() {
        return leadCharacter;
    }
}
