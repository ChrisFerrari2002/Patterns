package Patterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Manager managerWithAccess = new ManagerProxy("Jeff", true);
        Manager managerWithoutAccess = new ManagerProxy("Bob", false);

        System.out.println("Jeff report:");
        managerWithAccess.generateName();

        System.out.println("Bob report:");
        managerWithoutAccess.generateName();
    }
}
