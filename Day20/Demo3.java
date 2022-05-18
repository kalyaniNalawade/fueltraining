class  Test<T>
{
   T i;
   void set(T x)
   {
      i=x;
   }
   
   void show()
   {
      System.out.println(i);
      System.out.println(i.getClass().getName());
   }
}

public class Demo3
{
   public static void main(String args[])
   {

      Test<String> ob1= new Test<>();
      Test<Integer> ob2= new Test<>();
      ob1.set("Hello");
      ob2.set(100);
      
      
      ob1.show();
      ob2.show();

   }
}