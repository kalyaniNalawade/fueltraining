import java.util.*;
public class Demo3
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
      catch(InputMismatchException | ArithmeticException e)
      {
      if(e instanceof InputMismatchException)
      {
          System.out.println("Please Enter Integer values");

      }
      else if(e instanceof ArithmeticException)
      {
         System.out.println("Can not Devide by Zero");
      }
   }
      
      System.out.println("End of program");

      
   }
}