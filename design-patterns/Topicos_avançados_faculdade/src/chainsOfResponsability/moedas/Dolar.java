package chainsOfResponsability.moedas;

import chainsOfResponsability.MoedaChain;
import chainsOfResponsability.TipoMoeda;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Dolar extends MoedaChain {

    public Dolar(TipoMoeda tipo) {
        super(tipo);
    }

    @Override
    public void converter(BigDecimal valor) {
        System.out.println(valor);
        exibirConversao(valor.multiply(new BigDecimal("1.17"), MathContext.DECIMAL128));
    }

    @Override
    protected void exibirConversao(BigDecimal valor) {
        DecimalFormat decFormat = new DecimalFormat("'$ ' 0.##");
        System.out.println("Euro convertido para dolar = " + decFormat.format(valor));
    }
}
