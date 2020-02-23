
public class Const {
   String name,gender;
   int phone;
   
   //create constructor.
   Const(String n,String g,int ph)
   {
    name=n;
    gender=g;
    phone=ph;
   }
   
   //create method.
   void info()
   {
       System.out.println("name : "+name);
       System.out.println("gender : "+gender);
       System.out.println("phone : "+phone);
       System.out.println();
   }
    public static void main(String[] args) {
      //create object 1 with parameterized value
        
       Const p1=new Const("hasan bayazid","male",12345);
       p1.info();
       
       //create object 2
       
       Const p2=new Const("bayazid", "male", 112233);
       p2.info();
    }
}
