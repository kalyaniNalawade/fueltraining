/*A library needs to develop an online application for two types of users/roles, Adults and 
children. Both of these users should be able to register an account.*/
import java.util.*;
interface LibraryUser
{
 void registerAccount();
 void requestBook();
}

class KidsUser implements LibraryUser
{
   int age;
   String bt;
   public void registerAccount()
   {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Age for kid: ");
         age=sc.nextInt(); 
    
         if(age<12)
         {
               System.out.println("You have Successfully registered for kids account");
         }
         else
         {
            System.out.println("Sorry age must be less than 12 to register for kids account");
         }
     }
     public void requestBook()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Book type for kids: ");
         bt=sc.next(); 
         String k="kid";
         if(bt.equalsIgnoreCase("kid"))
         {
            System.out.println("Book Issued successfully!! Please return within 10 days");
         }
         else
         {
            System.out.println("Ooops!,You are allowed to take only kids book");

         }
         
     
     }
     
}


class AdultsUser implements LibraryUser
{
   int age;
   String bt;
   public void registerAccount()
   {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Age Adult Account: ");
         age=sc.nextInt(); 
    
         if(age>12)
         {
               System.out.println("You have Successfully registered for adult account");
         }
         else
         {
            System.out.println("Sorry age must be Greater than 12 to register for Adult account");
         }
     }
    public void requestBook()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Book type For Adult book request: ");
         bt=sc.next(); 
         if(bt.equalsIgnoreCase("adult"))
         {
            System.out.println("Book Issued successfully!! Please return within 7 days");

         }
         else
         {
            System.out.println("Ooops!,You are allowed to take only adults book");
         }
         
     
     }
     
}

class LibraryInterface
{
   public static void main(String args[])
   {
      System.out.println("*******************************************");
      KidsUser kd=new KidsUser();
      kd.registerAccount();
      kd.requestBook();
      System.out.println("*******************************************");
      
      System.out.println("*******************************************");
      AdultsUser ad=new AdultsUser();
      ad.registerAccount();
      ad.requestBook();
      System.out.println("*******************************************");

   }
}