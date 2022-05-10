import java.util.*;
class ValidTria
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
double a1,a2,a3,sum;
System.out.println("Enter Three angles of Triangle: ");
a1=sc.nextDouble();
a2=sc.nextDouble();
a3=sc.nextDouble();
sum=a1+a2+a3;
if(sum==180)
{
System.out.println("Triangle is Valid");
}
else
{
System.out.println("Triangle is Invalid");
}
}
}