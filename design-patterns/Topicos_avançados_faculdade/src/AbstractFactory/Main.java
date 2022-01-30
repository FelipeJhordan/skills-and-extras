package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        new MotorolaFactory().criarMotorola();
        new NokiaFactory().criarNokia();
    }
}
