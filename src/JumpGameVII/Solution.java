package JumpGameVII;

public class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        boolean[] dp = new boolean[s.length()];
        dp[0] = true;

        for (int i = minJump; i < s.length(); i++) {
            boolean val = false;
            if (s.charAt(i) == '0') {
                for (int j = Math.max(i - maxJump, 0); j <= Math.max(i - minJump, 0); j++) {

                    val |= dp[j];
                    if (val)
                        break;
                }
                dp[i] = val;
            }

        }
        return dp[s.length()-1];

    }
}
