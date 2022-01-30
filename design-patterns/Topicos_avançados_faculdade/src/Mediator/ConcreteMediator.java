package Mediator;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ConcreteMediator implements chat_room{
    protected ArrayList<Colleague>  users;

    public ConcreteMediator() {
        users = new ArrayList<>();
    }

    public void adicionarColleague(Colleague colleague) {
        users.add(colleague);
    }

    @Override
    public void enviar(Mensagem mensagem, Colleague colleague) {
        if(!isBlockedMensage(mensagem, colleague)) {

            for( Colleague user: users) {
                user.receberMensagem("Enviado por "+mensagem.nomeMandante+": "+mensagem.texto);
            }
        }
    }

    private boolean isBlockedMensage(Mensagem mensagem,Colleague colleague) {
        if(colleague instanceof UserVip) {
            return false;
        } else {
            if(mensagem.tempoEntreMensagens >= 1800000) {
                return false;
            }
            return true;
        }
    }
}
