package strategy1.estrategias;

public class Diplomacia implements IEstrategia {

    @Override
    public void iniciar() {
        System.out.println("Recuar tropas");
        System.out.println("Propor cooperação econômica");
    }

    @Override
    public void concluir() {
        System.out.println("Desarmar inimigo");
    }
}
