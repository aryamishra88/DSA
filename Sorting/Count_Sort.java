package Sorting;

public class Count_Sort {
    public static void count(int[]nums){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        largest=Math.max(largest,nums[i]);
        }
        int freq[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;

        
          


        }
        int j=nums.length-1;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                nums[j]=i;
                freq[i]--;
                j--;
            }

        }
    }
        public static void main(String args[]){
            int []nums={3,4,6,2,1,5,3,1};
            count(nums);
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }



        }

        

    
    
}
