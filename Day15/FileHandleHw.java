import java.io.*;
public class FileHandleHw {
    public static void main(String[] args)throws Exception 
    {
       
        FileInputStream fin;
        fin=new FileInputStream("C:\\JavaCapg\\JavaProgramDay15\\test1.txt");
        StringBuffer sb;
        sb=new StringBuffer();
        int x,countwrd=1;
        System.out.println(fin.available());
       do{
            x=fin.read();
            if(x!=-1)
            {
                System.out.print((char)x);
            }
            if(x==32)
            {
               countwrd++;
            }
         }
        while(x!=-1);
        fin.close();
        System.out.println();
        System.out.println(countwrd);
   }
}