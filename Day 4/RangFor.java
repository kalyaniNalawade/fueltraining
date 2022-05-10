import java.util.*;
class RangFor
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int st,ed,i;
System.out.println("Enter Start:");
st=sc.nextInt();
System.out.println("Enter End:");
ed=sc.nextInt();

for(i=st;i<=ed;i=i+1)
{
System.out.println(i);
}
}
}