import java.io.FileInputStream;
class DemoTryCatch
{
   static void div()
   {
      try
      {
         int a;
         a=10/0;
      }
      catch(ArithmeticException e)
      {
         System.out.println("Can not Devideby Zero");
      }
      finally
      {
         System.out.println("Always Executes");
      } 
   }
  static void div2()
   {
      try
      {
         int a;
         a=10/2;
         System.out.println(a);
      }
      catch(ArithmeticException e)
      {
         System.out.println("Can not Devideby Zero");
      }
      finally
      {
         System.out.println("Always Executes");
      } 
   }

static void div3()
   {
      try
      {
         return;   
      }
      catch(ArithmeticException e)
      {
         System.out.println("Can not Devideby Zero");
      }
      finally
      {
         System.out.println("Always Executes");
      } 
   }
      public static void main(String args[])
      {
         //div();
         //div2();
         div3();
         
      }
}