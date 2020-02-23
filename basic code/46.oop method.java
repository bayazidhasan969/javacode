public class OOPs {
 String name,gender;
 int phone;

 void Myinfo()
 {
      System.out.println("name = "+name);
      System.out.println("gender = "+gender);
      System.out.println("phone = "+phone);
 
 }
     public static void main(String[] args) {
     OOPs o1=new OOPs();
     o1.name="bayazid hasan";
     o1.gender="male";
     o1.phone=114309;
     o1.Myinfo();
    }
    
}
