import java.util.Scanner;
class Digadd
{
public static void main(String arr[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number : ");
a=sc.nextInt();
b=a%10;
a=a/10;
c=a%10;
d=c+b;

System.out.println("Addition is: "+d);

}
}
