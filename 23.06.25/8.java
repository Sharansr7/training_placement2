import java.util.*;

class Product {
    String name;
    int qty, reorderLevel;

    Product(String name, int qty, int reorderLevel) {
        this.name = name;
        this.qty = qty;
        this.reorderLevel = reorderLevel;
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        List<Product> list = List.of(
            new Product("Pen", 50, 20),
            new Product("Notebook", 10, 15),
            new Product("Eraser", 5, 10)
        );

        System.out.println("--- Reorder List ---");
        for (Product p : list)
            if (p.qty < p.reorderLevel)
                System.out.println(p.name + " (Qty: " + p.qty + ")");
    }
}
