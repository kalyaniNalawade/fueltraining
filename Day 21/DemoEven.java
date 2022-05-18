import java.util.*;
public class DemoEven<Integer>

{
   ArrayList<Integer> ar=new ArrayList<>();
   public ArrayList<Integer> saveEvenNumber(int n)
   {
      ArrayList<Integer> A1 =new ArrayList<>();
      for(Integer i:A1)
      {
         if(i%2==0)
         {
            A1.add(classi);
         }
      }
      return A1;
   }
   public ArrayList<Integer> printEvenNumbers()
   {
      ArrayList<Integer>A2=new ArrayList<>();
      for(Integer n:A2)
      {
         int num=n*2;
         A2.add(num);
      }
      for(Integer i:A2)
      {
         System.out.println(i);
      }
      return A2;
   }
     public int printEvenNumber(int n) 
     {
         ArrayList<Integer> A1 =new ArrayList<>();
       if(A1.contains(n))
         {
            System.out.println(n);
         }
       else
         {
            System.out.println(0);
         }
      }
      public static void main(String args[])
   {
      DemoEven<Integer> d1=new DemoEven<>();
      d1.saveEvenNumbers(20);
      d1.printEvenNumbers();
      d1.printEvenNumbers(2);
      
   }

}

   
      
   
   
