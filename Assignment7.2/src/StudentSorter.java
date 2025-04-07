import java.util.*;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public double getMarks() { return marks; }
    public int getRoll() { return roll; }

    @Override
    public String toString() {
        return roll + " | " + name + " | " + city + " | " + marks;
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Alice", "Delhi", 85.0),
            new Student(2, "Bob", "Mumbai", 92.5),
            new Student(3, "Charlie", "Delhi", 92.5),
            new Student(4, "David", "Bangalore", 85.0),
            new Student(5, "Eve", "Mumbai", 85.0),
            new Student(6, "Frank", "Delhi", 85.0)
        };

        Arrays.sort(students, Comparator
            .comparing(Student::getCity, Comparator.reverseOrder())       // City descending
            .thenComparing(Student::getMarks, Comparator.reverseOrder()) // Marks descending
            .thenComparing(Student::getName)                             // Name ascending
        );

        System.out.println("--- Sorted Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
