package FindtheIndexoftheFirstOccurrenceinaString;

public class Solution {

    public static final long RADIX = 26;


    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        long hashNeedle = hashcode(needle, 0, m);
        long hashHaystack = 0;
        long maxFactor = 1;
        for (int i = 1; i < m; i++) {
            maxFactor = maxFactor * RADIX;
        }
        for (int i = 0; i <= n - m; i++) {
            if (i == 0) {
                hashHaystack = hashcode(haystack, i, m);
            } else {
                hashHaystack = (hashHaystack  - charToLong(haystack.charAt(i - 1)) * maxFactor) * RADIX
                        + charToLong(haystack.charAt(i + m - 1));
//                hashHaystack = (hashHaystack - charToInt(haystack.charAt(i - 1)) * maxFactor%MOD) * RADIX % MOD + charToInt(haystack.charAt(i + m - 1));
//                hashHaystack = (hashHaystack+MOD)%MOD;
            }
            if (hashHaystack == hashNeedle) {
                int j = 0;
                while (j < m) {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                    ++j;
                }
                if (j == m)
                    return i;
            }
        }
        return -1;
    }

    private long hashcode(String str, int pos, int length) {
        long factor = 1;
        long code = 0;
        for (int i = length - 1; i >= 0; --i) {
            code += charToLong(str.charAt(i)) * factor;
            factor = factor * RADIX;
        }
        return code;
    }

    private long charToLong(char ch) {
        return (long)ch - 'a';
    }
}
