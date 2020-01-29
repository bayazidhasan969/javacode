
import java.util.Scanner;


public class Conditional {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        num1=input.nextInt();
        num2=input.nextInt();
        int large=(num1>num2) ? num1 : num2;
        System.out.println("large number is :"+large);
        
    }
}
