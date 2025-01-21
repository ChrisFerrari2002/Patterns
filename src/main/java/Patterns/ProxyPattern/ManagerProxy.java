package Patterns.ProxyPattern;

public class ManagerProxy implements Manager {
    RealManager realManager;
    boolean hasAccess;

    public ManagerProxy(String name, boolean hasAccess) {
        this.realManager = new RealManager(name);
        this.hasAccess = hasAccess;
    }


    @Override
    public void generateName() {
        if (hasAccess) {
            realManager.generateName();
        } else {
            System.out.println("Access denied");
        }
    }
}
