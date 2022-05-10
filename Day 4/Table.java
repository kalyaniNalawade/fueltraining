import java.util.*;
class Table
{
public static void main(String arr[])
{
int i=1,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any NUmber to print table:");
num=sc.nextInt();
while(i<=10)
{

System.out.println(i*num);
i=i+1;
}
}
}