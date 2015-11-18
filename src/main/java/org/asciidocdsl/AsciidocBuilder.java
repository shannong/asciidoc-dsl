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

    public static Renderable lead(String text) {
        return lead(new StringRenderable(text));
    }

    public static Renderable lead(Renderable renderable) {
        return new Decoration("[.lead]\n", renderable);
    }

    public static Renderable italic(String text) {
        return italic(new StringRenderable(text));
    }

    public static Renderable italic(Renderable renderable) {
        return new Decoration("__", renderable, "__");
    }

    public static Renderable bold(String text) {
        return bold(new StringRenderable(text));
    }

    public static Renderable bold(Renderable renderable) {
        return new Decoration("**", renderable, "**");
    }


    public static Renderable monospace(String text) {
        return monospace(new StringRenderable(text));
    }

    public static Renderable monospace(Renderable renderable) {
        return new Decoration("``", renderable, "``");
    }

    public static Renderable highlight(String text) {
        return highlight(new StringRenderable(text));
    }

    public static Renderable highlight(Renderable renderable) {
        return new Decoration("#", renderable, "#");
    }

    public static Renderable small(String text) {
        return small(new StringRenderable(text));
    }

    public static Renderable small(Renderable renderable) {
        return new Decoration("[small]#", renderable, "#");
    }

    public static Renderable big(String text) {
        return big(new StringRenderable(text));
    }

    public static Renderable big(Renderable renderable) {
        return new Decoration("[big]##", renderable, "##");
    }

}
