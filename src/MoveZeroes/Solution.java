package MoveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        var l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != 0) {
                var tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                ++l;
            }

        }

    }

    public void moveZeroes2(int[] nums) {
        var l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[l] = nums[r];
                ++l;
            }

        }

        for (;l<nums.length;++l) {
            nums[l]=0;
        }

    }
}
