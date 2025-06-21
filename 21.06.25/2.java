import java.util.*;

class Student {
    String name;
    int roll;
    String course;

    Student(String name, int roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Course: " + course);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student\n2. View All\n3. Search by Roll\n4. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter roll: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter course: ");
                    sc.nextLine();
                    String course = sc.nextLine();
                    list.add(new Student(name, roll, course));
                }
                case 2 -> list.forEach(Student::display);
                case 3 -> {
                    System.out.print("Enter roll to search: ");
                    int r = sc.nextInt();
                    list.stream()
                        .filter(s -> s.roll == r)
                        .findFirst()
                        .ifPresentOrElse(
                            Student::display,
                            () -> System.out.println("Student not found")
                        );
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
        }
    }
}
