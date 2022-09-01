package coinChange;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        memo[0] = 0;
        for (var i = 1; i <= amount; ++i)
            memo[i] = amount + 1;

        for (var val = 0; val < amount + 1; ++val) {
            for (var coin : coins) {
                if (val - coin >= 0) {
                    memo[val] = Math.min(memo[val], 1 + memo[val - coin]);
                }
            }
        }

        if (memo[amount] < amount + 1)
            return memo[amount];
        return -1;

    }

    public int coinChangeDP(int[] coins, int amount) {
        var ans = coinChangeDP2(coins,amount);
        if (ans<amount+1)
            return ans;
        return -1;
    }
    public int coinChangeDP2(int[] coins, int amount) {
        if (amount == 0)
            return 0;


        var val = Integer.MAX_VALUE - 1;
        for (var coin : coins) {

            if (amount - coin >= 0) {
                val = Math.min(val, 1+coinChangeDP2(coins, amount - coin));
            }
        }
        return val;
    }
}
