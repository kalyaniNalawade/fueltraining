//Create an ArrayList which will be able to store only Strings. Create a printAll method which will print 
//all the elements using an Iterator.
import java.util.*;
class ArrayDemoString
{
    

   public static void printAll(ArrayList<String> s1)
   {
      
      Iterator<String> it;
      it=s1.iterator();
      while(it.hasNext())
      {
         System.out.println(it.next());
      }

   }
   public static void main(String args[])
   {
      ArrayList<String> s1=new ArrayList<>();
      s1.add("A");
      s1.add("B");
      s1.add("C");
      s1.add("D");
      s1.add("E");
      //s1.add(9);
      printAll(s1);
   }
}