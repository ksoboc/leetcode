package NondecreasingArray;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int modCnt=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]>nums[i]) {

                if (++modCnt > 1)
                    return false;
                if (i != 1 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i-1];
                }


            }
        }
        return true;
    }
}
