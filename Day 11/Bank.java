abstract class GeneralBank
{
   abstract double getSavingInterestRate();
   abstract double getFixedInterestRate();

}

class IciciBank extends GeneralBank
{
   double getSavingInterestRate()
   {
      double s=4;
      return s;
   }
   double getFixedInterestRate()
   {
      double f=8.5;
      return f;
   }

}

class KotBank extends GeneralBank
{
   double getSavingInterestRate()
   {
      double s=6;
      return s;

   }
   double getFixedInterestRate()
   {
       double f=9;
      return f;
   }

}

class Bank
{
   public static void main(String args[])
   {
      GeneralBank g;
      g=new IciciBank();
      System.out.println("Saving Interest of ICICI(From General Reference) : " +g.getSavingInterestRate());
      System.out.println("Fixed Interest of ICICI (From General Reference): " +g.getFixedInterestRate());
      g=new KotBank();
      System.out.println("Saving Interest of Kotak Bank(From General Reference) : " +g.getSavingInterestRate());
      System.out.println("Fixed Interest of Kotak Bank (From General Reference): " +g.getFixedInterestRate()); 
      
      IciciBank c=new IciciBank ();
      System.out.println("Saving Interest of Kotak Bank(From Icici Reference) : " +c.getSavingInterestRate());
      System.out.println("Fixed Interest of Kotak Bank (From Icici Reference): " +c.getFixedInterestRate()); 
      
      KotBank k=new KotBank();
      System.out.println("Saving Interest of Kotak Bank(From Kotak Reference) : " +k.getSavingInterestRate());
      System.out.println("Fixed Interest of Kotak Bank (From Kotak Reference): " +k.getFixedInterestRate()); 
      

           
   }
}