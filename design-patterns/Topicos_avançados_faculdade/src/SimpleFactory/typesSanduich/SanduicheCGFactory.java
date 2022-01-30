package SimpleFactory.typesSanduich;

import SimpleFactory.Sanduiche;
import SimpleFactory.SanduicheFactory;

public class SanduicheCGFactory extends SanduicheFactory{

 
    @Override
    public Sanduiche createSanduiche() {
        return new Sanduiche("Integral","Prato","De Fragon", " Sem verdura ");
    }
    
}
