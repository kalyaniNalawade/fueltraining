//Factory Pattern

abstract class Account 
{
   abstract void calculateInterest();
}
class Saving extends Account
{
   void calculateInterest()
   {
      System.out.println("Calculate Interest of Saving ");
   }
}

class Loan extends Account
{
   void calculateInterest()
   {
      System.out.println("Calculate interest of Loan");
   }  
}

class AccountFactory
{
   static Account getAccount(String type)
   {
      Account obj=null;
      if(type.equalsIgnoreCase("Saving"))
      {
         obj=new Saving();
         
      }
      else if(type.equalsIgnoreCase("Loan"))
      {
         obj=new Loan();
      }
      return obj;
   }
}

public class Demo2
{
   public static void main(String args[])
   {
      Account ob1=AccountFactory.getAccount("Loan");
      Account ob2=AccountFactory.getAccount("Saving");
      ob1.calculateInterest();
      ob2.calculateInterest();
   }
}