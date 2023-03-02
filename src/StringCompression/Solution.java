package StringCompression;

public class Solution {
    public int compress(char[] chars) {
        int res = 0;
        int i = 0;

        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i] == chars[i + groupLength])
                ++groupLength;

            chars[res++] = chars[i];
            if (groupLength > 1) {
                char[] numberOfChars = Integer.toString(groupLength).toCharArray();
                for (int j = 0; j < numberOfChars.length; j++) {
                    chars[res++] = numberOfChars[j];
                }
            }

            i += groupLength;
        }
        return res;
    }
}
