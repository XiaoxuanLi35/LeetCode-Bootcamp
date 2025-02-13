class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;// index of new array
        // fast is used to get the elements of new array
        for(int fast = 0; fast <nums.length; fast++){
            if(nums[fast]!= val){
                nums[slow] = nums[fast];
                slow++;
            }
            
        }
        return slow;
    }
}
public class RemoveElement27 {
  public static void main (String[] args){
    Solution solution = new Solution;
    int result = solution.removeElement(nums, val);
    int[] nums = {3,2,2,3};
    int val = 3;
    System.out.println(result);
  }
}
