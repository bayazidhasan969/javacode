
public class Insertion_sort {
    public static void Show_Array(int[]nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    
    public static void main(String[] args) {
        int[] nums={1,4,2,0,-10,-5,10,100};
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j>0 && (nums[j-1]>nums[j])){
                swap(nums, j,j-1);
                j--;
            }
        }
        Show_Array(nums);
    }
   
}
