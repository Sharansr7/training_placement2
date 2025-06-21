import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        
        double hra = 0.2 * basic;
        double da = 0.1 * basic;
        double pf = 0.12 * basic;
        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("\n--- Salary Slip ---");
        System.out.println("Name: " + name);
        System.out.println("Basic: ₹" + basic);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("PF: ₹" + pf);
        System.out.println("Gross: ₹" + gross);
        System.out.println("Net Salary: ₹" + net);
    }
}
