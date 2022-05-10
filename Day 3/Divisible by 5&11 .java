/* Q3. WAP to check whether a number is divisible by 5 and 11 or not*/
import java.util.*;
class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("enter a numbers");
num=sc.nextInt();
if(num % 5==0)
{
System.out.println("the number is divisible by 5 ");
}
else if(num % 11==0)
 {
 System.out.println("the number is divisible by 11");
 }
 else
 {
 System.out.println("number is not divisible");
 }
 }
 }
