
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          System.out.println("character is vowel");
        else
            System.out.println("character is consonant");
    }
}
