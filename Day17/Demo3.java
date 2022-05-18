//FileReader
import java.io.*;
class Demo3
{
   public static void main(String args[]) throws Exception
   {
      FileReader fin=new FileReader("C:\\JavaCapg\\JavaProgramDay17\\test1.txt "); 
      BufferedReader bin=new BufferedReader(fin);
      String s1="";
      while((s1=bin.readLine())!=null)
      {
         System.out.println(s1);
      }
      bin.close();
   }
   
}