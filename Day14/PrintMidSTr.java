//Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string 
//length will be at least 2.
import java.util.*;
class PrintMidSTr
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1;
      System.out.println("Enter String: ");
      s1=sc.next();
      for(int i=1;i<s1.length()-1;i++)
      {
         System.out.print(s1.charAt(i));
      } 
   }
}