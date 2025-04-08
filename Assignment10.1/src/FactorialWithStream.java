import java.util.stream.IntStream;
import java.util.Scanner;

public class FactorialWithStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = IntStream.rangeClosed(1, num)
                                      .reduce(1, (a, b) -> a * b);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
