import java.util.Scanner;
class Swap
{
public static void main(String arr[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number : ");
a=sc.nextInt();
System.out.println("Enter Number : ");
b=sc.nextInt();
System.out.println("Numbers before Swapping is: "+a+" "+b);

c=a;
a=b;
b=c;
System.out.println("Numbers after Swapping is: "+a+" "+b);

}
}
