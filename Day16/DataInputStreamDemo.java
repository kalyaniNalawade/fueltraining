//DataInputStream
import java.io.*;
class DataInputStreamDemo
{
   public static void main(String args[]) throws Exception
   {
      FileInputStream fin=new FileInputStream("C:\\JavaCapg\\JavaProgramDay16\\test2.txt");
      
      DataInputStream din=new DataInputStream(fin);
      int x=din.readInt();
      double y=din.readDouble();
      boolean z=din.readBoolean();
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      
      
   }
}