
public class Selection_sort {
     public static void Show_Array(int[]nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        int[] nums={3,6,0,-5,1,2,9,7};
        for(int i=0;i<nums.length-1;i++){
            int temp=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[temp]){
                    temp=j;
                }
            }
            if(temp!=i){
                int index=nums[i];
                nums[i]=nums[temp];
                nums[temp]=index;
            }
        }
        Show_Array(nums);
    }
   
}
