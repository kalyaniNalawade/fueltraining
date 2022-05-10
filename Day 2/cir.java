import java.util.Scanner;
class cir
{
public static void main(String arr[])
{
double rad,ar;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius of Circle : ");
rad=sc.nextDouble();
ar=3.14*(rad*rad);
System.out.println("Area of circle is: "+ar);
}
}
