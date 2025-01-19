package Decorator;

public class ConcretePizza extends Pizza {
    @Override
    public String getDescription() {
        return "Basic pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
