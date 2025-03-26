

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid double value.");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid double value.");
            return;
        }
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
