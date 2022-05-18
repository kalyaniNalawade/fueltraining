//Given a string and a non-empty word string, return a string made of each char just before and 
//just after every appearance of the word in the string. Ignore cases where there is no char before 
//or after the word, and a char may be included twice if it is between two words.
//If inputs are "abcXY123XYijk" and "XY", output should be "c13i". If inputs are "XY123XY" 
//and "XY", output should be "13". If inputs are "XY1XY" and "XY", output should be "11".
import java.util.*;
class StringWord
{
public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String s1,word;
   System.out.println("enter string");
   s1=sc.next();
   System.out.println("enter word");
   word=sc.next();
   String result = "";
   int i=0;
   int end = 0;
   int l =s1.length();
   while( i < s1.length()) {
    
    end = i + word.length();
    if( end > l) {
      end=l;
    }
    
    if(s1.substring(i,end).equals(word)) {
      
      if(i>0) {
        result = result + s1.charAt(i-1);
      }
      
      if(i+word.length() <l) {
        result = result + s1.charAt(end);
      }
      
    }
    i++;
  }
  System.out.println( result);
 }
}