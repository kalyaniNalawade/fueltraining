//Prototype Pattern
import java.util.ArrayList;
class Email implements Cloneable
{
   ArrayList<String> ar;
   Email()
   {
      ar=new ArrayList<>();
   }
   Email(ArrayList<String> t)
   {
      ar=t;
   }
   void sentMail()
   {
      ar.add("Mail sent to ABC");
      ar.add("Mail sent to DEF");
      ar.add("Mail sent to GHI");
      ar.add("Mail sent to JKL");
      ar.add("Mail sent to MNO");
   }
   void show()
   {
      
      for(String s:ar)
      {
         System.out.println(s);
      }
       
   } 
   protected Object clone() throws CloneNotSupportedException
   {
      ArrayList<String> ar2;
      ar2=new ArrayList<>();
      for(String s:ar)
      {
         ar2.add(s);
      }
      Email obj=new Email(ar2);
      return obj;
   } 
}

public class Demo3Prototype
{
   public static void main(String args[]) throws Exception 
   {
      Email e1=new Email();
      e1.sentMail();
      e1.show();
      Email e2=(Email)e1.clone();  
      e2.show();
      e2.ar.remove("c");
      System.out.println("Sent mails Copied in folder1");
      e1.show();
      System.out.println("Sent mails Copied folder2");
      e2.show();

   }  
   
}