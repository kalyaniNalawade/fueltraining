import java.util.*;
class Prime
{
public static void main(String arr[])
{
int i=2,num;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number :");
num=sc.nextInt();
while(i<num)
{
   if(num%i==0)
   {
      flag=true;
      break;
   }
i=i+1;
}

if(flag==true)
{
System.out.println(" Not Prime");
}
else
{
   System.out.println("Prime");
}
}
}

