import java.util.*;

public class TimedExam {
    public static void main(String[] args) {
        Map<String, String> questions = Map.of(
            "Capital of India?", "Delhi",
            "Java is developed by?", "Sun"
        );

        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();

        int score = 0;
        for (Map.Entry<String, String> q : questions.entrySet()) {
            System.out.println(q.getKey());
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase(q.getValue())) score++;
        }

        long timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Score: " + score + "/" + questions.size());
        System.out.println("Time taken: " + timeTaken + " seconds");
    }
}
