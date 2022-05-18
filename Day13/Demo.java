import java.util.*;
public class Demo
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      
      int a,b,c;
      System.out.println("Eneter TWo elements: ");
      a=sc.nextInt();
      b=sc.nextInt();
      try
      {
         c=a/b;
         System.out.println("DIvision is "+c); 
      }
      catch(ArithmeticException e)
      {
         System.out.println("Can not Devide by Zero");
      }
      System.out.println("End of program");

      
   }
}