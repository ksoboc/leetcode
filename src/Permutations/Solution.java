package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> perms;

    public List<List<Integer>> permute(int[] nums) {
        perms = new ArrayList<>();
        permute(nums, 0);
        return perms;
    }

    private void permute(int[] nums, int i) {
        if (i >= nums.length) {
            perms.add(arrayToList(nums));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            permute(nums, i + 1);
            swap(nums, i, j);
        }

    }

    private List<Integer> arrayToList(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (var num: nums)
            list.add(num);
        return list;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
