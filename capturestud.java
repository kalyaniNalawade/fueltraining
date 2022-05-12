import java.util.*;
class capturesstud
{
private String fn,ln,maj;
private int clyear;
public void setFn(String fn)
{
this.fn=fn;
}
public void setLn(String ln);
{
this.ln=ln;
}
public void setMaj(String maj)
{
this.maj=maj;
}
public void setClyear(int clyear)
{
this.clyear=clyear;
}
public String getFn()
{
return fn;
}
public String getLn()
{
return ln;
}
public String getClyear()
{
return clyear;
}
public void stdata()
{
System.out.println(" "+fn+" "+ln+" "+maj+" "+clyear+" ");
}
public class Student
{
public static void main(String[] args)
{
Student st1=new Student();
st1.setFn("kalyani");
st1.setLn("Nalawade");
st1.setMaj("E&TC");
st1.setClyear(4);
st1.getFn();
st1.getLn();
st1.getMj();
st1.getClyear();
st1.stdData();
Student st2=new Student();
st2.setFn("Renuka");
st2.setLn("Veer");
st2.setMaj("E&tc");
st2.getClyear(4);
st2.getFn();
st2.getLn();
st2.getMaj();
st2.getClyear();
st2.stdData();
}
}
}