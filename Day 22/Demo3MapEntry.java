import java.util.*;
import java.util.Map.Entry;
class Demo3MapEntry
{
   public static void main(String args[])
   {
      HashMap<Integer,String>map1;
      map1=new HashMap<>();
      map1.put(1,"A");
      map1.put(2,"B");
      map1.put(3,"C");
      map1.put(4,"D");
      map1.put(5,"E");
      System.out.println(map1);
      
      Set<Integer> keys;
      keys=map1.keySet();
      System.out.println("Keys....");
      for(Integer k: keys)
      {
         System.out.println(k);
      }
      
      Collection<String> values;
      values=map1.values();
      System.out.println("Values....");
      for (String v: values)
      {
         System.out.println(v);
      }
      
      System.out.println("Items....");
      Set<Entry<Integer,String>> items;
      items=map1.entrySet();
      for(Entry<Integer,String> e1: items)
      {
         System.out.println(e1.getKey()+":"+e1.getValue());
         
      }
   }
   
}
