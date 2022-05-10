import java.util.*;
class CmdArg
{
public static void main(String arg[])
{
int a,b,c;
if(arg.length==2)
{
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=a+b;
System.out.println("Addition is "+c);
}
else
{
System.out.println("Enter two Arg");
}
}
}