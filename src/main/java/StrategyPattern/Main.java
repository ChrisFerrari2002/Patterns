package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CardPayment());
        processor.executePayment(100);

        processor.setPaymentStrategy(new PaypalPayment());
        processor.executePayment(200);
    }
}
