package StrategyPattern;

public class CardPayment implements Strategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with Credit Card.");
    }
}
