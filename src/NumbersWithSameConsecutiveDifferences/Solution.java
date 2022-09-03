package NumbersWithSameConsecutiveDifferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    //    private Set<Integer> numbers = new HashSet<>();
    private List<Integer> numbers = new ArrayList<>();

    public int[] numsSameConsecDiff(int n, int k) {


        for (int i = 1; i <= 9; i++) {
            dfs(i, n, 0, k, 0);
        }

        int[] res = new int[numbers.size()];

        for (var i = 0; i < numbers.size(); ++i) {
            res[i] = numbers.get(i);
        }
        return res;
    }

    private void dfs(int startNum, int n, int pos, int k, int num) {

        if (pos >= n) {
            numbers.add(num);
            return;
        }
        if (startNum < 0 || startNum > 9)
            return;

        dfs(startNum + k, n, pos + 1, k, num * 10 + startNum);
        if (pos < n - 1 && k > 0)
            dfs(startNum - k, n, pos + 1, k, num * 10 + startNum);
    }
}
