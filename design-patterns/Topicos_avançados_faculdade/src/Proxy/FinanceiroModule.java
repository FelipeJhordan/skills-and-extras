package Proxy;


public class FinanceiroModule extends AbstractModule{

    public FinanceiroModule() {
        this.nome = "FINANCEIRO";
    }

    @Override
    public void salvar() {
        System.out.println("Transação Bancária salva");
    }

    @Override
    public void editar() {
        System.out.println("Transação Bancária editada");
    }

    @Override
    public void remover() {
        System.out.println("Transação Bancária removida");
    }
}
