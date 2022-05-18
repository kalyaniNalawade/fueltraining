//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
//the outside and the longer string on the inside. The strings will not be the same length, but they 
//may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".

import java.util.*;
class ShrtLngShrt
{
   public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         String s1,s2;
         System.out.println("Enter String 1: ");
         s1=sc.next();
         System.out.println("Enter String 2: ");
         s2=sc.next();
         int l1,l2;
         l1=s1.length();
         l2=s2.length();
         if(l1<l2)
         {
            System.out.println(s1+s2+s1);
         }
         if(l1>l2)
         {
            System.out.println(s2+s1+s2);
         }
      }

}