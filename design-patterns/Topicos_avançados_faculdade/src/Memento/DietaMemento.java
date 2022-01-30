package Memento;

public class DietaMemento {
    protected DietistaModel estadoDietista;

    public DietaMemento(DietistaModel dietistaModel) {
        estadoDietista = dietistaModel;
    }

    public DietistaModel getDietistaModel() {
        return this.estadoDietista;
    }
}
