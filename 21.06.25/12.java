import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("note.txt");
            writer.write("Java is awesome!");
            writer.close();
            System.out.println("File written.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
