import java.util.Scanner;
class Temp
{
public static void main(String arr[])
{
double cel,fer;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Tempreture in fehrenheit : ");
fer=sc.nextDouble();
cel=(fer-32.0)*5.0/9.0;
System.out.println("Tempreture Converted into celsius: "+cel);
}
}
