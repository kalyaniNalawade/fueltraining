//indexOf() and lastIndexOf
//isEmpty
import java.util.*;
public class Demo8
{
   public static void main(String args[])
   {
      ArrayList<String> ar=new ArrayList<>();
      ar.add("A");
      ar.add("B");
      ar.add("C");
      ar.add("D");
      ar.add("E");
      ar.add("A");
      System.out.println(ar.indexOf("A"));
      System.out.println(ar.lastIndexOf("A"));
      System.out.println(ar.lastIndexOf("Hiiiii"));
      String item="X";
      if(ar.contains(item))
      {
         System.out.println("Item Present");
      }
      else
      {
         System.out.println("Item not Present");
      }
      System.out.println(ar.isEmpty());
      ar.clear();
      System.out.println(ar.isEmpty());
   }
}

