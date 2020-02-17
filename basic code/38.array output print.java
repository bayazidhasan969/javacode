import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
     int row,col;
     Scanner input=new Scanner(System.in);
      int[][] a=new int[4][5]; 
      int k=0;
        System.out.println("Enter elements : ");
      for(row=0;row<4;row++){
          for(col=0;col<5;col++){
              a[row][col]=k;
              k++;
          }
      }
      for(row=0;row<4;row++){
          for(col=0;col<5;col++){
              System.out.print(" "+a[row][col]);
          }
          System.out.println();
      }
     
    }
 
}
