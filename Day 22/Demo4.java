
interface A
{
   void add(int x,int y);
}

class Test implements A
{
   public void add(int x,int y)
   {
      System.out.println(x+y);
   }
}

public class Demo4
{
   public static void main(String args[])
   {
      Test t1=new Test();
      t1.add(100,400);
      
      A ob1=new A()
      {
         public void add(int x,int y)
         {
            System.out.println(x+y);
         }
      };
      ob1.add(250,250);
   }
}