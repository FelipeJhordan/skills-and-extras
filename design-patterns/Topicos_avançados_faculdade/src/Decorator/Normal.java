package Decorator;

public class Normal extends TypeTagDecorator{

    public Normal(HtmlElement text) {
        this.htmlElement = text;
    }
    @Override
    public String render() {
        return "<span>"+htmlElement.render()+"</span>";
    }
}
