import java.io.*;
import java.util.*;

public class ToDoApp {
    static final String FILE = "todo.txt";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Task 2. Show Tasks 3. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                FileWriter fw = new FileWriter(FILE, true);
                fw.write(task + "\n");
                fw.close();
            } else if (ch == 2) {
                BufferedReader br = new BufferedReader(new FileReader(FILE));
                String line;
                while ((line = br.readLine()) != null)
                    System.out.println("- " + line);
                br.close();
            } else break;
        }
    }
}
