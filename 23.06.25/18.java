import java.util.*;

class Course {
    String title;
    int capacity;
    List<String> students = new ArrayList<>();

    Course(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
    }

    void register(String student) {
        if (students.size() < capacity) {
            students.add(student);
            System.out.println(student + " registered for " + title);
        } else {
            System.out.println("Course full.");
        }
    }
}

public class CourseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course javaCourse = new Course("Java", 2);

        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();
        javaCourse.register(name1);

        System.out.print("Enter another student name: ");
        String name2 = sc.nextLine();
        javaCourse.register(name2);

        System.out.print("Try adding third student: ");
        String name3 = sc.nextLine();
        javaCourse.register(name3); // Should fail
    }
}
