//Homework
import java.util.*;
import java.io.*;
class DemoYear
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int year,cur_year=2022;
      long day=0;
      System.out.println("Enter Year to calculate the number of days till day?");
      year=sc.nextInt();
      int year1=cur_year-year;
      int l_year=0;
      
      for(int j=year;j<=cur_year;j++)
      {
         if((j % 400 == 0)|| ((j % 4 == 0) && (j % 100 != 0)))       
         {
            l_year++;
                       
         }
      }
     // System.out.println(l_year);
     
      long year_n=year1-l_year;
      long non_leap=year_n*365;
     // System.out.println(year_n);
     // System.out.println(non_leap);
      long yearl=year1-year_n;
      long leap=yearl*366;
    //  System.out.println(yearl);
     // System.out.println(leap);

            
      /*for(int i=0;i<=year1;i++)
      {
         if((year1%4==0 && year1%100==0)||year1%400==0)
         {
           lday=year1*366;
           
         }
         if((year1%4!=0 && year1%100!=0 )||year1%400!=0)
         {
          nday=year1*365;
         }
         
      }*/
      day=non_leap+leap;
      System.out.println("Number of days From entered Years: "+day);
   }
}