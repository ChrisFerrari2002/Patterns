package StrategyPattern;

public class PaymentProcessor {
    private Strategy paymentStrategy;

    public void setPaymentStrategy(Strategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
