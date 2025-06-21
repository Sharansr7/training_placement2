class BankAccount {
    String holder;
    double balance;

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Account: " + holder + ", Balance: ₹" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sharan", 10000);
        acc.deposit(2500);
        acc.withdraw(4000);
        acc.display();
    }
}
