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
        
     
        String trimmedStr = str.trim();
     
        if (trimmedStr.isEmpty()) {
            return 0;
        }
        
        
        String[] words = trimmedStr.split("\\s+");
        
      
        for (String word : words) {
            System.out.println(word);
        }
        
      
        return words.length;
    }
}
