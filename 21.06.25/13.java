import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("note.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
