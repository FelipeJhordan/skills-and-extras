package Proxy;

public class ManagerAccess {
    Usuario user;

    public ManagerAccess(Usuario usuario) {
        this.user = usuario;
    }

    public void salvar(AbstractModule modulo) {
        modulo.salvar();
    }

    public void editar(AbstractModule modulo) {
        modulo.editar();
    }

    public void remover(AbstractModule modulo) {
        modulo.remover();
    }

}
