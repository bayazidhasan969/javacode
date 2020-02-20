
package anisulislam;


public class String_demo {
    public static void main(String[] args) {
        String s1="Bayazid Hasan";
        String s2=new String("Bayazid Hasan");
        System.out.println(s1);
        System.out.println(s2);
        //string is sequence of character.
        char[] s3={'b','a','y'};
        System.out.println(s3);
        //find string length
        int len=s1.length();
        System.out.println("length of s1 : "+len);
        //string compare 3 way
        if(s1==s2)/*this condition check the object.not value.so it print not equal*/
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        //another method
        if(s1.equalsIgnoreCase(s2)) //this will check value of two string.print equal.
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        //contains method
        boolean b=s1.contains(s2);
        System.out.println(b);
        //is empty method
        boolean c=s1.isEmpty();
        System.out.println(c);
    }
   
}
