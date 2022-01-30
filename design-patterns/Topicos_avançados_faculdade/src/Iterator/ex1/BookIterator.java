package Iterator.ex1;

import java.util.ArrayList;

public class BookIterator implements IIteratorInterface{
    protected ArrayList<Book> lista;
    protected int contador;

    protected BookIterator(ArrayList<Book> lista) {
        this.lista = lista;
        contador = 0;
    }

    @Override
    public void first() {
        contador = 0;
    }

    @Override
    public void next() {
        contador++;
    }

    @Override
    public boolean isDone() {
        return contador == lista.size();
    }

    @Override
    public Book currentItem() {
        if( isDone()) {
            contador = lista.size() -1;
        } else if( contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }
}
