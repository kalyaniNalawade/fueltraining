//Given two strings, append them together (known as "concatenation") and return the result. 
//However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are 
//“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
import java.util.*;
class StrApd
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2,s3;
      char c1,c2;
      int l1;
      System.out.println("Enter String 1: ");
      s1=sc.next();
      l1=s1.length()-1;
      c1=s1.charAt(l1);
 
      System.out.println("Enter String 2: ");
      s2=sc.next();
      c2=s2.charAt(0);
      if(c1==c2)
      {
         s3=s1+s2.substring(1,s2.length());
         System.out.println("Same char omit & Concated: "+s3.toLowerCase());        

      }
      
      s3=s1+s2;
      System.out.println("Without omit Concat: "+s3);
      
   }

}