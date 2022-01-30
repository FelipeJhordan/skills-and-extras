package strategy2;


public class InsertionSort implements  IEstrategiaOrdenacao{
    @Override
    public void ordenar(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();

        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
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
