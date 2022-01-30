package Composite;

import java.util.ArrayList;
import java.util.List;

public class Tabela extends ItemComponent{
    private List<Linha> linhas = new ArrayList<Linha>();
    public void adicionar(Linha l)
    {
        linhas.add(l);
    }

    @Override
    public void imprimir() {
        System.out.println("Tabela");
        for(int i = 0; i < linhas.size(); i++) {
            linhas.get(i).imprimir();
        }
    }
}
