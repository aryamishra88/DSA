package ArrayLists;
import java .util.*;

public class ContainerWithMostWater {
    public static int maxWater(ArrayList<Integer> height){

        //   ____Brute Force______
        // int area=Integer.MIN_VALUE;
        // for(int i=0;i<height.size();i++){
        //     for(int j=1;j<height.size();j++){
        //         int  length=Math.min(height.get(i),height.get(j));
        //         int width=j-i;
        //         area=Math.max(area,length*width);

        //     }
            
        // }
        // return area;






        // Optimized Approach Two Pointer

        int start=0;
        int end=height.size()-1;
        int area=0;
        while(start<end){
            int width=end-start;
            int length=Math.min(height.get(start),height.get(end));
            area=Math.max(area,length*width);
            if(height.get(start)<height.get(end)){
                start++;
            }else{
                end--;
            }


        }
        return area;

    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxWater(height));
    }
    
}
