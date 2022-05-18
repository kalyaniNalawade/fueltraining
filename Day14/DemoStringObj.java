import java.util.*;
class DemoStringObj
{
   public static void main(String args[])
   {
      char c1='a';
      String s1="a";
      //using char array
      char arr[]={'A','B','C','D'};
      String s2=new String(arr);
      System.out.println(s2);

      // Using Byte array
      
      byte b1[]={115,116,117,119};
      String s3=new String(b1);
      System.out.println(s3);
      
      //Using String
      
      String s4=new String(s3);
      System.out.println(s4);
   }
}