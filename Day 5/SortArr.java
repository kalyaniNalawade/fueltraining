import java.util.*;
class SortArr
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int array[]=new int[100];
int i, num,j,temp;
System.out.println("How many Element want to store?:");
num=sc.nextInt();
System.out.println("Enter "+num+" elements");
for(i=0;i<num;i++)
{
array[i]=sc.nextInt();
}
for(i=0;i<num;i++)
{
for(j=0;j<num;j++)
{
if(array[i]<array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
for(i=0;i<num;i++)
{
System.out.println(array[i]);
}
}
}