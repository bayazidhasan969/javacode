import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
     int row,col;
     Scanner input=new Scanner(System.in);
      int[][] a=new int[2][3]; 
      int[][] b=new int[2][3]; 
      int[][] sum=new int[2][3];
        System.out.println("Enter elements for A = ");
      for(row=0;row<2;row++){
          for(col=0;col<3;col++){
              a[row][col]=input.nextInt();
          }
      }
         System.out.println("Enter elements for B = ");
      for(row=0;row<2;row++){
          for(col=0;col<3;col++){
              b[row][col]=input.nextInt();
          }
      }
        System.out.println("sum is : ");
      for(row=0;row<2;row++){
          for(col=0;col<3;col++){
              sum[row][col]=a[row][col]*b[row][col];
              System.out.print(" "+sum[row][col]);
          }
          System.out.println();
      }
      
    }
 
}
