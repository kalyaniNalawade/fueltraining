public class Demo2
{
   public static void main(String args[])
   {
      //boxing
      int a=107;
      Integer ob=new Integer(a);
      //unboxing
      int b;
      b=ob.intValue();
      System.out.println(b);
      System.out.println(ob);
      
      //Auto Boxing
      int p=77;
      Integer ob2=p;
      System.out.println(p);
      System.out.println(ob2);
      
      //Auto Unboxing
      int q;
      q=ob2;
   }
}
      
      