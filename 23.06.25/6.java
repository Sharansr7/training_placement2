import java.sql.*;
import java.util.Scanner;

public class LoginSystem {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root", PASS = "";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        System.out.print("Enter username: ");
        String u = sc.nextLine();
        System.out.print("Enter password: ");
        String p = sc.nextLine();

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
        ps.setString(1, u);
        ps.setString(2, p);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) System.out.println("Login successful.");
        else System.out.println("Invalid credentials.");
    }
}
