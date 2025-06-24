class Bank {
    private int balance = 10000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing ₹" + amount);
            balance -= amount;
            System.out.println("Remaining: ₹" + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class BankThreadSim {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Runnable task = () -> bank.withdraw(6000);
        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");

        t1.start();
        t2.start();
    }
}
