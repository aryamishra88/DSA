package ArraysPart1;

public class BinarySearch {
    public static int Binary(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(item==arr[mid]){
                return mid;
            }else if(item>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr={2,4,6,8,10,12,14};
        int index=Binary(arr,14);
        if(index==-1){
            System.out.println("Element does not found in array");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
    
}
