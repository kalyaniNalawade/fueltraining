import java.util.*;
class ArrayDbl
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int i;
int val[]={13,-4,82,17};
int twice[]=new int[4];
System.out.println("Original array is :");

for(int x:val)
{
System.out.println(x);
}
System.out.println("Twice array is :");
for(i=0;i<val.length;i++)
{
twice[i]=val[i]*2;

}
for(int x:twice)
{
System.out.println(x);
}
}
}
