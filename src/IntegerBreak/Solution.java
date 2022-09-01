package IntegerBreak;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1]=1;

        for (int num = 2; num <= n; num++) {
            int maxProduct = n==num?0:num;

            for (int i = 1; i < num/2+1; i++) {
                int product = dp[i]*dp[num-i];
                maxProduct = Math.max(maxProduct,product);
            }
            dp[num]=maxProduct;

        }
        return dp[n];

    }
}
