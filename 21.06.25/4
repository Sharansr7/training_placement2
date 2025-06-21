import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add to Cart\n2. View Cart\n3. Checkout\n4. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    sc.nextLine(); // consume newline
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    cart.add(new Product(name, price));
                    System.out.println("Added to cart.");
                }
                case 2 -> {
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("Cart Contents:");
                        cart.forEach(p -> System.out.println(p.name + " - ₹" + p.price));
                    }
                }
                case 3 -> {
                    double total = cart.stream().mapToDouble(p -> p.price).sum();
                    System.out.println("Total Amount: ₹" + total);
                    cart.clear();
                    System.out.println("Thank you for shopping!");
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
