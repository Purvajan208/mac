import java.util.Scanner; // Import Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Taking double input
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();

        // Displaying the inputs
        System.out.println("\nHello, " + name + "!");
        Syst
