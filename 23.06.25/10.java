import java.util.*;

class Item {
    String name; double price;

    Item(String name, double price) {
        this.name = name; this.price = price;
    }
}

public class CartSystem {
    public static void main(String[] args) {
        List<Item> catalog = List.of(
            new Item("Shoes", 1999), new Item("Bag", 999)
        );
        List<Item> cart = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. View Products 2. Add to Cart 3. Checkout 4. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                for (int i = 0; i < catalog.size(); i++)
                    System.out.println((i+1) + ". " + catalog.get(i).name + " ₹" + catalog.get(i).price);
            } else if (ch == 2) {
                System.out.print("Enter product number: ");
                int n = sc.nextInt();
                cart.add(catalog.get(n-1));
            } else if (ch == 3) {
                double total = 0;
                System.out.println("--- Cart ---");
                for (Item i : cart) {
                    System.out.println(i.name + " - ₹" + i.price);
                    total += i.price;
                }
                System.out.println("Total: ₹" + total);
            } else break;
        }
    }
}
