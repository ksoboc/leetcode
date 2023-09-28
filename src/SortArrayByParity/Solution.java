package SortArrayByParity;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if ((nums[l] & 1) == 0) {
                ++l;
            } else if ((nums[r] & 1) == 1) {
                --r;
            } else {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }
        }
        return nums;
    }
}
