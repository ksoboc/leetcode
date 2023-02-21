package NondecreasingSubsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionBit {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        final int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> seq = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    seq.add(nums[j]);
                }
            }
            if (seq.size() >= 2) {
                boolean isNonDecr = true;
                for (int j = 1; j < seq.size(); j++) {
                    if (seq.get(j) < seq.get(j - 1)) {
                        isNonDecr = false;
                        break;
                    }
                }
                if (isNonDecr)
                    ans.add(seq);
            }
        }
        return new ArrayList<>(ans);
    }

}
