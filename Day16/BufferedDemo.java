//Bufferd IO
import java.io.*;
public class BufferedDemo
{
   public static void main(String args[]) throws Exception 
   {
      FileInputStream fin=new FileInputStream("C:\\JavaCapg\\JavaProgramDay16\\test1.txt");
      BufferedInputStream bin=new BufferedInputStream(fin);
      FileOutputStream fout=new FileOutputStream("C:\\JavaCapg\\JavaProgramDay16\\test.txt");
      BufferedOutputStream bout=new BufferedOutputStream (fout);
      int x;
      System.out.println(fin.available());
      do
      {
         x=bin.read();
         if(x!=-1)
         {
            bout.write(x);
         }
      }
      while(x!=-1);
      bin.close();
      bout.close();
      System.out.println("File Copied");
      
   }
}