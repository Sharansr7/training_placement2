import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class AttendanceSystem {
    static final String FILE = "attendance.csv";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter(FILE, true);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        writer.write(name + "," + LocalDate.now() + "\n");
        writer.close();
        System.out.println("Attendance marked for " + name);
    }
}
