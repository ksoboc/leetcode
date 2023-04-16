package NumberofWaystoFormaTargetStringGivenaDictionary;

import java.util.Arrays;

public class Solution {
    int wordLen;
    int[][] dp;

    public int numWays(String[] words, String target) {
        wordLen = words[0].length();
        int[][] freq = new int[wordLen][26];

        dp = new int[wordLen][target.length()];
        for (var t : dp) {
            Arrays.fill(t, -1);
        }

        for (int i = 0; i < wordLen; i++) {
            int[] freqAtI = new int[26];
            for (var word : words) {
                ++freqAtI[word.charAt(i) - 'a'];
            }
            freq[i] = freqAtI;
        }

        return numWays(freq, target, 0, 0);
    }

    private int numWays(int[][] freq, String target, int n, int k) {
        if (k == target.length())
            return 1;
        if (n >= wordLen)
            return 0;
        if (target.length() - k > wordLen - n)
            return 0;

        if (dp[n][k] != -1) {
            return dp[n][k];
        }

        long res = numWays(freq, target, n + 1, k);
        res += (long)freq[n][target.charAt(k) - 'a'] * numWays(freq, target, n + 1, k + 1);
        res %= 1_000_000_007L;
        dp[n][k] = (int)res;

        return dp[n][k];
    }
}
