import java.util.Scanner;


public class FibonacciDemo {
    public static void main(String[] args) {
       int n,i;
    int fibos;
   Scanner input=new Scanner(System.in);
   n=input.nextInt();  
   int first=0;
   int second=1;
        System.out.print(first+" "+second+" ");
        for(i=3;i<n;i++){
            fibos=first+second;
            System.out.print(" "+fibos+" ");
            first=second;
            second=fibos;
        }
    }
   }
