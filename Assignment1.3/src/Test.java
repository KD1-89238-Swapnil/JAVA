



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu items and their corresponding prices
        String[] menuItems = {
            "Dosa", "Samosa", "Idli", "Pav Bhaji", "Biryani", 
            "Vada", "Paneer Tikka", "Chole Bhature", "Pani Puri"
        };
        double[] prices = {50, 20, 30, 80, 150, 25, 120, 90, 40};  // Prices for each item
        int[] quantities = new int[menuItems.length];  // To store ordered quantities
        
        while (true) {
            // Display menu
            System.out.println("\nFood Menu:");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println((i + 1) + ". " + menuItems[i] + " - ₹" + prices[i]);
            }
            System.out.println("10. Generate Bill");

            // Ask user for selection
            System.out.print("\nEnter item number to order (or 10 to generate bill): ");
            int choice = scanner.nextInt();

            if (choice == 10) {
                break; // Exit loop and generate bill
            } else if (choice >= 1 && choice <= menuItems.length) {
                System.out.print("Enter quantity for " + menuItems[choice - 1] + ": ");
                int qty = scanner.nextInt();
                if (qty > 0) {
                    quantities[choice - 1] += qty; // Add quantity to respective item
                } else {
                    System.out.println("Invalid quantity. Try again.");
                }
            } else {
                System.out.println("Invalid choice. Please select a valid menu item.");
            }
        }

        // Generate and display bill
        double totalBill = 0;
        System.out.println("\n----- Bill Summary -----");
        for (int i = 0; i < menuItems.length; i++) {
            if (quantities[i] > 0) {
                double cost = quantities[i] * prices[i];
                System.out.println(menuItems[i] + " x " + quantities[i] + " = ₹" + cost);
                totalBill += cost;
            }
        }
        System.out.println("-------------------------");
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Thank you for ordering!");

        scanner.close();
    }
}
