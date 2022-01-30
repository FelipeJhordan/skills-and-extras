package strategy2;

import java.util.Scanner;

public class UseEstrategy {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sizeVetor = pegarTamanhoVetor();
        int vetor[] = new int[sizeVetor];
        int opcMetodo;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)Math.round(Math.random() * 10);
        }
        do {
            opcMetodo = pegarOpcao();
            int copiaVetor[] = vetor.clone();
            switch(opcMetodo) {
                case 0: break;
                case 1: new BubbleSort().ordenar(copiaVetor);
                    break;
                case 2: new InsertionSort().ordenar(copiaVetor);
                    break;
                case 3: new ShellSort().ordenar(copiaVetor);
                    break;
                case 4: new QuickSort().ordenar(copiaVetor);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(opcMetodo != 0);
    }

    static protected int  pegarTamanhoVetor() {
        int valor;
        while(true) {
            System.out.println("Bem vindo, digite a quantidade de valores que o array vai conter");
            try {
                valor = Integer.parseInt(sc.nextLine());
                break;
            } catch(Error e) {
                System.out.println("Valor inválido");
            }
        }
        return valor;
    }

    static protected int pegarOpcao() {
        while(true) {
            try {
                System.out.println("Digite 1 - Bubble");
                System.out.println("Digite 2 - Insertion");
                System.out.println("Digite 3 - Shell");
                System.out.println("Digite 4 - Quick");
                System.out.println("Digite 0 - Sair");
                return Integer.parseInt(sc.nextLine());
            } catch(Exception e) {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}
