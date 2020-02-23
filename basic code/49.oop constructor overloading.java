
public class Ovlcons {
    String name,gender;
    int phone;
    Ovlcons()
    {
        System.out.println("default constructor");
    }
    Ovlcons(String n,String g)
    {
       name=n;
       gender=g;
    }
    Ovlcons(String n,String g,int ph)
    {
        name=n;
        gender=g;
        phone=ph;
    }
    void display()
    {
        System.out.println("name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("phone : "+phone);
       
    }
    
    public static void main(String[] args) {
        Ovlcons v1=new Ovlcons();
        Ovlcons v2=new Ovlcons("hasan","male");
        v2.display();
        Ovlcons v3=new Ovlcons("bayazid","male",11223);
        v3.display();
           
    
    }
  
}
