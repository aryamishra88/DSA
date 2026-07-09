package Stacks;
import java.util.*;
public class NextGreater {
    public static int[] nextGreater(int[]arr){
        Stack<Integer> s=new Stack<>();

        int[]nextG=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return nextG;
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int ans[]=nextGreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
    
}
