package LargestPerimeterTriangle;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        swapMax(nums, nums.length - 1);
        swapMax(nums, nums.length - 2);
        swapMax(nums, nums.length - 3);
        for (int i = nums.length - 1; i > 1; --i) {
            if (nums[i - 2] + nums[i - 1] > nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];
            else if (i > 3)
                swapMax(nums, i - 3);

        }
        return 0;
    }

    private void swapMax(int[] nums, int pos) {
        int maxIdx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= pos; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }

        }
        int tmp = nums[pos];
        nums[pos] = nums[maxIdx];
        nums[maxIdx] = tmp;
    }

    public int largestPerimeter2(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; --i) {
            if (nums[i - 2] + nums[i - 1] > nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];

        }
        return 0;
    }
}
