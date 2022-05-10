import java.util.*;
class ArrayRev
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int i;
int val1[]={0,1,2,3};
System.out.println("Original Array");
for(i=0;i<val1.length;i++)
{
System.out.println(i);
}
System.out.println("Reversed  Array");
int end=val1.length-1;
int str=0;
while(str<end)
{
int temp=val1[str];
val1[str]=val1[end];
val1[end]=temp;
str++;
end--;
}
for(int x:val1)
{
System.out.println(x);
}
}
}
