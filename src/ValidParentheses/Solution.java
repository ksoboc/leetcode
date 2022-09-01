package ValidParentheses;

import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = Map.of(')', '(', ']', '[', '}', '{');

        for (var i = 0; i < s.length(); ++i) {
            var ch = s.charAt(i);
            if (closeToOpen.containsKey(ch)) {
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != closeToOpen.get(ch))
                    return false;
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
