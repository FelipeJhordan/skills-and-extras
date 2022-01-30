package Memento;

import java.util.ArrayList;

public class DietistaCareTaker {
    protected ArrayList<DietaMemento> estados;

    public DietistaCareTaker() {
        estados = new ArrayList<DietaMemento>();
    }

    public void adicionarMemento(DietaMemento memento ) {
        estados.add(memento);
    }

    public DietaMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new DietaMemento(new DietistaModel("", 0, 0));
        }
        DietaMemento estadoSalvo = estados.get(estados.size() -1);
        estados.remove(estados.size() -1);
        return estadoSalvo;
    }
}
