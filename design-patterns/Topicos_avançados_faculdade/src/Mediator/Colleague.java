package Mediator;

import java.time.LocalDateTime;

public abstract class Colleague {
    protected chat_room mediator;

    public Colleague(chat_room m) {
        mediator = m;
    }

    public abstract LocalDateTime getLastMessageLocalDateTime();

    public void enviarMensagem(String mensagem, String tipo,LocalDateTime ultimaMensagemldt) {
        mediator.enviar(new Mensagem(mensagem, tipo,ultimaMensagemldt), this);
    }

    public abstract void receberMensagem(String mensagem);
}
