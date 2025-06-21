import java.util.*;

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Book\n2. View All\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    books.add(new Book(title, price));
                }
                case 2 -> {
                    if (books.isEmpty()) System.out.println("No books in store.");
                    else books.forEach(b -> System.out.println(b.title + " - ₹" + b.price));
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
        }
    }
}
