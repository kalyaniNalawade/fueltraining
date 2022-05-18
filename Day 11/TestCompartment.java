abstract class Compartment
{
   abstract void notice();
}

class FirstClass extends Compartment
{
   void notice()
   {
      System.out.println("This is first class");
   }
} 

class Ladies extends Compartment
{
   void notice()
   {
      System.out.println("This is Ladies class");
   }
} 

class General extends Compartment
{
   void notice()
   {
      System.out.println("This is General class");
   }
} 

class Laguage extends Compartment
{
   void notice()
   {
      System.out.println("This is Laguage class");
   }
}

class TestCopartment
{
   public static void main(String args[])
   {
      Compartment c[] = new Compartment[10];
		double r = Math.random()*5;
		int ch = (int)r;
		System.out.println(ch); 
      
      switch(ch)
      {
         case 0: c[0]=new FirstClass();
                  c[0].notice();
                  break;
                  
         case 1: c[1]=new Ladies();
                 c[1].notice();
                 break;
                 
         case 2: c[2]=new Laguage();
                 c[2].notice();
                 break;
                 
         case 3: c[3]=new General();
                 c[3].notice();
                 break;
         
         default : System.out.println("Invalid Input");
                    break;
       }
    } 
    
}