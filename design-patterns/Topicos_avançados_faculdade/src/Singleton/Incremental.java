package Singleton;

public class Incremental {
    private static Incremental instance;
    private int numero;

    private Incremental() { }

    public static Incremental getInstance() {
        if(instance == null) {
            instance = new Incremental();
        }
        return instance;
    }

    public void next() {
        this.numero =  ++this.numero;
    }

    @Override
    public String toString() {
         return "Incremental " + numero;
    }
}
