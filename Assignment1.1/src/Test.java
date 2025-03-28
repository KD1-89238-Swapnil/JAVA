import java.util.Scanner;

public class NumberConverterManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        
        System.out.println("Given Number : " + number);
        System.out.println("Binary equivalent : " + convertToBinary(number));
        System.out.println("Octal equivalent : " + convertToOctal(number));
        System.out.println("Hexadecimal equivalent : " + convertToHex(number));
        
        scanner.close();
    }
    
    // Manual conversion methods
    public static String convertToBinary(int n) {
        return Integer.toString(n, 2);
    }
    
    public static String convertToOctal(int n) {
        return Integer.toString(n, 8);
    }
    
    public static String convertToHex(int n) {
        return Integer.toString(n, 16);
    }
}