/*WAP to input any alphabet and check whether it is vowel or consonant.*/ 
import java.util.Scanner;
class Check_Vowel{//class declaration
    
public static void main(String args[]){//main metod declaration
char ch;//local variable
Scanner scan=new Scanner(System.in);
//This statements takes input from theuser
System.out.print("Enter an Alphabet: ");
ch=scan.next().charAt(0);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
{
    System.out.print(ch+" is vowel");
}
else{
    System.out.print(ch+" is  consonant");
}
}//end of mainmethod
}