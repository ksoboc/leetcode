package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (j==i+1 || nums[j]!=nums[j-1]) {
                        int sum = nums[i] + nums[j];
                        int pos = Arrays.binarySearch(nums, j + 1, nums.length, -sum);
                        if (pos > j) {
                            res.add(List.of(nums[i], nums[j], nums[pos]));
                        }
                    }
                }
            }
        }

        return res;
    }
}
