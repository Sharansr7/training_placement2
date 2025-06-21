public class WordCounter {
    public static void main(String[] args) {
        String text = "Java is a powerful and popular language";
        String[] words = text.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
    }
}
