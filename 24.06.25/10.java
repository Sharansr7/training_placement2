import java.util.*;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Restaurant {
    public static void main(String[] args) {
        List<Item> menu = List.of(
            new Item("Burger", 120),
            new Item("Pizza", 300),
            new Item("Coke", 50)
        );
        List<Item> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < menu.size(); i++)
                System.out.println((i + 1) + ". " + menu.get(i).name + " ₹" + menu.get(i).price);

            System.out.print("Select item or 0 to checkout: ");
            int ch = sc.nextInt();
            if (ch == 0) break;
            cart.add(menu.get(ch - 1));
        }

        double total = cart.stream().mapToDouble(i -> i.price).sum();
        System.out.println("Total: ₹" + total);
    }
}
