
import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        double r,a;
        final double pi=3.14159;
        Scanner input=new Scanner(System.in);
        r=input.nextDouble();
        a=pi*(r*r);
        System.out.println("Area of circle : "+a);
        
    }
   
}
