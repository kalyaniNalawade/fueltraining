//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
//the second char of a, the second char of b, and so on. Any leftover chars go at the end of the 
//result. If input is “abc” and “xyz”, then output should be “axbycz”.

import java.util.*;
class String2Let
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2,s3="";
      int len;
      System.out.println("enter String 1: ");
      s1=sc.next();
      System.out.println("enter String 2: ");
      s2=sc.next();
      if(s1.length()>=s2.length())
      {
         len=s1.length();
      }
      else
      {
         len=s2.length();
      }
      for(int i=0;i<len;i++)
      {
         if(i<s1.length())
            {
               s3 += s1.substring(i,i+1);

               
            }
            if(i<s2.length())
            {
                s3 += s2.substring(i,i+1);
               
            }

      }
      System.out.println(s3);
 
   }
}