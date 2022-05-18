import java.util.stream.Stream;
public class Demo1
{
   public static void main(String args[])
   {
      System.out.println("Printing Stream: ");
      Stream<Integer> s1=Stream.of(10,20,30,40,50);
      s1.forEach(p->System.out.println(p));
      Integer arr[]={1,2,3,4,5};
      System.out.println("Square of Array: ");
      Stream<Integer>s2=Stream.of(arr);
      s2.forEach(x->System.out.println(x*x));
   }
}