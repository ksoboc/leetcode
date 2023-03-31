package FindtheIndexoftheFirstOccurrenceinaString;

import java.util.Arrays;

public class BoyerMoore {
    public static int findSubstring(String haystack, String needle) {
        int strLen = haystack.length();
        int substrLen = needle.length();

        if (substrLen == 0) {
            return 0;
        }

        int[] badMatchTable = new int[256];
        Arrays.fill(badMatchTable, substrLen);
        for (int i = 0; i < substrLen - 1; i++) {
            badMatchTable[needle.charAt(i)] = substrLen - i - 1;
        }

        int i = substrLen - 1;
        while (i < strLen) {
            int j = substrLen - 1;
            while (j >= 0 && haystack.charAt(i) == needle.charAt(j)) {
                i--;
                j--;
            }
            if (j < 0) {
                return i + 1;
            }
            i += Math.max(badMatchTable[haystack.charAt(i)], substrLen - j);
        }

        return -1;
    }
}
