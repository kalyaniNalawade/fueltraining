
import java.util.*;
abstract class Hotel
{
   abstract void addWorker();
}
class Chef extends Hotel
{
   void addWorker()
   {
      System.out.println("Chef added Successfully");
   }
}
class HouseKeeping extends Hotel
{
   void addWorker()
   {
      System.out.println("HouseKeeping added Successfully");
   }
}

class Manager extends Hotel
{
   void addWorker()
   {
      System.out.println("Manager added Successfully");
   }
}

class Security extends Hotel
{
   void addWorker()
   {
      System.out.println("Security added Successfully");
   }
}

class Waiter extends Hotel
{
   void addWorker()
   {
      System.out.println("Waiter added Successfully");
   }
}

class HotelFactory
{
   static Hotel getWorker(int ch)
   {
      Hotel htl=null;
      if(ch==1)
      {
         htl=new Chef();
      }
      else if(ch==2)
      {
         htl=new Manager();
      }
      else if(ch==3)
      {
         htl=new HouseKeeping();
      }
      else if(ch==4)
      {
         htl=new Security();
      }
      else if(ch==5)
      {
         htl=new Waiter();
      }
      else
      {
         System.out.println("You have enter invalid option");
      }
      return htl;
   }
}

public class DemoFactoryHotel
{
   public static void main(String args[])
   {
      int ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("press 1 - To add chef ");
      System.out.println("press 2 - To add manager  ");
      System.out.println("press 3 - To add HouseKeeping  ");
      System.out.println("press 4- To add Security ");
      System.out.println("press 5- To add Waiter");

      System.out.println("Enter your choice ");
      ch=sc.nextInt();
      Hotel h1=HotelFactory.getWorker(ch);
      h1.addWorker();
   }
}