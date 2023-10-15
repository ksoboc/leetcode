package NumberofWaystoStayintheSamePlaceAfterSomeSteps;

import java.util.Arrays;

public class Solution {
    private long[][] dp;
    final private int mod = 1_000_000_007;

    public int numWays(int steps, int arrLen) {
        dp=new long[steps+1][Math.min(arrLen,steps)];
        for (var r:dp)
            Arrays.fill(r,-1);
        return numWays(steps,arrLen,0);
    }

    private int numWays(int stepsLeft, int arrLen, int pos) {
        if (pos>stepsLeft)
            return 0;
        if (stepsLeft==0)
            return pos==0?1:0;

        if (dp[stepsLeft][pos]!=-1)
            return (int)dp[stepsLeft][pos];
        long res=0;
        if (pos>0) {
            res+=numWays(stepsLeft-1,arrLen,pos-1);

        }
        if (pos<arrLen-1) {
            res+=numWays(stepsLeft-1,arrLen,pos+1);
        }
        res+=numWays(stepsLeft-1,arrLen,pos);
        res%=mod;
        dp[stepsLeft][pos]=res;
        return (int)res;
    }
}
