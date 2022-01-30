package Mediator;


import java.time.LocalDateTime;

public class Mensagem {
    public String texto;
    public long tempoEntreMensagens;
    public String nomeMandante;
    public Mensagem(String mensagem,String nomeMandante,LocalDateTime ultimaMensagemLocalDateTime) {
        this.texto = mensagem;
        this.nomeMandante = nomeMandante;
        tempoEntreMensagens = ultimaMensagemLocalDateTime != null ? LocalDateTime.now().compareTo(ultimaMensagemLocalDateTime): 1800000 ;
    }
}
