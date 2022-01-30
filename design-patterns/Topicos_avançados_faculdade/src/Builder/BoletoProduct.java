package Builder;

import java.util.Date;

public class BoletoProduct {
    String sacado;
    String cedente;
    Long codBarras;
    Double valor;
    Date dataVencimento;

    @Override
    public String toString() {
        return "BoletoProduct{" +
                "sacado='" + sacado + '\'' +
                ", cedente='" + cedente + '\'' +
                ", codBarras=" + codBarras +
                ", valor=" + valor +
                ", dataVencimento=" + dataVencimento.toString() +
                '}';
    }
}
