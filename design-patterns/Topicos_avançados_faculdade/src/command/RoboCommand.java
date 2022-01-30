package command;


public abstract class RoboCommand {
    protected Robo robo;

    public RoboCommand(Robo robo) {
        this.robo = robo;
    }

    public abstract void executar();
    public abstract void desfazer();
}
