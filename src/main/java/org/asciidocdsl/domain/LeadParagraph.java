package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class LeadParagraph extends Paragraph {

    public LeadParagraph(Object contents) {
        super(contents);
    }

    @Override
    public String toString() {
        return "[.lead]\n" + super.toString();
    }
}
