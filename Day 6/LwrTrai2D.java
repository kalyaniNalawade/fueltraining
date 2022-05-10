import java.util.*;
class LwrTrai2D
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
boolean isupper=true;
int array[][]=new int [4][4];
System.out.println("Enter array Elements 4 X 4 into array1 :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
array[i][j]=sc.nextInt();
}
}

for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
if(i<j && array[i][j]!=0)
{
isupper=false;
}
}
}
System.out.println("Array Contains");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(array[i][j]+" ");
}
System.out.println();
}

if(isupper==true)
{
System.out.println("Array is LOWER triangular");
}
else
{
System.out.println("Array is not LOWER triangular");

}
}
}