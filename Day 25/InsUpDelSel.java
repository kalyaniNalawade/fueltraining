
import java.util.*;



import java.sql.*;
public class InsUpDelSel {
    public static void main(String args[]) throws Exception
    {
        Class.forName("org.postgresql.Driver");
        
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
        Scanner sc=new Scanner(System.in);
        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        String sql1;
        String sql2;
        
        System.out.println("Firing Insert Query");
        System.out.println("Enter Book Id");
        int bn=sc.nextInt();
        System.out.println("Enter Book Name");
        String bnm=sc.next();
        sql="insert into Library values("+bn+",'"+bnm+"')";
        stmt.executeUpdate(sql);

        System.out.println("Firing Update Query");
        System.out.println("Enter Book Number");
        int bn1=sc.nextInt();
        sql1="update Library set bname='History'where bnum="+bn1+"";
        stmt.executeUpdate(sql1);
        
        System.out.println("Firing Delete Query");
        System.out.println("Enter Book Number to be deleted ");
        int bn2=sc.nextInt();
        sql2="delete from Library where bnum="+bn2+"";
        stmt.execute(sql2);
        System.out.println("End of Queries!!!!!");
        conn.close();
        sc.close();
    }

    
}
