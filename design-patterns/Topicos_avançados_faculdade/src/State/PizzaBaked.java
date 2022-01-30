package State;

public class PizzaBaked implements PizzaState{
    @Override
    public PizzaState bakePizza() {
        System.out.println("Can not bake a pizza already baked");
        return this;
    }

    @Override
    public PizzaState deliverPizza() {
        System.out.println("Delivering the pizza...");
        return new PizzaDelivered();
    }
}
