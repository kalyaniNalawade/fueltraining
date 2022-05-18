//Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee 
//object based on id number
import java.util.*;
class EmployeeArrayList
{
   int id;
   String name,address;
   double sal;
   public EmployeeArrayList(int id,String name,String address,double sal)
   {
      this.id=id;
      this.name=name;
      this.address=address;
      this.sal=sal;
   }
   public int getId()
   {
   return id;
   }
   public String toString()
   {
      return"ID:"+id+"Name: "+name+"Address: "+address+"Salary: "+sal;
   }
}
public class Employee
{
   public static void main(String args[])
   {
      //EmployeeArrayList ep1=new EmployeeArrayList();
      ArrayList<EmployeeArrayList> e1=new ArrayList<>();
      e1.add(new EmployeeArrayList(1,"A","XYZ",2000.99));
      e1.add(new EmployeeArrayList(2,"AB","BXYZA",5900.99));
      e1.add(new EmployeeArrayList(3,"ABC","CXYZA",7000.99));
      e1.add(new EmployeeArrayList(4,"ABCD","DXYZA",9900.99));
      e1.add(new EmployeeArrayList(5,"ABCDE","EXYZA",7600.99));
      
      Iterator<EmployeeArrayList> it=e1.iterator();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Id to search Employee");
      int sid=sc.nextInt();
      boolean flag=false;
      while(it.hasNext())
      {
         flag=true;
         EmployeeArrayList emp=it.next();
         if(emp.getId()==sid)
         {
            
            System.out.println(emp);
            break;
         }
         else
         {
            flag=false;
         }
         
      }
      if(flag==false)
         {
            System.out.println("No such Employee found");
         }

   }
}