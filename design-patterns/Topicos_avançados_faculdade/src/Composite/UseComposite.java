package Composite;

public class UseComposite {
    public static void main() {
        Linha linha1 = new Linha();
        Linha linha2 = new Linha();

        linha1.adicionar(new Celula("l1 c1"));
        linha1.adicionar(new Celula("l1 c2"));

        linha2.adicionar(new Celula("l2 c1"));
        linha2.adicionar(new Celula("l2 c2"));

        Tabela tabela1  = new Tabela();
        tabela1.adicionar(linha1);
        tabela1.adicionar(linha2);

        tabela1.imprimir();
    }
}
