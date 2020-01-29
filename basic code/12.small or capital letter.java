
import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        ch=input.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("small letter");
        else if(ch>='A' && ch<='Z')
            System.out.println("capital letter");
        else
            System.out.println("not a letter");
    }
    
}
