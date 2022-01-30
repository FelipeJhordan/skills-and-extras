package Memento;

public class Dieta {
    protected DietistaModel dietista;
    protected DietistaCareTaker caretaker;

    public Dieta() {
       this.caretaker = new DietistaCareTaker();
    }

    public void adicionar(DietistaModel dietista) {
        caretaker.adicionarMemento(new DietaMemento(dietista));
        this.dietista = dietista;
    }

    public void desfazer() {
        dietista = caretaker.getUltimoEstadoSalvo().getDietistaModel();
    }

    public void mostrarAtual() {
        System.out.println(dietista);
    }
}
