package StringCompressionII;

public class Solution {

    public int getLengthOfOptimalCompressionDP(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) for (int j = 0; j <= k; j++) dp[i][j] = 9999;
        // for (int[] i : dp) Arrays.fill(i, n); // this is a bit slower (100ms)
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                int cnt = 0, del = 0;
                for (int l = i; l >= 1; l--) { // keep s[i], concat the same, remove the different
                    if (s.charAt(l - 1) == s.charAt(i - 1)) cnt++;
                    else del++;
                    if (j - del >= 0)
                        dp[i][j] = Math.min(dp[i][j],
                                dp[l - 1][j - del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1 : 0));
                    else break;
                }
                if (j > 0) // delete s[i]
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
            }
        }
        return dp[n][k];
    }

    private Integer[][] memo;

    public int getLengthOfOptimalCompression(String s, int k) {
        memo = new Integer[s.length()][k+1];
        return getLengthOfOptimalCompression(s, 0, k);
    }

    private int getLengthOfOptimalCompression(String s, int i, int k) {
        if (i >= s.length())
            return 0;

        if (memo[i][k] != null)
            return memo[i][k];

        int minL = Integer.MAX_VALUE;
        int otherCharToDel = 0;
        int j = i + 1;
        while (true) {
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int l = j - i - otherCharToDel;
            int k1 = k - otherCharToDel;
            if (k1 >= 0) {
                int charToDel = 0;
                int k2 = k1;
                while (k2 >= charToDel) {
                    int curLen = lenToEncLen(l);
                    k2 -= charToDel;
                    minL = Math.min(minL, curLen + getLengthOfOptimalCompression(s, j, k2));
                    if (l == 0)
                        break;
                    int nl = smallerLenValue(l);
                    charToDel = l - nl;
                    l = nl;
                }

            } else break;

            if (j >= s.length())
                break;

            while (j < s.length() && s.charAt(j) != s.charAt(i)) {
                ++j;
                ++otherCharToDel;
            }
        }

        memo[i][k] = minL;
        return minL;
    }

    private int lenToEncLen(int l) {
        return l == 0 ? 0 :
                l == 1 ? 1 :
                        l < 10 ? 2 :
                                l < 100 ? 3 :
                                        l < 1000 ? 4 :
                                                5;
    }

    private int smallerLenValue(int l) {
        return l == 1 ? 0 :
                l < 10 ? 1 :
                        l < 100 ? 9 :
                                l < 1000 ? 99 :
                                        999;
    }
}
