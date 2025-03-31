//import java.util.Scanner;
//
//class Employee{ 
//	//fields 
//	private int empid; // instance variable  
//	private String name; // instance variable
//	private double salary; // instance variable
//	
//	//this = emp1 
//	public void acceptRecord() { // instance method 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Empid : ");
//		this.empid = sc.nextInt(); 
//		System.out.print("Name : ");
//		this.name = sc.next(); 
//		System.out.println("Salary : ");
//		this.salary = sc.nextDouble(); 
//	}
//	// this = emp 
//	public void printRecord( ) {
//		System.out.println("Empid : "+this.empid);
//		System.out.println("Name : "+this.name);
//		System.out.println("Salary : "+this.salary);
//	}
//} 
//
//public class Program {
//	public static void main(String[] args) {
//		Employee emp = new Employee(); 
//		emp.acceptRecord();//emp.acceptRecord(emp);
//		emp.printRecord();//emp.printRecord(emp); 
//	}
//	
//}




























import java.util.Scanner;
class Employee{
	
	private int empid;
	private String name;
	private double salary;
	
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		this. empid =sc.nextInt();
		System.out.println("Enter theb the name");
		this.name =sc.next();
		System.out.println("Enter the salary");
		this.salary=sc.nextDouble();
    }
	
	
	

	public void printRecord() {
		//Scanner sc= new Scanner(System.in);
		System.out.println("Empid:" +this.empid);
		System.out.println("Name:" +this.name);
		System.out.println("Name:" +this.salary);
	}
	
	
}
public class Program{
	public static void main(String[]args) {
		Employee e1=new Employee();
		
		e1.acceptRecord();
		e1.printRecord();
	}
}

