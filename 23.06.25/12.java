import java.sql.*;

public class LibraryDB {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:sqlite:library.db");
        Statement s = c.createStatement();
        s.execute("CREATE TABLE IF NOT EXISTS books (id INTEGER, title TEXT)");
        s.execute("INSERT INTO books VALUES (1, 'Java Book')");
        ResultSet rs = s.executeQuery("SELECT * FROM books");
        while (rs.next())
            System.out.println(rs.getInt("id") + ": " + rs.getString("title"));
    }
}
