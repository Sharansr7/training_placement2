import java.sql.*;

public class LibraryDB {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:library.db");
        Statement st = conn.createStatement();
        st.execute("CREATE TABLE IF NOT EXISTS books(id INTEGER, title TEXT)");
        st.execute("INSERT INTO books VALUES(1, 'Java Fundamentals')");
        ResultSet rs = st.executeQuery("SELECT * FROM books");
        while (rs.next())
            System.out.println(rs.getInt("id") + ": " + rs.getString("title"));
    }
}
