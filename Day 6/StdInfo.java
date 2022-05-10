import java.util.*;
class StdInfo
{
int year;
String sftnm,smj,slsnm;
void setInfo(int yr,String fnm,String lnm,String sj)
{
year=yr;
sftnm=fnm;
slsnm=lnm;
smj=sj;
}
void showInfo()
{
//System.out.println(year+" "+sftnm+" "+slsnm+" "+smj);
System.out.println("Student year is: "+year);
System.out.println("Student First name is: "+sftnm);
System.out.println("Student Last name is: "+slsnm);
System.out.println("Student Major is: "+smj);

}

}

class ClassDemo1
{
public static void main(String args[])
{
StdInfo s1=new StdInfo();
StdInfo s2=new StdInfo();
s1.setInfo(4,"vandu","Fasate","ET");
s2.setInfo(4,"Rutu","Pawar","ET");
s1.showInfo();
s2.showInfo();

}

}
