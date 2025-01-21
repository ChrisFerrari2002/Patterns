package Dependency_Injections;

public class Fish implements Food {
    @Override
    public void text() {
        System.out.println("Starting fish preparation");
    }

    @Override
    public boolean prepareFood() {
        text();
        System.out.println("Preparing Fish");
        return true;
    }
}
