package Patterns.VisitorPattern;

public class WorkReport implements Visitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("Manager name: " + manager.name);
    }
}
