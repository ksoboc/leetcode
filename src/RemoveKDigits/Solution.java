package RemoveKDigits;

import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (var i=0;i<num.length();++i) {
            char ch = num.charAt(i);

            while (k>0 && !stack.isEmpty() && stack.peek() > ch) {
                stack.pop();
                --k;
            }
            stack.push(ch);
        }

        String res = stack.stream().map(c->c.toString()).collect(Collectors.joining());

        if (k>0) {
            res = res.substring(0, res.length()-k);
        }

        var i = 0;
        while (i<res.length() && res.charAt(i) == '0') {
            ++i;
        }
        res = res.substring(i);

        if (res.isBlank())
            res = "0";

        return res;

    }
}
