class PlanetInfo
{
String pnm;
double dist,grv;
void setInfo(String nm,double d,double grav)
{
pnm=nm;
dist=d;
grv=grav;
}
void showInfo()
{
System.out.println("Planet name is: "+pnm);
System.out.println("Distance from Earth is "+dist+ "km");
System.out.println("Gravity is: "+grv+"m/s^2");

}
}




class ClasDemo2
{
public static void main(String args[])
{
PlanetInfo p1=new PlanetInfo();
PlanetInfo p2=new PlanetInfo();
p1.setInfo("Earth",149.83,9.807);
p2.setInfo("Moon",150,1.62);
p1.showInfo();
p2.showInfo();

}
}