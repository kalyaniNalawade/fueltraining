class Customer{
private String fname;
private String lname;
void setFname(String fname){
   this.fname = fname;
   }
   String getFname(){
   return this.fname;
   }
   void setLname(String lname){
   this.lname = lname;
   }
   String getLname(){
   return this.lname;
   }
   }
   class Account{
   int balance;
   Customer cust;
   void showAccount(){
   System.out.println("******************");
   System.out.println("Fname:"+cust.getFname());
   System.out.println("Lname:"+cust.getLname());
   System.out.println("Balance:"+balance);
   System.out.println("******************");
  }
  
  Account(Customer c, int balance){
  this.cust=c;
  this.balance=balance;
  }
 }
 
 public class Demoassignment3{
 public static void main (String[]args){
 Customer ob1=new Customer();
 ob1.setFname("abc");
 ob1.setLname("xyz");
 int x=1000;
 Account acc1=new Account(ob1,x);
 Account acc2=new Account(ob1,2000);
 acc1.showAccount();
 acc2.showAccount();
 }
}