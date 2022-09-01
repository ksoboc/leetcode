package DecodeWays;

public class Solution {
    public int numDecodings(String s) {
        int []dp = new int[s.length()+1];

        dp[s.length()]=1;

        for (var i=s.length()-1;i>=0;--i) {
            var ch = s.charAt(i);
            if (ch=='0') {
                dp[i] = 0;
                continue;
            }
            var res = dp[i+1];
            if ((i<s.length()-1) && (ch=='1' || ch=='2' && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '6') ){
                res += dp[i+2];
            }
            dp[i] = res;
        }
        return dp[0];
    }
}
