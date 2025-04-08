import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book {
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books (forward order)");
            System.out.println("3. Display all books (reverse order)");
            System.out.println("4. Delete book at given index");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // consume newline

                    bookList.add(new Book(isbn, price, author, quantity));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("Books in forward order:");
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.println("Books in reverse order:");
                    ArrayList<Book> reverseList = new ArrayList<>(bookList);
                    Collections.reverse(reverseList);
                    for (Book book : reverseList) {
                        System.out.println(book);
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (index >= 0 && index < bookList.size()) {
                        bookList.remove(index);
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
