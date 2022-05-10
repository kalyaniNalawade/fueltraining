import java.util.*;
class ArraySum
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int val[]={0,1,2,3};
int i,sum=0;
//for(int x:val)
for(i=0;i<val.length;i++)
{
sum=sum+i;
}
System.out.println("Sum of Of all elements in array is:"+sum);
}
}
