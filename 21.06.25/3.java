import java.util.*;

class Book {
    int id;
    String title;
    boolean issued = false;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void issue() {
        issued = true;
    }

    void returnBook() {
        issued = false;
    }
}

public class Library {
    static Map<Integer, Book> books = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add Book\n2. View Books\n3. Issue Book\n4. Return Book\n5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    books.put(id, new Book(id, title));
                }
                case 2 -> {
                    for (Book b : books.values()) {
                        System.out.println("ID: " + b.id + ", Title: " + b.title + ", Issued: " + b.issued);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();
                    if (books.containsKey(id) && !books.get(id).issued) {
                        books.get(id).issue();
                        System.out.println("Book issued.");
                    } else {
                        System.out.println("Book not available.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    if (books.containsKey(id) && books.get(id).issued) {
                        books.get(id).returnBook();
                        System.out.println("Book returned.");
                    } else {
                        System.out.println("Invalid book ID or not issued.");
                    }
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
}
