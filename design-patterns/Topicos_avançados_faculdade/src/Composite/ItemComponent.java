package Composite;

public abstract class ItemComponent {
    public String conteudo;
    public void imprimir() {
        conteudo = conteudo + " ";
        conteudo = conteudo.substring(0, 15);
        // Imprime na mesma linha e com borda lateral.
        System.out.println("  " + conteudo);
    }
}
