class Flight
{
String city,sa;
int fnum;
void setTkt(String ct,String sta,int fln)
{
city=ct;
sa=sta;
fnum=fln;
}
void showTkt()
{
System.out.println("Your ticket arrival city "+city+" seat no is "+sa+" Your flight number "+fnum);
}
}

class ClassDemo4
{
public static void main(String args[])
{
Flight f1=new Flight();
Flight f2=new Flight();
f1.setTkt("Aurangabad","25F",25);
f2.setTkt("Pune","75P",50);
f1.showTkt();
f2.showTkt();
}
}