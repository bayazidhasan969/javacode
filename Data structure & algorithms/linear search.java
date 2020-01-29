
package datastructure;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         int arr[],search,i;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter how many elememnt..");
        int n=sc.nextInt();
        arr=new int[n];
          System.out.println("Enter element ");
        for( i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter value to find");
        search=sc.nextInt();
        for( i=0;i<n;i++){
            if(arr[i]==search)
            {
                System.out.println("value is find & position is "+(i+1));
                break;
            }
        }
        if(i == n)
            System.out.println("Search value not found");
        
    }
  
}
