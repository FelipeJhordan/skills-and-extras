package Proxy;

public class AgendamentoModule extends  AbstractModule{

    public AgendamentoModule() {
        this.nome = "AGENDAMENTO";
    }

    public void salvar() {
        System.out.println("Agendamento Salvo");
    }

    @Override
    public void editar() {
        System.out.println("Agendamento Editado");
    }

    @Override
    public void remover() {
        System.out.println("Agendamento Removido");
    }
}
