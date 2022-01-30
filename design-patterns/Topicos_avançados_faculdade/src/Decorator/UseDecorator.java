package Decorator;

public class UseDecorator {
    public static void main() {
        // Decorator uso exemplo
        HtmlElement textoItalicoSublinhado = new HtmlText("Olá");

        textoItalicoSublinhado = new Italico(textoItalicoSublinhado);
        textoItalicoSublinhado = new Sublinhado(textoItalicoSublinhado);

        System.out.println(textoItalicoSublinhado.render());

        HtmlElement textoNegritoNormal = new HtmlText("Mundo");

        textoNegritoNormal = new Negrito(textoNegritoNormal);
        textoNegritoNormal = new Normal(textoNegritoNormal);

        System.out.println(textoNegritoNormal.render());

        HtmlElement tudoJunto = new HtmlText("Tudo junto e misturado!");

        tudoJunto = new Negrito(tudoJunto);
        tudoJunto = new Italico(tudoJunto);
        tudoJunto = new Normal(tudoJunto);
        tudoJunto = new Sublinhado(tudoJunto);

        System.out.println(tudoJunto.render());

    }
}
