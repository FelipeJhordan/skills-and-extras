package Decorator;

public abstract class HtmlElement {
    public String content;
    public String render() {
        return content;
    }
}
