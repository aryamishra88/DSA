package Stacks;
import java.util.*;
public class Histogram {
    public static int maxAreainHistigram(int[]heights){
        int n=heights.length;
        int NSR[]=new int[n];
        int NSL[]=new int[n];
        Stack<Integer> s=new Stack<>();
        // Nsr
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSR[i]=n;

            }else{
                NSR[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        // Nsl
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSL[i]=n;

            }else{
                NSL[i]=s.peek();
            }
            s.push(i);
        }
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int width=NSR[i]-NSL[i]-1;
            int area=heights[i]*width;
            maxarea=Math.max(area,maxarea);

        }
        return maxarea;
        
    }
    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        System.out.println(maxAreainHistigram(heights));
    }
}
