class EmployeeData
{
   static EmployeeData ed=null;
   static int emp_cnt;
   private EmployeeData()
   {
      emp_cnt=0;
   }
   static synchronized EmployeeData getInstance()
   {
      if(ed==null)
      {
         ed=new EmployeeData();
         System.out.println("Employee Data Created");
      }
      emp_cnt++; 
      System.out.println(emp_cnt+" Employee added successfully");
      return ed;
   }
}

public class SingleTonEmpData
{
   public static void main(String args[])
   {
      EmployeeData e1= EmployeeData.getInstance();
      EmployeeData e2= EmployeeData.getInstance();
      EmployeeData e3= EmployeeData.getInstance();
      EmployeeData e4= EmployeeData.getInstance();
      EmployeeData e5= EmployeeData.getInstance();
   }
}