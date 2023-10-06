package IntegerBreak;

public class Solution {
    private int[] dp;

    public int integerBreak(int n) {
        if (n <= 2)
            return 1;
        if (n==3)
            return 2;
        dp = new int[n + 1];
        return helper(n);
    }

    private int helper(int n) {


        if (dp[n] != 0)
            return dp[n];
        int maxProduct = n;
        for (int i = 2; i < n / 2 + 1; i++) {
            int product = i * helper(n - i);
            maxProduct = Math.max(product, maxProduct);
        }
        dp[n] = maxProduct;
        return maxProduct;
    }
}
