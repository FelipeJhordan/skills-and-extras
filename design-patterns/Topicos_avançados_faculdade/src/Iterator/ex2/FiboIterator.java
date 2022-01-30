package Iterator.ex2;

import Iterator.ex1.Book;

import java.util.ArrayList;

public class FiboIterator implements IIterator {
    protected ArrayList<Long> lista;
    protected int contador;

    protected FiboIterator(ArrayList<Long> lista) {
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
    public long currentItem() {
        if( isDone()) {
            contador = lista.size() -1;
        } else if( contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }
}
