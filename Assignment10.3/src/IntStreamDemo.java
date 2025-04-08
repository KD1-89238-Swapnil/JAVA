import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        // Create IntStream from 1 to 10
        IntStream stream = IntStream.rangeClosed(1, 10);

        // Calculate sum
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Use summaryStatistics
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println("\nSummary Statistics:");
        System.out.println("Count  : " + stats.getCount());
        System.out.println("Sum    : " + stats.getSum());
        System.out.println("Min    : " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max    : " + stats.getMax());
    }
}
