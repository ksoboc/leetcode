package CountandSay;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        int i = 0;
        char ch = s.charAt(i);
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {

            if (s.charAt(i) == ch) ++cnt;
            else {
                sb.append(cnt).append(ch);
                ch = s.charAt(i);
                cnt = 1;
            }
            ++i;
        }
        sb.append(cnt).append(ch);
        return sb.toString();
    }
}
