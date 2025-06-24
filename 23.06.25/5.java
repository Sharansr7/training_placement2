import java.util.*;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expense> expenses = new ArrayList<>();

        String option;
        do {
            System.out.print("Enter category: ");
            String cat = sc.nextLine();
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble(); sc.nextLine();
            expenses.add(new Expense(cat, amt));

            System.out.print("Add more? (yes/no): ");
            option = sc.nextLine().toLowerCase();
        } while (option.equals("yes"));

        System.out.println("\n--- Summary ---");
        Map<String, Double> totals = new HashMap<>();
        for (Expense e : expenses)
            totals.put(e.category, totals.getOrDefault(e.category, 0.0) + e.amount);

        totals.forEach((k, v) -> System.out.println(k + ": ₹" + v));
    }
}
