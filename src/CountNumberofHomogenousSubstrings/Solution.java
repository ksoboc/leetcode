package CountNumberofHomogenousSubstrings;

public class Solution {
    public int countHomogenous(String s) {
        final int mod = 1_000_000_007;

        int l = 0, r = 0;
        long sum = 0;
        char[] chars = s.toCharArray();
        while (r < chars.length) {
            while (r < chars.length && chars[r] == chars[l])
                ++r;
            long n = r - l;
            sum += (n * (n + 1)) / 2;
            sum %= mod;
            l = r;
        }
        return (int) sum;
    }
}
