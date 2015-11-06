package org.asciidocdsl.domain;

/**
 * Created by Shannon on 11/1/15.
 */
public class SectionTitle extends AsciidocObject {

    private final int level;

    public SectionTitle(int level, Object contents) {
        super(contents);

        if (level < 0 || level > 5) {
            throw new IllegalArgumentException("Invalid Section Level.  Must be between 0 and 5");
        } else {
            this.level = level;
        }
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i <= level; i++) {
            output = output.concat("=");
        }

        return output + " " + contents.toString();
    }
}
