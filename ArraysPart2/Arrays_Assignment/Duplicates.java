

package ArraysPart2.Arrays_Assignment;

import java.util.HashSet;

public class Duplicates {
    public static Boolean checkDuplicates(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return true;

            }
            set.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int nums[]={23,4,5,2,1,34,5,4};
        Boolean Result=checkDuplicates(nums);
        System.out.println("Array contains duplicate values : "+Result);
    }
    
    
}
