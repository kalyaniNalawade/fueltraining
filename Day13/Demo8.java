import java.util.*;
class Demo8
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int arr[]={55,77,99};
      int i,ele;
      System.out.println("Enter index which value do you want to print?");
      i=sc.nextInt();
      try
      {
         ele=arr[i];
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e);

      }
      System.out.println("Index element is: "+arr[i]);   
   }
}