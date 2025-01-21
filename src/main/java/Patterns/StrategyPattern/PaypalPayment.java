package Patterns.StrategyPattern;

public class PaypalPayment implements Strategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with PayPal.");
    }
}
