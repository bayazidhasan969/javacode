import java.util.Scanner;
public class Maximum_mini {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        System.out.println("Enter 5 number: ");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(i=1;i<5;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("maximum number : "+max);
        System.out.println("minimum number : "+min);
        
    }
   
}
