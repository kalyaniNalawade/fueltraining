import java.util.*;
class Dot30
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
String wrd1,wrd2,dots;
int cnt,i,out,res,res1,res2;
System.out.println("Enter 1st Word  :");
wrd1=sc.next();
System.out.println("Enter 2nd Word  :");
wrd2=sc.next();
res1=wrd1.length();
res2=wrd2.length();
res=res1+res2;
if(res<=30)
{
out=30-res;
dots="";
for(i=1;i<=out;i++)
{
dots+=".";
}
System.out.println(wrd1+dots+wrd2);

}
}
}
