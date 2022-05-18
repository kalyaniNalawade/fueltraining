//Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the 
//string length is odd number then return null
import java.util.*;
class EvenString
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1;
      System.out.println("Enter String: ");
      s1=sc.next();
      if(s1.length()%2==0)
      {
         for(int i=0;i<s1.length()/2;i++)
         {
            System.out.print(s1.charAt(i));
         }
      
      }
      else
      {
         System.out.println("null");
      }
   }
}