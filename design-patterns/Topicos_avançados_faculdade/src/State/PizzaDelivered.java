package State;

public class PizzaDelivered implements PizzaState{
    @Override
    public PizzaState bakePizza() {
        System.out.println("Can´t bake pizza already delivered");
        return this;
    }

    @Override
    public PizzaState deliverPizza()  {
        System.out.println("Can´t deliver pizza already delivered");
        return this;
    }
}
