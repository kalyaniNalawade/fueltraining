//Given two strings, word and a separator, return a big string made of count occurrences of the 
//word, separated by the separator string. if the inputs are "Wipro","X" and 3 then the output is 
//"WiproXWiproXWipro".

import java.util.*;
class SeprWrd
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2="";
      
      int num;
      System.out.println("Enter String: ");
      s1=sc.next();
      System.out.println("Enter seperator Character: ");
      String c1=sc.next();
      System.out.println("Enter number of times you want to print the String?:");
      num=sc.nextInt();
      for(int i=0;i<num;i++)
      {
         s2+=s1+c1;
      }
      System.out.print(s2);
      
   }
}