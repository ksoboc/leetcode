package ValidateStackSequences;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (var value : pushed) {
            stack.push(value);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                ++j;
                stack.pop();
            }
        }
        return j == popped.length;
    }
}
