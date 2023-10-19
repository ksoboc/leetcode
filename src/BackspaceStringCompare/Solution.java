package BackspaceStringCompare;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = helper(s);
        String t1 = helper(t);

        return s1.equals(t1);
    }

    private String helper(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else if (count != 0) {
                count--;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
