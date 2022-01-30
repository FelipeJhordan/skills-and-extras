package chainsOfResponsability;

import java.math.BigDecimal;

abstract public class MoedaChain {
    protected MoedaChain next;
    protected TipoMoeda tipoMoeda;

    public MoedaChain(TipoMoeda tipo) {
        next = null;
        tipoMoeda = tipo;
    }

    public void setNext(MoedaChain node) {
        if( next == null) {
            next = node;
        } else {
            next.setNext(node);
        }
    }

    public void converter(TipoMoeda tipo, BigDecimal valor) throws Exception {
        if(podeEfetuarConversao(tipo)) {
            converter(valor);
        } else {
            if (next == null ) {
                throw new Exception("tipo de moeda não cadastrada");
            }
            next.converter(tipo, valor);
        }
    }


    private boolean podeEfetuarConversao(TipoMoeda tipo) {
        return tipo == tipoMoeda;
    }

     public abstract void converter(BigDecimal valor);

    protected abstract void exibirConversao(BigDecimal valor);
}
