import java.util.*;
public class Demo2
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      
      int a,b,c;
      System.out.println("Eneter TWo elements: ");
      try
      {
         a=sc.nextInt();
         b=sc.nextInt();
         c=a/b;
         System.out.println("DIvision is "+c); 
      }
      catch(ArithmeticException e)
      {
         System.out.println("Can not Devide by Zero");
      }
      catch(InputMismatchException e)
      {
         System.out.println("Please Enter Integer values");
      }

      System.out.println("End of program");

      
   }
}