import java.sql.*;

public class DemoSql{
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into Library values(500,'testing')";
        System.out.println("record inserted");

        conn.close();

    }
}
