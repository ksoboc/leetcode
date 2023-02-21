package NondecreasingSubsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        backtrack(nums, ans, 0, new ArrayList<Integer>());
        return new ArrayList<>(ans);
    }

    private void backtrack(int[] nums, Set<List<Integer>> ans, int i, List<Integer> seq) {
        if (i >= nums.length) {
            if (seq.size() >= 2)
                ans.add(new ArrayList<>(seq));
            return;
        }
        if (seq.isEmpty() || nums[i] >= seq.get(seq.size() - 1)) {
            seq.add(nums[i]);
            backtrack(nums, ans, i + 1, seq);
            seq.remove(seq.size() - 1);
        }
        backtrack(nums, ans, i + 1, seq);
    }
}
