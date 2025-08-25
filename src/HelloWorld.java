/**
 * Represents a person with a name and age, and provides greeting methods.
 */
public class HelloWorld {
    private final String name;
    private final int age;

    /**
     * Constructs a HelloWorld object with a name and default age 0.
     * @param name the person's name
     */
    public HelloWorld(String name) {
        this.name = name;
        this.age = 0; // Default age if not provided
    }

    /**
     * Constructs a HelloWorld object with a name and age.
     * @param name the person's name
     * @param age the person's age
     */
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Prints a default greeting message.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Prints a custom greeting message.
     * @param message the custom message
     */
    public void greet(String message) {
        System.out.println(message + ", " + name + "!");
    }

    /**
     * Introduces the person with name and age.
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}