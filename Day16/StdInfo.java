//ObjectOutputStream
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;

class Student implements Serializable
{
     
   private int id;
   private String name;
   public void setId(int id)
   {
      this.id=id;
   }
   public int getId()
   {
      return id;
   }

   public void setName(String name)
   {
      this.name=name;
   }
   public String getName()
   {
      return name;
   }
}

class StdInfo
{
   public static void main(String args[]) throws Exception
   {
      Student st=new Student();
      st.setId(575);
      st.setName("ABC");
      
      FileOutputStream fout=new FileOutputStream("C:\\JavaCapg\\JavaProgramDay16\\test3.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fout);
      oos.writeObject(st);
      oos.close();
   }


}