class BankInfo
{
double bb;
String bnm;
final static String fnm="Vandu",lnm="Fasate";
void setInfo(String bn,double bl)
{
bb=bl;
bnm=bn;
//fnm=nmf;
//lnm=nml;

}
/*BankInfo()
{
fnm="Vandana";
lnm="Fasate";
}*/
void showInfo()
{
System.out.println("Customer name is: "+fnm+" "+lnm);
System.out.println("Bank"+" "+bnm+" Account  Balance is:"+bb);
}

}

class ClssDemo3
{
public static void main(String args[])
{
BankInfo b1=new BankInfo();
BankInfo b2=new BankInfo();
b1.setInfo("SBI",50000);
b2.setInfo("IDBI",+90000);
b1.showInfo();
b2.showInfo();
}
}
