import java.util.*;

class BankAccount {
    private static int accCounter = 1001;
    private final int accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(String holderName) {
        this.holderName = holderName;
        this.balance = 0.0;
        this.accountNumber = accCounter++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankSystem {
    static List<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Account");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositToAccount();
                case 3 -> withdrawFromAccount();
                case 4 -> showAccount();
                case 5 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void createAccount() {
        System.out.print("Enter name: ");
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        BankAccount acc = new BankAccount(name);
        accounts.add(acc);
        System.out.println("Account created with number: " + acc.getAccountNumber());
    }

    static BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts)
            if (acc.getAccountNumber() == accNo)
                return acc;
        return null;
    }

    static void depositToAccount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount: ");
            acc.deposit(sc.nextDouble());
        } else {
            System.out.println("Account not found.");
        }
    }

    static void withdrawFromAccount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount: ");
            acc.withdraw(sc.nextDouble());
        } else {
            System.out.println("Account not found.");
        }
    }

    static void showAccount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.showDetails();
        } else {
            System.out.println("Account not found.");
        }
    }
}
