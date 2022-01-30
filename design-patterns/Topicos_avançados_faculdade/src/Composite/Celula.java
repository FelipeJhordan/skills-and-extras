package Composite;

public class Celula extends ItemComponent {
    public Celula(String conteudo)
    {
        this.conteudo = conteudo;
    }
    public void imprimir() {
        // Limita o conteúdo a exatamente 15 caracteres.
        conteudo = conteudo + " ";
        // Imprime na mesma linha e com borda lateral.
        System.out.println(" | " + conteudo);
    }
}
