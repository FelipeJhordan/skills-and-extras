package Memento;

public class UseMemento {
    public static void main() {
        Dieta dieta = new Dieta();

        dieta.adicionar(new DietistaModel("Raquel", 2, 50));
        dieta.adicionar(new DietistaModel("Maria", 7, 90));
        dieta.adicionar(new DietistaModel("Larissa", 4,  600));

        dieta.desfazer();
        dieta.mostrarAtual();
        dieta.desfazer();
        dieta.mostrarAtual();
    }
}
