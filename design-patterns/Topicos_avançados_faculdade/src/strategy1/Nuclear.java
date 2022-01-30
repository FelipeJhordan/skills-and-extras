package strategy1;

import strategy1.estrategias.Diplomacia;

public class Nuclear extends Inimigo{
    public Nuclear() {
        this.estrategia = new Diplomacia();
    }
}
