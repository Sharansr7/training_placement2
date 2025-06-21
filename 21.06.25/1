import java.util.Scanner;

public class ATM {
    private static double balance = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM MENU:");
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Current Balance: ₹" + balance);
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposited ₹" + amount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawn ₹" + amount);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                }
                case 4 -> System.out.println("Thank you for using the ATM.");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
}
