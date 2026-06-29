package ArrayLists;
import java.util.*;
public class PairSum_I {
    public static Boolean pairSum(ArrayList<Integer> list,int target){
        // for(int i=0;i<list.size();i++){

        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i)+list.get(j)==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        // __________Optimized Approach _________

        int start=0;
        int end=list.size()-1;
        while(start<end){
            if(list.get(start)+list.get(end)==target){
                return true;
            }else if(list.get(start)+list.get(end)<target){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println( pairSum(list,target));
    }
    
}
