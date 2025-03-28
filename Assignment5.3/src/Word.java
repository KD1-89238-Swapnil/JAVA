import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        
        System.out.println("Number of words in the string: " + wordCount);
        
        scanner.close();
    }
    
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        // Trim leading and trailing whitespace
        String trimmedStr = str.trim();
        
        // If the trimmed string is empty after trimming, return 0
        if (trimmedStr.isEmpty()) {
            return 0;
        }
        
        // Split the string into words using one or more whitespace characters as delimiter
        String[] words = trimmedStr.split("\\s+");
        
        // Optional: Print each word (for debugging)
        for (String word : words) {
            System.out.println(word);
        }
        
        // Return the number of words
        return words.length;
    }
}