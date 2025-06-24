import java.io.*;

public class PortfolioData {
    public static void main(String[] args) throws IOException {
        String name = "Sharan";
        String skills = "Java, Python, Web";
        String about = "Full Stack Developer";

        FileWriter fw = new FileWriter("portfolio.txt");
        fw.write("Name: " + name + "\n");
        fw.write("Skills: " + skills + "\n");
        fw.write("About: " + about + "\n");
        fw.close();
        System.out.println("Portfolio saved.");
    }
}
