package command;

public class UseCommand {
    public static void main() {
        Robo robo = new Robo();
        RoboControle controle = new RoboControle();

        MoverCommand mover = new MoverCommand(robo);
        mover.setParaFrente(1000);
        controle.comandos.add(mover);

        RotacionarCommand rotacionar = new RotacionarCommand(robo);
        rotacionar.setRotacionarParaEsquerda(45);
        controle.comandos.add(rotacionar);

        EscavarCommand escavar = new EscavarCommand(robo);
        escavar.colherMaterial = true;
        controle.comandos.add(escavar);

        controle.executarComandos();
        controle.desfazerComandos(3);


    }
}
