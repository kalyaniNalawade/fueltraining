import java.util.*;
class EchoWord
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
String wrd;
int cnt,i;
System.out.println("Enter Word :");
wrd=sc.next();
cnt=wrd.length();
for(i=1;i<=cnt;i++)
{
System.out.println(wrd);
}
}
}