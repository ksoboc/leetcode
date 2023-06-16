package NumberofWaystoReorderArraytoGetSameBST;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long[][] pascalTriangle;
    private static final int MOD = 1_000_000_007;

    public int numOfWays(int[] nums) {
        int m = nums.length;

        pascalTriangle = new long[m][m];
        pascalTriangle[0][0] = 1;
        for (int i = 0; i < m; i++) {
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (var num : nums)
            list.add(num);
        return (int)((numOfWays(list) - 1)%MOD);
    }

    private long numOfWays(List<Integer> nums) {
        final int n = nums.size();
        if (n < 3)
            return 1;

        List<Integer> smallerThanRoot = new ArrayList<>();
        List<Integer> greaterThanRoot = new ArrayList<>();

        int rootElem = nums.get(0);
        for (int i = 1; i < n; ++i) {
            var num = nums.get(i);
            if (num < rootElem)
                smallerThanRoot.add(num);
            else
                greaterThanRoot.add(num);
        }

        long product = numOfWays(smallerThanRoot) * numOfWays(greaterThanRoot) % MOD;

        long numOfWaysAll = comb(n - 1, smallerThanRoot.size()) * product;
        return numOfWaysAll % MOD;
    }

    private long comb(int n, int k) {
        return pascalTriangle[n][k];
    }
}
