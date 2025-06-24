import java.util.*;

public class TypingTest {
    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog.";
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the following:");
        System.out.println(test);
        long start = System.currentTimeMillis();
        String typed = sc.nextLine();
        long end = System.currentTimeMillis();

        int words = typed.split(" ").length;
        double seconds = (end - start) / 1000.0;
        System.out.println("WPM: " + (words / (seconds / 60)));
    }
}
