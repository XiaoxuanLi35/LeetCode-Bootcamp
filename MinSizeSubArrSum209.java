public class MinSizaSubArrSum209 {
  public static void main(String[] args){
    int[] nums = {2, 3, 1, 2, 4, 3};
    int target = 7;
    Solution s = new Solution;
    System.out.println(s.minSubArrayLen(target, nums));
    }
}
class Slolution{
  public int minSubArrayLen(int target, int[] nums) {
    int left, sum = 0; // left is the start of sliding window
    int minLen = Integer.MAX_VALUE;// if set minLen = 0, the minLen will never change during the process
    for(int right = 0; right < nums.length; right++){
      // right is the end of the sliding window
      sum += nums[right];
      while(sum >= target){
        minLen = Math.min(minLen, right - left + 1);// right - left + 1 is the current size of the sliding window
        sum -= nums[left]; // move the left pointer to shrink the sliding window
        left ++;
      }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;// condition ? is_true_value : is_false_value;
  }
}
