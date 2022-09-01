package Subsets;

import java.util.*;

public class Solution {

    // Iterative
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        var n = nums.length;
        for (int i = 0; i < n; i++) {
            int sz = ans.size();
            for (int j = 0; j < sz; j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(nums[i]);
                ans.add(temp);
            }
        }
        return ans;
    }

    // Bit manipulation
    public List<List<Integer>> subsetsBitManipulation(int[] nums) {
        int n = 1 << nums.length;

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();

            int nrPos = 0;
            for (int mask = 1; mask <= i; mask <<= 1, ++nrPos) {
                if ((mask & i) > 0)
                    list.add(nums[nrPos]);
            }
            res.add(list);
        }
        return res;
    }

    // Backtracking
    List<Integer> subset;
    List<List<Integer>> res;
    int[] nums;

    public List<List<Integer>> subsetsBT(int[] nums) {
        res = new ArrayList<>();

        subset = new LinkedList<>();
        this.nums = nums;
        dfs(0);

        return res;

    }

    private void dfs(int i) {
        if (i >= nums.length) {
            res.add(List.copyOf(subset));
            return;

        }

        subset.add(nums[i]);
        dfs(i + 1);
        subset.remove(subset.size() - 1);
        dfs(i + 1);

    }
}
