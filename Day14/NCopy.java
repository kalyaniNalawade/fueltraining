//Given a string, return a new string made of n copies of the first 2 chars of the original string 
//where n is the length of the string. The string may be any length. If there are fewer than 2 chars, 
//use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".
import java.util.*;
class NCopy
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2;
      char c1,c2;
      System.out.println("Enter String: ");
      s1=sc.next();
      int l=s1.length();
      c1=s1.charAt(0);
      c2=s1.charAt(1);
      s2=c1+""+c2;
      for(int i=0;i<s1.length();i++)
      {
         System.out.print(s2);
      }
      
   }
}
