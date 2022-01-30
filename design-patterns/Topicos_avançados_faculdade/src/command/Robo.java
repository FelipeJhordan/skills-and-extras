package command;

public class Robo {

    public void mover(int paraFrente) {
        if( paraFrente > 0) {
            System.out.println("O robo foi movimento para frente"+paraFrente+"mm.");
        } else {
            System.out.println("O robo foi movimentado para tras"+paraFrente+"mm.");
        }
    }

    public void rotacionarParaEsquerda(double rotacionarParaEsquerda) {
        if(rotacionarParaEsquerda > 0) {
            System.out.println("O Robo foi rotacionado para esquerda "+rotacionarParaEsquerda+" degrees");
        } else {
            System.out.println("O robo foi rotacionado para direita "+(-rotacionarParaEsquerda) + " degrees");
        }
    }

    public void escavar(boolean paraCima) {
        if( paraCima ) {
            System.out.println("O Robo colheu material do solo.");
        } else {
            System.out.println("O robo despejou o material colhido.");
        }
    }
}
