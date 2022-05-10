import java.util.*;
class Adress
   {
      int hn;
      String hnm;
      String ct;
      void setHn(int hn)
      {
          this.hn=hn;
      }
      int getHn()
      {
         return hn;
      }
      void setHnm(String hnm)
      {
         this.hnm=hnm;
      }
      String getHnm()
      {
         return hnm;
      }
      void setCt(String ct)
      {
           this.ct=ct;
      }
      String getCt()
      {
         return ct;
      }
}
class Student
   {
      int id;
      String nm;
      Adress ad;
      public void setId(int id)
      {
         this.id=id;
      }
      public void setNm(String nm)
      {
           this.nm=nm;
      }

      public void setAdr(Adress ad)
      {
         this.ad=ad;
      }
      public int getId()
      {
         return id;
      }
      public Adress getAdr()
      {
         return ad;
      }
      public String getNm()
      {
         return nm;
      }

}

class Demo
    {
      public static void main(String args[])
      {
         Adress ad=new Adress();
         ad.setHn(1);
         ad.setHnm("ABC");
         ad.setCt("Aurangabad");
         
         Student st=new Student();
         int x=101;
         st.setId(x);
         st.setAdr(ad);
         st.setNm("XYZ");
         
         int id1;
         id1=st.getId();
         String n=st.getNm();
         Adress ad1=st.getAdr();
         
         int hn1=ad.getHn();
         String hnm1=ad.getHnm();
         String ct1=ad.getCt();
   }
}



