import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        int i,n,sum=0;
        System.out.println("Enter how many numbers : ");
        n=input.nextInt();
        System.out.println("Enter the numbers : ");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<=n;i++){
            sum+=arr[i];
        }
        System.out.println("sum is : "+sum);
        double avg;
        avg=sum/n;
        System.out.println("average is : "+avg);
      
    }
   
}
