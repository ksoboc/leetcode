package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<>();
        backtrack(candidates, new ArrayList<Integer>(), 0, target);
        return res;
    }

    private void backtrack(int[] candidates, ArrayList<Integer> cur, int i, int target) {
        if (target == 0) {
            res.add(List.copyOf(cur));
        }
        if (target < 0)
            return;

        int prev = -1;
        for (int j = i; j < candidates.length; j++) {
            if (candidates[j] == prev)
                continue;
            cur.add(candidates[j]);
            backtrack(candidates, cur, j + 1, target - candidates[j]);
            cur.remove(cur.size() - 1);
            prev = candidates[j];
        }


    }
}
