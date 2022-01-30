package command;

public class RotacionarCommand extends RoboCommand {
    private double rotacionarParaEsquerda;
    public RotacionarCommand(Robo robo) {
        super(robo);
    }

    @Override
    public void executar() {
        this.robo.rotacionarParaEsquerda(this.rotacionarParaEsquerda);
    }

    @Override
    public void desfazer() {
        this.robo.rotacionarParaEsquerda(-this.rotacionarParaEsquerda);
    }

    public void setRotacionarParaEsquerda(double rotacionarParaEsquerda) {
        this.rotacionarParaEsquerda = rotacionarParaEsquerda;
    }

    public double getRotacionarParaEsquerda() {
        return this.rotacionarParaEsquerda;
    }
}
