package org.asciidocdsl;

import org.asciidocdsl.domain.Decoration;
import org.asciidocdsl.domain.Document;
import org.asciidocdsl.domain.Renderable;
import org.asciidocdsl.domain.StringRenderable;

/**
 * Created by Shannon on 11/1/15.
 */
public class AsciidocBuilder {

    private AsciidocBuilder() {
        throw new IllegalAccessError("Cannot instantiate AsciidocBuilder");
    }

    public static String buildAsciidoc(Document document) {
        StringBuilder stringBuilder = new StringBuilder();
        document.render(stringBuilder);
        return stringBuilder.toString();
    }

    public static Renderable paragraph(String text) {
        return paragraph(new StringRenderable(text));
    }

    public static Renderable paragraph(Renderable renderable) {
        return new Decoration("", renderable, "\n");
    }

    public static Renderable literal(String text) {
        return literal(new StringRenderable(text));
    }

    public static Renderable literal(Renderable renderable) {
        return new Decoration(" ", renderable);
    }

    public static Renderable note(String text) {
        return note(new StringRenderable(text));
    }

    public static Renderable note(Renderable renderable) {
        return new Decoration("NOTE: ", renderable);
    }

    public static Renderable tip(String text) {
        return tip(new StringRenderable(text));
    }

    public static Renderable tip(Renderable renderable) {
        return new Decoration("TIP: ", renderable);
    }

    public static Renderable important(String text) {
        return important(new StringRenderable(text));
    }

    public static Renderable important(Renderable renderable) {
        return new Decoration("IMPORTANT: ", renderable);
    }

    public static Renderable warning(String text) {
        return warning(new StringRenderable(text));
    }

    public static Renderable warning(Renderable renderable) {
        return new Decoration("WARNING: ", renderable);
    }

    public static Renderable caution(String text) {
        return caution(new StringRenderable(text));
    }

    public static Renderable caution(Renderable renderable) {
        return new Decoration("CAUTION: ", renderable);
    }

    public static Renderable bold(String text) {
        return bold(new StringRenderable(text));
    }

    private static Renderable bold(Renderable renderable) {
        return new Decoration("**", renderable, "**");
    }
}
