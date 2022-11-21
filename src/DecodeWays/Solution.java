package DecodeWays;

public class Solution {
    public int numDecodings(String s) {

        int dp1, dp2;

        dp1 = 1;
        dp2 = 0;
        for (var i = s.length() - 1; i >= 0; --i) {
            var ch = s.charAt(i);
            if (ch == '0') {
                dp2 = dp1;
                dp1 = 0;
                continue;
            }
            var res = dp1;
            if ((i < s.length() - 1) && (ch == '1' || ch == '2' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6')) {
                res += dp2;
            }
            dp2 = dp1;
            dp1 = res;
        }
        return dp1;
    }

    Integer[] memo;

    public int numDecodingsRec(String s) {
        memo = new Integer[s.length() + 1];
        return numDecodingsRec(s, 0);
    }

    private int numDecodingsRec(String s, int i) {
        if (i >= s.length())
            return 1;

        if (s.charAt(i) == '0')
            return 0;
        if (memo[i] != null)
            return memo[i];
        int res = 0;
        if (i < s.length() - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6'))
            res += numDecodingsRec(s, i + 2);
        res += numDecodingsRec(s, i + 1);
        memo[i] = res;
        return res;

    }

}
