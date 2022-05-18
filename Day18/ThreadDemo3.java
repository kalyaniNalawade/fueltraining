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
            System.out.println("Child Thread : "+i);
            Thread.sleep(500);
         }
      }
      catch(Exception e)
      {
         
      }  
   }
}

public class ThreadDemo3
{
   public static void main(String args[])
   {
      Test t1=new Test("A");
      Test t2=new Test("B");
      Test t3=new Test("C");
      System.out.println("Child Thread A:"+t1.t.isAlive());
      System.out.println("Child Thread B:"+t2.t.isAlive());
      System.out.println("Child Thread B:"+t3.t.isAlive());
      try
      {
         t1.t.join();
         t2.t.join();
         t3.t.join();
      }
      catch(Exception e)
      {
      
      }
      System.out.println("Child Thread A:"+t1.t.isAlive());
      System.out.println("Child Thread B:"+t2.t.isAlive());
      System.out.println("Child Thread B:"+t3.t.isAlive());

   }
}