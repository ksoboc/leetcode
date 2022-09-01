package RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s) {
        if (s==null || s.isBlank())
            return s;
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            var ch = s.charAt(j);
            if (!stack.isEmpty() && stack.peek()==ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.reverse().toString();

    }
}
