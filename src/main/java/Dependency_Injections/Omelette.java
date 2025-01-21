package Dependency_Injections;

public class Omelette implements Food {

    @Override
    public void text() {
        System.out.println("Starting omelette preparation");
    }
    @Override
    public boolean prepareFood() {
        text();
        System.out.println("Preparing Omelette");
        return true;
    }
}
