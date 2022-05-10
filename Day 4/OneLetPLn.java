import java.util.*;
class OneLetPLn
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
String s1;
int len,i;
System.out.println("Enter Any word:");
s1=sc.next();
len=s1.length();
for(i=0;i<=len;i++)
{
System.out.println(s1.charAt(i));
}
}
}