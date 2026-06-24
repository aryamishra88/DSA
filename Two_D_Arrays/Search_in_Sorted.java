package Two_D_Arrays;

public class Search_in_Sorted {
    public static Boolean search(int[][]matrix,int target){
        int row=0;
        int col=matrix[row].length-1;
        while(row<matrix.length&&col>=0){
            if(target==matrix[row][col]){
                System.out.println("Found at index :"+"("+row+   ","+col+")");
                return true;
            }
            else if(target>matrix[row][col]){
                row++;

            }else{
                col--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix [][]={{10,20,30,40},{15,25,35,35},{27,29,27,28},{32,33,39,50}};
        System.out.println(search(matrix,33));
    }
    
}
