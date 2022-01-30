package Iterator;

import Iterator.ex1.BooksCollection;
import Iterator.ex1.IIteratorInterface;
import Iterator.ex2.FiboColletion;
import Iterator.ex2.IIterator;

public class UseIterator {
    public static void main() {
        BooksCollection booksCollection = new BooksCollection();
        for (IIteratorInterface it = booksCollection.criarIterator(); !it.isDone(); it.next()) {
            System.out.println(it.currentItem().nome);
        }

        FiboColletion fiboCollection = new FiboColletion();
        for (IIterator it = fiboCollection.criarIterator(); !it.isDone(); it.next()) {
            System.out.println(it.currentItem());
        }
    }
}
