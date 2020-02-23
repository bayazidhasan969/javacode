public class Pmethod {
   String name,gender;
   int phone;
   void setifo(String n,String g,int ph)
   {
    name=n;
    gender=g;
    phone=ph;
   }
   void info()
   {
       System.out.println("name : "+name);
       System.out.println("gender : "+gender);
       System.out.println("phone : "+phone);
       System.out.println();
   }
    public static void main(String[] args) {
      //create object 1
       Pmethod p1=new Pmethod();
       p1.setifo("hasan bayazid","male",12345);
       p1.info();
       //create object 2
       Pmethod p2=new Pmethod();
       p2.setifo("bayazid", "male", 112233);
       p2.info();
    }
}
