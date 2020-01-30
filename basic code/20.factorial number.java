
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        int num,fact=1,j;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for (j =num; j >=1; j--) {
            fact=fact*j;
        }
        System.out.println("factorial of " +num +" is :"+fact);
    }
}
