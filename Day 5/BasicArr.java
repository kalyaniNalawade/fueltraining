import java.util.*;
class BasicArr
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int i;
int array[]=new int[10];
System.out.println("Enter 10 Elements");
for(i=0;i<=9;i++)
{
array[i]=sc.nextInt();
}
for(int x:array)
{
System.out.println(x);
}
}
}
