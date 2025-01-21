package Patterns.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Bob");
        Visitor visitor = new WorkReport();
        manager.accept(visitor);
    }
}
