import java.util.Scanner;


public class Odd_Even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        number=input.nextInt();
        if(number%2==0)
            System.out.println("Even number");
        else
            System.out.println("odd number");
        
    }
   
}
