package strategy1;

import strategy1.estrategias.AliancaComVizinho;

public class GrandeExercito extends Inimigo{
    public GrandeExercito() {
        this.estrategia = new AliancaComVizinho();
    }
}
