package strategy1.estrategias;

public class AtacarSozinho implements IEstrategia{
    @Override
    public void iniciar() {
        System.out.println("Plantar evidências falsas");
        System.out.println("Lançar bombas");
        System.out.println("Derrubar Governo");
    }

    @Override
    public void concluir() {
        System.out.println("Estabelecer governo Amigo");
    }
}
