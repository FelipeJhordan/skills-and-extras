package Mediator;

import java.time.LocalDateTime;

public class UserVip extends Colleague{
    public LocalDateTime lastMessageLocalDateTime;
    public UserVip(chat_room m) {
        super(m);
    }

    @Override
    public LocalDateTime getLastMessageLocalDateTime() {
            return lastMessageLocalDateTime;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Receptor UserVip");
        System.out.println(mensagem);
    }
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem, "Vip", getLastMessageLocalDateTime());
    }

}
