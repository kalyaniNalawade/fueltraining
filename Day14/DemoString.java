
/*public class DemoString {
    public static void main(String[] args) {

        String s1="abc";
        String s2="abc";
        if(s1==s2){
                System.out.println("Equals");
        }else{
            System.out.println("not Equals");
        }
    }
}

//do not use == operator to compare string
public class DemoString {
    public static void main(String[] args) {

        String s1 = new String("abc");
        String s2 = new String("abc");
        if (s1 == s2) {
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }
    }
}
*/

//length,charAt,indexOf methods
/*public class DemoString {
    public static void main(String[] args) {
        
      String s1="Helol World";
      System.out.println(s1.length());
      System.out.println(s1.charAt(7));
      int x;
      x=s1.indexOf("l");
      System.out.println(x);
      x=s1.indexOf("l",x+1);
      System.out.println(x);

    //   x=s1.lastIndexOf("l");
    //   System.out.println(x);
    // x=s1.indexOf("abc");
    // System.out.println(x);

    }
}
//split
public class DemoString {
    public static void main(String[] args) {
        
      String s1="This is demo string";
    
      String[] arr=s1.split(" ");
      for (String s2 : arr) {
          System.out.println(s2.toUpperCase());
          System.out.println(s2.toLowerCase());
         
      }

    }
}*/
import java.util.Scanner;

//equals,equalsIgnoreCase,trim
public class Demo7 {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter username");
      String un=sc.nextLine();
      System.out.println("Enter password");
      String pass=sc.nextLine();
      un=un.trim();
      pass=pass.trim();
    //   if(un.equals("abc")&& pass.equals("xyz")){
    //       System.out.println("Valid");
    //   }else{
    //     System.out.println("InValid");
    //   }
    if(un.equalsIgnoreCase("abc")&& pass.equalsIgnoreCase("xyz")){
        System.out.println("Valid");
    }else{
      System.out.println("InValid");
    }

    }
}



