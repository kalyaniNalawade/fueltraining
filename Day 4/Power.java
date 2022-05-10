/*import java.util.*;
class Power
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int bs,exp,res;
System.out.println("Enter value of base");
bs=sc.nextInt();
System.out.println("Enter value of exponent");
exp=sc.nextInt();
res=1;
while(exp!=0)
{
res=res*bs;
--exp;
}
System.out.println("Power is "+res);
}
}*/

import java.util.*;
class Power
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int bs,exp,res=1,i;
System.out.println("Enter value of base: ");
bs=sc.nextInt();
System.out.println("Enter value of Exponent: ");
exp=sc.nextInt();
for(i=1;i<=exp;i++)
{
res=res*bs;
}
System.out.println("Power is: "+res);
}
}


