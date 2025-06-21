import java.util.*;

public class DuplicateChars {
    public static void main(String[] args) {
        String input = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.add(c)) duplicates.add(c);
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
