package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();

        Person person = builder
                .setName("John")
                .setAge(30)
                .build();

        System.out.println(person);
    }
}
