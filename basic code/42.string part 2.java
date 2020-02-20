
public class String_demo2 {
    public static void main(String[] args) {
       //string add
        String fname="bayazid";
        String lname=" Hasan";
        String fullname=fname+lname;
        System.out.println("full name is : "+fullname);
        //add string another way
        String addname=fname.concat(lname);
        System.out.println(addname);
        //convert to uppercase
        String uppercase=fullname.toUpperCase();
        System.out.println(uppercase);
        //lower case
        String lowercase=fullname.toLowerCase();
        System.out.println(lowercase);
        //check starting character
        boolean c=fullname.startsWith("b");
        System.out.println(c);
        //check ending char
        boolean d=fullname.endsWith("n");
        System.out.println(d);
        //string array and prints
        String[] arr={"rahim","karim","jasim"};
        for(String x: arr){
            System.out.println(x);
        }
    }
 
}
