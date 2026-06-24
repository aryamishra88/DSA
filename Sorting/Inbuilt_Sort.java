
package Sorting;
import java.util.Arrays;      //  Package to use inbuilt sort
import java.util.Collections;



public class Inbuilt_Sort {
    
    public static void main(String args[]){
        Integer []nums={2,1,5,24,3,56};
        // Arrays.sort(nums);    //Time complexity nlog(n)
        // Arrays.sort(nums,0,4);
        Arrays.sort(nums,0,3,Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
