import java.util.Scanner;


public class MultiDemo {
    public static void main(String[] args) {
 int n,i;
 Scanner input=new Scanner(System.in);
 n=input.nextInt();
  for (i = 0; i <=n; i++) {
  System.out.printf("%d x %d = %d\n",n,i,n*i);
 }
 
}
}
