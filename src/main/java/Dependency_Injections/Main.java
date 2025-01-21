package Dependency_Injections;

public class Main {
    public static void main(String[] args) {

        Chef fishChef = new Chef(new Fish());
        fishChef.cook();

        Chef omeletteFish = new Chef(new Omelette());
        omeletteFish.cook();
    }
}
