import java.util.*;
class Demo7
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int num,sq=0;
      System.out.println("Enter Value to get square");
      try
      {
         num=sc.nextInt();
         sq=num*num;
      }
      catch(InputMismatchException e)
      {
         System.out.println("Entered input is not a valid format for an integer");

      }
      System.out.println("Square is: "+sq);
   }
   
}