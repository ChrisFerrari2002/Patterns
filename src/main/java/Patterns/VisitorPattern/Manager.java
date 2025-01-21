package Patterns.VisitorPattern;

public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
