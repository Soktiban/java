import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's name
        String name = scanner.nextLine();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Print a greeting with the entered name
        System.out.println("Hello, " + name + "! Welcome to the Name program.");
    }
}
