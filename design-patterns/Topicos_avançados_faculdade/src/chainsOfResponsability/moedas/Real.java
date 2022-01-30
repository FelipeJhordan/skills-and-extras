package chainsOfResponsability.moedas;

import chainsOfResponsability.MoedaChain;
import chainsOfResponsability.TipoMoeda;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Real extends MoedaChain {

    public Real(TipoMoeda tipo) {
        super(tipo);
    }

    @Override
    public void converter(BigDecimal valor) {
        exibirConversao((valor.multiply(new BigDecimal(6.6), MathContext.DECIMAL128)));
    }

    @Override
    protected void exibirConversao(BigDecimal valor) {
        DecimalFormat decFormat = new DecimalFormat("'R$' 0.##");
        System.out.println("Euro convertido para real = " + decFormat.format(valor));
    }


}
