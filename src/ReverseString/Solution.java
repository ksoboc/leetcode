package ReverseString;

import java.util.Stack;

public class Solution {
    public void reverseString1(char[] s) {
        Stack<Character> stack = new Stack<>();

        for (var i = 0; i < s.length; ++i)
            stack.push(s[i]);

        var i = 0;
        while (!stack.isEmpty()) {
            s[i++] = stack.pop();
        }

    }

    public void reverseString(char[] s) {
        var l = 0;
        var r = s.length - 1;

        while (l < r) {
            var tmp = s[r];
            s[r] = s[l];
            s[l] = tmp;
            --r;
            ++l;
        }

    }

}
