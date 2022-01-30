package Decorator;

public class Italico extends TypeTagDecorator{

    public Italico(HtmlElement text) {
        this.htmlElement = text;
    }
    @Override
    public String render() {
        return "<i>"+htmlElement.render()+"</i>";
    }
}
