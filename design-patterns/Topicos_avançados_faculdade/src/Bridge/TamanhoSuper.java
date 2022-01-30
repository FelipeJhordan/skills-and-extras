package Bridge;

public class TamanhoSuper extends AbstracaoTamanho{
    public TamanhoSuper(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Toma um gole de "+ refrigerante);
            System.out.println("Acabou o(a) "+refrigerante);
            System.out.println("");
    }
}
