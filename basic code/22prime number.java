import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int n,i,count=0;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        for (i = 2; i < n; i++) {
           if(n%i==0){
               count++;
               break;
           } 
        }
        if(count==0)
        System.out.println("prime number");
        else
            System.out.println("not prime number");
    }
}
