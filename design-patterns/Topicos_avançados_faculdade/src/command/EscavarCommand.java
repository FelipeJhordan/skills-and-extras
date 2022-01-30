package command;

public class EscavarCommand extends RoboCommand{
    public boolean colherMaterial;

    public EscavarCommand(Robo robo) {
        super(robo);
    }

    @Override
    public void executar() {
        this.robo.escavar(colherMaterial);
    }

    @Override
    public void desfazer() {
        this.robo.escavar(!colherMaterial);
    }

    public boolean getColherMaterial() {
        return this.colherMaterial;
    }

    public void setColherMaterial(boolean decisao) {
        this.colherMaterial = decisao;
    }
}
