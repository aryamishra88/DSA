package ArraysPart1;

public class SubArrays {
    public static void subArray(int [] arr){
        int ts=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
               
                for(int k=i;k<=j;k++){
                    
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }
                System.out.println("   Sum: "+sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays :"+ts);
        System.out.println("Maximum subarray SUm:"+max);
        System.out.println("Minimum subarray SUm:"+min);
    }
    
    public static void main(String args[]){
        int [] arr={2,4,6,8,10};
        subArray(arr);

    }
    
}
