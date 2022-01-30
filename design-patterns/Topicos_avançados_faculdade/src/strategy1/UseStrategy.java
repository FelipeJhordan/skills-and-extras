package strategy1;

public class UseStrategy {
    public static void main(String[] args) {
        Nuclear coreia = new Nuclear();
        coreia.iniciar();
        coreia.concluir();

        GrandeExercito china = new GrandeExercito();
        china.iniciar();
        china.concluir();

        Fragil brasil = new Fragil();
        brasil.iniciar();
        brasil.concluir();
    }
}
