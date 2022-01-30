package Mediator;

import java.time.LocalDateTime;

public class UserDefault extends Colleague{
    private LocalDateTime lastMessageLocalDateTime;

    public UserDefault(chat_room m) {
        super(m);
    }

    @Override
    public LocalDateTime getLastMessageLocalDateTime() {
        return lastMessageLocalDateTime;
    }

    public void setLastMessageLocalDateTime(LocalDateTime lastMessageLocalDateTime) {
        this.lastMessageLocalDateTime = lastMessageLocalDateTime;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Receptor UserDefault");
        System.out.println(mensagem);
    }

    public void enviarMensagem(String mensagem) {

        super.enviarMensagem(mensagem, "Default", getLastMessageLocalDateTime());
        setLastMessageLocalDateTime(LocalDateTime.now());
    }
}
