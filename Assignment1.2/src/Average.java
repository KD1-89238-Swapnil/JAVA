import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double values:");

        // Check if first input is a double
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: First input is not a valid double value. Program terminated.");
            scanner.close();
            return; // Exit program
        }
        double num1 = scanner.nextDouble();

        // Check if second input is a double
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Second input is not a valid double value. Program terminated.");
            scanner.close();
            return; // Exit program
        }
        double num2 = scanner.nextDouble();

        // Calculate and display the average
        double average = (num1 + num2) / 2;
        System.out.printf("The average of %.2f and %.2f is: %.2f%n", num1, num2, average);

        // Close scanner
        scanner.close();
    }
}
