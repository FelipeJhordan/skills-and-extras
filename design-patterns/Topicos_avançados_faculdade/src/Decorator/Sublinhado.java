package Decorator;

public class Sublinhado extends TypeTagDecorator{
    public Sublinhado(HtmlElement text) {
        this.htmlElement = text;
    }

    @Override
    public String render() {
        return "<u>"+htmlElement.render()+"</u>";
    }
}
