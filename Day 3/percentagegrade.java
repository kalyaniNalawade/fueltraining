/*Q8. WAP to input marks of five subjects Physics, Chemistry,Biology, Mathematics and computer. calculate percentage and grade according to following :
per>=90% : Grade A
per>=80% : Grade B
per>=70% : Grade C
per>=60% : Grade D
per>=40% : Grade E
per<=40% : Grade F*/

import java.util.Scanner;   
class percentagegrade
{
   public static void main(String[] args)
   {
      int  percentage;    
      char grade;    
      // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

      // Get the test score.
      System.out.print("Enter your percentage : ");
      percentage = console.nextInt();

      // Calculate the grade.
      if (percentage >= 90)
      {
         grade = 'A';
      }
      else if (percentage>= 80)
      {
         grade = 'B';
      }
      else if (percentage >= 70)
      {
         grade = 'C';
      }
      else if (percentage>= 60)
      {
         grade = 'D';
      }
      else if (percentage>=40)
      {
      grade = 'E';
      }
      else if (percentage<=40)
      {
      grade = 'F';
      }
      else 
      {
         grade = 'F';
      }

      // Display the grade.
      System.out.println("Your grade is " + grade);
   }
}

