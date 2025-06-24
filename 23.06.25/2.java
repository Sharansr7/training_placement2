import java.io.*;
import java.util.*;

class Student {
    String name;
    int roll;
    int[] marks = new int[5];

    public Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public double average() {
        return Arrays.stream(marks).average().orElse(0.0);
    }

    public String grade() {
        double avg = average();
        return avg >= 90 ? "A" : avg >= 75 ? "B" : avg >= 60 ? "C" : "D";
    }

    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Grade: " + grade();
    }

    public String toCSV() {
        return roll + "," + name + "," + average() + "," + grade();
    }
}

public class ReportCard {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            int[] marks = new int[5];
            System.out.print("Enter marks (5 subjects): ");
            for (int j = 0; j < 5; j++) marks[j] = sc.nextInt();
            sc.nextLine();
            list.add(new Student(name, roll, marks));
        }

        FileWriter writer = new FileWriter("report.csv");
        writer.write("Roll,Name,Average,Grade\n");
        for (Student s : list) {
            System.out.println(s);
            writer.write(s.toCSV() + "\n");
        }
        writer.close();
        System.out.println("Report saved to report.csv");
    }
}
