package ArraysPart2.Arrays_Assignment;
import java.util.*;

public class Triplets {
    public static List<List<Integer>> threeSum(int []nums){


        //Brute Force


        // List<List<Integer>> list=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //             List<Integer> triplets=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 if(!list.contains(triplets)){
        //                     list.add(triplets);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return list;

        // Two Pointer Optimized approach

        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k&&nums[j-1]==nums[j]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k+1]){
                        k--;

                    }
                }
                else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return list;


    }
    public static void main(String args[]){
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    
}
