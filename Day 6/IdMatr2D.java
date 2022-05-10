import java.util.*;
class IdMatr2D
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
boolean isid=false;
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
if(i==j && array[i][j]==1)
{
isid=true;
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

if(isid==true)
{
System.out.println("Array is IDENTITY MATRIX");
}
else
{
System.out.println("Array is not IDENTITY MATRIX");

}
}
}