package Bridge;

public class UseBridge {
    public static void main() {
        AbstracaoTamanho refriGrande = new TamanhoGrande(new Pepsi());
        System.out.println(refriGrande.refrigerante);
        refriGrande.beber();

        AbstracaoTamanho refriSuper = new TamanhoSuper(new CocaCola());
        System.out.println(refriSuper.refrigerante);
        refriSuper.beber();
    }
}
