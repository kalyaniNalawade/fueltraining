//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and 
//otherwise return the string unchanged. If the input is "xHix", then output is "Hi".

import java.util.*;
class FrstXlstX
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1;
      System.out.println("enter String : ");
      s1=sc.next();
      if(s1.charAt(0)=='x' && s1.charAt(s1.length()-1)=='x')
      {
         for(int i=1;i<s1.length()-1;i++)
         {
            System.out.print(s1.charAt(i));
         }
      }
      else
      {
         System.out.println(s1);
      }
   }
}