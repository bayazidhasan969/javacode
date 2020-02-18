import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double r,a;
        final double pi=3.14159;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        a=pi*r*r;
        System.out.printf("A=%.4f\n",a);
    }
   
}
