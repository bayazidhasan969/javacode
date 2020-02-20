public class String_builder {
    public static void main(String[] args) {
        /*
        advantages of stringbuilder that
        we can add anything with string
        and can change value
        */
        StringBuilder str=new StringBuilder("bayazid");
        str.append("hasan");
        str.append(24);
        str.append(1.2);
        System.out.println("str = "+str);
        
    }
  
}
