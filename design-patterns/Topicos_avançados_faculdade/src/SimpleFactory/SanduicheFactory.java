package SimpleFactory;

public abstract class SanduicheFactory {
    protected abstract Sanduiche createSanduiche();

    public Sanduiche orderSanduiche() {
        Sanduiche sanduiche = createSanduiche();
        return sanduiche;
    }
}
