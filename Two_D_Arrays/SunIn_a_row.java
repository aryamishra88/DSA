package Two_D_Arrays;

public class SunIn_a_row {
    public static int sum(int [][]nums){
        int sum_in_2_row=0;
        for(int i=0;i<nums[1].length;i++){
            sum_in_2_row+=nums[1][i];
            
        }
        return sum_in_2_row;
    }
    public static void main(String args[]){
        int [][]nums={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum(nums));
    }
    
}
