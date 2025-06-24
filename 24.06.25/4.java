import java.util.*;

class Patient {
    String name, disease;
    int age;

    Patient(String name, String disease, int age) {
        this.name = name; this.disease = disease; this.age = age;
    }

    public String toString() {
        return name + " - " + disease + " (" + age + " years)";
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Patient 2. View All 3. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Disease: ");
                String disease = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt(); sc.nextLine();
                patients.add(new Patient(name, disease, age));
            } else if (ch == 2) {
                for (Patient p : patients) System.out.println(p);
            } else break;
        }
    }
}
