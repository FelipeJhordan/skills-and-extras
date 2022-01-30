package SimpleFactory.typesSanduich;

import SimpleFactory.Sanduiche;
import SimpleFactory.SanduicheFactory;

public class SanduicheRTFactory extends SanduicheFactory {
    @Override
    public Sanduiche createSanduiche() {
        return new Sanduiche("Bola", "Chedar", "De Peru", "Sem Verdura");

    }
}
