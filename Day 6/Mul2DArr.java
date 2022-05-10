import java.util.*;
class Mul2DArr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
int array[][]=new int [4][4];
int array1[][]=new int [4][4];
int mul[][]=new int [4][4];
System.out.println("Enter array Elements 4 X 4 into array1 :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
array[i][j]=sc.nextInt();
}
}
System.out.println("Enter array Elements 4 X 4 into array2 :");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
array1[i][j]=sc.nextInt();
}
}
System.out.println("Multiplying array elements");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
mul[i][j]=array[i][j]*array1[i][j];
}
}

System.out.println("Array Multilication is:");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
}
}