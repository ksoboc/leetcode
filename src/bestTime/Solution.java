package bestTime;

public class Solution {
    public int maxProfit(int[] prices) {
        int left, right;

        left =0 ; right=1;
        int maxProfit = 0;
        while (right < prices.length) {
            int profit = prices[right] - prices[left];
            if (profit>=0) {
                maxProfit = Math.max(profit,maxProfit);
            } else {
                left = right;
            }
            right +=1;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int ans = sol.maxProfit(new int[]{5,9,8,1,2});
        System.out.println("ans = " + ans);
    }
}
