package strategy1;

import strategy1.estrategias.AtacarSozinho;

public class Fragil extends Inimigo{
    public Fragil() {
        this.estrategia = new AtacarSozinho();
    }
}
