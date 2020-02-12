import java.util.Scanner;


public class Bubble_sort {
    public static void main(String[] args) {
        int[] a=new int[50];
        int n,i,j,temp;
        System.out.println("Enter how many number : ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Enter these number : ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=1;i<n;++i)
	{
		for(j=0;j<(n-i);++j)
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
	}
        System.out.println("Array after bubble sort : ");
        for(i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }
	
    }
  
}
