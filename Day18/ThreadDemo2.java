class Test implements Runnable 
{
   Thread t;
   Test(String n)
   {
      t=new Thread(this);
      t.setName(n);
      t.start();
   }
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Child Thread"+i);
            Thread.sleep(500);
         }
      }
      catch(Exception e)
      {
         
      }
   }
}

public class ThreadDemo2
{
   public static void main(String args[])
   {
      Test t1=new Test("A");
      Test t2=new Test("B");
      Test t3=new Test("C");
   
   try
   {
      for(int i=0;i<5;i++)
      {
         System.out.println("Thread main: "+i);
         Thread.sleep(500);
      }
   
   }
   catch(Exception e)
   {
   
   }
}
}