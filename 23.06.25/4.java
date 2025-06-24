import java.io.*;
import java.util.*;

class BankAccount {
    String name;
    int accNo;
    double balance;

    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited ₹" + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn ₹" + amt);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void saveToFile() throws IOException {
        FileWriter writer = new FileWriter("bank.txt", true);
        writer.write(accNo + "," + name + "," + balance + "\n");
        writer.close();
    }
}

public class BankFileApp {
    public static void main(String[] args) throws IOException {
        BankAccount acc = new BankAccount("Sharan", 1001, 5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.saveToFile();
    }
}
