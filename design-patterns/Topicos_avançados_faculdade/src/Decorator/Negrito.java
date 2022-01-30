package Decorator;

public class Negrito extends TypeTagDecorator{

    public Negrito(HtmlElement text) {
        this.htmlElement = text;
    }
    @Override
    public String render() {
        return "<b>"+htmlElement.render()+"</b>";
    }
}
