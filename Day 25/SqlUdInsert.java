//package demo.gradle;
import java.util.*;
import java.sql.*;
public class SqlUdInsert {
    public static void main(String[] args) throws Exception {
         Scanner sc =new Scanner (System.in);
         int bn;
         String bnm;
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");

        System.out.println("Connection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        System.out.println("Enter Book Id");
        bn=sc.nextInt();
        System.out.println("Enter Book Name");
        bnm=sc.next();
        sql="insert into Library values("+bn+",'"+bnm+"')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");
        sc.close();
        conn.close();

    }
    
}
