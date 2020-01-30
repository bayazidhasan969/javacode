
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number :");
        n=input.nextInt();
        for (i = 0; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println("sum = "+sum);
    }
}
