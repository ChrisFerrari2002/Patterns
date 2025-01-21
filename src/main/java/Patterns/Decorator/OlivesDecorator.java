package Patterns.Decorator;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.0;
    }
}
