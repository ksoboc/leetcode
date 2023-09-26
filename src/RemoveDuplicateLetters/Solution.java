package RemoveDuplicateLetters;

import java.util.Stack;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        for (var ch : s.toCharArray()) {
            ++count[ch - 'a'];
        }
        boolean[] onstack = new boolean[26];

        for (var ch : s.toCharArray()) {
            if (!onstack[ch - 'a']) {
                while (!stack.isEmpty() && ch < stack.peek() && count[stack.peek() - 'a'] > 0) {
                    var ch1 = stack.pop();
                    onstack[ch1 - 'a'] = false;
                }

                stack.push(ch);
                onstack[ch - 'a'] = true;
            }
            --count[ch - 'a'];
        }
        char[] arr = new char[stack.size()];
        for (int i = arr.length - 1; i >= 0; --i) {
            arr[i] = stack.pop();
        }
        return new String(arr);
    }
}
