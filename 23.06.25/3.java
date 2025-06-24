import java.util.*;

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double hra() { return 0.2 * basicSalary; }
    double da() { return 0.1 * basicSalary; }
    double pf() { return 0.12 * basicSalary; }

    double grossSalary() {
        return basicSalary + hra() + da();
    }

    double netSalary() {
        return grossSalary() - pf();
    }

    void printSlip() {
        System.out.println("---- Payslip ----");
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Basic: ₹" + basicSalary);
        System.out.println("HRA: ₹" + hra());
        System.out.println("DA: ₹" + da());
        System.out.println("PF: ₹" + pf());
        System.out.println("Net Salary: ₹" + netSalary());
    }
}

public class Payroll {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sharan", 45000);
        emp.printSlip();
    }
}
