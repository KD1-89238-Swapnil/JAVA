import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first employee
        System.out.println("Enter details for first employee:");
        System.out.print("First Name: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary1 = scanner.nextDouble();

        // Input for second employee
        scanner.nextLine(); // Consume newline
        System.out.println("\nEnter details for second employee:");
        System.out.print("First Name: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary2 = scanner.nextDouble();

        // Creatinryg Employee objects
        Employee emp1 = new Employee(firstName1, lastName1, salary1);
        Employee emp2 = new Employee(firstName2, lastName2, salary2);

        // Display initial yearly salaries
        System.out.println("\nInitial Yearly Salaries:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());

        // Apply 10% raise to both employees
        emp1.giveRaise();
        emp2.giveRaise();

        // Display updated yearly salaries
        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());

        scanner.close();
    }
}

