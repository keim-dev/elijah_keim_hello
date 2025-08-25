public class HelloWorld {
    private final String name;
    private final int age;

    // Constructor with only name
    public HelloWorld(String name) {
        this.name = name;
        this.age = 0; // Default age if not provided
    }

    // Constructor with name and age
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // greet with default message
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // greet with custom message
    public void greet(String message) {
        System.out.println(message + ", " + name + "!");
    }

    // introduce method
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Using first constructor
        HelloWorld student1 = new HelloWorld("Elijah", 19);
        student1.greet();
        student1.greet("Welcome");
        student1.introduce();

        // Using second constructor
        HelloWorld student2 = new HelloWorld("Alex", 21);
        student2.greet();
        student2.greet("Hi");
        student2.introduce();
    }
}