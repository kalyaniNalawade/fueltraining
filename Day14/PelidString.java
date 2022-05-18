//Write a Program that will check whether a given String is Palindrome or not
import java.util.*;
class PelidString
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner (System.in);
      String s1,s2="";
      System.out.println("Enter String: ");
      s1=sc.next();
      char ch;
      int i;
      for (i=0;i<s1.length();i++)
      {
         ch=s1.charAt(i);
         s2=ch+s2;
      }
      System.out.println("Reverse String is: "+s2);
      if(s2.equals(s1))
      {
         System.out.println("String is pelindrome!!!! ");
      }
      else
      {
         System.out.println("String is not pelindrome!!!! ");

      }
   }
   
}