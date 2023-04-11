package RemovingStarsFromaString;

import java.util.Stack;

public class SolutionTwoPointer {
    public String removeStars(String s) {
        int n = s.length();
        char[] chars = new char[n];
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            char ch = s.charAt(i++);
            if (ch != '*') {
                chars[j] = ch;
                ++j;
            } else {
                --j;
            }
        }
        StringBuilder sb = new StringBuilder();
        i = 0;
        while (i < j) {
            sb.append(chars[i]);
            ++i;
        }
        return sb.toString();
    }
}
