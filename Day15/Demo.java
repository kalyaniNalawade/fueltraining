//String Handelling Class Work
/*public class Demo
{
   public static void main(String args[])
   {
      String s1="ABC";
      char arr[];
      arr=s1.toCharArray();
      int i;
      for(i=0;i<arr.length;i++)
      {
         System.out.println(arr[i]);
      }
      byte arr1[]=s1.getBytes();
      for(i=0;i<arr1.length;i++)
      {
         System.out.println(arr1[i]);
      }

      
   }
}

public class Demo
{
   public static void main(String args[])
   {
      String s1="Hello World";
      String s2=s1.substring(2);
      System.out.println(s2);
      s2=s1.substring(2,8);
      System.out.println(s2);
      
       System.out.println(s1.startsWith("He"));
       System.out.println(s1.startsWith("Hello"));
       System.out.println(s1.startsWith("lo"));
       System.out.println(s1.endsWith("He"));
       System.out.println(s1.endsWith("lo"));
       System.out.println(s1.endsWith("wo"));
       System.out.println(s1.endsWith("ld"));
      
    }
}

public class Demo
{
   public static void main(String args[])
   {
      String s1="A";
      String s2="A";
      int x;
      x=s1.compareTo(s2);
     System.out.println(x);
  }
}*/

class Demo
{
   public static void main(String args[])
   {
      StringBuffer sb=new StringBuffer("Hello");
      System.out.println(sb.capacity());
      System.out.println(sb.length());
      System.out.println(sb);
      
      sb.setCharAt(0,'h');
      System.out.println(sb);
      
      sb.append(10);
      sb.append(5.6);
      sb.append("hello");
      System.out.println(sb);
      
      sb.deleteCharAt(0);
      sb.delete(1,7);
      System.out.println(sb);
      
      
      StringBuffer sb1=new StringBuffer("I  Java");
      System.out.println(sb1);
      
      sb1.insert(2,"like");
      System.out.println(sb1);
      
      sb1.reverse();
      System.out.println(sb1);
      
      String s3=sb1.toString();
      System.out.println(s3);
      
   }
}