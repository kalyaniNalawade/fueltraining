import java.util.*;
abstract class Instrument
{
   abstract void play();
}

class Piano extends Instrument
{
   void play()
   {
      System.out.println("“Piano is playing tan tan tan tan!!");
   }
}

class Fluet extends Instrument
{
   void play()
   {
      System.out.println("Flute is playing toot toot toot toot!!");
   }
}

class Guitar extends Instrument
{
   void play()
   {
      System.out.println("Guitar is playing tin tin tin!!");
   }
}

class TestInstrument
{
   public static void main(String args[])
   {
      Instrument i[]=new Instrument[10];
      while(true)
      {
         System.out.println("Enter your choice");
         int ch;
         System.out.println("Press 0 : for Piano");
         System.out.println("Press 1 : for Fluet");
         System.out.println("Press 2 : for Guitar");
         System.out.println("Which Instrument do you want to play?: ");
         System.out.println("Piano: "+i[0]);
         Scanner sc=new Scanner(System.in);
         ch=sc.nextInt();
         
         switch(ch)
         {
            case 0:  i[0]=new Piano();
                     i[0].play();
                     break;
                     
            case 1:  i[1]=new Fluet();
                     i[1].play();
                     break;
                     
            case 2:  i[2]=new Guitar();
                     i[2].play();
                     break;
                     
           //case 3: System.out.println("You have Exit");
                    // break;
                     
            default: System.out.println("Invalid input");
                     break;  
         }

      }
         
    }
}


