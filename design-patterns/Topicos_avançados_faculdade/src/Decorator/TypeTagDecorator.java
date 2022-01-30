package Decorator;

public abstract class TypeTagDecorator extends HtmlElement {
    HtmlElement htmlElement;
    @Override
    public abstract String render();
}
