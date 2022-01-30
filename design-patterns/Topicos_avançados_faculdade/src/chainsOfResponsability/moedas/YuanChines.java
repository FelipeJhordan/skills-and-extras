package chainsOfResponsability.moedas;

import chainsOfResponsability.MoedaChain;
import chainsOfResponsability.TipoMoeda;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class YuanChines extends MoedaChain {
    public YuanChines(TipoMoeda tipo) {
        super(tipo);
    }

    @Override
    public void converter(BigDecimal valor) {
        exibirConversao((valor.multiply(new BigDecimal(7.47), MathContext.DECIMAL128)));
    }

    @Override
    protected void exibirConversao(BigDecimal valor) {
        DecimalFormat decFormat = new DecimalFormat("'元' 0.##");
        System.out.println("Euro convertido para Yuan Chines = " + decFormat.format(valor));
    }

}
