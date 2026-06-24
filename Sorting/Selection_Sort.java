package Sorting;

public class Selection_Sort {
    public static void selection(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            // int minIdx=i;
            int maxidx=i;
            for(int j=i+1;j<nums.length;j++){
                // if(nums[j]<nums[minIdx]){
                    // minIdx=j;
                    if(nums[j]>nums[maxidx]){
                        maxidx=j;
                    
                   
                }
                
            }
            // int temp=nums[minIdx];
            // nums[minIdx]=nums[i];
            // nums[i]=temp;
            int temp=nums[maxidx];
            nums[maxidx]=nums[i];
            nums[i]=temp;
        }

    }
    public static void main(String args[]){
        int nums[]={3,54,24,1,5};
        selection(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
