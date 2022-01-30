package Builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opBanco = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escolha o banco\n 1 - Itau \n 2 - BB \n 3 - Santander\n\n 4- Sair");
            opBanco = Integer.parseInt(sc.nextLine());
            if(opBanco >= 1 && opBanco < 4) {
                System.out.println("Digite o cedente:");
                String cedente =  sc.nextLine();
                System.out.println("Digigite o sacado:");
                String sacado = sc.nextLine();
                System.out.println("Digite o Valor:");
                Double valor = Double.parseDouble(sc.nextLine());
                System.out.println("Digite a data de vencimento:");
                String dataVencimento = sc.nextLine();
                BoletoBuilder boletoBuilder = getBuilderCod(opBanco);
                boletoBuilder.CreateNewBoletoProduct();
                boletoBuilder.buildData(dataVencimento);
                boletoBuilder.buildCodigoBarras();
                boletoBuilder.buildSacado(sacado);
                boletoBuilder.buildCedente(cedente);
                boletoBuilder.buildValor(valor);
                System.out.print("----boleto gerado----\n"+boletoBuilder.toString());;
            } else if( opBanco == 4) {
                break;
            } else {
                System.err.println("Opção Inválida");
            }
        } while( false);    
    }

    public static BoletoBuilder getBuilderCod(int typeBuilder) {
        switch (typeBuilder) {
            case 1:
                return new ItauBoletoBuilder();
            case 2:
                return new BBBoletoBuilder();
            case 3: 
                return new SantanderBoletoBuilder();
            default: 
                return null;
        }
    }

}
