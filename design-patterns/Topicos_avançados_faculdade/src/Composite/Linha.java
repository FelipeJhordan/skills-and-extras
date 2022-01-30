package Composite;

import java.util.ArrayList;
import java.util.List;

public class Linha extends ItemComponent{
    private List<Celula> celulas = new ArrayList<Celula>();

    public void adicionar(Celula c)
    {
        celulas.add(c);
    }

    @Override
    public void imprimir() {
        // Imprime a borda lateral.
        // Imprime a linha.


        for (int i = 0; i < celulas.size(); i++)celulas.get(i).imprimir();

    }
}
