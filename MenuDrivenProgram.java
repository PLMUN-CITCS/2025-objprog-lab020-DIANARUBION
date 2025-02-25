import java.util.Scanner;

public class MenuDrivenProgram {
    
    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle user menu choice
    public static void handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0); // Terminate the program
            default:
                System.out.println("Invalid choice. Please enter a valid option (1-3).");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) { // Validate input
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter an integer: ");
        }
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { // Keep displaying the menu until the user exits
            displayMenu();
            while (!scanner.hasNextInt()) { // Validate input
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Consume the invalid input
                displayMenu();
            }
            int choice = scanner.nextInt();
            handleMenuChoice(choice, scanner);
        }
    }
}
