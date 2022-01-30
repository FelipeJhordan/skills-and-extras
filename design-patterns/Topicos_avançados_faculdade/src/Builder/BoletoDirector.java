package Builder;

/**
 * BoletoDirector
 */
public class BoletoDirector {

    protected BoletoBuilder boletoObject;

    public BoletoDirector(BoletoBuilder boletoObject)  {
        this.boletoObject = boletoObject;
    }

    public void construirBoleto(String sacado, String cedente, Double valor,
         String dataVencimento) {
        boletoObject.CreateNewBoletoProduct();
        boletoObject.buildCodigoBarras();
        boletoObject.buildValor(valor);
        boletoObject.buildSacado(sacado);
        boletoObject.buildData(dataVencimento);
        boletoObject.buildCedente(cedente);
    }

    public BoletoProduct getBoleto() {
        return boletoObject.getBoleto();
    }
}