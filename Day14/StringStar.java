//Return a version of the given string, where for every star () in the string the star and the chars 
//immediately to its left and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
import java.util.*;
class StringStar
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1;
      System.out.println("Enter String : ");
      s1=sc.next();
      StringBuffer sb=new StringBuffer(s1);
       int c1,c2;
      c1=s1.indexOf('*');
      c1=c1-1;
      c2=s1.indexOf('*',c1+1);
      c2=c2+3;
      sb.delete(c1,c2);
      
      
      //s1.removeCharAt(c1);
      System.out.println(sb);
   
   }
}