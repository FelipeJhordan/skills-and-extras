package strategy2;

import java.util.Vector;

public class QuickSort implements IEstrategiaOrdenacao{
    @Override
    public void ordenar(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        quickRecursiveHelper(vetor, 0 ,vetor.length-1);
        long tempoFinal = System.currentTimeMillis();
        mostrar(vetor);
        System.out.println("Tempo necessário " +( tempoFinal - tempoInicial));
    }

    private void quickRecursiveHelper(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = this.divide(vetor, inicio, fim);
            this.quickRecursiveHelper(vetor, inicio, posicaoPivo - 1);
            quickRecursiveHelper(vetor, posicaoPivo + 1, fim);
        }
    }

    private int divide(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
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
