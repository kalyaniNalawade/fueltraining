import java.sql.*;
import java.util.*;
class AllQueryUD
{
   public static void main(String args[]) throws Exception
   {
     Scanner sc=new Scanner(System.in);
     Class.forName("org.postgresql.Driver");
     Connection conn;
     conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
     
     int ch;
     Statement stmt;
     stmt=conn.createStatement();
     String sql;
     while(true)
     {
           System.out.println("*************************************************************************");
           System.out.println("Which operation Do you want to perform?");
           System.out.println("Press 1- for Insert");
           System.out.println("Press 2- for Delete");
           System.out.println("Press 3- for Update");
           System.out.println("Press 4- for select");
           System.out.println("Press 5- for Exit");
           System.out.println("Please choose your operation");
           ch=sc.nextInt();
           switch(ch)
           {
                 case 1:   System.out.println("Firing INSERT Query");
                           System.out.println("Enter Book Id: ");
                           int bnum=sc.nextInt();
                           System.out.println("Enter Book Name: ");
                           String bname=sc.next();
                           sql="insert into Library values("+bnum+",'"+bname+"')";
                           stmt.executeUpdate(sql);
                            System.out.println("Record INSERTED Successfully");
                            break;
                          
                 case 2:   System.out.println("Firing DELETE Query");
                           System.out.println("Enter Book Number to be deleted ");
                           int bn=sc.nextInt();
                           sql="delete from Library where bnum="+bn+"";
                           stmt.execute(sql);
                           System.out.println("Record DELETED Successfully");
                           break;
                          
                 case 3:   System.out.println("Firing UPADATE query");
                           System.out.println("Enter Book Number to Update book name ");
                           int bn1=sc.nextInt();
                           sql="update Library set bname='History'where bnum="+bn1+"";
                           stmt.executeUpdate(sql);              
                           System.out.println("Record UPDATED Successfully");
                           break;
                           
                 case 4:   System.out.println("Firing SELECT Query");
                           System.out.println("Enter Book ID to select Record");
                           int bn3=sc.nextInt();
                           sql="select bnum,bname from Library where bnum="+bn3+"";
                           ResultSet rs;
                           rs=stmt.executeQuery(sql);
                           String s=rs.toString();
                           String s2=String.valueOf(rs);
                           System.out.println(s);
                           System.out.println(s2);
                           break;
                           
                case 5:    System.out.println("You have Exit from Application");
                            System.exit(0);
                           
                default:   System.out.println("You have Entered Wrong input");
                           break;
           }
           System.out.println("*************************************************************************");
     }
 
   }
}