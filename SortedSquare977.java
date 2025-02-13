import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        // initialse a new array newArr
        int len = nums.length;
        int[] newArr = new int[len];
        int k = len - 1; // the index of the max element in the new array
        for(int i = 0, j = len - 1; i <= j;){
        // pointer i: beginning of array. pointer j:end of array
        // they are used to compare the squared elements
            if(nums[i]*nums[i] > nums[j] * nums[j]){
                newArr[k] = nums[i] * nums[i];
                k--;
                i++;
            } else {
                // when nums[i]*nums[i]<=nums[j]*nums[j]
                newArr[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }
        return newArr;
    }
    public int[] sortedSquares2(int[] nums){
        int len = nums.length;
        int[] res = new int[n];
        int k = len - 1;
        int i = 0, j = len - 1;
        while(i <= j){
            // while loop is more suitable than for loop in this context
            int isquare = nums[i] * nums[i];
            int jsquare = nums[j] * nums[j];
            if(isquare > jsquare){
                res[k] = isquare;
                i++;
            } else {
                res[k] = jsquare;
                j--;
            }
            k--;
        }
        return res;
    }
}
public class SortedSquare977{
  public static void main(String[] args){
    int[] nums = {-4,-1,0,3,10};
    Solution solution = new Solution;
    System.out.println("Solution 1: " + Arrays.toString(solution.sortedSquare(nums)));
    System.out.println("Solution 2: " + Arrays.toString(solution.sortedSquare2(nums)));
  }
}
