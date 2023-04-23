package RestoreTheArray;

import java.util.Arrays;

public class SolutionDP {


    public int numberOfArrays(String s, int k) {
        int mod = 1_000_000_007;
        int m = s.length();
        int[] dp = new int[m + 1];
        dp[0] = 1;

        for (int start = 0; start < m; start++) {
            if (s.charAt(start) == '0')
                continue;
            for (int end = start; end < m; end++) {
                String sub = s.substring(start, end + 1);

                if (Long.parseLong(sub) > k)
                    break;
                dp[end + 1] += dp[start];
                dp[end + 1] %= mod;
            }

        }

        return dp[m];
    }


}
