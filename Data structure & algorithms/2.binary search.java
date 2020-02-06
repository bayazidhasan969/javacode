import java.util.Scanner;


public class Binary_search {
    public static void main(String[] args) {
        int n,i,s,first,last,middle;
        int[] arr;
        System.out.println("Enter how many elements : ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        arr=new int[n];
        System.out.println("enter these element : ");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter which value you want search :");
        s=input.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        while(first<=last){
            if(arr[middle]<s)
                first=middle+1;
            
            else if(arr[middle]==s){
                System.out.println("element found at position "+(middle+1));
            break;
            }
            else{
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last){
            System.out.println("element not found");
        }
    }
}
