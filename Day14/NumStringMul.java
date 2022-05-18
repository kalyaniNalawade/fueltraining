//Given a string and an int n, return a string made of n repetitions of the last n characters of the 
//string. You may assume that n is between 0 and the length of the string, inclusive. For example if 
//the inputs are “Wipro” and 3, then the output should be “propropro”.
import java.util.*;
class NumStringMul
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2;
      int num;
      System.out.println("ENter String:");
      s1=sc.next();
      System.out.println("Enter digit from which you want to repeat String");
      num=sc.nextInt();
      s2=s1.substring(s1.length()-num);
      String nw="";
      for(int i=0;i<num;i++)
      {
         nw+=s2;
      }
      System.out.println(nw);
      
   }
}