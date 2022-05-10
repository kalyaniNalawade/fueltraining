import java.util.*;
class SumArr
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int array[]=new int[100];
int i, num,sum=0;
System.out.println("How many Element want to store?:");
num=sc.nextInt();
System.out.println("Enter "+num+" elements");
for(i=0;i<num;i++)
{
array[i]=sc.nextInt();
}
for(i=0;i<num;i++)
{
sum=sum+array[i];
}
System.out.println("Addition of array is: "+sum);
}
}


