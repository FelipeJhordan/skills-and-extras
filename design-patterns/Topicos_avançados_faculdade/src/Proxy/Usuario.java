package Proxy;

import java.util.ArrayList;

public class Usuario {
    public String nome;
    public ArrayList<String> permissoes;
    public Usuario(String nome, ArrayList<String> permissoes) {
        this.nome = nome;
        this.permissoes = permissoes;
    }
}
