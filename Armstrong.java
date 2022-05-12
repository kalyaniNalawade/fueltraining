import java.util.*;
class Armstrong 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=100,arm;
System.out.println("Armstrong numbers between 100 to 1000 are");
while(i<1000)
{
arm=armstrongOrNot(i);
if(arm==i)
System.out.println(i);
i++;
}
}
static int armstrongOrNot(int num)
{
int x,a=0;
while(num!=0) 
{
x=num% 10;
a= a+(x*x*x);
num/=10;
}
return a;
}
}


