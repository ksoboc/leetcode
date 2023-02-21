package FlipStringtoMonotoneIncreasing;

public class Solution {
    public int minFlipsMonoIncr(String s) {
        int ans = 0, num = 0;
        for (char ch:s.toCharArray()) {
            if (ch == '0') {
                ans = Math.min(num, ans + 1);
            } else {
                ++num;
            }
        }
        return ans;
    }
}
