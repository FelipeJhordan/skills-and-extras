package Proxy;

public class ManagerAccessProxy extends ManagerAccess{

    public ManagerAccessProxy(Usuario usuario) {
        super(usuario);
    }

    @Override
    public void salvar(AbstractModule modulo) {
        if(temPermissaoModulo(modulo)) {
            super.salvar(modulo);
        } else {
            System.out.println("Modulo "+modulo.nome+"-Não tem permissão para criar");
        }
    }

    @Override
    public void editar(AbstractModule modulo) {
        if(temPermissaoModulo(modulo)) {
            super.editar(modulo);
        } else {
            System.out.println("Modulo "+modulo.nome+"-Não tem permissão para editar");
        }
    }

    @Override
    public void remover(AbstractModule modulo) {
        if(temPermissaoModulo(modulo)) {
            super.remover(modulo);
        } else {
            System.out.println("Modulo "+modulo.nome+"-Não tem permissão para remover");
        }
    }

    private boolean temPermissaoModulo(AbstractModule modulo) {
        for (String str:
             user.permissoes) {
            if (str.equals(modulo.nome)) {
                return true;
            }
        }
        return false;
    }
}
