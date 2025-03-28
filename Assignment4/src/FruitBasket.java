import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        while (true) {
            System.out.println("\nOptions: \n0. Exit \n1. Add Mango \n2. Add Orange \n3. Add Apple \n4. Display fruit names \n5. Display fresh fruits \n6. Display stale fruits \n7. Mark fruit stale \n8. Mark all sour fruits stale");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 1:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
                    } else System.out.println("Basket full!");
                    break;
                case 2:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
                    } else System.out.println("Basket full!");
                    break;
                case 3:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
                    } else System.out.println("Basket full!");
                    break;
                case 4:
                    System.out.println("Fruit names in basket:");
                    for (Fruit fruit : basket)
                        if (fruit != null) System.out.println(fruit.getName());
                    break;
                case 5:
                    System.out.println("Fresh fruits:");
                    for (Fruit fruit : basket)
                        if (fruit != null && fruit.isFresh())
                            System.out.println(fruit + ", Taste: " + fruit.taste());
                    break;
                case 6:
                    System.out.println("Tastes of stale fruits:");
                    for (Fruit fruit : basket)
                        if (fruit != null && !fruit.isFresh())
                            System.out.println(fruit.taste());
                    break;
                case 7:
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else System.out.println("Invalid index!");
                    break;
                case 8:
                    for (Fruit fruit : basket)
                        if (fruit != null && "sour".equals(fruit.taste()))
                            fruit.setFresh(false);
                    System.out.println("All sour fruits marked stale.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

