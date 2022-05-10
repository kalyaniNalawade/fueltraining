import java.util.*;
class StdMarks
{
int s1,s2,s3,avg,ttl;
String snm;
void setMarks(String nm, int a1,int a2,int a3)
{
s1=a1;
s2=a2;
s3=a3;
snm=nm;
}

void calAvg()
{
ttl=s1+s2+s3;
avg=ttl/3;
}
void showInfo()
{
System.out.println("Name of Student is: "+snm+" Total Marks: "+ttl+" Average is: "+avg);

}

}

class ClassDemo1
{
public static void main(String args[])
{
StdMarks s1=new StdMarks();
StdMarks s2=new StdMarks();
s1.setMarks("vandu",90,85,95);
s2.setMarks("Rutu",70,75,90);
s1.calAvg();
s2.calAvg();
s1.showInfo();
s2.showInfo();

}

}
