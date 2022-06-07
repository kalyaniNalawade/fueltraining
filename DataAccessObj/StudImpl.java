package vandudbsql;
import java.sql.*;
public class StudImpl implements StudInterface 
{

    @Override
    public void save(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String bname = st.getName();
        int bnum = st.getId();
        sql = "insert into Library values("+bnum+",'" + bname + "')";
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record inserted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String bname = st.getName();
        int bnum = st.getId();
        sql = "update Library set bname='" + bname + "' where bnum=" + bnum;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }

    @Override
    public void delete(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String bname = st.getName();
        int bnum = st.getId();
        sql = "delete from Library where  bnum="+bnum;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record deleted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Student getStud(int bnum) {
         Student st=null;
      try {

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");

        System.out.println("Coonection done");

        Statement stmt;
        
        stmt = conn.createStatement();
        String sql;
        sql="select * from Library where id="+bnum;
        ResultSet rs;
        rs=stmt.executeQuery(sql);
         while(rs.next()){
             st=new Student();
             st.setId(rs.getInt("bnum"));
             st.setName(rs.getString("bname"));
        // System.out.println(rs.getInt("id"));
        // System.out.println(rs.getString("name"));
         }

        stmt.executeUpdate(sql);
        
        System.out.println("record inserted");

        conn.close();
      } catch (Exception e) {
          //TODO: handle exception
      }

        return st;
    }

}

