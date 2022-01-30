package State;

public class Pizza {
    protected PizzaState estado;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Pizza() {
        this.nome = "Mineira";
        this.estado = new PizzaCooked();
    }

    public void bake() {
        this.estado = estado.bakePizza();
    }

    public void deliver () {
        this.estado = estado.deliverPizza();
    }
}
