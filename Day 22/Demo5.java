interface A<T>
{
   T add(T x,T Y);
}
public class Demo5
{
   public static void main(String args[])
   {
      A<Integer>ob=(x,y)->x+y;
      System.out.println(ob.add(100,400));
   }
}