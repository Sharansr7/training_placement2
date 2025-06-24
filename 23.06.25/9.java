import java.util.*;

public class OnlineExam {
    static class Question {
        String q;
        String[] options;
        int answer;

        Question(String q, String[] options, int answer) {
            this.q = q; this.options = options; this.answer = answer;
        }

        boolean ask(Scanner sc) {
            System.out.println(q);
            for (int i = 0; i < options.length; i++)
                System.out.println((i+1) + ". " + options[i]);
            int user = sc.nextInt();
            return user == answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = List.of(
            new Question("Java is ?", new String[]{"OS", "Language", "Game", "App"}, 2),
            new Question("int range?", new String[]{"-128 to 127", "-2^31 to 2^31-1"}, 2)
        );
        int score = 0;
        for (Question q : quiz)
            if (q.ask(sc)) score++;
        System.out.println("Score: " + score + "/" + quiz.size());
    }
}
