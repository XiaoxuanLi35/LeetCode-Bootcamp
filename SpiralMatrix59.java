import java.util.Arrays;
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // the number filled in
        int left = 0, top = 0, right = n - 1, bottom = n - 1;// 4 boundaries
        while(num <= n * n){
          // left to right
            for(int i = left; i <= right; i++){
            matrix[top][i] = num;
            num++;
          }
            top++;
            // up to down
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num;
                num++;
            }
            right--;
            // right to left
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num;
                num++;
            }
            bottom--;
            // down to up
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = num;
                num++;
            }
            left++;
        }
        return matrix;
    }
}

public class SpiralMatrix59{
  public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
  
  public static void main(String[] args){
    int n = 3;
    Solution sol = new Solution;
    int[][] result = sol.generateMatrix(n);
    printMatrix(result);
  }
  
}
