class ThreadTest implements Runnable
{
   Thread t;
   ThreadTest()
   {
      t=new Thread(this);
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
      //TODO: Handle Exception
      }
   
   }
}

public class  ThreadDemo
{
   public static void main(String args[])
   {
      ThreadDemo t1=new ThreadDemo();
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Main thread : "+i);
            Thread.sleep(1000);
         }
      }
      catch(InterruptedException e)
      {
         
      }
   }
}