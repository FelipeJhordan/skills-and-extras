package Iterator.ex2;

import Iterator.ex1.Book;
import Iterator.ex1.BookIterator;
import Iterator.ex1.IIteratorInterface;

import java.util.ArrayList;

public class FiboColletion implements IContainer {
    protected ArrayList<Long> numeros;
    public FiboColletion() {
        numeros = new ArrayList<Long>();
        numeros.add(1l);
        numeros.add(1l);
        numeros.add(2l);
        numeros.add(3l);
        numeros.add(5l);
        numeros.add(8l);
        numeros.add(13l);
        numeros.add(55l);
        numeros.add(89l);
    }
    @Override
    public IIterator criarIterator() {
        return new FiboIterator(numeros);
    }
}
