import java.util.Scanner;

class ATM {
    private final int pin = 1234;
    private double balance = 10000;

    boolean verifyPin(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        }
    }

    void checkBalance() {
        System.out.println("Available Balance: ₹" + balance);
    }
}

public class ATMApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.verifyPin(enteredPin)) {
            System.out.println("Invalid PIN!");
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Amount: ");
                    atm.withdraw(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Amount: ");
                    atm.deposit(sc.nextDouble());
                }
                case 3 -> atm.checkBalance();
                case 4 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
}
