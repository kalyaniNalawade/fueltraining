import java.util.*;
class Complex
{
int real1,real2,imag1,imag2,sumr,sumi;

Complex()
{
sumr=0;
sumi=0;
}
Complex(int rl1,int rl2,int img1,int img2)
{
real1=rl1;
real2=rl2;
imag1=img1;
imag2=img2;

}
void addCom()
{
sumr=real1+real2;
sumi=imag1+imag2;
System.out.println("Complex Number addition is:");
System.out.println(sumr+" + "+sumi+"i");
}

}

class ClssDemo11
{
public static void main(String args[])
{
Complex c1=new Complex(7,5,4,9);
c1.addCom();
}
}
