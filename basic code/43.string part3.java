
public class String_demo3 {
    public static void main(String[] args) {
        String c="bangladesh ";
        //print index
        char ch=c.charAt(0);
        System.out.println(ch);
        //print character ascii value
        int dh=c.codePointAt(0);
        System.out.println(dh);
        //string position
        int pos=c.indexOf("h");
        System.out.println(pos);
        //string space remove
        String r=c.trim();
        System.out.println(r);
        
    }
   
}
