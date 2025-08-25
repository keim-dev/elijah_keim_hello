import java.util.Scanner;

/**
 * AppLauncher class to run the HelloWorld demonstration.
 */
public class AppLauncher {

    /**
     * Main method to launch the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Instantiate HelloWorld objects with predetermined values
        HelloWorld student1 = new HelloWorld("Elijah", 19);
        HelloWorld student2 = new HelloWorld("Alex", 21);

        student1.greet();
        student1.greet("Welcome");
        student1.introduce();

        student2.greet();
        student2.greet("Hi");
        student2.introduce();

        // Use Scanner to gather user input
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine().trim();
            if (userName.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            System.out.print("Enter your age: ");
            int userAge = Integer.parseInt(scanner.nextLine().trim());
            if (userAge < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            HelloWorld user = new HelloWorld(userName, userAge);
            user.greet();
            user.greet("Greetings");
            user.introduce();

        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}