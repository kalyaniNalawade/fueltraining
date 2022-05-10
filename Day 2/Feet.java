import java.util.Scanner;
class Feet
{
public static void main(String arr[])
{
double ft,inch,mtr;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Distance in Meter : ");
mtr=sc.nextDouble();
ft=mtr/3.28084;
inch=mtr/39.37;
System.out.println("Feet "+ft);
System.out.println("Inch "+inch);

}
}
