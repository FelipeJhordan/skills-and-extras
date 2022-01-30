package State;

public class PizzaCooked implements PizzaState{
    @Override
    public PizzaState bakePizza() {
        System.out.println("Baking pizza");
        return new PizzaBaked();
    }

    @Override
    public PizzaState deliverPizza() {
        System.out.println("Can not deliver a pizza not baked yet");
        return this;
    }
}
