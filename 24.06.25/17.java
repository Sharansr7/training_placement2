import java.util.*;

public class LoanCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Monthly Income: ");
        double income = sc.nextDouble();
        System.out.print("Existing EMIs: ");
        double emi = sc.nextDouble();

        double eligibility = (income - emi) * 0.6;
        System.out.println("Eligible Loan Amount: ₹" + eligibility * 60);
    }
}
