import java.util.Scanner;
class Info
{
public static void main(String arr[])
{
int age;
String nm;
Scanner sc=new Scanner(System.in);
System.out.println("Enter name :");
nm=sc.next();
System.out.println("Enter age :");
age=sc.nextInt();
System.out.println("Hello "+nm+"Your age is"+age);
}
}
