package ArraysPart1;

public class Largest {
    public static int findLargest(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr={1,2,6,3,5};
        int largest=findLargest(arr);
        System.out.println(largest);


    }
    
}
