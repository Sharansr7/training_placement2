import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Enter task: ");
                    sc.nextLine();
                    tasks.add(sc.nextLine());
                }
                case 2 -> tasks.forEach(System.out::println);
                case 3 -> {
                    System.out.print("Enter task number to remove: ");
                    int i = sc.nextInt();
                    if (i >= 0 && i < tasks.size()) tasks.remove(i);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
