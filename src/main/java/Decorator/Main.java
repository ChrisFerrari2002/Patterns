package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ConcretePizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());

        pizza = new OlivesDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());
    }
}
