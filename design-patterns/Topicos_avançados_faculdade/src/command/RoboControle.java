package command;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class RoboControle {
    public ArrayList<RoboCommand> comandos;
    private Stack<RoboCommand> desfalherPilha;

    public RoboControle() {
        this.desfalherPilha = new Stack<RoboCommand>();
        this.comandos = new ArrayList<RoboCommand>();
    }

    public void executarComandos() {
        System.out.println("Executando comandos");
        while(comandos.stream().count() > 0) {
            RoboCommand comando = comandos.remove(0);
            comando.executar();
            desfalherPilha.push(comando);
        }
    }

    public void desfazerComandos(int numComandosDesfazer) {
        System.out.println("Desfazendo " + numComandosDesfazer + " Comandos");

        while(numComandosDesfazer > 0 && desfalherPilha.size() > 0) {
            RoboCommand comand = desfalherPilha.pop();
            comand.desfazer();
            numComandosDesfazer --;
        }
    }
}
