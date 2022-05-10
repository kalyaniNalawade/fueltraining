import java.util.*;
class TestArray
{
public static void main(String arr[])
{
Scanner sc=new Scanner (System.in);
int array[]={1,2,3,4,5,6,7,8,9};
int i,ele;
boolean isfound=false;
System.out.println("Enter element to search");
ele=sc.nextInt();
for(i=0;i<array.length;i++)
{
if(array[i]==ele)
{
isfound=true;
}
}
if(isfound==true)
{
System.out.println("Element found");
}
else
{
System.out.println("Element not Found");
}
}
}
