import java.io.*;
import java.util.*;

public class PersistentVoting {
    static final String FILE = "votes.txt";
    static List<String> candidates = Arrays.asList("Alice", "Bob", "Charlie");

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vote for:");
        for (int i = 0; i < candidates.size(); i++)
            System.out.println((i + 1) + ". " + candidates.get(i));

        System.out.print("Enter your vote: ");
        int choice = sc.nextInt();
        if (choice >= 1 && choice <= candidates.size()) {
            FileWriter fw = new FileWriter(FILE, true);
            fw.write(candidates.get(choice - 1) + "\n");
            fw.close();
            System.out.println("Vote recorded.");
        }

        System.out.println("\n--- Tally ---");
        Map<String, Integer> count = new HashMap<>();
        for (String c : candidates) count.put(c, 0);

        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String line;
        while ((line = br.readLine()) != null)
            count.put(line, count.get(line) + 1);
        br.close();

        count.forEach((k, v) -> System.out.println(k + ": " + v + " votes"));
    }
}
