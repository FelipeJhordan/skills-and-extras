package strategy2;

import java.util.Vector;

public class BubbleSort implements IEstrategiaOrdenacao {
    @Override
    public void ordenar(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        this.mostrar(vetor);
        System.out.println("Tempo necessário " +( tempoFinal - tempoInicial));
    }
    @Override
    public void mostrar(int[] vetor) {
        String valores = "[";
        for (int i = 0; i < vetor.length; i++) {
            valores+=","+vetor[i];
        }
        valores += "]";
        System.out.println(valores);
    }
}
