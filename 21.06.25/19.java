public class VowelConsonant {
    public static void main(String[] args) {
        String input = "Programming";
        int vowels = 0, consonants = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
