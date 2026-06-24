package ArraysPart1;
public class LinearSearch{
    public static int linear(int []arr,int n){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
         }
         return -1;
    }
    public static void main(String args[]){
        int arr[]={2,3,5,6,7,78};
        int result=linear(arr,78);
        if(result==-1){
            System.out.println("ELement does not found in array.");
        }else{
            System.out.println("Element found at index "+result);
        }

    }
    
}