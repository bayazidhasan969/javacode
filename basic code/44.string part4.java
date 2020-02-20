
public class String_demo4 {
    public static void main(String[] args) {
       //replace string
        String s1="football is good";
       String s2=s1.replace('f','v');
        System.out.println(s2);
        //split string
        String[] s3=s1.split(" ");
        for(String x:s3){
            System.out.println(x);
        }
        
    }
  
}
