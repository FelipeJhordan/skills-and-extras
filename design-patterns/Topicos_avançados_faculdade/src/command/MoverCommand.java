package command;

public class MoverCommand extends RoboCommand {
    private int paraFrente;

    public MoverCommand(Robo robo) {
        super(robo);
    }

    @Override
    public void executar() {
        this.robo.mover(paraFrente);
    }

    @Override
    public void desfazer() {
        this.robo.mover(-paraFrente);
    }

    public void setParaFrente(int valor) {
            this.paraFrente = valor;
    }

    public int getParaFrente() {
        return this.paraFrente;
    }

}
