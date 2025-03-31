import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The string is too long"); 
    }
}

public class StringLengthChecker {
    public static void checkStringLength(String input) throws ExceptionLineTooLong {
        if (input.length() > 80) {
            throw new ExceptionLineTooLong(); 
        } else {
            System.out.println("Valid string length: " + input.length());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        
        try {
            checkStringLength(userInput); 
        } catch (ExceptionLineTooLong e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        sc.close(); 
    }
}