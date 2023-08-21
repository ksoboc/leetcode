package RepeatedSubstringPattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        final int n = s.length();
        for (int l = n/2; l > 0; --l) {
            if (n % l == 0 && s.equals(s.substring(0, l).repeat(n / l)))
                return true;
        }
        return false;
    }
}
