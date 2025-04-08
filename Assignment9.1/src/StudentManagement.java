import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Search student by roll number");
            System.out.println("4. Sort students by roll number");
            System.out.println("5. Sort students by name");
            System.out.println("6. Sort students by marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    studentList.add(new Student(rollNo, name, marks));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    Iterator<Student> it = studentList.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    Collections.sort(studentList, Comparator.comparingInt(Student::getRollNo));
                    System.out.println("Students sorted by roll number.");
                    break;

                case 5:
                    Collections.sort(studentList, Comparator.comparing(Student::getName));
                    System.out.println("Students sorted by name.");
                    break;

                case 6:
                    Collections.sort(studentList, Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Students sorted by marks.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
