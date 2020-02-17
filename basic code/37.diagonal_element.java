import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
     int row,col;
     Scanner input=new Scanner(System.in);
      int[][] a=new int[3][3]; 
      int sumof_diagonal=0;
      int sumof_uppertriangle=0;
      int sumof_lower=0;
        System.out.println("Enter elements for A = ");
      for(row=0;row<3;row++){
          for(col=0;col<3;col++){
              a[row][col]=input.nextInt();
          }
      }
      for(row=0;row<3;row++){
          for(col=0;col<3;col++){
              
              if(row==col)
              {
                 sumof_diagonal= sumof_diagonal+a[row][col];
              }
              if(row<col)
              {
                  sumof_uppertriangle=sumof_uppertriangle+a[row][col];
              }
              if(row>col)
              {
                  sumof_lower=sumof_lower+a[row][col];
              }
          }
      }
        System.out.println("sum of diagonal element = "+sumof_diagonal);
        System.out.println("sum of upper-triangle element = "+sumof_uppertriangle);
        System.out.println("sum of lower-triangle element = "+sumof_lower);
       
    }
 
}
