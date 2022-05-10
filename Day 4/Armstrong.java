import java.util.*;
class Armstrong
{
public  static void main(String arr[])
{
int num=0,temp,dig=0,end=0,sum,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
end=sc.nextInt();
for(i=1;i<=end;i++)
{


num=i;
sum=0;
while(num>0)
{
dig=num%10;
sum=sum+(dig*dig*dig);
num=num/10;
}
if(sum==i)
{
System.out.print(sum+" ");
}
}
}
}

