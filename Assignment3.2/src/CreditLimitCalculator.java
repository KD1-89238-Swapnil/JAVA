
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Beginning Balance: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Enter Total Charges for the Month: ");
        int totalCharges = sc.nextInt();

        System.out.print("Enter Total Credits for the Month: ");
        int totalCredits = sc.nextInt();

        System.out.print("Enter Credit Limit: ");
        int creditLimit = sc.nextInt();

       
        int newBalance = beginningBalance + totalCharges - totalCredits;

       
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: $" + newBalance);

 
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded!");
        } else {
            System.out.println("Credit limit is within the allowed range.");
        }

        sc.close();
    }
}
