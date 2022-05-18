//Write a Program with a division method who receives two integer numbers and performs the division 
//operation. The method should declare that it throws ArithmeticException. This exception should be 
//handled in the main method.

import java.util.*;
public class Demo9
{
   static int div(int x,int y)
   {
      int z=0;
      try
      {
         z=x/y;
      }
      catch(ArithmeticException e)
      {
         throw e;
      }
      return z;
   }
   public static void main(String args[])
{
   
   Scanner sc=new Scanner(System.in);
   int a,b,c;
   System.out.println("enter two num: ");
   a=sc.nextInt();
   b=sc.nextInt();
   try
   {
      c=div(a,b);
      System.out.println("Division is: "+a);
   }
   catch(Exception e)
   {
      System.out.println("Recaught in main()");
   }
}
}