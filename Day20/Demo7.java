//remove
//sublist
import java.util.*;
public class Demo7
{
   public static void main(String args[])
   {
      ArrayList<String> ar=new ArrayList<>();
      ar.add("A");
      ar.add("B");
      ar.add("C");
      ar.add("D");
      ar.add("E");
      ar.add("F");
      ar.add("G");
      ar.add("H");
      ar.add("I");
      ar.add("j");
      System.out.println(ar);
      ar.remove("E");
      ar.remove(3);
      System.out.println(ar);
   }
}