import java.util.*;
class SumFrtLst
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int first=0,lst,sum=0,i,num,dig;
System.out.println("Enter any number: ");
num=sc.nextInt();
lst=num%10;
while(num>0)
{
first=num%10;
num=num/10;
}
sum=first+lst;
System.out.println("Addition is: "+sum);
}
}
