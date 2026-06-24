package Two_D_Arrays;

public class Transpose {
    public static int[][] find_transpose(int [][] matrix){
        int row=matrix[0].length;
        int col=matrix.length;
        int ans[][]=new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6}};
        int [][]grid=find_transpose(matrix);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
