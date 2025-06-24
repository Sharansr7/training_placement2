import java.io.*;
import java.util.Scanner;

public class FileEncryptor {
    static final int KEY = 123;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to encrypt/decrypt: ");
        String filename = sc.nextLine();

        FileInputStream in = new FileInputStream(filename);
        byte[] data = in.readAllBytes();
        in.close();

        for (int i = 0; i < data.length; i++)
            data[i] ^= KEY;

        FileOutputStream out = new FileOutputStream("output_" + filename);
        out.write(data);
        out.close();

        System.out.println("File processed as: output_" + filename);
    }
}
