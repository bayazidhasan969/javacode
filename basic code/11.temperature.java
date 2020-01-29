
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double c,f;
        System.out.println("Enter celcius temperature : ");
        c=input.nextDouble();
        f=1.8*c+32;
        System.out.println("Temperature in farenhite is :"+f);
        
    }
}
