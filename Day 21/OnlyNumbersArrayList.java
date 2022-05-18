//Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any 
//other data type.
import java.util.*;
class OnlyNumbersArrayList<T extends Number>
{
   public static void printAll(ArrayList<Integer> i1)
   {
      Iterator<Integer> it=i1.iterator();
      while(it.hasNext())
      {
         System.out.println(it.next());
      }
   }
   public static void main(String args[])
   {
      ArrayList<Integer> i1=new ArrayList<>();
      i1.add(10);
      i1.add(20);
      i1.add(30);
      i1.add(40);
      i1.add(50);
      i1.add("A");
      printAll(i1);
   }
}





