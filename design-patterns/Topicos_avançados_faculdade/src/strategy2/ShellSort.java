package strategy2;

import java.util.Vector;

public class ShellSort implements IEstrategiaOrdenacao{
    @Override
    public void ordenar(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        int n = vetor.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = vetor[i];
                int j = i;
                while (j >= gap && vetor[j - gap] > key) {
                    vetor[j] = vetor[j - gap];
                    j -= gap;
                }
                vetor[j] = key;
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
