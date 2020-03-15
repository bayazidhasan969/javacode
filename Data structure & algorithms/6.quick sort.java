
package datastructure;

public class Quick_sort {
    
  private int[] nums;
  public Quick_sort(int[] nums){
      this.nums=nums;
  }
    public static void main(String[] args) {
        int nums[]={6,1,7,2,8,3,0};
        Quick_sort quicksort=new Quick_sort(nums);
        quicksort.sort();
        quicksort.showarray();
    }
  public void sort(){
      quicksort(0,nums.length-1);
  }
  public void showarray(){
      for(int i=0;i<nums.length;i++){
          System.out.print(nums[i]+" ");
      }
  }
  private void quicksort(int low,int high){
      if(low>=high)return;
      int pivot = partition(low,high);
      quicksort(low,pivot-1);
      quicksort(pivot+1,high);
  }
  private int partition(int low,int high){
      int pivotindex=(low+high)/2;
      swap(pivotindex,high);
      int i=low;
      for(int j=low;j<high;j++){
          if(nums[j]<=nums[high]){
              swap(i,j);
              i++;
          }
      }
      swap(i,high);
      return i;
  }
    
    
    private void swap(int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

