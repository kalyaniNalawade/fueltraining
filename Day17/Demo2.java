//RandomAccessFile
import java.io.*;
public class Demo2
{
   public static void main(String args[])throws Exception 
   {
      RandomAccessFile ob=new RandomAccessFile("C:\\JavaCapg\\JavaProgramDay17\\test1.txt","rw");
      ob.seek(5);
      //ob.seek(0);
      int x;
      do
      {
         x=ob.read();
         if(x!=-1)
         {
            System.out.print((char)x);
         }
      
      }
      while(x!=-1);
      ob.close();
      System.out.println(); 
   }
}