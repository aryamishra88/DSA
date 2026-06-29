package ArrayLists;

public class Assignment_1 {
    public static Boolean monotonic(int arr[]){
        Boolean inc=true;
        Boolean dec=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                inc=false;
            }
            if(arr[i]<arr[i+1]){
                dec=false;
            }
        }
        return inc||dec;

    }
    public static void main(String args[]){
        int arr[]={2,3,1,6};
        System.out.println(monotonic(arr));

    }
    
}
