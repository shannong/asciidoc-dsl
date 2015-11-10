package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class Big implements AsciidocObject {

    private AsciidocObject contents;

    public Big(AsciidocObject contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "[big]##" + contents.toString() + "##";
    }


}
