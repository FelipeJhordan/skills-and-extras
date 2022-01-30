package Builder;


public abstract class BoletoBuilder {
    public BoletoProduct boleto;
    
    public void CreateNewBoletoProduct() {
        boleto = new BoletoProduct();
    }

    public abstract void buildCodigoBarras();
    public abstract void buildValor(Double Valor);
    public abstract void buildData(String dataVencimento);
    public abstract void buildCedente(String cedente);
    public abstract void buildSacado(String sacado);
    public BoletoProduct getBoleto() {
        return boleto;
    }
}
