package ProxyPattern;

public class RealManager implements Manager{
    String name;

    public RealManager(String name) {
        this.name = name;
    }

    @Override
    public void generateName() {
        System.out.println("Manager name: " + name);
    }
}
