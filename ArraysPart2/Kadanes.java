package ArraysPart2;

public class Kadanes {
    public static int kadanesAlgo(int [] arr){
        int currSum=arr[0];
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            // currSum+=arr[i];
            // if(currSum<0){
            //     currSum=0;
            // }
            // maxSum=Math.max(currSum,maxSum);

            currSum=Math.max(arr[i],currSum+arr[i]);        //  Modified kadanes algorithm
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;

    }
    public static void main(String args[]){
        int array[]={-1,-2,-3,-4};
        int result=kadanesAlgo(array);
        System.out.println("Maximum subarray sum :"+result);
    }
    
}
