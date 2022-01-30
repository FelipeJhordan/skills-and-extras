package SimpleFactory;

public class Sanduiche {
    String pao;
    String queijo;
    String presunto;
    String salada;

    public void fazerSanduiche() {
        System.out.println("Fazendo sanduiche");
    }

    public Sanduiche() {}

    public Sanduiche(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }
}
