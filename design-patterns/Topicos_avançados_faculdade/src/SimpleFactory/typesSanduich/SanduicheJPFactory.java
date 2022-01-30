package SimpleFactory.typesSanduich;

import SimpleFactory.Sanduiche;
import SimpleFactory.SanduicheFactory;

public class SanduicheJPFactory extends SanduicheFactory{
    @Override
    public Sanduiche createSanduiche() {
        return new Sanduiche("Frances", "Mussarela", "De Frago", "Com verdura");
    }
}
