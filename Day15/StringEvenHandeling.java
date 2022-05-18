import java.util.*;
import java.io.*;
class StringEvenHandeling
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1;
      int pos=0;
      byte n1;
      System.out.println("Enter digits:");
      s1=sc.next();
      byte b1[]=s1.getBytes();
      for(int i=0;i<b1.length;i++)
      {
         if(b1[i]%2==0)
         {
            b1[i]=n1;
            int in=s1.indexOf(n1);
            int nin=in*pos;
            s1.append(nin,n1);
         }
      }

                  
   }
}
