package ValidParenthesisString;

public class Solution {
    public boolean checkValidString(String s) {
        var lmin = 0;
        var lmax = 0;

        for (var i = 0; i < s.length(); ++i) {
            var ch = s.charAt(i);
            switch (ch) {
                case '(':
                    lmin += 1;
                    lmax += 1;
                    break;
                case ')':
                    lmin -= 1;
                    lmax -= 1;
                    break;
                default:
                    lmin -= 1;
                    lmax += 1;
            }

            if (lmax < 0)
                return false;

            if (lmin < 0)
                lmin = 0;

        }

        return lmin == 0;

    }
}
