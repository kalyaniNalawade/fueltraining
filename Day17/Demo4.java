import java.io.*;
public class Demo4
{
   public static void main(String args[]) throws Exception 
   {
      File f1=new File("C:\\JavaCapg\\JavaProgramDay17");
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
               System.out.println("File:"+f3.getName());
            }
            else if(f3.isDirectory())
            {
               System.out.println("Dir:"+f3.getName());
            }
         
         //File f4=new File("");
         //f4.mkdirs();
         }
   }
   
   
}