package chainsOfResponsability;

import chainsOfResponsability.moedas.Dolar;
import chainsOfResponsability.moedas.Real;
import chainsOfResponsability.moedas.YuanChines;

import java.math.BigDecimal;

public class UseChains {
    public static void main() {
        MoedaChain conversor = new Dolar(TipoMoeda.DOLAR);
        conversor.setNext(new Real(TipoMoeda.REAIS));
        conversor.setNext(new YuanChines(TipoMoeda.YUAN_CHINES));

        try {
            conversor.converter(TipoMoeda.DOLAR, BigDecimal.valueOf(10));
            conversor.converter(TipoMoeda.REAIS, BigDecimal.valueOf(10));
            conversor.converter(TipoMoeda.YUAN_CHINES, BigDecimal.valueOf(10));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
