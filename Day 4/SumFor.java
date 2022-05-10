import java.util.*;
class SumFor
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int nm,i,sum=0;
System.out.println("Enter End:");
nm=sc.nextInt();
for(i=0;i<=nm;i=i+1)
{
sum=sum+i;
}
System.out.println(sum);
sum=(nm*(nm+1))/2;
System.out.println(sum);

}
}