import java.util.*;
class MyException extends Exception
{
   public String toString()
   {
      return"Enter non negative value for ID";
   }
}

class Student
{
   private int id;
   private String name;
   public int getId()
   {
      return id;
   }
   public int setId(int id) throws MyException
   {
         if(id<0)
         {
            MyException ob;
            ob=new MyException();
            throw ob;
         }
         this.id=id;

}      public String getName()
      {
         return name;
      }
      public void setName(String name)
      {
         this.name=name;
      }
}




public class Demo6
   {
      public static void main(String args[])
         {
         try
         {
            Student st=new Student();
            st.setId(100);
            st.setName("Vandu");
            System.out.println(st.getId());
            System.out.println(st.getName());
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
}