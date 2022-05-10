import java.util.Scanner;
class salary
{
public static void main(String arr[])
{
float da,bs,hr,da1,hr1,grspay;
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary of employee : ");
bs=sc.nextFloat();
System.out.println("Enter DA of employee : ");
da1=sc.nextFloat();
System.out.println("Enter hra of employee : ");
hr1=sc.nextFloat();
da=(da1 *bs)/100;
hr=(hr1 *bs)/100;
grspay=bs+da+hr;

System.out.println("salary of employee is: "+grspay);

}
}
