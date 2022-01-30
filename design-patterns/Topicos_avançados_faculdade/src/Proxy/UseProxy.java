package Proxy;

import java.util.ArrayList;

public class UseProxy {
    public static void main() {
        Usuario usuario = new Usuario("Burgues", new ArrayList<String>());
        FinanceiroModule financeiroModule = new FinanceiroModule();
        AgendamentoModule agendamentoModule = new AgendamentoModule();

        usuario.permissoes.add("FINANCEIRO");

        ManagerAccessProxy managerAccessProxy = new ManagerAccessProxy(usuario);

        //Pessoa tenta salvar alguma coisa no financeiro
        managerAccessProxy.salvar(agendamentoModule);
        managerAccessProxy.salvar(financeiroModule);
    }
}
