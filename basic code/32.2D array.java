public class TwoD_array {
    public static void main(String[] args) {
       int row,col;
        int[][] nums=new int[2][3];
        nums[0][0]=1;
        nums[0][1]=11;
        nums[0][2]=12;
        nums[1][0]=13;
        nums[1][1]=14;
        nums[1][2]=15;
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.println(nums[row][col]);
            }
        }
    }
 
}
