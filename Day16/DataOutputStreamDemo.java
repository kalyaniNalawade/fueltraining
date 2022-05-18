//DataOutputStream
import java.io.*;
class DataOutputStreamDemo
{
   public static void main(String args[]) throws Exception
   {
      FileOutputStream fout=new FileOutputStream("C:\\JavaCapg\\JavaProgramDay16\\test2.txt");
      DataOutputStream dout=new DataOutputStream(fout);
      dout.writeInt(7575);
      dout.writeDouble(5.7);
      dout.writeBoolean(true);
      dout.close();
      
   }
}