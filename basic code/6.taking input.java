
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        double num2;
        String name;
        num1=input.nextInt();
        System.out.printf("the integer number is = %d\n",num1);
        num2=input.nextDouble();
        System.out.println("the float number is = "+num2);
        input.nextLine();
        name=input.nextLine();
        System.out.println("the String number is = "+name);
        
    }
    
}
