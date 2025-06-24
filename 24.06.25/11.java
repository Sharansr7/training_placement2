CREATE TABLE bank (acc INT PRIMARY KEY, name VARCHAR(30), balance DOUBLE);
import java.sql.*;

public class BankingJDBC {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        Statement s = c.createStatement();
        s.execute("INSERT INTO bank VALUES (101, 'Sharan', 5000)");
        ResultSet rs = s.executeQuery("SELECT * FROM bank");
        while (rs.next())
            System.out.println(rs.getInt("acc") + ": ₹" + rs.getDouble("balance"));
    }
}
