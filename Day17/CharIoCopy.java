//1. WAP to copy the content of one file to another 
	//by using CHAR IO classes.
   
import java.io.*;
import java.util.*;
class CharIoCopy
{
   public static void main(String args[])throws Exception
   {
      FileReader fin=new FileReader("C:\\JavaCapg\\JavaProgramDay17\\test1.txt "); 
      BufferedReader bin=new BufferedReader(fin);
      FileWriter fout=new FileWriter("C:\\JavaCapg\\JavaProgramDay17\\test3.txt ");
      BufferedWriter bout=new BufferedWriter(fout);
      int x;
    
      do
      {
         x=fin.read();
         if(x!=-1)
         {
            fout.write(x);
         }
      }
      while(x!=-1);
      fin.close();
      fout.close();
      System.out.println("File Copied");

      
   }
}