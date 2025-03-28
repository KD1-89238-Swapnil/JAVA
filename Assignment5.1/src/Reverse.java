import java.util.Scanner;

public class Reverse {
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the :");
		String str = sc.nextLine(); 
		StringBuffer sb = new StringBuffer(str); 
		sb.reverse(); 
		String s = sb.toString(); 
		System.out.println("Reverse strings : "+s);
	 }
}