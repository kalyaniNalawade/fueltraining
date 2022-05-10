import java.util.*;
class RevArr
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int i,num,temp=0;
int array[]=new int[10];
System.out.println("How many Numbers Do you want in array?");
num=sc.nextInt();
System.out.println("Enter Number in Array");
for(i=0;i<num;i++)
{
array[i]=sc.nextInt();
}
System.out.println(" Array Elements");

for(i=0;i<num;i++)
{
System.out.println(i+" : "+array[i]);
}

System.out.println(" Reversed array");
int str=0;
int end=num-1;
while(str<end)
{
temp=array[str];
array[str]=array[end];
array[end]=temp;
end--;
str++;
}
for(i=0;i<num;i++)
{
System.out.println(i+" : "+array[i]);
}
}
}



