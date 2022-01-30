package strategy1.estrategias;

public class AliancaComVizinho implements IEstrategia{

    @Override
    public void iniciar() {
        System.out.println("Atacar pelo Norte");
        System.out.println("Vizinho atacar pelo norte");
    }

    @Override
    public void concluir() {
        System.out.println("Dividir Benefícios");
        System.out.println("Dividir custo de reconstrução");
    }
}
