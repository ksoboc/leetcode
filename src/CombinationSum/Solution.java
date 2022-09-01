package CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> list;
    int target ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        list = new ArrayList<>();
        this.target = target;
        List<Integer> curr = new ArrayList<>();

        dfs(curr, candidates, 0, 0);

        return list;
    }

    void dfs(List<Integer> curr, int[] canditates, int total, int pos) {
        if (total>target)
            return;
        if (total==target) {
            list.add(List.copyOf(curr));
            return;
        }
        if (canditates.length==0 || pos>=canditates.length)
            return;

        List<Integer> temp = new ArrayList<>(curr);
        curr.add(canditates[pos]);
        dfs(curr, canditates, total+canditates[pos], pos);

        dfs(temp, canditates, total, pos+1);

    }
}
