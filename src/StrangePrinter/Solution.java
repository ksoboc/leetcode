package StrangePrinter;

import java.util.Arrays;

public class Solution {
    private int[][] dp;
    public int strangePrinter(String s) {
        int n=s.length();
        dp=new int[n][n];
        for (var row:dp)
            Arrays.fill(row,-1);
        int res = strangePrinter(s,0,s.length()-1);
        return 1+res;
    }

    private int strangePrinter(String s, int l, int r) {


        if (dp[l][r]!=-1)
            return dp[l][r];

        int min = s.length();
        int j=-1;
        for (int i = l; i < r; i++) {
            if (s.charAt(i)!=s.charAt(r) && j==-1) {
                j=i;
            }
            if (j!=-1) {
                min = Math.min(min, 1 + strangePrinter(s,j,i) + strangePrinter(s,i+1,r));
            }

        }
        if (j==-1)
            min=0;

        dp[l][r]=min;
        return min;
    }
}
