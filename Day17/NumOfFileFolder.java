import java.io.*;
import java.util.*;
public class NumOfFileFolder
{
   public static void main(String args[]) throws Exception 
   {
      String inp;
      int file_count=0,folder_count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Folder Path");
      inp=sc.next();
      File f1=new File(inp);
      /*String arr[];
      arr=f1.list();
      for (Stringfname:arr)
         {
         System.out.println(fname);
         }*/
         File[] arr1;
         arr1=f1.listFiles();
         for(File f3:arr1)
         {
            if(f3.isFile())
            {
              file_count++;
            }
            else if(f3.isDirectory())
            {
              folder_count++;
            }
         
         //File f4=new File("");
         //f4.mkdirs();
         }
         System.out.println(file_count);
         System.out.println(folder_count);
   }
   
   
}