package BuilderPattern;

public class PersonBuilder {
    private String name;
    private int age;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setAge(this.age);
        person.setName(this.name);
        return person;
    }


}
