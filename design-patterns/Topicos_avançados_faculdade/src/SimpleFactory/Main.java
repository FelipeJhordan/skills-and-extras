package SimpleFactory;

import SimpleFactory.typesSanduich.SanduicheCGFactory;
import SimpleFactory.typesSanduich.SanduicheJPFactory;
import SimpleFactory.typesSanduich.SanduicheRTFactory;

public class Main {
    public static void main(String[] args) {
        SanduicheCGFactory lanchoneteCG = new SanduicheCGFactory();
        Sanduiche sanduba = lanchoneteCG.createSanduiche();
        SanduicheJPFactory lanchoneteJP = new SanduicheJPFactory();
        Sanduiche sanduba1 = lanchoneteJP.createSanduiche();
        SanduicheRTFactory lanchoneteRT = new SanduicheRTFactory();
        Sanduiche sanduba2 = lanchoneteRT.createSanduiche();
        System.out.println(sanduba.pao);
        System.out.println(sanduba1.pao);
        System.out.println(sanduba2.pao);

    }
}
