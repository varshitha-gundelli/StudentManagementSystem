package studentmanagement.model;

public abstract class Person {

    private String name;
    private int age;

    static String organization;

    // Static Block
    static {
        organization = "SRITW College";

        System.out.println(
            "Static block in Person executed. Organization set."
        );
    }

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation - Getter
    public String getName() {
        return name;
    }

    // Encapsulation - Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Abstraction
    public abstract String getDetails();
}