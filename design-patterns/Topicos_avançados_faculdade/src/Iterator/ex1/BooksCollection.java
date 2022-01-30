package Iterator.ex1;

import java.util.ArrayList;

public class BooksCollection implements IContainer{
    protected ArrayList<Book> livros;
    public BooksCollection() {
        livros = new ArrayList<Book>();
        livros.add(new Book("Amigo do infinito"));
        livros.add(new Book("Amigo do peito"));
        livros.add(new Book("2021, o ano do galo"));
    }
    @Override
    public IIteratorInterface criarIterator() {
        return new BookIterator(livros);
    }
}
