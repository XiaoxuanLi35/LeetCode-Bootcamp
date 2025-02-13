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
}
public class SortedSquare977{
  public static void main(String[] args){
    int[] nums = {-4,-1,0,3,10};
    Solution solution = new Solution;
    System.out.println(Arrays.toString(newArr));
  }
}
