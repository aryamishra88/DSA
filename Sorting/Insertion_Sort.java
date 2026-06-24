package Sorting;

public class Insertion_Sort {
    public static void insertion(int []nums){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0&&nums[prev]<=curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;

        }
    }
    public static void main (String args[]){
        int nums[]={2,1,34,67,3,24,12};
        insertion(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
