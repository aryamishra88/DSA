package ArraysPart2.Arrays_Assignment;

public class Search_in_rotated_sorted {
    public static int sorted(int[]nums,int target){
        int si=0;
        int ei=nums.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[si]<=nums[mid]){

                if(nums[si]<=target&&target<nums[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }else{
                if(nums[mid]<target&&target<=nums[ei]){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(sorted(nums,0));
    }
    
}
