package IsSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int ps = 0, pt = 0;

        char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        while (ps < as.length && pt < at.length) {
            if (as[ps] == at[pt]) {
                ++ps;
            }
            ++pt;
        }
        return ps == s.length();
    }
}
